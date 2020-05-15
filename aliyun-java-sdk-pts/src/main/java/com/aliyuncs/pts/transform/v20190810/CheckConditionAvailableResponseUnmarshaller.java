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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.CheckConditionAvailableResponse;
import com.aliyuncs.pts.model.v20190810.CheckConditionAvailableResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckConditionAvailableResponseUnmarshaller {

	public static CheckConditionAvailableResponse unmarshall(CheckConditionAvailableResponse checkConditionAvailableResponse, UnmarshallerContext _ctx) {
		
		checkConditionAvailableResponse.setRequestId(_ctx.stringValue("CheckConditionAvailableResponse.RequestId"));
		checkConditionAvailableResponse.setCode(_ctx.stringValue("CheckConditionAvailableResponse.Code"));
		checkConditionAvailableResponse.setMessage(_ctx.stringValue("CheckConditionAvailableResponse.Message"));
		checkConditionAvailableResponse.setHttpStatusCode(_ctx.integerValue("CheckConditionAvailableResponse.HttpStatusCode"));
		checkConditionAvailableResponse.setSuccess(_ctx.booleanValue("CheckConditionAvailableResponse.Success"));

		List<Result> resultList = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("CheckConditionAvailableResponse.ResultList.Length"); i++) {
			Result result = new Result();
			result.setId(_ctx.stringValue("CheckConditionAvailableResponse.ResultList["+ i +"].Id"));
			result.setSatisfied(_ctx.booleanValue("CheckConditionAvailableResponse.ResultList["+ i +"].Satisfied"));
			result.setAmount(_ctx.integerValue("CheckConditionAvailableResponse.ResultList["+ i +"].Amount"));
			result.setMessage(_ctx.stringValue("CheckConditionAvailableResponse.ResultList["+ i +"].Message"));

			resultList.add(result);
		}
		checkConditionAvailableResponse.setResultList(resultList);
	 
	 	return checkConditionAvailableResponse;
	}
}