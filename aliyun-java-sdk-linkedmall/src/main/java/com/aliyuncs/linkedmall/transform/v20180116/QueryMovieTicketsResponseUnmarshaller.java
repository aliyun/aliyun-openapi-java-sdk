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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.QueryMovieTicketsResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryMovieTicketsResponse.MovieTicket;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMovieTicketsResponseUnmarshaller {

	public static QueryMovieTicketsResponse unmarshall(QueryMovieTicketsResponse queryMovieTicketsResponse, UnmarshallerContext context) {
		
		queryMovieTicketsResponse.setRequestId(context.stringValue("QueryMovieTicketsResponse.RequestId"));
		queryMovieTicketsResponse.setLogsId(context.stringValue("QueryMovieTicketsResponse.LogsId"));
		queryMovieTicketsResponse.setSubCode(context.stringValue("QueryMovieTicketsResponse.SubCode"));
		queryMovieTicketsResponse.setSubMessage(context.stringValue("QueryMovieTicketsResponse.SubMessage"));
		queryMovieTicketsResponse.setCode(context.stringValue("QueryMovieTicketsResponse.Code"));
		queryMovieTicketsResponse.setMessage(context.stringValue("QueryMovieTicketsResponse.Message"));
		queryMovieTicketsResponse.setSuccess(context.booleanValue("QueryMovieTicketsResponse.Success"));

		MovieTicket movieTicket = new MovieTicket();
		movieTicket.setStatus(context.stringValue("QueryMovieTicketsResponse.MovieTicket.Status"));
		movieTicket.setReturnMessage(context.stringValue("QueryMovieTicketsResponse.MovieTicket.ReturnMessage"));
		movieTicket.setTbOrderId(context.stringValue("QueryMovieTicketsResponse.MovieTicket.TbOrderId"));
		movieTicket.setTicketContents(context.stringValue("QueryMovieTicketsResponse.MovieTicket.TicketContents"));
		queryMovieTicketsResponse.setMovieTicket(movieTicket);
	 
	 	return queryMovieTicketsResponse;
	}
}