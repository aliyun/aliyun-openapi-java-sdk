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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.PickOutboundNumbersResponse;
import com.aliyuncs.ccc.model.v20200701.PickOutboundNumbersResponse.NumberPair;
import com.aliyuncs.ccc.model.v20200701.PickOutboundNumbersResponse.NumberPair.Callee;
import com.aliyuncs.ccc.model.v20200701.PickOutboundNumbersResponse.NumberPair.Caller;
import com.aliyuncs.transform.UnmarshallerContext;


public class PickOutboundNumbersResponseUnmarshaller {

	public static PickOutboundNumbersResponse unmarshall(PickOutboundNumbersResponse pickOutboundNumbersResponse, UnmarshallerContext _ctx) {
		
		pickOutboundNumbersResponse.setRequestId(_ctx.stringValue("PickOutboundNumbersResponse.RequestId"));
		pickOutboundNumbersResponse.setCode(_ctx.stringValue("PickOutboundNumbersResponse.Code"));
		pickOutboundNumbersResponse.setHttpStatusCode(_ctx.integerValue("PickOutboundNumbersResponse.HttpStatusCode"));
		pickOutboundNumbersResponse.setMessage(_ctx.stringValue("PickOutboundNumbersResponse.Message"));

		List<NumberPair> data = new ArrayList<NumberPair>();
		for (int i = 0; i < _ctx.lengthValue("PickOutboundNumbersResponse.Data.Length"); i++) {
			NumberPair numberPair = new NumberPair();

			Callee callee = new Callee();
			callee.setCity(_ctx.stringValue("PickOutboundNumbersResponse.Data["+ i +"].Callee.City"));
			callee.setNumber(_ctx.stringValue("PickOutboundNumbersResponse.Data["+ i +"].Callee.Number"));
			callee.setProvince(_ctx.stringValue("PickOutboundNumbersResponse.Data["+ i +"].Callee.Province"));
			numberPair.setCallee(callee);

			Caller caller = new Caller();
			caller.setCity(_ctx.stringValue("PickOutboundNumbersResponse.Data["+ i +"].Caller.City"));
			caller.setNumber(_ctx.stringValue("PickOutboundNumbersResponse.Data["+ i +"].Caller.Number"));
			caller.setProvince(_ctx.stringValue("PickOutboundNumbersResponse.Data["+ i +"].Caller.Province"));
			numberPair.setCaller(caller);

			data.add(numberPair);
		}
		pickOutboundNumbersResponse.setData(data);
	 
	 	return pickOutboundNumbersResponse;
	}
}