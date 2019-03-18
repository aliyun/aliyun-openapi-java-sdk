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

package com.aliyuncs.ccs.transform.v20171001;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccs.model.v20171001.QueryTicketResponse;
import com.aliyuncs.ccs.model.v20171001.QueryTicketResponse.Ticket;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTicketResponseUnmarshaller {

	public static QueryTicketResponse unmarshall(QueryTicketResponse queryTicketResponse, UnmarshallerContext context) {
		
		queryTicketResponse.setRequestId(context.stringValue("QueryTicketResponse.RequestId"));
		queryTicketResponse.setPageNum(context.integerValue("QueryTicketResponse.PageNum"));
		queryTicketResponse.setPageSize(context.integerValue("QueryTicketResponse.PageSize"));
		queryTicketResponse.setTotalCount(context.longValue("QueryTicketResponse.TotalCount"));

		List<Ticket> tickets = new ArrayList<Ticket>();
		for (int i = 0; i < context.lengthValue("QueryTicketResponse.Tickets.Length"); i++) {
			Ticket ticket = new Ticket();
			ticket.setId(context.stringValue("QueryTicketResponse.Tickets["+ i +"].Id"));
			ticket.setType(context.stringValue("QueryTicketResponse.Tickets["+ i +"].Type"));
			ticket.setStage(context.stringValue("QueryTicketResponse.Tickets["+ i +"].Stage"));
			ticket.setDescription(context.stringValue("QueryTicketResponse.Tickets["+ i +"].Description"));
			ticket.setCreatorId(context.stringValue("QueryTicketResponse.Tickets["+ i +"].CreatorId"));
			ticket.setCreateTime(context.stringValue("QueryTicketResponse.Tickets["+ i +"].CreateTime"));
			ticket.setCustomFields(context.stringValue("QueryTicketResponse.Tickets["+ i +"].CustomFields"));

			tickets.add(ticket);
		}
		queryTicketResponse.setTickets(tickets);
	 
	 	return queryTicketResponse;
	}
}