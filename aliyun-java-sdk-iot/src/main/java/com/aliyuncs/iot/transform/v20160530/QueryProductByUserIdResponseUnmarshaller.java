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
package com.aliyuncs.iot.transform.v20160530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20160530.QueryProductByUserIdResponse;
import com.aliyuncs.iot.model.v20160530.QueryProductByUserIdResponse.ProductInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProductByUserIdResponseUnmarshaller {

	public static QueryProductByUserIdResponse unmarshall(QueryProductByUserIdResponse queryProductByUserIdResponse, UnmarshallerContext context) {
		
		queryProductByUserIdResponse.setRequestId(context.stringValue("QueryProductByUserIdResponse.RequestId"));
		queryProductByUserIdResponse.setSuccess(context.booleanValue("QueryProductByUserIdResponse.Success"));
		queryProductByUserIdResponse.setErrorMessage(context.stringValue("QueryProductByUserIdResponse.ErrorMessage"));
		queryProductByUserIdResponse.setPageSize(context.integerValue("QueryProductByUserIdResponse.PageSize"));
		queryProductByUserIdResponse.setPageCount(context.integerValue("QueryProductByUserIdResponse.PageCount"));
		queryProductByUserIdResponse.setPage(context.integerValue("QueryProductByUserIdResponse.Page"));
		queryProductByUserIdResponse.setTotal(context.integerValue("QueryProductByUserIdResponse.Total"));

		List<ProductInfo> data = new ArrayList<ProductInfo>();
		for (int i = 0; i < context.lengthValue("QueryProductByUserIdResponse.Data.Length"); i++) {
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductKey(context.stringValue("QueryProductByUserIdResponse.Data["+ i +"].ProductKey"));
			productInfo.setProductName(context.stringValue("QueryProductByUserIdResponse.Data["+ i +"].ProductName"));
			productInfo.setCatId(context.longValue("QueryProductByUserIdResponse.Data["+ i +"].CatId"));
			productInfo.setCreateUserId(context.longValue("QueryProductByUserIdResponse.Data["+ i +"].CreateUserId"));
			productInfo.setProductDesc(context.stringValue("QueryProductByUserIdResponse.Data["+ i +"].ProductDesc"));
			productInfo.setProductSecret(context.stringValue("QueryProductByUserIdResponse.Data["+ i +"].ProductSecret"));
			productInfo.setSecurePolicy(context.stringValue("QueryProductByUserIdResponse.Data["+ i +"].SecurePolicy"));
			productInfo.setFromSource(context.stringValue("QueryProductByUserIdResponse.Data["+ i +"].FromSource"));
			productInfo.setExtProps(context.stringValue("QueryProductByUserIdResponse.Data["+ i +"].ExtProps"));
			productInfo.setGmtCreate(context.stringValue("QueryProductByUserIdResponse.Data["+ i +"].GmtCreate"));
			productInfo.setGmtModified(context.stringValue("QueryProductByUserIdResponse.Data["+ i +"].GmtModified"));

			data.add(productInfo);
		}
		queryProductByUserIdResponse.setData(data);
	 
	 	return queryProductByUserIdResponse;
	}
}