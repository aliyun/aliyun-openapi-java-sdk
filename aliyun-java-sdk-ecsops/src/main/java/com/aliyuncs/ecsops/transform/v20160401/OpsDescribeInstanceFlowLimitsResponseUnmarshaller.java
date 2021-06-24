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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstanceFlowLimitsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstanceFlowLimitsResponse.InstanceFlowLimit;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeInstanceFlowLimitsResponseUnmarshaller {

	public static OpsDescribeInstanceFlowLimitsResponse unmarshall(OpsDescribeInstanceFlowLimitsResponse opsDescribeInstanceFlowLimitsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeInstanceFlowLimitsResponse.setRequestId(_ctx.stringValue("OpsDescribeInstanceFlowLimitsResponse.RequestId"));
		opsDescribeInstanceFlowLimitsResponse.setTotalCount(_ctx.integerValue("OpsDescribeInstanceFlowLimitsResponse.TotalCount"));
		opsDescribeInstanceFlowLimitsResponse.setPageSize(_ctx.integerValue("OpsDescribeInstanceFlowLimitsResponse.PageSize"));
		opsDescribeInstanceFlowLimitsResponse.setPageNo(_ctx.integerValue("OpsDescribeInstanceFlowLimitsResponse.PageNo"));

		List<InstanceFlowLimit> instanceFlowLimits = new ArrayList<InstanceFlowLimit>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeInstanceFlowLimitsResponse.InstanceFlowLimits.Length"); i++) {
			InstanceFlowLimit instanceFlowLimit = new InstanceFlowLimit();
			instanceFlowLimit.setAliUid(_ctx.longValue("OpsDescribeInstanceFlowLimitsResponse.InstanceFlowLimits["+ i +"].AliUid"));
			instanceFlowLimit.setInstanceId(_ctx.stringValue("OpsDescribeInstanceFlowLimitsResponse.InstanceFlowLimits["+ i +"].InstanceId"));
			instanceFlowLimit.setBid(_ctx.stringValue("OpsDescribeInstanceFlowLimitsResponse.InstanceFlowLimits["+ i +"].Bid"));
			instanceFlowLimit.setReason(_ctx.stringValue("OpsDescribeInstanceFlowLimitsResponse.InstanceFlowLimits["+ i +"].Reason"));
			instanceFlowLimit.setRegionId(_ctx.stringValue("OpsDescribeInstanceFlowLimitsResponse.InstanceFlowLimits["+ i +"].RegionId"));

			instanceFlowLimits.add(instanceFlowLimit);
		}
		opsDescribeInstanceFlowLimitsResponse.setInstanceFlowLimits(instanceFlowLimits);
	 
	 	return opsDescribeInstanceFlowLimitsResponse;
	}
}