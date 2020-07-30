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

import com.aliyuncs.opensearch.model.v20171225.DescribeABTestExperimentResponse;
import com.aliyuncs.opensearch.model.v20171225.DescribeABTestExperimentResponse.Result;
import com.aliyuncs.opensearch.model.v20171225.DescribeABTestExperimentResponse.Result.Params;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeABTestExperimentResponseUnmarshaller {

	public static DescribeABTestExperimentResponse unmarshall(DescribeABTestExperimentResponse describeABTestExperimentResponse, UnmarshallerContext _ctx) {
		
		describeABTestExperimentResponse.setRequestId(_ctx.stringValue("DescribeABTestExperimentResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("DescribeABTestExperimentResponse.result.id"));
		result.setName(_ctx.stringValue("DescribeABTestExperimentResponse.result.name"));
		result.setCreated(_ctx.integerValue("DescribeABTestExperimentResponse.result.created"));
		result.setUpdated(_ctx.integerValue("DescribeABTestExperimentResponse.result.updated"));
		result.setOnline(_ctx.booleanValue("DescribeABTestExperimentResponse.result.online"));
		result.setTraffic(_ctx.integerValue("DescribeABTestExperimentResponse.result.traffic"));

		Params params = new Params();
		params.setFirst_formula_name(_ctx.stringValue("DescribeABTestExperimentResponse.result.params.first_formula_name"));
		result.setParams(params);
		describeABTestExperimentResponse.setResult(result);
	 
	 	return describeABTestExperimentResponse;
	}
}