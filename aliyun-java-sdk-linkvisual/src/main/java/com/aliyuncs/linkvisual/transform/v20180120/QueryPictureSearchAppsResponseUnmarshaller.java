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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchAppsResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchAppsResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchAppsResponse.Data.PageDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPictureSearchAppsResponseUnmarshaller {

	public static QueryPictureSearchAppsResponse unmarshall(QueryPictureSearchAppsResponse queryPictureSearchAppsResponse, UnmarshallerContext _ctx) {
		
		queryPictureSearchAppsResponse.setRequestId(_ctx.stringValue("QueryPictureSearchAppsResponse.RequestId"));
		queryPictureSearchAppsResponse.setSuccess(_ctx.booleanValue("QueryPictureSearchAppsResponse.Success"));
		queryPictureSearchAppsResponse.setCode(_ctx.stringValue("QueryPictureSearchAppsResponse.Code"));
		queryPictureSearchAppsResponse.setErrorMessage(_ctx.stringValue("QueryPictureSearchAppsResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryPictureSearchAppsResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("QueryPictureSearchAppsResponse.Data.PageCount"));
		data.setCurrentPage(_ctx.integerValue("QueryPictureSearchAppsResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryPictureSearchAppsResponse.Data.PageSize"));

		List<PageDataItem> pageData = new ArrayList<PageDataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryPictureSearchAppsResponse.Data.PageData.Length"); i++) {
			PageDataItem pageDataItem = new PageDataItem();
			pageDataItem.setTenantId(_ctx.stringValue("QueryPictureSearchAppsResponse.Data.PageData["+ i +"].TenantId"));
			pageDataItem.setAppInstanceId(_ctx.stringValue("QueryPictureSearchAppsResponse.Data.PageData["+ i +"].AppInstanceId"));
			pageDataItem.setAppTemplateId(_ctx.stringValue("QueryPictureSearchAppsResponse.Data.PageData["+ i +"].AppTemplateId"));
			pageDataItem.setVersion(_ctx.stringValue("QueryPictureSearchAppsResponse.Data.PageData["+ i +"].Version"));
			pageDataItem.setLevel(_ctx.integerValue("QueryPictureSearchAppsResponse.Data.PageData["+ i +"].Level"));
			pageDataItem.setName(_ctx.stringValue("QueryPictureSearchAppsResponse.Data.PageData["+ i +"].Name"));
			pageDataItem.setCreateTime(_ctx.longValue("QueryPictureSearchAppsResponse.Data.PageData["+ i +"].CreateTime"));
			pageDataItem.setModifiedTime(_ctx.longValue("QueryPictureSearchAppsResponse.Data.PageData["+ i +"].ModifiedTime"));
			pageDataItem.setDescription(_ctx.stringValue("QueryPictureSearchAppsResponse.Data.PageData["+ i +"].Description"));

			pageData.add(pageDataItem);
		}
		data.setPageData(pageData);
		queryPictureSearchAppsResponse.setData(data);
	 
	 	return queryPictureSearchAppsResponse;
	}
}