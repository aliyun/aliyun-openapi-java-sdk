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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.ModifyCallRatioResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyCallRatioResponseUnmarshaller {

	public static ModifyCallRatioResponse unmarshall(ModifyCallRatioResponse modifyCallRatioResponse, UnmarshallerContext _ctx) {
		
		modifyCallRatioResponse.setRequestId(_ctx.stringValue("ModifyCallRatioResponse.RequestId"));
		modifyCallRatioResponse.setHttpStatusCode(_ctx.integerValue("ModifyCallRatioResponse.HttpStatusCode"));
		modifyCallRatioResponse.setCode(_ctx.stringValue("ModifyCallRatioResponse.Code"));
		modifyCallRatioResponse.setMessage(_ctx.stringValue("ModifyCallRatioResponse.Message"));
		modifyCallRatioResponse.setSuccess(_ctx.booleanValue("ModifyCallRatioResponse.Success"));
	 
	 	return modifyCallRatioResponse;
	}
}