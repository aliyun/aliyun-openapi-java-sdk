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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.DeleteScenarioParameterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteScenarioParameterResponseUnmarshaller {

	public static DeleteScenarioParameterResponse unmarshall(DeleteScenarioParameterResponse deleteScenarioParameterResponse, UnmarshallerContext context) {
		
		deleteScenarioParameterResponse.setRequestId(context.stringValue("DeleteScenarioParameterResponse.RequestId"));
		deleteScenarioParameterResponse.setSuccess(context.booleanValue("DeleteScenarioParameterResponse.Success"));
		deleteScenarioParameterResponse.setCode(context.stringValue("DeleteScenarioParameterResponse.Code"));
		deleteScenarioParameterResponse.setMessage(context.stringValue("DeleteScenarioParameterResponse.Message"));
		deleteScenarioParameterResponse.setHttpStatusCode(context.integerValue("DeleteScenarioParameterResponse.HttpStatusCode"));
	 
	 	return deleteScenarioParameterResponse;
	}
}