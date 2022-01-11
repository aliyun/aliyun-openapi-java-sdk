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

import com.aliyuncs.mpaas.model.v20200710.GetMcubeNebulaTaskDetailResponse;
import com.aliyuncs.mpaas.model.v20200710.GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult;
import com.aliyuncs.mpaas.model.v20200710.GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail;
import com.aliyuncs.mpaas.model.v20200710.GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.RuleJsonListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMcubeNebulaTaskDetailResponseUnmarshaller {

	public static GetMcubeNebulaTaskDetailResponse unmarshall(GetMcubeNebulaTaskDetailResponse getMcubeNebulaTaskDetailResponse, UnmarshallerContext _ctx) {
		
		getMcubeNebulaTaskDetailResponse.setRequestId(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.RequestId"));
		getMcubeNebulaTaskDetailResponse.setResultMessage(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.ResultMessage"));
		getMcubeNebulaTaskDetailResponse.setResultCode(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.ResultCode"));

		GetMcubeNebulaTaskDetailResult getMcubeNebulaTaskDetailResult = new GetMcubeNebulaTaskDetailResult();
		getMcubeNebulaTaskDetailResult.setRequestId(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.RequestId"));
		getMcubeNebulaTaskDetailResult.setErrorCode(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.ErrorCode"));
		getMcubeNebulaTaskDetailResult.setSuccess(_ctx.booleanValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.Success"));
		getMcubeNebulaTaskDetailResult.setResultMsg(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.ResultMsg"));

		NebulaTaskDetail nebulaTaskDetail = new NebulaTaskDetail();
		nebulaTaskDetail.setAtomic(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Atomic"));
		nebulaTaskDetail.setTaskType(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.TaskType"));
		nebulaTaskDetail.setPlatform(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Platform"));
		nebulaTaskDetail.setBaseInfoId(_ctx.longValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.BaseInfoId"));
		nebulaTaskDetail.setDownloadUrl(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.DownloadUrl"));
		nebulaTaskDetail.setTaskVersion(_ctx.longValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.TaskVersion"));
		nebulaTaskDetail.setGreyNum(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GreyNum"));
		nebulaTaskDetail.setGreyConfigInfo(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GreyConfigInfo"));
		nebulaTaskDetail.setPublishPeriod(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.PublishPeriod"));
		nebulaTaskDetail.setSyncType(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.SyncType"));
		nebulaTaskDetail.setSourceId(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.SourceId"));
		nebulaTaskDetail.setProductVersion(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.ProductVersion"));
		nebulaTaskDetail.setWorkspaceId(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.WorkspaceId"));
		nebulaTaskDetail.setGreyEndtimeData(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GreyEndtimeData"));
		nebulaTaskDetail.setPublishType(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.PublishType"));
		nebulaTaskDetail.setTaskStatus(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.TaskStatus"));
		nebulaTaskDetail.setGreyUrl(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GreyUrl"));
		nebulaTaskDetail.setSyncResult(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.SyncResult"));
		nebulaTaskDetail.setStatus(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Status"));
		nebulaTaskDetail.setPercent(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Percent"));
		nebulaTaskDetail.setPublishMode(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.PublishMode"));
		nebulaTaskDetail.setTaskName(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.TaskName"));
		nebulaTaskDetail.setQuickRollback(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.QuickRollback"));
		nebulaTaskDetail.setSourceType(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.SourceType"));
		nebulaTaskDetail.setGreyEndtime(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GreyEndtime"));
		nebulaTaskDetail.setIssueDesc(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.IssueDesc"));
		nebulaTaskDetail.setGmtModified(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GmtModified"));
		nebulaTaskDetail.setGreyEndtimeStr(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GreyEndtimeStr"));
		nebulaTaskDetail.setBizType(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.BizType"));
		nebulaTaskDetail.setCreator(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Creator"));
		nebulaTaskDetail.setModifier(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Modifier"));
		nebulaTaskDetail.setAppId(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.AppId"));
		nebulaTaskDetail.setProductId(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.ProductId"));
		nebulaTaskDetail.setFullRepair(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.FullRepair"));
		nebulaTaskDetail.setReleaseVersion(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.ReleaseVersion"));
		nebulaTaskDetail.setFileSize(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.FileSize"));
		nebulaTaskDetail.setGmtModifiedStr(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GmtModifiedStr"));
		nebulaTaskDetail.setUpgradeNoticeNum(_ctx.longValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.UpgradeNoticeNum"));
		nebulaTaskDetail.setAppCode(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.AppCode"));
		nebulaTaskDetail.setMemo(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Memo"));
		nebulaTaskDetail.setCronexpress(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Cronexpress"));
		nebulaTaskDetail.setSourceName(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.SourceName"));
		nebulaTaskDetail.setWhitelistIds(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.WhitelistIds"));
		nebulaTaskDetail.setGmtCreate(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GmtCreate"));
		nebulaTaskDetail.setPackageId(_ctx.longValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.PackageId"));
		nebulaTaskDetail.setOssPath(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.OssPath"));
		nebulaTaskDetail.setUpgradeProgress(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.UpgradeProgress"));
		nebulaTaskDetail.setId(_ctx.longValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Id"));
		nebulaTaskDetail.setExtraData(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.ExtraData"));

		List<RuleJsonListItem> ruleJsonList = new ArrayList<RuleJsonListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.RuleJsonList.Length"); i++) {
			RuleJsonListItem ruleJsonListItem = new RuleJsonListItem();
			ruleJsonListItem.setOperation(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.RuleJsonList["+ i +"].Operation"));
			ruleJsonListItem.setValue(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.RuleJsonList["+ i +"].Value"));
			ruleJsonListItem.setRuleType(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.RuleJsonList["+ i +"].RuleType"));
			ruleJsonListItem.setRuleElement(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.RuleJsonList["+ i +"].RuleElement"));

			ruleJsonList.add(ruleJsonListItem);
		}
		nebulaTaskDetail.setRuleJsonList(ruleJsonList);
		getMcubeNebulaTaskDetailResult.setNebulaTaskDetail(nebulaTaskDetail);
		getMcubeNebulaTaskDetailResponse.setGetMcubeNebulaTaskDetailResult(getMcubeNebulaTaskDetailResult);
	 
	 	return getMcubeNebulaTaskDetailResponse;
	}
}