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

import com.aliyuncs.avatar.model.v20220130.SubmitTextTo3DAvatarVideoTaskResponse;
import com.aliyuncs.avatar.model.v20220130.SubmitTextTo3DAvatarVideoTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitTextTo3DAvatarVideoTaskResponseUnmarshaller {

	public static SubmitTextTo3DAvatarVideoTaskResponse unmarshall(SubmitTextTo3DAvatarVideoTaskResponse submitTextTo3DAvatarVideoTaskResponse, UnmarshallerContext _ctx) {
		
		submitTextTo3DAvatarVideoTaskResponse.setRequestId(_ctx.stringValue("SubmitTextTo3DAvatarVideoTaskResponse.RequestId"));
		submitTextTo3DAvatarVideoTaskResponse.setSuccess(_ctx.booleanValue("SubmitTextTo3DAvatarVideoTaskResponse.Success"));
		submitTextTo3DAvatarVideoTaskResponse.setCode(_ctx.stringValue("SubmitTextTo3DAvatarVideoTaskResponse.Code"));
		submitTextTo3DAvatarVideoTaskResponse.setMessage(_ctx.stringValue("SubmitTextTo3DAvatarVideoTaskResponse.Message"));

		Data data = new Data();
		data.setTaskUuid(_ctx.stringValue("SubmitTextTo3DAvatarVideoTaskResponse.Data.TaskUuid"));
		submitTextTo3DAvatarVideoTaskResponse.setData(data);
	 
	 	return submitTextTo3DAvatarVideoTaskResponse;
	}
}