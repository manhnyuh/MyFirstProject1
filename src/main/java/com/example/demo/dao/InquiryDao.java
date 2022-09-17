package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Inquiry;

@Mapper
public interface InquiryDao {

		void insertInquiry(Inquiry inquiry);
		
		List<Inquiry> getAll();
}
