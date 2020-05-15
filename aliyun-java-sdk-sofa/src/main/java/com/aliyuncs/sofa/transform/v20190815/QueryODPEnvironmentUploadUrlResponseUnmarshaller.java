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

import com.aliyuncs.sofa.model.v20190815.QueryODPEnvironmentUploadUrlResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPEnvironmentUploadUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPEnvironmentUploadUrlResponseUnmarshaller {

	public static QueryODPEnvironmentUploadUrlResponse unmarshall(QueryODPEnvironmentUploadUrlResponse queryODPEnvironmentUploadUrlResponse, UnmarshallerContext _ctx) {
		
		queryODPEnvironmentUploadUrlResponse.setRequestId(_ctx.stringValue("QueryODPEnvironmentUploadUrlResponse.RequestId"));
		queryODPEnvironmentUploadUrlResponse.setResultCode(_ctx.stringValue("QueryODPEnvironmentUploadUrlResponse.ResultCode"));
		queryODPEnvironmentUploadUrlResponse.setResultMessage(_ctx.stringValue("QueryODPEnvironmentUploadUrlResponse.ResultMessage"));

		Data data = new Data();
		data.setFileName(_ctx.stringValue("QueryODPEnvironmentUploadUrlResponse.Data.FileName"));
		data.setOssUrl(_ctx.stringValue("QueryODPEnvironmentUploadUrlResponse.Data.OssUrl"));
		queryODPEnvironmentUploadUrlResponse.setData(data);
	 
	 	return queryODPEnvironmentUploadUrlResponse;
	}
}