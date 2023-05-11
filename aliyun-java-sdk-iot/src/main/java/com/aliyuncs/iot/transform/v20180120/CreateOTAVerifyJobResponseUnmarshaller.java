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

import com.aliyuncs.iot.model.v20180120.CreateOTAVerifyJobResponse;
import com.aliyuncs.iot.model.v20180120.CreateOTAVerifyJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOTAVerifyJobResponseUnmarshaller {

	public static CreateOTAVerifyJobResponse unmarshall(CreateOTAVerifyJobResponse createOTAVerifyJobResponse, UnmarshallerContext _ctx) {
		
		createOTAVerifyJobResponse.setRequestId(_ctx.stringValue("CreateOTAVerifyJobResponse.RequestId"));
		createOTAVerifyJobResponse.setSuccess(_ctx.booleanValue("CreateOTAVerifyJobResponse.Success"));
		createOTAVerifyJobResponse.setCode(_ctx.stringValue("CreateOTAVerifyJobResponse.Code"));
		createOTAVerifyJobResponse.setErrorMessage(_ctx.stringValue("CreateOTAVerifyJobResponse.ErrorMessage"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("CreateOTAVerifyJobResponse.Data.JobId"));
		data.setUtcCreate(_ctx.stringValue("CreateOTAVerifyJobResponse.Data.UtcCreate"));
		createOTAVerifyJobResponse.setData(data);
	 
	 	return createOTAVerifyJobResponse;
	}
}