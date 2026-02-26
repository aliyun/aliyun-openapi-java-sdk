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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetRuleNumLimitOfSLAResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRuleNumLimitOfSLAResponseUnmarshaller {

	public static GetRuleNumLimitOfSLAResponse unmarshall(GetRuleNumLimitOfSLAResponse getRuleNumLimitOfSLAResponse, UnmarshallerContext _ctx) {
		
		getRuleNumLimitOfSLAResponse.setRequestId(_ctx.stringValue("GetRuleNumLimitOfSLAResponse.RequestId"));
		getRuleNumLimitOfSLAResponse.setErrorCode(_ctx.stringValue("GetRuleNumLimitOfSLAResponse.ErrorCode"));
		getRuleNumLimitOfSLAResponse.setErrorMessage(_ctx.stringValue("GetRuleNumLimitOfSLAResponse.ErrorMessage"));
		getRuleNumLimitOfSLAResponse.setSuccess(_ctx.booleanValue("GetRuleNumLimitOfSLAResponse.Success"));
		getRuleNumLimitOfSLAResponse.setRuleNumLimit(_ctx.integerValue("GetRuleNumLimitOfSLAResponse.RuleNumLimit"));
	 
	 	return getRuleNumLimitOfSLAResponse;
	}
}