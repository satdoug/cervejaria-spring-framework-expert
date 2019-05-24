package br.com.idsolucoesdigitais.brewer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.idsolucoesdigitais.brewer.service.CervejaService;

@Configuration
@ComponentScan(basePackageClasses = CervejaService.class)
public class ServiceConfig {

}
