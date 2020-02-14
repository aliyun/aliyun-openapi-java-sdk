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

import com.aliyuncs.cloudesl.model.v20190801.MapPlanogramRailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MapPlanogramRailResponseUnmarshaller {

	public static MapPlanogramRailResponse unmarshall(MapPlanogramRailResponse mapPlanogramRailResponse, UnmarshallerContext _ctx) {
		
		mapPlanogramRailResponse.setRequestId(_ctx.stringValue("MapPlanogramRailResponse.RequestId"));
		mapPlanogramRailResponse.setErrorMessage(_ctx.stringValue("MapPlanogramRailResponse.ErrorMessage"));
		mapPlanogramRailResponse.setErrorCode(_ctx.stringValue("MapPlanogramRailResponse.ErrorCode"));
		mapPlanogramRailResponse.setMessage(_ctx.stringValue("MapPlanogramRailResponse.Message"));
		mapPlanogramRailResponse.setDynamicCode(_ctx.stringValue("MapPlanogramRailResponse.DynamicCode"));
		mapPlanogramRailResponse.setCode(_ctx.stringValue("MapPlanogramRailResponse.Code"));
		mapPlanogramRailResponse.setDynamicMessage(_ctx.stringValue("MapPlanogramRailResponse.DynamicMessage"));
		mapPlanogramRailResponse.setSuccess(_ctx.booleanValue("MapPlanogramRailResponse.Success"));
	 
	 	return mapPlanogramRailResponse;
	}
}