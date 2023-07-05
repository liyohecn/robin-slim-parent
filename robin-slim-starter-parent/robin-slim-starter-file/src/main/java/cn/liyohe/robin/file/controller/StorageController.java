package cn.liyohe.robin.file.controller;

import cn.liyohe.robin.file.service.StorageService;
import cn.liyohe.robin.slim.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 存储控制器
 *
 * @author liyohe
 * @date 2023-07-05
 */

@RestController
@RequestMapping("/storage")
public class StorageController {

    private final StorageService storageService;

    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping("/download/{key}")
    public Result<String> download(@PathVariable("key") String key) {
        storageService.getFile(key);
        return new Result<String>().ok("success");
    }
}
