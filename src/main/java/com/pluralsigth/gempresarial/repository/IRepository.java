package com.pluralsigth.gempresarial.repository;

import java.util.ArrayList;

import com.pluralsigth.gempresarial.models.EntityBase;

public interface IRepository<T extends EntityBase> {
	ArrayList<T> Get();
	T GetById(int id);
    void Add(T entity);
    void Delete(T entity);
    void Edit(T entity);
}
