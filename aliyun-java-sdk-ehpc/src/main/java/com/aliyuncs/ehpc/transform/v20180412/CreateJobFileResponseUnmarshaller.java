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

package com.aliyuncs.ehpc.transform.v20180412;

import com.aliyuncs.ehpc.model.v20180412.CreateJobFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateJobFileResponseUnmarshaller {

	public static CreateJobFileResponse unmarshall(CreateJobFileResponse createJobFileResponse, UnmarshallerContext _ctx) {
		
		createJobFileResponse.setRequestId(_ctx.stringValue("CreateJobFileResponse.RequestId"));
		createJobFileResponse.setTemplateId(_ctx.stringValue("CreateJobFileResponse.TemplateId"));
	 
	 	return createJobFileResponse;
	}
}