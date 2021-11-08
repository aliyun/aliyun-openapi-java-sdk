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
		result.setCreatedAt(_ctx.stringValue("DescribeApmResponse.Result.CreatedAt"));
		result.setDeployedReplica(_ctx.longValue("DescribeApmResponse.Result.DeployedReplica"));
		result.setDescription(_ctx.stringValue("DescribeApmResponse.Result.Description"));
		result.setEndTime(_ctx.longValue("DescribeApmResponse.Result.EndTime"));
		result.setInstanceId(_ctx.stringValue("DescribeApmResponse.Result.InstanceId"));
		result.setNodeAmount(_ctx.longValue("DescribeApmResponse.Result.NodeAmount"));
		result.setOutputES(_ctx.stringValue("DescribeApmResponse.Result.OutputES"));
		result.setOutputESUserName(_ctx.stringValue("DescribeApmResponse.Result.OutputESUserName"));
		result.setOutputEsDescription(_ctx.stringValue("DescribeApmResponse.Result.OutputEsDescription"));
		result.setOwnerId(_ctx.stringValue("DescribeApmResponse.Result.OwnerId"));
		result.setPaymentType(_ctx.stringValue("DescribeApmResponse.Result.PaymentType"));
		result.setRegion(_ctx.stringValue("DescribeApmResponse.Result.Region"));
		result.setReplica(_ctx.longValue("DescribeApmResponse.Result.Replica"));
		result.setResourceSpec(_ctx.stringValue("DescribeApmResponse.Result.ResourceSpec"));
		result.setStatus(_ctx.stringValue("DescribeApmResponse.Result.Status"));
		result.setVersion(_ctx.stringValue("DescribeApmResponse.Result.Version"));
		result.setVpcId(_ctx.stringValue("DescribeApmResponse.Result.VpcId"));
		result.setVsArea(_ctx.stringValue("DescribeApmResponse.Result.VsArea"));
		result.setVswitchId(_ctx.stringValue("DescribeApmResponse.Result.VswitchId"));
		describeApmResponse.setResult(result);
	 
	 	return describeApmResponse;
	}
}