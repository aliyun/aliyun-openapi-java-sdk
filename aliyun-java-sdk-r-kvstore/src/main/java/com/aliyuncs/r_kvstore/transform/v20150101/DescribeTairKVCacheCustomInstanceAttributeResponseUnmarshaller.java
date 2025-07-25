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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeTairKVCacheCustomInstanceAttributeResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeTairKVCacheCustomInstanceAttributeResponse.Disk;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeTairKVCacheCustomInstanceAttributeResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTairKVCacheCustomInstanceAttributeResponseUnmarshaller {

	public static DescribeTairKVCacheCustomInstanceAttributeResponse unmarshall(DescribeTairKVCacheCustomInstanceAttributeResponse describeTairKVCacheCustomInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeTairKVCacheCustomInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.RequestId"));
		describeTairKVCacheCustomInstanceAttributeResponse.setVpcId(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.VpcId"));
		describeTairKVCacheCustomInstanceAttributeResponse.setPrivateIp(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.PrivateIp"));
		describeTairKVCacheCustomInstanceAttributeResponse.setCreateTime(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.CreateTime"));
		describeTairKVCacheCustomInstanceAttributeResponse.setChargeType(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.ChargeType"));
		describeTairKVCacheCustomInstanceAttributeResponse.setStorageType(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.StorageType"));
		describeTairKVCacheCustomInstanceAttributeResponse.setArchitectureType(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.ArchitectureType"));
		describeTairKVCacheCustomInstanceAttributeResponse.setNetworkType(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.NetworkType"));
		describeTairKVCacheCustomInstanceAttributeResponse.setInstanceName(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.InstanceName"));
		describeTairKVCacheCustomInstanceAttributeResponse.setZoneType(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.ZoneType"));
		describeTairKVCacheCustomInstanceAttributeResponse.setInstanceClass(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.InstanceClass"));
		describeTairKVCacheCustomInstanceAttributeResponse.setInstanceId(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.InstanceId"));
		describeTairKVCacheCustomInstanceAttributeResponse.setInstanceType(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.InstanceType"));
		describeTairKVCacheCustomInstanceAttributeResponse.setRegionId(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.RegionId"));
		describeTairKVCacheCustomInstanceAttributeResponse.setEndTime(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.EndTime"));
		describeTairKVCacheCustomInstanceAttributeResponse.setVSwitchId(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.VSwitchId"));
		describeTairKVCacheCustomInstanceAttributeResponse.setResourceGroupId(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.ResourceGroupId"));
		describeTairKVCacheCustomInstanceAttributeResponse.setZoneId(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.ZoneId"));
		describeTairKVCacheCustomInstanceAttributeResponse.setInstanceStatus(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.InstanceStatus"));
		describeTairKVCacheCustomInstanceAttributeResponse.setStorage(_ctx.longValue("DescribeTairKVCacheCustomInstanceAttributeResponse.Storage"));
		describeTairKVCacheCustomInstanceAttributeResponse.setIsOrderCompleted(_ctx.booleanValue("DescribeTairKVCacheCustomInstanceAttributeResponse.IsOrderCompleted"));
		describeTairKVCacheCustomInstanceAttributeResponse.setImageId(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.ImageId"));
		describeTairKVCacheCustomInstanceAttributeResponse.setCpu(_ctx.longValue("DescribeTairKVCacheCustomInstanceAttributeResponse.Cpu"));
		describeTairKVCacheCustomInstanceAttributeResponse.setMemory(_ctx.longValue("DescribeTairKVCacheCustomInstanceAttributeResponse.Memory"));
		describeTairKVCacheCustomInstanceAttributeResponse.setSecurityGroupId(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.SecurityGroupId"));
		describeTairKVCacheCustomInstanceAttributeResponse.setUseEni(_ctx.booleanValue("DescribeTairKVCacheCustomInstanceAttributeResponse.UseEni"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTairKVCacheCustomInstanceAttributeResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		describeTairKVCacheCustomInstanceAttributeResponse.setTags(tags);

		List<Disk> disks = new ArrayList<Disk>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTairKVCacheCustomInstanceAttributeResponse.Disks.Length"); i++) {
			Disk disk = new Disk();
			disk.setDiskId(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.Disks["+ i +"].DiskId"));
			disk.setType(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.Disks["+ i +"].Type"));
			disk.setSize(_ctx.stringValue("DescribeTairKVCacheCustomInstanceAttributeResponse.Disks["+ i +"].Size"));

			disks.add(disk);
		}
		describeTairKVCacheCustomInstanceAttributeResponse.setDisks(disks);
	 
	 	return describeTairKVCacheCustomInstanceAttributeResponse;
	}
}