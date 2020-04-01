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

import com.aliyuncs.cloudesl.model.v20200201.DissociatePlanogramRailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DissociatePlanogramRailResponseUnmarshaller {

	public static DissociatePlanogramRailResponse unmarshall(DissociatePlanogramRailResponse dissociatePlanogramRailResponse, UnmarshallerContext _ctx) {
		
		dissociatePlanogramRailResponse.setRequestId(_ctx.stringValue("DissociatePlanogramRailResponse.RequestId"));
		dissociatePlanogramRailResponse.setErrorMessage(_ctx.stringValue("DissociatePlanogramRailResponse.ErrorMessage"));
		dissociatePlanogramRailResponse.setErrorCode(_ctx.stringValue("DissociatePlanogramRailResponse.ErrorCode"));
		dissociatePlanogramRailResponse.setMessage(_ctx.stringValue("DissociatePlanogramRailResponse.Message"));
		dissociatePlanogramRailResponse.setDynamicCode(_ctx.stringValue("DissociatePlanogramRailResponse.DynamicCode"));
		dissociatePlanogramRailResponse.setCode(_ctx.stringValue("DissociatePlanogramRailResponse.Code"));
		dissociatePlanogramRailResponse.setDynamicMessage(_ctx.stringValue("DissociatePlanogramRailResponse.DynamicMessage"));
		dissociatePlanogramRailResponse.setSuccess(_ctx.booleanValue("DissociatePlanogramRailResponse.Success"));
	 
	 	return dissociatePlanogramRailResponse;
	}
}