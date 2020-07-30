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

import com.aliyuncs.opensearch.model.v20171225.DescribeABTestSceneResponse;
import com.aliyuncs.opensearch.model.v20171225.DescribeABTestSceneResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeABTestSceneResponseUnmarshaller {

	public static DescribeABTestSceneResponse unmarshall(DescribeABTestSceneResponse describeABTestSceneResponse, UnmarshallerContext _ctx) {
		
		describeABTestSceneResponse.setRequestId(_ctx.stringValue("DescribeABTestSceneResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("DescribeABTestSceneResponse.result.id"));
		result.setName(_ctx.stringValue("DescribeABTestSceneResponse.result.name"));
		result.setStatus(_ctx.integerValue("DescribeABTestSceneResponse.result.status"));
		result.setCreated(_ctx.integerValue("DescribeABTestSceneResponse.result.created"));
		result.setUpdated(_ctx.integerValue("DescribeABTestSceneResponse.result.updated"));

		List<String> values = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeABTestSceneResponse.result.values.Length"); i++) {
			values.add(_ctx.stringValue("DescribeABTestSceneResponse.result.values["+ i +"]"));
		}
		result.setValues(values);
		describeABTestSceneResponse.setResult(result);
	 
	 	return describeABTestSceneResponse;
	}
}