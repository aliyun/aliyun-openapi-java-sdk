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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesByExpireTimeResponseUnmarshaller {

	public static DescribeInstancesByExpireTimeResponse unmarshall(DescribeInstancesByExpireTimeResponse describeInstancesByExpireTimeResponse, UnmarshallerContext _ctx) {
		
		describeInstancesByExpireTimeResponse.setRequestId(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.RequestId"));
		describeInstancesByExpireTimeResponse.setPageNumber(_ctx.integerValue("DescribeInstancesByExpireTimeResponse.PageNumber"));
		describeInstancesByExpireTimeResponse.setPageSize(_ctx.integerValue("DescribeInstancesByExpireTimeResponse.PageSize"));
		describeInstancesByExpireTimeResponse.setTotalCount(_ctx.integerValue("DescribeInstancesByExpireTimeResponse.TotalCount"));

		List<KVStoreInstance> instances = new ArrayList<KVStoreInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesByExpireTimeResponse.Instances.Length"); i++) {
			KVStoreInstance kVStoreInstance = new KVStoreInstance();
			kVStoreInstance.setReplacateId(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].ReplacateId"));
			kVStoreInstance.setInstanceId(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].InstanceId"));
			kVStoreInstance.setInstanceName(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].InstanceName"));
			kVStoreInstance.setConnectionDomain(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].ConnectionDomain"));
			kVStoreInstance.setPort(_ctx.longValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].Port"));
			kVStoreInstance.setUserName(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].UserName"));
			kVStoreInstance.setInstanceStatus(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].InstanceStatus"));
			kVStoreInstance.setRegionId(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].RegionId"));
			kVStoreInstance.setCapacity(_ctx.longValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].Capacity"));
			kVStoreInstance.setInstanceClass(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].InstanceClass"));
			kVStoreInstance.setQPS(_ctx.longValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].QPS"));
			kVStoreInstance.setBandwidth(_ctx.longValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].Bandwidth"));
			kVStoreInstance.setConnections(_ctx.longValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].Connections"));
			kVStoreInstance.setZoneId(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].ZoneId"));
			kVStoreInstance.setConfig(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].Config"));
			kVStoreInstance.setChargeType(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].ChargeType"));
			kVStoreInstance.setNetworkType(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].NetworkType"));
			kVStoreInstance.setVpcId(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].VpcId"));
			kVStoreInstance.setVSwitchId(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].VSwitchId"));
			kVStoreInstance.setPrivateIp(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].PrivateIp"));
			kVStoreInstance.setCreateTime(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].CreateTime"));
			kVStoreInstance.setEndTime(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].EndTime"));
			kVStoreInstance.setHasRenewChangeOrder(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].HasRenewChangeOrder"));
			kVStoreInstance.setIsRds(_ctx.booleanValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].IsRds"));
			kVStoreInstance.setInstanceType(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].InstanceType"));
			kVStoreInstance.setArchitectureType(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].ArchitectureType"));
			kVStoreInstance.setNodeType(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].NodeType"));
			kVStoreInstance.setPackageType(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].PackageType"));
			kVStoreInstance.setEngineVersion(_ctx.stringValue("DescribeInstancesByExpireTimeResponse.Instances["+ i +"].EngineVersion"));

			instances.add(kVStoreInstance);
		}
		describeInstancesByExpireTimeResponse.setInstances(instances);
	 
	 	return describeInstancesByExpireTimeResponse;
	}
}