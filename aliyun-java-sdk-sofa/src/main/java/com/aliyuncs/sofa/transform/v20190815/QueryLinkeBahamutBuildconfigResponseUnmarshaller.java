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
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutBuildconfigResponseUnmarshaller {

	public static QueryLinkeBahamutBuildconfigResponse unmarshall(QueryLinkeBahamutBuildconfigResponse queryLinkeBahamutBuildconfigResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutBuildconfigResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.RequestId"));
		queryLinkeBahamutBuildconfigResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.ResultCode"));
		queryLinkeBahamutBuildconfigResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.ResultMessage"));
		queryLinkeBahamutBuildconfigResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.ErrorMessage"));
		queryLinkeBahamutBuildconfigResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutBuildconfigResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Message"));
		queryLinkeBahamutBuildconfigResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutBuildconfigResponse.ResponseStatusCode"));
		queryLinkeBahamutBuildconfigResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutBuildconfigResponse.Success"));

		Result result = new Result();
		result.setDefaultRegistryConfig(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.DefaultRegistryConfig"));
		result.setOssConfig(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.OssConfig"));
		result.setUseCustomProductOss(_ctx.booleanValue("QueryLinkeBahamutBuildconfigResponse.Result.UseCustomProductOss"));

		List<String> registryConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutBuildconfigResponse.Result.RegistryConfigs.Length"); i++) {
			registryConfigs.add(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.RegistryConfigs["+ i +"]"));
		}
		result.setRegistryConfigs(registryConfigs);

		List<String> settingsFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutBuildconfigResponse.Result.SettingsFiles.Length"); i++) {
			settingsFiles.add(_ctx.stringValue("QueryLinkeBahamutBuildconfigResponse.Result.SettingsFiles["+ i +"]"));
		}
		result.setSettingsFiles(settingsFiles);
		queryLinkeBahamutBuildconfigResponse.setResult(result);
	 
	 	return queryLinkeBahamutBuildconfigResponse;
	}
}