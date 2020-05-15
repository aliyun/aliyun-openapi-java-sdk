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

import com.aliyuncs.cloudesl.model.v20200201.DeletePlanogramShelfResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeletePlanogramShelfResponseUnmarshaller {

	public static DeletePlanogramShelfResponse unmarshall(DeletePlanogramShelfResponse deletePlanogramShelfResponse, UnmarshallerContext _ctx) {
		
		deletePlanogramShelfResponse.setRequestId(_ctx.stringValue("DeletePlanogramShelfResponse.RequestId"));
		deletePlanogramShelfResponse.setErrorMessage(_ctx.stringValue("DeletePlanogramShelfResponse.ErrorMessage"));
		deletePlanogramShelfResponse.setErrorCode(_ctx.stringValue("DeletePlanogramShelfResponse.ErrorCode"));
		deletePlanogramShelfResponse.setMessage(_ctx.stringValue("DeletePlanogramShelfResponse.Message"));
		deletePlanogramShelfResponse.setDynamicCode(_ctx.stringValue("DeletePlanogramShelfResponse.DynamicCode"));
		deletePlanogramShelfResponse.setCode(_ctx.stringValue("DeletePlanogramShelfResponse.Code"));
		deletePlanogramShelfResponse.setDynamicMessage(_ctx.stringValue("DeletePlanogramShelfResponse.DynamicMessage"));
		deletePlanogramShelfResponse.setSuccess(_ctx.booleanValue("DeletePlanogramShelfResponse.Success"));
	 
	 	return deletePlanogramShelfResponse;
	}
}