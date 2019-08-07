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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.AddInfrastructureResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddInfrastructureResponseUnmarshaller {

	public static AddInfrastructureResponse unmarshall(AddInfrastructureResponse addInfrastructureResponse, UnmarshallerContext _ctx) {
		
		addInfrastructureResponse.setRequestId(_ctx.stringValue("AddInfrastructureResponse.RequestId"));
		addInfrastructureResponse.setSuccess(_ctx.booleanValue("AddInfrastructureResponse.Success"));
		addInfrastructureResponse.setCode(_ctx.stringValue("AddInfrastructureResponse.Code"));
		addInfrastructureResponse.setMessage(_ctx.stringValue("AddInfrastructureResponse.Message"));
		addInfrastructureResponse.setTaskId(_ctx.stringValue("AddInfrastructureResponse.TaskId"));
	 
	 	return addInfrastructureResponse;
	}
}