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

import com.aliyuncs.cc5g.model.v20220314.ListAuthorizationRulesResponse;
import com.aliyuncs.cc5g.model.v20220314.ListAuthorizationRulesResponse.AuthorizationRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAuthorizationRulesResponseUnmarshaller {

	public static ListAuthorizationRulesResponse unmarshall(ListAuthorizationRulesResponse listAuthorizationRulesResponse, UnmarshallerContext _ctx) {
		
		listAuthorizationRulesResponse.setRequestId(_ctx.stringValue("ListAuthorizationRulesResponse.RequestId"));
		listAuthorizationRulesResponse.setNextToken(_ctx.stringValue("ListAuthorizationRulesResponse.NextToken"));
		listAuthorizationRulesResponse.setMaxResults(_ctx.stringValue("ListAuthorizationRulesResponse.MaxResults"));
		listAuthorizationRulesResponse.setTotalCount(_ctx.stringValue("ListAuthorizationRulesResponse.TotalCount"));

		List<AuthorizationRule> authorizationRules = new ArrayList<AuthorizationRule>();
		for (int i = 0; i < _ctx.lengthValue("ListAuthorizationRulesResponse.AuthorizationRules.Length"); i++) {
			AuthorizationRule authorizationRule = new AuthorizationRule();
			authorizationRule.setAuthorizationRuleId(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].AuthorizationRuleId"));
			authorizationRule.setStatus(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].Status"));
			authorizationRule.setName(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].Name"));
			authorizationRule.setDescription(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].Description"));
			authorizationRule.setType(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].Type"));
			authorizationRule.setSourceCidr(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].SourceCidr"));
			authorizationRule.setDestinationType(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].DestinationType"));
			authorizationRule.setDestination(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].Destination"));
			authorizationRule.setPolicy(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].Policy"));
			authorizationRule.setDns(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].Dns"));
			authorizationRule.setCreateTime(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].CreateTime"));

			authorizationRules.add(authorizationRule);
		}
		listAuthorizationRulesResponse.setAuthorizationRules(authorizationRules);
	 
	 	return listAuthorizationRulesResponse;
	}
}