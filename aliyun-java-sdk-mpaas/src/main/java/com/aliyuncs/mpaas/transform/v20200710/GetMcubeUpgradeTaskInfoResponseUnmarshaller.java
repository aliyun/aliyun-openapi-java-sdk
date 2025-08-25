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

package com.aliyuncs.mpaas.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20200710.GetMcubeUpgradeTaskInfoResponse;
import com.aliyuncs.mpaas.model.v20200710.GetMcubeUpgradeTaskInfoResponse.GetTaskResult;
import com.aliyuncs.mpaas.model.v20200710.GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo;
import com.aliyuncs.mpaas.model.v20200710.GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.RuleJsonListItem;
import com.aliyuncs.mpaas.model.v20200710.GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.WhitelistItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMcubeUpgradeTaskInfoResponseUnmarshaller {

	public static GetMcubeUpgradeTaskInfoResponse unmarshall(GetMcubeUpgradeTaskInfoResponse getMcubeUpgradeTaskInfoResponse, UnmarshallerContext _ctx) {
		
		getMcubeUpgradeTaskInfoResponse.setRequestId(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.RequestId"));
		getMcubeUpgradeTaskInfoResponse.setResultMessage(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.ResultMessage"));
		getMcubeUpgradeTaskInfoResponse.setResultCode(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.ResultCode"));

		GetTaskResult getTaskResult = new GetTaskResult();
		getTaskResult.setRequestId(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.RequestId"));
		getTaskResult.setErrorCode(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.ErrorCode"));
		getTaskResult.setSuccess(_ctx.booleanValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.Success"));
		getTaskResult.setResultMsg(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.ResultMsg"));

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setPublishMode(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.PublishMode"));
		taskInfo.setSilentType(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.SilentType"));
		taskInfo.setIsEnterprise(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.IsEnterprise"));
		taskInfo.setPackageType(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.PackageType"));
		taskInfo.setCreator(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Creator"));
		taskInfo.setModifier(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Modifier"));
		taskInfo.setAppId(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.AppId"));
		taskInfo.setHistoryForce(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.HistoryForce"));
		taskInfo.setPlatform(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Platform"));
		taskInfo.setAppstoreUrl(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.AppstoreUrl"));
		taskInfo.setPackageInfoId(_ctx.longValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.PackageInfoId"));
		taskInfo.setProductId(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.ProductId"));
		taskInfo.setUpgradeValidTime(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.UpgradeValidTime"));
		taskInfo.setDownloadUrl(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.DownloadUrl"));
		taskInfo.setAppCode(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.AppCode"));
		taskInfo.setMemo(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Memo"));
		taskInfo.setGreyConfigInfo(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.GreyConfigInfo"));
		taskInfo.setGreyNum(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.GreyNum"));
		taskInfo.setWorkspaceId(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.WorkspaceId"));
		taskInfo.setGreyEndtimeData(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.GreyEndtimeData"));
		taskInfo.setPublishType(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.PublishType"));
		taskInfo.setTaskStatus(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.TaskStatus"));
		taskInfo.setWhitelistIds(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.WhitelistIds"));
		taskInfo.setUpgradeContent(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.UpgradeContent"));
		taskInfo.setUpgradeType(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.UpgradeType"));
		taskInfo.setId(_ctx.longValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Id"));

		List<RuleJsonListItem> ruleJsonList = new ArrayList<RuleJsonListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.RuleJsonList.Length"); i++) {
			RuleJsonListItem ruleJsonListItem = new RuleJsonListItem();
			ruleJsonListItem.setOperation(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.RuleJsonList["+ i +"].Operation"));
			ruleJsonListItem.setValue(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.RuleJsonList["+ i +"].Value"));
			ruleJsonListItem.setRuleType(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.RuleJsonList["+ i +"].RuleType"));
			ruleJsonListItem.setRuleElement(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.RuleJsonList["+ i +"].RuleElement"));

			ruleJsonList.add(ruleJsonListItem);
		}
		taskInfo.setRuleJsonList(ruleJsonList);

		List<WhitelistItem> whitelist = new ArrayList<WhitelistItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist.Length"); i++) {
			WhitelistItem whitelistItem = new WhitelistItem();
			whitelistItem.setStatus(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].Status"));
			whitelistItem.setUserType(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].UserType"));
			whitelistItem.setWhiteListCount(_ctx.longValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].WhiteListCount"));
			whitelistItem.setAppCode(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].AppCode"));
			whitelistItem.setIdType(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].IdType"));
			whitelistItem.setPlatform(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].Platform"));
			whitelistItem.setWhitelistType(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].WhitelistType"));
			whitelistItem.setId(_ctx.longValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].Id"));
			whitelistItem.setWhiteListName(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].WhiteListName"));

			whitelist.add(whitelistItem);
		}
		taskInfo.setWhitelist(whitelist);
		getTaskResult.setTaskInfo(taskInfo);
		getMcubeUpgradeTaskInfoResponse.setGetTaskResult(getTaskResult);
	 
	 	return getMcubeUpgradeTaskInfoResponse;
	}
}