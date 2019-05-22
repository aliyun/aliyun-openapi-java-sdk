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

import com.aliyuncs.ecs.model.v20140526.DescribeFleetsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeFleetsResponse.Fleet;
import com.aliyuncs.ecs.model.v20140526.DescribeFleetsResponse.Fleet.LaunchTemplateConfig;
import com.aliyuncs.ecs.model.v20140526.DescribeFleetsResponse.Fleet.OnDemandOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeFleetsResponse.Fleet.SpotOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeFleetsResponse.Fleet.TargetCapacitySpecification;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFleetsResponseUnmarshaller {

	public static DescribeFleetsResponse unmarshall(DescribeFleetsResponse describeFleetsResponse, UnmarshallerContext context) {
		
		describeFleetsResponse.setRequestId(context.stringValue("DescribeFleetsResponse.RequestId"));
		describeFleetsResponse.setTotalCount(context.integerValue("DescribeFleetsResponse.TotalCount"));
		describeFleetsResponse.setPageNumber(context.integerValue("DescribeFleetsResponse.PageNumber"));
		describeFleetsResponse.setPageSize(context.integerValue("DescribeFleetsResponse.PageSize"));

		List<Fleet> fleets = new ArrayList<Fleet>();
		for (int i = 0; i < context.lengthValue("DescribeFleetsResponse.Fleets.Length"); i++) {
			Fleet fleet = new Fleet();
			fleet.setFleetId(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].FleetId"));
			fleet.setFleetName(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].FleetName"));
			fleet.setFleetType(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].FleetType"));
			fleet.setStatus(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].Status"));
			fleet.setState(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].State"));
			fleet.setRegionId(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].RegionId"));
			fleet.setValidFrom(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].ValidFrom"));
			fleet.setValidUntil(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].ValidUntil"));
			fleet.setExcessCapacityTerminationPolicy(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].ExcessCapacityTerminationPolicy"));
			fleet.setMaxSpotPrice(context.floatValue("DescribeFleetsResponse.Fleets["+ i +"].MaxSpotPrice"));
			fleet.setLaunchTemplateId(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].LaunchTemplateId"));
			fleet.setLaunchTemplateVersion(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].LaunchTemplateVersion"));
			fleet.setTerminateInstances(context.booleanValue("DescribeFleetsResponse.Fleets["+ i +"].TerminateInstances"));
			fleet.setTerminateInstancesWithExpiration(context.booleanValue("DescribeFleetsResponse.Fleets["+ i +"].TerminateInstancesWithExpiration"));
			fleet.setCreationTime(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].CreationTime"));

			SpotOptions spotOptions = new SpotOptions();
			spotOptions.setAllocationStrategy(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].SpotOptions.AllocationStrategy"));
			spotOptions.setInstanceInterruptionBehavior(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].SpotOptions.InstanceInterruptionBehavior"));
			spotOptions.setInstancePoolsToUseCount(context.integerValue("DescribeFleetsResponse.Fleets["+ i +"].SpotOptions.InstancePoolsToUseCount"));
			fleet.setSpotOptions(spotOptions);

			OnDemandOptions onDemandOptions = new OnDemandOptions();
			onDemandOptions.setAllocationStrategy(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].OnDemandOptions.AllocationStrategy"));
			fleet.setOnDemandOptions(onDemandOptions);

			TargetCapacitySpecification targetCapacitySpecification = new TargetCapacitySpecification();
			targetCapacitySpecification.setTotalTargetCapacity(context.floatValue("DescribeFleetsResponse.Fleets["+ i +"].TargetCapacitySpecification.TotalTargetCapacity"));
			targetCapacitySpecification.setOnDemandTargetCapacity(context.floatValue("DescribeFleetsResponse.Fleets["+ i +"].TargetCapacitySpecification.OnDemandTargetCapacity"));
			targetCapacitySpecification.setSpotTargetCapacity(context.floatValue("DescribeFleetsResponse.Fleets["+ i +"].TargetCapacitySpecification.SpotTargetCapacity"));
			targetCapacitySpecification.setDefaultTargetCapacityType(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].TargetCapacitySpecification.DefaultTargetCapacityType"));
			targetCapacitySpecification.setFillGapWithOnDemand(context.booleanValue("DescribeFleetsResponse.Fleets["+ i +"].TargetCapacitySpecification.FillGapWithOnDemand"));
			fleet.setTargetCapacitySpecification(targetCapacitySpecification);

			List<LaunchTemplateConfig> launchTemplateConfigs = new ArrayList<LaunchTemplateConfig>();
			for (int j = 0; j < context.lengthValue("DescribeFleetsResponse.Fleets["+ i +"].launchTemplateConfigs.Length"); j++) {
				LaunchTemplateConfig launchTemplateConfig = new LaunchTemplateConfig();
				launchTemplateConfig.setInstanceType(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].launchTemplateConfigs["+ j +"].InstanceType"));
				launchTemplateConfig.setMaxPrice(context.floatValue("DescribeFleetsResponse.Fleets["+ i +"].launchTemplateConfigs["+ j +"].MaxPrice"));
				launchTemplateConfig.setVSWitchId(context.stringValue("DescribeFleetsResponse.Fleets["+ i +"].launchTemplateConfigs["+ j +"].VSWitchId"));
				launchTemplateConfig.setWeightedCapacity(context.floatValue("DescribeFleetsResponse.Fleets["+ i +"].launchTemplateConfigs["+ j +"].WeightedCapacity"));
				launchTemplateConfig.setPriority(context.floatValue("DescribeFleetsResponse.Fleets["+ i +"].launchTemplateConfigs["+ j +"].Priority"));

				launchTemplateConfigs.add(launchTemplateConfig);
			}
			fleet.setLaunchTemplateConfigs(launchTemplateConfigs);

			fleets.add(fleet);
		}
		describeFleetsResponse.setFleets(fleets);
	 
	 	return describeFleetsResponse;
	}
}