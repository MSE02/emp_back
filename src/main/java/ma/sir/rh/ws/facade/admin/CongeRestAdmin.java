package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.Conge;
import ma.sir.rh.bean.history.CongeHistory;
import ma.sir.rh.dao.criteria.core.CongeCriteria;
import ma.sir.rh.dao.criteria.history.CongeHistoryCriteria;
import ma.sir.rh.service.facade.admin.CongeAdminService;
import ma.sir.rh.ws.converter.CongeConverter;
import ma.sir.rh.ws.dto.CongeDto;
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

@Api("Manages conge services")
@RestController
@RequestMapping("/api/admin/conge/")
public class CongeRestAdmin  extends AbstractController<Conge, CongeDto, CongeHistory, CongeCriteria, CongeHistoryCriteria, CongeAdminService, CongeConverter> {


    @ApiOperation("upload one conge")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple conges")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all conges")
    @GetMapping("")
    public ResponseEntity<List<CongeDto>> findAll(){
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all conges")
    @GetMapping("optimized")
    public ResponseEntity<List<CongeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a conge by id")
    @GetMapping("id/{id}")
    public ResponseEntity<CongeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  conge")
    @PostMapping("")
    public ResponseEntity<CongeDto> save(@RequestBody CongeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  conge")
    @PutMapping("")
    public ResponseEntity<CongeDto> update(@RequestBody CongeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of conge")
    @PostMapping("multiple")
    public ResponseEntity<List<CongeDto>> delete(@RequestBody List<CongeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified conge")
    @DeleteMapping("")
    public ResponseEntity<CongeDto> delete(@RequestBody CongeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified conge")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple conges by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by typeConge id")
    @GetMapping("typeConge/id/{id}")
    public List<Conge> findByTypeCongeId(@PathVariable Long id){
        return service.findByTypeCongeId(id);
    }
    @ApiOperation("delete by typeConge id")
    @DeleteMapping("typeConge/id/{id}")
    public int deleteByTypeCongeId(@PathVariable Long id){
        return service.deleteByTypeCongeId(id);
    }
    @ApiOperation("find by employee id")
    @GetMapping("employee/id/{id}")
    public List<Conge> findByEmployeeId(@PathVariable Long id){
        return service.findByEmployeeId(id);
    }
    @ApiOperation("delete by employee id")
    @DeleteMapping("employee/id/{id}")
    public int deleteByEmployeeId(@PathVariable Long id){
        return service.deleteByEmployeeId(id);
    }
    @ApiOperation("Finds conges by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<CongeDto>> findByCriteria(@RequestBody CongeCriteria criteria){
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated conges by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CongeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports conges by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody CongeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets conge data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody CongeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets conge history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets conge paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CongeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports conge history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CongeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets conge history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CongeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public CongeRestAdmin (CongeAdminService service, CongeConverter converter) {
        super(service, converter);
    }


}