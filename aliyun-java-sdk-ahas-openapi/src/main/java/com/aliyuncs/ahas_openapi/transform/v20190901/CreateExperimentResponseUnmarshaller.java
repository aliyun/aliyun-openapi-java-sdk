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

import com.aliyuncs.ahas_openapi.model.v20190901.CreateExperimentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateExperimentResponseUnmarshaller {

	public static CreateExperimentResponse unmarshall(CreateExperimentResponse createExperimentResponse, UnmarshallerContext _ctx) {
		
		createExperimentResponse.setRequestId(_ctx.stringValue("CreateExperimentResponse.RequestId"));
		createExperimentResponse.setMessage(_ctx.stringValue("CreateExperimentResponse.Message"));
		createExperimentResponse.setHttpStatusCode(_ctx.integerValue("CreateExperimentResponse.HttpStatusCode"));
		createExperimentResponse.setSuccess(_ctx.booleanValue("CreateExperimentResponse.Success"));
		createExperimentResponse.setCode(_ctx.stringValue("CreateExperimentResponse.Code"));
		createExperimentResponse.setExperimentId(_ctx.stringValue("CreateExperimentResponse.ExperimentId"));
	 
	 	return createExperimentResponse;
	}
}