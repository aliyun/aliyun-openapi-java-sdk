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

import com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateVersionResponse;
import com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateVersionResponse.LaunchTemplateVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLaunchTemplateVersionResponseUnmarshaller {

	public static DeleteLaunchTemplateVersionResponse unmarshall(DeleteLaunchTemplateVersionResponse deleteLaunchTemplateVersionResponse, UnmarshallerContext _ctx) {
		
		deleteLaunchTemplateVersionResponse.setRequestId(_ctx.stringValue("DeleteLaunchTemplateVersionResponse.RequestId"));

		List<LaunchTemplateVersion> launchTemplateVersions = new ArrayList<LaunchTemplateVersion>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLaunchTemplateVersionResponse.LaunchTemplateVersions.Length"); i++) {
			LaunchTemplateVersion launchTemplateVersion = new LaunchTemplateVersion();
			launchTemplateVersion.setLaunchTemplateId(_ctx.stringValue("DeleteLaunchTemplateVersionResponse.LaunchTemplateVersions["+ i +"].LaunchTemplateId"));
			launchTemplateVersion.setLaunchTemplateVersionNumber(_ctx.longValue("DeleteLaunchTemplateVersionResponse.LaunchTemplateVersions["+ i +"].LaunchTemplateVersionNumber"));

			launchTemplateVersions.add(launchTemplateVersion);
		}
		deleteLaunchTemplateVersionResponse.setLaunchTemplateVersions(launchTemplateVersions);
	 
	 	return deleteLaunchTemplateVersionResponse;
	}
}