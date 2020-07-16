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

package com.aliyuncs.opensearch.transform.v20171225;

import com.aliyuncs.opensearch.model.v20171225.CreateInterventionDictionaryResponse;
import com.aliyuncs.opensearch.model.v20171225.CreateInterventionDictionaryResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateInterventionDictionaryResponseUnmarshaller {

	public static CreateInterventionDictionaryResponse unmarshall(CreateInterventionDictionaryResponse createInterventionDictionaryResponse, UnmarshallerContext _ctx) {
		
		createInterventionDictionaryResponse.setRequestId(_ctx.stringValue("CreateInterventionDictionaryResponse.requestId"));

		Result result = new Result();
		result.setName(_ctx.stringValue("CreateInterventionDictionaryResponse.result.name"));
		result.setType(_ctx.stringValue("CreateInterventionDictionaryResponse.result.type"));
		result.setAnalyzer(_ctx.stringValue("CreateInterventionDictionaryResponse.result.analyzer"));
		result.setCreated(_ctx.stringValue("CreateInterventionDictionaryResponse.result.created"));
		result.setUpdated(_ctx.stringValue("CreateInterventionDictionaryResponse.result.updated"));
		createInterventionDictionaryResponse.setResult(result);
	 
	 	return createInterventionDictionaryResponse;
	}
}