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

import com.aliyuncs.opensearch.model.v20171225.DescribeInterventionDictionaryResponse;
import com.aliyuncs.opensearch.model.v20171225.DescribeInterventionDictionaryResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInterventionDictionaryResponseUnmarshaller {

	public static DescribeInterventionDictionaryResponse unmarshall(DescribeInterventionDictionaryResponse describeInterventionDictionaryResponse, UnmarshallerContext _ctx) {
		
		describeInterventionDictionaryResponse.setRequestId(_ctx.stringValue("DescribeInterventionDictionaryResponse.requestId"));

		Result result = new Result();
		result.setName(_ctx.stringValue("DescribeInterventionDictionaryResponse.result.name"));
		result.setType(_ctx.stringValue("DescribeInterventionDictionaryResponse.result.type"));
		result.setAnalyzer(_ctx.stringValue("DescribeInterventionDictionaryResponse.result.analyzer"));
		result.setCreated(_ctx.stringValue("DescribeInterventionDictionaryResponse.result.created"));
		result.setUpdated(_ctx.stringValue("DescribeInterventionDictionaryResponse.result.updated"));
		describeInterventionDictionaryResponse.setResult(result);
	 
	 	return describeInterventionDictionaryResponse;
	}
}