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
import com.aliyuncs.crm.model.v20150324.FindBizCategoryConfigResponse;
import com.aliyuncs.crm.model.v20150324.FindBizCategoryConfigResponse.BizCategory;
import com.aliyuncs.crm.model.v20150324.FindBizCategoryConfigResponse.BizCategory.BizSubCategory;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindBizCategoryConfigResponseUnmarshaller {

	public static FindBizCategoryConfigResponse unmarshall(FindBizCategoryConfigResponse findBizCategoryConfigResponse, UnmarshallerContext context) {
		
		findBizCategoryConfigResponse.setSuccess(context.booleanValue("FindBizCategoryConfigResponse.Success"));
		findBizCategoryConfigResponse.setResultCode(context.stringValue("FindBizCategoryConfigResponse.ResultCode"));
		findBizCategoryConfigResponse.setResultMessage(context.stringValue("FindBizCategoryConfigResponse.ResultMessage"));

		List<BizCategory> data = new ArrayList<BizCategory>();
		for (int i = 0; i < context.lengthValue("FindBizCategoryConfigResponse.Data.Length"); i++) {
			BizCategory  bizCategory = new BizCategory();
			bizCategory.setName(context.stringValue("FindBizCategoryConfigResponse.Data["+ i +"].Name"));
			bizCategory.setCode(context.stringValue("FindBizCategoryConfigResponse.Data["+ i +"].Code"));
			bizCategory.setIsCheck(context.booleanValue("FindBizCategoryConfigResponse.Data["+ i +"].IsCheck"));
			bizCategory.setMainBiz(context.booleanValue("FindBizCategoryConfigResponse.Data["+ i +"].MainBiz"));
			bizCategory.setOther(context.stringValue("FindBizCategoryConfigResponse.Data["+ i +"].Other"));

			List<BizSubCategory> subConfigs = new ArrayList<BizSubCategory>();
			for (int j = 0; j < context.lengthValue("FindBizCategoryConfigResponse.Data["+ i +"].SubConfigs.Length"); j++) {
				BizSubCategory  bizSubCategory = new BizSubCategory();
				bizSubCategory.setName(context.stringValue("FindBizCategoryConfigResponse.Data["+ i +"].SubConfigs["+ j +"].Name"));
				bizSubCategory.setCode(context.stringValue("FindBizCategoryConfigResponse.Data["+ i +"].SubConfigs["+ j +"].Code"));
				bizSubCategory.setIsCheck(context.booleanValue("FindBizCategoryConfigResponse.Data["+ i +"].SubConfigs["+ j +"].IsCheck"));
				bizSubCategory.setMainBiz(context.booleanValue("FindBizCategoryConfigResponse.Data["+ i +"].SubConfigs["+ j +"].MainBiz"));
				bizSubCategory.setOther(context.stringValue("FindBizCategoryConfigResponse.Data["+ i +"].SubConfigs["+ j +"].Other"));

				subConfigs.add(bizSubCategory);
			}
			bizCategory.setSubConfigs(subConfigs);

			data.add(bizCategory);
		}
		findBizCategoryConfigResponse.setData(data);
	 
	 	return findBizCategoryConfigResponse;
	}
}