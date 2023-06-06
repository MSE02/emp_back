package ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.Employee;
import ma.sir.rh.bean.core.Pointage;
import ma.sir.rh.bean.history.PointageHistory;
import ma.sir.rh.dao.criteria.core.PointageCriteria;
import ma.sir.rh.dao.criteria.history.PointageHistoryCriteria;
import ma.sir.rh.service.facade.admin.PointageAdminService;
import ma.sir.rh.ws.converter.PointageConverter;
import ma.sir.rh.ws.dto.PointageDto;
import ma.sir.rh.zynerator.controller.AbstractController;
import ma.sir.rh.zynerator.dto.AuditEntityDto;
import ma.sir.rh.zynerator.dto.FileTempDto;
import ma.sir.rh.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages pointage services")
@RestController
@RequestMapping("/api/admin/pointage/")
public class PointageRestAdmin extends AbstractController<Pointage, PointageDto, PointageHistory, PointageCriteria, PointageHistoryCriteria, PointageAdminService, PointageConverter> {

    public PointageRestAdmin(PointageAdminService service, PointageConverter converter) {
        super(service, converter);
    }

    @ApiOperation("Finds a list of all employees without pointage")
    @GetMapping("/without-pointage")
    public ResponseEntity<List<Employee>> getEmployeesWithoutPointage() {
        List<Employee> employeesWithNoPointage = service.getEmployeesWithNoPointage();
        return ResponseEntity.ok(employeesWithNoPointage);
    }

    @ApiOperation("upload one pointage")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @ApiOperation("upload multiple pointages")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all pointages")
    @GetMapping("")
    public ResponseEntity<List<PointageDto>> findAll() {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all pointages")
    @GetMapping("optimized")
    public ResponseEntity<List<PointageDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a pointage by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PointageDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

    @ApiOperation("Saves the specified  pointage")
    @PostMapping("")
    public ResponseEntity<PointageDto> save(@RequestBody PointageDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  pointage")
    @PutMapping("")
    public ResponseEntity<PointageDto> update(@RequestBody PointageDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of pointage")
    @PostMapping("multiple")
    public ResponseEntity<List<PointageDto>> delete(@RequestBody List<PointageDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }

    @ApiOperation("Delete the specified pointage")
    @DeleteMapping("")
    public ResponseEntity<PointageDto> delete(@RequestBody PointageDto dto) throws Exception {
        return super.delete(dto);
    }

    @ApiOperation("Delete the specified pointage")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }

    @ApiOperation("Delete multiple pointages by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
        return super.deleteByIdIn(ids);
    }

    @ApiOperation("find by employee id")
    @GetMapping("employee/id/{id}")
    public List<Pointage> findByEmployeeId(@PathVariable Long id) {
        return service.findByEmployeeId(id);
    }

    @ApiOperation("delete by employee id")
    @DeleteMapping("employee/id/{id}")
    public int deleteByEmployeeId(@PathVariable Long id) {
        return service.deleteByEmployeeId(id);
    }

    @ApiOperation("Finds pointages by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PointageDto>> findByCriteria(@RequestBody PointageCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated pointages by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PointageCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports pointages by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PointageCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets pointage data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PointageCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets pointage history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets pointage paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PointageHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports pointage history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PointageHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets pointage history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PointageHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }


}