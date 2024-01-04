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

package com.aliyuncs.dypnsapi.transform.v20170525;

import com.aliyuncs.dypnsapi.model.v20170525.JyCreateVerifySchemeResponse;
import com.aliyuncs.dypnsapi.model.v20170525.JyCreateVerifySchemeResponse.GateVerifySchemeData;
import com.aliyuncs.transform.UnmarshallerContext;


public class JyCreateVerifySchemeResponseUnmarshaller {

	public static JyCreateVerifySchemeResponse unmarshall(JyCreateVerifySchemeResponse jyCreateVerifySchemeResponse, UnmarshallerContext _ctx) {
		
		jyCreateVerifySchemeResponse.setRequestId(_ctx.stringValue("JyCreateVerifySchemeResponse.RequestId"));
		jyCreateVerifySchemeResponse.setCode(_ctx.stringValue("JyCreateVerifySchemeResponse.Code"));
		jyCreateVerifySchemeResponse.setMessage(_ctx.stringValue("JyCreateVerifySchemeResponse.Message"));

		GateVerifySchemeData gateVerifySchemeData = new GateVerifySchemeData();
		gateVerifySchemeData.setSchemeCode(_ctx.stringValue("JyCreateVerifySchemeResponse.GateVerifySchemeData.SchemeCode"));
		jyCreateVerifySchemeResponse.setGateVerifySchemeData(gateVerifySchemeData);
	 
	 	return jyCreateVerifySchemeResponse;
	}
}