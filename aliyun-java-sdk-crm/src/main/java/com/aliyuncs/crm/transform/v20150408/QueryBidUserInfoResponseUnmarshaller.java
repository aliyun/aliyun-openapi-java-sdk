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

package com.aliyuncs.crm.transform.v20150408;

import com.aliyuncs.crm.model.v20150408.QueryBidUserInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBidUserInfoResponseUnmarshaller {

	public static QueryBidUserInfoResponse unmarshall(QueryBidUserInfoResponse queryBidUserInfoResponse, UnmarshallerContext context) {
		
		queryBidUserInfoResponse.setRequestId(context.stringValue("QueryBidUserInfoResponse.RequestId"));
		queryBidUserInfoResponse.setResult(context.stringValue("QueryBidUserInfoResponse.Result"));
	 
	 	return queryBidUserInfoResponse;
	}
}