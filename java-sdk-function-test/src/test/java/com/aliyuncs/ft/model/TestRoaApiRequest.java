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
package com.aliyuncs.ft.model;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class TestRoaApiRequest extends RoaAcsRequest<TestRoaApiResponse> {
	
	public TestRoaApiRequest() {
		super("Ft", "2016-01-02", "TestRoaApi");
		setUriPattern("/web/cloudapi");
		setMethod(MethodType.PUT);
	}

	private String bodyParam;

	private String queryParam;

	private String headerParam;

	public String getBodyParam() {
		return this.bodyParam;
	}

	public void setBodyParam(String bodyParam) {
		this.bodyParam = bodyParam;
		if (bodyParam != null) {
			putBodyParameter("BodyParam", bodyParam);
		}
	}

	public String getQueryParam() {
		return this.queryParam;
	}

	public void setQueryParam(String queryParam) {
		this.queryParam = queryParam;
		if(queryParam != null){
			putQueryParameter("QueryParam", queryParam);
		}
	}

	public String getHeaderParam() {
		return this.headerParam;
	}

	public void setHeaderParam(String headerParam) {
		this.headerParam = headerParam;
		if(headerParam != null){
			putHeaderParameter("HeaderParam", headerParam);
		}
	}

	@Override
	public Class<TestRoaApiResponse> getResponseClass() {
		return TestRoaApiResponse.class;
	}

}
