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

import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchAiboxesResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchAiboxesResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchAiboxesResponse.Data.SearchData;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPictureSearchAiboxesResponseUnmarshaller {

	public static QueryPictureSearchAiboxesResponse unmarshall(QueryPictureSearchAiboxesResponse queryPictureSearchAiboxesResponse, UnmarshallerContext _ctx) {
		
		queryPictureSearchAiboxesResponse.setRequestId(_ctx.stringValue("QueryPictureSearchAiboxesResponse.RequestId"));
		queryPictureSearchAiboxesResponse.setSuccess(_ctx.booleanValue("QueryPictureSearchAiboxesResponse.Success"));
		queryPictureSearchAiboxesResponse.setCode(_ctx.stringValue("QueryPictureSearchAiboxesResponse.Code"));
		queryPictureSearchAiboxesResponse.setErrorMessage(_ctx.stringValue("QueryPictureSearchAiboxesResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryPictureSearchAiboxesResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("QueryPictureSearchAiboxesResponse.Data.PageCount"));
		data.setCurrentPage(_ctx.integerValue("QueryPictureSearchAiboxesResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryPictureSearchAiboxesResponse.Data.PageSize"));

		List<SearchData> pageData = new ArrayList<SearchData>();
		for (int i = 0; i < _ctx.lengthValue("QueryPictureSearchAiboxesResponse.Data.PageData.Length"); i++) {
			SearchData searchData = new SearchData();
			searchData.setIotId(_ctx.stringValue("QueryPictureSearchAiboxesResponse.Data.PageData["+ i +"].IotId"));
			searchData.setNickName(_ctx.stringValue("QueryPictureSearchAiboxesResponse.Data.PageData["+ i +"].NickName"));

			pageData.add(searchData);
		}
		data.setPageData(pageData);
		queryPictureSearchAiboxesResponse.setData(data);
	 
	 	return queryPictureSearchAiboxesResponse;
	}
}