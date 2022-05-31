package com.bluesoft.api.rest.Bluesoft.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bluesoft.api.rest.Bluesoft.model.Cuenta;
import com.bluesoft.api.rest.Bluesoft.service.CuentaServicio;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import io.sentry.Sentry;

@RestController
@RequestMapping("/cuenta")
public class CuentaRest {
	@Autowired
	private CuentaServicio cuentaservicio; 
    @GetMapping
	private ResponseEntity<List<Cuenta>> getAllCuentas() {
        return ResponseEntity.ok(cuentaservicio.findAll());
    }
    @RequestMapping("/getOne")
    @ResponseBody
	 private Optional<Cuenta> getOne(long id) {
	        return cuentaservicio.getOne(id);
	    }
    @GetMapping("/count")
    private ResponseEntity<Long> count() {
        return ResponseEntity.ok(cuentaservicio.count());
    }
    @PostMapping
    private ResponseEntity<Cuenta> saveCuenta(@RequestBody Cuenta cuenta) {
        try {
            Cuenta a = cuentaservicio.save(cuenta);
            return ResponseEntity.created(new URI("/cuenta/" + a.getCuenta())).body(a);
        } catch (Exception e) {
            Sentry.captureException(e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @PutMapping("/update")
    private ResponseEntity<Cuenta> updateCuenta(@RequestBody Cuenta cuenta) {
        try {
            Cuenta a = cuentaservicio.save(cuenta);
            return ResponseEntity.created(new URI("/cuenta/" + a.getCuenta())).body(a);
        } catch (Exception e) {
            Sentry.captureException(e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
   
    
    @GetMapping("/error")
    public void triggerException() {
        try {
            throw new Exception("This is a test.");
        } catch (Exception e) {
            Sentry.captureException(e);
        }
    }
}
