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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeDisksResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDisksResponse.Disk;
import com.aliyuncs.ecs.model.v20140526.DescribeDisksResponse.Disk.Attachment;
import com.aliyuncs.ecs.model.v20140526.DescribeDisksResponse.Disk.MountInstance;
import com.aliyuncs.ecs.model.v20140526.DescribeDisksResponse.Disk.OperationLock;
import com.aliyuncs.ecs.model.v20140526.DescribeDisksResponse.Disk.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDisksResponseUnmarshaller {

	public static DescribeDisksResponse unmarshall(DescribeDisksResponse describeDisksResponse, UnmarshallerContext _ctx) {
		
		describeDisksResponse.setRequestId(_ctx.stringValue("DescribeDisksResponse.RequestId"));
		describeDisksResponse.setNextToken(_ctx.stringValue("DescribeDisksResponse.NextToken"));
		describeDisksResponse.setPageSize(_ctx.integerValue("DescribeDisksResponse.PageSize"));
		describeDisksResponse.setPageNumber(_ctx.integerValue("DescribeDisksResponse.PageNumber"));
		describeDisksResponse.setTotalCount(_ctx.integerValue("DescribeDisksResponse.TotalCount"));

		List<Disk> disks = new ArrayList<Disk>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDisksResponse.Disks.Length"); i++) {
			Disk disk = new Disk();
			disk.setSerialNumber(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].SerialNumber"));
			disk.setCreationTime(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].CreationTime"));
			disk.setStatus(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].Status"));
			disk.setType(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].Type"));
			disk.setPerformanceLevel(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].PerformanceLevel"));
			disk.setBdfId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].BdfId"));
			disk.setEnableAutoSnapshot(_ctx.booleanValue("DescribeDisksResponse.Disks["+ i +"].EnableAutoSnapshot"));
			disk.setStorageSetId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].StorageSetId"));
			disk.setStorageSetPartitionNumber(_ctx.integerValue("DescribeDisksResponse.Disks["+ i +"].StorageSetPartitionNumber"));
			disk.setDiskId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].DiskId"));
			disk.setDeleteAutoSnapshot(_ctx.booleanValue("DescribeDisksResponse.Disks["+ i +"].DeleteAutoSnapshot"));
			disk.setDedicatedBlockStorageClusterId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].DedicatedBlockStorageClusterId"));
			disk.setEncrypted(_ctx.booleanValue("DescribeDisksResponse.Disks["+ i +"].Encrypted"));
			disk.setIOPSRead(_ctx.integerValue("DescribeDisksResponse.Disks["+ i +"].IOPSRead"));
			disk.setMountInstanceNum(_ctx.integerValue("DescribeDisksResponse.Disks["+ i +"].MountInstanceNum"));
			disk.setDescription(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].Description"));
			disk.setDevice(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].Device"));
			disk.setDiskName(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].DiskName"));
			disk.setPortable(_ctx.booleanValue("DescribeDisksResponse.Disks["+ i +"].Portable"));
			disk.setImageId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].ImageId"));
			disk.setKMSKeyId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].KMSKeyId"));
			disk.setDeleteWithInstance(_ctx.booleanValue("DescribeDisksResponse.Disks["+ i +"].DeleteWithInstance"));
			disk.setDetachedTime(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].DetachedTime"));
			disk.setSourceSnapshotId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].SourceSnapshotId"));
			disk.setAutoSnapshotPolicyId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].AutoSnapshotPolicyId"));
			disk.setEnableAutomatedSnapshotPolicy(_ctx.booleanValue("DescribeDisksResponse.Disks["+ i +"].EnableAutomatedSnapshotPolicy"));
			disk.setIOPSWrite(_ctx.integerValue("DescribeDisksResponse.Disks["+ i +"].IOPSWrite"));
			disk.setInstanceId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].InstanceId"));
			disk.setIOPS(_ctx.integerValue("DescribeDisksResponse.Disks["+ i +"].IOPS"));
			disk.setRegionId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].RegionId"));
			disk.setExpiredTime(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].ExpiredTime"));
			disk.setSize(_ctx.integerValue("DescribeDisksResponse.Disks["+ i +"].Size"));
			disk.setResourceGroupId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].ResourceGroupId"));
			disk.setDiskChargeType(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].DiskChargeType"));
			disk.setZoneId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].ZoneId"));
			disk.setAttachedTime(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].AttachedTime"));
			disk.setCategory(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].Category"));
			disk.setProductCode(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].ProductCode"));
			disk.setMultiAttach(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].MultiAttach"));

			List<OperationLock> operationLocks = new ArrayList<OperationLock>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDisksResponse.Disks["+ i +"].OperationLocks.Length"); j++) {
				OperationLock operationLock = new OperationLock();
				operationLock.setLockReason(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].OperationLocks["+ j +"].LockReason"));

				operationLocks.add(operationLock);
			}
			disk.setOperationLocks(operationLocks);

			List<MountInstance> mountInstances = new ArrayList<MountInstance>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDisksResponse.Disks["+ i +"].MountInstances.Length"); j++) {
				MountInstance mountInstance = new MountInstance();
				mountInstance.setAttachedTime(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].MountInstances["+ j +"].AttachedTime"));
				mountInstance.setInstanceId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].MountInstances["+ j +"].InstanceId"));
				mountInstance.setDevice(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].MountInstances["+ j +"].Device"));

				mountInstances.add(mountInstance);
			}
			disk.setMountInstances(mountInstances);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDisksResponse.Disks["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			disk.setTags(tags);

			List<Attachment> attachments = new ArrayList<Attachment>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDisksResponse.Disks["+ i +"].Attachments.Length"); j++) {
				Attachment attachment = new Attachment();
				attachment.setInstanceId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].Attachments["+ j +"].InstanceId"));
				attachment.setDevice(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].Attachments["+ j +"].Device"));
				attachment.setAttachedTime(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].Attachments["+ j +"].AttachedTime"));

				attachments.add(attachment);
			}
			disk.setAttachments(attachments);

			disks.add(disk);
		}
		describeDisksResponse.setDisks(disks);
	 
	 	return describeDisksResponse;
	}
}