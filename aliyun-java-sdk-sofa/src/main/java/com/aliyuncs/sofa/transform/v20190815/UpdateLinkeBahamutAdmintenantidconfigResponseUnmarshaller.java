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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdmintenantidconfigResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdmintenantidconfigResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutAdmintenantidconfigResponseUnmarshaller {

	public static UpdateLinkeBahamutAdmintenantidconfigResponse unmarshall(UpdateLinkeBahamutAdmintenantidconfigResponse updateLinkeBahamutAdmintenantidconfigResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutAdmintenantidconfigResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.RequestId"));
		updateLinkeBahamutAdmintenantidconfigResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.ResultCode"));
		updateLinkeBahamutAdmintenantidconfigResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.ResultMessage"));
		updateLinkeBahamutAdmintenantidconfigResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.ErrorMessage"));
		updateLinkeBahamutAdmintenantidconfigResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutAdmintenantidconfigResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Message"));
		updateLinkeBahamutAdmintenantidconfigResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutAdmintenantidconfigResponse.ResponseStatusCode"));
		updateLinkeBahamutAdmintenantidconfigResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Success"));

		Result result = new Result();
		result.setAntflowEnabled(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.AntflowEnabled"));
		result.setAppChangeNeedNotice(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.AppChangeNeedNotice"));
		result.setAppInitMeta(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.AppInitMeta"));
		result.setAutoAppReleaseStatus(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.AutoAppReleaseStatus"));
		result.setAutoReleaseMachine(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.AutoReleaseMachine"));
		result.setAutoUnbindMachine(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.AutoUnbindMachine"));
		result.setBaseJarInfo(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.BaseJarInfo"));
		result.setCheckAntWatchRiskControl(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.CheckAntWatchRiskControl"));
		result.setCheckRunningPreBuildTask(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.CheckRunningPreBuildTask"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.Created"));
		result.setCreateMrWhenMergeConflicts(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.CreateMrWhenMergeConflicts"));
		result.setCreateOrImportAppNeedApproval(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.CreateOrImportAppNeedApproval"));
		result.setCrossCloud(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.CrossCloud"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.Deleted"));
		result.setGetSecretFromLinku(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.GetSecretFromLinku"));
		result.setGitLabAccount(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.GitLabAccount"));
		result.setGitLabPrivateToken(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.GitLabPrivateToken"));
		result.setGitLabSite(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.GitLabSite"));
		result.setGitLabUser(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.GitLabUser"));
		result.setHighAvailabilityEnabled(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.HighAvailabilityEnabled"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.Id"));
		result.setJarEnabled(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.JarEnabled"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.LastModified"));
		result.setLinkcApiHost(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.LinkcApiHost"));
		result.setLinkcFrontHost(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.LinkcFrontHost"));
		result.setLinksEnable(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.LinksEnable"));
		result.setLinktFrontHost(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.LinktFrontHost"));
		result.setMergeRequestEnabled(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.MergeRequestEnabled"));
		result.setMvnJarInfo(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.MvnJarInfo"));
		result.setMyCodeCenterHost(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.MyCodeCenterHost"));
		result.setOnexMode(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.OnexMode"));
		result.setOriginOSSConfig(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.OriginOSSConfig"));
		result.setOssConfig(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.OssConfig"));
		result.setPreConfirmArchDomainMap(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.PreConfirmArchDomainMap"));
		result.setQualityIndices(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.QualityIndices"));
		result.setRealGitLabSite(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.RealGitLabSite"));
		result.setReleaseControlEnabled(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.ReleaseControlEnabled"));
		result.setSettingsFile(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.SettingsFile"));
		result.setSkipPreCheck(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.SkipPreCheck"));
		result.setStartAccCallback(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.StartAccCallback"));
		result.setTenantId(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.TenantId"));
		result.setTokens(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.Tokens"));
		result.setUpdateAppMetaWhenSync(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.UpdateAppMetaWhenSync"));
		result.setUseAppReleaseView(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.UseAppReleaseView"));
		result.setUseBaselineToRelease(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.UseBaselineToRelease"));
		result.setUseCustomOss(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.UseCustomOss"));
		result.setUseNewCloudAppImportView(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.UseNewCloudAppImportView"));
		result.setUseNewPrePubEnvIdList(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.UseNewPrePubEnvIdList"));
		result.setUseNewThirdPartyWay(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.UseNewThirdPartyWay"));
		result.setUseOldFabricPreCheck(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.UseOldFabricPreCheck"));
		result.setUseShareMiddleware(_ctx.booleanValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.UseShareMiddleware"));
		result.setWebHookUrl(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.WebHookUrl"));

		List<String> defaultQualityRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.DefaultQualityRules.Length"); i++) {
			defaultQualityRules.add(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.DefaultQualityRules["+ i +"]"));
		}
		result.setDefaultQualityRules(defaultQualityRules);

		List<String> gitlabSitePrefixs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.GitlabSitePrefixs.Length"); i++) {
			gitlabSitePrefixs.add(_ctx.stringValue("UpdateLinkeBahamutAdmintenantidconfigResponse.Result.GitlabSitePrefixs["+ i +"]"));
		}
		result.setGitlabSitePrefixs(gitlabSitePrefixs);
		updateLinkeBahamutAdmintenantidconfigResponse.setResult(result);
	 
	 	return updateLinkeBahamutAdmintenantidconfigResponse;
	}
}