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

import com.aliyuncs.airec.model.v20201126.DeleteRankingSystemResponse;
import com.aliyuncs.airec.model.v20201126.DeleteRankingSystemResponse.Result;
import com.aliyuncs.airec.model.v20201126.DeleteRankingSystemResponse.Result.Meta;
import com.aliyuncs.airec.model.v20201126.DeleteRankingSystemResponse.Result.Meta.PredictEngine;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRankingSystemResponseUnmarshaller {

	public static DeleteRankingSystemResponse unmarshall(DeleteRankingSystemResponse deleteRankingSystemResponse, UnmarshallerContext _ctx) {
		
		deleteRankingSystemResponse.setRequestId(_ctx.stringValue("DeleteRankingSystemResponse.requestId"));

		Result result = new Result();
		result.setApplyStatus(_ctx.stringValue("DeleteRankingSystemResponse.result.ApplyStatus"));
		result.setDeployStatus(_ctx.stringValue("DeleteRankingSystemResponse.result.DeployStatus"));
		result.setName(_ctx.stringValue("DeleteRankingSystemResponse.result.Name"));
		result.setModelTemplateId(_ctx.stringValue("DeleteRankingSystemResponse.result.ModelTemplateId"));

		List<Long> sceneIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("DeleteRankingSystemResponse.result.SceneIdList.Length"); i++) {
			sceneIdList.add(_ctx.longValue("DeleteRankingSystemResponse.result.SceneIdList["+ i +"]"));
		}
		result.setSceneIdList(sceneIdList);

		Meta meta = new Meta();
		meta.setAutoDeploy(_ctx.booleanValue("DeleteRankingSystemResponse.result.Meta.AutoDeploy"));
		meta.setAutoDeployAuc(_ctx.stringValue("DeleteRankingSystemResponse.result.Meta.AutoDeployAuc"));
		meta.setConf(_ctx.stringValue("DeleteRankingSystemResponse.result.Meta.Conf"));
		meta.setPredictEngineType(_ctx.stringValue("DeleteRankingSystemResponse.result.Meta.PredictEngineType"));
		meta.setModelVersionName(_ctx.stringValue("DeleteRankingSystemResponse.result.Meta.ModelVersionName"));
		meta.setFailMsg(_ctx.stringValue("DeleteRankingSystemResponse.result.Meta.FailMsg"));

		PredictEngine predictEngine = new PredictEngine();
		predictEngine.setResourceId(_ctx.stringValue("DeleteRankingSystemResponse.result.Meta.PredictEngine.ResourceId"));
		predictEngine.setVersion(_ctx.stringValue("DeleteRankingSystemResponse.result.Meta.PredictEngine.Version"));
		predictEngine.setClusterId(_ctx.stringValue("DeleteRankingSystemResponse.result.Meta.PredictEngine.ClusterId"));
		meta.setPredictEngine(predictEngine);
		result.setMeta(meta);
		deleteRankingSystemResponse.setResult(result);
	 
	 	return deleteRankingSystemResponse;
	}
}