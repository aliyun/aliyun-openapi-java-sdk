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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.DescribeUserBusinessStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserBusinessStatusResponseUnmarshaller {

	public static DescribeUserBusinessStatusResponse unmarshall(DescribeUserBusinessStatusResponse describeUserBusinessStatusResponse, UnmarshallerContext _ctx) {
		
		describeUserBusinessStatusResponse.setRequestId(_ctx.stringValue("DescribeUserBusinessStatusResponse.RequestId"));
		describeUserBusinessStatusResponse.setSuccess(_ctx.booleanValue("DescribeUserBusinessStatusResponse.Success"));
		describeUserBusinessStatusResponse.setCode(_ctx.stringValue("DescribeUserBusinessStatusResponse.Code"));
		describeUserBusinessStatusResponse.setMessage(_ctx.stringValue("DescribeUserBusinessStatusResponse.Message"));
		describeUserBusinessStatusResponse.setBusinessStatus(_ctx.stringValue("DescribeUserBusinessStatusResponse.BusinessStatus"));
		describeUserBusinessStatusResponse.setInDebtStatus(_ctx.stringValue("DescribeUserBusinessStatusResponse.InDebtStatus"));
		describeUserBusinessStatusResponse.setRiskControlStatus(_ctx.stringValue("DescribeUserBusinessStatusResponse.RiskControlStatus"));
	 
	 	return describeUserBusinessStatusResponse;
	}
}