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

package com.aliyuncs.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20200101.DescribeJobMonitorRuleResponse;
import com.aliyuncs.dts.model.v20200101.DescribeJobMonitorRuleResponse.MonitorRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobMonitorRuleResponseUnmarshaller {

	public static DescribeJobMonitorRuleResponse unmarshall(DescribeJobMonitorRuleResponse describeJobMonitorRuleResponse, UnmarshallerContext _ctx) {
		
		describeJobMonitorRuleResponse.setRequestId(_ctx.stringValue("DescribeJobMonitorRuleResponse.RequestId"));
		describeJobMonitorRuleResponse.setCode(_ctx.stringValue("DescribeJobMonitorRuleResponse.Code"));
		describeJobMonitorRuleResponse.setDtsJobId(_ctx.stringValue("DescribeJobMonitorRuleResponse.DtsJobId"));
		describeJobMonitorRuleResponse.setDynamicMessage(_ctx.stringValue("DescribeJobMonitorRuleResponse.DynamicMessage"));
		describeJobMonitorRuleResponse.setErrCode(_ctx.stringValue("DescribeJobMonitorRuleResponse.ErrCode"));
		describeJobMonitorRuleResponse.setErrMessage(_ctx.stringValue("DescribeJobMonitorRuleResponse.ErrMessage"));
		describeJobMonitorRuleResponse.setHttpStatusCode(_ctx.integerValue("DescribeJobMonitorRuleResponse.HttpStatusCode"));
		describeJobMonitorRuleResponse.setSuccess(_ctx.booleanValue("DescribeJobMonitorRuleResponse.Success"));

		List<MonitorRule> monitorRules = new ArrayList<MonitorRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobMonitorRuleResponse.MonitorRules.Length"); i++) {
			MonitorRule monitorRule = new MonitorRule();
			monitorRule.setPhone(_ctx.stringValue("DescribeJobMonitorRuleResponse.MonitorRules["+ i +"].Phone"));
			monitorRule.setDelayRuleTime(_ctx.longValue("DescribeJobMonitorRuleResponse.MonitorRules["+ i +"].DelayRuleTime"));
			monitorRule.setState(_ctx.stringValue("DescribeJobMonitorRuleResponse.MonitorRules["+ i +"].State"));
			monitorRule.setType(_ctx.stringValue("DescribeJobMonitorRuleResponse.MonitorRules["+ i +"].Type"));

			monitorRules.add(monitorRule);
		}
		describeJobMonitorRuleResponse.setMonitorRules(monitorRules);
	 
	 	return describeJobMonitorRuleResponse;
	}
}