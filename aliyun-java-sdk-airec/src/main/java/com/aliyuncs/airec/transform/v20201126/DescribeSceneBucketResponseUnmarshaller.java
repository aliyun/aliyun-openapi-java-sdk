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

import com.aliyuncs.airec.model.v20201126.DescribeSceneBucketResponse;
import com.aliyuncs.airec.model.v20201126.DescribeSceneBucketResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSceneBucketResponseUnmarshaller {

	public static DescribeSceneBucketResponse unmarshall(DescribeSceneBucketResponse describeSceneBucketResponse, UnmarshallerContext _ctx) {
		
		describeSceneBucketResponse.setRequestId(_ctx.stringValue("DescribeSceneBucketResponse.requestId"));

		Result result = new Result();
		result.setNum(_ctx.integerValue("DescribeSceneBucketResponse.result.num"));
		result.setInUse(_ctx.stringValue("DescribeSceneBucketResponse.result.inUse"));
		result.setDetail(_ctx.mapValue("DescribeSceneBucketResponse.result.detail"));
		describeSceneBucketResponse.setResult(result);
	 
	 	return describeSceneBucketResponse;
	}
}