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

import com.aliyuncs.devops.model.v20210625.CreateHostGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateHostGroupResponseUnmarshaller {

	public static CreateHostGroupResponse unmarshall(CreateHostGroupResponse createHostGroupResponse, UnmarshallerContext _ctx) {
		
		createHostGroupResponse.setRequestId(_ctx.stringValue("CreateHostGroupResponse.requestId"));
		createHostGroupResponse.setErrorMessage(_ctx.stringValue("CreateHostGroupResponse.errorMessage"));
		createHostGroupResponse.setErrorCode(_ctx.stringValue("CreateHostGroupResponse.errorCode"));
		createHostGroupResponse.setSuccess(_ctx.booleanValue("CreateHostGroupResponse.success"));
		createHostGroupResponse.setHostGroupId(_ctx.longValue("CreateHostGroupResponse.hostGroupId"));
	 
	 	return createHostGroupResponse;
	}
}