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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCDisksResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCDisksResponse.Disk;
import com.aliyuncs.rds.model.v20140815.DescribeRCDisksResponse.Disk.TagItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCDisksResponseUnmarshaller {

	public static DescribeRCDisksResponse unmarshall(DescribeRCDisksResponse describeRCDisksResponse, UnmarshallerContext _ctx) {
		
		describeRCDisksResponse.setRequestId(_ctx.stringValue("DescribeRCDisksResponse.RequestId"));
		describeRCDisksResponse.setPageNumber(_ctx.longValue("DescribeRCDisksResponse.PageNumber"));
		describeRCDisksResponse.setPageSize(_ctx.longValue("DescribeRCDisksResponse.PageSize"));
		describeRCDisksResponse.setTotalCount(_ctx.longValue("DescribeRCDisksResponse.TotalCount"));

		List<Disk> disks = new ArrayList<Disk>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCDisksResponse.Disks.Length"); i++) {
			Disk disk = new Disk();
			disk.setCategory(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].Category"));
			disk.setCreationTime(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].CreationTime"));
			disk.setDeleteAutoSnapshot(_ctx.booleanValue("DescribeRCDisksResponse.Disks["+ i +"].DeleteAutoSnapshot"));
			disk.setDeleteWithInstance(_ctx.booleanValue("DescribeRCDisksResponse.Disks["+ i +"].DeleteWithInstance"));
			disk.setDescription(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].Description"));
			disk.setDevice(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].Device"));
			disk.setDiskChargeType(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].DiskChargeType"));
			disk.setDiskId(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].DiskId"));
			disk.setDiskName(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].DiskName"));
			disk.setEncrypted(_ctx.booleanValue("DescribeRCDisksResponse.Disks["+ i +"].Encrypted"));
			disk.setExpiredTime(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].ExpiredTime"));
			disk.setIOPS(_ctx.longValue("DescribeRCDisksResponse.Disks["+ i +"].IOPS"));
			disk.setImageId(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].ImageId"));
			disk.setInstanceId(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].InstanceId"));
			disk.setPerformanceLevel(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].PerformanceLevel"));
			disk.setRegionId(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].RegionId"));
			disk.setResourceGroupId(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].ResourceGroupId"));
			disk.setSerialNumber(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].SerialNumber"));
			disk.setSize(_ctx.longValue("DescribeRCDisksResponse.Disks["+ i +"].Size"));
			disk.setSourceSnapshotId(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].SourceSnapshotId"));
			disk.setStatus(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].Status"));
			disk.setStorageClusterId(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].StorageClusterId"));
			disk.setStorageSetId(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].StorageSetId"));
			disk.setType(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].Type"));
			disk.setZoneId(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].ZoneId"));

			List<TagItem> tag = new ArrayList<TagItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCDisksResponse.Disks["+ i +"].Tag.Length"); j++) {
				TagItem tagItem = new TagItem();
				tagItem.setTagKey(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].Tag["+ j +"].TagKey"));
				tagItem.setTagValue(_ctx.stringValue("DescribeRCDisksResponse.Disks["+ i +"].Tag["+ j +"].TagValue"));

				tag.add(tagItem);
			}
			disk.setTag(tag);

			disks.add(disk);
		}
		describeRCDisksResponse.setDisks(disks);
	 
	 	return describeRCDisksResponse;
	}
}