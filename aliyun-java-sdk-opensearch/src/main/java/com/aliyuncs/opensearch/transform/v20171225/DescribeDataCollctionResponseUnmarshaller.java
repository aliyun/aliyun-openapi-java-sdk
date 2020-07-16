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

import com.aliyuncs.opensearch.model.v20171225.DescribeDataCollctionResponse;
import com.aliyuncs.opensearch.model.v20171225.DescribeDataCollctionResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataCollctionResponseUnmarshaller {

	public static DescribeDataCollctionResponse unmarshall(DescribeDataCollctionResponse describeDataCollctionResponse, UnmarshallerContext _ctx) {
		
		describeDataCollctionResponse.setRequestId(_ctx.stringValue("DescribeDataCollctionResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("DescribeDataCollctionResponse.result.id"));
		result.setName(_ctx.stringValue("DescribeDataCollctionResponse.result.name"));
		result.setType(_ctx.stringValue("DescribeDataCollctionResponse.result.type"));
		result.setStatus(_ctx.integerValue("DescribeDataCollctionResponse.result.status"));
		result.setDataCollectionType(_ctx.stringValue("DescribeDataCollctionResponse.result.dataCollectionType"));
		result.setIndustryName(_ctx.stringValue("DescribeDataCollctionResponse.result.industryName"));
		result.setCreated(_ctx.integerValue("DescribeDataCollctionResponse.result.created"));
		result.setUpdated(_ctx.integerValue("DescribeDataCollctionResponse.result.updated"));
		result.setSundialId(_ctx.stringValue("DescribeDataCollctionResponse.result.sundialId"));
		describeDataCollctionResponse.setResult(result);
	 
	 	return describeDataCollctionResponse;
	}
}