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
		getMcubeNebulaTaskDetailResponse.setResultCode(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.ResultCode"));
		getMcubeNebulaTaskDetailResponse.setResultMessage(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.ResultMessage"));

		GetMcubeNebulaTaskDetailResult getMcubeNebulaTaskDetailResult = new GetMcubeNebulaTaskDetailResult();
		getMcubeNebulaTaskDetailResult.setErrorCode(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.ErrorCode"));
		getMcubeNebulaTaskDetailResult.setResultMsg(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.ResultMsg"));
		getMcubeNebulaTaskDetailResult.setSuccess(_ctx.booleanValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.Success"));
		getMcubeNebulaTaskDetailResult.setRequestId(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.RequestId"));

		NebulaTaskDetail nebulaTaskDetail = new NebulaTaskDetail();
		nebulaTaskDetail.setId(_ctx.longValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Id"));
		nebulaTaskDetail.setGmtModifiedStr(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GmtModifiedStr"));
		nebulaTaskDetail.setTaskStatus(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.TaskStatus"));
		nebulaTaskDetail.setProductVersion(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.ProductVersion"));
		nebulaTaskDetail.setWorkspaceId(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.WorkspaceId"));
		nebulaTaskDetail.setOssPath(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.OssPath"));
		nebulaTaskDetail.setAppCode(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.AppCode"));
		nebulaTaskDetail.setPublishMode(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.PublishMode"));
		nebulaTaskDetail.setMemo(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Memo"));
		nebulaTaskDetail.setQuickRollback(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.QuickRollback"));
		nebulaTaskDetail.setBaseInfoId(_ctx.longValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.BaseInfoId"));
		nebulaTaskDetail.setModifier(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Modifier"));
		nebulaTaskDetail.setTaskName(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.TaskName"));
		nebulaTaskDetail.setStatus(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Status"));
		nebulaTaskDetail.setIssueDesc(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.IssueDesc"));
		nebulaTaskDetail.setWhitelistIds(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.WhitelistIds"));
		nebulaTaskDetail.setGreyEndtimeStr(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GreyEndtimeStr"));
		nebulaTaskDetail.setSourceName(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.SourceName"));
		nebulaTaskDetail.setPublishType(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.PublishType"));
		nebulaTaskDetail.setUpgradeNoticeNum(_ctx.longValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.UpgradeNoticeNum"));
		nebulaTaskDetail.setProductId(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.ProductId"));
		nebulaTaskDetail.setGreyEndtimeData(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GreyEndtimeData"));
		nebulaTaskDetail.setAppId(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.AppId"));
		nebulaTaskDetail.setTaskType(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.TaskType"));
		nebulaTaskDetail.setGreyNum(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GreyNum"));
		nebulaTaskDetail.setSourceId(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.SourceId"));
		nebulaTaskDetail.setSyncResult(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.SyncResult"));
		nebulaTaskDetail.setPlatform(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Platform"));
		nebulaTaskDetail.setExtraData(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.ExtraData"));
		nebulaTaskDetail.setPercent(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Percent"));
		nebulaTaskDetail.setDownloadUrl(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.DownloadUrl"));
		nebulaTaskDetail.setGmtModified(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GmtModified"));
		nebulaTaskDetail.setBizType(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.BizType"));
		nebulaTaskDetail.setUpgradeProgress(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.UpgradeProgress"));
		nebulaTaskDetail.setSourceType(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.SourceType"));
		nebulaTaskDetail.setFileSize(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.FileSize"));
		nebulaTaskDetail.setAtomic(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Atomic"));
		nebulaTaskDetail.setSyncType(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.SyncType"));
		nebulaTaskDetail.setPackageId(_ctx.longValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.PackageId"));
		nebulaTaskDetail.setGreyEndtime(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GreyEndtime"));
		nebulaTaskDetail.setPublishPeriod(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.PublishPeriod"));
		nebulaTaskDetail.setGreyConfigInfo(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GreyConfigInfo"));
		nebulaTaskDetail.setFullRepair(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.FullRepair"));
		nebulaTaskDetail.setGmtCreate(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GmtCreate"));
		nebulaTaskDetail.setTaskVersion(_ctx.longValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.TaskVersion"));
		nebulaTaskDetail.setCreator(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Creator"));
		nebulaTaskDetail.setGreyUrl(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.GreyUrl"));
		nebulaTaskDetail.setReleaseVersion(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.ReleaseVersion"));
		nebulaTaskDetail.setCronexpress(_ctx.integerValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.Cronexpress"));

		List<RuleJsonListItem> ruleJsonList = new ArrayList<RuleJsonListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.RuleJsonList.Length"); i++) {
			RuleJsonListItem ruleJsonListItem = new RuleJsonListItem();
			ruleJsonListItem.setRuleType(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.RuleJsonList["+ i +"].RuleType"));
			ruleJsonListItem.setRuleElement(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.RuleJsonList["+ i +"].RuleElement"));
			ruleJsonListItem.setOperation(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.RuleJsonList["+ i +"].Operation"));
			ruleJsonListItem.setValue(_ctx.stringValue("GetMcubeNebulaTaskDetailResponse.GetMcubeNebulaTaskDetailResult.NebulaTaskDetail.RuleJsonList["+ i +"].Value"));

			ruleJsonList.add(ruleJsonListItem);
		}
		nebulaTaskDetail.setRuleJsonList(ruleJsonList);
		getMcubeNebulaTaskDetailResult.setNebulaTaskDetail(nebulaTaskDetail);
		getMcubeNebulaTaskDetailResponse.setGetMcubeNebulaTaskDetailResult(getMcubeNebulaTaskDetailResult);
	 
	 	return getMcubeNebulaTaskDetailResponse;
	}
}