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
package com.aliyuncs.iot.model.v20170420;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateProductRequest extends RpcAcsRequest<UpdateProductResponse> {
	
	public UpdateProductRequest() {
		super("Iot", "2017-04-20", "UpdateProduct", "iot");
	}

	private Long catId;

	private String productName;

	private String extProps;

	private String productKey;

	private String productDesc;

	public Long getCatId() {
		return this.catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
		if(catId != null){
			putQueryParameter("CatId", catId.toString());
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
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

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public String getProductDesc() {
		return this.productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
		if(productDesc != null){
			putQueryParameter("ProductDesc", productDesc);
		}
	}

	@Override
	public Class<UpdateProductResponse> getResponseClass() {
		return UpdateProductResponse.class;
	}

}
