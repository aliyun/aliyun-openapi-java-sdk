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

import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.Architecture;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.DiskDeviceMapping;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImagesResponseUnmarshaller {

	public static DescribeImagesResponse unmarshall(DescribeImagesResponse describeImagesResponse, UnmarshallerContext context) {
		
		describeImagesResponse.setRequestId(context.stringValue("DescribeImagesResponse.RequestId"));
		describeImagesResponse.setRegionId(context.stringValue("DescribeImagesResponse.RegionId"));
		describeImagesResponse.setTotalCount(context.integerValue("DescribeImagesResponse.TotalCount"));
		describeImagesResponse.setPageNumber(context.integerValue("DescribeImagesResponse.PageNumber"));
		describeImagesResponse.setPageSize(context.integerValue("DescribeImagesResponse.PageSize"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < context.lengthValue("DescribeImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setProgress(context.stringValue("DescribeImagesResponse.Images["+ i +"].Progress"));
			image.setImageId(context.stringValue("DescribeImagesResponse.Images["+ i +"].ImageId"));
			image.setImageName(context.stringValue("DescribeImagesResponse.Images["+ i +"].ImageName"));
			image.setImageVersion(context.stringValue("DescribeImagesResponse.Images["+ i +"].ImageVersion"));
			image.setDescription(context.stringValue("DescribeImagesResponse.Images["+ i +"].Description"));
			image.setSize(context.integerValue("DescribeImagesResponse.Images["+ i +"].Size"));
			image.setImageOwnerAlias(context.stringValue("DescribeImagesResponse.Images["+ i +"].ImageOwnerAlias"));
			image.setIsSupportIoOptimized(context.booleanValue("DescribeImagesResponse.Images["+ i +"].IsSupportIoOptimized"));
			image.setOSName(context.stringValue("DescribeImagesResponse.Images["+ i +"].OSName"));
			image.setArchitecture(Architecture.getEnum(context.stringValue("DescribeImagesResponse.Images["+ i +"].Architecture")));
			image.setStatus(context.stringValue("DescribeImagesResponse.Images["+ i +"].Status"));
			image.setProductCode(context.stringValue("DescribeImagesResponse.Images["+ i +"].ProductCode"));
			image.setIsSubscribed(context.booleanValue("DescribeImagesResponse.Images["+ i +"].IsSubscribed"));
			image.setCreationTime(context.stringValue("DescribeImagesResponse.Images["+ i +"].CreationTime"));
			image.setIsSelfShared(context.stringValue("DescribeImagesResponse.Images["+ i +"].IsSelfShared"));
			image.setOSType(context.stringValue("DescribeImagesResponse.Images["+ i +"].OSType"));
			image.setPlatform(context.stringValue("DescribeImagesResponse.Images["+ i +"].Platform"));
			image.setUsage(context.stringValue("DescribeImagesResponse.Images["+ i +"].Usage"));
			image.setIsCopied(context.booleanValue("DescribeImagesResponse.Images["+ i +"].IsCopied"));

			List<DiskDeviceMapping> diskDeviceMappings = new ArrayList<DiskDeviceMapping>();
			for (int j = 0; j < context.lengthValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings.Length"); j++) {
				DiskDeviceMapping diskDeviceMapping = new DiskDeviceMapping();
				diskDeviceMapping.setSnapshotId(context.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].SnapshotId"));
				diskDeviceMapping.setSize(context.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Size"));
				diskDeviceMapping.setDevice(context.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Device"));
				diskDeviceMapping.setFormat(context.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Format"));
				diskDeviceMapping.setImportOSSBucket(context.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].ImportOSSBucket"));
				diskDeviceMapping.setImportOSSObject(context.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].ImportOSSObject"));

				diskDeviceMappings.add(diskDeviceMapping);
			}
			image.setDiskDeviceMappings(diskDeviceMappings);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("DescribeImagesResponse.Images["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("DescribeImagesResponse.Images["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("DescribeImagesResponse.Images["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			image.setTags(tags);

			images.add(image);
		}
		describeImagesResponse.setImages(images);
	 
	 	return describeImagesResponse;
	}
}