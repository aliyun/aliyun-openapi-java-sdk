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

import com.aliyuncs.cro.model.v20200102.IdentifyLoginRiskResponse;
import com.aliyuncs.cro.model.v20200102.IdentifyLoginRiskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class IdentifyLoginRiskResponseUnmarshaller {

	public static IdentifyLoginRiskResponse unmarshall(IdentifyLoginRiskResponse identifyLoginRiskResponse, UnmarshallerContext _ctx) {
		
		identifyLoginRiskResponse.setRequestId(_ctx.stringValue("IdentifyLoginRiskResponse.RequestId"));
		identifyLoginRiskResponse.setCode(_ctx.integerValue("IdentifyLoginRiskResponse.Code"));
		identifyLoginRiskResponse.setSuccess(_ctx.booleanValue("IdentifyLoginRiskResponse.Success"));
		identifyLoginRiskResponse.setMessage(_ctx.stringValue("IdentifyLoginRiskResponse.Message"));

		Data data = new Data();
		data.setSuggestion(_ctx.stringValue("IdentifyLoginRiskResponse.Data.Suggestion"));
		data.setAsToken(_ctx.stringValue("IdentifyLoginRiskResponse.Data.AsToken"));
		identifyLoginRiskResponse.setData(data);
	 
	 	return identifyLoginRiskResponse;
	}
}