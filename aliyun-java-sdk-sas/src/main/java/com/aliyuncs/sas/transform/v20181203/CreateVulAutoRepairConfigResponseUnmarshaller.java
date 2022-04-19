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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.CreateVulAutoRepairConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVulAutoRepairConfigResponseUnmarshaller {

	public static CreateVulAutoRepairConfigResponse unmarshall(CreateVulAutoRepairConfigResponse createVulAutoRepairConfigResponse, UnmarshallerContext _ctx) {
		
		createVulAutoRepairConfigResponse.setRequestId(_ctx.stringValue("CreateVulAutoRepairConfigResponse.RequestId"));
		createVulAutoRepairConfigResponse.setSuccess(_ctx.booleanValue("CreateVulAutoRepairConfigResponse.Success"));
		createVulAutoRepairConfigResponse.setCode(_ctx.stringValue("CreateVulAutoRepairConfigResponse.Code"));
		createVulAutoRepairConfigResponse.setMessage(_ctx.stringValue("CreateVulAutoRepairConfigResponse.Message"));
		createVulAutoRepairConfigResponse.setHttpStatusCode(_ctx.integerValue("CreateVulAutoRepairConfigResponse.HttpStatusCode"));
	 
	 	return createVulAutoRepairConfigResponse;
	}
}