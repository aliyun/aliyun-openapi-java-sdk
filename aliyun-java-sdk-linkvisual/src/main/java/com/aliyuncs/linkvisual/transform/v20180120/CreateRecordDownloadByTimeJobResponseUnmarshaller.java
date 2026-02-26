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

import com.aliyuncs.linkvisual.model.v20180120.CreateRecordDownloadByTimeJobResponse;
import com.aliyuncs.linkvisual.model.v20180120.CreateRecordDownloadByTimeJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRecordDownloadByTimeJobResponseUnmarshaller {

	public static CreateRecordDownloadByTimeJobResponse unmarshall(CreateRecordDownloadByTimeJobResponse createRecordDownloadByTimeJobResponse, UnmarshallerContext _ctx) {
		
		createRecordDownloadByTimeJobResponse.setRequestId(_ctx.stringValue("CreateRecordDownloadByTimeJobResponse.RequestId"));
		createRecordDownloadByTimeJobResponse.setCode(_ctx.stringValue("CreateRecordDownloadByTimeJobResponse.Code"));
		createRecordDownloadByTimeJobResponse.setErrorMessage(_ctx.stringValue("CreateRecordDownloadByTimeJobResponse.ErrorMessage"));
		createRecordDownloadByTimeJobResponse.setSuccess(_ctx.booleanValue("CreateRecordDownloadByTimeJobResponse.Success"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("CreateRecordDownloadByTimeJobResponse.Data.JobId"));
		createRecordDownloadByTimeJobResponse.setData(data);
	 
	 	return createRecordDownloadByTimeJobResponse;
	}
}