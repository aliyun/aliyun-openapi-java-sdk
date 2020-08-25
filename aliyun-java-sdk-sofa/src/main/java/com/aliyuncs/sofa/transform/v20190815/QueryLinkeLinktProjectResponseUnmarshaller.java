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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktProjectResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktProjectResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktProjectResponseUnmarshaller {

	public static QueryLinkeLinktProjectResponse unmarshall(QueryLinkeLinktProjectResponse queryLinkeLinktProjectResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktProjectResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktProjectResponse.RequestId"));
		queryLinkeLinktProjectResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktProjectResponse.ResultCode"));
		queryLinkeLinktProjectResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktProjectResponse.ResultMessage"));
		queryLinkeLinktProjectResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktProjectResponse.ErrorCode"));
		queryLinkeLinktProjectResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktProjectResponse.ErrorMessage"));
		queryLinkeLinktProjectResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktProjectResponse.ResponseStatusCode"));
		queryLinkeLinktProjectResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktProjectResponse.Success"));

		Data data = new Data();
		data.setArchive(_ctx.booleanValue("QueryLinkeLinktProjectResponse.Data.Archive"));
		data.setAsPublic(_ctx.booleanValue("QueryLinkeLinktProjectResponse.Data.AsPublic"));
		data.setCreatedAt(_ctx.longValue("QueryLinkeLinktProjectResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("QueryLinkeLinktProjectResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("QueryLinkeLinktProjectResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("QueryLinkeLinktProjectResponse.Data.Description"));
		data.setId(_ctx.longValue("QueryLinkeLinktProjectResponse.Data.Id"));
		data.setLink(_ctx.stringValue("QueryLinkeLinktProjectResponse.Data.Link"));
		data.setName(_ctx.stringValue("QueryLinkeLinktProjectResponse.Data.Name"));
		data.setNotice(_ctx.stringValue("QueryLinkeLinktProjectResponse.Data.Notice"));
		data.setParentProject(_ctx.stringValue("QueryLinkeLinktProjectResponse.Data.ParentProject"));
		data.setParentSign(_ctx.stringValue("QueryLinkeLinktProjectResponse.Data.ParentSign"));
		data.setSign(_ctx.stringValue("QueryLinkeLinktProjectResponse.Data.Sign"));
		data.setSignPath(_ctx.stringValue("QueryLinkeLinktProjectResponse.Data.SignPath"));
		data.setUpdatedAt(_ctx.longValue("QueryLinkeLinktProjectResponse.Data.UpdatedAt"));
		data.setUrl(_ctx.stringValue("QueryLinkeLinktProjectResponse.Data.Url"));

		List<String> adminMembers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktProjectResponse.Data.AdminMembers.Length"); i++) {
			adminMembers.add(_ctx.stringValue("QueryLinkeLinktProjectResponse.Data.AdminMembers["+ i +"]"));
		}
		data.setAdminMembers(adminMembers);

		List<String> customFieldList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktProjectResponse.Data.CustomFieldList.Length"); i++) {
			customFieldList.add(_ctx.stringValue("QueryLinkeLinktProjectResponse.Data.CustomFieldList["+ i +"]"));
		}
		data.setCustomFieldList(customFieldList);

		List<String> memberList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktProjectResponse.Data.MemberList.Length"); i++) {
			memberList.add(_ctx.stringValue("QueryLinkeLinktProjectResponse.Data.MemberList["+ i +"]"));
		}
		data.setMemberList(memberList);

		List<String> statusList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktProjectResponse.Data.StatusList.Length"); i++) {
			statusList.add(_ctx.stringValue("QueryLinkeLinktProjectResponse.Data.StatusList["+ i +"]"));
		}
		data.setStatusList(statusList);

		List<String> templateList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktProjectResponse.Data.TemplateList.Length"); i++) {
			templateList.add(_ctx.stringValue("QueryLinkeLinktProjectResponse.Data.TemplateList["+ i +"]"));
		}
		data.setTemplateList(templateList);
		queryLinkeLinktProjectResponse.setData(data);
	 
	 	return queryLinkeLinktProjectResponse;
	}
}