package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.TypeContrat;
import ma.sir.rh.bean.history.TypeContratHistory;
import ma.sir.rh.dao.criteria.core.TypeContratCriteria;
import ma.sir.rh.dao.criteria.history.TypeContratHistoryCriteria;
import ma.sir.rh.service.facade.admin.TypeContratAdminService;
import ma.sir.rh.ws.converter.TypeContratConverter;
import ma.sir.rh.ws.dto.TypeContratDto;
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

@Api("Manages typeContrat services")
@RestController
@RequestMapping("/api/admin/typeContrat/")
public class TypeContratRestAdmin  extends AbstractController<TypeContrat, TypeContratDto, TypeContratHistory, TypeContratCriteria, TypeContratHistoryCriteria, TypeContratAdminService, TypeContratConverter> {


    @ApiOperation("upload one typeContrat")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple typeContrats")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all typeContrats")
    @GetMapping("")
    public ResponseEntity<List<TypeContratDto>> findAll() {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all typeContrats")
    @GetMapping("optimized")
    public ResponseEntity<List<TypeContratDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a typeContrat by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TypeContratDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeContrat")
    @PostMapping("")
    public ResponseEntity<TypeContratDto> save(@RequestBody TypeContratDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  typeContrat")
    @PutMapping("")
    public ResponseEntity<TypeContratDto> update(@RequestBody TypeContratDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of typeContrat")
    @PostMapping("multiple")
    public ResponseEntity<List<TypeContratDto>> delete(@RequestBody List<TypeContratDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeContrat")
    @DeleteMapping("")
    public ResponseEntity<TypeContratDto> delete(@RequestBody TypeContratDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified typeContrat")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple typeContrats by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds typeContrats by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TypeContratDto>> findByCriteria(@RequestBody TypeContratCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeContrats by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeContratCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeContrats by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeContratCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeContrat data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeContratCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeContrat history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeContrat paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeContratHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeContrat history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeContratHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeContrat history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeContratHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TypeContratRestAdmin (TypeContratAdminService service, TypeContratConverter converter) {
        super(service, converter);
    }


}