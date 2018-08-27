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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeInstancesByExpireTimeResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeInstancesByExpireTimeResponse.KVStoreInstance;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesByExpireTimeResponseUnmarshaller {

	public static DescribeInstancesByExpireTimeResponse unmarshall(DescribeInstancesByExpireTimeResponse describeInstancesByExpireTimeResponse, UnmarshallerContext context) {
		
		describeInstancesByExpireTimeResponse.setRequestId(context.stringValue("DescribeInstancesByExpireTimeResponse.RequestId"));
		describeInstancesByExpireTimeResponse.setPageNumber(context.integerValue("DescribeInstancesByExpireTimeResponse.PageNumber"));
		describeInstancesByExpireTimeResponse.setPageSize(context.integerValue("DescribeInstancesByExpireTimeResponse.PageSize"));
		describeInstancesByExpireTimeResponse.setTotalCount(context.integerValue("DescribeInstancesByExpireTimeResponse.TotalCount"));

		List<KVStoreInstance> instances = new ArrayList<KVStoreInstance>();
		for (int i = 0; i < context.lengthValue("DescribeInstancesByExpireTimeResponse.Instances.Length"); i++) {
			KVStoreInstance kVStoreInstance = new KVStoreInstance();
			kVStoreInstance.setReplacateId(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].ReplacateId"));
			kVStoreInstance.setInstanceId(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].InstanceId"));
			kVStoreInstance.setInstanceName(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].InstanceName"));
			kVStoreInstance.setConnectionDomain(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].ConnectionDomain"));
			kVStoreInstance.setPort(context.longValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].Port"));
			kVStoreInstance.setUserName(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].UserName"));
			kVStoreInstance.setInstanceStatus(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].InstanceStatus"));
			kVStoreInstance.setRegionId(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].RegionId"));
			kVStoreInstance.setCapacity(context.longValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].Capacity"));
			kVStoreInstance.setInstanceClass(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].InstanceClass"));
			kVStoreInstance.setQPS(context.longValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].QPS"));
			kVStoreInstance.setBandwidth(context.longValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].Bandwidth"));
			kVStoreInstance.setConnections(context.longValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].Connections"));
			kVStoreInstance.setZoneId(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].ZoneId"));
			kVStoreInstance.setConfig(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].Config"));
			kVStoreInstance.setChargeType(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].ChargeType"));
			kVStoreInstance.setNetworkType(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].NetworkType"));
			kVStoreInstance.setVpcId(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].VpcId"));
			kVStoreInstance.setVSwitchId(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].VSwitchId"));
			kVStoreInstance.setPrivateIp(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].PrivateIp"));
			kVStoreInstance.setCreateTime(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].CreateTime"));
			kVStoreInstance.setEndTime(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].EndTime"));
			kVStoreInstance.setHasRenewChangeOrder(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].HasRenewChangeOrder"));
			kVStoreInstance.setIsRds(context.booleanValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].IsRds"));
			kVStoreInstance.setInstanceType(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].InstanceType"));
			kVStoreInstance.setArchitectureType(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].ArchitectureType"));
			kVStoreInstance.setNodeType(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].NodeType"));
			kVStoreInstance.setPackageType(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].PackageType"));
			kVStoreInstance.setEngineVersion(context.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].EngineVersion"));

			instances.add(kVStoreInstance);
		}
		describeInstancesByExpireTimeResponse.setInstances(instances);
	 
	 	return describeInstancesByExpireTimeResponse;
	}
}