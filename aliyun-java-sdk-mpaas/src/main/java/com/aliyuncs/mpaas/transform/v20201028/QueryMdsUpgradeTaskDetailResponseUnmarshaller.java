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

import com.aliyuncs.mpaas.model.v20201028.QueryMdsUpgradeTaskDetailResponse;
import com.aliyuncs.mpaas.model.v20201028.QueryMdsUpgradeTaskDetailResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.QueryMdsUpgradeTaskDetailResponse.ResultContent.Data;
import com.aliyuncs.mpaas.model.v20201028.QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content;
import com.aliyuncs.mpaas.model.v20201028.QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.RuleJsonListItem;
import com.aliyuncs.mpaas.model.v20201028.QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.WhitelistItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMdsUpgradeTaskDetailResponseUnmarshaller {

	public static QueryMdsUpgradeTaskDetailResponse unmarshall(QueryMdsUpgradeTaskDetailResponse queryMdsUpgradeTaskDetailResponse, UnmarshallerContext _ctx) {
		
		queryMdsUpgradeTaskDetailResponse.setRequestId(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.RequestId"));
		queryMdsUpgradeTaskDetailResponse.setResultCode(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultCode"));
		queryMdsUpgradeTaskDetailResponse.setResultMessage(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setErrorCode(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.ErrorCode"));
		data.setRequestId(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.RequestId"));
		data.setResultMsg(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.ResultMsg"));
		data.setSuccess(_ctx.booleanValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Success"));

		Content content = new Content();
		content.setAppstoreurl(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Appstoreurl"));
		content.setAppCode(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.AppCode"));
		content.setAppId(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.AppId"));
		content.setChannelContains(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.ChannelContains"));
		content.setChannelExcludes(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.ChannelExcludes"));
		content.setCityContains(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.CityContains"));
		content.setCityExcludes(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.CityExcludes"));
		content.setCreator(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Creator"));
		content.setDeviceGreyNum(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.DeviceGreyNum"));
		content.setDevicePercent(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.DevicePercent"));
		content.setDownloadUrl(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.DownloadUrl"));
		content.setExecutionOrder(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.ExecutionOrder"));
		content.setGmtCreateStr(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.GmtCreateStr"));
		content.setGreyConfigInfo(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.GreyConfigInfo"));
		content.setGreyEndtimeData(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.GreyEndtimeData"));
		content.setGreyNotice(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.GreyNotice"));
		content.setGreyNum(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.GreyNum"));
		content.setGreyUv(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.GreyUv"));
		content.setId(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Id"));
		content.setInnerVersion(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.InnerVersion"));
		content.setIsEnterprise(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.IsEnterprise"));
		content.setIsOfficial(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.IsOfficial"));
		content.setIsPush(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.IsPush"));
		content.setIsRc(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.IsRc"));
		content.setIsRelease(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.IsRelease"));
		content.setMemo(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Memo"));
		content.setMobileModelContains(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.MobileModelContains"));
		content.setMobileModelExcludes(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.MobileModelExcludes"));
		content.setModifier(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Modifier"));
		content.setNetType(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.NetType"));
		content.setOsVersion(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.OsVersion"));
		content.setPackageInfoId(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.PackageInfoId"));
		content.setPackageType(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.PackageType"));
		content.setPlatform(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Platform"));
		content.setProductId(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.ProductId"));
		content.setProductVersion(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.ProductVersion"));
		content.setPublishMode(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.PublishMode"));
		content.setPublishType(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.PublishType"));
		content.setPushContent(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.PushContent"));
		content.setQrcodeUrl(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.QrcodeUrl"));
		content.setReleaseType(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.ReleaseType"));
		content.setSilentType(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.SilentType"));
		content.setSyncMode(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.SyncMode"));
		content.setSyncResult(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.SyncResult"));
		content.setTaskStatus(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.TaskStatus"));
		content.setUpgradeContent(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.UpgradeContent"));
		content.setUpgradeType(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.UpgradeType"));
		content.setUpgradeValidTime(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.UpgradeValidTime"));
		content.setWhitelistIds(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.WhitelistIds"));

		List<RuleJsonListItem> ruleJsonList = new ArrayList<RuleJsonListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.RuleJsonList.Length"); i++) {
			RuleJsonListItem ruleJsonListItem = new RuleJsonListItem();
			ruleJsonListItem.setOperation(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.RuleJsonList["+ i +"].Operation"));
			ruleJsonListItem.setRuleElement(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.RuleJsonList["+ i +"].RuleElement"));
			ruleJsonListItem.setRuleType(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.RuleJsonList["+ i +"].RuleType"));
			ruleJsonListItem.setValue(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.RuleJsonList["+ i +"].Value"));

			ruleJsonList.add(ruleJsonListItem);
		}
		content.setRuleJsonList(ruleJsonList);

		List<WhitelistItem> whitelist = new ArrayList<WhitelistItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist.Length"); i++) {
			WhitelistItem whitelistItem = new WhitelistItem();
			whitelistItem.setAppCode(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].AppCode"));
			whitelistItem.setBusiness(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].Business"));
			whitelistItem.setGmtModified(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].GmtModified"));
			whitelistItem.setId(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].Id"));
			whitelistItem.setIdType(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].IdType"));
			whitelistItem.setPlatform(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].Platform"));
			whitelistItem.setStatus(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].Status"));
			whitelistItem.setWhiteListCount(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].WhiteListCount"));
			whitelistItem.setWhiteListName(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].WhiteListName"));

			whitelist.add(whitelistItem);
		}
		content.setWhitelist(whitelist);
		data.setContent(content);
		resultContent.setData(data);
		queryMdsUpgradeTaskDetailResponse.setResultContent(resultContent);
	 
	 	return queryMdsUpgradeTaskDetailResponse;
	}
}