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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeCustomizeRuleCountResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeCustomizeRuleCountResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomizeRuleCountResponseUnmarshaller {

	public static DescribeCustomizeRuleCountResponse unmarshall(DescribeCustomizeRuleCountResponse describeCustomizeRuleCountResponse, UnmarshallerContext _ctx) {
		
		describeCustomizeRuleCountResponse.setRequestId(_ctx.stringValue("DescribeCustomizeRuleCountResponse.RequestId"));
		describeCustomizeRuleCountResponse.setSuccess(_ctx.booleanValue("DescribeCustomizeRuleCountResponse.Success"));
		describeCustomizeRuleCountResponse.setCode(_ctx.integerValue("DescribeCustomizeRuleCountResponse.Code"));
		describeCustomizeRuleCountResponse.setMessage(_ctx.stringValue("DescribeCustomizeRuleCountResponse.Message"));

		Data data = new Data();
		data.setInUseRuleNum(_ctx.integerValue("DescribeCustomizeRuleCountResponse.Data.InUseRuleNum"));
		data.setHighRuleNum(_ctx.integerValue("DescribeCustomizeRuleCountResponse.Data.HighRuleNum"));
		data.setMediumRuleNum(_ctx.integerValue("DescribeCustomizeRuleCountResponse.Data.MediumRuleNum"));
		data.setLowRuleNum(_ctx.integerValue("DescribeCustomizeRuleCountResponse.Data.LowRuleNum"));
		describeCustomizeRuleCountResponse.setData(data);
	 
	 	return describeCustomizeRuleCountResponse;
	}
}