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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListRuleTargetAllResponse;
import com.aliyuncs.sas.model.v20181203.ListRuleTargetAllResponse.RuleTarget;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRuleTargetAllResponseUnmarshaller {

	public static ListRuleTargetAllResponse unmarshall(ListRuleTargetAllResponse listRuleTargetAllResponse, UnmarshallerContext _ctx) {
		
		listRuleTargetAllResponse.setRequestId(_ctx.stringValue("ListRuleTargetAllResponse.RequestId"));

		List<RuleTarget> ruleTargetList = new ArrayList<RuleTarget>();
		for (int i = 0; i < _ctx.lengthValue("ListRuleTargetAllResponse.RuleTargetList.Length"); i++) {
			RuleTarget ruleTarget = new RuleTarget();
			ruleTarget.setTargetId(_ctx.longValue("ListRuleTargetAllResponse.RuleTargetList["+ i +"].TargetId"));
			ruleTarget.setTargetName(_ctx.stringValue("ListRuleTargetAllResponse.RuleTargetList["+ i +"].TargetName"));
			ruleTarget.setTargetType(_ctx.stringValue("ListRuleTargetAllResponse.RuleTargetList["+ i +"].TargetType"));

			ruleTargetList.add(ruleTarget);
		}
		listRuleTargetAllResponse.setRuleTargetList(ruleTargetList);
	 
	 	return listRuleTargetAllResponse;
	}
}