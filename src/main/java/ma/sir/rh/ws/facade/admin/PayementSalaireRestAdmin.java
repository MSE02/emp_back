package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.PayementSalaire;
import ma.sir.rh.bean.history.PayementSalaireHistory;
import ma.sir.rh.dao.criteria.core.PayementSalaireCriteria;
import ma.sir.rh.dao.criteria.history.PayementSalaireHistoryCriteria;
import ma.sir.rh.service.facade.admin.PayementSalaireAdminService;
import ma.sir.rh.ws.converter.PayementSalaireConverter;
import ma.sir.rh.ws.dto.PayementSalaireDto;
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

@Api("Manages payementSalaire services")
@RestController
@RequestMapping("/api/admin/payementSalaire/")
public class PayementSalaireRestAdmin  extends AbstractController<PayementSalaire, PayementSalaireDto, PayementSalaireHistory, PayementSalaireCriteria, PayementSalaireHistoryCriteria, PayementSalaireAdminService, PayementSalaireConverter> {


    @ApiOperation("upload one payementSalaire")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple payementSalaires")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all payementSalaires")
    @GetMapping("")
    public ResponseEntity<List<PayementSalaireDto>> findAll()  {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all payementSalaires")
    @GetMapping("optimized")
    public ResponseEntity<List<PayementSalaireDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a payementSalaire by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PayementSalaireDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  payementSalaire")
    @PostMapping("")
    public ResponseEntity<PayementSalaireDto> save(@RequestBody PayementSalaireDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  payementSalaire")
    @PutMapping("")
    public ResponseEntity<PayementSalaireDto> update(@RequestBody PayementSalaireDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of payementSalaire")
    @PostMapping("multiple")
    public ResponseEntity<List<PayementSalaireDto>> delete(@RequestBody List<PayementSalaireDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified payementSalaire")
    @DeleteMapping("")
    public ResponseEntity<PayementSalaireDto> delete(@RequestBody PayementSalaireDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified payementSalaire")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple payementSalaires by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by employee id")
    @GetMapping("employee/id/{id}")
    public List<PayementSalaire> findByEmployeeId(@PathVariable Long id){
        return service.findByEmployeeId(id);
    }
    @ApiOperation("delete by employee id")
    @DeleteMapping("employee/id/{id}")
    public int deleteByEmployeeId(@PathVariable Long id){
        return service.deleteByEmployeeId(id);
    }
    @ApiOperation("Finds payementSalaires by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PayementSalaireDto>> findByCriteria(@RequestBody PayementSalaireCriteria criteria)  {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated payementSalaires by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PayementSalaireCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports payementSalaires by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PayementSalaireCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets payementSalaire data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PayementSalaireCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets payementSalaire history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets payementSalaire paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PayementSalaireHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports payementSalaire history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PayementSalaireHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets payementSalaire history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PayementSalaireHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PayementSalaireRestAdmin (PayementSalaireAdminService service, PayementSalaireConverter converter) {
        super(service, converter);
    }


}