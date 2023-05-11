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

import com.aliyuncs.iot.model.v20180120.QueryDeviceFileResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceFileResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceFileResponseUnmarshaller {

	public static QueryDeviceFileResponse unmarshall(QueryDeviceFileResponse queryDeviceFileResponse, UnmarshallerContext _ctx) {
		
		queryDeviceFileResponse.setRequestId(_ctx.stringValue("QueryDeviceFileResponse.RequestId"));
		queryDeviceFileResponse.setSuccess(_ctx.booleanValue("QueryDeviceFileResponse.Success"));
		queryDeviceFileResponse.setCode(_ctx.stringValue("QueryDeviceFileResponse.Code"));
		queryDeviceFileResponse.setErrorMessage(_ctx.stringValue("QueryDeviceFileResponse.ErrorMessage"));

		Data data = new Data();
		data.setFileId(_ctx.stringValue("QueryDeviceFileResponse.Data.FileId"));
		data.setName(_ctx.stringValue("QueryDeviceFileResponse.Data.Name"));
		data.setSize(_ctx.stringValue("QueryDeviceFileResponse.Data.Size"));
		data.setUtcCreatedOn(_ctx.stringValue("QueryDeviceFileResponse.Data.UtcCreatedOn"));
		data.setDownloadUrl(_ctx.stringValue("QueryDeviceFileResponse.Data.DownloadUrl"));
		queryDeviceFileResponse.setData(data);
	 
	 	return queryDeviceFileResponse;
	}
}