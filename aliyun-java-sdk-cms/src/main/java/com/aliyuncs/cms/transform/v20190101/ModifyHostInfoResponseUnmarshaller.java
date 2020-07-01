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

package com.aliyuncs.cms.transform.v20190101;

import com.aliyuncs.cms.model.v20190101.ModifyHostInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyHostInfoResponseUnmarshaller {

	public static ModifyHostInfoResponse unmarshall(ModifyHostInfoResponse modifyHostInfoResponse, UnmarshallerContext _ctx) {
		
		modifyHostInfoResponse.setRequestId(_ctx.stringValue("ModifyHostInfoResponse.RequestId"));
		modifyHostInfoResponse.setCode(_ctx.stringValue("ModifyHostInfoResponse.Code"));
		modifyHostInfoResponse.setMessage(_ctx.stringValue("ModifyHostInfoResponse.Message"));
		modifyHostInfoResponse.setSuccess(_ctx.booleanValue("ModifyHostInfoResponse.Success"));
	 
	 	return modifyHostInfoResponse;
	}
}