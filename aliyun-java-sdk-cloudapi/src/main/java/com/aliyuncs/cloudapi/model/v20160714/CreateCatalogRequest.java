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
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateCatalogRequest extends RpcAcsRequest<CreateCatalogResponse> {
	
	public CreateCatalogRequest() {
		super("CloudAPI", "2016-07-14", "CreateCatalog", "apigateway");
	}



	private String catalogName;



	private String description;



	private String parentId;



	public String getCatalogName() {

		return this.catalogName;

	}



	public void setCatalogName(String catalogName) {

		this.catalogName = catalogName;

		putQueryParameter("CatalogName", catalogName);

	}



	public String getDescription() {

		return this.description;

	}



	public void setDescription(String description) {

		this.description = description;

		putQueryParameter("Description", description);

	}



	public String getParentId() {

		return this.parentId;

	}



	public void setParentId(String parentId) {

		this.parentId = parentId;

		putQueryParameter("ParentId", parentId);

	}

	@Override
	public Class<CreateCatalogResponse> getResponseClass() {
		return CreateCatalogResponse.class;
	}

}
