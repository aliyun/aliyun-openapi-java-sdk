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

import com.aliyuncs.iotcc.model.v20210513.ListGroupIpMappingRulesResponse;
import com.aliyuncs.iotcc.model.v20210513.ListGroupIpMappingRulesResponse.GroupIpMappingRuleModels;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupIpMappingRulesResponseUnmarshaller {

	public static ListGroupIpMappingRulesResponse unmarshall(ListGroupIpMappingRulesResponse listGroupIpMappingRulesResponse, UnmarshallerContext _ctx) {
		
		listGroupIpMappingRulesResponse.setRequestId(_ctx.stringValue("ListGroupIpMappingRulesResponse.RequestId"));
		listGroupIpMappingRulesResponse.setTotalCount(_ctx.integerValue("ListGroupIpMappingRulesResponse.TotalCount"));
		listGroupIpMappingRulesResponse.setNextToken(_ctx.stringValue("ListGroupIpMappingRulesResponse.NextToken"));
		listGroupIpMappingRulesResponse.setMaxResults(_ctx.integerValue("ListGroupIpMappingRulesResponse.MaxResults"));

		List<GroupIpMappingRuleModels> ipMappingRules = new ArrayList<GroupIpMappingRuleModels>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupIpMappingRulesResponse.IpMappingRules.Length"); i++) {
			GroupIpMappingRuleModels groupIpMappingRuleModels = new GroupIpMappingRuleModels();
			groupIpMappingRuleModels.setIoTCloudConnectorGroupId(_ctx.stringValue("ListGroupIpMappingRulesResponse.IpMappingRules["+ i +"].IoTCloudConnectorGroupId"));
			groupIpMappingRuleModels.setIpMappingRuleStatus(_ctx.stringValue("ListGroupIpMappingRulesResponse.IpMappingRules["+ i +"].IpMappingRuleStatus"));
			groupIpMappingRuleModels.setMappingIp(_ctx.stringValue("ListGroupIpMappingRulesResponse.IpMappingRules["+ i +"].MappingIp"));
			groupIpMappingRuleModels.setDestinationIp(_ctx.stringValue("ListGroupIpMappingRulesResponse.IpMappingRules["+ i +"].DestinationIp"));
			groupIpMappingRuleModels.setIpMappingRuleName(_ctx.stringValue("ListGroupIpMappingRulesResponse.IpMappingRules["+ i +"].IpMappingRuleName"));
			groupIpMappingRuleModels.setIpMappingRuleDescription(_ctx.stringValue("ListGroupIpMappingRulesResponse.IpMappingRules["+ i +"].IpMappingRuleDescription"));
			groupIpMappingRuleModels.setIpMappingRuleId(_ctx.stringValue("ListGroupIpMappingRulesResponse.IpMappingRules["+ i +"].IpMappingRuleId"));

			ipMappingRules.add(groupIpMappingRuleModels);
		}
		listGroupIpMappingRulesResponse.setIpMappingRules(ipMappingRules);
	 
	 	return listGroupIpMappingRulesResponse;
	}
}