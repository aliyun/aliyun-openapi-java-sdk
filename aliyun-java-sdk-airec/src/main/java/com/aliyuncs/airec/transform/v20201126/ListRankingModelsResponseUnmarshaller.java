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

import com.aliyuncs.airec.model.v20201126.ListRankingModelsResponse;
import com.aliyuncs.airec.model.v20201126.ListRankingModelsResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRankingModelsResponseUnmarshaller {

	public static ListRankingModelsResponse unmarshall(ListRankingModelsResponse listRankingModelsResponse, UnmarshallerContext _ctx) {
		
		listRankingModelsResponse.setCode(_ctx.stringValue("ListRankingModelsResponse.code"));
		listRankingModelsResponse.setMessage(_ctx.stringValue("ListRankingModelsResponse.message"));
		listRankingModelsResponse.setRequestId(_ctx.stringValue("ListRankingModelsResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRankingModelsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setGmtCreate(_ctx.stringValue("ListRankingModelsResponse.result["+ i +"].gmtCreate"));
			resultItem.setGmtModified(_ctx.stringValue("ListRankingModelsResponse.result["+ i +"].gmtModified"));
			resultItem.setMeta(_ctx.mapValue("ListRankingModelsResponse.result["+ i +"].meta"));
			resultItem.setRankingModelId(_ctx.stringValue("ListRankingModelsResponse.result["+ i +"].rankingModelId"));

			result.add(resultItem);
		}
		listRankingModelsResponse.setResult(result);
	 
	 	return listRankingModelsResponse;
	}
}