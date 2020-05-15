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

import com.aliyuncs.hbr.model.v20170908.UpdateHanaRestoreResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateHanaRestoreResponseUnmarshaller {

	public static UpdateHanaRestoreResponse unmarshall(UpdateHanaRestoreResponse updateHanaRestoreResponse, UnmarshallerContext _ctx) {
		
		updateHanaRestoreResponse.setRequestId(_ctx.stringValue("UpdateHanaRestoreResponse.RequestId"));
		updateHanaRestoreResponse.setSuccess(_ctx.booleanValue("UpdateHanaRestoreResponse.Success"));
		updateHanaRestoreResponse.setCode(_ctx.stringValue("UpdateHanaRestoreResponse.Code"));
		updateHanaRestoreResponse.setMessage(_ctx.stringValue("UpdateHanaRestoreResponse.Message"));
	 
	 	return updateHanaRestoreResponse;
	}
}