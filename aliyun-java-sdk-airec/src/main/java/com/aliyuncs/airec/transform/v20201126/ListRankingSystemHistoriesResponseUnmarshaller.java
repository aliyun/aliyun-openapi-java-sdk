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

import com.aliyuncs.airec.model.v20201126.ListRankingSystemHistoriesResponse;
import com.aliyuncs.airec.model.v20201126.ListRankingSystemHistoriesResponse.ResultItem;
import com.aliyuncs.airec.model.v20201126.ListRankingSystemHistoriesResponse.ResultItem.Meta;
import com.aliyuncs.airec.model.v20201126.ListRankingSystemHistoriesResponse.ResultItem.Meta.PredictEngine;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRankingSystemHistoriesResponseUnmarshaller {

	public static ListRankingSystemHistoriesResponse unmarshall(ListRankingSystemHistoriesResponse listRankingSystemHistoriesResponse, UnmarshallerContext _ctx) {
		
		listRankingSystemHistoriesResponse.setRequestId(_ctx.stringValue("ListRankingSystemHistoriesResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRankingSystemHistoriesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setOperateTime(_ctx.stringValue("ListRankingSystemHistoriesResponse.result["+ i +"].OperateTime"));
			resultItem.setOperateId(_ctx.stringValue("ListRankingSystemHistoriesResponse.result["+ i +"].OperateId"));
			resultItem.setOperateType(_ctx.stringValue("ListRankingSystemHistoriesResponse.result["+ i +"].OperateType"));
			resultItem.setName(_ctx.stringValue("ListRankingSystemHistoriesResponse.result["+ i +"].Name"));

			Meta meta = new Meta();
			meta.setAutoDeploy(_ctx.booleanValue("ListRankingSystemHistoriesResponse.result["+ i +"].Meta.AutoDeploy"));
			meta.setAutoDeployAuc(_ctx.stringValue("ListRankingSystemHistoriesResponse.result["+ i +"].Meta.AutoDeployAuc"));
			meta.setConf(_ctx.stringValue("ListRankingSystemHistoriesResponse.result["+ i +"].Meta.Conf"));
			meta.setModelTemplateName(_ctx.stringValue("ListRankingSystemHistoriesResponse.result["+ i +"].Meta.ModelTemplateName"));
			meta.setPredictEngineType(_ctx.stringValue("ListRankingSystemHistoriesResponse.result["+ i +"].Meta.PredictEngineType"));
			meta.setPreviousOperateId(_ctx.stringValue("ListRankingSystemHistoriesResponse.result["+ i +"].Meta.PreviousOperateId"));

			PredictEngine predictEngine = new PredictEngine();
			predictEngine.setResourceId(_ctx.stringValue("ListRankingSystemHistoriesResponse.result["+ i +"].Meta.PredictEngine.ResourceId"));
			predictEngine.setVersion(_ctx.stringValue("ListRankingSystemHistoriesResponse.result["+ i +"].Meta.PredictEngine.Version"));
			meta.setPredictEngine(predictEngine);
			resultItem.setMeta(meta);

			result.add(resultItem);
		}
		listRankingSystemHistoriesResponse.setResult(result);
	 
	 	return listRankingSystemHistoriesResponse;
	}
}