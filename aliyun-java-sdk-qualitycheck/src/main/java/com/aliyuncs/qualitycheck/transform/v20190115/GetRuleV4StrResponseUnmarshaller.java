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

import com.aliyuncs.qualitycheck.model.v20190115.GetRuleV4StrResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRuleV4StrResponseUnmarshaller {

	public static GetRuleV4StrResponse unmarshall(GetRuleV4StrResponse getRuleV4StrResponse, UnmarshallerContext _ctx) {
		
		getRuleV4StrResponse.setRequestId(_ctx.stringValue("GetRuleV4StrResponse.RequestId"));
		getRuleV4StrResponse.setData(_ctx.stringValue("GetRuleV4StrResponse.Data"));
		getRuleV4StrResponse.setSuccess(_ctx.booleanValue("GetRuleV4StrResponse.Success"));
		getRuleV4StrResponse.setCode(_ctx.stringValue("GetRuleV4StrResponse.Code"));
		getRuleV4StrResponse.setMessage(_ctx.stringValue("GetRuleV4StrResponse.Message"));
		getRuleV4StrResponse.setHttpStatusCode(_ctx.integerValue("GetRuleV4StrResponse.HttpStatusCode"));
	 
	 	return getRuleV4StrResponse;
	}
}