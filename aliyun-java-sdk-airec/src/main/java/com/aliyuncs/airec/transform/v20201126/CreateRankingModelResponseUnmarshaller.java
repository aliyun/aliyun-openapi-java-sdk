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

import com.aliyuncs.airec.model.v20201126.CreateRankingModelResponse;
import com.aliyuncs.airec.model.v20201126.CreateRankingModelResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRankingModelResponseUnmarshaller {

	public static CreateRankingModelResponse unmarshall(CreateRankingModelResponse createRankingModelResponse, UnmarshallerContext _ctx) {
		
		createRankingModelResponse.setCode(_ctx.stringValue("CreateRankingModelResponse.code"));
		createRankingModelResponse.setMessage(_ctx.stringValue("CreateRankingModelResponse.message"));
		createRankingModelResponse.setRequestId(_ctx.stringValue("CreateRankingModelResponse.requestId"));

		Result result = new Result();
		result.setGmtCreate(_ctx.stringValue("CreateRankingModelResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.stringValue("CreateRankingModelResponse.result.gmtModified"));
		result.setMeta(_ctx.mapValue("CreateRankingModelResponse.result.meta"));
		result.setRankingModelId(_ctx.stringValue("CreateRankingModelResponse.result.rankingModelId"));
		createRankingModelResponse.setResult(result);
	 
	 	return createRankingModelResponse;
	}
}