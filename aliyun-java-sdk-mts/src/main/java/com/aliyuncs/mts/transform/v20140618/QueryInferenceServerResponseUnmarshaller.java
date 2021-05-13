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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryInferenceServerResponse;
import com.aliyuncs.mts.model.v20140618.QueryInferenceServerResponse.FunctionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInferenceServerResponseUnmarshaller {

	public static QueryInferenceServerResponse unmarshall(QueryInferenceServerResponse queryInferenceServerResponse, UnmarshallerContext _ctx) {
		
		queryInferenceServerResponse.setRequestId(_ctx.stringValue("QueryInferenceServerResponse.RequestId"));
		queryInferenceServerResponse.setMessage(_ctx.stringValue("QueryInferenceServerResponse.Message"));
		queryInferenceServerResponse.setCode(_ctx.stringValue("QueryInferenceServerResponse.Code"));

		List<FunctionsItem> functions = new ArrayList<FunctionsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryInferenceServerResponse.Functions.Length"); i++) {
			FunctionsItem functionsItem = new FunctionsItem();
			functionsItem.setFunctionName(_ctx.stringValue("QueryInferenceServerResponse.Functions["+ i +"].FunctionName"));
			functionsItem.setCreateTime(_ctx.longValue("QueryInferenceServerResponse.Functions["+ i +"].CreateTime"));
			functionsItem.setUserId(_ctx.longValue("QueryInferenceServerResponse.Functions["+ i +"].UserId"));
			functionsItem.setModelType(_ctx.stringValue("QueryInferenceServerResponse.Functions["+ i +"].ModelType"));
			functionsItem.setModelPath(_ctx.stringValue("QueryInferenceServerResponse.Functions["+ i +"].ModelPath"));
			functionsItem.setPipelineId(_ctx.stringValue("QueryInferenceServerResponse.Functions["+ i +"].PipelineId"));
			functionsItem.setTestId(_ctx.stringValue("QueryInferenceServerResponse.Functions["+ i +"].TestId"));

			functions.add(functionsItem);
		}
		queryInferenceServerResponse.setFunctions(functions);
	 
	 	return queryInferenceServerResponse;
	}
}