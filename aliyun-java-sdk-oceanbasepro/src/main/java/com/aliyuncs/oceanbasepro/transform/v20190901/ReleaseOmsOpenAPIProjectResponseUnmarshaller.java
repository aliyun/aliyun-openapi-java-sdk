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

import com.aliyuncs.oceanbasepro.model.v20190901.ReleaseOmsOpenAPIProjectResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.ReleaseOmsOpenAPIProjectResponse.ErrorDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseOmsOpenAPIProjectResponseUnmarshaller {

	public static ReleaseOmsOpenAPIProjectResponse unmarshall(ReleaseOmsOpenAPIProjectResponse releaseOmsOpenAPIProjectResponse, UnmarshallerContext _ctx) {
		
		releaseOmsOpenAPIProjectResponse.setRequestId(_ctx.stringValue("ReleaseOmsOpenAPIProjectResponse.RequestId"));
		releaseOmsOpenAPIProjectResponse.setSuccess(_ctx.booleanValue("ReleaseOmsOpenAPIProjectResponse.Success"));
		releaseOmsOpenAPIProjectResponse.setCode(_ctx.stringValue("ReleaseOmsOpenAPIProjectResponse.Code"));
		releaseOmsOpenAPIProjectResponse.setMessage(_ctx.stringValue("ReleaseOmsOpenAPIProjectResponse.Message"));
		releaseOmsOpenAPIProjectResponse.setAdvice(_ctx.stringValue("ReleaseOmsOpenAPIProjectResponse.Advice"));
		releaseOmsOpenAPIProjectResponse.setPageNumber(_ctx.integerValue("ReleaseOmsOpenAPIProjectResponse.PageNumber"));
		releaseOmsOpenAPIProjectResponse.setPageSize(_ctx.integerValue("ReleaseOmsOpenAPIProjectResponse.PageSize"));
		releaseOmsOpenAPIProjectResponse.setTotalCount(_ctx.longValue("ReleaseOmsOpenAPIProjectResponse.TotalCount"));
		releaseOmsOpenAPIProjectResponse.setCost(_ctx.stringValue("ReleaseOmsOpenAPIProjectResponse.Cost"));
		releaseOmsOpenAPIProjectResponse.setData(_ctx.booleanValue("ReleaseOmsOpenAPIProjectResponse.Data"));

		ErrorDetail errorDetail = new ErrorDetail();
		errorDetail.setCode(_ctx.stringValue("ReleaseOmsOpenAPIProjectResponse.ErrorDetail.Code"));
		errorDetail.setLevel(_ctx.stringValue("ReleaseOmsOpenAPIProjectResponse.ErrorDetail.Level"));
		errorDetail.setMessage(_ctx.stringValue("ReleaseOmsOpenAPIProjectResponse.ErrorDetail.Message"));
		errorDetail.setProposal(_ctx.stringValue("ReleaseOmsOpenAPIProjectResponse.ErrorDetail.Proposal"));
		releaseOmsOpenAPIProjectResponse.setErrorDetail(errorDetail);
	 
	 	return releaseOmsOpenAPIProjectResponse;
	}
}