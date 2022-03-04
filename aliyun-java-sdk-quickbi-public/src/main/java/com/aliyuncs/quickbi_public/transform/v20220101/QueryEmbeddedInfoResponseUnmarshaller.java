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

package com.aliyuncs.quickbi_public.transform.v20220101;

import com.aliyuncs.quickbi_public.model.v20220101.QueryEmbeddedInfoResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryEmbeddedInfoResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.QueryEmbeddedInfoResponse.Result.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEmbeddedInfoResponseUnmarshaller {

	public static QueryEmbeddedInfoResponse unmarshall(QueryEmbeddedInfoResponse queryEmbeddedInfoResponse, UnmarshallerContext _ctx) {
		
		queryEmbeddedInfoResponse.setRequestId(_ctx.stringValue("QueryEmbeddedInfoResponse.RequestId"));
		queryEmbeddedInfoResponse.setSuccess(_ctx.booleanValue("QueryEmbeddedInfoResponse.Success"));

		Result result = new Result();
		result.setEmbeddedCount(_ctx.integerValue("QueryEmbeddedInfoResponse.Result.EmbeddedCount"));
		result.setMaxCount(_ctx.integerValue("QueryEmbeddedInfoResponse.Result.MaxCount"));

		Detail detail = new Detail();
		detail.setDashboardOfflineQuery(_ctx.integerValue("QueryEmbeddedInfoResponse.Result.Detail.DashboardOfflineQuery"));
		detail.setReport(_ctx.integerValue("QueryEmbeddedInfoResponse.Result.Detail.Report"));
		detail.setPage(_ctx.integerValue("QueryEmbeddedInfoResponse.Result.Detail.Page"));
		result.setDetail(detail);
		queryEmbeddedInfoResponse.setResult(result);
	 
	 	return queryEmbeddedInfoResponse;
	}
}