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

package com.aliyuncs.fnf.transform.v20190315;

import com.aliyuncs.fnf.model.v20190315.CreateFlowResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFlowResponseUnmarshaller {

	public static CreateFlowResponse unmarshall(CreateFlowResponse createFlowResponse, UnmarshallerContext _ctx) {
		
		createFlowResponse.setRequestId(_ctx.stringValue("CreateFlowResponse.RequestId"));
		createFlowResponse.setName(_ctx.stringValue("CreateFlowResponse.Name"));
		createFlowResponse.setDescription(_ctx.stringValue("CreateFlowResponse.Description"));
		createFlowResponse.setDefinition(_ctx.stringValue("CreateFlowResponse.Definition"));
		createFlowResponse.setId(_ctx.stringValue("CreateFlowResponse.Id"));
		createFlowResponse.setType(_ctx.stringValue("CreateFlowResponse.Type"));
		createFlowResponse.setRoleArn(_ctx.stringValue("CreateFlowResponse.RoleArn"));
		createFlowResponse.setCreatedTime(_ctx.stringValue("CreateFlowResponse.CreatedTime"));
		createFlowResponse.setLastModifiedTime(_ctx.stringValue("CreateFlowResponse.LastModifiedTime"));
		createFlowResponse.setExternalStorageLocation(_ctx.stringValue("CreateFlowResponse.ExternalStorageLocation"));
	 
	 	return createFlowResponse;
	}
}