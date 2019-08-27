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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.GetBackPlanInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBackPlanInfoResponseUnmarshaller {

	public static GetBackPlanInfoResponse unmarshall(GetBackPlanInfoResponse getBackPlanInfoResponse, UnmarshallerContext _ctx) {
		
		getBackPlanInfoResponse.setRequestId(_ctx.stringValue("GetBackPlanInfoResponse.RequestId"));
		getBackPlanInfoResponse.setId(_ctx.stringValue("GetBackPlanInfoResponse.Id"));
		getBackPlanInfoResponse.setName(_ctx.stringValue("GetBackPlanInfoResponse.Name"));
		getBackPlanInfoResponse.setDescription(_ctx.stringValue("GetBackPlanInfoResponse.Description"));
		getBackPlanInfoResponse.setClusterId(_ctx.stringValue("GetBackPlanInfoResponse.ClusterId"));
		getBackPlanInfoResponse.setRootPath(_ctx.stringValue("GetBackPlanInfoResponse.RootPath"));
	 
	 	return getBackPlanInfoResponse;
	}
}