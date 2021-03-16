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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import com.aliyuncs.cccxspaceinner.model.v20191227.GetTicketResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.GetTicketResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTicketResponseUnmarshaller {

	public static GetTicketResponse unmarshall(GetTicketResponse getTicketResponse, UnmarshallerContext _ctx) {
		
		getTicketResponse.setRequestId(_ctx.stringValue("GetTicketResponse.RequestId"));
		getTicketResponse.setSuccess(_ctx.booleanValue("GetTicketResponse.Success"));
		getTicketResponse.setCode(_ctx.stringValue("GetTicketResponse.Code"));
		getTicketResponse.setMessage(_ctx.stringValue("GetTicketResponse.Message"));

		Data data = new Data();
		data.setId(_ctx.stringValue("GetTicketResponse.Data.Id"));
		data.setQuestionInfo(_ctx.stringValue("GetTicketResponse.Data.QuestionInfo"));
		data.setCaseStatus(_ctx.integerValue("GetTicketResponse.Data.CaseStatus"));
		data.setSrType(_ctx.stringValue("GetTicketResponse.Data.SrType"));
		data.setExtAttrs(_ctx.stringValue("GetTicketResponse.Data.ExtAttrs"));
		data.setGmtCreate(_ctx.longValue("GetTicketResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.longValue("GetTicketResponse.Data.GmtModified"));
		data.setOwnerName(_ctx.stringValue("GetTicketResponse.Data.OwnerName"));
		data.setResponsible(_ctx.longValue("GetTicketResponse.Data.Responsible"));
		data.setMemberName(_ctx.stringValue("GetTicketResponse.Data.MemberName"));
		data.setSopCateId(_ctx.longValue("GetTicketResponse.Data.SopCateId"));
		data.setDataId(_ctx.longValue("GetTicketResponse.Data.DataId"));
		data.setMemberType(_ctx.integerValue("GetTicketResponse.Data.MemberType"));
		data.setRefCaseId(_ctx.longValue("GetTicketResponse.Data.RefCaseId"));
		data.setDepartmentId(_ctx.longValue("GetTicketResponse.Data.DepartmentId"));
		data.setBuId(_ctx.longValue("GetTicketResponse.Data.BuId"));
		data.setTouchId(_ctx.longValue("GetTicketResponse.Data.TouchId"));
		data.setTemplateId(_ctx.longValue("GetTicketResponse.Data.TemplateId"));
		data.setFormId(_ctx.longValue("GetTicketResponse.Data.FormId"));
		data.setBizId(_ctx.stringValue("GetTicketResponse.Data.BizId"));
		data.setFormCode(_ctx.stringValue("GetTicketResponse.Data.FormCode"));
		data.setFromInfo(_ctx.stringValue("GetTicketResponse.Data.FromInfo"));
		data.setCreateMode(_ctx.stringValue("GetTicketResponse.Data.CreateMode"));
		data.setContactId(_ctx.longValue("GetTicketResponse.Data.ContactId"));
		data.setFeedback(_ctx.stringValue("GetTicketResponse.Data.Feedback"));
		getTicketResponse.setData(data);
	 
	 	return getTicketResponse;
	}
}