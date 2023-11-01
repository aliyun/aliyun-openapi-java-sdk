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

import com.aliyuncs.avatar.model.v20220130.SubmitAudioTo2DAvatarVideoTaskResponse;
import com.aliyuncs.avatar.model.v20220130.SubmitAudioTo2DAvatarVideoTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitAudioTo2DAvatarVideoTaskResponseUnmarshaller {

	public static SubmitAudioTo2DAvatarVideoTaskResponse unmarshall(SubmitAudioTo2DAvatarVideoTaskResponse submitAudioTo2DAvatarVideoTaskResponse, UnmarshallerContext _ctx) {
		
		submitAudioTo2DAvatarVideoTaskResponse.setRequestId(_ctx.stringValue("SubmitAudioTo2DAvatarVideoTaskResponse.RequestId"));
		submitAudioTo2DAvatarVideoTaskResponse.setCode(_ctx.stringValue("SubmitAudioTo2DAvatarVideoTaskResponse.Code"));
		submitAudioTo2DAvatarVideoTaskResponse.setMessage(_ctx.stringValue("SubmitAudioTo2DAvatarVideoTaskResponse.Message"));
		submitAudioTo2DAvatarVideoTaskResponse.setSuccess(_ctx.booleanValue("SubmitAudioTo2DAvatarVideoTaskResponse.Success"));

		Data data = new Data();
		data.setTaskUuid(_ctx.stringValue("SubmitAudioTo2DAvatarVideoTaskResponse.Data.TaskUuid"));
		submitAudioTo2DAvatarVideoTaskResponse.setData(data);
	 
	 	return submitAudioTo2DAvatarVideoTaskResponse;
	}
}