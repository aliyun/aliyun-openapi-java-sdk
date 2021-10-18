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

import com.aliyuncs.oos.model.v20190601.GetApplicationGroupResponse;
import com.aliyuncs.oos.model.v20190601.GetApplicationGroupResponse.ApplicationGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationGroupResponseUnmarshaller {

	public static GetApplicationGroupResponse unmarshall(GetApplicationGroupResponse getApplicationGroupResponse, UnmarshallerContext _ctx) {
		
		getApplicationGroupResponse.setRequestId(_ctx.stringValue("GetApplicationGroupResponse.RequestId"));

		ApplicationGroup applicationGroup = new ApplicationGroup();
		applicationGroup.setName(_ctx.stringValue("GetApplicationGroupResponse.ApplicationGroup.Name"));
		applicationGroup.setApplicationName(_ctx.stringValue("GetApplicationGroupResponse.ApplicationGroup.ApplicationName"));
		applicationGroup.setCreateDate(_ctx.stringValue("GetApplicationGroupResponse.ApplicationGroup.CreateDate"));
		applicationGroup.setUpdateDate(_ctx.stringValue("GetApplicationGroupResponse.ApplicationGroup.UpdateDate"));
		applicationGroup.setDescription(_ctx.stringValue("GetApplicationGroupResponse.ApplicationGroup.Description"));
		applicationGroup.setDeployRegionId(_ctx.stringValue("GetApplicationGroupResponse.ApplicationGroup.DeployRegionId"));
		applicationGroup.setImportTagKey(_ctx.stringValue("GetApplicationGroupResponse.ApplicationGroup.ImportTagKey"));
		applicationGroup.setImportTagValue(_ctx.stringValue("GetApplicationGroupResponse.ApplicationGroup.ImportTagValue"));
		applicationGroup.setCmsGroupId(_ctx.stringValue("GetApplicationGroupResponse.ApplicationGroup.CmsGroupId"));
		getApplicationGroupResponse.setApplicationGroup(applicationGroup);
	 
	 	return getApplicationGroupResponse;
	}
}