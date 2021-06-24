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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsAddVpcToClassicMigrationInstanceResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsAddVpcToClassicMigrationInstanceResponse.FailModelsItem;
import com.aliyuncs.ecsops.model.v20160401.OpsAddVpcToClassicMigrationInstanceResponse.FailModelsItem.Reason;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsAddVpcToClassicMigrationInstanceResponseUnmarshaller {

	public static OpsAddVpcToClassicMigrationInstanceResponse unmarshall(OpsAddVpcToClassicMigrationInstanceResponse opsAddVpcToClassicMigrationInstanceResponse, UnmarshallerContext _ctx) {
		
		opsAddVpcToClassicMigrationInstanceResponse.setRequestId(_ctx.stringValue("OpsAddVpcToClassicMigrationInstanceResponse.RequestId"));

		List<FailModelsItem> failModels = new ArrayList<FailModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsAddVpcToClassicMigrationInstanceResponse.FailModels.Length"); i++) {
			FailModelsItem failModelsItem = new FailModelsItem();
			failModelsItem.setInstanceId(_ctx.stringValue("OpsAddVpcToClassicMigrationInstanceResponse.FailModels["+ i +"].InstanceId"));

			List<Reason> reasons = new ArrayList<Reason>();
			for (int j = 0; j < _ctx.lengthValue("OpsAddVpcToClassicMigrationInstanceResponse.FailModels["+ i +"].Reasons.Length"); j++) {
				Reason reason = new Reason();
				reason.setErrorMessage(_ctx.stringValue("OpsAddVpcToClassicMigrationInstanceResponse.FailModels["+ i +"].Reasons["+ j +"].ErrorMessage"));
				reason.setErrorCode(_ctx.stringValue("OpsAddVpcToClassicMigrationInstanceResponse.FailModels["+ i +"].Reasons["+ j +"].ErrorCode"));

				reasons.add(reason);
			}
			failModelsItem.setReasons(reasons);

			failModels.add(failModelsItem);
		}
		opsAddVpcToClassicMigrationInstanceResponse.setFailModels(failModels);
	 
	 	return opsAddVpcToClassicMigrationInstanceResponse;
	}
}