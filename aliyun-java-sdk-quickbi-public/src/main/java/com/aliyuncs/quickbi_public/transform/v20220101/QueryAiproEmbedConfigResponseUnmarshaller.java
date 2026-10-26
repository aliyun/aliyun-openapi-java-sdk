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

import com.aliyuncs.quickbi_public.model.v20220101.QueryAiproEmbedConfigResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryAiproEmbedConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAiproEmbedConfigResponseUnmarshaller {

	public static QueryAiproEmbedConfigResponse unmarshall(QueryAiproEmbedConfigResponse queryAiproEmbedConfigResponse, UnmarshallerContext _ctx) {
		
		queryAiproEmbedConfigResponse.setRequestId(_ctx.stringValue("QueryAiproEmbedConfigResponse.RequestId"));
		queryAiproEmbedConfigResponse.setSuccess(_ctx.booleanValue("QueryAiproEmbedConfigResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("QueryAiproEmbedConfigResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setStatus(_ctx.integerValue("QueryAiproEmbedConfigResponse.Result["+ i +"].Status"));
			data.setChatHistoryStatus(_ctx.integerValue("QueryAiproEmbedConfigResponse.Result["+ i +"].ChatHistoryStatus"));
			data.setNextToken(_ctx.stringValue("QueryAiproEmbedConfigResponse.Result["+ i +"].NextToken"));
			data.setConfig(_ctx.stringValue("QueryAiproEmbedConfigResponse.Result["+ i +"].Config"));
			data.setMemoryEnabled(_ctx.integerValue("QueryAiproEmbedConfigResponse.Result["+ i +"].MemoryEnabled"));
			data.setMaxResults(_ctx.integerValue("QueryAiproEmbedConfigResponse.Result["+ i +"].MaxResults"));
			data.setUploadEnabled(_ctx.integerValue("QueryAiproEmbedConfigResponse.Result["+ i +"].UploadEnabled"));
			data.setAgentName(_ctx.stringValue("QueryAiproEmbedConfigResponse.Result["+ i +"].AgentName"));
			data.setShowName(_ctx.stringValue("QueryAiproEmbedConfigResponse.Result["+ i +"].ShowName"));
			data.setAiProId(_ctx.stringValue("QueryAiproEmbedConfigResponse.Result["+ i +"].AiProId"));

			result.add(data);
		}
		queryAiproEmbedConfigResponse.setResult(result);
	 
	 	return queryAiproEmbedConfigResponse;
	}
}