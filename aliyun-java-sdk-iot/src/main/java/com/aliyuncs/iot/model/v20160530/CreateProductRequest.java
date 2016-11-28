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
package com.aliyuncs.iot.model.v20160530;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateProductRequest extends RpcAcsRequest<CreateProductResponse> {
	
	public CreateProductRequest() {
		super("Iot", "2016-05-30", "CreateProduct");
	}

	private String name;

	private String desc;

	private Long catId;

	private String extProps;

	private String securityPolicy;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		putQueryParameter("Name", name);
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		putQueryParameter("Desc", desc);
	}

	public Long getCatId() {
		return this.catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
		putQueryParameter("CatId", catId);
	}

	public String getExtProps() {
		return this.extProps;
	}

	public void setExtProps(String extProps) {
		this.extProps = extProps;
		putQueryParameter("ExtProps", extProps);
	}

	public String getSecurityPolicy() {
		return this.securityPolicy;
	}

	public void setSecurityPolicy(String securityPolicy) {
		this.securityPolicy = securityPolicy;
		putQueryParameter("SecurityPolicy", securityPolicy);
	}

	@Override
	public Class<CreateProductResponse> getResponseClass() {
		return CreateProductResponse.class;
	}

}
