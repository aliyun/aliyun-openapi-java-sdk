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
		queryMdsUpgradeTaskDetailResponse.setResultMessage(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultMessage"));
		queryMdsUpgradeTaskDetailResponse.setResultCode(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.RequestId"));
		data.setSuccess(_ctx.booleanValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Success"));
		data.setErrorCode(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.ErrorCode"));
		data.setResultMsg(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.ResultMsg"));

		Content content = new Content();
		content.setPushContent(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.PushContent"));
		content.setIsEnterprise(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.IsEnterprise"));
		content.setPackageType(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.PackageType"));
		content.setGreyUv(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.GreyUv"));
		content.setPlatform(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Platform"));
		content.setGmtCreateStr(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.GmtCreateStr"));
		content.setSyncMode(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.SyncMode"));
		content.setChannelContains(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.ChannelContains"));
		content.setDevicePercent(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.DevicePercent"));
		content.setUpgradeValidTime(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.UpgradeValidTime"));
		content.setDownloadUrl(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.DownloadUrl"));
		content.setGreyConfigInfo(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.GreyConfigInfo"));
		content.setGreyNum(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.GreyNum"));
		content.setExecutionOrder(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.ExecutionOrder"));
		content.setProductVersion(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.ProductVersion"));
		content.setGreyEndtimeData(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.GreyEndtimeData"));
		content.setPublishType(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.PublishType"));
		content.setTaskStatus(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.TaskStatus"));
		content.setSyncResult(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.SyncResult"));
		content.setDeviceGreyNum(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.DeviceGreyNum"));
		content.setNetType(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.NetType"));
		content.setQrcodeUrl(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.QrcodeUrl"));
		content.setUpgradeContent(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.UpgradeContent"));
		content.setCityExcludes(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.CityExcludes"));
		content.setUpgradeType(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.UpgradeType"));
		content.setPublishMode(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.PublishMode"));
		content.setSilentType(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.SilentType"));
		content.setCreator(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Creator"));
		content.setAppstoreurl(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Appstoreurl"));
		content.setModifier(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Modifier"));
		content.setAppId(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.AppId"));
		content.setIsRelease(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.IsRelease"));
		content.setIsRc(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.IsRc"));
		content.setPackageInfoId(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.PackageInfoId"));
		content.setOsVersion(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.OsVersion"));
		content.setProductId(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.ProductId"));
		content.setCityContains(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.CityContains"));
		content.setReleaseType(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.ReleaseType"));
		content.setChannelExcludes(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.ChannelExcludes"));
		content.setMobileModelExcludes(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.MobileModelExcludes"));
		content.setAppCode(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.AppCode"));
		content.setInnerVersion(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.InnerVersion"));
		content.setMemo(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Memo"));
		content.setIsOfficial(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.IsOfficial"));
		content.setMobileModelContains(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.MobileModelContains"));
		content.setWhitelistIds(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.WhitelistIds"));
		content.setGreyNotice(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.GreyNotice"));
		content.setIsPush(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.IsPush"));
		content.setId(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Id"));

		List<RuleJsonListItem> ruleJsonList = new ArrayList<RuleJsonListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.RuleJsonList.Length"); i++) {
			RuleJsonListItem ruleJsonListItem = new RuleJsonListItem();
			ruleJsonListItem.setOperation(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.RuleJsonList["+ i +"].Operation"));
			ruleJsonListItem.setValue(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.RuleJsonList["+ i +"].Value"));
			ruleJsonListItem.setRuleType(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.RuleJsonList["+ i +"].RuleType"));
			ruleJsonListItem.setRuleElement(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.RuleJsonList["+ i +"].RuleElement"));

			ruleJsonList.add(ruleJsonListItem);
		}
		content.setRuleJsonList(ruleJsonList);

		List<WhitelistItem> whitelist = new ArrayList<WhitelistItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist.Length"); i++) {
			WhitelistItem whitelistItem = new WhitelistItem();
			whitelistItem.setStatus(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].Status"));
			whitelistItem.setWhiteListCount(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].WhiteListCount"));
			whitelistItem.setAppCode(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].AppCode"));
			whitelistItem.setIdType(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].IdType"));
			whitelistItem.setPlatform(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].Platform"));
			whitelistItem.setBusiness(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].Business"));
			whitelistItem.setGmtModified(_ctx.stringValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].GmtModified"));
			whitelistItem.setId(_ctx.longValue("QueryMdsUpgradeTaskDetailResponse.ResultContent.Data.Content.Whitelist["+ i +"].Id"));
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