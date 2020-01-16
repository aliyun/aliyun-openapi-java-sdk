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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeUserClusterHostResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeUserClusterHostResponse.HostInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserClusterHostResponseUnmarshaller {

	public static DescribeUserClusterHostResponse unmarshall(DescribeUserClusterHostResponse describeUserClusterHostResponse, UnmarshallerContext _ctx) {
		
		describeUserClusterHostResponse.setRequestId(_ctx.stringValue("DescribeUserClusterHostResponse.RequestId"));
		describeUserClusterHostResponse.setMaxRecordsPerPage(_ctx.stringValue("DescribeUserClusterHostResponse.MaxRecordsPerPage"));
		describeUserClusterHostResponse.setPageNumber(_ctx.integerValue("DescribeUserClusterHostResponse.PageNumber"));
		describeUserClusterHostResponse.setTotalRecords(_ctx.integerValue("DescribeUserClusterHostResponse.TotalRecords"));
		describeUserClusterHostResponse.setItemNumbers(_ctx.integerValue("DescribeUserClusterHostResponse.ItemNumbers"));

		List<HostInfo> hostItems = new ArrayList<HostInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserClusterHostResponse.HostItems.Length"); i++) {
			HostInfo hostInfo = new HostInfo();
			hostInfo.setClusterId(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].ClusterId"));
			hostInfo.setHostId(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].HostId"));
			hostInfo.setEngine(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].Engine"));
			hostInfo.setHostIP(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].HostIP"));
			hostInfo.setHostStatus(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].HostStatus"));
			hostInfo.setAllocationStatus(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].AllocationStatus"));
			hostInfo.setHostCpu(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].HostCpu"));
			hostInfo.setHostMem(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].HostMem"));
			hostInfo.setHostStorage(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].HostStorage"));
			hostInfo.setHostName(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].HostName"));
			hostInfo.setId(_ctx.integerValue("DescribeUserClusterHostResponse.HostItems["+ i +"].Id"));
			hostInfo.setCreateTime(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].CreateTime"));
			hostInfo.setInstanceNumber(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].InstanceNumber"));
			hostInfo.setRegionId(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].RegionId"));
			hostInfo.setZoneId(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].ZoneId"));
			hostInfo.setHostClass(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].HostClass"));
			hostInfo.setExpireTime(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].ExpireTime"));
			hostInfo.setChargeType(_ctx.stringValue("DescribeUserClusterHostResponse.HostItems["+ i +"].ChargeType"));

			hostItems.add(hostInfo);
		}
		describeUserClusterHostResponse.setHostItems(hostItems);
	 
	 	return describeUserClusterHostResponse;
	}
}