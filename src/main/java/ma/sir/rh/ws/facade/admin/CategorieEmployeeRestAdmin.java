package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.CategorieEmployee;
import ma.sir.rh.bean.history.CategorieEmployeeHistory;
import ma.sir.rh.dao.criteria.core.CategorieEmployeeCriteria;
import ma.sir.rh.dao.criteria.history.CategorieEmployeeHistoryCriteria;
import ma.sir.rh.service.facade.admin.CategorieEmployeeAdminService;
import ma.sir.rh.ws.converter.CategorieEmployeeConverter;
import ma.sir.rh.ws.dto.CategorieEmployeeDto;
import ma.sir.rh.zynerator.controller.AbstractController;
import ma.sir.rh.zynerator.dto.AuditEntityDto;
import ma.sir.rh.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.rh.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.sir.rh.zynerator.dto.FileTempDto;

@Api("Manages categorieEmployee services")
@RestController
@RequestMapping("/api/admin/categorieEmployee/")
public class CategorieEmployeeRestAdmin  extends AbstractController<CategorieEmployee, CategorieEmployeeDto, CategorieEmployeeHistory, CategorieEmployeeCriteria, CategorieEmployeeHistoryCriteria, CategorieEmployeeAdminService, CategorieEmployeeConverter> {


    @ApiOperation("upload one categorieEmployee")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple categorieEmployees")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all categorieEmployees")
    @GetMapping("")
    public ResponseEntity<List<CategorieEmployeeDto>> findAll()  {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all categorieEmployees")
    @GetMapping("optimized")
    public ResponseEntity<List<CategorieEmployeeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a categorieEmployee by id")
    @GetMapping("id/{id}")
    public ResponseEntity<CategorieEmployeeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  categorieEmployee")
    @PostMapping("")
    public ResponseEntity<CategorieEmployeeDto> save(@RequestBody CategorieEmployeeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  categorieEmployee")
    @PutMapping("")
    public ResponseEntity<CategorieEmployeeDto> update(@RequestBody CategorieEmployeeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of categorieEmployee")
    @PostMapping("multiple")
    public ResponseEntity<List<CategorieEmployeeDto>> delete(@RequestBody List<CategorieEmployeeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified categorieEmployee")
    @DeleteMapping("")
    public ResponseEntity<CategorieEmployeeDto> delete(@RequestBody CategorieEmployeeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified categorieEmployee")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple categorieEmployees by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds categorieEmployees by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<CategorieEmployeeDto>> findByCriteria(@RequestBody CategorieEmployeeCriteria criteria){
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated categorieEmployees by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CategorieEmployeeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports categorieEmployees by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody CategorieEmployeeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets categorieEmployee data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody CategorieEmployeeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets categorieEmployee history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets categorieEmployee paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CategorieEmployeeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports categorieEmployee history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CategorieEmployeeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets categorieEmployee history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CategorieEmployeeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public CategorieEmployeeRestAdmin (CategorieEmployeeAdminService service, CategorieEmployeeConverter converter) {
        super(service, converter);
    }


}