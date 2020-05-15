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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.DeletePlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeletePlanResponseUnmarshaller {

	public static DeletePlanResponse unmarshall(DeletePlanResponse deletePlanResponse, UnmarshallerContext _ctx) {
		
		deletePlanResponse.setRequestId(_ctx.stringValue("DeletePlanResponse.RequestId"));
		deletePlanResponse.setSuccess(_ctx.booleanValue("DeletePlanResponse.Success"));
		deletePlanResponse.setCode(_ctx.stringValue("DeletePlanResponse.Code"));
		deletePlanResponse.setMessage(_ctx.stringValue("DeletePlanResponse.Message"));
	 
	 	return deletePlanResponse;
	}
}