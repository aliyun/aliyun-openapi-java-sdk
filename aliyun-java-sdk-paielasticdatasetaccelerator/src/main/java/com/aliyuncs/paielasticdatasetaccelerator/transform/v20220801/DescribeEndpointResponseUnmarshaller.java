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

package com.aliyuncs.paielasticdatasetaccelerator.transform.v20220801;

import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.DescribeEndpointResponse;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.DescribeEndpointResponse.Status;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.DescribeEndpointResponse.Status.Detail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEndpointResponseUnmarshaller {

	public static DescribeEndpointResponse unmarshall(DescribeEndpointResponse describeEndpointResponse, UnmarshallerContext _ctx) {
		
		describeEndpointResponse.setRequestId(_ctx.stringValue("DescribeEndpointResponse.RequestId"));
		describeEndpointResponse.setUserId(_ctx.stringValue("DescribeEndpointResponse.UserId"));
		describeEndpointResponse.setOwnerId(_ctx.stringValue("DescribeEndpointResponse.OwnerId"));
		describeEndpointResponse.setGmtCreateTime(_ctx.stringValue("DescribeEndpointResponse.GmtCreateTime"));
		describeEndpointResponse.setGmtModifiedTime(_ctx.stringValue("DescribeEndpointResponse.GmtModifiedTime"));
		describeEndpointResponse.setUuid(_ctx.stringValue("DescribeEndpointResponse.Uuid"));
		describeEndpointResponse.setName(_ctx.stringValue("DescribeEndpointResponse.Name"));
		describeEndpointResponse.setType(_ctx.stringValue("DescribeEndpointResponse.Type"));
		describeEndpointResponse.setVpcId(_ctx.stringValue("DescribeEndpointResponse.VpcId"));
		describeEndpointResponse.setVswitchId(_ctx.stringValue("DescribeEndpointResponse.VswitchId"));

		Status status = new Status();
		status.setPhase(_ctx.stringValue("DescribeEndpointResponse.Status.Phase"));
		status.setCode(_ctx.stringValue("DescribeEndpointResponse.Status.Code"));
		status.setMessage(_ctx.stringValue("DescribeEndpointResponse.Status.Message"));

		Detail detail = new Detail();
		detail.setIpPortMapping(_ctx.mapValue("DescribeEndpointResponse.Status.Detail.IpPortMapping"));
		status.setDetail(detail);
		describeEndpointResponse.setStatus(status);
	 
	 	return describeEndpointResponse;
	}
}