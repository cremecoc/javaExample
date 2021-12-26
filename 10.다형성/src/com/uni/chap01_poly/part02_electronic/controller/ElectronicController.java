package com.uni.chap01_poly.part02_electronic.controller;

import com.uni.chap01_poly.part02_electronic.model.vo.Desktop;
import com.uni.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.uni.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicController {
	
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;

	public void insert(Desktop desktop) {
		desk = desktop; // 객체 생성 후 정보 담기
		
	}

	public void insert(NoteBook noteBook) {
		note = noteBook;
		
	}

	public void insert(Tablet tablet) {
		tab = tablet;
		
	}
	
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}

}
