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

import com.aliyuncs.dataphin_public.model.v20230630.GetLlmModelProvidersResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetLlmModelProvidersResponse.DataItem;
import com.aliyuncs.dataphin_public.model.v20230630.GetLlmModelProvidersResponse.DataItem.LlmModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLlmModelProvidersResponseUnmarshaller {

	public static GetLlmModelProvidersResponse unmarshall(GetLlmModelProvidersResponse getLlmModelProvidersResponse, UnmarshallerContext _ctx) {
		
		getLlmModelProvidersResponse.setRequestId(_ctx.stringValue("GetLlmModelProvidersResponse.RequestId"));
		getLlmModelProvidersResponse.setMessage(_ctx.stringValue("GetLlmModelProvidersResponse.Message"));
		getLlmModelProvidersResponse.setHttpStatusCode(_ctx.integerValue("GetLlmModelProvidersResponse.HttpStatusCode"));
		getLlmModelProvidersResponse.setCode(_ctx.stringValue("GetLlmModelProvidersResponse.Code"));
		getLlmModelProvidersResponse.setSuccess(_ctx.booleanValue("GetLlmModelProvidersResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLlmModelProvidersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setServiceProvider(_ctx.stringValue("GetLlmModelProvidersResponse.Data["+ i +"].ServiceProvider"));
			dataItem.setEnabled(_ctx.booleanValue("GetLlmModelProvidersResponse.Data["+ i +"].Enabled"));
			dataItem.setProviderSource(_ctx.stringValue("GetLlmModelProvidersResponse.Data["+ i +"].ProviderSource"));
			dataItem.setId(_ctx.longValue("GetLlmModelProvidersResponse.Data["+ i +"].Id"));
			dataItem.setBaseUrl(_ctx.stringValue("GetLlmModelProvidersResponse.Data["+ i +"].BaseUrl"));
			dataItem.setProviderType(_ctx.stringValue("GetLlmModelProvidersResponse.Data["+ i +"].ProviderType"));

			List<LlmModel> llmModels = new ArrayList<LlmModel>();
			for (int j = 0; j < _ctx.lengthValue("GetLlmModelProvidersResponse.Data["+ i +"].LlmModels.Length"); j++) {
				LlmModel llmModel = new LlmModel();
				llmModel.setCnName(_ctx.stringValue("GetLlmModelProvidersResponse.Data["+ i +"].LlmModels["+ j +"].CnName"));
				llmModel.setDescription(_ctx.stringValue("GetLlmModelProvidersResponse.Data["+ i +"].LlmModels["+ j +"].Description"));
				llmModel.setServiceProvider(_ctx.stringValue("GetLlmModelProvidersResponse.Data["+ i +"].LlmModels["+ j +"].ServiceProvider"));
				llmModel.setInvokeType(_ctx.stringValue("GetLlmModelProvidersResponse.Data["+ i +"].LlmModels["+ j +"].InvokeType"));
				llmModel.setEnabled(_ctx.booleanValue("GetLlmModelProvidersResponse.Data["+ i +"].LlmModels["+ j +"].Enabled"));
				llmModel.setModelId(_ctx.longValue("GetLlmModelProvidersResponse.Data["+ i +"].LlmModels["+ j +"].ModelId"));
				llmModel.setName(_ctx.stringValue("GetLlmModelProvidersResponse.Data["+ i +"].LlmModels["+ j +"].Name"));

				List<String> modelTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetLlmModelProvidersResponse.Data["+ i +"].LlmModels["+ j +"].ModelTypes.Length"); k++) {
					modelTypes.add(_ctx.stringValue("GetLlmModelProvidersResponse.Data["+ i +"].LlmModels["+ j +"].ModelTypes["+ k +"]"));
				}
				llmModel.setModelTypes(modelTypes);

				List<String> tasks = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetLlmModelProvidersResponse.Data["+ i +"].LlmModels["+ j +"].Tasks.Length"); k++) {
					tasks.add(_ctx.stringValue("GetLlmModelProvidersResponse.Data["+ i +"].LlmModels["+ j +"].Tasks["+ k +"]"));
				}
				llmModel.setTasks(tasks);

				List<Integer> embeddingDimensions = new ArrayList<Integer>();
				for (int k = 0; k < _ctx.lengthValue("GetLlmModelProvidersResponse.Data["+ i +"].LlmModels["+ j +"].EmbeddingDimensions.Length"); k++) {
					embeddingDimensions.add(_ctx.integerValue("GetLlmModelProvidersResponse.Data["+ i +"].LlmModels["+ j +"].EmbeddingDimensions["+ k +"]"));
				}
				llmModel.setEmbeddingDimensions(embeddingDimensions);

				llmModels.add(llmModel);
			}
			dataItem.setLlmModels(llmModels);

			data.add(dataItem);
		}
		getLlmModelProvidersResponse.setData(data);
	 
	 	return getLlmModelProvidersResponse;
	}
}