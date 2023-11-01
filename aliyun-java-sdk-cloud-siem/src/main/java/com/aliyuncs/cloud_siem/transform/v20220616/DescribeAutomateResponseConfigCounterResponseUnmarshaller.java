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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeAutomateResponseConfigCounterResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAutomateResponseConfigCounterResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutomateResponseConfigCounterResponseUnmarshaller {

	public static DescribeAutomateResponseConfigCounterResponse unmarshall(DescribeAutomateResponseConfigCounterResponse describeAutomateResponseConfigCounterResponse, UnmarshallerContext _ctx) {
		
		describeAutomateResponseConfigCounterResponse.setRequestId(_ctx.stringValue("DescribeAutomateResponseConfigCounterResponse.RequestId"));
		describeAutomateResponseConfigCounterResponse.setSuccess(_ctx.booleanValue("DescribeAutomateResponseConfigCounterResponse.Success"));
		describeAutomateResponseConfigCounterResponse.setCode(_ctx.integerValue("DescribeAutomateResponseConfigCounterResponse.Code"));
		describeAutomateResponseConfigCounterResponse.setMessage(_ctx.stringValue("DescribeAutomateResponseConfigCounterResponse.Message"));

		Data data = new Data();
		data.setAll(_ctx.longValue("DescribeAutomateResponseConfigCounterResponse.Data.All"));
		data.setOnline(_ctx.longValue("DescribeAutomateResponseConfigCounterResponse.Data.Online"));
		describeAutomateResponseConfigCounterResponse.setData(data);
	 
	 	return describeAutomateResponseConfigCounterResponse;
	}
}