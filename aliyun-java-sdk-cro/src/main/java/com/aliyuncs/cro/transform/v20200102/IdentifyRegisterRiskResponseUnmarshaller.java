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

package com.aliyuncs.cro.transform.v20200102;

import com.aliyuncs.cro.model.v20200102.IdentifyRegisterRiskResponse;
import com.aliyuncs.cro.model.v20200102.IdentifyRegisterRiskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class IdentifyRegisterRiskResponseUnmarshaller {

	public static IdentifyRegisterRiskResponse unmarshall(IdentifyRegisterRiskResponse identifyRegisterRiskResponse, UnmarshallerContext _ctx) {
		
		identifyRegisterRiskResponse.setRequestId(_ctx.stringValue("IdentifyRegisterRiskResponse.RequestId"));
		identifyRegisterRiskResponse.setCode(_ctx.integerValue("IdentifyRegisterRiskResponse.Code"));
		identifyRegisterRiskResponse.setSuccess(_ctx.booleanValue("IdentifyRegisterRiskResponse.Success"));
		identifyRegisterRiskResponse.setMessage(_ctx.stringValue("IdentifyRegisterRiskResponse.Message"));

		Data data = new Data();
		data.setSuggestion(_ctx.stringValue("IdentifyRegisterRiskResponse.Data.Suggestion"));
		data.setAsToken(_ctx.stringValue("IdentifyRegisterRiskResponse.Data.AsToken"));
		identifyRegisterRiskResponse.setData(data);
	 
	 	return identifyRegisterRiskResponse;
	}
}