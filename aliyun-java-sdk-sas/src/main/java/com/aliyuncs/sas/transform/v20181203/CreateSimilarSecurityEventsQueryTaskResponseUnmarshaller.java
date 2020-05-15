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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.CreateSimilarSecurityEventsQueryTaskResponse;
import com.aliyuncs.sas.model.v20181203.CreateSimilarSecurityEventsQueryTaskResponse.CreateSimilarSecurityEventsQueryTaskResponse1;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSimilarSecurityEventsQueryTaskResponseUnmarshaller {

	public static CreateSimilarSecurityEventsQueryTaskResponse unmarshall(CreateSimilarSecurityEventsQueryTaskResponse createSimilarSecurityEventsQueryTaskResponse, UnmarshallerContext _ctx) {
		
		createSimilarSecurityEventsQueryTaskResponse.setRequestId(_ctx.stringValue("CreateSimilarSecurityEventsQueryTaskResponse.RequestId"));

		CreateSimilarSecurityEventsQueryTaskResponse1 createSimilarSecurityEventsQueryTaskResponse1 = new CreateSimilarSecurityEventsQueryTaskResponse1();
		createSimilarSecurityEventsQueryTaskResponse1.setTaskId(_ctx.longValue("CreateSimilarSecurityEventsQueryTaskResponse.CreateSimilarSecurityEventsQueryTaskResponse.TaskId"));
		createSimilarSecurityEventsQueryTaskResponse1.setStatus(_ctx.stringValue("CreateSimilarSecurityEventsQueryTaskResponse.CreateSimilarSecurityEventsQueryTaskResponse.Status"));
		createSimilarSecurityEventsQueryTaskResponse.setCreateSimilarSecurityEventsQueryTaskResponse1(createSimilarSecurityEventsQueryTaskResponse1);
	 
	 	return createSimilarSecurityEventsQueryTaskResponse;
	}
}