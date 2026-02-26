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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeParentInstanceResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeParentInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParentInstanceResponseUnmarshaller {

	public static DescribeParentInstanceResponse unmarshall(DescribeParentInstanceResponse describeParentInstanceResponse, UnmarshallerContext _ctx) {
		
		describeParentInstanceResponse.setRequestId(_ctx.stringValue("DescribeParentInstanceResponse.RequestId"));
		describeParentInstanceResponse.setCurrentPage(_ctx.integerValue("DescribeParentInstanceResponse.CurrentPage"));
		describeParentInstanceResponse.setPageSize(_ctx.integerValue("DescribeParentInstanceResponse.PageSize"));
		describeParentInstanceResponse.setTotalCount(_ctx.integerValue("DescribeParentInstanceResponse.TotalCount"));

		List<Data> items = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParentInstanceResponse.Items.Length"); i++) {
			Data data = new Data();
			data.setInstanceId(_ctx.stringValue("DescribeParentInstanceResponse.Items["+ i +"].InstanceId"));
			data.setLocalName(_ctx.stringValue("DescribeParentInstanceResponse.Items["+ i +"].LocalName"));
			data.setEngineType(_ctx.stringValue("DescribeParentInstanceResponse.Items["+ i +"].EngineType"));
			data.setParentId(_ctx.stringValue("DescribeParentInstanceResponse.Items["+ i +"].ParentId"));
			data.setDbNum(_ctx.stringValue("DescribeParentInstanceResponse.Items["+ i +"].DbNum"));
			data.setClusterStatus(_ctx.stringValue("DescribeParentInstanceResponse.Items["+ i +"].ClusterStatus"));
			data.setTenantId(_ctx.stringValue("DescribeParentInstanceResponse.Items["+ i +"].TenantId"));
			data.setTenantName(_ctx.stringValue("DescribeParentInstanceResponse.Items["+ i +"].TenantName"));
			data.setInstanceDescription(_ctx.stringValue("DescribeParentInstanceResponse.Items["+ i +"].InstanceDescription"));
			data.setResourceType(_ctx.stringValue("DescribeParentInstanceResponse.Items["+ i +"].ResourceType"));
			data.setUnConnectDbCount(_ctx.stringValue("DescribeParentInstanceResponse.Items["+ i +"].UnConnectDbCount"));
			data.setUnSupportOneClickAuthReason(_ctx.stringValue("DescribeParentInstanceResponse.Items["+ i +"].UnSupportOneClickAuthReason"));
			data.setConnectNode(_ctx.stringValue("DescribeParentInstanceResponse.Items["+ i +"].ConnectNode"));
			data.setSupportConnectNodes(_ctx.stringValue("DescribeParentInstanceResponse.Items["+ i +"].SupportConnectNodes"));
			data.setAuthStatus(_ctx.integerValue("DescribeParentInstanceResponse.Items["+ i +"].AuthStatus"));
			data.setInstanceSize(_ctx.longValue("DescribeParentInstanceResponse.Items["+ i +"].InstanceSize"));
			data.setAuditStatus(_ctx.integerValue("DescribeParentInstanceResponse.Items["+ i +"].AuditStatus"));

			items.add(data);
		}
		describeParentInstanceResponse.setItems(items);
	 
	 	return describeParentInstanceResponse;
	}
}