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

import com.aliyuncs.imm.model.v20170906.CreateMergeFaceGroupsJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMergeFaceGroupsJobResponseUnmarshaller {

	public static CreateMergeFaceGroupsJobResponse unmarshall(CreateMergeFaceGroupsJobResponse createMergeFaceGroupsJobResponse, UnmarshallerContext context) {
		
		createMergeFaceGroupsJobResponse.setRequestId(context.stringValue("CreateMergeFaceGroupsJobResponse.RequestId"));
		createMergeFaceGroupsJobResponse.setJobId(context.stringValue("CreateMergeFaceGroupsJobResponse.JobId"));
		createMergeFaceGroupsJobResponse.setSetId(context.stringValue("CreateMergeFaceGroupsJobResponse.SetId"));
		createMergeFaceGroupsJobResponse.setJobType(context.stringValue("CreateMergeFaceGroupsJobResponse.JobType"));
		createMergeFaceGroupsJobResponse.setGroupIdTo(context.stringValue("CreateMergeFaceGroupsJobResponse.GroupIdTo"));
		createMergeFaceGroupsJobResponse.setGroupIdFrom(context.stringValue("CreateMergeFaceGroupsJobResponse.GroupIdFrom"));
	 
	 	return createMergeFaceGroupsJobResponse;
	}
}