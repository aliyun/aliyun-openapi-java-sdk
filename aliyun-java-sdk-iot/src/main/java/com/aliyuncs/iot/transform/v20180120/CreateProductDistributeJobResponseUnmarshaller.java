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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.CreateProductDistributeJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateProductDistributeJobResponseUnmarshaller {

	public static CreateProductDistributeJobResponse unmarshall(CreateProductDistributeJobResponse createProductDistributeJobResponse, UnmarshallerContext _ctx) {
		
		createProductDistributeJobResponse.setRequestId(_ctx.stringValue("CreateProductDistributeJobResponse.RequestId"));
		createProductDistributeJobResponse.setSuccess(_ctx.booleanValue("CreateProductDistributeJobResponse.Success"));
		createProductDistributeJobResponse.setCode(_ctx.stringValue("CreateProductDistributeJobResponse.Code"));
		createProductDistributeJobResponse.setErrorMessage(_ctx.stringValue("CreateProductDistributeJobResponse.ErrorMessage"));
		createProductDistributeJobResponse.setJobId(_ctx.stringValue("CreateProductDistributeJobResponse.JobId"));
	 
	 	return createProductDistributeJobResponse;
	}
}