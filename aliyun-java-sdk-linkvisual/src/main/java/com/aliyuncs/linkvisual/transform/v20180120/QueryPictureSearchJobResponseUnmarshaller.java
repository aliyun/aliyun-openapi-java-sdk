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

import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchJobResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchJobResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryPictureSearchJobResponse.Data.PageDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPictureSearchJobResponseUnmarshaller {

	public static QueryPictureSearchJobResponse unmarshall(QueryPictureSearchJobResponse queryPictureSearchJobResponse, UnmarshallerContext _ctx) {
		
		queryPictureSearchJobResponse.setRequestId(_ctx.stringValue("QueryPictureSearchJobResponse.RequestId"));
		queryPictureSearchJobResponse.setCode(_ctx.stringValue("QueryPictureSearchJobResponse.Code"));
		queryPictureSearchJobResponse.setErrorMessage(_ctx.stringValue("QueryPictureSearchJobResponse.ErrorMessage"));
		queryPictureSearchJobResponse.setSuccess(_ctx.booleanValue("QueryPictureSearchJobResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("QueryPictureSearchJobResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryPictureSearchJobResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("QueryPictureSearchJobResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("QueryPictureSearchJobResponse.Data.PageCount"));

		List<PageDataItem> pageData = new ArrayList<PageDataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryPictureSearchJobResponse.Data.PageData.Length"); i++) {
			PageDataItem pageDataItem = new PageDataItem();
			pageDataItem.setEndTime(_ctx.longValue("QueryPictureSearchJobResponse.Data.PageData["+ i +"].EndTime"));
			pageDataItem.setStartTime(_ctx.longValue("QueryPictureSearchJobResponse.Data.PageData["+ i +"].StartTime"));
			pageDataItem.setJobStatus(_ctx.integerValue("QueryPictureSearchJobResponse.Data.PageData["+ i +"].JobStatus"));
			pageDataItem.setSearchPicUrl(_ctx.stringValue("QueryPictureSearchJobResponse.Data.PageData["+ i +"].SearchPicUrl"));
			pageDataItem.setCreateTime(_ctx.longValue("QueryPictureSearchJobResponse.Data.PageData["+ i +"].CreateTime"));
			pageDataItem.setJobId(_ctx.stringValue("QueryPictureSearchJobResponse.Data.PageData["+ i +"].JobId"));
			pageDataItem.setThreshold(_ctx.floatValue("QueryPictureSearchJobResponse.Data.PageData["+ i +"].Threshold"));

			pageData.add(pageDataItem);
		}
		data.setPageData(pageData);
		queryPictureSearchJobResponse.setData(data);
	 
	 	return queryPictureSearchJobResponse;
	}
}