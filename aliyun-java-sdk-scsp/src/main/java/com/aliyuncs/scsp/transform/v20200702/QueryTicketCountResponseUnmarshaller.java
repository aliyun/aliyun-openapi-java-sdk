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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.QueryTicketCountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTicketCountResponseUnmarshaller {

	public static QueryTicketCountResponse unmarshall(QueryTicketCountResponse queryTicketCountResponse, UnmarshallerContext _ctx) {
		
		queryTicketCountResponse.setRequestId(_ctx.stringValue("QueryTicketCountResponse.RequestId"));
		queryTicketCountResponse.setMessage(_ctx.stringValue("QueryTicketCountResponse.Message"));
		queryTicketCountResponse.setData(_ctx.stringValue("QueryTicketCountResponse.Data"));
		queryTicketCountResponse.setCode(_ctx.stringValue("QueryTicketCountResponse.Code"));
		queryTicketCountResponse.setSuccess(_ctx.booleanValue("QueryTicketCountResponse.Success"));
	 
	 	return queryTicketCountResponse;
	}
}