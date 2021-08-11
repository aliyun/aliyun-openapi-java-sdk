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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.SearchDirectoriesResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.SearchDirectoriesResponse.Data;
import com.aliyuncs.retailadvqa_public.model.v20200515.SearchDirectoriesResponse.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchDirectoriesResponseUnmarshaller {

	public static SearchDirectoriesResponse unmarshall(SearchDirectoriesResponse searchDirectoriesResponse, UnmarshallerContext _ctx) {
		
		searchDirectoriesResponse.setRequestId(_ctx.stringValue("SearchDirectoriesResponse.RequestId"));
		searchDirectoriesResponse.setErrorDesc(_ctx.stringValue("SearchDirectoriesResponse.ErrorDesc"));
		searchDirectoriesResponse.setTraceId(_ctx.stringValue("SearchDirectoriesResponse.TraceId"));
		searchDirectoriesResponse.setErrorCode(_ctx.stringValue("SearchDirectoriesResponse.ErrorCode"));
		searchDirectoriesResponse.setSuccess(_ctx.booleanValue("SearchDirectoriesResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.stringValue("SearchDirectoriesResponse.Data.PageNum"));
		data.setPageSize(_ctx.stringValue("SearchDirectoriesResponse.Data.PageSize"));
		data.setTotalNum(_ctx.stringValue("SearchDirectoriesResponse.Data.TotalNum"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchDirectoriesResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setGmtCreate(_ctx.longValue("SearchDirectoriesResponse.Data.Content["+ i +"].GmtCreate"));
			contentItem.setGmtModified(_ctx.longValue("SearchDirectoriesResponse.Data.Content["+ i +"].GmtModified"));
			contentItem.setName(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].Name"));
			contentItem.setId(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].Id"));
			contentItem.setDbName(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].DbName"));
			contentItem.setCreateUserName(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].CreateUserName"));
			contentItem.setType(_ctx.integerValue("SearchDirectoriesResponse.Data.Content["+ i +"].Type"));
			contentItem.setModifyUser(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].ModifyUser"));
			contentItem.setModifyUserName(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].ModifyUserName"));
			contentItem.setDefaultCube(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].DefaultCube"));
			contentItem.setSubtype(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].Subtype"));
			contentItem.setAiplSubType(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].AiplSubType"));
			contentItem.setTypeSource(_ctx.integerValue("SearchDirectoriesResponse.Data.Content["+ i +"].TypeSource"));
			contentItem.setFactTable(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].FactTable"));
			contentItem.setWorkspaceId(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].WorkspaceId"));
			contentItem.setDsId(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].DsId"));
			contentItem.setErrorMessage(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].ErrorMessage"));
			contentItem.setDbType(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].DbType"));
			contentItem.setPermission(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].Permission"));
			contentItem.setFuseCube(_ctx.booleanValue("SearchDirectoriesResponse.Data.Content["+ i +"].FuseCube"));
			contentItem.setVersion(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].Version"));
			contentItem.setParentId(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].ParentId"));
			contentItem.setIsMark(_ctx.integerValue("SearchDirectoriesResponse.Data.Content["+ i +"].IsMark"));
			contentItem.setDesc(_ctx.stringValue("SearchDirectoriesResponse.Data.Content["+ i +"].Desc"));

			content.add(contentItem);
		}
		data.setContent(content);
		searchDirectoriesResponse.setData(data);
	 
	 	return searchDirectoriesResponse;
	}
}