package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.Contrat;
import ma.sir.rh.bean.history.ContratHistory;
import ma.sir.rh.dao.criteria.core.ContratCriteria;
import ma.sir.rh.dao.criteria.history.ContratHistoryCriteria;
import ma.sir.rh.service.facade.admin.ContratAdminService;
import ma.sir.rh.ws.converter.ContratConverter;
import ma.sir.rh.ws.dto.ContratDto;
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

@Api("Manages contrat services")
@RestController
@RequestMapping("/api/admin/contrat/")
public class ContratRestAdmin  extends AbstractController<Contrat, ContratDto, ContratHistory, ContratCriteria, ContratHistoryCriteria, ContratAdminService, ContratConverter> {


    @ApiOperation("upload one contrat")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple contrats")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all contrats")
    @GetMapping("")
    public ResponseEntity<List<ContratDto>> findAll() {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all contrats")
    @GetMapping("optimized")
    public ResponseEntity<List<ContratDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a contrat by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ContratDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  contrat")
    @PostMapping("")
    public ResponseEntity<ContratDto> save(@RequestBody ContratDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  contrat")
    @PutMapping("")
    public ResponseEntity<ContratDto> update(@RequestBody ContratDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of contrat")
    @PostMapping("multiple")
    public ResponseEntity<List<ContratDto>> delete(@RequestBody List<ContratDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified contrat")
    @DeleteMapping("")
    public ResponseEntity<ContratDto> delete(@RequestBody ContratDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified contrat")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple contrats by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by employee id")
    @GetMapping("employee/id/{id}")
    public List<Contrat> findByEmployeeId(@PathVariable Long id){
        return service.findByEmployeeId(id);
    }
    @ApiOperation("delete by employee id")
    @DeleteMapping("employee/id/{id}")
    public int deleteByEmployeeId(@PathVariable Long id){
        return service.deleteByEmployeeId(id);
    }
    @ApiOperation("find by typeContrat id")
    @GetMapping("typeContrat/id/{id}")
    public List<Contrat> findByTypeContratId(@PathVariable Long id){
        return service.findByTypeContratId(id);
    }
    @ApiOperation("delete by typeContrat id")
    @DeleteMapping("typeContrat/id/{id}")
    public int deleteByTypeContratId(@PathVariable Long id){
        return service.deleteByTypeContratId(id);
    }
    @ApiOperation("Finds contrats by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ContratDto>> findByCriteria(@RequestBody ContratCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated contrats by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ContratCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports contrats by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ContratCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets contrat data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ContratCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets contrat history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets contrat paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ContratHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports contrat history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ContratHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets contrat history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ContratHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ContratRestAdmin (ContratAdminService service, ContratConverter converter) {
        super(service, converter);
    }


}