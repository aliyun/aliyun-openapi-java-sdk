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

import com.aliyuncs.ecs.model.v20140526.DescribeZonesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeZonesResponse.Zone;
import com.aliyuncs.ecs.model.v20140526.DescribeZonesResponse.Zone.ResourcesInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeZonesResponseUnmarshaller {

	public static DescribeZonesResponse unmarshall(DescribeZonesResponse describeZonesResponse, UnmarshallerContext _ctx) {
		
		describeZonesResponse.setRequestId(_ctx.stringValue("DescribeZonesResponse.RequestId"));

		List<Zone> zones = new ArrayList<Zone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeZonesResponse.Zones.Length"); i++) {
			Zone zone = new Zone();
			zone.setZoneId(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneId"));
			zone.setLocalName(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].LocalName"));

			List<String> availableResourceCreation = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].AvailableResourceCreation.Length"); j++) {
				availableResourceCreation.add(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].AvailableResourceCreation["+ j +"]"));
			}
			zone.setAvailableResourceCreation(availableResourceCreation);

			List<String> availableDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].AvailableDiskCategories.Length"); j++) {
				availableDiskCategories.add(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].AvailableDiskCategories["+ j +"]"));
			}
			zone.setAvailableDiskCategories(availableDiskCategories);

			List<String> availableInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].AvailableInstanceTypes.Length"); j++) {
				availableInstanceTypes.add(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].AvailableInstanceTypes["+ j +"]"));
			}
			zone.setAvailableInstanceTypes(availableInstanceTypes);

			List<String> availableVolumeCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].AvailableVolumeCategories.Length"); j++) {
				availableVolumeCategories.add(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].AvailableVolumeCategories["+ j +"]"));
			}
			zone.setAvailableVolumeCategories(availableVolumeCategories);

			List<String> availableDedicatedHostTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].AvailableDedicatedHostTypes.Length"); j++) {
				availableDedicatedHostTypes.add(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].AvailableDedicatedHostTypes["+ j +"]"));
			}
			zone.setAvailableDedicatedHostTypes(availableDedicatedHostTypes);

			List<String> dedicatedHostGenerations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].DedicatedHostGenerations.Length"); j++) {
				dedicatedHostGenerations.add(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].DedicatedHostGenerations["+ j +"]"));
			}
			zone.setDedicatedHostGenerations(dedicatedHostGenerations);

			List<ResourcesInfo> availableResources = new ArrayList<ResourcesInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].AvailableResources.Length"); j++) {
				ResourcesInfo resourcesInfo = new ResourcesInfo();
				resourcesInfo.setIoOptimized(_ctx.booleanValue("DescribeZonesResponse.Zones["+ i +"].AvailableResources["+ j +"].IoOptimized"));

				List<String> systemDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].AvailableResources["+ j +"].SystemDiskCategories.Length"); k++) {
					systemDiskCategories.add(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].AvailableResources["+ j +"].SystemDiskCategories["+ k +"]"));
				}
				resourcesInfo.setSystemDiskCategories(systemDiskCategories);

				List<String> dataDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].AvailableResources["+ j +"].DataDiskCategories.Length"); k++) {
					dataDiskCategories.add(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].AvailableResources["+ j +"].DataDiskCategories["+ k +"]"));
				}
				resourcesInfo.setDataDiskCategories(dataDiskCategories);

				List<String> networkTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].AvailableResources["+ j +"].NetworkTypes.Length"); k++) {
					networkTypes.add(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].AvailableResources["+ j +"].NetworkTypes["+ k +"]"));
				}
				resourcesInfo.setNetworkTypes(networkTypes);

				List<String> instanceTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].AvailableResources["+ j +"].InstanceTypes.Length"); k++) {
					instanceTypes.add(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].AvailableResources["+ j +"].InstanceTypes["+ k +"]"));
				}
				resourcesInfo.setInstanceTypes(instanceTypes);

				List<String> instanceTypeFamilies = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].AvailableResources["+ j +"].InstanceTypeFamilies.Length"); k++) {
					instanceTypeFamilies.add(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].AvailableResources["+ j +"].InstanceTypeFamilies["+ k +"]"));
				}
				resourcesInfo.setInstanceTypeFamilies(instanceTypeFamilies);

				List<String> instanceGenerations = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].AvailableResources["+ j +"].InstanceGenerations.Length"); k++) {
					instanceGenerations.add(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].AvailableResources["+ j +"].InstanceGenerations["+ k +"]"));
				}
				resourcesInfo.setInstanceGenerations(instanceGenerations);

				availableResources.add(resourcesInfo);
			}
			zone.setAvailableResources(availableResources);

			zones.add(zone);
		}
		describeZonesResponse.setZones(zones);
	 
	 	return describeZonesResponse;
	}
}