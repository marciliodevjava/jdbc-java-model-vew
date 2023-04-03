package br.com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.jdbc.dao.CategoriaDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Categoria;

public class CategoriaController {

	private CategoriaDAO categoriaDAO;

	public CategoriaController() throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();

		this.categoriaDAO = new CategoriaDAO(connection);
	}

	public List<Categoria> listar() throws SQLException {
		return this.categoriaDAO.listar();
	}
	public List<Categoria> listarComProduto() throws SQLException {
		return this.categoriaDAO.listarComProduto();
	}
}
