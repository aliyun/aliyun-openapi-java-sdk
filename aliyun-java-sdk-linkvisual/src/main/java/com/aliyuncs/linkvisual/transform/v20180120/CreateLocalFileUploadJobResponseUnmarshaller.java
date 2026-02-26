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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.CreateLocalFileUploadJobResponse;
import com.aliyuncs.linkvisual.model.v20180120.CreateLocalFileUploadJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLocalFileUploadJobResponseUnmarshaller {

	public static CreateLocalFileUploadJobResponse unmarshall(CreateLocalFileUploadJobResponse createLocalFileUploadJobResponse, UnmarshallerContext _ctx) {
		
		createLocalFileUploadJobResponse.setRequestId(_ctx.stringValue("CreateLocalFileUploadJobResponse.RequestId"));
		createLocalFileUploadJobResponse.setCode(_ctx.stringValue("CreateLocalFileUploadJobResponse.Code"));
		createLocalFileUploadJobResponse.setErrorMessage(_ctx.stringValue("CreateLocalFileUploadJobResponse.ErrorMessage"));
		createLocalFileUploadJobResponse.setSuccess(_ctx.booleanValue("CreateLocalFileUploadJobResponse.Success"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("CreateLocalFileUploadJobResponse.Data.JobId"));
		createLocalFileUploadJobResponse.setData(data);
	 
	 	return createLocalFileUploadJobResponse;
	}
}