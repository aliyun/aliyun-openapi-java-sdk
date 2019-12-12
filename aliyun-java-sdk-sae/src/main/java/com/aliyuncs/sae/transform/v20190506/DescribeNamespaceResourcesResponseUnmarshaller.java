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
		describeNamespaceResourcesResponse.setCode(_ctx.stringValue("DescribeNamespaceResourcesResponse.Code"));
		describeNamespaceResourcesResponse.setMessage(_ctx.stringValue("DescribeNamespaceResourcesResponse.Message"));
		describeNamespaceResourcesResponse.setErrorCode(_ctx.stringValue("DescribeNamespaceResourcesResponse.ErrorCode"));
		describeNamespaceResourcesResponse.setTraceId(_ctx.stringValue("DescribeNamespaceResourcesResponse.TraceId"));
		describeNamespaceResourcesResponse.setSuccess(_ctx.booleanValue("DescribeNamespaceResourcesResponse.Success"));

		Data data = new Data();
		data.setNamespaceId(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.NamespaceId"));
		data.setNamespaceName(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.NamespaceName"));
		data.setDescription(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.Description"));
		data.setUserId(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.UserId"));
		data.setBelongRegion(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.BelongRegion"));
		data.setTenantId(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.TenantId"));
		data.setVpcId(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.VpcId"));
		data.setVSwitchId(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.VSwitchId"));
		data.setSecurityGroupId(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.SecurityGroupId"));
		data.setAppCount(_ctx.longValue("DescribeNamespaceResourcesResponse.Data.AppCount"));
		data.setLastChangeOrderId(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.LastChangeOrderId"));
		data.setLastChangeOrderStatus(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.LastChangeOrderStatus"));
		data.setLastChangeOrderRunning(_ctx.booleanValue("DescribeNamespaceResourcesResponse.Data.LastChangeOrderRunning"));
		data.setVpcName(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.VpcName"));
		data.setVSwitchName(_ctx.stringValue("DescribeNamespaceResourcesResponse.Data.VSwitchName"));
		data.setNotificationExpired(_ctx.booleanValue("DescribeNamespaceResourcesResponse.Data.NotificationExpired"));
		describeNamespaceResourcesResponse.setData(data);
	 
	 	return describeNamespaceResourcesResponse;
	}
}