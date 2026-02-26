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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.QueryDataRangeResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDataRangeResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDataRangeResponse.Result.ApiCopilotLlmCubeModelsItem;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDataRangeResponse.Result.ApiCopilotThemeModelsItem;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDataRangeResponse.Result.ApiCopilotThemeModelsItem.ApiCopilotLlmCubeModelsItem2;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDataRangeResponseUnmarshaller {

	public static QueryDataRangeResponse unmarshall(QueryDataRangeResponse queryDataRangeResponse, UnmarshallerContext _ctx) {
		
		queryDataRangeResponse.setRequestId(_ctx.stringValue("QueryDataRangeResponse.RequestId"));
		queryDataRangeResponse.setSuccess(_ctx.booleanValue("QueryDataRangeResponse.Success"));

		Result result = new Result();

		List<ApiCopilotLlmCubeModelsItem> apiCopilotLlmCubeModels = new ArrayList<ApiCopilotLlmCubeModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDataRangeResponse.Result.ApiCopilotLlmCubeModels.Length"); i++) {
			ApiCopilotLlmCubeModelsItem apiCopilotLlmCubeModelsItem = new ApiCopilotLlmCubeModelsItem();
			apiCopilotLlmCubeModelsItem.setAlias(_ctx.stringValue("QueryDataRangeResponse.Result.ApiCopilotLlmCubeModels["+ i +"].Alias"));
			apiCopilotLlmCubeModelsItem.setCreateUser(_ctx.stringValue("QueryDataRangeResponse.Result.ApiCopilotLlmCubeModels["+ i +"].CreateUser"));
			apiCopilotLlmCubeModelsItem.setLlmCubeId(_ctx.stringValue("QueryDataRangeResponse.Result.ApiCopilotLlmCubeModels["+ i +"].LlmCubeId"));

			apiCopilotLlmCubeModels.add(apiCopilotLlmCubeModelsItem);
		}
		result.setApiCopilotLlmCubeModels(apiCopilotLlmCubeModels);

		List<ApiCopilotThemeModelsItem> apiCopilotThemeModels = new ArrayList<ApiCopilotThemeModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDataRangeResponse.Result.ApiCopilotThemeModels.Length"); i++) {
			ApiCopilotThemeModelsItem apiCopilotThemeModelsItem = new ApiCopilotThemeModelsItem();
			apiCopilotThemeModelsItem.setCreateUser(_ctx.stringValue("QueryDataRangeResponse.Result.ApiCopilotThemeModels["+ i +"].CreateUser"));
			apiCopilotThemeModelsItem.setThemeId(_ctx.stringValue("QueryDataRangeResponse.Result.ApiCopilotThemeModels["+ i +"].ThemeId"));
			apiCopilotThemeModelsItem.setThemeName(_ctx.stringValue("QueryDataRangeResponse.Result.ApiCopilotThemeModels["+ i +"].ThemeName"));

			List<ApiCopilotLlmCubeModelsItem2> apiCopilotLlmCubeModels1 = new ArrayList<ApiCopilotLlmCubeModelsItem2>();
			for (int j = 0; j < _ctx.lengthValue("QueryDataRangeResponse.Result.ApiCopilotThemeModels["+ i +"].ApiCopilotLlmCubeModels.Length"); j++) {
				ApiCopilotLlmCubeModelsItem2 apiCopilotLlmCubeModelsItem2 = new ApiCopilotLlmCubeModelsItem2();
				apiCopilotLlmCubeModelsItem2.setAlias(_ctx.stringValue("QueryDataRangeResponse.Result.ApiCopilotThemeModels["+ i +"].ApiCopilotLlmCubeModels["+ j +"].Alias"));
				apiCopilotLlmCubeModelsItem2.setCreateUser(_ctx.stringValue("QueryDataRangeResponse.Result.ApiCopilotThemeModels["+ i +"].ApiCopilotLlmCubeModels["+ j +"].CreateUser"));
				apiCopilotLlmCubeModelsItem2.setLlmCubeId(_ctx.stringValue("QueryDataRangeResponse.Result.ApiCopilotThemeModels["+ i +"].ApiCopilotLlmCubeModels["+ j +"].LlmCubeId"));

				apiCopilotLlmCubeModels1.add(apiCopilotLlmCubeModelsItem2);
			}
			apiCopilotThemeModelsItem.setApiCopilotLlmCubeModels1(apiCopilotLlmCubeModels1);

			apiCopilotThemeModels.add(apiCopilotThemeModelsItem);
		}
		result.setApiCopilotThemeModels(apiCopilotThemeModels);
		queryDataRangeResponse.setResult(result);
	 
	 	return queryDataRangeResponse;
	}
}