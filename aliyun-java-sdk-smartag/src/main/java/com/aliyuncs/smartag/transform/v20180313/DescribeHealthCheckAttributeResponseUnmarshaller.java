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

package com.aliyuncs.smartag.transform.v20180313;

import com.aliyuncs.smartag.model.v20180313.DescribeHealthCheckAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHealthCheckAttributeResponseUnmarshaller {

	public static DescribeHealthCheckAttributeResponse unmarshall(DescribeHealthCheckAttributeResponse describeHealthCheckAttributeResponse, UnmarshallerContext _ctx) {
		
		describeHealthCheckAttributeResponse.setRequestId(_ctx.stringValue("DescribeHealthCheckAttributeResponse.RequestId"));
		describeHealthCheckAttributeResponse.setDescription(_ctx.stringValue("DescribeHealthCheckAttributeResponse.Description"));
		describeHealthCheckAttributeResponse.setSrcPort(_ctx.integerValue("DescribeHealthCheckAttributeResponse.SrcPort"));
		describeHealthCheckAttributeResponse.setSrcIpAddr(_ctx.stringValue("DescribeHealthCheckAttributeResponse.SrcIpAddr"));
		describeHealthCheckAttributeResponse.setCreateTime(_ctx.longValue("DescribeHealthCheckAttributeResponse.CreateTime"));
		describeHealthCheckAttributeResponse.setFailCountThreshold(_ctx.integerValue("DescribeHealthCheckAttributeResponse.FailCountThreshold"));
		describeHealthCheckAttributeResponse.setDstPort(_ctx.integerValue("DescribeHealthCheckAttributeResponse.DstPort"));
		describeHealthCheckAttributeResponse.setName(_ctx.stringValue("DescribeHealthCheckAttributeResponse.Name"));
		describeHealthCheckAttributeResponse.setProbeCount(_ctx.integerValue("DescribeHealthCheckAttributeResponse.ProbeCount"));
		describeHealthCheckAttributeResponse.setType(_ctx.stringValue("DescribeHealthCheckAttributeResponse.Type"));
		describeHealthCheckAttributeResponse.setProbeTimeout(_ctx.integerValue("DescribeHealthCheckAttributeResponse.ProbeTimeout"));
		describeHealthCheckAttributeResponse.setHcInstanceId(_ctx.stringValue("DescribeHealthCheckAttributeResponse.HcInstanceId"));
		describeHealthCheckAttributeResponse.setRttThreshold(_ctx.integerValue("DescribeHealthCheckAttributeResponse.RttThreshold"));
		describeHealthCheckAttributeResponse.setProbeInterval(_ctx.integerValue("DescribeHealthCheckAttributeResponse.ProbeInterval"));
		describeHealthCheckAttributeResponse.setSmartAGId(_ctx.stringValue("DescribeHealthCheckAttributeResponse.SmartAGId"));
		describeHealthCheckAttributeResponse.setRttFailThreshold(_ctx.integerValue("DescribeHealthCheckAttributeResponse.RttFailThreshold"));
		describeHealthCheckAttributeResponse.setDstIpAddr(_ctx.stringValue("DescribeHealthCheckAttributeResponse.DstIpAddr"));
	 
	 	return describeHealthCheckAttributeResponse;
	}
}