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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse;
import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse.Instance;
import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse.Instance.Disk;
import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse.Instance.Disk.Tag1;
import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse.Instance.Image;
import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse.Instance.NetworkAttribute;
import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse.Instance.ResourceSpec;
import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse.Instance.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setTotalCount(_ctx.integerValue("ListInstancesResponse.TotalCount"));
		listInstancesResponse.setPageSize(_ctx.integerValue("ListInstancesResponse.PageSize"));
		listInstancesResponse.setPageNumber(_ctx.integerValue("ListInstancesResponse.PageNumber"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setDisableReason(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].DisableReason"));
			instance.setResourceGroupId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ResourceGroupId"));
			instance.setBusinessStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].BusinessStatus"));
			instance.setPublicIpAddress(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].PublicIpAddress"));
			instance.setInnerIpAddress(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InnerIpAddress"));
			instance.setCombination(_ctx.booleanValue("ListInstancesResponse.Instances["+ i +"].Combination"));
			instance.setExpiredTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ExpiredTime"));
			instance.setImageId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ImageId"));
			instance.setPlanType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].PlanType"));
			instance.setCommodityCode(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].CommodityCode"));
			instance.setStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Status"));
			instance.setInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setPlanId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].PlanId"));
			instance.setDdosStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].DdosStatus"));
			instance.setCombinationInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].CombinationInstanceId"));
			instance.setInstanceName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setUuid(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Uuid"));
			instance.setChargeType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ChargeType"));
			instance.setCreationTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].CreationTime"));
			instance.setRegionId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].RegionId"));

			Image image = new Image();
			image.setImageName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Image.ImageName"));
			image.setImageVersion(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Image.ImageVersion"));
			image.setOsType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Image.OsType"));
			image.setImageIconUrl(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Image.ImageIconUrl"));
			image.setImageContact(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Image.ImageContact"));
			image.setImageType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Image.ImageType"));
			instance.setImage(image);

			ResourceSpec resourceSpec = new ResourceSpec();
			resourceSpec.setMemory(_ctx.doubleValue("ListInstancesResponse.Instances["+ i +"].ResourceSpec.Memory"));
			resourceSpec.setBandwidth(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].ResourceSpec.Bandwidth"));
			resourceSpec.setDiskSize(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].ResourceSpec.DiskSize"));
			resourceSpec.setDiskCategory(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ResourceSpec.DiskCategory"));
			resourceSpec.setCpu(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].ResourceSpec.Cpu"));
			resourceSpec.setFlow(_ctx.doubleValue("ListInstancesResponse.Instances["+ i +"].ResourceSpec.Flow"));
			instance.setResourceSpec(resourceSpec);

			List<NetworkAttribute> networkAttributes = new ArrayList<NetworkAttribute>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.Instances["+ i +"].NetworkAttributes.Length"); j++) {
				NetworkAttribute networkAttribute = new NetworkAttribute();
				networkAttribute.setPublicIpAddress(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].NetworkAttributes["+ j +"].PublicIpAddress"));
				networkAttribute.setPrivateIpAddress(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].NetworkAttributes["+ j +"].PrivateIpAddress"));
				networkAttribute.setPeakBandwidth(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].NetworkAttributes["+ j +"].PeakBandwidth"));
				networkAttribute.setPublicIpDdosStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].NetworkAttributes["+ j +"].PublicIpDdosStatus"));

				networkAttributes.add(networkAttribute);
			}
			instance.setNetworkAttributes(networkAttributes);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.Instances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setValue(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Tags["+ j +"].Value"));
				tag.setKey(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Tags["+ j +"].Key"));

				tags.add(tag);
			}
			instance.setTags(tags);

			List<Disk> disks = new ArrayList<Disk>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.Instances["+ i +"].Disks.Length"); j++) {
				Disk disk = new Disk();
				disk.setStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Disks["+ j +"].Status"));
				disk.setCategory(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Disks["+ j +"].Category"));
				disk.setResourceGroupId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Disks["+ j +"].ResourceGroupId"));
				disk.setDevice(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Disks["+ j +"].Device"));
				disk.setSize(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].Disks["+ j +"].Size"));
				disk.setDiskChargeType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Disks["+ j +"].DiskChargeType"));
				disk.setDiskName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Disks["+ j +"].DiskName"));
				disk.setRemark(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Disks["+ j +"].Remark"));
				disk.setDiskType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Disks["+ j +"].DiskType"));
				disk.setCreationTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Disks["+ j +"].CreationTime"));
				disk.setRegionId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Disks["+ j +"].RegionId"));
				disk.setDiskId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Disks["+ j +"].DiskId"));

				List<Tag1> diskTags = new ArrayList<Tag1>();
				for (int k = 0; k < _ctx.lengthValue("ListInstancesResponse.Instances["+ i +"].Disks["+ j +"].DiskTags.Length"); k++) {
					Tag1 tag1 = new Tag1();
					tag1.setValue(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Disks["+ j +"].DiskTags["+ k +"].Value"));
					tag1.setKey(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Disks["+ j +"].DiskTags["+ k +"].Key"));

					diskTags.add(tag1);
				}
				disk.setDiskTags(diskTags);

				disks.add(disk);
			}
			instance.setDisks(disks);

			instances.add(instance);
		}
		listInstancesResponse.setInstances(instances);
	 
	 	return listInstancesResponse;
	}
}