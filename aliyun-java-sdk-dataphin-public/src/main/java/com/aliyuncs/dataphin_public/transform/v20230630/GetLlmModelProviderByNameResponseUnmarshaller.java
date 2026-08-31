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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetLlmModelProviderByNameResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetLlmModelProviderByNameResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetLlmModelProviderByNameResponse.Data.LlmModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLlmModelProviderByNameResponseUnmarshaller {

	public static GetLlmModelProviderByNameResponse unmarshall(GetLlmModelProviderByNameResponse getLlmModelProviderByNameResponse, UnmarshallerContext _ctx) {
		
		getLlmModelProviderByNameResponse.setRequestId(_ctx.stringValue("GetLlmModelProviderByNameResponse.RequestId"));
		getLlmModelProviderByNameResponse.setMessage(_ctx.stringValue("GetLlmModelProviderByNameResponse.Message"));
		getLlmModelProviderByNameResponse.setHttpStatusCode(_ctx.integerValue("GetLlmModelProviderByNameResponse.HttpStatusCode"));
		getLlmModelProviderByNameResponse.setCode(_ctx.stringValue("GetLlmModelProviderByNameResponse.Code"));
		getLlmModelProviderByNameResponse.setSuccess(_ctx.booleanValue("GetLlmModelProviderByNameResponse.Success"));

		Data data = new Data();
		data.setServiceProvider(_ctx.stringValue("GetLlmModelProviderByNameResponse.Data.ServiceProvider"));
		data.setEnabled(_ctx.booleanValue("GetLlmModelProviderByNameResponse.Data.Enabled"));
		data.setProviderSource(_ctx.stringValue("GetLlmModelProviderByNameResponse.Data.ProviderSource"));
		data.setId(_ctx.longValue("GetLlmModelProviderByNameResponse.Data.Id"));
		data.setBaseUrl(_ctx.stringValue("GetLlmModelProviderByNameResponse.Data.BaseUrl"));
		data.setProviderType(_ctx.stringValue("GetLlmModelProviderByNameResponse.Data.ProviderType"));

		List<LlmModel> llmModels = new ArrayList<LlmModel>();
		for (int i = 0; i < _ctx.lengthValue("GetLlmModelProviderByNameResponse.Data.LlmModels.Length"); i++) {
			LlmModel llmModel = new LlmModel();
			llmModel.setCnName(_ctx.stringValue("GetLlmModelProviderByNameResponse.Data.LlmModels["+ i +"].CnName"));
			llmModel.setDescription(_ctx.stringValue("GetLlmModelProviderByNameResponse.Data.LlmModels["+ i +"].Description"));
			llmModel.setServiceProvider(_ctx.stringValue("GetLlmModelProviderByNameResponse.Data.LlmModels["+ i +"].ServiceProvider"));
			llmModel.setInvokeType(_ctx.stringValue("GetLlmModelProviderByNameResponse.Data.LlmModels["+ i +"].InvokeType"));
			llmModel.setEnabled(_ctx.booleanValue("GetLlmModelProviderByNameResponse.Data.LlmModels["+ i +"].Enabled"));
			llmModel.setModelId(_ctx.longValue("GetLlmModelProviderByNameResponse.Data.LlmModels["+ i +"].ModelId"));
			llmModel.setName(_ctx.stringValue("GetLlmModelProviderByNameResponse.Data.LlmModels["+ i +"].Name"));

			List<String> modelTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLlmModelProviderByNameResponse.Data.LlmModels["+ i +"].ModelTypes.Length"); j++) {
				modelTypes.add(_ctx.stringValue("GetLlmModelProviderByNameResponse.Data.LlmModels["+ i +"].ModelTypes["+ j +"]"));
			}
			llmModel.setModelTypes(modelTypes);

			List<String> tasks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLlmModelProviderByNameResponse.Data.LlmModels["+ i +"].Tasks.Length"); j++) {
				tasks.add(_ctx.stringValue("GetLlmModelProviderByNameResponse.Data.LlmModels["+ i +"].Tasks["+ j +"]"));
			}
			llmModel.setTasks(tasks);

			List<Integer> embeddingDimensions = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("GetLlmModelProviderByNameResponse.Data.LlmModels["+ i +"].EmbeddingDimensions.Length"); j++) {
				embeddingDimensions.add(_ctx.integerValue("GetLlmModelProviderByNameResponse.Data.LlmModels["+ i +"].EmbeddingDimensions["+ j +"]"));
			}
			llmModel.setEmbeddingDimensions(embeddingDimensions);

			llmModels.add(llmModel);
		}
		data.setLlmModels(llmModels);
		getLlmModelProviderByNameResponse.setData(data);
	 
	 	return getLlmModelProviderByNameResponse;
	}
}