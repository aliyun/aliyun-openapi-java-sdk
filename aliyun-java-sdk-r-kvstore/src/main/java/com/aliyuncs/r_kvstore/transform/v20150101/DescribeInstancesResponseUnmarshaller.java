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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeInstancesResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeInstancesResponse.KVStoreInstance;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext context) {
		
		describeInstancesResponse.setRequestId(context.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setPageNumber(context.integerValue("DescribeInstancesResponse.PageNumber"));
		describeInstancesResponse.setPageSize(context.integerValue("DescribeInstancesResponse.PageSize"));
		describeInstancesResponse.setTotalCount(context.integerValue("DescribeInstancesResponse.TotalCount"));

		List<KVStoreInstance> instances = new ArrayList<KVStoreInstance>();
		for (int i = 0; i < context.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			KVStoreInstance kVStoreInstance = new KVStoreInstance();
			kVStoreInstance.setReplacateId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].ReplacateId"));
			kVStoreInstance.setInstanceId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			kVStoreInstance.setInstanceName(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceName"));
			kVStoreInstance.setConnectionDomain(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].ConnectionDomain"));
			kVStoreInstance.setPort(context.longValue("DescribeInstancesResponse.Instances["+ i +"].Port"));
			kVStoreInstance.setUserName(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].UserName"));
			kVStoreInstance.setInstanceStatus(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceStatus"));
			kVStoreInstance.setRegionId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].RegionId"));
			kVStoreInstance.setCapacity(context.longValue("DescribeInstancesResponse.Instances["+ i +"].Capacity"));
			kVStoreInstance.setInstanceClass(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceClass"));
			kVStoreInstance.setQPS(context.longValue("DescribeInstancesResponse.Instances["+ i +"].QPS"));
			kVStoreInstance.setBandwidth(context.longValue("DescribeInstancesResponse.Instances["+ i +"].Bandwidth"));
			kVStoreInstance.setConnections(context.longValue("DescribeInstancesResponse.Instances["+ i +"].Connections"));
			kVStoreInstance.setZoneId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].ZoneId"));
			kVStoreInstance.setConfig(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].Config"));
			kVStoreInstance.setChargeType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].ChargeType"));
			kVStoreInstance.setNetworkType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkType"));
			kVStoreInstance.setVpcId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcId"));
			kVStoreInstance.setVSwitchId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].VSwitchId"));
			kVStoreInstance.setPrivateIp(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].PrivateIp"));
			kVStoreInstance.setCreateTime(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreateTime"));
			kVStoreInstance.setEndTime(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].EndTime"));
			kVStoreInstance.setHasRenewChangeOrder(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].HasRenewChangeOrder"));
			kVStoreInstance.setIsRds(context.booleanValue("DescribeInstancesResponse.Instances["+ i +"].IsRds"));
			kVStoreInstance.setInstanceType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceType"));
			kVStoreInstance.setArchitectureType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].ArchitectureType"));
			kVStoreInstance.setNodeType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].NodeType"));
			kVStoreInstance.setPackageType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].PackageType"));
			kVStoreInstance.setEngineVersion(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].EngineVersion"));
			kVStoreInstance.setDestroyTime(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].DestroyTime"));

			instances.add(kVStoreInstance);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}