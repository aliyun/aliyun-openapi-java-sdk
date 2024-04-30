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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.ModifyTaskInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyTaskInfoResponseUnmarshaller {

	public static ModifyTaskInfoResponse unmarshall(ModifyTaskInfoResponse modifyTaskInfoResponse, UnmarshallerContext _ctx) {
		
		modifyTaskInfoResponse.setRequestId(_ctx.stringValue("ModifyTaskInfoResponse.RequestId"));
		modifyTaskInfoResponse.setErrorTaskId(_ctx.stringValue("ModifyTaskInfoResponse.ErrorTaskId"));
		modifyTaskInfoResponse.setSuccessCount(_ctx.stringValue("ModifyTaskInfoResponse.SuccessCount"));
		modifyTaskInfoResponse.setErrorCode(_ctx.stringValue("ModifyTaskInfoResponse.ErrorCode"));
	 
	 	return modifyTaskInfoResponse;
	}
}