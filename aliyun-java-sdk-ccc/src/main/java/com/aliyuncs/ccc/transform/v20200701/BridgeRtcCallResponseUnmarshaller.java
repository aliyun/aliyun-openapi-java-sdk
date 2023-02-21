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

import com.aliyuncs.ccc.model.v20200701.BridgeRtcCallResponse;
import com.aliyuncs.ccc.model.v20200701.BridgeRtcCallResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BridgeRtcCallResponseUnmarshaller {

	public static BridgeRtcCallResponse unmarshall(BridgeRtcCallResponse bridgeRtcCallResponse, UnmarshallerContext _ctx) {
		
		bridgeRtcCallResponse.setRequestId(_ctx.stringValue("BridgeRtcCallResponse.RequestId"));
		bridgeRtcCallResponse.setCode(_ctx.stringValue("BridgeRtcCallResponse.Code"));
		bridgeRtcCallResponse.setHttpStatusCode(_ctx.integerValue("BridgeRtcCallResponse.HttpStatusCode"));
		bridgeRtcCallResponse.setMessage(_ctx.stringValue("BridgeRtcCallResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BridgeRtcCallResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("BridgeRtcCallResponse.Params["+ i +"]"));
		}
		bridgeRtcCallResponse.setParams(params);

		Data data = new Data();
		data.setInstanceId(_ctx.longValue("BridgeRtcCallResponse.Data.InstanceId"));
		data.setJobId(_ctx.stringValue("BridgeRtcCallResponse.Data.JobId"));
		data.setTokenInfo(_ctx.stringValue("BridgeRtcCallResponse.Data.TokenInfo"));
		bridgeRtcCallResponse.setData(data);
	 
	 	return bridgeRtcCallResponse;
	}
}