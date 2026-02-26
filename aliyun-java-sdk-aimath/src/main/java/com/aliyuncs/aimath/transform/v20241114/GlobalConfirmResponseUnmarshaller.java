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

package com.aliyuncs.aimath.transform.v20241114;

import com.aliyuncs.aimath.model.v20241114.GlobalConfirmResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GlobalConfirmResponseUnmarshaller {

	public static GlobalConfirmResponse unmarshall(GlobalConfirmResponse globalConfirmResponse, UnmarshallerContext _ctx) {
		
		globalConfirmResponse.setRequestId(_ctx.stringValue("GlobalConfirmResponse.RequestId"));
		globalConfirmResponse.setSuccess(_ctx.booleanValue("GlobalConfirmResponse.Success"));
		globalConfirmResponse.setErrCode(_ctx.stringValue("GlobalConfirmResponse.ErrCode"));
		globalConfirmResponse.setErrMsg(_ctx.stringValue("GlobalConfirmResponse.ErrMsg"));
	 
	 	return globalConfirmResponse;
	}
}