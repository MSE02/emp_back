package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.TypeAbsence;
import ma.sir.rh.bean.history.TypeAbsenceHistory;
import ma.sir.rh.dao.criteria.core.TypeAbsenceCriteria;
import ma.sir.rh.dao.criteria.history.TypeAbsenceHistoryCriteria;
import ma.sir.rh.service.facade.admin.TypeAbsenceAdminService;
import ma.sir.rh.ws.converter.TypeAbsenceConverter;
import ma.sir.rh.ws.dto.TypeAbsenceDto;
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

@Api("Manages typeAbsence services")
@RestController
@RequestMapping("/api/admin/typeAbsence/")
public class TypeAbsenceRestAdmin  extends AbstractController<TypeAbsence, TypeAbsenceDto, TypeAbsenceHistory, TypeAbsenceCriteria, TypeAbsenceHistoryCriteria, TypeAbsenceAdminService, TypeAbsenceConverter> {


    @ApiOperation("upload one typeAbsence")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple typeAbsences")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all typeAbsences")
    @GetMapping("")
    public ResponseEntity<List<TypeAbsenceDto>> findAll() {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all typeAbsences")
    @GetMapping("optimized")
    public ResponseEntity<List<TypeAbsenceDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a typeAbsence by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TypeAbsenceDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeAbsence")
    @PostMapping("")
    public ResponseEntity<TypeAbsenceDto> save(@RequestBody TypeAbsenceDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  typeAbsence")
    @PutMapping("")
    public ResponseEntity<TypeAbsenceDto> update(@RequestBody TypeAbsenceDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of typeAbsence")
    @PostMapping("multiple")
    public ResponseEntity<List<TypeAbsenceDto>> delete(@RequestBody List<TypeAbsenceDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeAbsence")
    @DeleteMapping("")
    public ResponseEntity<TypeAbsenceDto> delete(@RequestBody TypeAbsenceDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified typeAbsence")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple typeAbsences by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds typeAbsences by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TypeAbsenceDto>> findByCriteria(@RequestBody TypeAbsenceCriteria criteria)  {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeAbsences by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeAbsenceCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeAbsences by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeAbsenceCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeAbsence data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeAbsenceCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeAbsence history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeAbsence paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeAbsenceHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeAbsence history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeAbsenceHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeAbsence history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeAbsenceHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TypeAbsenceRestAdmin (TypeAbsenceAdminService service, TypeAbsenceConverter converter) {
        super(service, converter);
    }


}