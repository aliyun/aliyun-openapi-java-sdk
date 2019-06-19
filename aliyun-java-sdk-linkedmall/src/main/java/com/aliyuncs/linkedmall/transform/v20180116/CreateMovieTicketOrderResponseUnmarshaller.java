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

	public static CreateMovieTicketOrderResponse unmarshall(CreateMovieTicketOrderResponse createMovieTicketOrderResponse, UnmarshallerContext context) {
		
		createMovieTicketOrderResponse.setRequestId(context.stringValue("CreateMovieTicketOrderResponse.RequestId"));
		createMovieTicketOrderResponse.setCode(context.stringValue("CreateMovieTicketOrderResponse.Code"));
		createMovieTicketOrderResponse.setMessage(context.stringValue("CreateMovieTicketOrderResponse.Message"));
		createMovieTicketOrderResponse.setSubCode(context.stringValue("CreateMovieTicketOrderResponse.SubCode"));
		createMovieTicketOrderResponse.setSubMessage(context.stringValue("CreateMovieTicketOrderResponse.SubMessage"));
		createMovieTicketOrderResponse.setLogsId(context.stringValue("CreateMovieTicketOrderResponse.LogsId"));
		createMovieTicketOrderResponse.setSuccess(context.booleanValue("CreateMovieTicketOrderResponse.Success"));
		createMovieTicketOrderResponse.setTotalCount(context.longValue("CreateMovieTicketOrderResponse.TotalCount"));

		Model model = new Model();
		model.setRedirectUrl(context.stringValue("CreateMovieTicketOrderResponse.Model.RedirectUrl"));

		List<String> orderIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateMovieTicketOrderResponse.Model.OrderIds.Length"); i++) {
			orderIds.add(context.stringValue("CreateMovieTicketOrderResponse.Model.OrderIds["+ i +"]"));
		}
		model.setOrderIds(orderIds);

		List<String> payTradeIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateMovieTicketOrderResponse.Model.PayTradeIds.Length"); i++) {
			payTradeIds.add(context.stringValue("CreateMovieTicketOrderResponse.Model.PayTradeIds["+ i +"]"));
		}
		model.setPayTradeIds(payTradeIds);
		createMovieTicketOrderResponse.setModel(model);
	 
	 	return createMovieTicketOrderResponse;
	}
}