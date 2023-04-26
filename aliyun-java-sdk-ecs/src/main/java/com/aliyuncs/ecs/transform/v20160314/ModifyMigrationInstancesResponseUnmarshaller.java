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

import com.aliyuncs.ecs.model.v20160314.ModifyMigrationInstancesResponse;
import com.aliyuncs.ecs.model.v20160314.ModifyMigrationInstancesResponse.InstancesFailModel;
import com.aliyuncs.ecs.model.v20160314.ModifyMigrationInstancesResponse.InstancesFailModel.FailModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyMigrationInstancesResponseUnmarshaller {

	public static ModifyMigrationInstancesResponse unmarshall(ModifyMigrationInstancesResponse modifyMigrationInstancesResponse, UnmarshallerContext _ctx) {
		
		modifyMigrationInstancesResponse.setRequestId(_ctx.stringValue("ModifyMigrationInstancesResponse.RequestId"));

		List<InstancesFailModel> instancesFailModels = new ArrayList<InstancesFailModel>();
		for (int i = 0; i < _ctx.lengthValue("ModifyMigrationInstancesResponse.InstancesFailModels.Length"); i++) {
			InstancesFailModel instancesFailModel = new InstancesFailModel();
			instancesFailModel.setInstanceId(_ctx.stringValue("ModifyMigrationInstancesResponse.InstancesFailModels["+ i +"].InstanceId"));

			List<FailModel> failModels = new ArrayList<FailModel>();
			for (int j = 0; j < _ctx.lengthValue("ModifyMigrationInstancesResponse.InstancesFailModels["+ i +"].FailModels.Length"); j++) {
				FailModel failModel = new FailModel();
				failModel.setErrorCode(_ctx.stringValue("ModifyMigrationInstancesResponse.InstancesFailModels["+ i +"].FailModels["+ j +"].ErrorCode"));
				failModel.setErrorMessage(_ctx.stringValue("ModifyMigrationInstancesResponse.InstancesFailModels["+ i +"].FailModels["+ j +"].ErrorMessage"));

				failModels.add(failModel);
			}
			instancesFailModel.setFailModels(failModels);

			instancesFailModels.add(instancesFailModel);
		}
		modifyMigrationInstancesResponse.setInstancesFailModels(instancesFailModels);
	 
	 	return modifyMigrationInstancesResponse;
	}
}