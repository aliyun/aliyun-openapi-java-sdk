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
public class DescribeApisBySignatureRequest extends RpcAcsRequest<DescribeApisBySignatureResponse> {
	
	public DescribeApisBySignatureRequest() {
		super("CloudAPI", "2016-07-14", "DescribeApisBySignature", "apigateway");
	}

	private String signatureId;

	private Integer pageSize;

	private Integer pageNumber;

	public String getSignatureId() {
		return this.signatureId;
	}

	public void setSignatureId(String signatureId) {
		this.signatureId = signatureId;
		putQueryParameter("SignatureId", signatureId);
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", pageSize);
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		putQueryParameter("PageNumber", pageNumber);
	}

	@Override
	public Class<DescribeApisBySignatureResponse> getResponseClass() {
		return DescribeApisBySignatureResponse.class;
	}

}
