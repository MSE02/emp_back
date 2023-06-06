package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.Employee;
import ma.sir.rh.bean.history.EmployeeHistory;
import ma.sir.rh.dao.criteria.core.EmployeeCriteria;
import ma.sir.rh.dao.criteria.history.EmployeeHistoryCriteria;
import ma.sir.rh.service.facade.admin.EmployeeAdminService;
import ma.sir.rh.ws.converter.EmployeeConverter;
import ma.sir.rh.ws.dto.EmployeeDto;
import ma.sir.rh.zynerator.controller.AbstractController;
import ma.sir.rh.zynerator.dto.AuditEntityDto;
import ma.sir.rh.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.multipart.MultipartFile;
import ma.sir.rh.zynerator.dto.FileTempDto;

@Api("Manages employee services")
@RestController
@RequestMapping("/api/admin/employee/")
public class EmployeeRestAdmin  extends AbstractController<Employee, EmployeeDto, EmployeeHistory, EmployeeCriteria, EmployeeHistoryCriteria, EmployeeAdminService, EmployeeConverter> {

    private final EmployeeAdminService employeeAdminService;

    @ApiOperation("upload one employee")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple employees")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all employees")
    @GetMapping("")
    public ResponseEntity<List<EmployeeDto>> findAll() {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all employees")
    @GetMapping("optimized")
    public ResponseEntity<List<EmployeeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a employee by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EmployeeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  employee")
    @PostMapping("")
    public ResponseEntity<EmployeeDto> save(@RequestBody EmployeeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Sends an email notification for the specified employee's absences")
    @PostMapping("sendEmail/{id}")
    public ResponseEntity<String> sendEmailAbsence(@PathVariable("id") Long id) {
        Employee employee = employeeAdminService.findById(id);
        employeeAdminService.sendEmailAbsence(employee);
        return ResponseEntity.ok("Email sent successfully.");
    }



    @ApiOperation("Updates the specified  employee")
    @PutMapping("")
    public ResponseEntity<EmployeeDto> update(@RequestBody EmployeeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of employee")
    @PostMapping("multiple")
    public ResponseEntity<List<EmployeeDto>> delete(@RequestBody List<EmployeeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified employee")
    @DeleteMapping("")
    public ResponseEntity<EmployeeDto> delete(@RequestBody EmployeeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified employee")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple employees by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by contrat id")
    @GetMapping("contrat/id/{id}")
    public List<Employee> findByContratId(@PathVariable Long id){
        return service.findByContratId(id);
    }
    @ApiOperation("delete by contrat id")
    @DeleteMapping("contrat/id/{id}")
    public int deleteByContratId(@PathVariable Long id){
        return service.deleteByContratId(id);
    }
    @ApiOperation("find by uniteAdministrative id")
    @GetMapping("uniteAdministrative/id/{id}")
    public List<Employee> findByUniteAdministrativeId(@PathVariable Long id){
        return service.findByUniteAdministrativeId(id);
    }
    @ApiOperation("delete by uniteAdministrative id")
    @DeleteMapping("uniteAdministrative/id/{id}")
    public int deleteByUniteAdministrativeId(@PathVariable Long id){
        return service.deleteByUniteAdministrativeId(id);
    }
    @ApiOperation("find by categorieEmployee id")
    @GetMapping("categorieEmployee/id/{id}")
    public List<Employee> findByCategorieEmployeeId(@PathVariable Long id){
        return service.findByCategorieEmployeeId(id);
    }
    @ApiOperation("delete by categorieEmployee id")
    @DeleteMapping("categorieEmployee/id/{id}")
    public int deleteByCategorieEmployeeId(@PathVariable Long id){
        return service.deleteByCategorieEmployeeId(id);
    }
    @ApiOperation("Finds a employee and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<EmployeeDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds employees by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EmployeeDto>> findByCriteria(@RequestBody EmployeeCriteria criteria)  {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated employees by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EmployeeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports employees by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EmployeeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets employee data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EmployeeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets employee history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets employee paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EmployeeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports employee history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EmployeeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets employee history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EmployeeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EmployeeRestAdmin (EmployeeAdminService service, EmployeeConverter converter, EmployeeAdminService employeeAdminService) {
        super(service, converter);
        this.employeeAdminService = employeeAdminService;
    }


}