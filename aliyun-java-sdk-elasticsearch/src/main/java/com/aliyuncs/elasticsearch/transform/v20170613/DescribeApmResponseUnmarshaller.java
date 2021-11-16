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

package com.aliyuncs.elasticsearch.transform.v20170613;

import com.aliyuncs.elasticsearch.model.v20170613.DescribeApmResponse;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeApmResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApmResponseUnmarshaller {

	public static DescribeApmResponse unmarshall(DescribeApmResponse describeApmResponse, UnmarshallerContext _ctx) {
		
		describeApmResponse.setRequestId(_ctx.stringValue("DescribeApmResponse.RequestId"));

		Result result = new Result();
		result.setApmServerDomain(_ctx.stringValue("DescribeApmResponse.Result.apmServerDomain"));
		result.setCreatedAt(_ctx.stringValue("DescribeApmResponse.Result.createdAt"));
		result.setDeployedReplica(_ctx.longValue("DescribeApmResponse.Result.deployedReplica"));
		result.setDescription(_ctx.stringValue("DescribeApmResponse.Result.description"));
		result.setEndTime(_ctx.longValue("DescribeApmResponse.Result.endTime"));
		result.setInstanceId(_ctx.stringValue("DescribeApmResponse.Result.instanceId"));
		result.setNodeAmount(_ctx.longValue("DescribeApmResponse.Result.nodeAmount"));
		result.setOutputES(_ctx.stringValue("DescribeApmResponse.Result.outputES"));
		result.setOutputESUserName(_ctx.stringValue("DescribeApmResponse.Result.outputESUserName"));
		result.setOutputEsDescription(_ctx.stringValue("DescribeApmResponse.Result.outputEsDescription"));
		result.setOwnerId(_ctx.stringValue("DescribeApmResponse.Result.ownerId"));
		result.setPaymentType(_ctx.stringValue("DescribeApmResponse.Result.paymentType"));
		result.setRegion(_ctx.stringValue("DescribeApmResponse.Result.region"));
		result.setReplica(_ctx.integerValue("DescribeApmResponse.Result.replica"));
		result.setResourceSpec(_ctx.stringValue("DescribeApmResponse.Result.resourceSpec"));
		result.setStatus(_ctx.stringValue("DescribeApmResponse.Result.status"));
		result.setVersion(_ctx.stringValue("DescribeApmResponse.Result.version"));
		result.setVpcId(_ctx.stringValue("DescribeApmResponse.Result.vpcId"));
		result.setVsArea(_ctx.stringValue("DescribeApmResponse.Result.vsArea"));
		result.setVswitchId(_ctx.stringValue("DescribeApmResponse.Result.vswitchId"));
		describeApmResponse.setResult(result);
	 
	 	return describeApmResponse;
	}
}