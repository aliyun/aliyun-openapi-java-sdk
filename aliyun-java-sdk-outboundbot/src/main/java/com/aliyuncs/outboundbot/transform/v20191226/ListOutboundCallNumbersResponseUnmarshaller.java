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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListOutboundCallNumbersResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListOutboundCallNumbersResponse.OutboundCallNumbers;
import com.aliyuncs.outboundbot.model.v20191226.ListOutboundCallNumbersResponse.OutboundCallNumbers.OutboundCallNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOutboundCallNumbersResponseUnmarshaller {

	public static ListOutboundCallNumbersResponse unmarshall(ListOutboundCallNumbersResponse listOutboundCallNumbersResponse, UnmarshallerContext _ctx) {
		
		listOutboundCallNumbersResponse.setRequestId(_ctx.stringValue("ListOutboundCallNumbersResponse.RequestId"));
		listOutboundCallNumbersResponse.setSuccess(_ctx.booleanValue("ListOutboundCallNumbersResponse.Success"));
		listOutboundCallNumbersResponse.setCode(_ctx.stringValue("ListOutboundCallNumbersResponse.Code"));
		listOutboundCallNumbersResponse.setMessage(_ctx.stringValue("ListOutboundCallNumbersResponse.Message"));
		listOutboundCallNumbersResponse.setHttpStatusCode(_ctx.integerValue("ListOutboundCallNumbersResponse.HttpStatusCode"));

		OutboundCallNumbers outboundCallNumbers = new OutboundCallNumbers();
		outboundCallNumbers.setTotalCount(_ctx.integerValue("ListOutboundCallNumbersResponse.OutboundCallNumbers.TotalCount"));
		outboundCallNumbers.setPageNumber(_ctx.integerValue("ListOutboundCallNumbersResponse.OutboundCallNumbers.PageNumber"));
		outboundCallNumbers.setPageSize(_ctx.integerValue("ListOutboundCallNumbersResponse.OutboundCallNumbers.PageSize"));

		List<OutboundCallNumber> list = new ArrayList<OutboundCallNumber>();
		for (int i = 0; i < _ctx.lengthValue("ListOutboundCallNumbersResponse.OutboundCallNumbers.List.Length"); i++) {
			OutboundCallNumber outboundCallNumber = new OutboundCallNumber();
			outboundCallNumber.setOutboundCallNumberId(_ctx.stringValue("ListOutboundCallNumbersResponse.OutboundCallNumbers.List["+ i +"].OutboundCallNumberId"));
			outboundCallNumber.setNumber(_ctx.stringValue("ListOutboundCallNumbersResponse.OutboundCallNumbers.List["+ i +"].Number"));
			outboundCallNumber.setRateLimitPeriod(_ctx.stringValue("ListOutboundCallNumbersResponse.OutboundCallNumbers.List["+ i +"].RateLimitPeriod"));
			outboundCallNumber.setRateLimitCount(_ctx.stringValue("ListOutboundCallNumbersResponse.OutboundCallNumbers.List["+ i +"].RateLimitCount"));

			list.add(outboundCallNumber);
		}
		outboundCallNumbers.setList(list);
		listOutboundCallNumbersResponse.setOutboundCallNumbers(outboundCallNumbers);
	 
	 	return listOutboundCallNumbersResponse;
	}
}