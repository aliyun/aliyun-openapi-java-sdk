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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeFirewallRulesResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeFirewallRulesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFirewallRulesResponseUnmarshaller {

	public static DescribeFirewallRulesResponse unmarshall(DescribeFirewallRulesResponse describeFirewallRulesResponse, UnmarshallerContext _ctx) {
		
		describeFirewallRulesResponse.setRequestId(_ctx.stringValue("DescribeFirewallRulesResponse.RequestId"));
		describeFirewallRulesResponse.setMessage(_ctx.stringValue("DescribeFirewallRulesResponse.Message"));
		describeFirewallRulesResponse.setSuccess(_ctx.booleanValue("DescribeFirewallRulesResponse.Success"));
		describeFirewallRulesResponse.setDBClusterId(_ctx.stringValue("DescribeFirewallRulesResponse.DBClusterId"));

		Data data = new Data();

		List<String> ruleList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFirewallRulesResponse.Data.RuleList.Length"); i++) {
			ruleList.add(_ctx.stringValue("DescribeFirewallRulesResponse.Data.RuleList["+ i +"]"));
		}
		data.setRuleList(ruleList);
		describeFirewallRulesResponse.setData(data);
	 
	 	return describeFirewallRulesResponse;
	}
}