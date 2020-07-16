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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.ListDeployedAlgorithmModelsResponse;
import com.aliyuncs.opensearch.model.v20171225.ListDeployedAlgorithmModelsResponse.ResultItem;
import com.aliyuncs.opensearch.model.v20171225.ListDeployedAlgorithmModelsResponse.ResultItem.ModelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeployedAlgorithmModelsResponseUnmarshaller {

	public static ListDeployedAlgorithmModelsResponse unmarshall(ListDeployedAlgorithmModelsResponse listDeployedAlgorithmModelsResponse, UnmarshallerContext _ctx) {
		
		listDeployedAlgorithmModelsResponse.setRequestId(_ctx.stringValue("ListDeployedAlgorithmModelsResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDeployedAlgorithmModelsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.stringValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].id"));
			resultItem.setAppGroupName(_ctx.stringValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].appGroupName"));
			resultItem.setScene(_ctx.stringValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].scene"));
			resultItem.setDesc(_ctx.stringValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].desc"));
			resultItem.setGmtCreate(_ctx.stringValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].gmtCreate"));
			resultItem.setGmtModified(_ctx.stringValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].gmtModified"));
			resultItem.setStatus(_ctx.stringValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].status"));

			List<String> apps = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].apps.Length"); j++) {
				apps.add(_ctx.stringValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].apps["+ j +"]"));
			}
			resultItem.setApps(apps);

			List<ModelsItem> models = new ArrayList<ModelsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].models.Length"); j++) {
				ModelsItem modelsItem = new ModelsItem();
				modelsItem.setModelName(_ctx.stringValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].models["+ j +"].modelName"));
				modelsItem.setModelId(_ctx.integerValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].models["+ j +"].modelId"));
				modelsItem.setProgress(_ctx.integerValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].models["+ j +"].progress"));
				modelsItem.setStatus(_ctx.stringValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].models["+ j +"].status"));
				modelsItem.setProjectId(_ctx.integerValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].models["+ j +"].projectId"));
				modelsItem.setAlgorithmType(_ctx.stringValue("ListDeployedAlgorithmModelsResponse.result["+ i +"].models["+ j +"].algorithmType"));

				models.add(modelsItem);
			}
			resultItem.setModels(models);

			result.add(resultItem);
		}
		listDeployedAlgorithmModelsResponse.setResult(result);
	 
	 	return listDeployedAlgorithmModelsResponse;
	}
}