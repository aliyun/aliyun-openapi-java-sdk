/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeVolumesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeVolumesResponse.Volume;
import com.aliyuncs.ecs.model.v20140526.DescribeVolumesResponse.Volume.MountInstance;
import com.aliyuncs.ecs.model.v20140526.DescribeVolumesResponse.Volume.OperationLock;
import com.aliyuncs.ecs.model.v20140526.DescribeVolumesResponse.Volume.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVolumesResponseUnmarshaller {

	public static DescribeVolumesResponse unmarshall(DescribeVolumesResponse describeVolumesResponse, UnmarshallerContext context) {
		
		describeVolumesResponse.setRequestId(context.stringValue("DescribeVolumesResponse.RequestId"));
		describeVolumesResponse.setTotalCount(context.integerValue("DescribeVolumesResponse.TotalCount"));
		describeVolumesResponse.setPageNumber(context.integerValue("DescribeVolumesResponse.PageNumber"));
		describeVolumesResponse.setPageSize(context.integerValue("DescribeVolumesResponse.PageSize"));

		List<Volume> volumes = new ArrayList<Volume>();
		for (int i = 0; i < context.lengthValue("DescribeVolumesResponse.Volumes.Length"); i++) {
			Volume volume = new Volume();
			volume.setVolumeId(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].VolumeId"));
			volume.setRegionId(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].RegionId"));
			volume.setZoneId(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].ZoneId"));
			volume.setVolumeName(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].VolumeName"));
			volume.setDescription(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].Description"));
			volume.setCategory(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].Category"));
			volume.setSize(context.integerValue("DescribeVolumesResponse.Volumes["+ i +"].Size"));
			volume.setSourceSnapshotId(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].SourceSnapshotId"));
			volume.setAutoSnapshotPolicyId(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].AutoSnapshotPolicyId"));
			volume.setSnapshotLinkId(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].SnapshotLinkId"));
			volume.setStatus(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].Status"));
			volume.setEnableAutomatedSnapshotPolicy(context.booleanValue("DescribeVolumesResponse.Volumes["+ i +"].EnableAutomatedSnapshotPolicy"));
			volume.setCreationTime(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].CreationTime"));
			volume.setVolumeChargeType(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].VolumeChargeType"));
			volume.setMountInstanceNum(context.integerValue("DescribeVolumesResponse.Volumes["+ i +"].MountInstanceNum"));

			List<OperationLock> operationLocks = new ArrayList<OperationLock>();
			for (int j = 0; j < context.lengthValue("DescribeVolumesResponse.Volumes["+ i +"].OperationLocks.Length"); j++) {
				OperationLock operationLock = new OperationLock();
				operationLock.setLockReason(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].OperationLocks["+ j +"].LockReason"));

				operationLocks.add(operationLock);
			}
			volume.setOperationLocks(operationLocks);

			List<MountInstance> mountInstances = new ArrayList<MountInstance>();
			for (int j = 0; j < context.lengthValue("DescribeVolumesResponse.Volumes["+ i +"].MountInstances.Length"); j++) {
				MountInstance mountInstance = new MountInstance();
				mountInstance.setInstanceId(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].MountInstances["+ j +"].InstanceId"));
				mountInstance.setDevice(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].MountInstances["+ j +"].Device"));
				mountInstance.setAttachedTime(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].MountInstances["+ j +"].AttachedTime"));

				mountInstances.add(mountInstance);
			}
			volume.setMountInstances(mountInstances);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("DescribeVolumesResponse.Volumes["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("DescribeVolumesResponse.Volumes["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			volume.setTags(tags);

			volumes.add(volume);
		}
		describeVolumesResponse.setVolumes(volumes);
	 
	 	return describeVolumesResponse;
	}
}