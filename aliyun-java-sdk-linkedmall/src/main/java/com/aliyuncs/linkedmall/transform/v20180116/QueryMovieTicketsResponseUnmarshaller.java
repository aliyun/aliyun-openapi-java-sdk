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

	public static QueryMovieTicketsResponse unmarshall(QueryMovieTicketsResponse queryMovieTicketsResponse, UnmarshallerContext _ctx) {
		
		queryMovieTicketsResponse.setRequestId(_ctx.stringValue("QueryMovieTicketsResponse.RequestId"));
		queryMovieTicketsResponse.setLogsId(_ctx.stringValue("QueryMovieTicketsResponse.LogsId"));
		queryMovieTicketsResponse.setSubCode(_ctx.stringValue("QueryMovieTicketsResponse.SubCode"));
		queryMovieTicketsResponse.setSubMessage(_ctx.stringValue("QueryMovieTicketsResponse.SubMessage"));
		queryMovieTicketsResponse.setCode(_ctx.stringValue("QueryMovieTicketsResponse.Code"));
		queryMovieTicketsResponse.setMessage(_ctx.stringValue("QueryMovieTicketsResponse.Message"));
		queryMovieTicketsResponse.setSuccess(_ctx.booleanValue("QueryMovieTicketsResponse.Success"));

		MovieTicket movieTicket = new MovieTicket();
		movieTicket.setStatus(_ctx.stringValue("QueryMovieTicketsResponse.MovieTicket.Status"));
		movieTicket.setReturnMessage(_ctx.stringValue("QueryMovieTicketsResponse.MovieTicket.ReturnMessage"));
		movieTicket.setTbOrderId(_ctx.stringValue("QueryMovieTicketsResponse.MovieTicket.TbOrderId"));
		movieTicket.setTicketContents(_ctx.stringValue("QueryMovieTicketsResponse.MovieTicket.TicketContents"));
		queryMovieTicketsResponse.setMovieTicket(movieTicket);
	 
	 	return queryMovieTicketsResponse;
	}
}