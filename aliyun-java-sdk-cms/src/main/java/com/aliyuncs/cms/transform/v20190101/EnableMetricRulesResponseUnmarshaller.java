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

import com.aliyuncs.cms.model.v20190101.EnableMetricRulesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableMetricRulesResponseUnmarshaller {

	public static EnableMetricRulesResponse unmarshall(EnableMetricRulesResponse enableMetricRulesResponse, UnmarshallerContext context) {
		
		enableMetricRulesResponse.setRequestId(context.stringValue("EnableMetricRulesResponse.RequestId"));
		enableMetricRulesResponse.setSuccess(context.booleanValue("EnableMetricRulesResponse.Success"));
		enableMetricRulesResponse.setCode(context.stringValue("EnableMetricRulesResponse.Code"));
		enableMetricRulesResponse.setMessage(context.stringValue("EnableMetricRulesResponse.Message"));
	 
	 	return enableMetricRulesResponse;
	}
}