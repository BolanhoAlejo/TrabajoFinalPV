package ar.edu.unju.edm.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.util.Productos;
import ar.edu.unju.edm.util.*;


@Controller

public class ProductoController {
	/*
	public ProductoController(){
		
		Productos listado= new Productos();
		
	}
	*/
	
	@GetMapping("/producto")
	public ModelAndView solicitarProducto() {
		Producto unProducto= new Producto();
		ModelAndView name= new ModelAndView("producto");
		name.addObject("producto", unProducto);
		return name;
	}
	
	@GetMapping("/productoin")
	public ModelAndView solicitarProductoin() {
		Producto unProducto= new Producto();
		ModelAndView name= new ModelAndView("productoin");
		name.addObject("producto", unProducto);
		return name;
	}
	
	@GetMapping("/productopr")
	public ModelAndView solicitarProductopr() {
		Producto unProducto= new Producto();
		ModelAndView name= new ModelAndView("productopr");
		name.addObject("producto", unProducto);
		return name;
	}
	
	@GetMapping("/productonoche")
	public ModelAndView solicitarProductonoche() {
		Producto unProducto= new Producto();
		ModelAndView name= new ModelAndView("productonoche");
		name.addObject("producto", unProducto);
		return name;
	}
	
	@GetMapping("/productonochein")
	public ModelAndView solicitarProductonochein() {
		Producto unProducto= new Producto();
		ModelAndView name= new ModelAndView("productonochein");
		name.addObject("producto", unProducto);
		return name;
	}
	
	@GetMapping("/productonochepr")
	public ModelAndView solicitarProductonochepr() {
		Producto unProducto= new Producto();
		ModelAndView name= new ModelAndView("productonochepr");
		name.addObject("producto", unProducto);
		return name;
	}
	
	
	@PostMapping("/guardarProducto")
	public ModelAndView cargarProducto(@ModelAttribute("producto") Producto nuevoProducto, Productos listado) {
		nuevoProducto.setEstado(true);
		//Productos listado= new Productos();
		Productos.getListadoDeProductos().add(nuevoProducto);
		ModelAndView listadoFinal= new ModelAndView("mostrarListado");
		listadoFinal.addObject("listado", Productos.getListadoDeProductos());
		//System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa: "+listado.getListadoDeProductos().get(0).getNombre());
		
		return listadoFinal;
	}
	
	@GetMapping("/eliminarProducto/{codigo}")
	public ModelAndView eliminarProducto(@PathVariable int codigo) {
	    for (Producto producto : Productos.getListadoDeProductos()) {
	        if (producto.getCodigo() == codigo) {
	            Productos.getListadoDeProductos().remove(producto);
	            break;
	        }
	    }
	    ModelAndView listadoFinal = new ModelAndView("mostrarListado");
	    listadoFinal.addObject("listado", Productos.getListadoDeProductos());
	    return listadoFinal;
	}

	@GetMapping("/editarProducto/{codigo}")
	public ModelAndView editarProducto(@PathVariable int codigo) {
	    Producto productoEditar = null;
	    for (Producto producto : Productos.getListadoDeProductos()) {
	        if (producto.getCodigo() == codigo) {
	            productoEditar = producto;
	            break;
	        }
	    }
	    ModelAndView editarProducto = new ModelAndView("editarProducto");
	    editarProducto.addObject("producto", productoEditar);
	    return editarProducto;
	}

	@PostMapping("/guardarEdicion")
	public ModelAndView guardarEdicion(@ModelAttribute("producto") Producto productoEditado) {
	    for (int i = 0; i < Productos.getListadoDeProductos().size(); i++) {
	        Producto producto = Productos.getListadoDeProductos().get(i);
	        if (producto.getCodigo() == productoEditado.getCodigo()) {
	            Productos.getListadoDeProductos().set(i, productoEditado);
	            break;
	        }
	    }
	    ModelAndView listadoFinal = new ModelAndView("mostrarListado");
	    listadoFinal.addObject("listado", Productos.getListadoDeProductos());
	    return listadoFinal;
	}
    @GetMapping("/index")
    public String mostrarIndex() {
        //ModelAndView modelAndView = new ModelAndView("index");
        return "index.html";
   
    }
    @GetMapping("/indexnochepr")
    public String mostrarIndexnochepr() {
        //ModelAndView modelAndView = new ModelAndView("indexnochepr");
        return "indexnochepr.html";
   
    }
    @GetMapping("/indexnoche")
    public String mostrarIndexnoche() {
        //ModelAndView modelAndView = new ModelAndView("indexnoche");
        return "indexnoche.html";
   
    }
    @GetMapping("/indexnochein")
    public String mostrarIndexnochein() {
        //ModelAndView modelAndView = new ModelAndView("indexnochein");
        return "indexnochein.html";
   
    }
    @GetMapping("/indexin")
    public String mostrarIndexin() {
        //ModelAndView modelAndView = new ModelAndView("indexin");
        return "indexin.html";
    }
    @GetMapping("/indexpr")
    public String mostrarIndexpr() {
        //ModelAndView modelAndView = new ModelAndView("indexpr");
        return "indexpr.html";
   
    }
    @GetMapping("/inicio")
    public String mostrarinicio() {
        //ModelAndView modelAndView = new ModelAndView("inicio");
        return "inicio.html";
   
    }
    @GetMapping("/perfile")
    public String mostrarperfile() {
        //ModelAndView modelAndView = new ModelAndView("perfile");
        return "perfile.html";
   
    }
    @GetMapping("/home")
    public String mostrarhome() {
        //ModelAndView modelAndView = new ModelAndView("home");
        return "home.html";
   
    }
    @PostMapping("/indexin")
    public ModelAndView procesarIndexin() {
        // Lógica para procesar el formulario de indexin.html
        ModelAndView modelAndView = new ModelAndView("resultadoIndexin");
        modelAndView.addObject("mensaje", "Formulario indexin.html enviado correctamente");
        return modelAndView;
    }
	
}
