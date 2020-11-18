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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.UpdateFaceUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateFaceUserResponseUnmarshaller {

	public static UpdateFaceUserResponse unmarshall(UpdateFaceUserResponse updateFaceUserResponse, UnmarshallerContext _ctx) {
		
		updateFaceUserResponse.setRequestId(_ctx.stringValue("UpdateFaceUserResponse.RequestId"));
		updateFaceUserResponse.setSuccess(_ctx.booleanValue("UpdateFaceUserResponse.Success"));
		updateFaceUserResponse.setErrorMessage(_ctx.stringValue("UpdateFaceUserResponse.ErrorMessage"));
		updateFaceUserResponse.setCode(_ctx.stringValue("UpdateFaceUserResponse.Code"));
	 
	 	return updateFaceUserResponse;
	}
}