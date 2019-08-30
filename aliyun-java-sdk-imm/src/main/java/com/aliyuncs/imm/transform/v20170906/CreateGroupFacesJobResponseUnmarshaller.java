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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.CreateGroupFacesJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGroupFacesJobResponseUnmarshaller {

	public static CreateGroupFacesJobResponse unmarshall(CreateGroupFacesJobResponse createGroupFacesJobResponse, UnmarshallerContext _ctx) {
		
		createGroupFacesJobResponse.setRequestId(_ctx.stringValue("CreateGroupFacesJobResponse.RequestId"));
		createGroupFacesJobResponse.setJobId(_ctx.stringValue("CreateGroupFacesJobResponse.JobId"));
		createGroupFacesJobResponse.setSetId(_ctx.stringValue("CreateGroupFacesJobResponse.SetId"));
		createGroupFacesJobResponse.setJobType(_ctx.stringValue("CreateGroupFacesJobResponse.JobType"));
	 
	 	return createGroupFacesJobResponse;
	}
}