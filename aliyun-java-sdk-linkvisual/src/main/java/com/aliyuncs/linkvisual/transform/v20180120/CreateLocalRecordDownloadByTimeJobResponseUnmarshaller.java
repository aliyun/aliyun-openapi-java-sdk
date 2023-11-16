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

import com.aliyuncs.linkvisual.model.v20180120.CreateLocalRecordDownloadByTimeJobResponse;
import com.aliyuncs.linkvisual.model.v20180120.CreateLocalRecordDownloadByTimeJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLocalRecordDownloadByTimeJobResponseUnmarshaller {

	public static CreateLocalRecordDownloadByTimeJobResponse unmarshall(CreateLocalRecordDownloadByTimeJobResponse createLocalRecordDownloadByTimeJobResponse, UnmarshallerContext _ctx) {
		
		createLocalRecordDownloadByTimeJobResponse.setRequestId(_ctx.stringValue("CreateLocalRecordDownloadByTimeJobResponse.RequestId"));
		createLocalRecordDownloadByTimeJobResponse.setCode(_ctx.stringValue("CreateLocalRecordDownloadByTimeJobResponse.Code"));
		createLocalRecordDownloadByTimeJobResponse.setErrorMessage(_ctx.stringValue("CreateLocalRecordDownloadByTimeJobResponse.ErrorMessage"));
		createLocalRecordDownloadByTimeJobResponse.setSuccess(_ctx.booleanValue("CreateLocalRecordDownloadByTimeJobResponse.Success"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("CreateLocalRecordDownloadByTimeJobResponse.Data.JobId"));
		createLocalRecordDownloadByTimeJobResponse.setData(data);
	 
	 	return createLocalRecordDownloadByTimeJobResponse;
	}
}