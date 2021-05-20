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

import com.aliyuncs.scsp.model.v20200702.CloseTicketResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CloseTicketResponseUnmarshaller {

	public static CloseTicketResponse unmarshall(CloseTicketResponse closeTicketResponse, UnmarshallerContext _ctx) {
		
		closeTicketResponse.setRequestId(_ctx.stringValue("CloseTicketResponse.RequestId"));
		closeTicketResponse.setMessage(_ctx.stringValue("CloseTicketResponse.Message"));
		closeTicketResponse.setCode(_ctx.stringValue("CloseTicketResponse.Code"));
		closeTicketResponse.setSuccess(_ctx.booleanValue("CloseTicketResponse.Success"));
		closeTicketResponse.setHttpStatusCode(_ctx.longValue("CloseTicketResponse.HttpStatusCode"));
	 
	 	return closeTicketResponse;
	}
}