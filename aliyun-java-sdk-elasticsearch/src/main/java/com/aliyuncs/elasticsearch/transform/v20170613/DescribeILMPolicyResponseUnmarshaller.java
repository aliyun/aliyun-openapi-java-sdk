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

package com.aliyuncs.elasticsearch.transform.v20170613;

import com.aliyuncs.elasticsearch.model.v20170613.DescribeILMPolicyResponse;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeILMPolicyResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeILMPolicyResponseUnmarshaller {

	public static DescribeILMPolicyResponse unmarshall(DescribeILMPolicyResponse describeILMPolicyResponse, UnmarshallerContext _ctx) {
		
		describeILMPolicyResponse.setRequestId(_ctx.stringValue("DescribeILMPolicyResponse.RequestId"));

		Result result = new Result();
		result.setName(_ctx.stringValue("DescribeILMPolicyResponse.Result.name"));
		result.setPhases(_ctx.mapValue("DescribeILMPolicyResponse.Result.phases"));
		describeILMPolicyResponse.setResult(result);
	 
	 	return describeILMPolicyResponse;
	}
}