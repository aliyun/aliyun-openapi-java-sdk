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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.GetTicketsInfoResponse;
import com.aliyuncs.copyright.model.v20190123.GetTicketsInfoResponse.Tickets;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTicketsInfoResponseUnmarshaller {

	public static GetTicketsInfoResponse unmarshall(GetTicketsInfoResponse getTicketsInfoResponse, UnmarshallerContext _ctx) {
		
		getTicketsInfoResponse.setRequestId(_ctx.stringValue("GetTicketsInfoResponse.RequestId"));
		getTicketsInfoResponse.setSuccess(_ctx.booleanValue("GetTicketsInfoResponse.Success"));

		List<Tickets> data = new ArrayList<Tickets>();
		for (int i = 0; i < _ctx.lengthValue("GetTicketsInfoResponse.Data.Length"); i++) {
			Tickets tickets = new Tickets();
			tickets.setInvoiceUrl(_ctx.stringValue("GetTicketsInfoResponse.Data["+ i +"].InvoiceUrl"));
			tickets.setRemark(_ctx.stringValue("GetTicketsInfoResponse.Data["+ i +"].Remark"));
			tickets.setPatentNo(_ctx.longValue("GetTicketsInfoResponse.Data["+ i +"].PatentNo"));
			tickets.setInvoiceYear(_ctx.integerValue("GetTicketsInfoResponse.Data["+ i +"].InvoiceYear"));
			tickets.setFee(_ctx.stringValue("GetTicketsInfoResponse.Data["+ i +"].Fee"));

			data.add(tickets);
		}
		getTicketsInfoResponse.setData(data);
	 
	 	return getTicketsInfoResponse;
	}
}