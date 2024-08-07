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

import com.aliyuncs.quickbi_public.model.v20220101.QueryCopilotEmbedConfigResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryCopilotEmbedConfigResponse.ResultItem;
import com.aliyuncs.quickbi_public.model.v20220101.QueryCopilotEmbedConfigResponse.ResultItem.DataRange;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCopilotEmbedConfigResponseUnmarshaller {

	public static QueryCopilotEmbedConfigResponse unmarshall(QueryCopilotEmbedConfigResponse queryCopilotEmbedConfigResponse, UnmarshallerContext _ctx) {
		
		queryCopilotEmbedConfigResponse.setRequestId(_ctx.stringValue("QueryCopilotEmbedConfigResponse.RequestId"));
		queryCopilotEmbedConfigResponse.setSuccess(_ctx.booleanValue("QueryCopilotEmbedConfigResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCopilotEmbedConfigResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCopilotId(_ctx.stringValue("QueryCopilotEmbedConfigResponse.Result["+ i +"].CopilotId"));
			resultItem.setShowName(_ctx.stringValue("QueryCopilotEmbedConfigResponse.Result["+ i +"].ShowName"));
			resultItem.setCreateUser(_ctx.stringValue("QueryCopilotEmbedConfigResponse.Result["+ i +"].CreateUser"));
			resultItem.setCreateUserName(_ctx.stringValue("QueryCopilotEmbedConfigResponse.Result["+ i +"].CreateUserName"));
			resultItem.setModifyUser(_ctx.stringValue("QueryCopilotEmbedConfigResponse.Result["+ i +"].ModifyUser"));
			resultItem.setModuleName(_ctx.stringValue("QueryCopilotEmbedConfigResponse.Result["+ i +"].ModuleName"));
			resultItem.setAgentName(_ctx.stringValue("QueryCopilotEmbedConfigResponse.Result["+ i +"].AgentName"));

			DataRange dataRange = new DataRange();
			dataRange.setAllTheme(_ctx.booleanValue("QueryCopilotEmbedConfigResponse.Result["+ i +"].DataRange.AllTheme"));
			dataRange.setAllCube(_ctx.booleanValue("QueryCopilotEmbedConfigResponse.Result["+ i +"].DataRange.AllCube"));

			List<String> themes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCopilotEmbedConfigResponse.Result["+ i +"].DataRange.Themes.Length"); j++) {
				themes.add(_ctx.stringValue("QueryCopilotEmbedConfigResponse.Result["+ i +"].DataRange.Themes["+ j +"]"));
			}
			dataRange.setThemes(themes);

			List<String> llmCubes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCopilotEmbedConfigResponse.Result["+ i +"].DataRange.LlmCubes.Length"); j++) {
				llmCubes.add(_ctx.stringValue("QueryCopilotEmbedConfigResponse.Result["+ i +"].DataRange.LlmCubes["+ j +"]"));
			}
			dataRange.setLlmCubes(llmCubes);
			resultItem.setDataRange(dataRange);

			result.add(resultItem);
		}
		queryCopilotEmbedConfigResponse.setResult(result);
	 
	 	return queryCopilotEmbedConfigResponse;
	}
}