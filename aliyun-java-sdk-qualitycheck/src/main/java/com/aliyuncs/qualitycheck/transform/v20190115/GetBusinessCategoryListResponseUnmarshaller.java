/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.GetBusinessCategoryListResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetBusinessCategoryListResponse.BusinessCategoryBasicInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBusinessCategoryListResponseUnmarshaller {

	public static GetBusinessCategoryListResponse unmarshall(GetBusinessCategoryListResponse getBusinessCategoryListResponse, UnmarshallerContext context) {
		
		getBusinessCategoryListResponse.setRequestId(context.stringValue("GetBusinessCategoryListResponse.RequestId"));
		getBusinessCategoryListResponse.setSuccess(context.booleanValue("GetBusinessCategoryListResponse.Success"));
		getBusinessCategoryListResponse.setCode(context.stringValue("GetBusinessCategoryListResponse.Code"));
		getBusinessCategoryListResponse.setMessage(context.stringValue("GetBusinessCategoryListResponse.Message"));

		List<BusinessCategoryBasicInfo> data = new ArrayList<BusinessCategoryBasicInfo>();
		for (int i = 0; i < context.lengthValue("GetBusinessCategoryListResponse.Data.Length"); i++) {
			BusinessCategoryBasicInfo businessCategoryBasicInfo = new BusinessCategoryBasicInfo();
			businessCategoryBasicInfo.setBid(context.integerValue("GetBusinessCategoryListResponse.Data["+ i +"].Bid"));
			businessCategoryBasicInfo.setServiceType(context.integerValue("GetBusinessCategoryListResponse.Data["+ i +"].ServiceType"));
			businessCategoryBasicInfo.setBusinessName(context.stringValue("GetBusinessCategoryListResponse.Data["+ i +"].BusinessName"));

			data.add(businessCategoryBasicInfo);
		}
		getBusinessCategoryListResponse.setData(data);
	 
	 	return getBusinessCategoryListResponse;
	}
}