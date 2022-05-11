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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeInstancesOverviewResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeInstancesOverviewResponse.KVStoreInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesOverviewResponseUnmarshaller {

	public static DescribeInstancesOverviewResponse unmarshall(DescribeInstancesOverviewResponse describeInstancesOverviewResponse, UnmarshallerContext _ctx) {
		
		describeInstancesOverviewResponse.setRequestId(_ctx.stringValue("DescribeInstancesOverviewResponse.RequestId"));
		describeInstancesOverviewResponse.setTotalCount(_ctx.integerValue("DescribeInstancesOverviewResponse.TotalCount"));

		List<KVStoreInstance> instances = new ArrayList<KVStoreInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesOverviewResponse.Instances.Length"); i++) {
			KVStoreInstance kVStoreInstance = new KVStoreInstance();
			kVStoreInstance.setVpcId(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].VpcId"));
			kVStoreInstance.setPrivateIp(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].PrivateIp"));
			kVStoreInstance.setCapacity(_ctx.longValue("DescribeInstancesOverviewResponse.Instances["+ i +"].Capacity"));
			kVStoreInstance.setCreateTime(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].CreateTime"));
			kVStoreInstance.setConnectionDomain(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].ConnectionDomain"));
			kVStoreInstance.setChargeType(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].ChargeType"));
			kVStoreInstance.setArchitectureType(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].ArchitectureType"));
			kVStoreInstance.setNetworkType(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].NetworkType"));
			kVStoreInstance.setEngineVersion(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].EngineVersion"));
			kVStoreInstance.setInstanceName(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].InstanceName"));
			kVStoreInstance.setGlobalInstanceId(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].GlobalInstanceId"));
			kVStoreInstance.setInstanceClass(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].InstanceClass"));
			kVStoreInstance.setInstanceId(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].InstanceId"));
			kVStoreInstance.setInstanceType(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].InstanceType"));
			kVStoreInstance.setRegionId(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].RegionId"));
			kVStoreInstance.setEndTime(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].EndTime"));
			kVStoreInstance.setVSwitchId(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].VSwitchId"));
			kVStoreInstance.setResourceGroupId(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].ResourceGroupId"));
			kVStoreInstance.setZoneId(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].ZoneId"));
			kVStoreInstance.setInstanceStatus(_ctx.stringValue("DescribeInstancesOverviewResponse.Instances["+ i +"].InstanceStatus"));

			instances.add(kVStoreInstance);
		}
		describeInstancesOverviewResponse.setInstances(instances);
	 
	 	return describeInstancesOverviewResponse;
	}
}