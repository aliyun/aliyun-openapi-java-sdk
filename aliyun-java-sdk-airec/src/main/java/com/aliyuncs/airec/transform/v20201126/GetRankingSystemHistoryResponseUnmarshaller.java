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

import com.aliyuncs.airec.model.v20201126.GetRankingSystemHistoryResponse;
import com.aliyuncs.airec.model.v20201126.GetRankingSystemHistoryResponse.Result;
import com.aliyuncs.airec.model.v20201126.GetRankingSystemHistoryResponse.Result.Meta;
import com.aliyuncs.airec.model.v20201126.GetRankingSystemHistoryResponse.Result.Meta.PredictEngine;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRankingSystemHistoryResponseUnmarshaller {

	public static GetRankingSystemHistoryResponse unmarshall(GetRankingSystemHistoryResponse getRankingSystemHistoryResponse, UnmarshallerContext _ctx) {
		
		getRankingSystemHistoryResponse.setRequestId(_ctx.stringValue("GetRankingSystemHistoryResponse.requestId"));

		Result result = new Result();
		result.setOperateTime(_ctx.stringValue("GetRankingSystemHistoryResponse.result.OperateTime"));
		result.setOperateId(_ctx.stringValue("GetRankingSystemHistoryResponse.result.OperateId"));
		result.setOperateType(_ctx.stringValue("GetRankingSystemHistoryResponse.result.OperateType"));
		result.setName(_ctx.stringValue("GetRankingSystemHistoryResponse.result.Name"));

		Meta meta = new Meta();
		meta.setAutoDeploy(_ctx.booleanValue("GetRankingSystemHistoryResponse.result.Meta.AutoDeploy"));
		meta.setAutoDeployAuc(_ctx.stringValue("GetRankingSystemHistoryResponse.result.Meta.AutoDeployAuc"));
		meta.setConf(_ctx.stringValue("GetRankingSystemHistoryResponse.result.Meta.Conf"));
		meta.setModelTemplateName(_ctx.stringValue("GetRankingSystemHistoryResponse.result.Meta.ModelTemplateName"));
		meta.setPredictEngineType(_ctx.stringValue("GetRankingSystemHistoryResponse.result.Meta.PredictEngineType"));
		meta.setPreviousOperateId(_ctx.stringValue("GetRankingSystemHistoryResponse.result.Meta.PreviousOperateId"));

		PredictEngine predictEngine = new PredictEngine();
		predictEngine.setResourceId(_ctx.stringValue("GetRankingSystemHistoryResponse.result.Meta.PredictEngine.ResourceId"));
		predictEngine.setVersion(_ctx.stringValue("GetRankingSystemHistoryResponse.result.Meta.PredictEngine.Version"));
		meta.setPredictEngine(predictEngine);
		result.setMeta(meta);
		getRankingSystemHistoryResponse.setResult(result);
	 
	 	return getRankingSystemHistoryResponse;
	}
}