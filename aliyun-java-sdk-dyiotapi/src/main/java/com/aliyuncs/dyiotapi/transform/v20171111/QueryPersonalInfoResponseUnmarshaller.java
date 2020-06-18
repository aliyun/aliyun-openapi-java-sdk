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

package com.aliyuncs.dyiotapi.transform.v20171111;

import com.aliyuncs.dyiotapi.model.v20171111.QueryPersonalInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPersonalInfoResponseUnmarshaller {

	public static QueryPersonalInfoResponse unmarshall(QueryPersonalInfoResponse queryPersonalInfoResponse, UnmarshallerContext _ctx) {
		
		queryPersonalInfoResponse.setRequestId(_ctx.stringValue("QueryPersonalInfoResponse.RequestId"));
		queryPersonalInfoResponse.setCode(_ctx.stringValue("QueryPersonalInfoResponse.Code"));
		queryPersonalInfoResponse.setMessage(_ctx.stringValue("QueryPersonalInfoResponse.Message"));
		queryPersonalInfoResponse.setModule(_ctx.stringValue("QueryPersonalInfoResponse.Module"));
	 
	 	return queryPersonalInfoResponse;
	}
}