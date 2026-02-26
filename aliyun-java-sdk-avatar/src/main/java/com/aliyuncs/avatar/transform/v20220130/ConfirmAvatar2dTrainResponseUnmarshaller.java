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

import com.aliyuncs.avatar.model.v20220130.ConfirmAvatar2dTrainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmAvatar2dTrainResponseUnmarshaller {

	public static ConfirmAvatar2dTrainResponse unmarshall(ConfirmAvatar2dTrainResponse confirmAvatar2dTrainResponse, UnmarshallerContext _ctx) {
		
		confirmAvatar2dTrainResponse.setRequestId(_ctx.stringValue("ConfirmAvatar2dTrainResponse.RequestId"));
		confirmAvatar2dTrainResponse.setCode(_ctx.stringValue("ConfirmAvatar2dTrainResponse.Code"));
		confirmAvatar2dTrainResponse.setMessage(_ctx.stringValue("ConfirmAvatar2dTrainResponse.Message"));
		confirmAvatar2dTrainResponse.setSuccess(_ctx.booleanValue("ConfirmAvatar2dTrainResponse.Success"));
	 
	 	return confirmAvatar2dTrainResponse;
	}
}