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

package com.aliyuncs.cassandra.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cassandra.model.v20190101.DescribeDataCentersResponse;
import com.aliyuncs.cassandra.model.v20190101.DescribeDataCentersResponse.DataCenter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataCentersResponseUnmarshaller {

	public static DescribeDataCentersResponse unmarshall(DescribeDataCentersResponse describeDataCentersResponse, UnmarshallerContext _ctx) {
		
		describeDataCentersResponse.setRequestId(_ctx.stringValue("DescribeDataCentersResponse.RequestId"));

		List<DataCenter> dataCenters = new ArrayList<DataCenter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataCentersResponse.DataCenters.Length"); i++) {
			DataCenter dataCenter = new DataCenter();
			dataCenter.setDataCenterId(_ctx.stringValue("DescribeDataCentersResponse.DataCenters["+ i +"].DataCenterId"));
			dataCenter.setRegionId(_ctx.stringValue("DescribeDataCentersResponse.DataCenters["+ i +"].RegionId"));
			dataCenter.setZoneId(_ctx.stringValue("DescribeDataCentersResponse.DataCenters["+ i +"].ZoneId"));
			dataCenter.setClusterId(_ctx.stringValue("DescribeDataCentersResponse.DataCenters["+ i +"].ClusterId"));
			dataCenter.setDataCenterName(_ctx.stringValue("DescribeDataCentersResponse.DataCenters["+ i +"].DataCenterName"));
			dataCenter.setStatus(_ctx.stringValue("DescribeDataCentersResponse.DataCenters["+ i +"].Status"));
			dataCenter.setCreatedTime(_ctx.stringValue("DescribeDataCentersResponse.DataCenters["+ i +"].CreatedTime"));
			dataCenter.setInstanceType(_ctx.stringValue("DescribeDataCentersResponse.DataCenters["+ i +"].InstanceType"));
			dataCenter.setNodeCount(_ctx.integerValue("DescribeDataCentersResponse.DataCenters["+ i +"].NodeCount"));
			dataCenter.setDiskType(_ctx.stringValue("DescribeDataCentersResponse.DataCenters["+ i +"].DiskType"));
			dataCenter.setDiskSize(_ctx.integerValue("DescribeDataCentersResponse.DataCenters["+ i +"].DiskSize"));
			dataCenter.setVpcId(_ctx.stringValue("DescribeDataCentersResponse.DataCenters["+ i +"].VpcId"));
			dataCenter.setVswitchId(_ctx.stringValue("DescribeDataCentersResponse.DataCenters["+ i +"].VswitchId"));
			dataCenter.setPayType(_ctx.stringValue("DescribeDataCentersResponse.DataCenters["+ i +"].PayType"));
			dataCenter.setCommodityInstance(_ctx.stringValue("DescribeDataCentersResponse.DataCenters["+ i +"].CommodityInstance"));
			dataCenter.setExpireTime(_ctx.stringValue("DescribeDataCentersResponse.DataCenters["+ i +"].ExpireTime"));
			dataCenter.setLockMode(_ctx.stringValue("DescribeDataCentersResponse.DataCenters["+ i +"].LockMode"));
			dataCenter.setAutoRenewal(_ctx.booleanValue("DescribeDataCentersResponse.DataCenters["+ i +"].AutoRenewal"));
			dataCenter.setAutoRenewPeriod(_ctx.integerValue("DescribeDataCentersResponse.DataCenters["+ i +"].AutoRenewPeriod"));

			dataCenters.add(dataCenter);
		}
		describeDataCentersResponse.setDataCenters(dataCenters);
	 
	 	return describeDataCentersResponse;
	}
}