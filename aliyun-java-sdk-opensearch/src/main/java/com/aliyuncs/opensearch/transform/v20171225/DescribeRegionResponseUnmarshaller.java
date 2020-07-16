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

import com.aliyuncs.opensearch.model.v20171225.DescribeRegionResponse;
import com.aliyuncs.opensearch.model.v20171225.DescribeRegionResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionResponseUnmarshaller {

	public static DescribeRegionResponse unmarshall(DescribeRegionResponse describeRegionResponse, UnmarshallerContext _ctx) {
		
		describeRegionResponse.setRequestId(_ctx.stringValue("DescribeRegionResponse.requestId"));

		Result result = new Result();
		result.setRegionId(_ctx.stringValue("DescribeRegionResponse.result.regionId"));
		result.setConfig(_ctx.mapValue("DescribeRegionResponse.result.config"));
		describeRegionResponse.setResult(result);
	 
	 	return describeRegionResponse;
	}
}