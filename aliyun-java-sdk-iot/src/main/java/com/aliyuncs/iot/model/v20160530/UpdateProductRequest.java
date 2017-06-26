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
public class UpdateProductRequest extends RpcAcsRequest<UpdateProductResponse> {
	
	public UpdateProductRequest() {
		super("Iot", "2016-05-30", "UpdateProduct");
	}

	private String productName;

	private String productDesc;

	private String extProps;

	private Long catId;

	private String productKey;

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		putQueryParameter("ProductName", productName);
	}

	public String getProductDesc() {
		return this.productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
		putQueryParameter("ProductDesc", productDesc);
	}

	public String getExtProps() {
		return this.extProps;
	}

	public void setExtProps(String extProps) {
		this.extProps = extProps;
		putQueryParameter("ExtProps", extProps);
	}

	public Long getCatId() {
		return this.catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
		putQueryParameter("CatId", catId);
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		putQueryParameter("ProductKey", productKey);
	}

	@Override
	public Class<UpdateProductResponse> getResponseClass() {
		return UpdateProductResponse.class;
	}

}
