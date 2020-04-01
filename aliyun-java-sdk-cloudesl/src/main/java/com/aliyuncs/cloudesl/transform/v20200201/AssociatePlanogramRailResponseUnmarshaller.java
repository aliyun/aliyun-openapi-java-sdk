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

import com.aliyuncs.cloudesl.model.v20200201.AssociatePlanogramRailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssociatePlanogramRailResponseUnmarshaller {

	public static AssociatePlanogramRailResponse unmarshall(AssociatePlanogramRailResponse associatePlanogramRailResponse, UnmarshallerContext _ctx) {
		
		associatePlanogramRailResponse.setRequestId(_ctx.stringValue("AssociatePlanogramRailResponse.RequestId"));
		associatePlanogramRailResponse.setErrorMessage(_ctx.stringValue("AssociatePlanogramRailResponse.ErrorMessage"));
		associatePlanogramRailResponse.setErrorCode(_ctx.stringValue("AssociatePlanogramRailResponse.ErrorCode"));
		associatePlanogramRailResponse.setMessage(_ctx.stringValue("AssociatePlanogramRailResponse.Message"));
		associatePlanogramRailResponse.setDynamicCode(_ctx.stringValue("AssociatePlanogramRailResponse.DynamicCode"));
		associatePlanogramRailResponse.setCode(_ctx.stringValue("AssociatePlanogramRailResponse.Code"));
		associatePlanogramRailResponse.setDynamicMessage(_ctx.stringValue("AssociatePlanogramRailResponse.DynamicMessage"));
		associatePlanogramRailResponse.setSuccess(_ctx.booleanValue("AssociatePlanogramRailResponse.Success"));
	 
	 	return associatePlanogramRailResponse;
	}
}