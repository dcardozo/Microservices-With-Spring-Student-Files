package demo.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.domain.Word;

/**
 * Created by david on 1/12/16.
 */
@FeignClient("verb")
public interface VerbClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public Word getWord();
}
