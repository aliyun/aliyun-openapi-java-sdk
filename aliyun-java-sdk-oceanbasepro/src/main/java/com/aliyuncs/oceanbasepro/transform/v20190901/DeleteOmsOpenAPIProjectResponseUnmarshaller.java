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

import com.aliyuncs.oceanbasepro.model.v20190901.DeleteOmsOpenAPIProjectResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DeleteOmsOpenAPIProjectResponse.ErrorDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteOmsOpenAPIProjectResponseUnmarshaller {

	public static DeleteOmsOpenAPIProjectResponse unmarshall(DeleteOmsOpenAPIProjectResponse deleteOmsOpenAPIProjectResponse, UnmarshallerContext _ctx) {
		
		deleteOmsOpenAPIProjectResponse.setRequestId(_ctx.stringValue("DeleteOmsOpenAPIProjectResponse.RequestId"));
		deleteOmsOpenAPIProjectResponse.setSuccess(_ctx.booleanValue("DeleteOmsOpenAPIProjectResponse.Success"));
		deleteOmsOpenAPIProjectResponse.setCode(_ctx.stringValue("DeleteOmsOpenAPIProjectResponse.Code"));
		deleteOmsOpenAPIProjectResponse.setMessage(_ctx.stringValue("DeleteOmsOpenAPIProjectResponse.Message"));
		deleteOmsOpenAPIProjectResponse.setAdvice(_ctx.stringValue("DeleteOmsOpenAPIProjectResponse.Advice"));
		deleteOmsOpenAPIProjectResponse.setPageNumber(_ctx.integerValue("DeleteOmsOpenAPIProjectResponse.PageNumber"));
		deleteOmsOpenAPIProjectResponse.setPageSize(_ctx.integerValue("DeleteOmsOpenAPIProjectResponse.PageSize"));
		deleteOmsOpenAPIProjectResponse.setTotalCount(_ctx.longValue("DeleteOmsOpenAPIProjectResponse.TotalCount"));
		deleteOmsOpenAPIProjectResponse.setCost(_ctx.stringValue("DeleteOmsOpenAPIProjectResponse.Cost"));
		deleteOmsOpenAPIProjectResponse.setData(_ctx.booleanValue("DeleteOmsOpenAPIProjectResponse.Data"));

		ErrorDetail errorDetail = new ErrorDetail();
		errorDetail.setCode(_ctx.stringValue("DeleteOmsOpenAPIProjectResponse.ErrorDetail.Code"));
		errorDetail.setLevel(_ctx.stringValue("DeleteOmsOpenAPIProjectResponse.ErrorDetail.Level"));
		errorDetail.setMessage(_ctx.stringValue("DeleteOmsOpenAPIProjectResponse.ErrorDetail.Message"));
		errorDetail.setProposal(_ctx.stringValue("DeleteOmsOpenAPIProjectResponse.ErrorDetail.Proposal"));
		deleteOmsOpenAPIProjectResponse.setErrorDetail(errorDetail);
	 
	 	return deleteOmsOpenAPIProjectResponse;
	}
}