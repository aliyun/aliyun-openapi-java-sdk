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

package com.aliyuncs.resourcemanager.transform.v20200331;

import com.aliyuncs.resourcemanager.model.v20200331.CreateAutoGroupingRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAutoGroupingRuleResponseUnmarshaller {

	public static CreateAutoGroupingRuleResponse unmarshall(CreateAutoGroupingRuleResponse createAutoGroupingRuleResponse, UnmarshallerContext _ctx) {
		
		createAutoGroupingRuleResponse.setRequestId(_ctx.stringValue("CreateAutoGroupingRuleResponse.RequestId"));
		createAutoGroupingRuleResponse.setRuleId(_ctx.stringValue("CreateAutoGroupingRuleResponse.RuleId"));
	 
	 	return createAutoGroupingRuleResponse;
	}
}