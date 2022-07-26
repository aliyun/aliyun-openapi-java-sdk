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

import com.aliyuncs.oos.model.v20190601.CreateApplicationGroupResponse;
import com.aliyuncs.oos.model.v20190601.CreateApplicationGroupResponse.ApplicationGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateApplicationGroupResponseUnmarshaller {

	public static CreateApplicationGroupResponse unmarshall(CreateApplicationGroupResponse createApplicationGroupResponse, UnmarshallerContext _ctx) {
		
		createApplicationGroupResponse.setRequestId(_ctx.stringValue("CreateApplicationGroupResponse.RequestId"));

		ApplicationGroup applicationGroup = new ApplicationGroup();
		applicationGroup.setCmsGroupId(_ctx.stringValue("CreateApplicationGroupResponse.ApplicationGroup.CmsGroupId"));
		applicationGroup.setDeployRegionId(_ctx.stringValue("CreateApplicationGroupResponse.ApplicationGroup.DeployRegionId"));
		applicationGroup.setDescription(_ctx.stringValue("CreateApplicationGroupResponse.ApplicationGroup.Description"));
		applicationGroup.setUpdateDate(_ctx.stringValue("CreateApplicationGroupResponse.ApplicationGroup.UpdateDate"));
		applicationGroup.setImportTagKey(_ctx.stringValue("CreateApplicationGroupResponse.ApplicationGroup.ImportTagKey"));
		applicationGroup.setApplicationName(_ctx.stringValue("CreateApplicationGroupResponse.ApplicationGroup.ApplicationName"));
		applicationGroup.setImportTagValue(_ctx.stringValue("CreateApplicationGroupResponse.ApplicationGroup.ImportTagValue"));
		applicationGroup.setName(_ctx.stringValue("CreateApplicationGroupResponse.ApplicationGroup.Name"));
		applicationGroup.setCreateDate(_ctx.stringValue("CreateApplicationGroupResponse.ApplicationGroup.CreateDate"));
		createApplicationGroupResponse.setApplicationGroup(applicationGroup);
	 
	 	return createApplicationGroupResponse;
	}
}