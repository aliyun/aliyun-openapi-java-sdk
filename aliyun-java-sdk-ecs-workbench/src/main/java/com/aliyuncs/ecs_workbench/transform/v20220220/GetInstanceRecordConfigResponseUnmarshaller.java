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

package com.aliyuncs.ecs_workbench.transform.v20220220;

import com.aliyuncs.ecs_workbench.model.v20220220.GetInstanceRecordConfigResponse;
import com.aliyuncs.ecs_workbench.model.v20220220.GetInstanceRecordConfigResponse.Root;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceRecordConfigResponseUnmarshaller {

	public static GetInstanceRecordConfigResponse unmarshall(GetInstanceRecordConfigResponse getInstanceRecordConfigResponse, UnmarshallerContext _ctx) {
		
		getInstanceRecordConfigResponse.setRequestId(_ctx.stringValue("GetInstanceRecordConfigResponse.RequestId"));
		getInstanceRecordConfigResponse.setSuccess(_ctx.booleanValue("GetInstanceRecordConfigResponse.Success"));
		getInstanceRecordConfigResponse.setCode(_ctx.stringValue("GetInstanceRecordConfigResponse.Code"));
		getInstanceRecordConfigResponse.setMessage(_ctx.stringValue("GetInstanceRecordConfigResponse.Message"));

		Root root = new Root();
		root.setInstanceId(_ctx.stringValue("GetInstanceRecordConfigResponse.Root.InstanceId"));
		root.setParentId(_ctx.stringValue("GetInstanceRecordConfigResponse.Root.ParentId"));
		root.setRecordStorageTarget(_ctx.stringValue("GetInstanceRecordConfigResponse.Root.RecordStorageTarget"));
		root.setExpirationDays(_ctx.integerValue("GetInstanceRecordConfigResponse.Root.ExpirationDays"));
		getInstanceRecordConfigResponse.setRoot(root);
	 
	 	return getInstanceRecordConfigResponse;
	}
}