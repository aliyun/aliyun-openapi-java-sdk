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

import com.aliyuncs.cro.model.v20200102.IdentifyAccountModifyRiskResponse;
import com.aliyuncs.cro.model.v20200102.IdentifyAccountModifyRiskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class IdentifyAccountModifyRiskResponseUnmarshaller {

	public static IdentifyAccountModifyRiskResponse unmarshall(IdentifyAccountModifyRiskResponse identifyAccountModifyRiskResponse, UnmarshallerContext _ctx) {
		
		identifyAccountModifyRiskResponse.setRequestId(_ctx.stringValue("IdentifyAccountModifyRiskResponse.RequestId"));
		identifyAccountModifyRiskResponse.setCode(_ctx.integerValue("IdentifyAccountModifyRiskResponse.Code"));
		identifyAccountModifyRiskResponse.setMessage(_ctx.stringValue("IdentifyAccountModifyRiskResponse.Message"));
		identifyAccountModifyRiskResponse.setSuccess(_ctx.booleanValue("IdentifyAccountModifyRiskResponse.Success"));

		Data data = new Data();
		data.setAsToken(_ctx.stringValue("IdentifyAccountModifyRiskResponse.Data.AsToken"));
		data.setSuggestion(_ctx.stringValue("IdentifyAccountModifyRiskResponse.Data.Suggestion"));
		identifyAccountModifyRiskResponse.setData(data);
	 
	 	return identifyAccountModifyRiskResponse;
	}
}