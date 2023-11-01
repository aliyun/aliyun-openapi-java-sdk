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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeCustomizeRuleResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeCustomizeRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomizeRuleResponseUnmarshaller {

	public static DescribeCustomizeRuleResponse unmarshall(DescribeCustomizeRuleResponse describeCustomizeRuleResponse, UnmarshallerContext _ctx) {
		
		describeCustomizeRuleResponse.setRequestId(_ctx.stringValue("DescribeCustomizeRuleResponse.RequestId"));
		describeCustomizeRuleResponse.setSuccess(_ctx.booleanValue("DescribeCustomizeRuleResponse.Success"));
		describeCustomizeRuleResponse.setCode(_ctx.integerValue("DescribeCustomizeRuleResponse.Code"));
		describeCustomizeRuleResponse.setMessage(_ctx.stringValue("DescribeCustomizeRuleResponse.Message"));

		Data data = new Data();
		data.setId(_ctx.longValue("DescribeCustomizeRuleResponse.Data.Id"));
		data.setGmtCreate(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.GmtModified"));
		data.setAliuid(_ctx.longValue("DescribeCustomizeRuleResponse.Data.Aliuid"));
		data.setRuleName(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.RuleName"));
		data.setRuleDesc(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.RuleDesc"));
		data.setRuleType(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.RuleType"));
		data.setThreatLevel(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.ThreatLevel"));
		data.setAlertType(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.AlertType"));
		data.setAlertTypeMds(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.AlertTypeMds"));
		data.setLogType(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.LogType"));
		data.setLogTypeMds(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.LogTypeMds"));
		data.setLogSource(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.LogSource"));
		data.setLogSourceMds(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.LogSourceMds"));
		data.setRuleCondition(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.RuleCondition"));
		data.setRuleGroup(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.RuleGroup"));
		data.setRuleThreshold(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.RuleThreshold"));
		data.setQueryCycle(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.QueryCycle"));
		data.setEventTransferSwitch(_ctx.integerValue("DescribeCustomizeRuleResponse.Data.EventTransferSwitch"));
		data.setEventTransferType(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.EventTransferType"));
		data.setEventTransferExt(_ctx.stringValue("DescribeCustomizeRuleResponse.Data.EventTransferExt"));
		data.setStatus(_ctx.integerValue("DescribeCustomizeRuleResponse.Data.Status"));
		describeCustomizeRuleResponse.setData(data);
	 
	 	return describeCustomizeRuleResponse;
	}
}