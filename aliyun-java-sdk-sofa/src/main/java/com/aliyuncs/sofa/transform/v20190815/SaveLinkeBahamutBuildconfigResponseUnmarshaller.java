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

import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutBuildconfigResponse;
import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutBuildconfigResponse.Result;
import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutBuildconfigResponse.Result.OssConfig;
import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutBuildconfigResponse.Result.RegistryConfigsItem;
import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutBuildconfigResponse.Result.SettingsFilesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeBahamutBuildconfigResponseUnmarshaller {

	public static SaveLinkeBahamutBuildconfigResponse unmarshall(SaveLinkeBahamutBuildconfigResponse saveLinkeBahamutBuildconfigResponse, UnmarshallerContext _ctx) {
		
		saveLinkeBahamutBuildconfigResponse.setRequestId(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.RequestId"));
		saveLinkeBahamutBuildconfigResponse.setResultCode(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.ResultCode"));
		saveLinkeBahamutBuildconfigResponse.setResultMessage(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.ResultMessage"));
		saveLinkeBahamutBuildconfigResponse.setErrorMessage(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.ErrorMessage"));
		saveLinkeBahamutBuildconfigResponse.setMessage(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Message"));
		saveLinkeBahamutBuildconfigResponse.setSuccess(_ctx.booleanValue("SaveLinkeBahamutBuildconfigResponse.Success"));

		Result result = new Result();
		result.setUseCustomProductOss(_ctx.booleanValue("SaveLinkeBahamutBuildconfigResponse.Result.UseCustomProductOss"));

		OssConfig ossConfig = new OssConfig();
		ossConfig.setAvaliable(_ctx.booleanValue("SaveLinkeBahamutBuildconfigResponse.Result.OssConfig.Avaliable"));
		ossConfig.setOssAccessId(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.OssConfig.OssAccessId"));
		ossConfig.setOssAccessKey(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.OssConfig.OssAccessKey"));
		ossConfig.setOssBucketName(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.OssConfig.OssBucketName"));
		ossConfig.setOssEndpoint(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.OssConfig.OssEndpoint"));
		result.setOssConfig(ossConfig);

		List<RegistryConfigsItem> registryConfigs = new ArrayList<RegistryConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("SaveLinkeBahamutBuildconfigResponse.Result.RegistryConfigs.Length"); i++) {
			RegistryConfigsItem registryConfigsItem = new RegistryConfigsItem();
			registryConfigsItem.setHost(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.RegistryConfigs["+ i +"].Host"));
			registryConfigsItem.setToken(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.RegistryConfigs["+ i +"].Token"));
			registryConfigsItem.setUser(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.RegistryConfigs["+ i +"].User"));

			List<String> secretKeys = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SaveLinkeBahamutBuildconfigResponse.Result.RegistryConfigs["+ i +"].SecretKeys.Length"); j++) {
				secretKeys.add(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.RegistryConfigs["+ i +"].SecretKeys["+ j +"]"));
			}
			registryConfigsItem.setSecretKeys(secretKeys);

			registryConfigs.add(registryConfigsItem);
		}
		result.setRegistryConfigs(registryConfigs);

		List<SettingsFilesItem> settingsFiles = new ArrayList<SettingsFilesItem>();
		for (int i = 0; i < _ctx.lengthValue("SaveLinkeBahamutBuildconfigResponse.Result.SettingsFiles.Length"); i++) {
			SettingsFilesItem settingsFilesItem = new SettingsFilesItem();
			settingsFilesItem.setFullUrl(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.SettingsFiles["+ i +"].FullUrl"));
			settingsFilesItem.setName(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.SettingsFiles["+ i +"].Name"));
			settingsFilesItem.setType(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.SettingsFiles["+ i +"].Type"));
			settingsFilesItem.setUid(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.SettingsFiles["+ i +"].Uid"));
			settingsFilesItem.setUrl(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.SettingsFiles["+ i +"].Url"));

			settingsFiles.add(settingsFilesItem);
		}
		result.setSettingsFiles(settingsFiles);
		saveLinkeBahamutBuildconfigResponse.setResult(result);
	 
	 	return saveLinkeBahamutBuildconfigResponse;
	}
}