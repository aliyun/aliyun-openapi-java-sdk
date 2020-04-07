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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.CancelVmLocalRestoreResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelVmLocalRestoreResponseUnmarshaller {

	public static CancelVmLocalRestoreResponse unmarshall(CancelVmLocalRestoreResponse cancelVmLocalRestoreResponse, UnmarshallerContext _ctx) {
		
		cancelVmLocalRestoreResponse.setRequestId(_ctx.stringValue("CancelVmLocalRestoreResponse.RequestId"));
		cancelVmLocalRestoreResponse.setSuccess(_ctx.booleanValue("CancelVmLocalRestoreResponse.Success"));
		cancelVmLocalRestoreResponse.setCode(_ctx.stringValue("CancelVmLocalRestoreResponse.Code"));
		cancelVmLocalRestoreResponse.setMessage(_ctx.stringValue("CancelVmLocalRestoreResponse.Message"));
	 
	 	return cancelVmLocalRestoreResponse;
	}
}