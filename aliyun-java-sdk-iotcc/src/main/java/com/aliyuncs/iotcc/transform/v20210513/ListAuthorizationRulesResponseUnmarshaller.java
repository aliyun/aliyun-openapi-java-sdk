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

package com.aliyuncs.iotcc.transform.v20210513;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotcc.model.v20210513.ListAuthorizationRulesResponse;
import com.aliyuncs.iotcc.model.v20210513.ListAuthorizationRulesResponse.AuthorizationRuleModels;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAuthorizationRulesResponseUnmarshaller {

	public static ListAuthorizationRulesResponse unmarshall(ListAuthorizationRulesResponse listAuthorizationRulesResponse, UnmarshallerContext _ctx) {
		
		listAuthorizationRulesResponse.setRequestId(_ctx.stringValue("ListAuthorizationRulesResponse.RequestId"));
		listAuthorizationRulesResponse.setTotalCount(_ctx.integerValue("ListAuthorizationRulesResponse.TotalCount"));
		listAuthorizationRulesResponse.setNextToken(_ctx.stringValue("ListAuthorizationRulesResponse.NextToken"));
		listAuthorizationRulesResponse.setMaxResults(_ctx.integerValue("ListAuthorizationRulesResponse.MaxResults"));

		List<AuthorizationRuleModels> authorizationRules = new ArrayList<AuthorizationRuleModels>();
		for (int i = 0; i < _ctx.lengthValue("ListAuthorizationRulesResponse.AuthorizationRules.Length"); i++) {
			AuthorizationRuleModels authorizationRuleModels = new AuthorizationRuleModels();
			authorizationRuleModels.setIoTCloudConnectorId(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].IoTCloudConnectorId"));
			authorizationRuleModels.setPolicy(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].Policy"));
			authorizationRuleModels.setAuthorizationRuleStatus(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].AuthorizationRuleStatus"));
			authorizationRuleModels.setDestinationType(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].DestinationType"));
			authorizationRuleModels.setDestination(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].Destination"));
			authorizationRuleModels.setAuthorizationRuleName(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].AuthorizationRuleName"));
			authorizationRuleModels.setAuthorizationRuleDescription(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].AuthorizationRuleDescription"));
			authorizationRuleModels.setAuthorizationRuleId(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].AuthorizationRuleId"));

			List<String> sourceCidrs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].SourceCidrs.Length"); j++) {
				sourceCidrs.add(_ctx.stringValue("ListAuthorizationRulesResponse.AuthorizationRules["+ i +"].SourceCidrs["+ j +"]"));
			}
			authorizationRuleModels.setSourceCidrs(sourceCidrs);

			authorizationRules.add(authorizationRuleModels);
		}
		listAuthorizationRulesResponse.setAuthorizationRules(authorizationRules);
	 
	 	return listAuthorizationRulesResponse;
	}
}