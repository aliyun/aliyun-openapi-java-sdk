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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.UpdateVariableGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateVariableGroupResponseUnmarshaller {

	public static UpdateVariableGroupResponse unmarshall(UpdateVariableGroupResponse updateVariableGroupResponse, UnmarshallerContext _ctx) {
		
		updateVariableGroupResponse.setRequestId(_ctx.stringValue("UpdateVariableGroupResponse.requestId"));
		updateVariableGroupResponse.setErrorMessage(_ctx.stringValue("UpdateVariableGroupResponse.errorMessage"));
		updateVariableGroupResponse.setErrorCode(_ctx.stringValue("UpdateVariableGroupResponse.errorCode"));
		updateVariableGroupResponse.setSuccess(_ctx.booleanValue("UpdateVariableGroupResponse.success"));
	 
	 	return updateVariableGroupResponse;
	}
}