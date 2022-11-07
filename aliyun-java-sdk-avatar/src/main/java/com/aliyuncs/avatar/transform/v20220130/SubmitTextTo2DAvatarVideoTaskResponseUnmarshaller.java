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

import com.aliyuncs.avatar.model.v20220130.SubmitTextTo2DAvatarVideoTaskResponse;
import com.aliyuncs.avatar.model.v20220130.SubmitTextTo2DAvatarVideoTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitTextTo2DAvatarVideoTaskResponseUnmarshaller {

	public static SubmitTextTo2DAvatarVideoTaskResponse unmarshall(SubmitTextTo2DAvatarVideoTaskResponse submitTextTo2DAvatarVideoTaskResponse, UnmarshallerContext _ctx) {
		
		submitTextTo2DAvatarVideoTaskResponse.setRequestId(_ctx.stringValue("SubmitTextTo2DAvatarVideoTaskResponse.RequestId"));
		submitTextTo2DAvatarVideoTaskResponse.setCode(_ctx.stringValue("SubmitTextTo2DAvatarVideoTaskResponse.Code"));
		submitTextTo2DAvatarVideoTaskResponse.setMessage(_ctx.stringValue("SubmitTextTo2DAvatarVideoTaskResponse.Message"));
		submitTextTo2DAvatarVideoTaskResponse.setSuccess(_ctx.stringValue("SubmitTextTo2DAvatarVideoTaskResponse.Success"));

		Data data = new Data();
		data.setTaskUuid(_ctx.stringValue("SubmitTextTo2DAvatarVideoTaskResponse.Data.TaskUuid"));
		submitTextTo2DAvatarVideoTaskResponse.setData(data);
	 
	 	return submitTextTo2DAvatarVideoTaskResponse;
	}
}