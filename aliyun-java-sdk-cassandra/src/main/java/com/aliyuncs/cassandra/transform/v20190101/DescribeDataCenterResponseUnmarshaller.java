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

import com.aliyuncs.cassandra.model.v20190101.DescribeDataCenterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataCenterResponseUnmarshaller {

	public static DescribeDataCenterResponse unmarshall(DescribeDataCenterResponse describeDataCenterResponse, UnmarshallerContext _ctx) {
		
		describeDataCenterResponse.setRequestId(_ctx.stringValue("DescribeDataCenterResponse.RequestId"));
		describeDataCenterResponse.setDataCenterId(_ctx.stringValue("DescribeDataCenterResponse.DataCenterId"));
		describeDataCenterResponse.setRegionId(_ctx.stringValue("DescribeDataCenterResponse.RegionId"));
		describeDataCenterResponse.setZoneId(_ctx.stringValue("DescribeDataCenterResponse.ZoneId"));
		describeDataCenterResponse.setClusterId(_ctx.stringValue("DescribeDataCenterResponse.ClusterId"));
		describeDataCenterResponse.setDataCenterName(_ctx.stringValue("DescribeDataCenterResponse.DataCenterName"));
		describeDataCenterResponse.setStatus(_ctx.stringValue("DescribeDataCenterResponse.Status"));
		describeDataCenterResponse.setCreatedTime(_ctx.stringValue("DescribeDataCenterResponse.CreatedTime"));
		describeDataCenterResponse.setInstanceType(_ctx.stringValue("DescribeDataCenterResponse.InstanceType"));
		describeDataCenterResponse.setNodeCount(_ctx.integerValue("DescribeDataCenterResponse.NodeCount"));
		describeDataCenterResponse.setDiskType(_ctx.stringValue("DescribeDataCenterResponse.DiskType"));
		describeDataCenterResponse.setDiskSize(_ctx.integerValue("DescribeDataCenterResponse.DiskSize"));
		describeDataCenterResponse.setVpcId(_ctx.stringValue("DescribeDataCenterResponse.VpcId"));
		describeDataCenterResponse.setVswitchId(_ctx.stringValue("DescribeDataCenterResponse.VswitchId"));
		describeDataCenterResponse.setPayType(_ctx.stringValue("DescribeDataCenterResponse.PayType"));
		describeDataCenterResponse.setCommodityInstance(_ctx.stringValue("DescribeDataCenterResponse.CommodityInstance"));
		describeDataCenterResponse.setExpireTime(_ctx.stringValue("DescribeDataCenterResponse.ExpireTime"));
		describeDataCenterResponse.setLockMode(_ctx.stringValue("DescribeDataCenterResponse.LockMode"));
	 
	 	return describeDataCenterResponse;
	}
}