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

package com.aliyuncs.ebs.transform.v20210730;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ebs.model.v20210730.DescribeDedicatedBlockStorageClusterDisksResponse;
import com.aliyuncs.ebs.model.v20210730.DescribeDedicatedBlockStorageClusterDisksResponse.Disks;
import com.aliyuncs.ebs.model.v20210730.DescribeDedicatedBlockStorageClusterDisksResponse.Disks.DiskItem;
import com.aliyuncs.ebs.model.v20210730.DescribeDedicatedBlockStorageClusterDisksResponse.Disks.DiskItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedBlockStorageClusterDisksResponseUnmarshaller {

	public static DescribeDedicatedBlockStorageClusterDisksResponse unmarshall(DescribeDedicatedBlockStorageClusterDisksResponse describeDedicatedBlockStorageClusterDisksResponse, UnmarshallerContext _ctx) {
		
		describeDedicatedBlockStorageClusterDisksResponse.setRequestId(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.RequestId"));
		describeDedicatedBlockStorageClusterDisksResponse.setNextToken(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.NextToken"));

		Disks disks = new Disks();

		List<DiskItem> disk = new ArrayList<DiskItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk.Length"); i++) {
			DiskItem diskItem = new DiskItem();
			diskItem.setDiskId(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].DiskId"));
			diskItem.setDiskName(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].DiskName"));
			diskItem.setStatus(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].Status"));
			diskItem.setType(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].Type"));
			diskItem.setPerformanceLevel(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].PerformanceLevel"));
			diskItem.setBdfId(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].BdfId"));
			diskItem.setEnableAutoSnapshot(_ctx.booleanValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].EnableAutoSnapshot"));
			diskItem.setStorageSetId(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].StorageSetId"));
			diskItem.setStorageSetPartitionNumber(_ctx.integerValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].StorageSetPartitionNumber"));
			diskItem.setDeleteAutoSnapshot(_ctx.booleanValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].DeleteAutoSnapshot"));
			diskItem.setStorageClusterId(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].StorageClusterId"));
			diskItem.setEncrypted(_ctx.booleanValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].Encrypted"));
			diskItem.setMountInstanceNum(_ctx.integerValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].MountInstanceNum"));
			diskItem.setDescription(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].Description"));
			diskItem.setDevice(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].Device"));
			diskItem.setPortable(_ctx.booleanValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].Portable"));
			diskItem.setImageId(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].ImageId"));
			diskItem.setKMSKeyId(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].KMSKeyId"));
			diskItem.setDeleteWithInstance(_ctx.booleanValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].DeleteWithInstance"));
			diskItem.setDetachedTime(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].DetachedTime"));
			diskItem.setSourceSnapshotId(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].SourceSnapshotId"));
			diskItem.setInstanceId(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].InstanceId"));
			diskItem.setSize(_ctx.integerValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].Size"));
			diskItem.setRegionId(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].RegionId"));
			diskItem.setZoneId(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].ZoneId"));
			diskItem.setAttachedTime(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].AttachedTime"));
			diskItem.setCategory(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].Category"));
			diskItem.setMultiAttach(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].MultiAttach"));
			diskItem.setDiskChargeType(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].DiskChargeType"));
			diskItem.setIOPS(_ctx.longValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].IOPS"));
			diskItem.setThroughput(_ctx.longValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].Throughput"));
			diskItem.setProvisionedIops(_ctx.longValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].ProvisionedIops"));
			diskItem.setBurstingEnabled(_ctx.booleanValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].BurstingEnabled"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagValue(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].Tags["+ j +"].TagValue"));
				tagsItem.setTagKey(_ctx.stringValue("DescribeDedicatedBlockStorageClusterDisksResponse.Disks.Disk["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tagsItem);
			}
			diskItem.setTags(tags);

			disk.add(diskItem);
		}
		disks.setDisk(disk);
		describeDedicatedBlockStorageClusterDisksResponse.setDisks(disks);
	 
	 	return describeDedicatedBlockStorageClusterDisksResponse;
	}
}