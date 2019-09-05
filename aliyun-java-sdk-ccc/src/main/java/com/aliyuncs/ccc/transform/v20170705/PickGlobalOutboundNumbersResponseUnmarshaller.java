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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.PickGlobalOutboundNumbersResponse;
import com.aliyuncs.ccc.model.v20170705.PickGlobalOutboundNumbersResponse.DialNumberPair;
import com.aliyuncs.ccc.model.v20170705.PickGlobalOutboundNumbersResponse.DialNumberPair.Callee;
import com.aliyuncs.ccc.model.v20170705.PickGlobalOutboundNumbersResponse.DialNumberPair.Caller;
import com.aliyuncs.transform.UnmarshallerContext;


public class PickGlobalOutboundNumbersResponseUnmarshaller {

	public static PickGlobalOutboundNumbersResponse unmarshall(PickGlobalOutboundNumbersResponse pickGlobalOutboundNumbersResponse, UnmarshallerContext _ctx) {
		
		pickGlobalOutboundNumbersResponse.setRequestId(_ctx.stringValue("PickGlobalOutboundNumbersResponse.RequestId"));
		pickGlobalOutboundNumbersResponse.setSuccess(_ctx.booleanValue("PickGlobalOutboundNumbersResponse.Success"));
		pickGlobalOutboundNumbersResponse.setCode(_ctx.stringValue("PickGlobalOutboundNumbersResponse.Code"));
		pickGlobalOutboundNumbersResponse.setMessage(_ctx.stringValue("PickGlobalOutboundNumbersResponse.Message"));
		pickGlobalOutboundNumbersResponse.setHttpStatusCode(_ctx.integerValue("PickGlobalOutboundNumbersResponse.HttpStatusCode"));

		List<DialNumberPair> dialNumberPairs = new ArrayList<DialNumberPair>();
		for (int i = 0; i < _ctx.lengthValue("PickGlobalOutboundNumbersResponse.DialNumberPairs.Length"); i++) {
			DialNumberPair dialNumberPair = new DialNumberPair();

			Callee callee = new Callee();
			callee.setNumber(_ctx.stringValue("PickGlobalOutboundNumbersResponse.DialNumberPairs["+ i +"].Callee.Number"));
			callee.setProvince(_ctx.stringValue("PickGlobalOutboundNumbersResponse.DialNumberPairs["+ i +"].Callee.Province"));
			callee.setCity(_ctx.stringValue("PickGlobalOutboundNumbersResponse.DialNumberPairs["+ i +"].Callee.City"));
			dialNumberPair.setCallee(callee);

			Caller caller = new Caller();
			caller.setNumber(_ctx.stringValue("PickGlobalOutboundNumbersResponse.DialNumberPairs["+ i +"].Caller.Number"));
			caller.setProvince(_ctx.stringValue("PickGlobalOutboundNumbersResponse.DialNumberPairs["+ i +"].Caller.Province"));
			caller.setCity(_ctx.stringValue("PickGlobalOutboundNumbersResponse.DialNumberPairs["+ i +"].Caller.City"));
			dialNumberPair.setCaller(caller);

			dialNumberPairs.add(dialNumberPair);
		}
		pickGlobalOutboundNumbersResponse.setDialNumberPairs(dialNumberPairs);
	 
	 	return pickGlobalOutboundNumbersResponse;
	}
}