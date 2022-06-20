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

import com.aliyuncs.sas.model.v20181203.CreateSuspEventNoteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSuspEventNoteResponseUnmarshaller {

	public static CreateSuspEventNoteResponse unmarshall(CreateSuspEventNoteResponse createSuspEventNoteResponse, UnmarshallerContext _ctx) {
		
		createSuspEventNoteResponse.setRequestId(_ctx.stringValue("CreateSuspEventNoteResponse.RequestId"));
		createSuspEventNoteResponse.setSuccess(_ctx.booleanValue("CreateSuspEventNoteResponse.Success"));
		createSuspEventNoteResponse.setCode(_ctx.stringValue("CreateSuspEventNoteResponse.Code"));
		createSuspEventNoteResponse.setMessage(_ctx.stringValue("CreateSuspEventNoteResponse.Message"));
		createSuspEventNoteResponse.setHttpStatusCode(_ctx.integerValue("CreateSuspEventNoteResponse.HttpStatusCode"));
	 
	 	return createSuspEventNoteResponse;
	}
}