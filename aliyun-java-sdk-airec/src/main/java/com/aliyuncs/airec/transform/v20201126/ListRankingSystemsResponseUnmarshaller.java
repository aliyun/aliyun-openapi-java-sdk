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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListRankingSystemsResponse;
import com.aliyuncs.airec.model.v20201126.ListRankingSystemsResponse.ResultItem;
import com.aliyuncs.airec.model.v20201126.ListRankingSystemsResponse.ResultItem.Meta;
import com.aliyuncs.airec.model.v20201126.ListRankingSystemsResponse.ResultItem.Meta.PredictEngine;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRankingSystemsResponseUnmarshaller {

	public static ListRankingSystemsResponse unmarshall(ListRankingSystemsResponse listRankingSystemsResponse, UnmarshallerContext _ctx) {
		
		listRankingSystemsResponse.setRequestId(_ctx.stringValue("ListRankingSystemsResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRankingSystemsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setApplyStatus(_ctx.stringValue("ListRankingSystemsResponse.result["+ i +"].ApplyStatus"));
			resultItem.setDeployStatus(_ctx.stringValue("ListRankingSystemsResponse.result["+ i +"].DeployStatus"));
			resultItem.setName(_ctx.stringValue("ListRankingSystemsResponse.result["+ i +"].Name"));
			resultItem.setModelTemplateId(_ctx.stringValue("ListRankingSystemsResponse.result["+ i +"].ModelTemplateId"));

			List<Long> sceneIdList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListRankingSystemsResponse.result["+ i +"].SceneIdList.Length"); j++) {
				sceneIdList.add(_ctx.longValue("ListRankingSystemsResponse.result["+ i +"].SceneIdList["+ j +"]"));
			}
			resultItem.setSceneIdList(sceneIdList);

			Meta meta = new Meta();
			meta.setAutoDeploy(_ctx.booleanValue("ListRankingSystemsResponse.result["+ i +"].Meta.AutoDeploy"));
			meta.setAutoDeployAuc(_ctx.stringValue("ListRankingSystemsResponse.result["+ i +"].Meta.AutoDeployAuc"));
			meta.setConf(_ctx.stringValue("ListRankingSystemsResponse.result["+ i +"].Meta.Conf"));
			meta.setPredictEngineType(_ctx.stringValue("ListRankingSystemsResponse.result["+ i +"].Meta.PredictEngineType"));
			meta.setModelVersionName(_ctx.stringValue("ListRankingSystemsResponse.result["+ i +"].Meta.ModelVersionName"));
			meta.setFailMsg(_ctx.stringValue("ListRankingSystemsResponse.result["+ i +"].Meta.FailMsg"));

			PredictEngine predictEngine = new PredictEngine();
			predictEngine.setResourceId(_ctx.stringValue("ListRankingSystemsResponse.result["+ i +"].Meta.PredictEngine.ResourceId"));
			predictEngine.setVersion(_ctx.stringValue("ListRankingSystemsResponse.result["+ i +"].Meta.PredictEngine.Version"));
			predictEngine.setClusterId(_ctx.stringValue("ListRankingSystemsResponse.result["+ i +"].Meta.PredictEngine.ClusterId"));
			meta.setPredictEngine(predictEngine);
			resultItem.setMeta(meta);

			result.add(resultItem);
		}
		listRankingSystemsResponse.setResult(result);
	 
	 	return listRankingSystemsResponse;
	}
}