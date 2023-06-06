package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.Absence;
import ma.sir.rh.bean.history.AbsenceHistory;
import ma.sir.rh.dao.criteria.core.AbsenceCriteria;
import ma.sir.rh.dao.criteria.history.AbsenceHistoryCriteria;
import ma.sir.rh.service.facade.admin.AbsenceAdminService;
import ma.sir.rh.ws.converter.AbsenceConverter;
import ma.sir.rh.ws.dto.AbsenceDto;
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

@Api("Manages absence services")
@RestController
@RequestMapping("/api/admin/absence/")
public class AbsenceRestAdmin  extends AbstractController<Absence, AbsenceDto, AbsenceHistory, AbsenceCriteria, AbsenceHistoryCriteria, AbsenceAdminService, AbsenceConverter> {


    @ApiOperation("upload one absence")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple absences")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all absences")
    @GetMapping("")
    public ResponseEntity<List<AbsenceDto>> findAll() {
        return super.findAll();
    }


    @ApiOperation("Finds a absence by id")
    @GetMapping("id/{id}")
    public ResponseEntity<AbsenceDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  absence")
    @PostMapping("")
    public ResponseEntity<AbsenceDto> save(@RequestBody AbsenceDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  absence")
    @PutMapping("")
    public ResponseEntity<AbsenceDto> update(@RequestBody AbsenceDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of absence")
    @PostMapping("multiple")
    public ResponseEntity<List<AbsenceDto>> delete(@RequestBody List<AbsenceDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified absence")
    @DeleteMapping("")
    public ResponseEntity<AbsenceDto> delete(@RequestBody AbsenceDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified absence")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple absences by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by typeAbsence id")
    @GetMapping("typeAbsence/id/{id}")
    public List<Absence> findByTypeAbsenceId(@PathVariable Long id){
        return service.findByTypeAbsenceId(id);
    }
    @ApiOperation("delete by typeAbsence id")
    @DeleteMapping("typeAbsence/id/{id}")
    public int deleteByTypeAbsenceId(@PathVariable Long id){
        return service.deleteByTypeAbsenceId(id);
    }
    @ApiOperation("find by employee id")
    @GetMapping("employee/id/{id}")
    public List<Absence> findByEmployeeId(@PathVariable Long id){
        return service.findByEmployeeId(id);
    }
    @ApiOperation("delete by employee id")
    @DeleteMapping("employee/id/{id}")
    public int deleteByEmployeeId(@PathVariable Long id){
        return service.deleteByEmployeeId(id);
    }
    @ApiOperation("Finds absences by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<AbsenceDto>> findByCriteria(@RequestBody AbsenceCriteria criteria)  {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated absences by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody AbsenceCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports absences by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody AbsenceCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets absence data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody AbsenceCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets absence history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets absence paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody AbsenceHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports absence history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody AbsenceHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets absence history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody AbsenceHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public AbsenceRestAdmin (AbsenceAdminService service, AbsenceConverter converter) {
        super(service, converter);
    }


}