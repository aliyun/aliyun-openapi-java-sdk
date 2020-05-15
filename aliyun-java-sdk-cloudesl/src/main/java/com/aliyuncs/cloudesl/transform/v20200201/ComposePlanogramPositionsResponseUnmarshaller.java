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

import com.aliyuncs.cloudesl.model.v20200201.ComposePlanogramPositionsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ComposePlanogramPositionsResponseUnmarshaller {

	public static ComposePlanogramPositionsResponse unmarshall(ComposePlanogramPositionsResponse composePlanogramPositionsResponse, UnmarshallerContext _ctx) {
		
		composePlanogramPositionsResponse.setRequestId(_ctx.stringValue("ComposePlanogramPositionsResponse.RequestId"));
		composePlanogramPositionsResponse.setErrorMessage(_ctx.stringValue("ComposePlanogramPositionsResponse.ErrorMessage"));
		composePlanogramPositionsResponse.setErrorCode(_ctx.stringValue("ComposePlanogramPositionsResponse.ErrorCode"));
		composePlanogramPositionsResponse.setMessage(_ctx.stringValue("ComposePlanogramPositionsResponse.Message"));
		composePlanogramPositionsResponse.setDynamicCode(_ctx.stringValue("ComposePlanogramPositionsResponse.DynamicCode"));
		composePlanogramPositionsResponse.setCode(_ctx.stringValue("ComposePlanogramPositionsResponse.Code"));
		composePlanogramPositionsResponse.setDynamicMessage(_ctx.stringValue("ComposePlanogramPositionsResponse.DynamicMessage"));
		composePlanogramPositionsResponse.setSuccess(_ctx.booleanValue("ComposePlanogramPositionsResponse.Success"));
	 
	 	return composePlanogramPositionsResponse;
	}
}