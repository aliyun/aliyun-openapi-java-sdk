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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import com.aliyuncs.oceanbasepro.model.v20190901.StartOmsOpenAPIProjectResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.StartOmsOpenAPIProjectResponse.ErrorDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartOmsOpenAPIProjectResponseUnmarshaller {

	public static StartOmsOpenAPIProjectResponse unmarshall(StartOmsOpenAPIProjectResponse startOmsOpenAPIProjectResponse, UnmarshallerContext _ctx) {
		
		startOmsOpenAPIProjectResponse.setRequestId(_ctx.stringValue("StartOmsOpenAPIProjectResponse.RequestId"));
		startOmsOpenAPIProjectResponse.setSuccess(_ctx.booleanValue("StartOmsOpenAPIProjectResponse.Success"));
		startOmsOpenAPIProjectResponse.setCode(_ctx.stringValue("StartOmsOpenAPIProjectResponse.Code"));
		startOmsOpenAPIProjectResponse.setMessage(_ctx.stringValue("StartOmsOpenAPIProjectResponse.Message"));
		startOmsOpenAPIProjectResponse.setAdvice(_ctx.stringValue("StartOmsOpenAPIProjectResponse.Advice"));
		startOmsOpenAPIProjectResponse.setPageNumber(_ctx.integerValue("StartOmsOpenAPIProjectResponse.PageNumber"));
		startOmsOpenAPIProjectResponse.setPageSize(_ctx.integerValue("StartOmsOpenAPIProjectResponse.PageSize"));
		startOmsOpenAPIProjectResponse.setTotalCount(_ctx.longValue("StartOmsOpenAPIProjectResponse.TotalCount"));
		startOmsOpenAPIProjectResponse.setCost(_ctx.stringValue("StartOmsOpenAPIProjectResponse.Cost"));
		startOmsOpenAPIProjectResponse.setData(_ctx.booleanValue("StartOmsOpenAPIProjectResponse.Data"));

		ErrorDetail errorDetail = new ErrorDetail();
		errorDetail.setCode(_ctx.stringValue("StartOmsOpenAPIProjectResponse.ErrorDetail.Code"));
		errorDetail.setLevel(_ctx.stringValue("StartOmsOpenAPIProjectResponse.ErrorDetail.Level"));
		errorDetail.setMessage(_ctx.stringValue("StartOmsOpenAPIProjectResponse.ErrorDetail.Message"));
		errorDetail.setProposal(_ctx.stringValue("StartOmsOpenAPIProjectResponse.ErrorDetail.Proposal"));
		startOmsOpenAPIProjectResponse.setErrorDetail(errorDetail);
	 
	 	return startOmsOpenAPIProjectResponse;
	}
}