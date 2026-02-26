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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeTairKVCacheInferInstanceAttributeResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeTairKVCacheInferInstanceAttributeResponse.DBInstanceAttribute;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeTairKVCacheInferInstanceAttributeResponse.DBInstanceAttribute.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTairKVCacheInferInstanceAttributeResponseUnmarshaller {

	public static DescribeTairKVCacheInferInstanceAttributeResponse unmarshall(DescribeTairKVCacheInferInstanceAttributeResponse describeTairKVCacheInferInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeTairKVCacheInferInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.RequestId"));

		List<DBInstanceAttribute> instances = new ArrayList<DBInstanceAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances.Length"); i++) {
			DBInstanceAttribute dBInstanceAttribute = new DBInstanceAttribute();
			dBInstanceAttribute.setInstanceId(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].InstanceId"));
			dBInstanceAttribute.setVpcId(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].VpcId"));
			dBInstanceAttribute.setVSwitchId(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].VSwitchId"));
			dBInstanceAttribute.setPrivateIp(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].PrivateIp"));
			dBInstanceAttribute.setChargeType(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].ChargeType"));
			dBInstanceAttribute.setCreateTime(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].CreateTime"));
			dBInstanceAttribute.setEndTime(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].EndTime"));
			dBInstanceAttribute.setArchitectureType(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].ArchitectureType"));
			dBInstanceAttribute.setNetworkType(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].NetworkType"));
			dBInstanceAttribute.setInstanceName(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].InstanceName"));
			dBInstanceAttribute.setInstanceClass(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].InstanceClass"));
			dBInstanceAttribute.setInstanceType(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].InstanceType"));
			dBInstanceAttribute.setZoneId(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].ZoneId"));
			dBInstanceAttribute.setZoneType(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].ZoneType"));
			dBInstanceAttribute.setRegionId(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].RegionId"));
			dBInstanceAttribute.setStorage(_ctx.longValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].Storage"));
			dBInstanceAttribute.setResourceGroupId(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].ResourceGroupId"));
			dBInstanceAttribute.setInstanceStatus(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].InstanceStatus"));
			dBInstanceAttribute.setIsOrderCompleted(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].IsOrderCompleted"));
			dBInstanceAttribute.setConnectionString(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].ConnectionString"));
			dBInstanceAttribute.setIsDelete(_ctx.integerValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].IsDelete"));
			dBInstanceAttribute.setModel(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].Model"));
			dBInstanceAttribute.setModelServiceNum(_ctx.integerValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].ModelServiceNum"));
			dBInstanceAttribute.setComputeUnitNum(_ctx.integerValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].ComputeUnitNum"));
			dBInstanceAttribute.setReplicaNum(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].ReplicaNum"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeTairKVCacheInferInstanceAttributeResponse.Instances["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBInstanceAttribute.setTags(tags);

			instances.add(dBInstanceAttribute);
		}
		describeTairKVCacheInferInstanceAttributeResponse.setInstances(instances);
	 
	 	return describeTairKVCacheInferInstanceAttributeResponse;
	}
}