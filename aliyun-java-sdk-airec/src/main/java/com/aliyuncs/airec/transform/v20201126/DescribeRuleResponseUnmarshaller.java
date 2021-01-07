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

import com.aliyuncs.airec.model.v20201126.DescribeRuleResponse;
import com.aliyuncs.airec.model.v20201126.DescribeRuleResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRuleResponseUnmarshaller {

	public static DescribeRuleResponse unmarshall(DescribeRuleResponse describeRuleResponse, UnmarshallerContext _ctx) {
		
		describeRuleResponse.setRequestId(_ctx.stringValue("DescribeRuleResponse.requestId"));
		describeRuleResponse.setCode(_ctx.stringValue("DescribeRuleResponse.code"));
		describeRuleResponse.setMessage(_ctx.stringValue("DescribeRuleResponse.message"));

		Result result = new Result();
		result.setGmtCreate(_ctx.stringValue("DescribeRuleResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.stringValue("DescribeRuleResponse.result.gmtModified"));
		result.setRuleId(_ctx.stringValue("DescribeRuleResponse.result.ruleId"));
		result.setStatus(_ctx.stringValue("DescribeRuleResponse.result.status"));
		describeRuleResponse.setResult(result);
	 
	 	return describeRuleResponse;
	}
}