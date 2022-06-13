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

import com.aliyuncs.iotcc.model.v20210513.ListGroupAuthorizationRulesResponse;
import com.aliyuncs.iotcc.model.v20210513.ListGroupAuthorizationRulesResponse.GroupAuthorizationRuleModels;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupAuthorizationRulesResponseUnmarshaller {

	public static ListGroupAuthorizationRulesResponse unmarshall(ListGroupAuthorizationRulesResponse listGroupAuthorizationRulesResponse, UnmarshallerContext _ctx) {
		
		listGroupAuthorizationRulesResponse.setRequestId(_ctx.stringValue("ListGroupAuthorizationRulesResponse.RequestId"));
		listGroupAuthorizationRulesResponse.setTotalCount(_ctx.integerValue("ListGroupAuthorizationRulesResponse.TotalCount"));
		listGroupAuthorizationRulesResponse.setNextToken(_ctx.stringValue("ListGroupAuthorizationRulesResponse.NextToken"));
		listGroupAuthorizationRulesResponse.setMaxResults(_ctx.integerValue("ListGroupAuthorizationRulesResponse.MaxResults"));

		List<GroupAuthorizationRuleModels> groupAuthorizationRules = new ArrayList<GroupAuthorizationRuleModels>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules.Length"); i++) {
			GroupAuthorizationRuleModels groupAuthorizationRuleModels = new GroupAuthorizationRuleModels();
			groupAuthorizationRuleModels.setIoTCloudConnectorGroupId(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].IoTCloudConnectorGroupId"));
			groupAuthorizationRuleModels.setPolicy(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].Policy"));
			groupAuthorizationRuleModels.setAuthorizationRuleStatus(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].AuthorizationRuleStatus"));
			groupAuthorizationRuleModels.setDestinationType(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].DestinationType"));
			groupAuthorizationRuleModels.setDestination(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].Destination"));
			groupAuthorizationRuleModels.setAuthorizationRuleName(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].AuthorizationRuleName"));
			groupAuthorizationRuleModels.setAuthorizationRuleDescription(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].AuthorizationRuleDescription"));
			groupAuthorizationRuleModels.setAuthorizationRuleId(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].AuthorizationRuleId"));
			groupAuthorizationRuleModels.setType(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].Type"));

			List<String> sourceCidrs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].SourceCidrs.Length"); j++) {
				sourceCidrs.add(_ctx.stringValue("ListGroupAuthorizationRulesResponse.GroupAuthorizationRules["+ i +"].SourceCidrs["+ j +"]"));
			}
			groupAuthorizationRuleModels.setSourceCidrs(sourceCidrs);

			groupAuthorizationRules.add(groupAuthorizationRuleModels);
		}
		listGroupAuthorizationRulesResponse.setGroupAuthorizationRules(groupAuthorizationRules);
	 
	 	return listGroupAuthorizationRulesResponse;
	}
}