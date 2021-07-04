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

import com.aliyuncs.retailadvqa_public.model.v20200515.SearchAudiencesResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.SearchAudiencesResponse.Data;
import com.aliyuncs.retailadvqa_public.model.v20200515.SearchAudiencesResponse.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchAudiencesResponseUnmarshaller {

	public static SearchAudiencesResponse unmarshall(SearchAudiencesResponse searchAudiencesResponse, UnmarshallerContext _ctx) {
		
		searchAudiencesResponse.setRequestId(_ctx.stringValue("SearchAudiencesResponse.RequestId"));
		searchAudiencesResponse.setErrorDesc(_ctx.stringValue("SearchAudiencesResponse.ErrorDesc"));
		searchAudiencesResponse.setTraceId(_ctx.stringValue("SearchAudiencesResponse.TraceId"));
		searchAudiencesResponse.setErrorCode(_ctx.stringValue("SearchAudiencesResponse.ErrorCode"));
		searchAudiencesResponse.setSuccess(_ctx.booleanValue("SearchAudiencesResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("SearchAudiencesResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("SearchAudiencesResponse.Data.PageSize"));
		data.setTotalNum(_ctx.longValue("SearchAudiencesResponse.Data.TotalNum"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchAudiencesResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setDataModelName(_ctx.stringValue("SearchAudiencesResponse.Data.Content["+ i +"].DataModelName"));
			contentItem.setGmtModified(_ctx.longValue("SearchAudiencesResponse.Data.Content["+ i +"].GmtModified"));
			contentItem.setDbName(_ctx.stringValue("SearchAudiencesResponse.Data.Content["+ i +"].DbName"));
			contentItem.setNumberOfAudiences(_ctx.longValue("SearchAudiencesResponse.Data.Content["+ i +"].NumberOfAudiences"));
			contentItem.setErrorMessage(_ctx.stringValue("SearchAudiencesResponse.Data.Content["+ i +"].ErrorMessage"));
			contentItem.setDbType(_ctx.stringValue("SearchAudiencesResponse.Data.Content["+ i +"].DbType"));
			contentItem.setPermission(_ctx.stringValue("SearchAudiencesResponse.Data.Content["+ i +"].Permission"));
			contentItem.setType(_ctx.integerValue("SearchAudiencesResponse.Data.Content["+ i +"].Type"));
			contentItem.setGmtCreate(_ctx.longValue("SearchAudiencesResponse.Data.Content["+ i +"].GmtCreate"));
			contentItem.setVersion(_ctx.stringValue("SearchAudiencesResponse.Data.Content["+ i +"].Version"));
			contentItem.setParentId(_ctx.stringValue("SearchAudiencesResponse.Data.Content["+ i +"].ParentId"));
			contentItem.setModifyUser(_ctx.stringValue("SearchAudiencesResponse.Data.Content["+ i +"].ModifyUser"));
			contentItem.setModifyUserName(_ctx.stringValue("SearchAudiencesResponse.Data.Content["+ i +"].ModifyUserName"));
			contentItem.setLatestDataModifyStatus(_ctx.integerValue("SearchAudiencesResponse.Data.Content["+ i +"].LatestDataModifyStatus"));
			contentItem.set_Public(_ctx.booleanValue("SearchAudiencesResponse.Data.Content["+ i +"].Public"));
			contentItem.setSubtype(_ctx.integerValue("SearchAudiencesResponse.Data.Content["+ i +"].Subtype"));
			contentItem.setName(_ctx.stringValue("SearchAudiencesResponse.Data.Content["+ i +"].Name"));
			contentItem.setAutoUpdateData(_ctx.booleanValue("SearchAudiencesResponse.Data.Content["+ i +"].AutoUpdateData"));
			contentItem.setCreateUser(_ctx.stringValue("SearchAudiencesResponse.Data.Content["+ i +"].CreateUser"));
			contentItem.setId(_ctx.stringValue("SearchAudiencesResponse.Data.Content["+ i +"].Id"));
			contentItem.setLatestDataModifyTime(_ctx.longValue("SearchAudiencesResponse.Data.Content["+ i +"].LatestDataModifyTime"));
			contentItem.setDesc(_ctx.stringValue("SearchAudiencesResponse.Data.Content["+ i +"].Desc"));

			content.add(contentItem);
		}
		data.setContent(content);
		searchAudiencesResponse.setData(data);
	 
	 	return searchAudiencesResponse;
	}
}