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

import com.aliyuncs.paifeaturestore.model.v20230621.GetLLMConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLLMConfigResponseUnmarshaller {

	public static GetLLMConfigResponse unmarshall(GetLLMConfigResponse getLLMConfigResponse, UnmarshallerContext _ctx) {
		
		getLLMConfigResponse.setRequestId(_ctx.stringValue("GetLLMConfigResponse.RequestId"));
		getLLMConfigResponse.setLLMConfigId(_ctx.stringValue("GetLLMConfigResponse.LLMConfigId"));
		getLLMConfigResponse.setName(_ctx.stringValue("GetLLMConfigResponse.Name"));
		getLLMConfigResponse.setApiKey(_ctx.stringValue("GetLLMConfigResponse.ApiKey"));
		getLLMConfigResponse.setModel(_ctx.stringValue("GetLLMConfigResponse.Model"));
		getLLMConfigResponse.setBaseUrl(_ctx.stringValue("GetLLMConfigResponse.BaseUrl"));
		getLLMConfigResponse.setRps(_ctx.integerValue("GetLLMConfigResponse.Rps"));
		getLLMConfigResponse.setMaxTokens(_ctx.integerValue("GetLLMConfigResponse.MaxTokens"));
		getLLMConfigResponse.setGmtCreateTime(_ctx.stringValue("GetLLMConfigResponse.GmtCreateTime"));
		getLLMConfigResponse.setGmtModifiedTime(_ctx.stringValue("GetLLMConfigResponse.GmtModifiedTime"));
		getLLMConfigResponse.setBatchSize(_ctx.integerValue("GetLLMConfigResponse.BatchSize"));
		getLLMConfigResponse.setWorkspaceId(_ctx.stringValue("GetLLMConfigResponse.WorkspaceId"));
	 
	 	return getLLMConfigResponse;
	}
}