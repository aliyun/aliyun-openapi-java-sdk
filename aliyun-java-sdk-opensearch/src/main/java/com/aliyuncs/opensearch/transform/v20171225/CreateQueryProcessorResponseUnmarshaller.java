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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.CreateQueryProcessorResponse;
import com.aliyuncs.opensearch.model.v20171225.CreateQueryProcessorResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateQueryProcessorResponseUnmarshaller {

	public static CreateQueryProcessorResponse unmarshall(CreateQueryProcessorResponse createQueryProcessorResponse, UnmarshallerContext _ctx) {
		
		createQueryProcessorResponse.setRequestId(_ctx.stringValue("CreateQueryProcessorResponse.requestId"));

		Result result = new Result();
		result.setName(_ctx.stringValue("CreateQueryProcessorResponse.result.name"));
		result.setActive(_ctx.booleanValue("CreateQueryProcessorResponse.result.active"));
		result.setDomain(_ctx.stringValue("CreateQueryProcessorResponse.result.domain"));
		result.setCreated(_ctx.integerValue("CreateQueryProcessorResponse.result.created"));
		result.setUpdated(_ctx.integerValue("CreateQueryProcessorResponse.result.updated"));

		List<String> indexes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateQueryProcessorResponse.result.indexes.Length"); i++) {
			indexes.add(_ctx.stringValue("CreateQueryProcessorResponse.result.indexes["+ i +"]"));
		}
		result.setIndexes(indexes);

		List<Map<Object, Object>> processors = _ctx.listMapValue("CreateQueryProcessorResponse.result.processors");
		result.setProcessors(processors);
		createQueryProcessorResponse.setResult(result);
	 
	 	return createQueryProcessorResponse;
	}
}