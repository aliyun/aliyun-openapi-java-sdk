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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.ApplyWsTokenResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ApplyWsTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyWsTokenResponseUnmarshaller {

	public static ApplyWsTokenResponse unmarshall(ApplyWsTokenResponse applyWsTokenResponse, UnmarshallerContext _ctx) {
		
		applyWsTokenResponse.setRequestId(_ctx.stringValue("ApplyWsTokenResponse.RequestId"));
		applyWsTokenResponse.setCode(_ctx.stringValue("ApplyWsTokenResponse.Code"));
		applyWsTokenResponse.setHttpStatusCode(_ctx.integerValue("ApplyWsTokenResponse.HttpStatusCode"));

		Data data = new Data();
		data.setSessionId(_ctx.stringValue("ApplyWsTokenResponse.Data.SessionId"));
		data.setToken(_ctx.stringValue("ApplyWsTokenResponse.Data.Token"));
		data.setWsEndpoint(_ctx.stringValue("ApplyWsTokenResponse.Data.WsEndpoint"));
		applyWsTokenResponse.setData(data);
	 
	 	return applyWsTokenResponse;
	}
}