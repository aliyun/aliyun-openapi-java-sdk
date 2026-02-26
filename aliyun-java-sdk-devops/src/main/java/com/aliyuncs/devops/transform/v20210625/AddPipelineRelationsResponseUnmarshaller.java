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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.AddPipelineRelationsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddPipelineRelationsResponseUnmarshaller {

	public static AddPipelineRelationsResponse unmarshall(AddPipelineRelationsResponse addPipelineRelationsResponse, UnmarshallerContext _ctx) {
		
		addPipelineRelationsResponse.setRequestId(_ctx.stringValue("AddPipelineRelationsResponse.requestId"));
		addPipelineRelationsResponse.setErrorMessage(_ctx.stringValue("AddPipelineRelationsResponse.errorMessage"));
		addPipelineRelationsResponse.setErrorCode(_ctx.stringValue("AddPipelineRelationsResponse.errorCode"));
		addPipelineRelationsResponse.setSuccess(_ctx.booleanValue("AddPipelineRelationsResponse.success"));
	 
	 	return addPipelineRelationsResponse;
	}
}