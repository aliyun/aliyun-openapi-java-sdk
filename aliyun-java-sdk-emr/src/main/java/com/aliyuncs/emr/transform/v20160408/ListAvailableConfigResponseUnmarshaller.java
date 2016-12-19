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
package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListAvailableConfigResponse;
import com.aliyuncs.emr.model.v20160408.ListAvailableConfigResponse.EmrVerType;
import com.aliyuncs.emr.model.v20160408.ListAvailableConfigResponse.EmrVerType.SubModule;
import com.aliyuncs.emr.model.v20160408.ListAvailableConfigResponse.EmrVerType.SubModule.Optional;
import com.aliyuncs.emr.model.v20160408.ListAvailableConfigResponse.EmrVerType.SubModule.Required;
import com.aliyuncs.emr.model.v20160408.ListAvailableConfigResponse.InstanceType;
import com.aliyuncs.emr.model.v20160408.ListAvailableConfigResponse.SecurityGroupType;
import com.aliyuncs.emr.model.v20160408.ListAvailableConfigResponse.Vpc;
import com.aliyuncs.emr.model.v20160408.ListAvailableConfigResponse.Vpc.SecurityGroup;
import com.aliyuncs.emr.model.v20160408.ListAvailableConfigResponse.Vpc.VSwitch;
import com.aliyuncs.emr.model.v20160408.ListAvailableConfigResponse.ZoneType;
import com.aliyuncs.emr.model.v20160408.ListAvailableConfigResponse.ZoneType.AvailableResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAvailableConfigResponseUnmarshaller {

	public static ListAvailableConfigResponse unmarshall(ListAvailableConfigResponse listAvailableConfigResponse, UnmarshallerContext context) {
		
		listAvailableConfigResponse.setRequestId(context.stringValue("ListAvailableConfigResponse.RequestId"));

		List<SecurityGroupType> securityGroupTypes = new ArrayList<SecurityGroupType>();
		for (int i = 0; i < context.lengthValue("ListAvailableConfigResponse.SecurityGroupTypes.Length"); i++) {
			SecurityGroupType securityGroupType = new SecurityGroupType();
			securityGroupType.setName(context.stringValue("ListAvailableConfigResponse.SecurityGroupTypes["+ i +"].Name"));
			securityGroupType.setState(context.stringValue("ListAvailableConfigResponse.SecurityGroupTypes["+ i +"].State"));
			securityGroupType.setId(context.stringValue("ListAvailableConfigResponse.SecurityGroupTypes["+ i +"].Id"));

			securityGroupTypes.add(securityGroupType);
		}
		listAvailableConfigResponse.setSecurityGroupTypes(securityGroupTypes);

		List<InstanceType> instanceTypes = new ArrayList<InstanceType>();
		for (int i = 0; i < context.lengthValue("ListAvailableConfigResponse.InstanceTypes.Length"); i++) {
			InstanceType instanceType = new InstanceType();
			instanceType.setClassify(context.stringValue("ListAvailableConfigResponse.InstanceTypes["+ i +"].Classify"));
			instanceType.setType(context.stringValue("ListAvailableConfigResponse.InstanceTypes["+ i +"].Type"));
			instanceType.setCpuCore(context.integerValue("ListAvailableConfigResponse.InstanceTypes["+ i +"].CpuCore"));
			instanceType.setMemSize(context.integerValue("ListAvailableConfigResponse.InstanceTypes["+ i +"].MemSize"));
			instanceType.setHasCloudDisk(context.booleanValue("ListAvailableConfigResponse.InstanceTypes["+ i +"].HasCloudDisk"));
			instanceType.setHasEfficiencyCloudDisk(context.booleanValue("ListAvailableConfigResponse.InstanceTypes["+ i +"].HasEfficiencyCloudDisk"));
			instanceType.setHasSSDCloudDisk(context.booleanValue("ListAvailableConfigResponse.InstanceTypes["+ i +"].HasSSDCloudDisk"));

			instanceTypes.add(instanceType);
		}
		listAvailableConfigResponse.setInstanceTypes(instanceTypes);

		List<EmrVerType> emrVerTypes = new ArrayList<EmrVerType>();
		for (int i = 0; i < context.lengthValue("ListAvailableConfigResponse.EmrVerTypes.Length"); i++) {
			EmrVerType emrVerType = new EmrVerType();
			emrVerType.setName(context.stringValue("ListAvailableConfigResponse.EmrVerTypes["+ i +"].Name"));

			List<SubModule> subModules = new ArrayList<SubModule>();
			for (int j = 0; j < context.lengthValue("ListAvailableConfigResponse.EmrVerTypes["+ i +"].SubModules.Length"); j++) {
				SubModule subModule = new SubModule();
				subModule.setName(context.stringValue("ListAvailableConfigResponse.EmrVerTypes["+ i +"].SubModules["+ j +"].Name"));

				List<Required> requiredList = new ArrayList<Required>();
				for (int k = 0; k < context.lengthValue("ListAvailableConfigResponse.EmrVerTypes["+ i +"].SubModules["+ j +"].RequiredList.Length"); k++) {
					Required required = new Required();
					required.setDisplayName(context.stringValue("ListAvailableConfigResponse.EmrVerTypes["+ i +"].SubModules["+ j +"].RequiredList["+ k +"].DisplayName"));
					required.setName(context.stringValue("ListAvailableConfigResponse.EmrVerTypes["+ i +"].SubModules["+ j +"].RequiredList["+ k +"].Name"));
					required.setOnlyDisplay(context.booleanValue("ListAvailableConfigResponse.EmrVerTypes["+ i +"].SubModules["+ j +"].RequiredList["+ k +"].OnlyDisplay"));
					required.setStartTpe(context.integerValue("ListAvailableConfigResponse.EmrVerTypes["+ i +"].SubModules["+ j +"].RequiredList["+ k +"].StartTpe"));
					required.setVersion(context.stringValue("ListAvailableConfigResponse.EmrVerTypes["+ i +"].SubModules["+ j +"].RequiredList["+ k +"].Version"));

					requiredList.add(required);
				}
				subModule.setRequiredList(requiredList);

				List<Optional> optionalList = new ArrayList<Optional>();
				for (int k = 0; k < context.lengthValue("ListAvailableConfigResponse.EmrVerTypes["+ i +"].SubModules["+ j +"].OptionalList.Length"); k++) {
					Optional optional = new Optional();
					optional.setDisplayName(context.stringValue("ListAvailableConfigResponse.EmrVerTypes["+ i +"].SubModules["+ j +"].OptionalList["+ k +"].DisplayName"));
					optional.setName(context.stringValue("ListAvailableConfigResponse.EmrVerTypes["+ i +"].SubModules["+ j +"].OptionalList["+ k +"].Name"));
					optional.setOnlyDisplay(context.booleanValue("ListAvailableConfigResponse.EmrVerTypes["+ i +"].SubModules["+ j +"].OptionalList["+ k +"].OnlyDisplay"));
					optional.setStartTpe(context.integerValue("ListAvailableConfigResponse.EmrVerTypes["+ i +"].SubModules["+ j +"].OptionalList["+ k +"].StartTpe"));
					optional.setVersion(context.stringValue("ListAvailableConfigResponse.EmrVerTypes["+ i +"].SubModules["+ j +"].OptionalList["+ k +"].Version"));

					optionalList.add(optional);
				}
				subModule.setOptionalList(optionalList);

				subModules.add(subModule);
			}
			emrVerType.setSubModules(subModules);

			emrVerTypes.add(emrVerType);
		}
		listAvailableConfigResponse.setEmrVerTypes(emrVerTypes);

		List<ZoneType> zoneTypes = new ArrayList<ZoneType>();
		for (int i = 0; i < context.lengthValue("ListAvailableConfigResponse.ZoneTypes.Length"); i++) {
			ZoneType zoneType = new ZoneType();
			zoneType.setName(context.stringValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].Name"));
			zoneType.setId(context.stringValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].Id"));

			List<String> availableResourceCreationList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResourceCreationList.Length"); j++) {
				availableResourceCreationList.add(context.stringValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResourceCreationList["+ j +"]"));
			}
			zoneType.setAvailableResourceCreationList(availableResourceCreationList);

			List<String> availableDiskCategoryList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableDiskCategoryList.Length"); j++) {
				availableDiskCategoryList.add(context.stringValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableDiskCategoryList["+ j +"]"));
			}
			zoneType.setAvailableDiskCategoryList(availableDiskCategoryList);

			List<AvailableResource> availableResources = new ArrayList<AvailableResource>();
			for (int j = 0; j < context.lengthValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResources.Length"); j++) {
				AvailableResource availableResource = new AvailableResource();
				availableResource.setIoOptimized(context.booleanValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResources["+ j +"].IoOptimized"));

				List<String> systemDiskCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResources["+ j +"].SystemDiskCategories.Length"); k++) {
					systemDiskCategories.add(context.stringValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResources["+ j +"].SystemDiskCategories["+ k +"]"));
				}
				availableResource.setSystemDiskCategories(systemDiskCategories);

				List<String> dataDiskCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResources["+ j +"].DataDiskCategories.Length"); k++) {
					dataDiskCategories.add(context.stringValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResources["+ j +"].DataDiskCategories["+ k +"]"));
				}
				availableResource.setDataDiskCategories(dataDiskCategories);

				List<String> networkTypes = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResources["+ j +"].NetworkTypes.Length"); k++) {
					networkTypes.add(context.stringValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResources["+ j +"].NetworkTypes["+ k +"]"));
				}
				availableResource.setNetworkTypes(networkTypes);

				List<String> supportedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResources["+ j +"].SupportedInstanceTypes.Length"); k++) {
					supportedInstanceTypes.add(context.stringValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResources["+ j +"].SupportedInstanceTypes["+ k +"]"));
				}
				availableResource.setSupportedInstanceTypes(supportedInstanceTypes);

				List<String> instanceTypeFamilies = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResources["+ j +"].InstanceTypeFamilies.Length"); k++) {
					instanceTypeFamilies.add(context.stringValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResources["+ j +"].InstanceTypeFamilies["+ k +"]"));
				}
				availableResource.setInstanceTypeFamilies(instanceTypeFamilies);

				List<String> instanceGenerations = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResources["+ j +"].InstanceGenerations.Length"); k++) {
					instanceGenerations.add(context.stringValue("ListAvailableConfigResponse.ZoneTypes["+ i +"].AvailableResources["+ j +"].InstanceGenerations["+ k +"]"));
				}
				availableResource.setInstanceGenerations(instanceGenerations);

				availableResources.add(availableResource);
			}
			zoneType.setAvailableResources(availableResources);

			zoneTypes.add(zoneType);
		}
		listAvailableConfigResponse.setZoneTypes(zoneTypes);

		List<Vpc> vpcs = new ArrayList<Vpc>();
		for (int i = 0; i < context.lengthValue("ListAvailableConfigResponse.Vpcs.Length"); i++) {
			Vpc vpc = new Vpc();
			vpc.setId(context.stringValue("ListAvailableConfigResponse.Vpcs["+ i +"].Id"));
			vpc.setCidrBlock(context.stringValue("ListAvailableConfigResponse.Vpcs["+ i +"].CidrBlock"));

			List<VSwitch> vSwitchs = new ArrayList<VSwitch>();
			for (int j = 0; j < context.lengthValue("ListAvailableConfigResponse.Vpcs["+ i +"].VSwitchs.Length"); j++) {
				VSwitch vSwitch = new VSwitch();
				vSwitch.setid(context.stringValue("ListAvailableConfigResponse.Vpcs["+ i +"].VSwitchs["+ j +"].id"));
				vSwitch.setCidrBlock(context.stringValue("ListAvailableConfigResponse.Vpcs["+ i +"].VSwitchs["+ j +"].CidrBlock"));
				vSwitch.setZoneId(context.stringValue("ListAvailableConfigResponse.Vpcs["+ i +"].VSwitchs["+ j +"].ZoneId"));

				vSwitchs.add(vSwitch);
			}
			vpc.setVSwitchs(vSwitchs);

			List<SecurityGroup> securityGroups = new ArrayList<SecurityGroup>();
			for (int j = 0; j < context.lengthValue("ListAvailableConfigResponse.Vpcs["+ i +"].SecurityGroups.Length"); j++) {
				SecurityGroup securityGroup = new SecurityGroup();
				securityGroup.setName(context.stringValue("ListAvailableConfigResponse.Vpcs["+ i +"].SecurityGroups["+ j +"].Name"));
				securityGroup.setId(context.stringValue("ListAvailableConfigResponse.Vpcs["+ i +"].SecurityGroups["+ j +"].Id"));

				securityGroups.add(securityGroup);
			}
			vpc.setSecurityGroups(securityGroups);

			vpcs.add(vpc);
		}
		listAvailableConfigResponse.setVpcs(vpcs);
	 
	 	return listAvailableConfigResponse;
	}
}