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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.DescribeAgentCpuInfoResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAgentCpuInfoResponseUnmarshaller {

	public static DescribeAgentCpuInfoResponse unmarshall(DescribeAgentCpuInfoResponse describeAgentCpuInfoResponse, UnmarshallerContext _ctx) {
		
		describeAgentCpuInfoResponse.setRequestId(_ctx.stringValue("DescribeAgentCpuInfoResponse.RequestId"));
		describeAgentCpuInfoResponse.setCode(_ctx.stringValue("DescribeAgentCpuInfoResponse.Code"));
		describeAgentCpuInfoResponse.setMessage(_ctx.stringValue("DescribeAgentCpuInfoResponse.Message"));
		describeAgentCpuInfoResponse.setSuccess(_ctx.booleanValue("DescribeAgentCpuInfoResponse.Success"));
		describeAgentCpuInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeAgentCpuInfoResponse.HttpStatusCode"));

		List<Map<Object, Object>> cpuInfo = _ctx.listMapValue("DescribeAgentCpuInfoResponse.CpuInfo");
		describeAgentCpuInfoResponse.setCpuInfo(cpuInfo);
	 
	 	return describeAgentCpuInfoResponse;
	}
}