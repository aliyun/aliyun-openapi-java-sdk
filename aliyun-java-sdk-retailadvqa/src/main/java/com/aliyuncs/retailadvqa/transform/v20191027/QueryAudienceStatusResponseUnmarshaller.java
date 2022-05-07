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

package com.aliyuncs.retailadvqa.transform.v20191027;

import com.aliyuncs.retailadvqa.model.v20191027.QueryAudienceStatusResponse;
import com.aliyuncs.retailadvqa.model.v20191027.QueryAudienceStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAudienceStatusResponseUnmarshaller {

	public static QueryAudienceStatusResponse unmarshall(QueryAudienceStatusResponse queryAudienceStatusResponse, UnmarshallerContext _ctx) {
		
		queryAudienceStatusResponse.setRequestId(_ctx.stringValue("QueryAudienceStatusResponse.RequestId"));
		queryAudienceStatusResponse.setTraceId(_ctx.stringValue("QueryAudienceStatusResponse.TraceId"));
		queryAudienceStatusResponse.setSuccess(_ctx.booleanValue("QueryAudienceStatusResponse.Success"));
		queryAudienceStatusResponse.setErrorCode(_ctx.stringValue("QueryAudienceStatusResponse.ErrorCode"));
		queryAudienceStatusResponse.setErrorDesc(_ctx.stringValue("QueryAudienceStatusResponse.ErrorDesc"));

		Data data = new Data();
		data.setUploadId(_ctx.integerValue("QueryAudienceStatusResponse.Data.UploadId"));
		data.setStatus(_ctx.stringValue("QueryAudienceStatusResponse.Data.Status"));
		data.setCrowdId(_ctx.stringValue("QueryAudienceStatusResponse.Data.CrowdId"));
		queryAudienceStatusResponse.setData(data);
	 
	 	return queryAudienceStatusResponse;
	}
}