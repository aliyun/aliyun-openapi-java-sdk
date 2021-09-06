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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.QueryUnionPromotionResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUnionPromotionResponseUnmarshaller {

	public static QueryUnionPromotionResponse unmarshall(QueryUnionPromotionResponse queryUnionPromotionResponse, UnmarshallerContext _ctx) {
		
		queryUnionPromotionResponse.setRequestId(_ctx.stringValue("QueryUnionPromotionResponse.RequestId"));
		queryUnionPromotionResponse.setErrorMsg(_ctx.stringValue("QueryUnionPromotionResponse.ErrorMsg"));
		queryUnionPromotionResponse.setBizErrorCode(_ctx.stringValue("QueryUnionPromotionResponse.BizErrorCode"));
		queryUnionPromotionResponse.setSuccess(_ctx.booleanValue("QueryUnionPromotionResponse.Success"));
		queryUnionPromotionResponse.setErrorCode(_ctx.integerValue("QueryUnionPromotionResponse.ErrorCode"));

		List<Map<Object, Object>> result = _ctx.listMapValue("QueryUnionPromotionResponse.Result");
		queryUnionPromotionResponse.setResult(result);
	 
	 	return queryUnionPromotionResponse;
	}
}