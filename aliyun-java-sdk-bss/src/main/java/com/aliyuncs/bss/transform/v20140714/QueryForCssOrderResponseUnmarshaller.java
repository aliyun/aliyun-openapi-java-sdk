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

package com.aliyuncs.bss.transform.v20140714;

import com.aliyuncs.bss.model.v20140714.QueryForCssOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryForCssOrderResponseUnmarshaller {

	public static QueryForCssOrderResponse unmarshall(QueryForCssOrderResponse queryForCssOrderResponse, UnmarshallerContext context) {
		
		queryForCssOrderResponse.setRequestId(context.stringValue("QueryForCssOrderResponse.RequestId"));
		queryForCssOrderResponse.setSuccess(context.booleanValue("QueryForCssOrderResponse.Success"));
		queryForCssOrderResponse.setCode(context.stringValue("QueryForCssOrderResponse.Code"));
		queryForCssOrderResponse.setMessage(context.stringValue("QueryForCssOrderResponse.Message"));
		queryForCssOrderResponse.setData(context.stringValue("QueryForCssOrderResponse.Data"));
	 
	 	return queryForCssOrderResponse;
	}
}