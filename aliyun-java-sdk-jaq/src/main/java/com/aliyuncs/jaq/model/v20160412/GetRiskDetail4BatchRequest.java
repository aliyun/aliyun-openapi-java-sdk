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
package com.aliyuncs.jaq.model.v20160412;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetRiskDetail4BatchRequest extends RpcAcsRequest<GetRiskDetail4BatchResponse> {
	
	public GetRiskDetail4BatchRequest() {
		super("jaq", "2016-04-12", "GetRiskDetail4Batch");
	}

	private String itemId;

	private String language;

	private String country;

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
		putQueryParameter("ItemId", itemId);
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		putQueryParameter("Language", language);
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		putQueryParameter("Country", country);
	}

	@Override
	public Class<GetRiskDetail4BatchResponse> getResponseClass() {
		return GetRiskDetail4BatchResponse.class;
	}

}
