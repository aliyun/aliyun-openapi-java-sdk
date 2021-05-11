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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.UpdateNodeRunModeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateNodeRunModeResponseUnmarshaller {

	public static UpdateNodeRunModeResponse unmarshall(UpdateNodeRunModeResponse updateNodeRunModeResponse, UnmarshallerContext _ctx) {
		
		updateNodeRunModeResponse.setRequestId(_ctx.stringValue("UpdateNodeRunModeResponse.RequestId"));
		updateNodeRunModeResponse.setErrorCode(_ctx.stringValue("UpdateNodeRunModeResponse.ErrorCode"));
		updateNodeRunModeResponse.setErrorMessage(_ctx.stringValue("UpdateNodeRunModeResponse.ErrorMessage"));
		updateNodeRunModeResponse.setHttpStatusCode(_ctx.integerValue("UpdateNodeRunModeResponse.HttpStatusCode"));
		updateNodeRunModeResponse.setSuccess(_ctx.booleanValue("UpdateNodeRunModeResponse.Success"));
		updateNodeRunModeResponse.setData(_ctx.booleanValue("UpdateNodeRunModeResponse.Data"));
	 
	 	return updateNodeRunModeResponse;
	}
}