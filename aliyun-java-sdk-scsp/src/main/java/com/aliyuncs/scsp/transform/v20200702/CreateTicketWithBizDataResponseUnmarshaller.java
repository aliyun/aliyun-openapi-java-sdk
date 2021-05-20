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

import com.aliyuncs.scsp.model.v20200702.CreateTicketWithBizDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTicketWithBizDataResponseUnmarshaller {

	public static CreateTicketWithBizDataResponse unmarshall(CreateTicketWithBizDataResponse createTicketWithBizDataResponse, UnmarshallerContext _ctx) {
		
		createTicketWithBizDataResponse.setRequestId(_ctx.stringValue("CreateTicketWithBizDataResponse.RequestId"));
		createTicketWithBizDataResponse.setMessage(_ctx.stringValue("CreateTicketWithBizDataResponse.Message"));
		createTicketWithBizDataResponse.setData(_ctx.longValue("CreateTicketWithBizDataResponse.Data"));
		createTicketWithBizDataResponse.setCode(_ctx.stringValue("CreateTicketWithBizDataResponse.Code"));
		createTicketWithBizDataResponse.setSuccess(_ctx.booleanValue("CreateTicketWithBizDataResponse.Success"));
	 
	 	return createTicketWithBizDataResponse;
	}
}