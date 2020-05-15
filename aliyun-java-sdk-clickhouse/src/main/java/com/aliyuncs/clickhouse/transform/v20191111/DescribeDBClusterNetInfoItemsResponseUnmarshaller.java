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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeDBClusterNetInfoItemsResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeDBClusterNetInfoItemsResponse.NetInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterNetInfoItemsResponseUnmarshaller {

	public static DescribeDBClusterNetInfoItemsResponse unmarshall(DescribeDBClusterNetInfoItemsResponse describeDBClusterNetInfoItemsResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterNetInfoItemsResponse.setRequestId(_ctx.stringValue("DescribeDBClusterNetInfoItemsResponse.RequestId"));
		describeDBClusterNetInfoItemsResponse.setClusterNetworkType(_ctx.stringValue("DescribeDBClusterNetInfoItemsResponse.ClusterNetworkType"));

		List<NetInfoItem> netInfoItems = new ArrayList<NetInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterNetInfoItemsResponse.NetInfoItems.Length"); i++) {
			NetInfoItem netInfoItem = new NetInfoItem();
			netInfoItem.setConnectionString(_ctx.stringValue("DescribeDBClusterNetInfoItemsResponse.NetInfoItems["+ i +"].ConnectionString"));
			netInfoItem.setIPAddress(_ctx.stringValue("DescribeDBClusterNetInfoItemsResponse.NetInfoItems["+ i +"].IPAddress"));
			netInfoItem.setNetType(_ctx.stringValue("DescribeDBClusterNetInfoItemsResponse.NetInfoItems["+ i +"].NetType"));
			netInfoItem.setHttpPort(_ctx.stringValue("DescribeDBClusterNetInfoItemsResponse.NetInfoItems["+ i +"].HttpPort"));
			netInfoItem.setVpcId(_ctx.stringValue("DescribeDBClusterNetInfoItemsResponse.NetInfoItems["+ i +"].VpcId"));
			netInfoItem.setVSwitchId(_ctx.stringValue("DescribeDBClusterNetInfoItemsResponse.NetInfoItems["+ i +"].VSwitchId"));
			netInfoItem.setJdbcPort(_ctx.stringValue("DescribeDBClusterNetInfoItemsResponse.NetInfoItems["+ i +"].JdbcPort"));

			netInfoItems.add(netInfoItem);
		}
		describeDBClusterNetInfoItemsResponse.setNetInfoItems(netInfoItems);
	 
	 	return describeDBClusterNetInfoItemsResponse;
	}
}