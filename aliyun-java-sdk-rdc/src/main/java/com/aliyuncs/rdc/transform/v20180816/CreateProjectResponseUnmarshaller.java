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

package com.aliyuncs.rdc.transform.v20180816;

import com.aliyuncs.rdc.model.v20180816.CreateProjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateProjectResponseUnmarshaller {

	public static CreateProjectResponse unmarshall(CreateProjectResponse createProjectResponse, UnmarshallerContext context) {
		
		createProjectResponse.setRequestId(context.stringValue("CreateProjectResponse.RequestId"));
		createProjectResponse.setCode(context.integerValue("CreateProjectResponse.Code"));
		createProjectResponse.setData(context.integerValue("CreateProjectResponse.Data"));
		createProjectResponse.setSuccess(context.booleanValue("CreateProjectResponse.Success"));
		createProjectResponse.setMessage(context.stringValue("CreateProjectResponse.Message"));
	 
	 	return createProjectResponse;
	}
}