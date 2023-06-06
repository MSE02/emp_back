package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.UniteAdministrative;
import ma.sir.rh.bean.history.UniteAdministrativeHistory;
import ma.sir.rh.dao.criteria.core.UniteAdministrativeCriteria;
import ma.sir.rh.dao.criteria.history.UniteAdministrativeHistoryCriteria;
import ma.sir.rh.service.facade.admin.UniteAdministrativeAdminService;
import ma.sir.rh.ws.converter.UniteAdministrativeConverter;
import ma.sir.rh.ws.dto.UniteAdministrativeDto;
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

@Api("Manages uniteAdministrative services")
@RestController
@RequestMapping("/api/admin/uniteAdministrative/")
public class UniteAdministrativeRestAdmin  extends AbstractController<UniteAdministrative, UniteAdministrativeDto, UniteAdministrativeHistory, UniteAdministrativeCriteria, UniteAdministrativeHistoryCriteria, UniteAdministrativeAdminService, UniteAdministrativeConverter> {


    @ApiOperation("upload one uniteAdministrative")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple uniteAdministratives")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all uniteAdministratives")
    @GetMapping("")
    public ResponseEntity<List<UniteAdministrativeDto>> findAll()  {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all uniteAdministratives")
    @GetMapping("optimized")
    public ResponseEntity<List<UniteAdministrativeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a uniteAdministrative by id")
    @GetMapping("id/{id}")
    public ResponseEntity<UniteAdministrativeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  uniteAdministrative")
    @PostMapping("")
    public ResponseEntity<UniteAdministrativeDto> save(@RequestBody UniteAdministrativeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  uniteAdministrative")
    @PutMapping("")
    public ResponseEntity<UniteAdministrativeDto> update(@RequestBody UniteAdministrativeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of uniteAdministrative")
    @PostMapping("multiple")
    public ResponseEntity<List<UniteAdministrativeDto>> delete(@RequestBody List<UniteAdministrativeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified uniteAdministrative")
    @DeleteMapping("")
    public ResponseEntity<UniteAdministrativeDto> delete(@RequestBody UniteAdministrativeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified uniteAdministrative")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple uniteAdministratives by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds uniteAdministratives by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<UniteAdministrativeDto>> findByCriteria(@RequestBody UniteAdministrativeCriteria criteria)  {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated uniteAdministratives by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody UniteAdministrativeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports uniteAdministratives by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody UniteAdministrativeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets uniteAdministrative data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody UniteAdministrativeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets uniteAdministrative history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets uniteAdministrative paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody UniteAdministrativeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports uniteAdministrative history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody UniteAdministrativeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets uniteAdministrative history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody UniteAdministrativeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public UniteAdministrativeRestAdmin (UniteAdministrativeAdminService service, UniteAdministrativeConverter converter) {
        super(service, converter);
    }

}