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

import com.aliyuncs.iot.model.v20180120.CreateDownloadDataJobResponse;
import com.aliyuncs.iot.model.v20180120.CreateDownloadDataJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDownloadDataJobResponseUnmarshaller {

	public static CreateDownloadDataJobResponse unmarshall(CreateDownloadDataJobResponse createDownloadDataJobResponse, UnmarshallerContext _ctx) {
		
		createDownloadDataJobResponse.setRequestId(_ctx.stringValue("CreateDownloadDataJobResponse.RequestId"));
		createDownloadDataJobResponse.setCode(_ctx.stringValue("CreateDownloadDataJobResponse.Code"));
		createDownloadDataJobResponse.setErrorMessage(_ctx.stringValue("CreateDownloadDataJobResponse.ErrorMessage"));
		createDownloadDataJobResponse.setSuccess(_ctx.booleanValue("CreateDownloadDataJobResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.integerValue("CreateDownloadDataJobResponse.Data.Status"));
		data.setLongJobId(_ctx.stringValue("CreateDownloadDataJobResponse.Data.LongJobId"));
		data.setAsyncExecute(_ctx.booleanValue("CreateDownloadDataJobResponse.Data.AsyncExecute"));
		data.setCsvUrl(_ctx.stringValue("CreateDownloadDataJobResponse.Data.CsvUrl"));
		data.setCsvFileName(_ctx.stringValue("CreateDownloadDataJobResponse.Data.CsvFileName"));
		createDownloadDataJobResponse.setData(data);
	 
	 	return createDownloadDataJobResponse;
	}
}