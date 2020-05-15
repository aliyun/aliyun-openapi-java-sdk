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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutBuildconfigResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutBuildconfigResponse.Result;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutBuildconfigResponse.Result.OssConfig;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutBuildconfigResponse.Result.RegistryConfigsItem;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutBuildconfigResponse.Result.SettingsFilesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutBuildconfigResponseUnmarshaller {

	public static QueryLinkeBahamutBuildconfigResponse unmarshall(QueryLinkeBahamutBuildconfigResponse queryLinkeBahamutBuildconfigResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutBuildconfigResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.RequestId"));
		queryLinkeBahamutBuildconfigResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.ResultCode"));
		queryLinkeBahamutBuildconfigResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.ResultMessage"));
		queryLinkeBahamutBuildconfigResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.ErrorMessage"));
		queryLinkeBahamutBuildconfigResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Message"));
		queryLinkeBahamutBuildconfigResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutBuildconfigResponse.Success"));

		Result result = new Result();
		result.setUseCustomProductOss(_ctx.booleanValue("QueryLinkeBahamutBuildconfigResponse.Result.UseCustomProductOss"));

		OssConfig ossConfig = new OssConfig();
		ossConfig.setAvaliable(_ctx.booleanValue("QueryLinkeBahamutBuildconfigResponse.Result.OssConfig.Avaliable"));
		ossConfig.setOssAccessId(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.OssConfig.OssAccessId"));
		ossConfig.setOssAccessKey(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.OssConfig.OssAccessKey"));
		ossConfig.setOssBucketName(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.OssConfig.OssBucketName"));
		ossConfig.setOssEndpoint(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.OssConfig.OssEndpoint"));
		result.setOssConfig(ossConfig);

		List<RegistryConfigsItem> registryConfigs = new ArrayList<RegistryConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutBuildconfigResponse.Result.RegistryConfigs.Length"); i++) {
			RegistryConfigsItem registryConfigsItem = new RegistryConfigsItem();
			registryConfigsItem.setHost(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.RegistryConfigs["+ i +"].Host"));
			registryConfigsItem.setToken(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.RegistryConfigs["+ i +"].Token"));
			registryConfigsItem.setUser(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.RegistryConfigs["+ i +"].User"));

			List<String> secretKeys = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutBuildconfigResponse.Result.RegistryConfigs["+ i +"].SecretKeys.Length"); j++) {
				secretKeys.add(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.RegistryConfigs["+ i +"].SecretKeys["+ j +"]"));
			}
			registryConfigsItem.setSecretKeys(secretKeys);

			registryConfigs.add(registryConfigsItem);
		}
		result.setRegistryConfigs(registryConfigs);

		List<SettingsFilesItem> settingsFiles = new ArrayList<SettingsFilesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutBuildconfigResponse.Result.SettingsFiles.Length"); i++) {
			SettingsFilesItem settingsFilesItem = new SettingsFilesItem();
			settingsFilesItem.setFullUrl(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.SettingsFiles["+ i +"].FullUrl"));
			settingsFilesItem.setName(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.SettingsFiles["+ i +"].Name"));
			settingsFilesItem.setType(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.SettingsFiles["+ i +"].Type"));
			settingsFilesItem.setUid(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.SettingsFiles["+ i +"].Uid"));
			settingsFilesItem.setUrl(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.SettingsFiles["+ i +"].Url"));

			settingsFiles.add(settingsFilesItem);
		}
		result.setSettingsFiles(settingsFiles);
		queryLinkeBahamutBuildconfigResponse.setResult(result);
	 
	 	return queryLinkeBahamutBuildconfigResponse;
	}
}