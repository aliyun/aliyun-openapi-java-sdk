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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.DeleteTemplateGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteTemplateGroupResponseUnmarshaller {

	public static DeleteTemplateGroupResponse unmarshall(DeleteTemplateGroupResponse deleteTemplateGroupResponse, UnmarshallerContext _ctx) {
		
		deleteTemplateGroupResponse.setRequestId(_ctx.stringValue("DeleteTemplateGroupResponse.RequestId"));
		deleteTemplateGroupResponse.setSuccess(_ctx.booleanValue("DeleteTemplateGroupResponse.Success"));
		deleteTemplateGroupResponse.setMessage(_ctx.stringValue("DeleteTemplateGroupResponse.Message"));
		deleteTemplateGroupResponse.setErrorCode(_ctx.stringValue("DeleteTemplateGroupResponse.ErrorCode"));
		deleteTemplateGroupResponse.setErrorMessage(_ctx.stringValue("DeleteTemplateGroupResponse.ErrorMessage"));
		deleteTemplateGroupResponse.setCode(_ctx.stringValue("DeleteTemplateGroupResponse.Code"));
		deleteTemplateGroupResponse.setDynamicCode(_ctx.stringValue("DeleteTemplateGroupResponse.DynamicCode"));
		deleteTemplateGroupResponse.setDynamicMessage(_ctx.stringValue("DeleteTemplateGroupResponse.DynamicMessage"));
	 
	 	return deleteTemplateGroupResponse;
	}
}