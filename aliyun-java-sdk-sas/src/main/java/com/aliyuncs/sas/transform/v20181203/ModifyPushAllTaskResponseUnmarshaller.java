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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ModifyPushAllTaskResponse;
import com.aliyuncs.sas.model.v20181203.ModifyPushAllTaskResponse.PushTaskRsp;
import com.aliyuncs.sas.model.v20181203.ModifyPushAllTaskResponse.PushTaskRsp.PushTaskResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyPushAllTaskResponseUnmarshaller {

	public static ModifyPushAllTaskResponse unmarshall(ModifyPushAllTaskResponse modifyPushAllTaskResponse, UnmarshallerContext _ctx) {
		
		modifyPushAllTaskResponse.setRequestId(_ctx.stringValue("ModifyPushAllTaskResponse.RequestId"));

		PushTaskRsp pushTaskRsp = new PushTaskRsp();

		List<PushTaskResult> pushTaskResultList = new ArrayList<PushTaskResult>();
		for (int i = 0; i < _ctx.lengthValue("ModifyPushAllTaskResponse.PushTaskRsp.PushTaskResultList.Length"); i++) {
			PushTaskResult pushTaskResult = new PushTaskResult();
			pushTaskResult.setInstanceId(_ctx.stringValue("ModifyPushAllTaskResponse.PushTaskRsp.PushTaskResultList["+ i +"].InstanceId"));
			pushTaskResult.setOsVersion(_ctx.stringValue("ModifyPushAllTaskResponse.PushTaskRsp.PushTaskResultList["+ i +"].OsVersion"));
			pushTaskResult.setInstanceName(_ctx.stringValue("ModifyPushAllTaskResponse.PushTaskRsp.PushTaskResultList["+ i +"].InstanceName"));
			pushTaskResult.setSuccess(_ctx.booleanValue("ModifyPushAllTaskResponse.PushTaskRsp.PushTaskResultList["+ i +"].Success"));
			pushTaskResult.setGroupId(_ctx.longValue("ModifyPushAllTaskResponse.PushTaskRsp.PushTaskResultList["+ i +"].GroupId"));
			pushTaskResult.setIp(_ctx.stringValue("ModifyPushAllTaskResponse.PushTaskRsp.PushTaskResultList["+ i +"].Ip"));
			pushTaskResult.setOnline(_ctx.booleanValue("ModifyPushAllTaskResponse.PushTaskRsp.PushTaskResultList["+ i +"].Online"));
			pushTaskResult.setMessage(_ctx.stringValue("ModifyPushAllTaskResponse.PushTaskRsp.PushTaskResultList["+ i +"].Message"));
			pushTaskResult.setRegion(_ctx.stringValue("ModifyPushAllTaskResponse.PushTaskRsp.PushTaskResultList["+ i +"].Region"));
			pushTaskResult.setUuid(_ctx.stringValue("ModifyPushAllTaskResponse.PushTaskRsp.PushTaskResultList["+ i +"].Uuid"));

			pushTaskResultList.add(pushTaskResult);
		}
		pushTaskRsp.setPushTaskResultList(pushTaskResultList);
		modifyPushAllTaskResponse.setPushTaskRsp(pushTaskRsp);
	 
	 	return modifyPushAllTaskResponse;
	}
}