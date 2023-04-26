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

import com.aliyuncs.ecs.model.v20160314.ReAddMigrationTaskInPlanResponse;
import com.aliyuncs.ecs.model.v20160314.ReAddMigrationTaskInPlanResponse.FailModelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReAddMigrationTaskInPlanResponseUnmarshaller {

	public static ReAddMigrationTaskInPlanResponse unmarshall(ReAddMigrationTaskInPlanResponse reAddMigrationTaskInPlanResponse, UnmarshallerContext _ctx) {
		
		reAddMigrationTaskInPlanResponse.setRequestId(_ctx.stringValue("ReAddMigrationTaskInPlanResponse.RequestId"));

		List<FailModelsItem> failModels = new ArrayList<FailModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("ReAddMigrationTaskInPlanResponse.FailModels.Length"); i++) {
			FailModelsItem failModelsItem = new FailModelsItem();
			failModelsItem.setErrorCode(_ctx.stringValue("ReAddMigrationTaskInPlanResponse.FailModels["+ i +"].ErrorCode"));
			failModelsItem.setErrorMessage(_ctx.stringValue("ReAddMigrationTaskInPlanResponse.FailModels["+ i +"].ErrorMessage"));

			failModels.add(failModelsItem);
		}
		reAddMigrationTaskInPlanResponse.setFailModels(failModels);
	 
	 	return reAddMigrationTaskInPlanResponse;
	}
}