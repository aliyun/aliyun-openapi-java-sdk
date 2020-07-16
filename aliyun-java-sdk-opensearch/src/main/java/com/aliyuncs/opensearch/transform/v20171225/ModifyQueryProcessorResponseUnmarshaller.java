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

import com.aliyuncs.opensearch.model.v20171225.ModifyQueryProcessorResponse;
import com.aliyuncs.opensearch.model.v20171225.ModifyQueryProcessorResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyQueryProcessorResponseUnmarshaller {

	public static ModifyQueryProcessorResponse unmarshall(ModifyQueryProcessorResponse modifyQueryProcessorResponse, UnmarshallerContext _ctx) {
		
		modifyQueryProcessorResponse.setRequestId(_ctx.stringValue("ModifyQueryProcessorResponse.requestId"));

		Result result = new Result();
		result.setName(_ctx.stringValue("ModifyQueryProcessorResponse.result.name"));
		result.setActive(_ctx.booleanValue("ModifyQueryProcessorResponse.result.active"));
		result.setDomain(_ctx.stringValue("ModifyQueryProcessorResponse.result.domain"));
		result.setCreated(_ctx.integerValue("ModifyQueryProcessorResponse.result.created"));
		result.setUpdated(_ctx.integerValue("ModifyQueryProcessorResponse.result.updated"));

		List<String> indexes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyQueryProcessorResponse.result.indexes.Length"); i++) {
			indexes.add(_ctx.stringValue("ModifyQueryProcessorResponse.result.indexes["+ i +"]"));
		}
		result.setIndexes(indexes);

		List<Map<Object, Object>> processors = _ctx.listMapValue("ModifyQueryProcessorResponse.result.processors");
		result.setProcessors(processors);
		modifyQueryProcessorResponse.setResult(result);
	 
	 	return modifyQueryProcessorResponse;
	}
}