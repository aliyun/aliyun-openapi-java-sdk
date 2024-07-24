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

package com.aliyuncs.hbase.transform.v20190101;

import com.aliyuncs.hbase.model.v20190101.DescribeServerlessClusterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServerlessClusterResponseUnmarshaller {

	public static DescribeServerlessClusterResponse unmarshall(DescribeServerlessClusterResponse describeServerlessClusterResponse, UnmarshallerContext _ctx) {
		
		describeServerlessClusterResponse.setRequestId(_ctx.stringValue("DescribeServerlessClusterResponse.RequestId"));
		describeServerlessClusterResponse.setVpcId(_ctx.stringValue("DescribeServerlessClusterResponse.VpcId"));
		describeServerlessClusterResponse.setStatus(_ctx.stringValue("DescribeServerlessClusterResponse.Status"));
		describeServerlessClusterResponse.setInnerEndpoint(_ctx.stringValue("DescribeServerlessClusterResponse.InnerEndpoint"));
		describeServerlessClusterResponse.setCreateTime(_ctx.stringValue("DescribeServerlessClusterResponse.CreateTime"));
		describeServerlessClusterResponse.setPayType(_ctx.stringValue("DescribeServerlessClusterResponse.PayType"));
		describeServerlessClusterResponse.setMainVersion(_ctx.stringValue("DescribeServerlessClusterResponse.MainVersion"));
		describeServerlessClusterResponse.setLockMode(_ctx.stringValue("DescribeServerlessClusterResponse.LockMode"));
		describeServerlessClusterResponse.setHasUser(_ctx.stringValue("DescribeServerlessClusterResponse.HasUser"));
		describeServerlessClusterResponse.setHaType(_ctx.stringValue("DescribeServerlessClusterResponse.HaType"));
		describeServerlessClusterResponse.setUpdateStatus(_ctx.stringValue("DescribeServerlessClusterResponse.UpdateStatus"));
		describeServerlessClusterResponse.setReserverMaxQpsNum(_ctx.stringValue("DescribeServerlessClusterResponse.ReserverMaxQpsNum"));
		describeServerlessClusterResponse.setInstanceName(_ctx.stringValue("DescribeServerlessClusterResponse.InstanceName"));
		describeServerlessClusterResponse.setOuterEndpoint(_ctx.stringValue("DescribeServerlessClusterResponse.OuterEndpoint"));
		describeServerlessClusterResponse.setCuSize(_ctx.stringValue("DescribeServerlessClusterResponse.CuSize"));
		describeServerlessClusterResponse.setExpireTime(_ctx.stringValue("DescribeServerlessClusterResponse.ExpireTime"));
		describeServerlessClusterResponse.setReserverMinQpsNum(_ctx.stringValue("DescribeServerlessClusterResponse.ReserverMinQpsNum"));
		describeServerlessClusterResponse.setAutoRenew(_ctx.stringValue("DescribeServerlessClusterResponse.AutoRenew"));
		describeServerlessClusterResponse.setDiskSize(_ctx.stringValue("DescribeServerlessClusterResponse.DiskSize"));
		describeServerlessClusterResponse.setInstanceId(_ctx.stringValue("DescribeServerlessClusterResponse.InstanceId"));
		describeServerlessClusterResponse.setIsDeletionProtection(_ctx.stringValue("DescribeServerlessClusterResponse.IsDeletionProtection"));
		describeServerlessClusterResponse.setRegionId(_ctx.stringValue("DescribeServerlessClusterResponse.RegionId"));
		describeServerlessClusterResponse.setVSwitchId(_ctx.stringValue("DescribeServerlessClusterResponse.VSwitchId"));
		describeServerlessClusterResponse.setClusterType(_ctx.stringValue("DescribeServerlessClusterResponse.ClusterType"));
		describeServerlessClusterResponse.setResourceGroupId(_ctx.stringValue("DescribeServerlessClusterResponse.ResourceGroupId"));
		describeServerlessClusterResponse.setZoneId(_ctx.stringValue("DescribeServerlessClusterResponse.ZoneId"));
	 
	 	return describeServerlessClusterResponse;
	}
}