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

package com.aliyuncs.smartag.transform.v20180313;

import com.aliyuncs.smartag.model.v20180313.UnicomSignConfirmResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnicomSignConfirmResponseUnmarshaller {

	public static UnicomSignConfirmResponse unmarshall(UnicomSignConfirmResponse unicomSignConfirmResponse, UnmarshallerContext _ctx) {
		
		unicomSignConfirmResponse.setRequestId(_ctx.stringValue("UnicomSignConfirmResponse.RequestId"));
		unicomSignConfirmResponse.setMessage(_ctx.stringValue("UnicomSignConfirmResponse.Message"));
		unicomSignConfirmResponse.setCode(_ctx.stringValue("UnicomSignConfirmResponse.Code"));
		unicomSignConfirmResponse.setSuccess(_ctx.booleanValue("UnicomSignConfirmResponse.Success"));
	 
	 	return unicomSignConfirmResponse;
	}
}