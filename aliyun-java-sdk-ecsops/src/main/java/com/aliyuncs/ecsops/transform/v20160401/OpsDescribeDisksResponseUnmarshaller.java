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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDisksResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDisksResponse.Disk;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDisksResponse.Disk.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeDisksResponseUnmarshaller {

	public static OpsDescribeDisksResponse unmarshall(OpsDescribeDisksResponse opsDescribeDisksResponse, UnmarshallerContext _ctx) {
		
		opsDescribeDisksResponse.setRequestId(_ctx.stringValue("OpsDescribeDisksResponse.RequestId"));
		opsDescribeDisksResponse.setTotalCount(_ctx.integerValue("OpsDescribeDisksResponse.TotalCount"));
		opsDescribeDisksResponse.setPageNumber(_ctx.integerValue("OpsDescribeDisksResponse.PageNumber"));
		opsDescribeDisksResponse.setPageSize(_ctx.integerValue("OpsDescribeDisksResponse.PageSize"));

		List<Disk> disks = new ArrayList<Disk>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeDisksResponse.Disks.Length"); i++) {
			Disk disk = new Disk();
			disk.setBid(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Bid"));
			disk.setResourceOwnerId(_ctx.longValue("OpsDescribeDisksResponse.Disks["+ i +"].ResourceOwnerId"));
			disk.setAliyunInstanceType(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].AliyunInstanceType"));
			disk.setDiskId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].DiskId"));
			disk.setStatus(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Status"));
			disk.setCreatedTime(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].CreatedTime"));
			disk.setModifiedTime(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].ModifiedTime"));
			disk.setSeq(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Seq"));
			disk.setType(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Type"));
			disk.setCategory(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Category"));
			disk.setIsLocal(_ctx.booleanValue("OpsDescribeDisksResponse.Disks["+ i +"].IsLocal"));
			disk.setRegionId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].RegionId"));
			disk.setZoneId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].ZoneId"));
			disk.setClusterId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].ClusterId"));
			disk.setDiskName(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].DiskName"));
			disk.setDescription(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Description"));
			disk.setSize(_ctx.integerValue("OpsDescribeDisksResponse.Disks["+ i +"].Size"));
			disk.setActive(_ctx.booleanValue("OpsDescribeDisksResponse.Disks["+ i +"].Active"));
			disk.setBootable(_ctx.booleanValue("OpsDescribeDisksResponse.Disks["+ i +"].Bootable"));
			disk.setPortable(_ctx.booleanValue("OpsDescribeDisksResponse.Disks["+ i +"].Portable"));
			disk.setImageId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].ImageId"));
			disk.setSnapshotId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].SnapshotId"));
			disk.setAutoSnapshotPolicyId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].AutoSnapshotPolicyId"));
			disk.setSnapshotLinkId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].SnapshotLinkId"));
			disk.setInstanceId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].InstanceId"));
			disk.setDevice(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Device"));
			disk.setDeleteWithInstance(_ctx.booleanValue("OpsDescribeDisksResponse.Disks["+ i +"].DeleteWithInstance"));
			disk.setDeleteAutoSnapshot(_ctx.booleanValue("OpsDescribeDisksResponse.Disks["+ i +"].DeleteAutoSnapshot"));
			disk.setEnableAutoSnapshot(_ctx.booleanValue("OpsDescribeDisksResponse.Disks["+ i +"].EnableAutoSnapshot"));
			disk.setAttachedTime(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].AttachedTime"));
			disk.setDetachedTime(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].DetachedTime"));
			disk.setProductCode(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].ProductCode"));
			disk.setHouyiDiskId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].HouyiDiskId"));
			disk.setNumericId(_ctx.longValue("OpsDescribeDisksResponse.Disks["+ i +"].NumericId"));
			disk.setBusinessStatus(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].BusinessStatus"));
			disk.setIopsSize(_ctx.integerValue("OpsDescribeDisksResponse.Disks["+ i +"].IopsSize"));
			disk.setPerformanceLevel(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].PerformanceLevel"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDisksResponse.Disks["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			disk.setTags(tags);

			disks.add(disk);
		}
		opsDescribeDisksResponse.setDisks(disks);
	 
	 	return opsDescribeDisksResponse;
	}
}