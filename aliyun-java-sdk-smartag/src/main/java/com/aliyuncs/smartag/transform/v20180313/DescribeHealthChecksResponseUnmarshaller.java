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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeHealthChecksResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeHealthChecksResponse.HealthCheck;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHealthChecksResponseUnmarshaller {

	public static DescribeHealthChecksResponse unmarshall(DescribeHealthChecksResponse describeHealthChecksResponse, UnmarshallerContext _ctx) {
		
		describeHealthChecksResponse.setRequestId(_ctx.stringValue("DescribeHealthChecksResponse.RequestId"));
		describeHealthChecksResponse.setTotalCount(_ctx.integerValue("DescribeHealthChecksResponse.TotalCount"));
		describeHealthChecksResponse.setPageSize(_ctx.integerValue("DescribeHealthChecksResponse.PageSize"));
		describeHealthChecksResponse.setPageNumber(_ctx.integerValue("DescribeHealthChecksResponse.PageNumber"));

		List<HealthCheck> healthChecks = new ArrayList<HealthCheck>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHealthChecksResponse.HealthChecks.Length"); i++) {
			HealthCheck healthCheck = new HealthCheck();
			healthCheck.setType(_ctx.stringValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].Type"));
			healthCheck.setProbeTimeout(_ctx.integerValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].ProbeTimeout"));
			healthCheck.setStatus(_ctx.stringValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].Status"));
			healthCheck.setDstIpAddr(_ctx.stringValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].DstIpAddr"));
			healthCheck.setRelationCount(_ctx.integerValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].RelationCount"));
			healthCheck.setRttFailThreshold(_ctx.integerValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].RttFailThreshold"));
			healthCheck.setSmartAGId(_ctx.stringValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].SmartAGId"));
			healthCheck.setDstPort(_ctx.integerValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].DstPort"));
			healthCheck.setFailCountThreshold(_ctx.integerValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].FailCountThreshold"));
			healthCheck.setRttThreshold(_ctx.integerValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].RttThreshold"));
			healthCheck.setSrcPort(_ctx.integerValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].SrcPort"));
			healthCheck.setProbeCount(_ctx.integerValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].ProbeCount"));
			healthCheck.setDescription(_ctx.stringValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].Description"));
			healthCheck.setSrcIpAddr(_ctx.stringValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].SrcIpAddr"));
			healthCheck.setProbeInterval(_ctx.integerValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].ProbeInterval"));
			healthCheck.setName(_ctx.stringValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].Name"));
			healthCheck.setHcInstanceId(_ctx.stringValue("DescribeHealthChecksResponse.HealthChecks["+ i +"].HcInstanceId"));

			healthChecks.add(healthCheck);
		}
		describeHealthChecksResponse.setHealthChecks(healthChecks);
	 
	 	return describeHealthChecksResponse;
	}
}