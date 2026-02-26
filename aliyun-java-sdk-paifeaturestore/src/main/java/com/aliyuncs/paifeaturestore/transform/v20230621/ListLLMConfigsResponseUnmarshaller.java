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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paifeaturestore.model.v20230621.ListLLMConfigsResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.ListLLMConfigsResponse.LlmConfigsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLLMConfigsResponseUnmarshaller {

	public static ListLLMConfigsResponse unmarshall(ListLLMConfigsResponse listLLMConfigsResponse, UnmarshallerContext _ctx) {
		
		listLLMConfigsResponse.setRequestId(_ctx.stringValue("ListLLMConfigsResponse.RequestId"));
		listLLMConfigsResponse.setTotalCount(_ctx.longValue("ListLLMConfigsResponse.TotalCount"));
		listLLMConfigsResponse.setNextToken(_ctx.stringValue("ListLLMConfigsResponse.NextToken"));
		listLLMConfigsResponse.setMaxResults(_ctx.integerValue("ListLLMConfigsResponse.MaxResults"));

		List<LlmConfigsItem> lLMConfigs = new ArrayList<LlmConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLLMConfigsResponse.LLMConfigs.Length"); i++) {
			LlmConfigsItem llmConfigsItem = new LlmConfigsItem();
			llmConfigsItem.setLLMConfigId(_ctx.stringValue("ListLLMConfigsResponse.LLMConfigs["+ i +"].LLMConfigId"));
			llmConfigsItem.setName(_ctx.stringValue("ListLLMConfigsResponse.LLMConfigs["+ i +"].Name"));
			llmConfigsItem.setApiKey(_ctx.stringValue("ListLLMConfigsResponse.LLMConfigs["+ i +"].ApiKey"));
			llmConfigsItem.setModel(_ctx.stringValue("ListLLMConfigsResponse.LLMConfigs["+ i +"].Model"));
			llmConfigsItem.setBaseUrl(_ctx.stringValue("ListLLMConfigsResponse.LLMConfigs["+ i +"].BaseUrl"));
			llmConfigsItem.setRps(_ctx.integerValue("ListLLMConfigsResponse.LLMConfigs["+ i +"].Rps"));
			llmConfigsItem.setMaxTokens(_ctx.integerValue("ListLLMConfigsResponse.LLMConfigs["+ i +"].MaxTokens"));
			llmConfigsItem.setGmtCreateTime(_ctx.stringValue("ListLLMConfigsResponse.LLMConfigs["+ i +"].GmtCreateTime"));
			llmConfigsItem.setGmtModifiedTime(_ctx.stringValue("ListLLMConfigsResponse.LLMConfigs["+ i +"].GmtModifiedTime"));
			llmConfigsItem.setResourceGroupId(_ctx.stringValue("ListLLMConfigsResponse.LLMConfigs["+ i +"].ResourceGroupId"));
			llmConfigsItem.setBatchSize(_ctx.integerValue("ListLLMConfigsResponse.LLMConfigs["+ i +"].BatchSize"));
			llmConfigsItem.setWorkspaceId(_ctx.stringValue("ListLLMConfigsResponse.LLMConfigs["+ i +"].WorkspaceId"));

			lLMConfigs.add(llmConfigsItem);
		}
		listLLMConfigsResponse.setLLMConfigs(lLMConfigs);
	 
	 	return listLLMConfigsResponse;
	}
}