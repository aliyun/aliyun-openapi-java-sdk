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

import com.aliyuncs.ecs.model.v20160314.CreateMigrationPlanResponse;
import com.aliyuncs.ecs.model.v20160314.CreateMigrationPlanResponse.InstancesFailModel;
import com.aliyuncs.ecs.model.v20160314.CreateMigrationPlanResponse.InstancesFailModel.FailModel;
import com.aliyuncs.ecs.model.v20160314.CreateMigrationPlanResponse.PlanFailModel;
import com.aliyuncs.ecs.model.v20160314.CreateMigrationPlanResponse.SgFailModel;
import com.aliyuncs.ecs.model.v20160314.CreateMigrationPlanResponse.SgFailModel.FailModel2;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMigrationPlanResponseUnmarshaller {

	public static CreateMigrationPlanResponse unmarshall(CreateMigrationPlanResponse createMigrationPlanResponse, UnmarshallerContext _ctx) {
		
		createMigrationPlanResponse.setRequestId(_ctx.stringValue("CreateMigrationPlanResponse.RequestId"));
		createMigrationPlanResponse.setMigrationPlanId(_ctx.stringValue("CreateMigrationPlanResponse.MigrationPlanId"));

		List<PlanFailModel> planFailModels = new ArrayList<PlanFailModel>();
		for (int i = 0; i < _ctx.lengthValue("CreateMigrationPlanResponse.PlanFailModels.Length"); i++) {
			PlanFailModel planFailModel = new PlanFailModel();
			planFailModel.setErrorCode(_ctx.stringValue("CreateMigrationPlanResponse.PlanFailModels["+ i +"].ErrorCode"));
			planFailModel.setErrorMessage(_ctx.stringValue("CreateMigrationPlanResponse.PlanFailModels["+ i +"].ErrorMessage"));

			planFailModels.add(planFailModel);
		}
		createMigrationPlanResponse.setPlanFailModels(planFailModels);

		List<InstancesFailModel> instancesFailModels = new ArrayList<InstancesFailModel>();
		for (int i = 0; i < _ctx.lengthValue("CreateMigrationPlanResponse.InstancesFailModels.Length"); i++) {
			InstancesFailModel instancesFailModel = new InstancesFailModel();
			instancesFailModel.setInstanceId(_ctx.stringValue("CreateMigrationPlanResponse.InstancesFailModels["+ i +"].InstanceId"));

			List<FailModel> failModels = new ArrayList<FailModel>();
			for (int j = 0; j < _ctx.lengthValue("CreateMigrationPlanResponse.InstancesFailModels["+ i +"].FailModels.Length"); j++) {
				FailModel failModel = new FailModel();
				failModel.setErrorCode(_ctx.stringValue("CreateMigrationPlanResponse.InstancesFailModels["+ i +"].FailModels["+ j +"].ErrorCode"));
				failModel.setErrorMessage(_ctx.stringValue("CreateMigrationPlanResponse.InstancesFailModels["+ i +"].FailModels["+ j +"].ErrorMessage"));

				failModels.add(failModel);
			}
			instancesFailModel.setFailModels(failModels);

			instancesFailModels.add(instancesFailModel);
		}
		createMigrationPlanResponse.setInstancesFailModels(instancesFailModels);

		List<SgFailModel> sgFailModels = new ArrayList<SgFailModel>();
		for (int i = 0; i < _ctx.lengthValue("CreateMigrationPlanResponse.SgFailModels.Length"); i++) {
			SgFailModel sgFailModel = new SgFailModel();
			sgFailModel.setGroupNo(_ctx.stringValue("CreateMigrationPlanResponse.SgFailModels["+ i +"].GroupNo"));

			List<FailModel2> failModels1 = new ArrayList<FailModel2>();
			for (int j = 0; j < _ctx.lengthValue("CreateMigrationPlanResponse.SgFailModels["+ i +"].FailModels.Length"); j++) {
				FailModel2 failModel2 = new FailModel2();
				failModel2.setErrorCode(_ctx.stringValue("CreateMigrationPlanResponse.SgFailModels["+ i +"].FailModels["+ j +"].ErrorCode"));
				failModel2.setErrorMessage(_ctx.stringValue("CreateMigrationPlanResponse.SgFailModels["+ i +"].FailModels["+ j +"].ErrorMessage"));

				failModels1.add(failModel2);
			}
			sgFailModel.setFailModels1(failModels1);

			sgFailModels.add(sgFailModel);
		}
		createMigrationPlanResponse.setSgFailModels(sgFailModels);
	 
	 	return createMigrationPlanResponse;
	}
}