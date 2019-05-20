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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetCommodityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCommodityResponseUnmarshaller {

	public static GetCommodityResponse unmarshall(GetCommodityResponse getCommodityResponse, UnmarshallerContext context) {
		
		getCommodityResponse.setRequestId(context.stringValue("GetCommodityResponse.RequestId"));
		getCommodityResponse.setSuccess(context.booleanValue("GetCommodityResponse.Success"));
		getCommodityResponse.setCode(context.stringValue("GetCommodityResponse.Code"));
		getCommodityResponse.setMessage(context.stringValue("GetCommodityResponse.Message"));
		getCommodityResponse.setHttpStatusCode(context.integerValue("GetCommodityResponse.HttpStatusCode"));
		getCommodityResponse.setCommondityCode(context.stringValue("GetCommodityResponse.CommondityCode"));
		getCommodityResponse.setCommondityInstanceId(context.stringValue("GetCommodityResponse.CommondityInstanceId"));
	 
	 	return getCommodityResponse;
	}
}