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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeUserClusterHostInstanceResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeUserClusterHostInstanceResponse.InstanceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserClusterHostInstanceResponseUnmarshaller {

	public static DescribeUserClusterHostInstanceResponse unmarshall(DescribeUserClusterHostInstanceResponse describeUserClusterHostInstanceResponse, UnmarshallerContext _ctx) {
		
		describeUserClusterHostInstanceResponse.setRequestId(_ctx.stringValue("DescribeUserClusterHostInstanceResponse.RequestId"));
		describeUserClusterHostInstanceResponse.setMaxRecordsPerPage(_ctx.integerValue("DescribeUserClusterHostInstanceResponse.MaxRecordsPerPage"));
		describeUserClusterHostInstanceResponse.setPageNumber(_ctx.integerValue("DescribeUserClusterHostInstanceResponse.PageNumber"));
		describeUserClusterHostInstanceResponse.setTotalRecords(_ctx.integerValue("DescribeUserClusterHostInstanceResponse.TotalRecords"));
		describeUserClusterHostInstanceResponse.setItemNumbers(_ctx.integerValue("DescribeUserClusterHostInstanceResponse.ItemNumbers"));

		List<InstanceInfo> instancesItems = new ArrayList<InstanceInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserClusterHostInstanceResponse.InstancesItems.Length"); i++) {
			InstanceInfo instanceInfo = new InstanceInfo();
			instanceInfo.setInstanceId(_ctx.stringValue("DescribeUserClusterHostInstanceResponse.InstancesItems["+ i +"].InstanceId"));
			instanceInfo.setClusterId(_ctx.stringValue("DescribeUserClusterHostInstanceResponse.InstancesItems["+ i +"].ClusterId"));
			instanceInfo.setRegionId(_ctx.stringValue("DescribeUserClusterHostInstanceResponse.InstancesItems["+ i +"].RegionId"));
			instanceInfo.setZoneId(_ctx.stringValue("DescribeUserClusterHostInstanceResponse.InstancesItems["+ i +"].ZoneId"));
			instanceInfo.setInstanceType(_ctx.stringValue("DescribeUserClusterHostInstanceResponse.InstancesItems["+ i +"].InstanceType"));
			instanceInfo.setEngine(_ctx.stringValue("DescribeUserClusterHostInstanceResponse.InstancesItems["+ i +"].Engine"));
			instanceInfo.setEngineVersion(_ctx.stringValue("DescribeUserClusterHostInstanceResponse.InstancesItems["+ i +"].EngineVersion"));
			instanceInfo.setInstanceStatus(_ctx.stringValue("DescribeUserClusterHostInstanceResponse.InstancesItems["+ i +"].InstanceStatus"));
			instanceInfo.setInstanceClass(_ctx.stringValue("DescribeUserClusterHostInstanceResponse.InstancesItems["+ i +"].InstanceClass"));
			instanceInfo.setCreateTime(_ctx.stringValue("DescribeUserClusterHostInstanceResponse.InstancesItems["+ i +"].CreateTime"));

			instancesItems.add(instanceInfo);
		}
		describeUserClusterHostInstanceResponse.setInstancesItems(instancesItems);
	 
	 	return describeUserClusterHostInstanceResponse;
	}
}