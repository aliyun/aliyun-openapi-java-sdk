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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.QueryTicketsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTicketsResponseUnmarshaller {

	public static QueryTicketsResponse unmarshall(QueryTicketsResponse queryTicketsResponse, UnmarshallerContext _ctx) {
		
		queryTicketsResponse.setRequestId(_ctx.stringValue("QueryTicketsResponse.RequestId"));
		queryTicketsResponse.setCode(_ctx.stringValue("QueryTicketsResponse.Code"));
		queryTicketsResponse.setData(_ctx.stringValue("QueryTicketsResponse.Data"));
		queryTicketsResponse.setMessage(_ctx.stringValue("QueryTicketsResponse.Message"));
		queryTicketsResponse.setSuccess(_ctx.booleanValue("QueryTicketsResponse.Success"));
	 
	 	return queryTicketsResponse;
	}
}