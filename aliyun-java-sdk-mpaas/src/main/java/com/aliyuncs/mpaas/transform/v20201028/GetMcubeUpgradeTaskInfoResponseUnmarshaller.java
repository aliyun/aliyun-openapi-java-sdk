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

package com.aliyuncs.mpaas.transform.v20201028;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20201028.GetMcubeUpgradeTaskInfoResponse;
import com.aliyuncs.mpaas.model.v20201028.GetMcubeUpgradeTaskInfoResponse.GetTaskResult;
import com.aliyuncs.mpaas.model.v20201028.GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo;
import com.aliyuncs.mpaas.model.v20201028.GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.RuleJsonListItem;
import com.aliyuncs.mpaas.model.v20201028.GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.WhitelistItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMcubeUpgradeTaskInfoResponseUnmarshaller {

	public static GetMcubeUpgradeTaskInfoResponse unmarshall(GetMcubeUpgradeTaskInfoResponse getMcubeUpgradeTaskInfoResponse, UnmarshallerContext _ctx) {
		
		getMcubeUpgradeTaskInfoResponse.setRequestId(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.RequestId"));
		getMcubeUpgradeTaskInfoResponse.setResultCode(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.ResultCode"));
		getMcubeUpgradeTaskInfoResponse.setResultMessage(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.ResultMessage"));

		GetTaskResult getTaskResult = new GetTaskResult();
		getTaskResult.setErrorCode(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.ErrorCode"));
		getTaskResult.setResultMsg(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.ResultMsg"));
		getTaskResult.setSuccess(_ctx.booleanValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.Success"));
		getTaskResult.setRequestId(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.RequestId"));

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setGreyConfigInfo(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.GreyConfigInfo"));
		taskInfo.setPlatform(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Platform"));
		taskInfo.setGreyNum(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.GreyNum"));
		taskInfo.setAppstoreUrl(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.AppstoreUrl"));
		taskInfo.setWorkspaceId(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.WorkspaceId"));
		taskInfo.setIsRc(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.IsRc"));
		taskInfo.setCreator(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Creator"));
		taskInfo.setGreyConfigInfo1(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.GreyConfigInfo"));
		taskInfo.setUpgradeContent(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.UpgradeContent"));
		taskInfo.setGreyEndtimeData(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.GreyEndtimeData"));
		taskInfo.setOsVersion(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.OsVersion"));
		taskInfo.setUpgradeType(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.UpgradeType"));
		taskInfo.setModifier(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Modifier"));
		taskInfo.setAppCode(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.AppCode"));
		taskInfo.setMemo(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Memo"));
		taskInfo.setPublishMode(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.PublishMode"));
		taskInfo.setNetType(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.NetType"));
		taskInfo.setAppId(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.AppId"));
		taskInfo.setIsEnterprise(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.IsEnterprise"));
		taskInfo.setCreater(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Creater"));
		taskInfo.setTaskStatus(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.TaskStatus"));
		taskInfo.setId(_ctx.longValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Id"));
		taskInfo.setDownloadUrl(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.DownloadUrl"));
		taskInfo.setProductId(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.ProductId"));
		taskInfo.setPackageType(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.PackageType"));
		taskInfo.setSilentType(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.SilentType"));
		taskInfo.setIsRelease(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.IsRelease"));
		taskInfo.setUpgradeValidTime(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.UpgradeValidTime"));
		taskInfo.setIsOfficial(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.IsOfficial"));
		taskInfo.setPublishType(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.PublishType"));
		taskInfo.setHistoryForce(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.HistoryForce"));
		taskInfo.setQrcodeUrl(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.QrcodeUrl"));
		taskInfo.setPackageInfoId(_ctx.longValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.PackageInfoId"));
		taskInfo.setWhitelistIds(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.WhitelistIds"));
		taskInfo.setPushContent(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.PushContent"));

		List<RuleJsonListItem> ruleJsonList = new ArrayList<RuleJsonListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.RuleJsonList.Length"); i++) {
			RuleJsonListItem ruleJsonListItem = new RuleJsonListItem();
			ruleJsonListItem.setRuleType(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.RuleJsonList["+ i +"].RuleType"));
			ruleJsonListItem.setRuleElement(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.RuleJsonList["+ i +"].RuleElement"));
			ruleJsonListItem.setOperation(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.RuleJsonList["+ i +"].Operation"));
			ruleJsonListItem.setValue(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.RuleJsonList["+ i +"].Value"));

			ruleJsonList.add(ruleJsonListItem);
		}
		taskInfo.setRuleJsonList(ruleJsonList);

		List<WhitelistItem> whitelist = new ArrayList<WhitelistItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist.Length"); i++) {
			WhitelistItem whitelistItem = new WhitelistItem();
			whitelistItem.setWhiteListName(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].WhiteListName"));
			whitelistItem.setIdType(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].IdType"));
			whitelistItem.setPlatform(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].Platform"));
			whitelistItem.setAppCode(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].AppCode"));
			whitelistItem.setWhiteListCount(_ctx.longValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].WhiteListCount"));
			whitelistItem.setStatus(_ctx.integerValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].Status"));
			whitelistItem.setWhitelistType(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].WhitelistType"));
			whitelistItem.setId(_ctx.longValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].Id"));
			whitelistItem.setUserType(_ctx.stringValue("GetMcubeUpgradeTaskInfoResponse.GetTaskResult.TaskInfo.Whitelist["+ i +"].UserType"));

			whitelist.add(whitelistItem);
		}
		taskInfo.setWhitelist(whitelist);
		getTaskResult.setTaskInfo(taskInfo);
		getMcubeUpgradeTaskInfoResponse.setGetTaskResult(getTaskResult);
	 
	 	return getMcubeUpgradeTaskInfoResponse;
	}
}