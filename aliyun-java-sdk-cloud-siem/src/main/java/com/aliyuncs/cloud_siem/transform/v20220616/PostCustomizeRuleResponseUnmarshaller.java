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

import com.aliyuncs.cloud_siem.model.v20220616.PostCustomizeRuleResponse;
import com.aliyuncs.cloud_siem.model.v20220616.PostCustomizeRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class PostCustomizeRuleResponseUnmarshaller {

	public static PostCustomizeRuleResponse unmarshall(PostCustomizeRuleResponse postCustomizeRuleResponse, UnmarshallerContext _ctx) {
		
		postCustomizeRuleResponse.setRequestId(_ctx.stringValue("PostCustomizeRuleResponse.RequestId"));
		postCustomizeRuleResponse.setSuccess(_ctx.booleanValue("PostCustomizeRuleResponse.Success"));
		postCustomizeRuleResponse.setCode(_ctx.integerValue("PostCustomizeRuleResponse.Code"));
		postCustomizeRuleResponse.setMessage(_ctx.stringValue("PostCustomizeRuleResponse.Message"));

		Data data = new Data();
		data.setId(_ctx.longValue("PostCustomizeRuleResponse.Data.Id"));
		data.setGmtCreate(_ctx.stringValue("PostCustomizeRuleResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("PostCustomizeRuleResponse.Data.GmtModified"));
		data.setAliuid(_ctx.longValue("PostCustomizeRuleResponse.Data.Aliuid"));
		data.setRuleName(_ctx.stringValue("PostCustomizeRuleResponse.Data.RuleName"));
		data.setRuleDesc(_ctx.stringValue("PostCustomizeRuleResponse.Data.RuleDesc"));
		data.setRuleType(_ctx.stringValue("PostCustomizeRuleResponse.Data.RuleType"));
		data.setThreatLevel(_ctx.stringValue("PostCustomizeRuleResponse.Data.ThreatLevel"));
		data.setAlertType(_ctx.stringValue("PostCustomizeRuleResponse.Data.AlertType"));
		data.setAlertTypeMds(_ctx.stringValue("PostCustomizeRuleResponse.Data.AlertTypeMds"));
		data.setLogType(_ctx.stringValue("PostCustomizeRuleResponse.Data.LogType"));
		data.setLogTypeMds(_ctx.stringValue("PostCustomizeRuleResponse.Data.LogTypeMds"));
		data.setLogSource(_ctx.stringValue("PostCustomizeRuleResponse.Data.LogSource"));
		data.setLogSourceMds(_ctx.stringValue("PostCustomizeRuleResponse.Data.LogSourceMds"));
		data.setRuleCondition(_ctx.stringValue("PostCustomizeRuleResponse.Data.RuleCondition"));
		data.setRuleGroup(_ctx.stringValue("PostCustomizeRuleResponse.Data.RuleGroup"));
		data.setRuleThreshold(_ctx.stringValue("PostCustomizeRuleResponse.Data.RuleThreshold"));
		data.setQueryCycle(_ctx.stringValue("PostCustomizeRuleResponse.Data.QueryCycle"));
		data.setAttCk(_ctx.stringValue("PostCustomizeRuleResponse.Data.AttCk"));
		data.setEventTransferSwitch(_ctx.integerValue("PostCustomizeRuleResponse.Data.EventTransferSwitch"));
		data.setEventTransferType(_ctx.stringValue("PostCustomizeRuleResponse.Data.EventTransferType"));
		data.setEventTransferExt(_ctx.stringValue("PostCustomizeRuleResponse.Data.EventTransferExt"));
		data.setStatus(_ctx.integerValue("PostCustomizeRuleResponse.Data.Status"));
		data.setDataType(_ctx.integerValue("PostCustomizeRuleResponse.Data.DataType"));
		postCustomizeRuleResponse.setData(data);
	 
	 	return postCustomizeRuleResponse;
	}
}