package com.rishi.airline.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// This controller handles redirection from the root URL ("/") to the Swagger UI page.
// The @ApiIgnore annotation ensures this endpoint is excluded from Swagger documentation.
@RestController
public class SwaggerController {

    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.sendRedirect("/swagger-ui.html");
    }
}
