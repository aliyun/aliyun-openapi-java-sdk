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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.SetStudioProjectCooperationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetStudioProjectCooperationResponseUnmarshaller {

	public static SetStudioProjectCooperationResponse unmarshall(SetStudioProjectCooperationResponse setStudioProjectCooperationResponse, UnmarshallerContext _ctx) {
		
		setStudioProjectCooperationResponse.setRequestId(_ctx.stringValue("SetStudioProjectCooperationResponse.RequestId"));
		setStudioProjectCooperationResponse.setSuccess(_ctx.booleanValue("SetStudioProjectCooperationResponse.Success"));
		setStudioProjectCooperationResponse.setCode(_ctx.stringValue("SetStudioProjectCooperationResponse.Code"));
		setStudioProjectCooperationResponse.setErrorMessage(_ctx.stringValue("SetStudioProjectCooperationResponse.ErrorMessage"));
		setStudioProjectCooperationResponse.setData(_ctx.booleanValue("SetStudioProjectCooperationResponse.Data"));
	 
	 	return setStudioProjectCooperationResponse;
	}
}