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

import com.aliyuncs.linkedmall.model.v20180116.CreatePayUrlResponse;
import com.aliyuncs.linkedmall.model.v20180116.CreatePayUrlResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePayUrlResponseUnmarshaller {

	public static CreatePayUrlResponse unmarshall(CreatePayUrlResponse createPayUrlResponse, UnmarshallerContext _ctx) {
		
		createPayUrlResponse.setRequestId(_ctx.stringValue("CreatePayUrlResponse.RequestId"));
		createPayUrlResponse.setCode(_ctx.stringValue("CreatePayUrlResponse.Code"));
		createPayUrlResponse.setSuccess(_ctx.booleanValue("CreatePayUrlResponse.Success"));
		createPayUrlResponse.setMessage(_ctx.stringValue("CreatePayUrlResponse.Message"));

		Model model = new Model();
		model.setRedirectUrl(_ctx.stringValue("CreatePayUrlResponse.Model.RedirectUrl"));

		List<String> orderIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreatePayUrlResponse.Model.OrderIds.Length"); i++) {
			orderIds.add(_ctx.stringValue("CreatePayUrlResponse.Model.OrderIds["+ i +"]"));
		}
		model.setOrderIds(orderIds);

		List<String> payTradeIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreatePayUrlResponse.Model.PayTradeIds.Length"); i++) {
			payTradeIds.add(_ctx.stringValue("CreatePayUrlResponse.Model.PayTradeIds["+ i +"]"));
		}
		model.setPayTradeIds(payTradeIds);

		List<String> lmOrderList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreatePayUrlResponse.Model.LmOrderList.Length"); i++) {
			lmOrderList.add(_ctx.stringValue("CreatePayUrlResponse.Model.LmOrderList["+ i +"]"));
		}
		model.setLmOrderList(lmOrderList);
		createPayUrlResponse.setModel(model);
	 
	 	return createPayUrlResponse;
	}
}