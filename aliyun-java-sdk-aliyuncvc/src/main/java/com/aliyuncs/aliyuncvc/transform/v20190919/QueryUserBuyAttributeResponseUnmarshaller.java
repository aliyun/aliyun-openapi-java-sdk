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

package com.aliyuncs.aliyuncvc.transform.v20190919;

import com.aliyuncs.aliyuncvc.model.v20190919.QueryUserBuyAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserBuyAttributeResponseUnmarshaller {

	public static QueryUserBuyAttributeResponse unmarshall(QueryUserBuyAttributeResponse queryUserBuyAttributeResponse, UnmarshallerContext _ctx) {
		
		queryUserBuyAttributeResponse.setRequestId(_ctx.stringValue("QueryUserBuyAttributeResponse.RequestId"));
		queryUserBuyAttributeResponse.setErrorCode(_ctx.integerValue("QueryUserBuyAttributeResponse.ErrorCode"));
		queryUserBuyAttributeResponse.setMessage(_ctx.stringValue("QueryUserBuyAttributeResponse.Message"));
		queryUserBuyAttributeResponse.setSuccess(_ctx.booleanValue("QueryUserBuyAttributeResponse.Success"));
		queryUserBuyAttributeResponse.setUserBuyAttribute(_ctx.booleanValue("QueryUserBuyAttributeResponse.UserBuyAttribute"));
	 
	 	return queryUserBuyAttributeResponse;
	}
}