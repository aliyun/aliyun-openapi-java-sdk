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

package com.aliyuncs.cloudesl.transform.v20190801;

import com.aliyuncs.cloudesl.model.v20190801.UnmapPlanogramRailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnmapPlanogramRailResponseUnmarshaller {

	public static UnmapPlanogramRailResponse unmarshall(UnmapPlanogramRailResponse unmapPlanogramRailResponse, UnmarshallerContext _ctx) {
		
		unmapPlanogramRailResponse.setRequestId(_ctx.stringValue("UnmapPlanogramRailResponse.RequestId"));
		unmapPlanogramRailResponse.setErrorMessage(_ctx.stringValue("UnmapPlanogramRailResponse.ErrorMessage"));
		unmapPlanogramRailResponse.setErrorCode(_ctx.stringValue("UnmapPlanogramRailResponse.ErrorCode"));
		unmapPlanogramRailResponse.setMessage(_ctx.stringValue("UnmapPlanogramRailResponse.Message"));
		unmapPlanogramRailResponse.setDynamicCode(_ctx.stringValue("UnmapPlanogramRailResponse.DynamicCode"));
		unmapPlanogramRailResponse.setCode(_ctx.stringValue("UnmapPlanogramRailResponse.Code"));
		unmapPlanogramRailResponse.setDynamicMessage(_ctx.stringValue("UnmapPlanogramRailResponse.DynamicMessage"));
		unmapPlanogramRailResponse.setSuccess(_ctx.booleanValue("UnmapPlanogramRailResponse.Success"));
	 
	 	return unmapPlanogramRailResponse;
	}
}