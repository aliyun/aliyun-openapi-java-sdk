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

package com.aliyuncs.cc5g.transform.v20220314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cc5g.model.v20220314.ListGroupAuthorizationRulesResponse;
import com.aliyuncs.cc5g.model.v20220314.ListGroupAuthorizationRulesResponse.GroupAuthorizationRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupAuthorizationRulesResponseUnmarshaller {

	public static ListGroupAuthorizationRulesResponse unmarshall(ListGroupAuthorizationRulesResponse listGroupAuthorizationRulesResponse, UnmarshallerContext _ctx) {
		
		listGroupAuthorizationRulesResponse.setRequestId(_ctx.stringValue("ListGroupAuthorizationRulesResponse.RequestId"));
		listGroupAuthorizationRulesResponse.setNextToken(_ctx.stringValue("ListGroupAuthorizationRulesResponse.NextToken"));
		listGroupAuthorizationRulesResponse.setMaxResults(_ctx.stringValue("ListGroupAuthorizationRulesResponse.MaxResults"));
		listGroupAuthorizationRulesResponse.setTotalCount(_ctx.stringValue("ListGroupAuthorizationRulesResponse.TotalCount"));

		List<GroupAuthorizationRule> groupAuthorizationRules = new ArrayList<GroupAuthorizationRule>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules.Length"); i++) {
			GroupAuthorizationRule groupAuthorizationRule = new GroupAuthorizationRule();
			groupAuthorizationRule.setAuthorizationRuleId(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].AuthorizationRuleId"));
			groupAuthorizationRule.setStatus(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].Status"));
			groupAuthorizationRule.setName(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].Name"));
			groupAuthorizationRule.setDescription(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].Description"));
			groupAuthorizationRule.setType(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].Type"));
			groupAuthorizationRule.setSourceCidr(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].SourceCidr"));
			groupAuthorizationRule.setDestinationType(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].DestinationType"));
			groupAuthorizationRule.setBizProtocol(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].Protocol"));
			groupAuthorizationRule.setDestinationPort(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].DestinationPort"));
			groupAuthorizationRule.setDestination(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].Destination"));
			groupAuthorizationRule.setPolicy(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].Policy"));
			groupAuthorizationRule.setDns(_ctx.booleanValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].Dns"));
			groupAuthorizationRule.setCreateTime(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].CreateTime"));

			groupAuthorizationRules.add(groupAuthorizationRule);
		}
		listGroupAuthorizationRulesResponse.setGroupAuthorizationRules(groupAuthorizationRules);
	 
	 	return listGroupAuthorizationRulesResponse;
	}
}