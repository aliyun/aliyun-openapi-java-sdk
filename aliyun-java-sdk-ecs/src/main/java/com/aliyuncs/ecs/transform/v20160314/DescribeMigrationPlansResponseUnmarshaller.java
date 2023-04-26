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

import com.aliyuncs.ecs.model.v20160314.DescribeMigrationPlansResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeMigrationPlansResponse.MigrationPlan;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMigrationPlansResponseUnmarshaller {

	public static DescribeMigrationPlansResponse unmarshall(DescribeMigrationPlansResponse describeMigrationPlansResponse, UnmarshallerContext _ctx) {
		
		describeMigrationPlansResponse.setRequestId(_ctx.stringValue("DescribeMigrationPlansResponse.RequestId"));
		describeMigrationPlansResponse.setPageNumber(_ctx.integerValue("DescribeMigrationPlansResponse.PageNumber"));
		describeMigrationPlansResponse.setPageSize(_ctx.integerValue("DescribeMigrationPlansResponse.PageSize"));
		describeMigrationPlansResponse.setTotalCount(_ctx.integerValue("DescribeMigrationPlansResponse.TotalCount"));

		List<MigrationPlan> migrationPlanSet = new ArrayList<MigrationPlan>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMigrationPlansResponse.MigrationPlanSet.Length"); i++) {
			MigrationPlan migrationPlan = new MigrationPlan();
			migrationPlan.setStatus(_ctx.stringValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].Status"));
			migrationPlan.setType(_ctx.stringValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].Type"));
			migrationPlan.setTotalInstanceCount(_ctx.integerValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].TotalInstanceCount"));
			migrationPlan.setTargetVpcId(_ctx.stringValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].TargetVpcId"));
			migrationPlan.setTargetVSwitchId(_ctx.stringValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].TargetVSwitchId"));
			migrationPlan.setCreateTime(_ctx.stringValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].CreateTime"));
			migrationPlan.setEnableNetworkConnectivity(_ctx.booleanValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].EnableNetworkConnectivity"));
			migrationPlan.setEnableAutoCreateVSwitch(_ctx.booleanValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].EnableAutoCreateVSwitch"));
			migrationPlan.setTargetZoneId(_ctx.stringValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].TargetZoneId"));
			migrationPlan.setRemainPrivateIp(_ctx.booleanValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].RemainPrivateIp"));
			migrationPlan.setMigrationPlanId(_ctx.stringValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].MigrationPlanId"));
			migrationPlan.setFinishInstanceCount(_ctx.integerValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].FinishInstanceCount"));
			migrationPlan.setRemainPublicMacAsPriority(_ctx.booleanValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].RemainPublicMacAsPriority"));
			migrationPlan.setName(_ctx.stringValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].Name"));

			List<String> securityGroupNos = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].SecurityGroupNos.Length"); j++) {
				securityGroupNos.add(_ctx.stringValue("DescribeMigrationPlansResponse.MigrationPlanSet["+ i +"].SecurityGroupNos["+ j +"]"));
			}
			migrationPlan.setSecurityGroupNos(securityGroupNos);

			migrationPlanSet.add(migrationPlan);
		}
		describeMigrationPlansResponse.setMigrationPlanSet(migrationPlanSet);
	 
	 	return describeMigrationPlansResponse;
	}
}