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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scsp.model.v20200702.ListOutboundPhoneNumberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOutboundPhoneNumberResponseUnmarshaller {

	public static ListOutboundPhoneNumberResponse unmarshall(ListOutboundPhoneNumberResponse listOutboundPhoneNumberResponse, UnmarshallerContext _ctx) {
		
		listOutboundPhoneNumberResponse.setRequestId(_ctx.stringValue("ListOutboundPhoneNumberResponse.RequestId"));
		listOutboundPhoneNumberResponse.setMessage(_ctx.stringValue("ListOutboundPhoneNumberResponse.Message"));
		listOutboundPhoneNumberResponse.setCode(_ctx.stringValue("ListOutboundPhoneNumberResponse.Code"));
		listOutboundPhoneNumberResponse.setSuccess(_ctx.booleanValue("ListOutboundPhoneNumberResponse.Success"));
		listOutboundPhoneNumberResponse.setHttpStatusCode(_ctx.longValue("ListOutboundPhoneNumberResponse.HttpStatusCode"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListOutboundPhoneNumberResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("ListOutboundPhoneNumberResponse.Data["+ i +"]"));
		}
		listOutboundPhoneNumberResponse.setData(data);
	 
	 	return listOutboundPhoneNumberResponse;
	}
}