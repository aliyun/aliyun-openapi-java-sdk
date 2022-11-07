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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import com.aliyuncs.ahas_openapi.model.v20190901.UpdateExperimentBasicInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateExperimentBasicInfoResponseUnmarshaller {

	public static UpdateExperimentBasicInfoResponse unmarshall(UpdateExperimentBasicInfoResponse updateExperimentBasicInfoResponse, UnmarshallerContext _ctx) {
		
		updateExperimentBasicInfoResponse.setRequestId(_ctx.stringValue("UpdateExperimentBasicInfoResponse.RequestId"));
		updateExperimentBasicInfoResponse.setMessage(_ctx.stringValue("UpdateExperimentBasicInfoResponse.Message"));
		updateExperimentBasicInfoResponse.setHttpStatusCode(_ctx.integerValue("UpdateExperimentBasicInfoResponse.HttpStatusCode"));
		updateExperimentBasicInfoResponse.setCode(_ctx.stringValue("UpdateExperimentBasicInfoResponse.Code"));
		updateExperimentBasicInfoResponse.setSuccess(_ctx.booleanValue("UpdateExperimentBasicInfoResponse.Success"));
	 
	 	return updateExperimentBasicInfoResponse;
	}
}