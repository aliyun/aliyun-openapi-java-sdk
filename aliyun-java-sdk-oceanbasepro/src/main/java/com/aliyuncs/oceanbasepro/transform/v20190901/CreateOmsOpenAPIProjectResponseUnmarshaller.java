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

import com.aliyuncs.oceanbasepro.model.v20190901.CreateOmsOpenAPIProjectResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.CreateOmsOpenAPIProjectResponse.ErrorDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOmsOpenAPIProjectResponseUnmarshaller {

	public static CreateOmsOpenAPIProjectResponse unmarshall(CreateOmsOpenAPIProjectResponse createOmsOpenAPIProjectResponse, UnmarshallerContext _ctx) {
		
		createOmsOpenAPIProjectResponse.setRequestId(_ctx.stringValue("CreateOmsOpenAPIProjectResponse.RequestId"));
		createOmsOpenAPIProjectResponse.setSuccess(_ctx.booleanValue("CreateOmsOpenAPIProjectResponse.Success"));
		createOmsOpenAPIProjectResponse.setCode(_ctx.stringValue("CreateOmsOpenAPIProjectResponse.Code"));
		createOmsOpenAPIProjectResponse.setMessage(_ctx.stringValue("CreateOmsOpenAPIProjectResponse.Message"));
		createOmsOpenAPIProjectResponse.setAdvice(_ctx.stringValue("CreateOmsOpenAPIProjectResponse.Advice"));
		createOmsOpenAPIProjectResponse.setPageNumber(_ctx.integerValue("CreateOmsOpenAPIProjectResponse.PageNumber"));
		createOmsOpenAPIProjectResponse.setPageSize(_ctx.integerValue("CreateOmsOpenAPIProjectResponse.PageSize"));
		createOmsOpenAPIProjectResponse.setTotalCount(_ctx.longValue("CreateOmsOpenAPIProjectResponse.TotalCount"));
		createOmsOpenAPIProjectResponse.setCost(_ctx.stringValue("CreateOmsOpenAPIProjectResponse.Cost"));
		createOmsOpenAPIProjectResponse.setData(_ctx.stringValue("CreateOmsOpenAPIProjectResponse.Data"));

		ErrorDetail errorDetail = new ErrorDetail();
		errorDetail.setCode(_ctx.stringValue("CreateOmsOpenAPIProjectResponse.ErrorDetail.Code"));
		errorDetail.setLevel(_ctx.stringValue("CreateOmsOpenAPIProjectResponse.ErrorDetail.Level"));
		errorDetail.setMessage(_ctx.stringValue("CreateOmsOpenAPIProjectResponse.ErrorDetail.Message"));
		errorDetail.setProposal(_ctx.stringValue("CreateOmsOpenAPIProjectResponse.ErrorDetail.Proposal"));
		createOmsOpenAPIProjectResponse.setErrorDetail(errorDetail);
	 
	 	return createOmsOpenAPIProjectResponse;
	}
}