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

import com.aliyuncs.ecs.model.v20140526.AttachInstanceRamRoleResponse;
import com.aliyuncs.ecs.model.v20140526.AttachInstanceRamRoleResponse.AttachInstanceRamRoleResult;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachInstanceRamRoleResponseUnmarshaller {

	public static AttachInstanceRamRoleResponse unmarshall(AttachInstanceRamRoleResponse attachInstanceRamRoleResponse, UnmarshallerContext context) {
		
		attachInstanceRamRoleResponse.setRequestId(context.stringValue("AttachInstanceRamRoleResponse.RequestId"));
		attachInstanceRamRoleResponse.setTotalCount(context.integerValue("AttachInstanceRamRoleResponse.TotalCount"));
		attachInstanceRamRoleResponse.setFailCount(context.integerValue("AttachInstanceRamRoleResponse.FailCount"));
		attachInstanceRamRoleResponse.setRamRoleName(context.stringValue("AttachInstanceRamRoleResponse.RamRoleName"));

		List<AttachInstanceRamRoleResult> attachInstanceRamRoleResults = new ArrayList<AttachInstanceRamRoleResult>();
		for (int i = 0; i < context.lengthValue("AttachInstanceRamRoleResponse.AttachInstanceRamRoleResults.Length"); i++) {
			AttachInstanceRamRoleResult attachInstanceRamRoleResult = new AttachInstanceRamRoleResult();
			attachInstanceRamRoleResult.setInstanceId(context.stringValue("AttachInstanceRamRoleResponse.AttachInstanceRamRoleResults["+ i +"].InstanceId"));
			attachInstanceRamRoleResult.setSuccess(context.booleanValue("AttachInstanceRamRoleResponse.AttachInstanceRamRoleResults["+ i +"].Success"));
			attachInstanceRamRoleResult.setCode(context.stringValue("AttachInstanceRamRoleResponse.AttachInstanceRamRoleResults["+ i +"].Code"));
			attachInstanceRamRoleResult.setMessage(context.stringValue("AttachInstanceRamRoleResponse.AttachInstanceRamRoleResults["+ i +"].Message"));

			attachInstanceRamRoleResults.add(attachInstanceRamRoleResult);
		}
		attachInstanceRamRoleResponse.setAttachInstanceRamRoleResults(attachInstanceRamRoleResults);
	 
	 	return attachInstanceRamRoleResponse;
	}
}