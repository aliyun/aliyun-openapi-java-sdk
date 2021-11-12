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

package com.aliyuncs.uisplus.transform.v20200707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.uisplus.model.v20200707.DescribeGreConnectionsResponse;
import com.aliyuncs.uisplus.model.v20200707.DescribeGreConnectionsResponse.GreConnectionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGreConnectionsResponseUnmarshaller {

	public static DescribeGreConnectionsResponse unmarshall(DescribeGreConnectionsResponse describeGreConnectionsResponse, UnmarshallerContext _ctx) {
		
		describeGreConnectionsResponse.setRequestId(_ctx.stringValue("DescribeGreConnectionsResponse.RequestId"));
		describeGreConnectionsResponse.setUisId(_ctx.stringValue("DescribeGreConnectionsResponse.UisId"));
		describeGreConnectionsResponse.setState(_ctx.stringValue("DescribeGreConnectionsResponse.State"));
		describeGreConnectionsResponse.setPageSize(_ctx.longValue("DescribeGreConnectionsResponse.PageSize"));
		describeGreConnectionsResponse.setTotalCount(_ctx.integerValue("DescribeGreConnectionsResponse.TotalCount"));
		describeGreConnectionsResponse.setUisName(_ctx.stringValue("DescribeGreConnectionsResponse.UisName"));
		describeGreConnectionsResponse.setPage(_ctx.longValue("DescribeGreConnectionsResponse.Page"));

		List<GreConnectionsItem> greConnections = new ArrayList<GreConnectionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGreConnectionsResponse.GreConnections.Length"); i++) {
			GreConnectionsItem greConnectionsItem = new GreConnectionsItem();
			greConnectionsItem.setCustomerIp(_ctx.stringValue("DescribeGreConnectionsResponse.GreConnections["+ i +"].CustomerIp"));
			greConnectionsItem.setCustomerTunnelIp(_ctx.stringValue("DescribeGreConnectionsResponse.GreConnections["+ i +"].CustomerTunnelIp"));
			greConnectionsItem.setLocalTunnelIp(_ctx.stringValue("DescribeGreConnectionsResponse.GreConnections["+ i +"].LocalTunnelIp"));
			greConnectionsItem.setDescription(_ctx.stringValue("DescribeGreConnectionsResponse.GreConnections["+ i +"].Description"));
			greConnectionsItem.setCidrs(_ctx.stringValue("DescribeGreConnectionsResponse.GreConnections["+ i +"].Cidrs"));
			greConnectionsItem.setState(_ctx.stringValue("DescribeGreConnectionsResponse.GreConnections["+ i +"].State"));
			greConnectionsItem.setCreateTime(_ctx.longValue("DescribeGreConnectionsResponse.GreConnections["+ i +"].CreateTime"));
			greConnectionsItem.setName(_ctx.stringValue("DescribeGreConnectionsResponse.GreConnections["+ i +"].Name"));
			greConnectionsItem.setLocalIp(_ctx.stringValue("DescribeGreConnectionsResponse.GreConnections["+ i +"].LocalIp"));
			greConnectionsItem.setGreConnectionId(_ctx.stringValue("DescribeGreConnectionsResponse.GreConnections["+ i +"].GreConnectionId"));

			greConnections.add(greConnectionsItem);
		}
		describeGreConnectionsResponse.setGreConnections(greConnections);
	 
	 	return describeGreConnectionsResponse;
	}
}