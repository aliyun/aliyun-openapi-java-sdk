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

import com.aliyuncs.fnf.model.v20190315.UpdateFlowResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateFlowResponseUnmarshaller {

	public static UpdateFlowResponse unmarshall(UpdateFlowResponse updateFlowResponse, UnmarshallerContext _ctx) {
		
		updateFlowResponse.setRequestId(_ctx.stringValue("UpdateFlowResponse.RequestId"));
		updateFlowResponse.setName(_ctx.stringValue("UpdateFlowResponse.Name"));
		updateFlowResponse.setDescription(_ctx.stringValue("UpdateFlowResponse.Description"));
		updateFlowResponse.setDefinition(_ctx.stringValue("UpdateFlowResponse.Definition"));
		updateFlowResponse.setId(_ctx.stringValue("UpdateFlowResponse.Id"));
		updateFlowResponse.setType(_ctx.stringValue("UpdateFlowResponse.Type"));
		updateFlowResponse.setRoleArn(_ctx.stringValue("UpdateFlowResponse.RoleArn"));
		updateFlowResponse.setCreatedTime(_ctx.stringValue("UpdateFlowResponse.CreatedTime"));
		updateFlowResponse.setLastModifiedTime(_ctx.stringValue("UpdateFlowResponse.LastModifiedTime"));
	 
	 	return updateFlowResponse;
	}
}