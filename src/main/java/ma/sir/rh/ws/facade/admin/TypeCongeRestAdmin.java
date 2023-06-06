package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.TypeConge;
import ma.sir.rh.bean.history.TypeCongeHistory;
import ma.sir.rh.dao.criteria.core.TypeCongeCriteria;
import ma.sir.rh.dao.criteria.history.TypeCongeHistoryCriteria;
import ma.sir.rh.service.facade.admin.TypeCongeAdminService;
import ma.sir.rh.ws.converter.TypeCongeConverter;
import ma.sir.rh.ws.dto.TypeCongeDto;
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

@Api("Manages typeConge services")
@RestController
@RequestMapping("/api/admin/typeConge/")
public class TypeCongeRestAdmin  extends AbstractController<TypeConge, TypeCongeDto, TypeCongeHistory, TypeCongeCriteria, TypeCongeHistoryCriteria, TypeCongeAdminService, TypeCongeConverter> {


    @ApiOperation("upload one typeConge")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple typeConges")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all typeConges")
    @GetMapping("")
    public ResponseEntity<List<TypeCongeDto>> findAll()  {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all typeConges")
    @GetMapping("optimized")
    public ResponseEntity<List<TypeCongeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a typeConge by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TypeCongeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeConge")
    @PostMapping("")
    public ResponseEntity<TypeCongeDto> save(@RequestBody TypeCongeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  typeConge")
    @PutMapping("")
    public ResponseEntity<TypeCongeDto> update(@RequestBody TypeCongeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of typeConge")
    @PostMapping("multiple")
    public ResponseEntity<List<TypeCongeDto>> delete(@RequestBody List<TypeCongeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeConge")
    @DeleteMapping("")
    public ResponseEntity<TypeCongeDto> delete(@RequestBody TypeCongeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified typeConge")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple typeConges by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds typeConges by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TypeCongeDto>> findByCriteria(@RequestBody TypeCongeCriteria criteria)  {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeConges by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeCongeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeConges by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeCongeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeConge data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeCongeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeConge history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeConge paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeCongeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeConge history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeCongeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeConge history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeCongeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TypeCongeRestAdmin (TypeCongeAdminService service, TypeCongeConverter converter) {
        super(service, converter);
    }


}