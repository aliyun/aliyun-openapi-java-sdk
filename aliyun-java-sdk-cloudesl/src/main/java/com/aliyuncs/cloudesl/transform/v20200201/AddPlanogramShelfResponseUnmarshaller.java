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

import com.aliyuncs.cloudesl.model.v20200201.AddPlanogramShelfResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddPlanogramShelfResponseUnmarshaller {

	public static AddPlanogramShelfResponse unmarshall(AddPlanogramShelfResponse addPlanogramShelfResponse, UnmarshallerContext _ctx) {
		
		addPlanogramShelfResponse.setRequestId(_ctx.stringValue("AddPlanogramShelfResponse.RequestId"));
		addPlanogramShelfResponse.setErrorMessage(_ctx.stringValue("AddPlanogramShelfResponse.ErrorMessage"));
		addPlanogramShelfResponse.setErrorCode(_ctx.stringValue("AddPlanogramShelfResponse.ErrorCode"));
		addPlanogramShelfResponse.setMessage(_ctx.stringValue("AddPlanogramShelfResponse.Message"));
		addPlanogramShelfResponse.setDynamicCode(_ctx.stringValue("AddPlanogramShelfResponse.DynamicCode"));
		addPlanogramShelfResponse.setCode(_ctx.stringValue("AddPlanogramShelfResponse.Code"));
		addPlanogramShelfResponse.setDynamicMessage(_ctx.stringValue("AddPlanogramShelfResponse.DynamicMessage"));
		addPlanogramShelfResponse.setSuccess(_ctx.booleanValue("AddPlanogramShelfResponse.Success"));
	 
	 	return addPlanogramShelfResponse;
	}
}