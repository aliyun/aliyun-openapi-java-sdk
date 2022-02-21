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

import com.aliyuncs.cms.model.v20190101.CreateHostAvailabilityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateHostAvailabilityResponseUnmarshaller {

	public static CreateHostAvailabilityResponse unmarshall(CreateHostAvailabilityResponse createHostAvailabilityResponse, UnmarshallerContext _ctx) {
		
		createHostAvailabilityResponse.setRequestId(_ctx.stringValue("CreateHostAvailabilityResponse.RequestId"));
		createHostAvailabilityResponse.setCode(_ctx.stringValue("CreateHostAvailabilityResponse.Code"));
		createHostAvailabilityResponse.setMessage(_ctx.stringValue("CreateHostAvailabilityResponse.Message"));
		createHostAvailabilityResponse.setTaskId(_ctx.longValue("CreateHostAvailabilityResponse.TaskId"));
		createHostAvailabilityResponse.setSuccess(_ctx.booleanValue("CreateHostAvailabilityResponse.Success"));
	 
	 	return createHostAvailabilityResponse;
	}
}