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

import com.alibaba.fastjson.JSON;
import com.aliyuncs.RpcAcsRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class AddCatalogRelationsRequest extends RpcAcsRequest<AddCatalogRelationsResponse> {
	
	public AddCatalogRelationsRequest() {
		super("CloudAPI", "2016-07-14", "AddCatalogRelations", "apigateway");
	}



	private String catalogId;



	private String apiIds;
	
	private List<String> apiList;



	public String getCatalogId() {

		return this.catalogId;

	}



	public void setCatalogId(String catalogId) {

		this.catalogId = catalogId;

		putQueryParameter("CatalogId", catalogId);

	}



	public String getApiIds() {

		return this.apiIds;

	}



	public void setApiIds(String apiIds) {

		this.apiIds = apiIds;

		putQueryParameter("ApiIds", apiIds);

	}
	
	public void addApiId(String apiId) {
		if (null == apiList) {
			apiList = new ArrayList<String>();
		}
		if (!apiList.contains(apiId)) {
			apiList.add(apiId);
		}
		
		setApiIds(JSON.toJSONString(apiList));
	}

	@Override
	public Class<AddCatalogRelationsResponse> getResponseClass() {
		return AddCatalogRelationsResponse.class;
	}

}
