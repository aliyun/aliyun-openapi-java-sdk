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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListCSBGatewayResponse;
import com.aliyuncs.edas.model.v20170801.ListCSBGatewayResponse.FindGatewaysResponseBodyData;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCSBGatewayResponseUnmarshaller {

	public static ListCSBGatewayResponse unmarshall(ListCSBGatewayResponse listCSBGatewayResponse, UnmarshallerContext _ctx) {
		
		listCSBGatewayResponse.setRequestId(_ctx.stringValue("ListCSBGatewayResponse.RequestId"));
		listCSBGatewayResponse.setCode(_ctx.integerValue("ListCSBGatewayResponse.Code"));
		listCSBGatewayResponse.setMessage(_ctx.stringValue("ListCSBGatewayResponse.Message"));

		List<FindGatewaysResponseBodyData> data = new ArrayList<FindGatewaysResponseBodyData>();
		for (int i = 0; i < _ctx.lengthValue("ListCSBGatewayResponse.Data.Length"); i++) {
			FindGatewaysResponseBodyData findGatewaysResponseBodyData = new FindGatewaysResponseBodyData();
			findGatewaysResponseBodyData.setId(_ctx.longValue("ListCSBGatewayResponse.Data["+ i +"].Id"));
			findGatewaysResponseBodyData.setName(_ctx.stringValue("ListCSBGatewayResponse.Data["+ i +"].Name"));
			findGatewaysResponseBodyData.setGatewayType(_ctx.stringValue("ListCSBGatewayResponse.Data["+ i +"].GatewayType"));

			data.add(findGatewaysResponseBodyData);
		}
		listCSBGatewayResponse.setData(data);
	 
	 	return listCSBGatewayResponse;
	}
}