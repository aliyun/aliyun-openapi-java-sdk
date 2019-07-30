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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.CreateMovieTicketOrderResponse;
import com.aliyuncs.linkedmall.model.v20180116.CreateMovieTicketOrderResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMovieTicketOrderResponseUnmarshaller {

	public static CreateMovieTicketOrderResponse unmarshall(CreateMovieTicketOrderResponse createMovieTicketOrderResponse, UnmarshallerContext _ctx) {
		
		createMovieTicketOrderResponse.setRequestId(_ctx.stringValue("CreateMovieTicketOrderResponse.RequestId"));
		createMovieTicketOrderResponse.setCode(_ctx.stringValue("CreateMovieTicketOrderResponse.Code"));
		createMovieTicketOrderResponse.setMessage(_ctx.stringValue("CreateMovieTicketOrderResponse.Message"));
		createMovieTicketOrderResponse.setSubCode(_ctx.stringValue("CreateMovieTicketOrderResponse.SubCode"));
		createMovieTicketOrderResponse.setSubMessage(_ctx.stringValue("CreateMovieTicketOrderResponse.SubMessage"));
		createMovieTicketOrderResponse.setLogsId(_ctx.stringValue("CreateMovieTicketOrderResponse.LogsId"));
		createMovieTicketOrderResponse.setSuccess(_ctx.booleanValue("CreateMovieTicketOrderResponse.Success"));
		createMovieTicketOrderResponse.setTotalCount(_ctx.longValue("CreateMovieTicketOrderResponse.TotalCount"));

		Model model = new Model();
		model.setRedirectUrl(_ctx.stringValue("CreateMovieTicketOrderResponse.Model.RedirectUrl"));

		List<String> orderIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateMovieTicketOrderResponse.Model.OrderIds.Length"); i++) {
			orderIds.add(_ctx.stringValue("CreateMovieTicketOrderResponse.Model.OrderIds["+ i +"]"));
		}
		model.setOrderIds(orderIds);

		List<String> payTradeIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateMovieTicketOrderResponse.Model.PayTradeIds.Length"); i++) {
			payTradeIds.add(_ctx.stringValue("CreateMovieTicketOrderResponse.Model.PayTradeIds["+ i +"]"));
		}
		model.setPayTradeIds(payTradeIds);
		createMovieTicketOrderResponse.setModel(model);
	 
	 	return createMovieTicketOrderResponse;
	}
}