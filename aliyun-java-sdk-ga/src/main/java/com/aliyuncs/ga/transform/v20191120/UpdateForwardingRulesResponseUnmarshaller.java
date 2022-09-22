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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.UpdateForwardingRulesResponse;
import com.aliyuncs.ga.model.v20191120.UpdateForwardingRulesResponse.ForwardingRulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateForwardingRulesResponseUnmarshaller {

	public static UpdateForwardingRulesResponse unmarshall(UpdateForwardingRulesResponse updateForwardingRulesResponse, UnmarshallerContext _ctx) {
		
		updateForwardingRulesResponse.setRequestId(_ctx.stringValue("UpdateForwardingRulesResponse.RequestId"));

		List<ForwardingRulesItem> forwardingRules = new ArrayList<ForwardingRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateForwardingRulesResponse.ForwardingRules.Length"); i++) {
			ForwardingRulesItem forwardingRulesItem = new ForwardingRulesItem();
			forwardingRulesItem.setForwardingRuleId(_ctx.stringValue("UpdateForwardingRulesResponse.ForwardingRules["+ i +"].ForwardingRuleId"));

			forwardingRules.add(forwardingRulesItem);
		}
		updateForwardingRulesResponse.setForwardingRules(forwardingRules);
	 
	 	return updateForwardingRulesResponse;
	}
}