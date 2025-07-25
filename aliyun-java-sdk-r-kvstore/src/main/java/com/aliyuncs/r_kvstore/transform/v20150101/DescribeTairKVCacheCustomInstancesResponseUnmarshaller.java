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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeTairKVCacheCustomInstancesResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeTairKVCacheCustomInstancesResponse.KVStoreInstance;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeTairKVCacheCustomInstancesResponse.KVStoreInstance.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTairKVCacheCustomInstancesResponseUnmarshaller {

	public static DescribeTairKVCacheCustomInstancesResponse unmarshall(DescribeTairKVCacheCustomInstancesResponse describeTairKVCacheCustomInstancesResponse, UnmarshallerContext _ctx) {
		
		describeTairKVCacheCustomInstancesResponse.setRequestId(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.RequestId"));
		describeTairKVCacheCustomInstancesResponse.setPageNumber(_ctx.integerValue("DescribeTairKVCacheCustomInstancesResponse.PageNumber"));
		describeTairKVCacheCustomInstancesResponse.setPageSize(_ctx.integerValue("DescribeTairKVCacheCustomInstancesResponse.PageSize"));
		describeTairKVCacheCustomInstancesResponse.setTotalCount(_ctx.integerValue("DescribeTairKVCacheCustomInstancesResponse.TotalCount"));

		List<KVStoreInstance> instances = new ArrayList<KVStoreInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTairKVCacheCustomInstancesResponse.Instances.Length"); i++) {
			KVStoreInstance kVStoreInstance = new KVStoreInstance();
			kVStoreInstance.setVpcId(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].VpcId"));
			kVStoreInstance.setCreateTime(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].CreateTime"));
			kVStoreInstance.setChargeType(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].ChargeType"));
			kVStoreInstance.setNetworkType(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].NetworkType"));
			kVStoreInstance.setInstanceName(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].InstanceName"));
			kVStoreInstance.setInstanceClass(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].InstanceClass"));
			kVStoreInstance.setDestroyTime(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].DestroyTime"));
			kVStoreInstance.setInstanceId(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].InstanceId"));
			kVStoreInstance.setInstanceType(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].InstanceType"));
			kVStoreInstance.setRegionId(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].RegionId"));
			kVStoreInstance.setEndTime(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].EndTime"));
			kVStoreInstance.setVSwitchId(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].VSwitchId"));
			kVStoreInstance.setResourceGroupId(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].ResourceGroupId"));
			kVStoreInstance.setZoneId(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].ZoneId"));
			kVStoreInstance.setInstanceStatus(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].InstanceStatus"));
			kVStoreInstance.setStorage(_ctx.longValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].Storage"));
			kVStoreInstance.setStorageType(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].StorageType"));
			kVStoreInstance.setPrivateIp(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].PrivateIp"));
			kVStoreInstance.setUseEni(_ctx.booleanValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].UseEni"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeTairKVCacheCustomInstancesResponse.Instances["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			kVStoreInstance.setTags(tags);

			instances.add(kVStoreInstance);
		}
		describeTairKVCacheCustomInstancesResponse.setInstances(instances);
	 
	 	return describeTairKVCacheCustomInstancesResponse;
	}
}