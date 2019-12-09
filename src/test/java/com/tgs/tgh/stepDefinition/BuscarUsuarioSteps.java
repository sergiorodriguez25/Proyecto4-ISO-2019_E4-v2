package com.tgs.tgh.stepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tgs.tgh.model.Usuario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscarUsuarioSteps {
	ChromeDriver driver = WebDriver.webDriver;
	Usuario usuario;

	@Given("^Estoy en la pagina de gestor$")
	public void estoy_en_la_pagina_de_registro() throws Throwable {
		driver.get("http://localhost:8080/gestor");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		assertEquals("gestor", driver.getTitle());
	}
	
	@When("^Busco el dni de un usuario que existe$")
	public void busco_dni_usuario_que_existe() throws Throwable {
		WebElement buscador;
		buscador = driver.findElement(By.id("inputPacientes"));
		buscador.sendKeys(usuario.getDNI());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@When("^Busco el dni de un usuario que no existe$")
	public void busco_dni_usuario_que_no_existe() throws Throwable {
		WebElement buscador;
		buscador = driver.findElement(By.id("inputPacientes"));
		buscador.sendKeys("Usuario que no existe");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Then("^Se muestra el usuario en la lista$")
	public void usuario_encontrado() throws Throwable {
		//el primer elemento es el dni del usuario
		assertEquals(usuario.getDNI(), driver.findElementByXPath("//*[@id=\"Table\"]/tr[1]/td[0]").getText());
	}
	
	@Then("^La lista esta vacia$")
	public void usuario_no_encontrado() throws Throwable {
		assertEquals("Usuario no encontrado", driver.findElementById("labelUsuarioNoEncontrado").getText());
	}
	
	
}