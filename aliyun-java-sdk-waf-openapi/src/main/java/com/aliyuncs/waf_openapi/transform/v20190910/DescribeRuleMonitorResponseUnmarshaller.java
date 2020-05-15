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

package com.aliyuncs.waf_openapi.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.waf_openapi.model.v20190910.DescribeRuleMonitorResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeRuleMonitorResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRuleMonitorResponseUnmarshaller {

	public static DescribeRuleMonitorResponse unmarshall(DescribeRuleMonitorResponse describeRuleMonitorResponse, UnmarshallerContext _ctx) {
		
		describeRuleMonitorResponse.setRequestId(_ctx.stringValue("DescribeRuleMonitorResponse.RequestId"));
		describeRuleMonitorResponse.setTotalCount(_ctx.integerValue("DescribeRuleMonitorResponse.TotalCount"));

		List<Item> ruleMonitors = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRuleMonitorResponse.RuleMonitors.Length"); i++) {
			Item item = new Item();
			item.setAntibotType(_ctx.stringValue("DescribeRuleMonitorResponse.RuleMonitors["+ i +"].AntibotType"));
			item.setPv(_ctx.longValue("DescribeRuleMonitorResponse.RuleMonitors["+ i +"].Pv"));
			item.setRuleId(_ctx.stringValue("DescribeRuleMonitorResponse.RuleMonitors["+ i +"].RuleId"));
			item.setIndex(_ctx.longValue("DescribeRuleMonitorResponse.RuleMonitors["+ i +"].Index"));
			item.setDomain(_ctx.stringValue("DescribeRuleMonitorResponse.RuleMonitors["+ i +"].Domain"));
			item.setAntibotWatch(_ctx.stringValue("DescribeRuleMonitorResponse.RuleMonitors["+ i +"].AntibotWatch"));

			ruleMonitors.add(item);
		}
		describeRuleMonitorResponse.setRuleMonitors(ruleMonitors);
	 
	 	return describeRuleMonitorResponse;
	}
}