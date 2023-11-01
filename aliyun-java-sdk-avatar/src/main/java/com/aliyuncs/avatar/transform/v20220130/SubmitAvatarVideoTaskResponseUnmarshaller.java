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

import com.aliyuncs.avatar.model.v20220130.SubmitAvatarVideoTaskResponse;
import com.aliyuncs.avatar.model.v20220130.SubmitAvatarVideoTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitAvatarVideoTaskResponseUnmarshaller {

	public static SubmitAvatarVideoTaskResponse unmarshall(SubmitAvatarVideoTaskResponse submitAvatarVideoTaskResponse, UnmarshallerContext _ctx) {
		
		submitAvatarVideoTaskResponse.setRequestId(_ctx.stringValue("SubmitAvatarVideoTaskResponse.RequestId"));
		submitAvatarVideoTaskResponse.setSuccess(_ctx.booleanValue("SubmitAvatarVideoTaskResponse.Success"));
		submitAvatarVideoTaskResponse.setCode(_ctx.stringValue("SubmitAvatarVideoTaskResponse.Code"));
		submitAvatarVideoTaskResponse.setMessage(_ctx.stringValue("SubmitAvatarVideoTaskResponse.Message"));

		Data data = new Data();
		data.setTaskUuid(_ctx.stringValue("SubmitAvatarVideoTaskResponse.Data.TaskUuid"));
		submitAvatarVideoTaskResponse.setData(data);
	 
	 	return submitAvatarVideoTaskResponse;
	}
}