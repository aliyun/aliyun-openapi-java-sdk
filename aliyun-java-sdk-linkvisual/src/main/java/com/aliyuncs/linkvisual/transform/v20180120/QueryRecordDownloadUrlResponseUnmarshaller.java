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

import com.aliyuncs.linkvisual.model.v20180120.QueryRecordDownloadUrlResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordDownloadUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRecordDownloadUrlResponseUnmarshaller {

	public static QueryRecordDownloadUrlResponse unmarshall(QueryRecordDownloadUrlResponse queryRecordDownloadUrlResponse, UnmarshallerContext _ctx) {
		
		queryRecordDownloadUrlResponse.setRequestId(_ctx.stringValue("QueryRecordDownloadUrlResponse.RequestId"));
		queryRecordDownloadUrlResponse.setSuccess(_ctx.booleanValue("QueryRecordDownloadUrlResponse.Success"));
		queryRecordDownloadUrlResponse.setCode(_ctx.stringValue("QueryRecordDownloadUrlResponse.Code"));
		queryRecordDownloadUrlResponse.setErrorMessage(_ctx.stringValue("QueryRecordDownloadUrlResponse.ErrorMessage"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("QueryRecordDownloadUrlResponse.Data.Url"));
		data.setStatus(_ctx.integerValue("QueryRecordDownloadUrlResponse.Data.Status"));
		data.setProgress(_ctx.integerValue("QueryRecordDownloadUrlResponse.Data.Progress"));
		queryRecordDownloadUrlResponse.setData(data);
	 
	 	return queryRecordDownloadUrlResponse;
	}
}