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

package com.aliyuncs.oos.transform.v20190601;

import com.aliyuncs.oos.model.v20190601.UpdateApplicationGroupResponse;
import com.aliyuncs.oos.model.v20190601.UpdateApplicationGroupResponse.ApplicationGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateApplicationGroupResponseUnmarshaller {

	public static UpdateApplicationGroupResponse unmarshall(UpdateApplicationGroupResponse updateApplicationGroupResponse, UnmarshallerContext _ctx) {
		
		updateApplicationGroupResponse.setRequestId(_ctx.stringValue("UpdateApplicationGroupResponse.RequestId"));

		ApplicationGroup applicationGroup = new ApplicationGroup();
		applicationGroup.setName(_ctx.stringValue("UpdateApplicationGroupResponse.ApplicationGroup.Name"));
		applicationGroup.setApplicationName(_ctx.stringValue("UpdateApplicationGroupResponse.ApplicationGroup.ApplicationName"));
		applicationGroup.setCreatedDate(_ctx.stringValue("UpdateApplicationGroupResponse.ApplicationGroup.CreatedDate"));
		applicationGroup.setUpdatedDate(_ctx.stringValue("UpdateApplicationGroupResponse.ApplicationGroup.UpdatedDate"));
		applicationGroup.setDescription(_ctx.stringValue("UpdateApplicationGroupResponse.ApplicationGroup.Description"));
		applicationGroup.setDeployRegionId(_ctx.stringValue("UpdateApplicationGroupResponse.ApplicationGroup.DeployRegionId"));
		applicationGroup.setImportTagKey(_ctx.stringValue("UpdateApplicationGroupResponse.ApplicationGroup.ImportTagKey"));
		applicationGroup.setImportTagValue(_ctx.stringValue("UpdateApplicationGroupResponse.ApplicationGroup.ImportTagValue"));
		updateApplicationGroupResponse.setApplicationGroup(applicationGroup);
	 
	 	return updateApplicationGroupResponse;
	}
}