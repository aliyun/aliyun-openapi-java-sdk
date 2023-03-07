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

import com.aliyuncs.iotcc.model.v20210513.ListIpMappingRulesResponse;
import com.aliyuncs.iotcc.model.v20210513.ListIpMappingRulesResponse.IpMappingRuleModels;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIpMappingRulesResponseUnmarshaller {

	public static ListIpMappingRulesResponse unmarshall(ListIpMappingRulesResponse listIpMappingRulesResponse, UnmarshallerContext _ctx) {
		
		listIpMappingRulesResponse.setRequestId(_ctx.stringValue("ListIpMappingRulesResponse.RequestId"));
		listIpMappingRulesResponse.setTotalCount(_ctx.integerValue("ListIpMappingRulesResponse.TotalCount"));
		listIpMappingRulesResponse.setNextToken(_ctx.stringValue("ListIpMappingRulesResponse.NextToken"));
		listIpMappingRulesResponse.setMaxResults(_ctx.integerValue("ListIpMappingRulesResponse.MaxResults"));

		List<IpMappingRuleModels> ipMappingRules = new ArrayList<IpMappingRuleModels>();
		for (int i = 0; i < _ctx.lengthValue("ListIpMappingRulesResponse.IpMappingRules.Length"); i++) {
			IpMappingRuleModels ipMappingRuleModels = new IpMappingRuleModels();
			ipMappingRuleModels.setIoTCloudConnectorId(_ctx.stringValue("ListIpMappingRulesResponse.IpMappingRules["+ i +"].IoTCloudConnectorId"));
			ipMappingRuleModels.setIpMappingRuleId(_ctx.stringValue("ListIpMappingRulesResponse.IpMappingRules["+ i +"].IpMappingRuleId"));
			ipMappingRuleModels.setIpMappingRuleStatus(_ctx.stringValue("ListIpMappingRulesResponse.IpMappingRules["+ i +"].IpMappingRuleStatus"));
			ipMappingRuleModels.setMappingIp(_ctx.stringValue("ListIpMappingRulesResponse.IpMappingRules["+ i +"].MappingIp"));
			ipMappingRuleModels.setDestinationIp(_ctx.stringValue("ListIpMappingRulesResponse.IpMappingRules["+ i +"].DestinationIp"));
			ipMappingRuleModels.setIpMappingRuleName(_ctx.stringValue("ListIpMappingRulesResponse.IpMappingRules["+ i +"].IpMappingRuleName"));
			ipMappingRuleModels.setIpMappingRuleDescription(_ctx.stringValue("ListIpMappingRulesResponse.IpMappingRules["+ i +"].IpMappingRuleDescription"));

			ipMappingRules.add(ipMappingRuleModels);
		}
		listIpMappingRulesResponse.setIpMappingRules(ipMappingRules);
	 
	 	return listIpMappingRulesResponse;
	}
}