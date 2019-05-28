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

import com.aliyuncs.ccc.model.v20170705.PickOutboundNumbersByTagsResponse;
import com.aliyuncs.ccc.model.v20170705.PickOutboundNumbersByTagsResponse.DialNumberPair;
import com.aliyuncs.ccc.model.v20170705.PickOutboundNumbersByTagsResponse.DialNumberPair.Callee;
import com.aliyuncs.ccc.model.v20170705.PickOutboundNumbersByTagsResponse.DialNumberPair.Caller;
import com.aliyuncs.transform.UnmarshallerContext;


public class PickOutboundNumbersByTagsResponseUnmarshaller {

	public static PickOutboundNumbersByTagsResponse unmarshall(PickOutboundNumbersByTagsResponse pickOutboundNumbersByTagsResponse, UnmarshallerContext context) {
		
		pickOutboundNumbersByTagsResponse.setRequestId(context.stringValue("PickOutboundNumbersByTagsResponse.RequestId"));
		pickOutboundNumbersByTagsResponse.setSuccess(context.booleanValue("PickOutboundNumbersByTagsResponse.Success"));
		pickOutboundNumbersByTagsResponse.setCode(context.stringValue("PickOutboundNumbersByTagsResponse.Code"));
		pickOutboundNumbersByTagsResponse.setMessage(context.stringValue("PickOutboundNumbersByTagsResponse.Message"));
		pickOutboundNumbersByTagsResponse.setHttpStatusCode(context.integerValue("PickOutboundNumbersByTagsResponse.HttpStatusCode"));

		List<DialNumberPair> dialNumberPairs = new ArrayList<DialNumberPair>();
		for (int i = 0; i < context.lengthValue("PickOutboundNumbersByTagsResponse.DialNumberPairs.Length"); i++) {
			DialNumberPair dialNumberPair = new DialNumberPair();

			Callee callee = new Callee();
			callee.setNumber(context.stringValue("PickOutboundNumbersByTagsResponse.DialNumberPairs["+ i +"].Callee.Number"));
			callee.setProvince(context.stringValue("PickOutboundNumbersByTagsResponse.DialNumberPairs["+ i +"].Callee.Province"));
			callee.setCity(context.stringValue("PickOutboundNumbersByTagsResponse.DialNumberPairs["+ i +"].Callee.City"));
			dialNumberPair.setCallee(callee);

			Caller caller = new Caller();
			caller.setNumber(context.stringValue("PickOutboundNumbersByTagsResponse.DialNumberPairs["+ i +"].Caller.Number"));
			caller.setProvince(context.stringValue("PickOutboundNumbersByTagsResponse.DialNumberPairs["+ i +"].Caller.Province"));
			caller.setCity(context.stringValue("PickOutboundNumbersByTagsResponse.DialNumberPairs["+ i +"].Caller.City"));
			dialNumberPair.setCaller(caller);

			dialNumberPairs.add(dialNumberPair);
		}
		pickOutboundNumbersByTagsResponse.setDialNumberPairs(dialNumberPairs);
	 
	 	return pickOutboundNumbersByTagsResponse;
	}
}