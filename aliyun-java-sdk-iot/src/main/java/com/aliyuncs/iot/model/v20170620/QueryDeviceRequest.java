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
public class QueryDeviceRequest extends RoaAcsRequest<QueryDeviceResponse> {
	
	public QueryDeviceRequest() {
		super("Iot", "2017-06-20", "QueryDevice");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/queryDevice/[ProductKey]");
		setMethod(MethodType.GET);
	}

	private String productKey;

	private Integer pageSize;

	private Integer currentPage;

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		putPathParameter("ProductKey", productKey);
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", pageSize);
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		putQueryParameter("CurrentPage", currentPage);
	}

	@Override
	public Class<QueryDeviceResponse> getResponseClass() {
		return QueryDeviceResponse.class;
	}

}
