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

package com.aliyuncs.workorder.transform.v20210610;

import com.aliyuncs.workorder.model.v20210610.ReopenTicketResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReopenTicketResponseUnmarshaller {

	public static ReopenTicketResponse unmarshall(ReopenTicketResponse reopenTicketResponse, UnmarshallerContext _ctx) {
		
		reopenTicketResponse.setRequestId(_ctx.stringValue("ReopenTicketResponse.RequestId"));
		reopenTicketResponse.setCode(_ctx.integerValue("ReopenTicketResponse.Code"));
		reopenTicketResponse.setMessage(_ctx.stringValue("ReopenTicketResponse.Message"));
		reopenTicketResponse.setData(_ctx.stringValue("ReopenTicketResponse.Data"));
		reopenTicketResponse.setSuccess(_ctx.booleanValue("ReopenTicketResponse.Success"));
	 
	 	return reopenTicketResponse;
	}
}