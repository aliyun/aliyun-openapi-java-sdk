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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeInstanceAttributeResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeInstanceAttributeResponse.DBInstanceAttribute;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAttributeResponseUnmarshaller {

	public static DescribeInstanceAttributeResponse unmarshall(DescribeInstanceAttributeResponse describeInstanceAttributeResponse, UnmarshallerContext context) {
		
		describeInstanceAttributeResponse.setRequestId(context.stringValue("DescribeInstanceAttributeResponse.RequestId"));

		List<DBInstanceAttribute> instances = new ArrayList<DBInstanceAttribute>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceAttributeResponse.Instances.Length"); i++) {
			DBInstanceAttribute dBInstanceAttribute = new DBInstanceAttribute();
			dBInstanceAttribute.setInstanceId(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].InstanceId"));
			dBInstanceAttribute.setInstanceName(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].InstanceName"));
			dBInstanceAttribute.setConnectionDomain(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].ConnectionDomain"));
			dBInstanceAttribute.setPort(context.longValue("DescribeInstanceAttributeResponse.Instances["+ i +"].Port"));
			dBInstanceAttribute.setInstanceStatus(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].InstanceStatus"));
			dBInstanceAttribute.setRegionId(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].RegionId"));
			dBInstanceAttribute.setCapacity(context.longValue("DescribeInstanceAttributeResponse.Instances["+ i +"].Capacity"));
			dBInstanceAttribute.setInstanceClass(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].InstanceClass"));
			dBInstanceAttribute.setQPS(context.longValue("DescribeInstanceAttributeResponse.Instances["+ i +"].QPS"));
			dBInstanceAttribute.setBandwidth(context.longValue("DescribeInstanceAttributeResponse.Instances["+ i +"].Bandwidth"));
			dBInstanceAttribute.setConnections(context.longValue("DescribeInstanceAttributeResponse.Instances["+ i +"].Connections"));
			dBInstanceAttribute.setZoneId(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].ZoneId"));
			dBInstanceAttribute.setConfig(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].Config"));
			dBInstanceAttribute.setChargeType(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].ChargeType"));
			dBInstanceAttribute.setNodeType(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].NodeType"));
			dBInstanceAttribute.setNetworkType(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].NetworkType"));
			dBInstanceAttribute.setVpcId(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].VpcId"));
			dBInstanceAttribute.setVSwitchId(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].VSwitchId"));
			dBInstanceAttribute.setPrivateIp(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].PrivateIp"));
			dBInstanceAttribute.setCreateTime(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].CreateTime"));
			dBInstanceAttribute.setEndTime(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].EndTime"));
			dBInstanceAttribute.setHasRenewChangeOrder(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].HasRenewChangeOrder"));
			dBInstanceAttribute.setIsRds(context.booleanValue("DescribeInstanceAttributeResponse.Instances["+ i +"].IsRds"));
			dBInstanceAttribute.setEngine(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].Engine"));
			dBInstanceAttribute.setEngineVersion(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].EngineVersion"));
			dBInstanceAttribute.setMaintainStartTime(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].MaintainStartTime"));
			dBInstanceAttribute.setMaintainEndTime(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].MaintainEndTime"));
			dBInstanceAttribute.setAvailabilityValue(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].AvailabilityValue"));
			dBInstanceAttribute.setSecurityIPList(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].SecurityIPList"));
			dBInstanceAttribute.setInstanceType(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].InstanceType"));
			dBInstanceAttribute.setArchitectureType(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].ArchitectureType"));
			dBInstanceAttribute.setNodeType1(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].NodeType"));
			dBInstanceAttribute.setPackageType(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].PackageType"));
			dBInstanceAttribute.setReplicaId(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].ReplicaId"));
			dBInstanceAttribute.setVpcAuthMode(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].VpcAuthMode"));
			dBInstanceAttribute.setVpcAuthMode2(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].VpcAuthMode"));
			dBInstanceAttribute.setReplicationMode(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].ReplicationMode"));
			dBInstanceAttribute.setLuaStatus(context.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].LuaStatus"));

			instances.add(dBInstanceAttribute);
		}
		describeInstanceAttributeResponse.setInstances(instances);
	 
	 	return describeInstanceAttributeResponse;
	}
}