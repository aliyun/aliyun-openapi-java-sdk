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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.QueryTSJobsOssUploadUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSJobsOssUploadUrlResponseUnmarshaller {

	public static QueryTSJobsOssUploadUrlResponse unmarshall(QueryTSJobsOssUploadUrlResponse queryTSJobsOssUploadUrlResponse, UnmarshallerContext _ctx) {
		
		queryTSJobsOssUploadUrlResponse.setRequestId(_ctx.stringValue("QueryTSJobsOssUploadUrlResponse.RequestId"));
		queryTSJobsOssUploadUrlResponse.setResultCode(_ctx.stringValue("QueryTSJobsOssUploadUrlResponse.ResultCode"));
		queryTSJobsOssUploadUrlResponse.setResultMessage(_ctx.stringValue("QueryTSJobsOssUploadUrlResponse.ResultMessage"));
		queryTSJobsOssUploadUrlResponse.setData(_ctx.stringValue("QueryTSJobsOssUploadUrlResponse.Data"));
	 
	 	return queryTSJobsOssUploadUrlResponse;
	}
}