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

package com.aliyuncs.waf_openapi.transform.v20180117;

import com.aliyuncs.waf_openapi.model.v20180117.DescribePayInfoResponse;
import com.aliyuncs.waf_openapi.model.v20180117.DescribePayInfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePayInfoResponseUnmarshaller {

	public static DescribePayInfoResponse unmarshall(DescribePayInfoResponse describePayInfoResponse, UnmarshallerContext _ctx) {
		
		describePayInfoResponse.setRequestId(_ctx.stringValue("DescribePayInfoResponse.RequestId"));

		Result result = new Result();
		result.setInDebt(_ctx.integerValue("DescribePayInfoResponse.Result.InDebt"));
		result.setInstanceId(_ctx.stringValue("DescribePayInfoResponse.Result.InstanceId"));
		result.setPayType(_ctx.integerValue("DescribePayInfoResponse.Result.PayType"));
		result.setEndDate(_ctx.longValue("DescribePayInfoResponse.Result.EndDate"));
		result.setRemainDay(_ctx.integerValue("DescribePayInfoResponse.Result.RemainDay"));
		result.setRegion(_ctx.stringValue("DescribePayInfoResponse.Result.Region"));
		result.setTrial(_ctx.integerValue("DescribePayInfoResponse.Result.Trial"));
		result.setStatus(_ctx.integerValue("DescribePayInfoResponse.Result.Status"));
		describePayInfoResponse.setResult(result);
	 
	 	return describePayInfoResponse;
	}
}