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

import com.aliyuncs.oceanbasepro.model.v20190901.ResumeOmsOpenAPIProjectResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.ResumeOmsOpenAPIProjectResponse.ErrorDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResumeOmsOpenAPIProjectResponseUnmarshaller {

	public static ResumeOmsOpenAPIProjectResponse unmarshall(ResumeOmsOpenAPIProjectResponse resumeOmsOpenAPIProjectResponse, UnmarshallerContext _ctx) {
		
		resumeOmsOpenAPIProjectResponse.setRequestId(_ctx.stringValue("ResumeOmsOpenAPIProjectResponse.RequestId"));
		resumeOmsOpenAPIProjectResponse.setSuccess(_ctx.booleanValue("ResumeOmsOpenAPIProjectResponse.Success"));
		resumeOmsOpenAPIProjectResponse.setCode(_ctx.stringValue("ResumeOmsOpenAPIProjectResponse.Code"));
		resumeOmsOpenAPIProjectResponse.setMessage(_ctx.stringValue("ResumeOmsOpenAPIProjectResponse.Message"));
		resumeOmsOpenAPIProjectResponse.setAdvice(_ctx.stringValue("ResumeOmsOpenAPIProjectResponse.Advice"));
		resumeOmsOpenAPIProjectResponse.setPageNumber(_ctx.integerValue("ResumeOmsOpenAPIProjectResponse.PageNumber"));
		resumeOmsOpenAPIProjectResponse.setPageSize(_ctx.integerValue("ResumeOmsOpenAPIProjectResponse.PageSize"));
		resumeOmsOpenAPIProjectResponse.setTotalCount(_ctx.longValue("ResumeOmsOpenAPIProjectResponse.TotalCount"));
		resumeOmsOpenAPIProjectResponse.setCost(_ctx.stringValue("ResumeOmsOpenAPIProjectResponse.Cost"));
		resumeOmsOpenAPIProjectResponse.setData(_ctx.booleanValue("ResumeOmsOpenAPIProjectResponse.Data"));

		ErrorDetail errorDetail = new ErrorDetail();
		errorDetail.setCode(_ctx.stringValue("ResumeOmsOpenAPIProjectResponse.ErrorDetail.Code"));
		errorDetail.setLevel(_ctx.stringValue("ResumeOmsOpenAPIProjectResponse.ErrorDetail.Level"));
		errorDetail.setMessage(_ctx.stringValue("ResumeOmsOpenAPIProjectResponse.ErrorDetail.Message"));
		errorDetail.setProposal(_ctx.stringValue("ResumeOmsOpenAPIProjectResponse.ErrorDetail.Proposal"));
		resumeOmsOpenAPIProjectResponse.setErrorDetail(errorDetail);
	 
	 	return resumeOmsOpenAPIProjectResponse;
	}
}