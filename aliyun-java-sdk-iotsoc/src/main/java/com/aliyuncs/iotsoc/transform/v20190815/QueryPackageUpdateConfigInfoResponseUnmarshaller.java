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

package com.aliyuncs.iotsoc.transform.v20190815;

import com.aliyuncs.iotsoc.model.v20190815.QueryPackageUpdateConfigInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPackageUpdateConfigInfoResponseUnmarshaller {

	public static QueryPackageUpdateConfigInfoResponse unmarshall(QueryPackageUpdateConfigInfoResponse queryPackageUpdateConfigInfoResponse, UnmarshallerContext _ctx) {
		
		queryPackageUpdateConfigInfoResponse.setRequestId(_ctx.stringValue("QueryPackageUpdateConfigInfoResponse.RequestId"));
		queryPackageUpdateConfigInfoResponse.setSuccess(_ctx.stringValue("QueryPackageUpdateConfigInfoResponse.Success"));
		queryPackageUpdateConfigInfoResponse.setCode(_ctx.stringValue("QueryPackageUpdateConfigInfoResponse.Code"));
		queryPackageUpdateConfigInfoResponse.setMessage(_ctx.stringValue("QueryPackageUpdateConfigInfoResponse.Message"));
		queryPackageUpdateConfigInfoResponse.setData(_ctx.stringValue("QueryPackageUpdateConfigInfoResponse.Data"));
	 
	 	return queryPackageUpdateConfigInfoResponse;
	}
}