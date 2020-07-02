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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.UpdateOuterAccountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateOuterAccountResponseUnmarshaller {

	public static UpdateOuterAccountResponse unmarshall(UpdateOuterAccountResponse updateOuterAccountResponse, UnmarshallerContext _ctx) {
		
		updateOuterAccountResponse.setRequestId(_ctx.stringValue("UpdateOuterAccountResponse.RequestId"));
		updateOuterAccountResponse.setCode(_ctx.stringValue("UpdateOuterAccountResponse.Code"));
		updateOuterAccountResponse.setMessage(_ctx.stringValue("UpdateOuterAccountResponse.Message"));
		updateOuterAccountResponse.setData(_ctx.stringValue("UpdateOuterAccountResponse.Data"));
		updateOuterAccountResponse.setSuccess(_ctx.booleanValue("UpdateOuterAccountResponse.Success"));
	 
	 	return updateOuterAccountResponse;
	}
}