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

import com.aliyuncs.ecs.model.v20140526.CreateAutoProvisioningGroupResponse;
import com.aliyuncs.ecs.model.v20140526.CreateAutoProvisioningGroupResponse.LaunchResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAutoProvisioningGroupResponseUnmarshaller {

	public static CreateAutoProvisioningGroupResponse unmarshall(CreateAutoProvisioningGroupResponse createAutoProvisioningGroupResponse, UnmarshallerContext _ctx) {
		
		createAutoProvisioningGroupResponse.setRequestId(_ctx.stringValue("CreateAutoProvisioningGroupResponse.RequestId"));
		createAutoProvisioningGroupResponse.setAutoProvisioningGroupId(_ctx.stringValue("CreateAutoProvisioningGroupResponse.AutoProvisioningGroupId"));

		List<LaunchResult> launchResults = new ArrayList<LaunchResult>();
		for (int i = 0; i < _ctx.lengthValue("CreateAutoProvisioningGroupResponse.LaunchResults.Length"); i++) {
			LaunchResult launchResult = new LaunchResult();
			launchResult.setZoneId(_ctx.stringValue("CreateAutoProvisioningGroupResponse.LaunchResults["+ i +"].ZoneId"));
			launchResult.setErrorMsg(_ctx.stringValue("CreateAutoProvisioningGroupResponse.LaunchResults["+ i +"].ErrorMsg"));
			launchResult.setInstanceType(_ctx.stringValue("CreateAutoProvisioningGroupResponse.LaunchResults["+ i +"].InstanceType"));
			launchResult.setErrorCode(_ctx.stringValue("CreateAutoProvisioningGroupResponse.LaunchResults["+ i +"].ErrorCode"));
			launchResult.setSpotStrategy(_ctx.stringValue("CreateAutoProvisioningGroupResponse.LaunchResults["+ i +"].SpotStrategy"));

			List<String> instanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateAutoProvisioningGroupResponse.LaunchResults["+ i +"].InstanceIds.Length"); j++) {
				instanceIds.add(_ctx.stringValue("CreateAutoProvisioningGroupResponse.LaunchResults["+ i +"].InstanceIds["+ j +"]"));
			}
			launchResult.setInstanceIds(instanceIds);

			launchResults.add(launchResult);
		}
		createAutoProvisioningGroupResponse.setLaunchResults(launchResults);
	 
	 	return createAutoProvisioningGroupResponse;
	}
}