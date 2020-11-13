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
import com.aliyuncs.r_kvstore.model.v20150101.DescribeInstanceAttributeResponse.DBInstanceAttribute.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAttributeResponseUnmarshaller {

	public static DescribeInstanceAttributeResponse unmarshall(DescribeInstanceAttributeResponse describeInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeInstanceAttributeResponse.RequestId"));

		List<DBInstanceAttribute> instances = new ArrayList<DBInstanceAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAttributeResponse.Instances.Length"); i++) {
			DBInstanceAttribute dBInstanceAttribute = new DBInstanceAttribute();
			dBInstanceAttribute.setInstanceId(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].InstanceId"));
			dBInstanceAttribute.setInstanceName(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].InstanceName"));
			dBInstanceAttribute.setConnectionDomain(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].ConnectionDomain"));
			dBInstanceAttribute.setPort(_ctx.longValue("DescribeInstanceAttributeResponse.Instances["+ i +"].Port"));
			dBInstanceAttribute.setInstanceStatus(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].InstanceStatus"));
			dBInstanceAttribute.setRegionId(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].RegionId"));
			dBInstanceAttribute.setCapacity(_ctx.longValue("DescribeInstanceAttributeResponse.Instances["+ i +"].Capacity"));
			dBInstanceAttribute.setInstanceClass(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].InstanceClass"));
			dBInstanceAttribute.setQPS(_ctx.longValue("DescribeInstanceAttributeResponse.Instances["+ i +"].QPS"));
			dBInstanceAttribute.setBandwidth(_ctx.longValue("DescribeInstanceAttributeResponse.Instances["+ i +"].Bandwidth"));
			dBInstanceAttribute.setConnections(_ctx.longValue("DescribeInstanceAttributeResponse.Instances["+ i +"].Connections"));
			dBInstanceAttribute.setZoneId(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].ZoneId"));
			dBInstanceAttribute.setConfig(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].Config"));
			dBInstanceAttribute.setChargeType(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].ChargeType"));
			dBInstanceAttribute.setNodeType(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].NodeType"));
			dBInstanceAttribute.setNetworkType(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].NetworkType"));
			dBInstanceAttribute.setVpcId(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].VpcId"));
			dBInstanceAttribute.setVSwitchId(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].VSwitchId"));
			dBInstanceAttribute.setPrivateIp(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].PrivateIp"));
			dBInstanceAttribute.setCreateTime(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].CreateTime"));
			dBInstanceAttribute.setEndTime(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].EndTime"));
			dBInstanceAttribute.setHasRenewChangeOrder(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].HasRenewChangeOrder"));
			dBInstanceAttribute.setIsRds(_ctx.booleanValue("DescribeInstanceAttributeResponse.Instances["+ i +"].IsRds"));
			dBInstanceAttribute.setEngine(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].Engine"));
			dBInstanceAttribute.setEngineVersion(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].EngineVersion"));
			dBInstanceAttribute.setMaintainStartTime(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].MaintainStartTime"));
			dBInstanceAttribute.setMaintainEndTime(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].MaintainEndTime"));
			dBInstanceAttribute.setAvailabilityValue(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].AvailabilityValue"));
			dBInstanceAttribute.setSecurityIPList(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].SecurityIPList"));
			dBInstanceAttribute.setInstanceType(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].InstanceType"));
			dBInstanceAttribute.setArchitectureType(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].ArchitectureType"));
			dBInstanceAttribute.setPackageType(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].PackageType"));
			dBInstanceAttribute.setReplicaId(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].ReplicaId"));
			dBInstanceAttribute.setVpcAuthMode(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].VpcAuthMode"));
			dBInstanceAttribute.setAuditLogRetention(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].AuditLogRetention"));
			dBInstanceAttribute.setReplicationMode(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].ReplicationMode"));
			dBInstanceAttribute.setVpcCloudInstanceId(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].VpcCloudInstanceId"));
			dBInstanceAttribute.setInstanceReleaseProtection(_ctx.booleanValue("DescribeInstanceAttributeResponse.Instances["+ i +"].InstanceReleaseProtection"));
			dBInstanceAttribute.setResourceGroupId(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].ResourceGroupId"));
			dBInstanceAttribute.setShardCount(_ctx.integerValue("DescribeInstanceAttributeResponse.Instances["+ i +"].ShardCount"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceAttributeResponse.Instances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeInstanceAttributeResponse.Instances["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBInstanceAttribute.setTags(tags);

			instances.add(dBInstanceAttribute);
		}
		describeInstanceAttributeResponse.setInstances(instances);
	 
	 	return describeInstanceAttributeResponse;
	}
}