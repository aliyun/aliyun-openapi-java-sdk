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

package com.aliyuncs.avatar.transform.v20220130;

import com.aliyuncs.avatar.model.v20220130.CancelVideoTaskResponse;
import com.aliyuncs.avatar.model.v20220130.CancelVideoTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelVideoTaskResponseUnmarshaller {

	public static CancelVideoTaskResponse unmarshall(CancelVideoTaskResponse cancelVideoTaskResponse, UnmarshallerContext _ctx) {
		
		cancelVideoTaskResponse.setRequestId(_ctx.stringValue("CancelVideoTaskResponse.RequestId"));
		cancelVideoTaskResponse.setCode(_ctx.stringValue("CancelVideoTaskResponse.Code"));
		cancelVideoTaskResponse.setMessage(_ctx.stringValue("CancelVideoTaskResponse.Message"));
		cancelVideoTaskResponse.setSuccess(_ctx.booleanValue("CancelVideoTaskResponse.Success"));

		Data data = new Data();
		data.setTaskUuid(_ctx.stringValue("CancelVideoTaskResponse.Data.TaskUuid"));
		data.setIsCancel(_ctx.booleanValue("CancelVideoTaskResponse.Data.IsCancel"));
		data.setFailReason(_ctx.stringValue("CancelVideoTaskResponse.Data.FailReason"));
		cancelVideoTaskResponse.setData(data);
	 
	 	return cancelVideoTaskResponse;
	}
}