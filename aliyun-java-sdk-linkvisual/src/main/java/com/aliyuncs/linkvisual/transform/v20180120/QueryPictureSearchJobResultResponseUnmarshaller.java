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

import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchJobResultResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchJobResultResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchJobResultResponse.Data.SearchData;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPictureSearchJobResultResponseUnmarshaller {

	public static QueryPictureSearchJobResultResponse unmarshall(QueryPictureSearchJobResultResponse queryPictureSearchJobResultResponse, UnmarshallerContext _ctx) {
		
		queryPictureSearchJobResultResponse.setRequestId(_ctx.stringValue("QueryPictureSearchJobResultResponse.RequestId"));
		queryPictureSearchJobResultResponse.setSuccess(_ctx.booleanValue("QueryPictureSearchJobResultResponse.Success"));
		queryPictureSearchJobResultResponse.setCode(_ctx.stringValue("QueryPictureSearchJobResultResponse.Code"));
		queryPictureSearchJobResultResponse.setErrorMessage(_ctx.stringValue("QueryPictureSearchJobResultResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryPictureSearchJobResultResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("QueryPictureSearchJobResultResponse.Data.PageCount"));
		data.setCurrentPage(_ctx.integerValue("QueryPictureSearchJobResultResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryPictureSearchJobResultResponse.Data.PageSize"));

		List<SearchData> pageData = new ArrayList<SearchData>();
		for (int i = 0; i < _ctx.lengthValue("QueryPictureSearchJobResultResponse.Data.PageData.Length"); i++) {
			SearchData searchData = new SearchData();
			searchData.setVectorId(_ctx.stringValue("QueryPictureSearchJobResultResponse.Data.PageData["+ i +"].VectorId"));
			searchData.setEventTime(_ctx.longValue("QueryPictureSearchJobResultResponse.Data.PageData["+ i +"].EventTime"));
			searchData.setThreshold(_ctx.floatValue("QueryPictureSearchJobResultResponse.Data.PageData["+ i +"].Threshold"));
			searchData.setPicUrl(_ctx.stringValue("QueryPictureSearchJobResultResponse.Data.PageData["+ i +"].PicUrl"));
			searchData.setIotId(_ctx.stringValue("QueryPictureSearchJobResultResponse.Data.PageData["+ i +"].IotId"));
			searchData.setGatewayIotId(_ctx.stringValue("QueryPictureSearchJobResultResponse.Data.PageData["+ i +"].GatewayIotId"));
			searchData.setDeviceNickName(_ctx.stringValue("QueryPictureSearchJobResultResponse.Data.PageData["+ i +"].DeviceNickName"));

			pageData.add(searchData);
		}
		data.setPageData(pageData);
		queryPictureSearchJobResultResponse.setData(data);
	 
	 	return queryPictureSearchJobResultResponse;
	}
}