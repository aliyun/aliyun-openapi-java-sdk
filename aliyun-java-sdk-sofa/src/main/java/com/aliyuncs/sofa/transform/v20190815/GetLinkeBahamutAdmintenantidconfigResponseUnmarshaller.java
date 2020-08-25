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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAdmintenantidconfigResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAdmintenantidconfigResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAdmintenantidconfigResponseUnmarshaller {

	public static GetLinkeBahamutAdmintenantidconfigResponse unmarshall(GetLinkeBahamutAdmintenantidconfigResponse getLinkeBahamutAdmintenantidconfigResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAdmintenantidconfigResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.RequestId"));
		getLinkeBahamutAdmintenantidconfigResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.ResultCode"));
		getLinkeBahamutAdmintenantidconfigResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.ResultMessage"));
		getLinkeBahamutAdmintenantidconfigResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.ErrorMessage"));
		getLinkeBahamutAdmintenantidconfigResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAdmintenantidconfigResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Message"));
		getLinkeBahamutAdmintenantidconfigResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAdmintenantidconfigResponse.ResponseStatusCode"));
		getLinkeBahamutAdmintenantidconfigResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Success"));

		Result result = new Result();
		result.setAntflowEnabled(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.AntflowEnabled"));
		result.setAppChangeNeedNotice(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.AppChangeNeedNotice"));
		result.setAppInitMeta(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.AppInitMeta"));
		result.setAutoAppReleaseStatus(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.AutoAppReleaseStatus"));
		result.setAutoReleaseMachine(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.AutoReleaseMachine"));
		result.setAutoUnbindMachine(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.AutoUnbindMachine"));
		result.setBaseJarInfo(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.BaseJarInfo"));
		result.setCheckAntWatchRiskControl(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.CheckAntWatchRiskControl"));
		result.setCheckRunningPreBuildTask(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.CheckRunningPreBuildTask"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.Created"));
		result.setCreateMrWhenMergeConflicts(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.CreateMrWhenMergeConflicts"));
		result.setCreateOrImportAppNeedApproval(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.CreateOrImportAppNeedApproval"));
		result.setCrossCloud(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.CrossCloud"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.Deleted"));
		result.setGetSecretFromLinku(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.GetSecretFromLinku"));
		result.setGitLabAccount(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.GitLabAccount"));
		result.setGitLabPrivateToken(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.GitLabPrivateToken"));
		result.setGitLabSite(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.GitLabSite"));
		result.setGitLabUser(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.GitLabUser"));
		result.setHighAvailabilityEnabled(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.HighAvailabilityEnabled"));
		result.setId(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.Id"));
		result.setJarEnabled(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.JarEnabled"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.LastModified"));
		result.setLinkcApiHost(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.LinkcApiHost"));
		result.setLinkcFrontHost(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.LinkcFrontHost"));
		result.setLinksEnable(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.LinksEnable"));
		result.setLinktFrontHost(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.LinktFrontHost"));
		result.setMergeRequestEnabled(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.MergeRequestEnabled"));
		result.setMvnJarInfo(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.MvnJarInfo"));
		result.setMyCodeCenterHost(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.MyCodeCenterHost"));
		result.setOnexMode(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.OnexMode"));
		result.setOriginOSSConfig(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.OriginOSSConfig"));
		result.setOssConfig(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.OssConfig"));
		result.setPreConfirmArchDomainMap(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.PreConfirmArchDomainMap"));
		result.setQualityIndices(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.QualityIndices"));
		result.setRealGitLabSite(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.RealGitLabSite"));
		result.setReleaseControlEnabled(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.ReleaseControlEnabled"));
		result.setSettingsFile(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.SettingsFile"));
		result.setSkipPreCheck(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.SkipPreCheck"));
		result.setStartAccCallback(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.StartAccCallback"));
		result.setTenantId(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.TenantId"));
		result.setTokens(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.Tokens"));
		result.setUpdateAppMetaWhenSync(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.UpdateAppMetaWhenSync"));
		result.setUseAppReleaseView(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.UseAppReleaseView"));
		result.setUseBaselineToRelease(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.UseBaselineToRelease"));
		result.setUseCustomOss(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.UseCustomOss"));
		result.setUseNewCloudAppImportView(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.UseNewCloudAppImportView"));
		result.setUseNewPrePubEnvIdList(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.UseNewPrePubEnvIdList"));
		result.setUseNewThirdPartyWay(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.UseNewThirdPartyWay"));
		result.setUseOldFabricPreCheck(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.UseOldFabricPreCheck"));
		result.setUseShareMiddleware(_ctx.booleanValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.UseShareMiddleware"));
		result.setWebHookUrl(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.WebHookUrl"));

		List<String> defaultQualityRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.DefaultQualityRules.Length"); i++) {
			defaultQualityRules.add(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.DefaultQualityRules["+ i +"]"));
		}
		result.setDefaultQualityRules(defaultQualityRules);

		List<String> gitlabSitePrefixs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.GitlabSitePrefixs.Length"); i++) {
			gitlabSitePrefixs.add(_ctx.stringValue("GetLinkeBahamutAdmintenantidconfigResponse.Result.GitlabSitePrefixs["+ i +"]"));
		}
		result.setGitlabSitePrefixs(gitlabSitePrefixs);
		getLinkeBahamutAdmintenantidconfigResponse.setResult(result);
	 
	 	return getLinkeBahamutAdmintenantidconfigResponse;
	}
}