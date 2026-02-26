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

import com.aliyuncs.avatar.model.v20220130.Render3dAvatarResponse;
import com.aliyuncs.avatar.model.v20220130.Render3dAvatarResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class Render3dAvatarResponseUnmarshaller {

	public static Render3dAvatarResponse unmarshall(Render3dAvatarResponse render3dAvatarResponse, UnmarshallerContext _ctx) {
		
		render3dAvatarResponse.setRequestId(_ctx.stringValue("Render3dAvatarResponse.RequestId"));
		render3dAvatarResponse.setSuccess(_ctx.booleanValue("Render3dAvatarResponse.Success"));
		render3dAvatarResponse.setCode(_ctx.stringValue("Render3dAvatarResponse.Code"));
		render3dAvatarResponse.setMessage(_ctx.stringValue("Render3dAvatarResponse.Message"));

		Data data = new Data();
		data.setRenderData(_ctx.stringValue("Render3dAvatarResponse.Data.RenderData"));
		render3dAvatarResponse.setData(data);
	 
	 	return render3dAvatarResponse;
	}
}