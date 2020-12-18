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

import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchDevicesResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchDevicesResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchDevicesResponse.Data.SearchData;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPictureSearchDevicesResponseUnmarshaller {

	public static QueryPictureSearchDevicesResponse unmarshall(QueryPictureSearchDevicesResponse queryPictureSearchDevicesResponse, UnmarshallerContext _ctx) {
		
		queryPictureSearchDevicesResponse.setRequestId(_ctx.stringValue("QueryPictureSearchDevicesResponse.RequestId"));
		queryPictureSearchDevicesResponse.setSuccess(_ctx.booleanValue("QueryPictureSearchDevicesResponse.Success"));
		queryPictureSearchDevicesResponse.setCode(_ctx.stringValue("QueryPictureSearchDevicesResponse.Code"));
		queryPictureSearchDevicesResponse.setErrorMessage(_ctx.stringValue("QueryPictureSearchDevicesResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryPictureSearchDevicesResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("QueryPictureSearchDevicesResponse.Data.PageCount"));
		data.setCurrentPage(_ctx.integerValue("QueryPictureSearchDevicesResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryPictureSearchDevicesResponse.Data.PageSize"));

		List<SearchData> pageData = new ArrayList<SearchData>();
		for (int i = 0; i < _ctx.lengthValue("QueryPictureSearchDevicesResponse.Data.PageData.Length"); i++) {
			SearchData searchData = new SearchData();
			searchData.setIotId(_ctx.stringValue("QueryPictureSearchDevicesResponse.Data.PageData["+ i +"].IotId"));
			searchData.setNickName(_ctx.stringValue("QueryPictureSearchDevicesResponse.Data.PageData["+ i +"].NickName"));

			pageData.add(searchData);
		}
		data.setPageData(pageData);
		queryPictureSearchDevicesResponse.setData(data);
	 
	 	return queryPictureSearchDevicesResponse;
	}
}