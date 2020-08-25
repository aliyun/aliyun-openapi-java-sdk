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
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeBahamutBuildconfigResponseUnmarshaller {

	public static SaveLinkeBahamutBuildconfigResponse unmarshall(SaveLinkeBahamutBuildconfigResponse saveLinkeBahamutBuildconfigResponse, UnmarshallerContext _ctx) {
		
		saveLinkeBahamutBuildconfigResponse.setRequestId(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.RequestId"));
		saveLinkeBahamutBuildconfigResponse.setResultCode(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.ResultCode"));
		saveLinkeBahamutBuildconfigResponse.setResultMessage(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.ResultMessage"));
		saveLinkeBahamutBuildconfigResponse.setErrorMessage(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.ErrorMessage"));
		saveLinkeBahamutBuildconfigResponse.setErrorMsgParamsMap(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.ErrorMsgParamsMap"));
		saveLinkeBahamutBuildconfigResponse.setMessage(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Message"));
		saveLinkeBahamutBuildconfigResponse.setResponseStatusCode(_ctx.longValue("SaveLinkeBahamutBuildconfigResponse.ResponseStatusCode"));
		saveLinkeBahamutBuildconfigResponse.setSuccess(_ctx.booleanValue("SaveLinkeBahamutBuildconfigResponse.Success"));

		Result result = new Result();
		result.setDefaultRegistryConfig(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.DefaultRegistryConfig"));
		result.setOssConfig(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.OssConfig"));
		result.setUseCustomProductOss(_ctx.booleanValue("SaveLinkeBahamutBuildconfigResponse.Result.UseCustomProductOss"));

		List<String> registryConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveLinkeBahamutBuildconfigResponse.Result.RegistryConfigs.Length"); i++) {
			registryConfigs.add(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.RegistryConfigs["+ i +"]"));
		}
		result.setRegistryConfigs(registryConfigs);

		List<String> settingsFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveLinkeBahamutBuildconfigResponse.Result.SettingsFiles.Length"); i++) {
			settingsFiles.add(_ctx.stringValue("SaveLinkeBahamutBuildconfigResponse.Result.SettingsFiles["+ i +"]"));
		}
		result.setSettingsFiles(settingsFiles);
		saveLinkeBahamutBuildconfigResponse.setResult(result);
	 
	 	return saveLinkeBahamutBuildconfigResponse;
	}
}