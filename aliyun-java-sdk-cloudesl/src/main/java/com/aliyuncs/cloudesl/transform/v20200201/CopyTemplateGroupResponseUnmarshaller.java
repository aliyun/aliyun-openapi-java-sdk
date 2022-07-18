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

import com.aliyuncs.cloudesl.model.v20200201.CopyTemplateGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CopyTemplateGroupResponseUnmarshaller {

	public static CopyTemplateGroupResponse unmarshall(CopyTemplateGroupResponse copyTemplateGroupResponse, UnmarshallerContext _ctx) {
		
		copyTemplateGroupResponse.setRequestId(_ctx.stringValue("CopyTemplateGroupResponse.RequestId"));
		copyTemplateGroupResponse.setSuccess(_ctx.booleanValue("CopyTemplateGroupResponse.Success"));
		copyTemplateGroupResponse.setMessage(_ctx.stringValue("CopyTemplateGroupResponse.Message"));
		copyTemplateGroupResponse.setErrorCode(_ctx.stringValue("CopyTemplateGroupResponse.ErrorCode"));
		copyTemplateGroupResponse.setErrorMessage(_ctx.stringValue("CopyTemplateGroupResponse.ErrorMessage"));
		copyTemplateGroupResponse.setCode(_ctx.stringValue("CopyTemplateGroupResponse.Code"));
		copyTemplateGroupResponse.setDynamicCode(_ctx.stringValue("CopyTemplateGroupResponse.DynamicCode"));
		copyTemplateGroupResponse.setDynamicMessage(_ctx.stringValue("CopyTemplateGroupResponse.DynamicMessage"));
	 
	 	return copyTemplateGroupResponse;
	}
}