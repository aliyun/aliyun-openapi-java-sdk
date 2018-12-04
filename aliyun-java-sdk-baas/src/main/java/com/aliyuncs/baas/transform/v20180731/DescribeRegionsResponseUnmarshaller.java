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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.DescribeRegionsResponse;
import com.aliyuncs.baas.model.v20180731.DescribeRegionsResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext context) {
		
		describeRegionsResponse.setRequestId(context.stringValue("DescribeRegionsResponse.RequestId"));
		describeRegionsResponse.setSuccess(context.booleanValue("DescribeRegionsResponse.Success"));
		describeRegionsResponse.setErrorCode(context.integerValue("DescribeRegionsResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("DescribeRegionsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(context.integerValue("DescribeRegionsResponse.Result["+ i +"].Id"));
			resultItem.setRegionId(context.stringValue("DescribeRegionsResponse.Result["+ i +"].RegionId"));
			resultItem.setTitle(context.stringValue("DescribeRegionsResponse.Result["+ i +"].Title"));
			resultItem.setOnline(context.booleanValue("DescribeRegionsResponse.Result["+ i +"].Online"));

			result.add(resultItem);
		}
		describeRegionsResponse.setResult(result);
	 
	 	return describeRegionsResponse;
	}
}