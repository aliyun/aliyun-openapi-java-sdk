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

import com.aliyuncs.oceanbasepro.model.v20190901.StopOmsOpenAPIProjectResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.StopOmsOpenAPIProjectResponse.ErrorDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopOmsOpenAPIProjectResponseUnmarshaller {

	public static StopOmsOpenAPIProjectResponse unmarshall(StopOmsOpenAPIProjectResponse stopOmsOpenAPIProjectResponse, UnmarshallerContext _ctx) {
		
		stopOmsOpenAPIProjectResponse.setRequestId(_ctx.stringValue("StopOmsOpenAPIProjectResponse.RequestId"));
		stopOmsOpenAPIProjectResponse.setSuccess(_ctx.booleanValue("StopOmsOpenAPIProjectResponse.Success"));
		stopOmsOpenAPIProjectResponse.setCode(_ctx.stringValue("StopOmsOpenAPIProjectResponse.Code"));
		stopOmsOpenAPIProjectResponse.setMessage(_ctx.stringValue("StopOmsOpenAPIProjectResponse.Message"));
		stopOmsOpenAPIProjectResponse.setAdvice(_ctx.stringValue("StopOmsOpenAPIProjectResponse.Advice"));
		stopOmsOpenAPIProjectResponse.setPageNumber(_ctx.integerValue("StopOmsOpenAPIProjectResponse.PageNumber"));
		stopOmsOpenAPIProjectResponse.setPageSize(_ctx.integerValue("StopOmsOpenAPIProjectResponse.PageSize"));
		stopOmsOpenAPIProjectResponse.setTotalCount(_ctx.longValue("StopOmsOpenAPIProjectResponse.TotalCount"));
		stopOmsOpenAPIProjectResponse.setCost(_ctx.stringValue("StopOmsOpenAPIProjectResponse.Cost"));
		stopOmsOpenAPIProjectResponse.setData(_ctx.booleanValue("StopOmsOpenAPIProjectResponse.Data"));

		ErrorDetail errorDetail = new ErrorDetail();
		errorDetail.setCode(_ctx.stringValue("StopOmsOpenAPIProjectResponse.ErrorDetail.Code"));
		errorDetail.setLevel(_ctx.stringValue("StopOmsOpenAPIProjectResponse.ErrorDetail.Level"));
		errorDetail.setMessage(_ctx.stringValue("StopOmsOpenAPIProjectResponse.ErrorDetail.Message"));
		errorDetail.setProposal(_ctx.stringValue("StopOmsOpenAPIProjectResponse.ErrorDetail.Proposal"));
		stopOmsOpenAPIProjectResponse.setErrorDetail(errorDetail);
	 
	 	return stopOmsOpenAPIProjectResponse;
	}
}