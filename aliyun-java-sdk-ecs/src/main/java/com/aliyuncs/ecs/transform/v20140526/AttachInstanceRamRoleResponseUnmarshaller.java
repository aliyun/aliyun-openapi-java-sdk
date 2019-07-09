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
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachInstanceRamRoleResponseUnmarshaller {

	public static AttachInstanceRamRoleResponse unmarshall(AttachInstanceRamRoleResponse attachInstanceRamRoleResponse, UnmarshallerContext _ctx) {
		
		attachInstanceRamRoleResponse.setRequestId(_ctx.stringValue("AttachInstanceRamRoleResponse.RequestId"));
		attachInstanceRamRoleResponse.setTotalCount(_ctx.integerValue("AttachInstanceRamRoleResponse.TotalCount"));
		attachInstanceRamRoleResponse.setFailCount(_ctx.integerValue("AttachInstanceRamRoleResponse.FailCount"));
		attachInstanceRamRoleResponse.setRamRoleName(_ctx.stringValue("AttachInstanceRamRoleResponse.RamRoleName"));

		List<AttachInstanceRamRoleResult> attachInstanceRamRoleResults = new ArrayList<AttachInstanceRamRoleResult>();
		for (int i = 0; i < _ctx.lengthValue("AttachInstanceRamRoleResponse.AttachInstanceRamRoleResults.Length"); i++) {
			AttachInstanceRamRoleResult attachInstanceRamRoleResult = new AttachInstanceRamRoleResult();
			attachInstanceRamRoleResult.setInstanceId(_ctx.stringValue("AttachInstanceRamRoleResponse.AttachInstanceRamRoleResults["+ i +"].InstanceId"));
			attachInstanceRamRoleResult.setSuccess(_ctx.booleanValue("AttachInstanceRamRoleResponse.AttachInstanceRamRoleResults["+ i +"].Success"));
			attachInstanceRamRoleResult.setCode(_ctx.stringValue("AttachInstanceRamRoleResponse.AttachInstanceRamRoleResults["+ i +"].Code"));
			attachInstanceRamRoleResult.setMessage(_ctx.stringValue("AttachInstanceRamRoleResponse.AttachInstanceRamRoleResults["+ i +"].Message"));

			attachInstanceRamRoleResults.add(attachInstanceRamRoleResult);
		}
		attachInstanceRamRoleResponse.setAttachInstanceRamRoleResults(attachInstanceRamRoleResults);
	 
	 	return attachInstanceRamRoleResponse;
	}
}