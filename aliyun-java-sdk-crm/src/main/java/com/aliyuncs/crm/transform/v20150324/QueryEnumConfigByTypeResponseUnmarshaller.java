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
package com.aliyuncs.crm.transform.v20150324;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.crm.model.v20150324.QueryEnumConfigByTypeResponse;
import com.aliyuncs.crm.model.v20150324.QueryEnumConfigByTypeResponse.BizCategory;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEnumConfigByTypeResponseUnmarshaller {

	public static QueryEnumConfigByTypeResponse unmarshall(QueryEnumConfigByTypeResponse queryEnumConfigByTypeResponse, UnmarshallerContext context) {
		
		queryEnumConfigByTypeResponse.setSuccess(context.booleanValue("QueryEnumConfigByTypeResponse.Success"));
		queryEnumConfigByTypeResponse.setResultCode(context.stringValue("QueryEnumConfigByTypeResponse.ResultCode"));
		queryEnumConfigByTypeResponse.setResultMessage(context.stringValue("QueryEnumConfigByTypeResponse.ResultMessage"));

		List<BizCategory> data = new ArrayList<BizCategory>();
		for (int i = 0; i < context.lengthValue("QueryEnumConfigByTypeResponse.Data.Length"); i++) {
			BizCategory  bizCategory = new BizCategory();
			bizCategory.setenumName(context.stringValue("QueryEnumConfigByTypeResponse.Data["+ i +"].enumName"));
			bizCategory.setenumValue(context.stringValue("QueryEnumConfigByTypeResponse.Data["+ i +"].enumValue"));

			data.add(bizCategory);
		}
		queryEnumConfigByTypeResponse.setData(data);
	 
	 	return queryEnumConfigByTypeResponse;
	}
}