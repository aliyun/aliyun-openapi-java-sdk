/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.iot.model.v20170620;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateProductRequest extends RoaAcsRequest<CreateProductResponse> {
	
	public CreateProductRequest() {
		super("Iot", "2017-06-20", "CreateProduct", "iot");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/createProduct/[Name]");
		setMethod(MethodType.POST);
	}

	private Long catId;

	private String name;

	private String extProps;

	private String securityPolicy;

	private String desc;

	public Long getCatId() {
		return this.catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
		if(catId != null){
			putQueryParameter("CatId", catId.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putPathParameter("Name", name);
		}
	}

	public String getExtProps() {
		return this.extProps;
	}

	public void setExtProps(String extProps) {
		this.extProps = extProps;
		if(extProps != null){
			putQueryParameter("ExtProps", extProps);
		}
	}

	public String getSecurityPolicy() {
		return this.securityPolicy;
	}

	public void setSecurityPolicy(String securityPolicy) {
		this.securityPolicy = securityPolicy;
		if(securityPolicy != null){
			putQueryParameter("SecurityPolicy", securityPolicy);
		}
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		if(desc != null){
			putQueryParameter("Desc", desc);
		}
	}

	@Override
	public Class<CreateProductResponse> getResponseClass() {
		return CreateProductResponse.class;
	}

}
