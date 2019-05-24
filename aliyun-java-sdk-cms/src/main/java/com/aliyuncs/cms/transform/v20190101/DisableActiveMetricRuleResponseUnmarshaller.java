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

package com.aliyuncs.cms.transform.v20190101;

import com.aliyuncs.cms.model.v20190101.DisableActiveMetricRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableActiveMetricRuleResponseUnmarshaller {

	public static DisableActiveMetricRuleResponse unmarshall(DisableActiveMetricRuleResponse disableActiveMetricRuleResponse, UnmarshallerContext context) {
		
		disableActiveMetricRuleResponse.setRequestId(context.stringValue("DisableActiveMetricRuleResponse.RequestId"));
		disableActiveMetricRuleResponse.setSuccess(context.booleanValue("DisableActiveMetricRuleResponse.Success"));
		disableActiveMetricRuleResponse.setCode(context.stringValue("DisableActiveMetricRuleResponse.Code"));
		disableActiveMetricRuleResponse.setMessage(context.stringValue("DisableActiveMetricRuleResponse.Message"));
	 
	 	return disableActiveMetricRuleResponse;
	}
}