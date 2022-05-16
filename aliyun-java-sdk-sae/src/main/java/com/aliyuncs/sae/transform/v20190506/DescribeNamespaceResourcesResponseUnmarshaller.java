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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.DescribeNamespaceResourcesResponse;
import com.aliyuncs.sae.model.v20190506.DescribeNamespaceResourcesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNamespaceResourcesResponseUnmarshaller {

	public static DescribeNamespaceResourcesResponse unmarshall(DescribeNamespaceResourcesResponse describeNamespaceResourcesResponse, UnmarshallerContext _ctx) {
		
		describeNamespaceResourcesResponse.setRequestId(_ctx.stringValue("DescribeNamespaceResourcesResponse.RequestId"));
		describeNamespaceResourcesResponse.setMessage(_ctx.stringValue("DescribeNamespaceResourcesResponse.Message"));
		describeNamespaceResourcesResponse.setTraceId(_ctx.stringValue("DescribeNamespaceResourcesResponse.TraceId"));
		describeNamespaceResourcesResponse.setErrorCode(_ctx.stringValue("DescribeNamespaceResourcesResponse.ErrorCode"));
		describeNamespaceResourcesResponse.setCode(_ctx.stringValue("DescribeNamespaceResourcesResponse.Code"));
		describeNamespaceResourcesResponse.setSuccess(_ctx.booleanValue("DescribeNamespaceResourcesResponse.Success"));

		Data data = new Data();
		data.setVpcId(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.VpcId"));
		data.setLastChangeOrderId(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.LastChangeOrderId"));
		data.setBelongRegion(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.BelongRegion"));
		data.setNamespaceId(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.NamespaceId"));
		data.setSecurityGroupId(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.SecurityGroupId"));
		data.setUserId(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.UserId"));
		data.setNamespaceName(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.NamespaceName"));
		data.setLastChangeOrderStatus(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.LastChangeOrderStatus"));
		data.setVpcName(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.VpcName"));
		data.setVSwitchId(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.VSwitchId"));
		data.setDescription(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.Description"));
		data.setLastChangeOrderRunning(_ctx.booleanValue("DescribeNamespaceResourcesResponse.Data.LastChangeOrderRunning"));
		data.setAppCount(_ctx.longValue("DescribeNamespaceResourcesResponse.Data.AppCount"));
		data.setVSwitchName(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.VSwitchName"));
		data.setNotificationExpired(_ctx.booleanValue("DescribeNamespaceResourcesResponse.Data.NotificationExpired"));
		data.setTenantId(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.TenantId"));
		data.setJumpServerAppId(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.JumpServerAppId"));
		describeNamespaceResourcesResponse.setData(data);
	 
	 	return describeNamespaceResourcesResponse;
	}
}