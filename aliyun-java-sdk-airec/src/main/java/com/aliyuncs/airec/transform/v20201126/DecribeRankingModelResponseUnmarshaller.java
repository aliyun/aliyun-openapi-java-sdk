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

import com.aliyuncs.airec.model.v20201126.DecribeRankingModelResponse;
import com.aliyuncs.airec.model.v20201126.DecribeRankingModelResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DecribeRankingModelResponseUnmarshaller {

	public static DecribeRankingModelResponse unmarshall(DecribeRankingModelResponse decribeRankingModelResponse, UnmarshallerContext _ctx) {
		
		decribeRankingModelResponse.setCode(_ctx.stringValue("DecribeRankingModelResponse.code"));
		decribeRankingModelResponse.setMessage(_ctx.stringValue("DecribeRankingModelResponse.message"));
		decribeRankingModelResponse.setRequestId(_ctx.stringValue("DecribeRankingModelResponse.requestId"));

		Result result = new Result();
		result.setGmtCreate(_ctx.stringValue("DecribeRankingModelResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.stringValue("DecribeRankingModelResponse.result.gmtModified"));
		result.setMeta(_ctx.mapValue("DecribeRankingModelResponse.result.meta"));
		result.setRankingModelId(_ctx.stringValue("DecribeRankingModelResponse.result.rankingModelId"));
		decribeRankingModelResponse.setResult(result);
	 
	 	return decribeRankingModelResponse;
	}
}