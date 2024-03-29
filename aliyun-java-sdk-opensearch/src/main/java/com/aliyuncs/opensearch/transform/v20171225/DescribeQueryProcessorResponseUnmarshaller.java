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

import com.aliyuncs.opensearch.model.v20171225.DescribeQueryProcessorResponse;
import com.aliyuncs.opensearch.model.v20171225.DescribeQueryProcessorResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeQueryProcessorResponseUnmarshaller {

	public static DescribeQueryProcessorResponse unmarshall(DescribeQueryProcessorResponse describeQueryProcessorResponse, UnmarshallerContext _ctx) {
		
		describeQueryProcessorResponse.setRequestId(_ctx.stringValue("DescribeQueryProcessorResponse.requestId"));

		Result result = new Result();
		result.setCreated(_ctx.integerValue("DescribeQueryProcessorResponse.result.created"));
		result.setActive(_ctx.booleanValue("DescribeQueryProcessorResponse.result.active"));
		result.setUpdated(_ctx.integerValue("DescribeQueryProcessorResponse.result.updated"));
		result.setName(_ctx.stringValue("DescribeQueryProcessorResponse.result.name"));
		result.setDomain(_ctx.stringValue("DescribeQueryProcessorResponse.result.domain"));

		List<String> indexes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeQueryProcessorResponse.result.indexes.Length"); i++) {
			indexes.add(_ctx.stringValue("DescribeQueryProcessorResponse.result.indexes["+ i +"]"));
		}
		result.setIndexes(indexes);

		List<Map<Object, Object>> processors = _ctx.listMapValue("DescribeQueryProcessorResponse.result.processors");
		result.setProcessors(processors);
		describeQueryProcessorResponse.setResult(result);
	 
	 	return describeQueryProcessorResponse;
	}
}