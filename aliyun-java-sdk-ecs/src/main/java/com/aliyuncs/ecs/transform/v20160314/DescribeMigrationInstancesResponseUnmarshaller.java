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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeMigrationInstancesResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeMigrationInstancesResponse.MigrationInstance;
import com.aliyuncs.ecs.model.v20160314.DescribeMigrationInstancesResponse.MigrationInstance.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMigrationInstancesResponseUnmarshaller {

	public static DescribeMigrationInstancesResponse unmarshall(DescribeMigrationInstancesResponse describeMigrationInstancesResponse, UnmarshallerContext _ctx) {
		
		describeMigrationInstancesResponse.setRequestId(_ctx.stringValue("DescribeMigrationInstancesResponse.RequestId"));
		describeMigrationInstancesResponse.setPageNumber(_ctx.integerValue("DescribeMigrationInstancesResponse.PageNumber"));
		describeMigrationInstancesResponse.setPageSize(_ctx.integerValue("DescribeMigrationInstancesResponse.PageSize"));
		describeMigrationInstancesResponse.setTotalCount(_ctx.integerValue("DescribeMigrationInstancesResponse.TotalCount"));

		List<MigrationInstance> migrationInstanceSet = new ArrayList<MigrationInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMigrationInstancesResponse.MigrationInstanceSet.Length"); i++) {
			MigrationInstance migrationInstance = new MigrationInstance();
			migrationInstance.setStatus(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].Status"));
			migrationInstance.setFinishTime(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].FinishTime"));
			migrationInstance.setTargetVpcId(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].TargetVpcId"));
			migrationInstance.setInternetIp(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].InternetIp"));
			migrationInstance.setTransitionTime(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].TransitionTime"));
			migrationInstance.setBusinessMigrationType(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].BusinessMigrationType"));
			migrationInstance.setIntranetIpAfterTransition(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].IntranetIpAfterTransition"));
			migrationInstance.setPrivateMacAddress(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].PrivateMacAddress"));
			migrationInstance.setMigrationPlanId(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].MigrationPlanId"));
			migrationInstance.setMergeProgress(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].MergeProgress"));
			migrationInstance.setNetworkMigrationType(_ctx.integerValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].NetworkMigrationType"));
			migrationInstance.setMacAddressAfterTransition(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].MacAddressAfterTransition"));
			migrationInstance.setName(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].Name"));
			migrationInstance.setTargetVSwitchId(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].TargetVSwitchId"));
			migrationInstance.setPublicMacAddress(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].PublicMacAddress"));
			migrationInstance.setNetworkConnectivityStatus(_ctx.booleanValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].NetworkConnectivityStatus"));
			migrationInstance.setMigrationStatus(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].MigrationStatus"));
			migrationInstance.setTargetZoneId(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].TargetZoneId"));
			migrationInstance.setInstanceId(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].InstanceId"));
			migrationInstance.setInstanceType(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].InstanceType"));
			migrationInstance.setIntranetIp(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].IntranetIp"));
			migrationInstance.setRegionId(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].RegionId"));
			migrationInstance.setInstanceChargeType(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].InstanceChargeType"));
			migrationInstance.setResourceGroupId(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].ResourceGroupId"));
			migrationInstance.setChangePublicIp(_ctx.booleanValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].ChangePublicIp"));
			migrationInstance.setInternetIpAfterTransition(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].InternetIpAfterTransition"));
			migrationInstance.setZoneId(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].ZoneId"));
			migrationInstance.setBusinessStatus(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].BusinessStatus"));
			migrationInstance.setHasLocalDisk(_ctx.booleanValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].HasLocalDisk"));
			migrationInstance.setLoadProgress(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].LoadProgress"));
			migrationInstance.setNonStandardInstanceType(_ctx.booleanValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].NonStandardInstanceType"));
			migrationInstance.setTaskId(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].TaskId"));

			List<String> securityGroupIdSets = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].SecurityGroupIdSets.Length"); j++) {
				securityGroupIdSets.add(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].SecurityGroupIdSets["+ j +"]"));
			}
			migrationInstance.setSecurityGroupIdSets(securityGroupIdSets);

			List<String> securityGroupIdSetsAfterTransition = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].SecurityGroupIdSetsAfterTransition.Length"); j++) {
				securityGroupIdSetsAfterTransition.add(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].SecurityGroupIdSetsAfterTransition["+ j +"]"));
			}
			migrationInstance.setSecurityGroupIdSetsAfterTransition(securityGroupIdSetsAfterTransition);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribeMigrationInstancesResponse.MigrationInstanceSet["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			migrationInstance.setTags(tags);

			migrationInstanceSet.add(migrationInstance);
		}
		describeMigrationInstancesResponse.setMigrationInstanceSet(migrationInstanceSet);
	 
	 	return describeMigrationInstancesResponse;
	}
}