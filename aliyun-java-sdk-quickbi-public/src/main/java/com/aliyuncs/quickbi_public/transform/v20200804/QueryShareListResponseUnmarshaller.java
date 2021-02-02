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

package com.aliyuncs.quickbi_public.transform.v20200804;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20200804.QueryShareListResponse;
import com.aliyuncs.quickbi_public.model.v20200804.QueryShareListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryShareListResponseUnmarshaller {

	public static QueryShareListResponse unmarshall(QueryShareListResponse queryShareListResponse, UnmarshallerContext _ctx) {
		
		queryShareListResponse.setRequestId(_ctx.stringValue("QueryShareListResponse.RequestId"));
		queryShareListResponse.setSuccess(_ctx.booleanValue("QueryShareListResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("QueryShareListResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setReportId(_ctx.stringValue("QueryShareListResponse.Result["+ i +"].ReportId"));
			data.setShareId(_ctx.stringValue("QueryShareListResponse.Result["+ i +"].ShareId"));
			data.setShareType(_ctx.stringValue("QueryShareListResponse.Result["+ i +"].ShareType"));
			data.setShareToName(_ctx.stringValue("QueryShareListResponse.Result["+ i +"].ShareToName"));
			data.setShareToType(_ctx.integerValue("QueryShareListResponse.Result["+ i +"].ShareToType"));
			data.setAuthPoint(_ctx.integerValue("QueryShareListResponse.Result["+ i +"].AuthPoint"));
			data.setExpireDate(_ctx.longValue("QueryShareListResponse.Result["+ i +"].ExpireDate"));
			data.setShareToId(_ctx.stringValue("QueryShareListResponse.Result["+ i +"].ShareToId"));

			result.add(data);
		}
		queryShareListResponse.setResult(result);
	 
	 	return queryShareListResponse;
	}
}