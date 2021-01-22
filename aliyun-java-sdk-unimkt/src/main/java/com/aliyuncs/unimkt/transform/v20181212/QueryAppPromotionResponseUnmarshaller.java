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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.QueryAppPromotionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAppPromotionResponseUnmarshaller {

	public static QueryAppPromotionResponse unmarshall(QueryAppPromotionResponse queryAppPromotionResponse, UnmarshallerContext _ctx) {
		
		queryAppPromotionResponse.setRequestId(_ctx.stringValue("QueryAppPromotionResponse.RequestId"));
		queryAppPromotionResponse.setResult(_ctx.stringValue("QueryAppPromotionResponse.Result"));
		queryAppPromotionResponse.setSuccess(_ctx.booleanValue("QueryAppPromotionResponse.Success"));
		queryAppPromotionResponse.setErrorCode(_ctx.integerValue("QueryAppPromotionResponse.ErrorCode"));
		queryAppPromotionResponse.setErrorMessage(_ctx.stringValue("QueryAppPromotionResponse.ErrorMessage"));
	 
	 	return queryAppPromotionResponse;
	}
}