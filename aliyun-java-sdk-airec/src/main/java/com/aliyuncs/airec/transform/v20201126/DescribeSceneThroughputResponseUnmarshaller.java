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

import com.aliyuncs.airec.model.v20201126.DescribeSceneThroughputResponse;
import com.aliyuncs.airec.model.v20201126.DescribeSceneThroughputResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSceneThroughputResponseUnmarshaller {

	public static DescribeSceneThroughputResponse unmarshall(DescribeSceneThroughputResponse describeSceneThroughputResponse, UnmarshallerContext _ctx) {
		
		describeSceneThroughputResponse.setRequestId(_ctx.stringValue("DescribeSceneThroughputResponse.requestId"));
		describeSceneThroughputResponse.setCode(_ctx.stringValue("DescribeSceneThroughputResponse.code"));
		describeSceneThroughputResponse.setMessage(_ctx.stringValue("DescribeSceneThroughputResponse.message"));

		Result result = new Result();
		result.setPvCount(_ctx.longValue("DescribeSceneThroughputResponse.result.pvCount"));
		describeSceneThroughputResponse.setResult(result);
	 
	 	return describeSceneThroughputResponse;
	}
}