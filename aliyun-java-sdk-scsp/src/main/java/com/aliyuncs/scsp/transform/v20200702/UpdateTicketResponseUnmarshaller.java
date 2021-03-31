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

import com.aliyuncs.scsp.model.v20200702.UpdateTicketResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTicketResponseUnmarshaller {

	public static UpdateTicketResponse unmarshall(UpdateTicketResponse updateTicketResponse, UnmarshallerContext _ctx) {
		
		updateTicketResponse.setRequestId(_ctx.stringValue("UpdateTicketResponse.RequestId"));
		updateTicketResponse.setMessage(_ctx.stringValue("UpdateTicketResponse.Message"));
		updateTicketResponse.setCode(_ctx.stringValue("UpdateTicketResponse.Code"));
		updateTicketResponse.setSuccess(_ctx.booleanValue("UpdateTicketResponse.Success"));
	 
	 	return updateTicketResponse;
	}
}