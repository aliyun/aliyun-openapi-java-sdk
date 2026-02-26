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

package com.aliyuncs.sophonsoar.transform.v20220728;

import com.aliyuncs.sophonsoar.model.v20220728.DescribePlaybookResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribePlaybookResponse.Playbook;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlaybookResponseUnmarshaller {

	public static DescribePlaybookResponse unmarshall(DescribePlaybookResponse describePlaybookResponse, UnmarshallerContext _ctx) {
		
		describePlaybookResponse.setRequestId(_ctx.stringValue("DescribePlaybookResponse.RequestId"));

		Playbook playbook = new Playbook();
		playbook.setGmtCreate(_ctx.stringValue("DescribePlaybookResponse.Playbook.GmtCreate"));
		playbook.setGmtModified(_ctx.stringValue("DescribePlaybookResponse.Playbook.GmtModified"));
		playbook.setPlaybookUuid(_ctx.stringValue("DescribePlaybookResponse.Playbook.PlaybookUuid"));
		playbook.setTaskflow(_ctx.stringValue("DescribePlaybookResponse.Playbook.Taskflow"));
		playbook.setTaskflowType(_ctx.stringValue("DescribePlaybookResponse.Playbook.TaskflowType"));
		playbook.setTaskconfig(_ctx.stringValue("DescribePlaybookResponse.Playbook.Taskconfig"));
		playbook.setTenantId(_ctx.stringValue("DescribePlaybookResponse.Playbook.TenantId"));
		playbook.setInputtype(_ctx.stringValue("DescribePlaybookResponse.Playbook.Inputtype"));
		playbook.setOwnType(_ctx.stringValue("DescribePlaybookResponse.Playbook.OwnType"));
		playbook.setSuccessExeNum(_ctx.integerValue("DescribePlaybookResponse.Playbook.SuccessExeNum"));
		playbook.setFailExeNum(_ctx.integerValue("DescribePlaybookResponse.Playbook.FailExeNum"));
		playbook.setLastExeTime(_ctx.longValue("DescribePlaybookResponse.Playbook.LastExeTime"));
		playbook.setTriggerInfo(_ctx.stringValue("DescribePlaybookResponse.Playbook.TriggerInfo"));
		playbook.setOperateType(_ctx.stringValue("DescribePlaybookResponse.Playbook.OperateType"));
		playbook.setDisplayName(_ctx.stringValue("DescribePlaybookResponse.Playbook.DisplayName"));
		playbook.setRiskLevel(_ctx.integerValue("DescribePlaybookResponse.Playbook.RiskLevel"));
		playbook.setType(_ctx.stringValue("DescribePlaybookResponse.Playbook.Type"));
		playbook.setInputParams(_ctx.stringValue("DescribePlaybookResponse.Playbook.InputParams"));
		playbook.setDescription(_ctx.stringValue("DescribePlaybookResponse.Playbook.Description"));
		playbook.setOss(_ctx.stringValue("DescribePlaybookResponse.Playbook.Oss"));
		playbook.setActive(_ctx.booleanValue("DescribePlaybookResponse.Playbook.Active"));
		playbook.setCompiledresult(_ctx.stringValue("DescribePlaybookResponse.Playbook.Compiledresult"));
		playbook.setOnlineOss(_ctx.stringValue("DescribePlaybookResponse.Playbook.OnlineOss"));
		playbook.setOnlineActive(_ctx.booleanValue("DescribePlaybookResponse.Playbook.OnlineActive"));
		playbook.setOnlineCompiledresult(_ctx.stringValue("DescribePlaybookResponse.Playbook.OnlineCompiledresult"));
		playbook.setExecuteMode(_ctx.stringValue("DescribePlaybookResponse.Playbook.ExecuteMode"));
		playbook.setCron(_ctx.stringValue("DescribePlaybookResponse.Playbook.Cron"));
		playbook.setOnlineExecuteMode(_ctx.stringValue("DescribePlaybookResponse.Playbook.OnlineExecuteMode"));
		playbook.setOnlineCron(_ctx.stringValue("DescribePlaybookResponse.Playbook.OnlineCron"));
		playbook.setSchedulerId(_ctx.longValue("DescribePlaybookResponse.Playbook.SchedulerId"));
		playbook.setOnlineSchedulerId(_ctx.longValue("DescribePlaybookResponse.Playbook.OnlineSchedulerId"));
		playbook.setParentId(_ctx.integerValue("DescribePlaybookResponse.Playbook.ParentId"));
		playbook.setOutputParams(_ctx.stringValue("DescribePlaybookResponse.Playbook.OutputParams"));
		playbook.setTaskflowMd5(_ctx.stringValue("DescribePlaybookResponse.Playbook.TaskflowMd5"));
		playbook.setOnlineReleaseUuid(_ctx.stringValue("DescribePlaybookResponse.Playbook.OnlineReleaseUuid"));
		playbook.setOnlineReleaseTime(_ctx.stringValue("DescribePlaybookResponse.Playbook.OnlineReleaseTime"));
		playbook.setReleaseUuid(_ctx.stringValue("DescribePlaybookResponse.Playbook.ReleaseUuid"));
		playbook.setReleaseTime(_ctx.stringValue("DescribePlaybookResponse.Playbook.ReleaseTime"));
		playbook.setOnlineReleaseTaskflowMd5(_ctx.stringValue("DescribePlaybookResponse.Playbook.OnlineReleaseTaskflowMd5"));
		playbook.setReleaseTaskflowMd5(_ctx.stringValue("DescribePlaybookResponse.Playbook.ReleaseTaskflowMd5"));
		playbook.setFlag(_ctx.integerValue("DescribePlaybookResponse.Playbook.Flag"));
		playbook.setRightLevel(_ctx.stringValue("DescribePlaybookResponse.Playbook.RightLevel"));
		playbook.setTaskFlowDesc(_ctx.stringValue("DescribePlaybookResponse.Playbook.TaskFlowDesc"));
		playbook.setDebugFlag(_ctx.stringValue("DescribePlaybookResponse.Playbook.DebugFlag"));
		playbook.setPlaybookStatus(_ctx.integerValue("DescribePlaybookResponse.Playbook.PlaybookStatus"));
		describePlaybookResponse.setPlaybook(playbook);
	 
	 	return describePlaybookResponse;
	}
}