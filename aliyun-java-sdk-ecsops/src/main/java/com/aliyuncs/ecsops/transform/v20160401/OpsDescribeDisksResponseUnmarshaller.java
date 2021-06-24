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
		opsDescribeDisksResponse.setPageSize(_ctx.integerValue("OpsDescribeDisksResponse.PageSize"));
		opsDescribeDisksResponse.setPageNumber(_ctx.integerValue("OpsDescribeDisksResponse.PageNumber"));

		List<Disk> disks = new ArrayList<Disk>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeDisksResponse.Disks.Length"); i++) {
			Disk disk = new Disk();
			disk.setType(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Type"));
			disk.setStatus(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Status"));
			disk.setPerformanceLevel(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].PerformanceLevel"));
			disk.setActive(_ctx.booleanValue("OpsDescribeDisksResponse.Disks["+ i +"].Active"));
			disk.setHouyiDiskId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].HouyiDiskId"));
			disk.setEnableAutoSnapshot(_ctx.booleanValue("OpsDescribeDisksResponse.Disks["+ i +"].EnableAutoSnapshot"));
			disk.setBootable(_ctx.booleanValue("OpsDescribeDisksResponse.Disks["+ i +"].Bootable"));
			disk.setDiskId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].DiskId"));
			disk.setSnapshotLinkId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].SnapshotLinkId"));
			disk.setBid(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Bid"));
			disk.setSeq(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Seq"));
			disk.setDeleteAutoSnapshot(_ctx.booleanValue("OpsDescribeDisksResponse.Disks["+ i +"].DeleteAutoSnapshot"));
			disk.setDescription(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Description"));
			disk.setDevice(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Device"));
			disk.setDiskName(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].DiskName"));
			disk.setPortable(_ctx.booleanValue("OpsDescribeDisksResponse.Disks["+ i +"].Portable"));
			disk.setCreatedTime(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].CreatedTime"));
			disk.setImageId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].ImageId"));
			disk.setAliyunInstanceType(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].AliyunInstanceType"));
			disk.setDeleteWithInstance(_ctx.booleanValue("OpsDescribeDisksResponse.Disks["+ i +"].DeleteWithInstance"));
			disk.setClusterId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].ClusterId"));
			disk.setDetachedTime(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].DetachedTime"));
			disk.setAutoSnapshotPolicyId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].AutoSnapshotPolicyId"));
			disk.setIopsSize(_ctx.integerValue("OpsDescribeDisksResponse.Disks["+ i +"].IopsSize"));
			disk.setInstanceId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].InstanceId"));
			disk.setRegionId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].RegionId"));
			disk.setResourceOwnerId(_ctx.longValue("OpsDescribeDisksResponse.Disks["+ i +"].ResourceOwnerId"));
			disk.setModifiedTime(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].ModifiedTime"));
			disk.setSnapshotId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].SnapshotId"));
			disk.setSize(_ctx.integerValue("OpsDescribeDisksResponse.Disks["+ i +"].Size"));
			disk.setZoneId(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].ZoneId"));
			disk.setBusinessStatus(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].BusinessStatus"));
			disk.setAttachedTime(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].AttachedTime"));
			disk.setCategory(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Category"));
			disk.setIsLocal(_ctx.booleanValue("OpsDescribeDisksResponse.Disks["+ i +"].IsLocal"));
			disk.setNumericId(_ctx.longValue("OpsDescribeDisksResponse.Disks["+ i +"].NumericId"));
			disk.setProductCode(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].ProductCode"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDisksResponse.Disks["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("OpsDescribeDisksResponse.Disks["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			disk.setTags(tags);

			disks.add(disk);
		}
		opsDescribeDisksResponse.setDisks(disks);
	 
	 	return opsDescribeDisksResponse;
	}
}