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
package com.aliyuncs.iot.transform.v20170420;

import com.aliyuncs.iot.model.v20170420.CreateProductResponse;
import com.aliyuncs.iot.model.v20170420.CreateProductResponse.ProductInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateProductResponseUnmarshaller {

	public static CreateProductResponse unmarshall(CreateProductResponse createProductResponse, UnmarshallerContext context) {
		
		createProductResponse.setRequestId(context.stringValue("CreateProductResponse.RequestId"));
		createProductResponse.setSuccess(context.booleanValue("CreateProductResponse.Success"));
		createProductResponse.setErrorMessage(context.stringValue("CreateProductResponse.ErrorMessage"));

		ProductInfo productInfo = new ProductInfo();
		productInfo.setProductKey(context.stringValue("CreateProductResponse.ProductInfo.ProductKey"));
		productInfo.setProductName(context.stringValue("CreateProductResponse.ProductInfo.ProductName"));
		productInfo.setCatId(context.longValue("CreateProductResponse.ProductInfo.CatId"));
		productInfo.setCreateUserId(context.longValue("CreateProductResponse.ProductInfo.CreateUserId"));
		productInfo.setProductDesc(context.stringValue("CreateProductResponse.ProductInfo.ProductDesc"));
		productInfo.setFromSource(context.stringValue("CreateProductResponse.ProductInfo.FromSource"));
		productInfo.setExtProps(context.stringValue("CreateProductResponse.ProductInfo.ExtProps"));
		productInfo.setGmtCreate(context.stringValue("CreateProductResponse.ProductInfo.GmtCreate"));
		productInfo.setGmtModified(context.stringValue("CreateProductResponse.ProductInfo.GmtModified"));
		productInfo.setProductSecret(context.stringValue("CreateProductResponse.ProductInfo.ProductSecret"));
		createProductResponse.setProductInfo(productInfo);
	 
	 	return createProductResponse;
	}
}