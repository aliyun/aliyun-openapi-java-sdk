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

import com.aliyuncs.linkvisual.model.v20180120.QueryRecordDownloadJobByIdResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordDownloadJobByIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRecordDownloadJobByIdResponseUnmarshaller {

	public static QueryRecordDownloadJobByIdResponse unmarshall(QueryRecordDownloadJobByIdResponse queryRecordDownloadJobByIdResponse, UnmarshallerContext _ctx) {
		
		queryRecordDownloadJobByIdResponse.setRequestId(_ctx.stringValue("QueryRecordDownloadJobByIdResponse.RequestId"));
		queryRecordDownloadJobByIdResponse.setCode(_ctx.stringValue("QueryRecordDownloadJobByIdResponse.Code"));
		queryRecordDownloadJobByIdResponse.setErrorMessage(_ctx.stringValue("QueryRecordDownloadJobByIdResponse.ErrorMessage"));
		queryRecordDownloadJobByIdResponse.setSuccess(_ctx.booleanValue("QueryRecordDownloadJobByIdResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.integerValue("QueryRecordDownloadJobByIdResponse.Data.Status"));
		data.setEndTime(_ctx.integerValue("QueryRecordDownloadJobByIdResponse.Data.EndTime"));
		data.setType(_ctx.integerValue("QueryRecordDownloadJobByIdResponse.Data.Type"));
		data.setProgress(_ctx.integerValue("QueryRecordDownloadJobByIdResponse.Data.Progress"));
		data.setRecordType(_ctx.integerValue("QueryRecordDownloadJobByIdResponse.Data.RecordType"));
		data.setStreamType(_ctx.integerValue("QueryRecordDownloadJobByIdResponse.Data.StreamType"));
		data.setBeginTime(_ctx.integerValue("QueryRecordDownloadJobByIdResponse.Data.BeginTime"));
		data.setUrl(_ctx.stringValue("QueryRecordDownloadJobByIdResponse.Data.Url"));
		data.setJobErrorCode(_ctx.integerValue("QueryRecordDownloadJobByIdResponse.Data.JobErrorCode"));
		data.setFileName(_ctx.stringValue("QueryRecordDownloadJobByIdResponse.Data.FileName"));
		data.setIotId(_ctx.stringValue("QueryRecordDownloadJobByIdResponse.Data.IotId"));
		queryRecordDownloadJobByIdResponse.setData(data);
	 
	 	return queryRecordDownloadJobByIdResponse;
	}
}