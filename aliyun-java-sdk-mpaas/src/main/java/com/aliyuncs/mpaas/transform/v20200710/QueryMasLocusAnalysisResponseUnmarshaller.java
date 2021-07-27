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

package com.aliyuncs.mpaas.transform.v20200710;

import com.aliyuncs.mpaas.model.v20200710.QueryMasLocusAnalysisResponse;
import com.aliyuncs.mpaas.model.v20200710.QueryMasLocusAnalysisResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMasLocusAnalysisResponseUnmarshaller {

	public static QueryMasLocusAnalysisResponse unmarshall(QueryMasLocusAnalysisResponse queryMasLocusAnalysisResponse, UnmarshallerContext _ctx) {
		
		queryMasLocusAnalysisResponse.setRequestId(_ctx.stringValue("QueryMasLocusAnalysisResponse.RequestId"));
		queryMasLocusAnalysisResponse.setResultCode(_ctx.stringValue("QueryMasLocusAnalysisResponse.ResultCode"));
		queryMasLocusAnalysisResponse.setResultMessage(_ctx.stringValue("QueryMasLocusAnalysisResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.longValue("QueryMasLocusAnalysisResponse.ResultContent.Code"));
		resultContent.setData(_ctx.stringValue("QueryMasLocusAnalysisResponse.ResultContent.Data"));
		resultContent.setMsg(_ctx.stringValue("QueryMasLocusAnalysisResponse.ResultContent.Msg"));
		queryMasLocusAnalysisResponse.setResultContent(resultContent);
	 
	 	return queryMasLocusAnalysisResponse;
	}
}