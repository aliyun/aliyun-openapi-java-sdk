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

import com.aliyuncs.airec.model.v20201126.ModifyRankingModelResponse;
import com.aliyuncs.airec.model.v20201126.ModifyRankingModelResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyRankingModelResponseUnmarshaller {

	public static ModifyRankingModelResponse unmarshall(ModifyRankingModelResponse modifyRankingModelResponse, UnmarshallerContext _ctx) {
		
		modifyRankingModelResponse.setCode(_ctx.stringValue("ModifyRankingModelResponse.code"));
		modifyRankingModelResponse.setMessage(_ctx.stringValue("ModifyRankingModelResponse.message"));
		modifyRankingModelResponse.setRequestId(_ctx.stringValue("ModifyRankingModelResponse.requestId"));

		Result result = new Result();
		result.setGmtCreate(_ctx.stringValue("ModifyRankingModelResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.stringValue("ModifyRankingModelResponse.result.gmtModified"));
		result.setMeta(_ctx.mapValue("ModifyRankingModelResponse.result.meta"));
		result.setRankingModelId(_ctx.stringValue("ModifyRankingModelResponse.result.rankingModelId"));
		modifyRankingModelResponse.setResult(result);
	 
	 	return modifyRankingModelResponse;
	}
}