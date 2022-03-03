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

package com.aliyuncs.companyreg.transform.v20190508;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20190508.QueryIcpApplicationListResponse;
import com.aliyuncs.companyreg.model.v20190508.QueryIcpApplicationListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIcpApplicationListResponseUnmarshaller {

	public static QueryIcpApplicationListResponse unmarshall(QueryIcpApplicationListResponse queryIcpApplicationListResponse, UnmarshallerContext _ctx) {
		
		queryIcpApplicationListResponse.setRequestId(_ctx.stringValue("QueryIcpApplicationListResponse.RequestId"));
		queryIcpApplicationListResponse.setCurrentPageNum(_ctx.longValue("QueryIcpApplicationListResponse.CurrentPageNum"));
		queryIcpApplicationListResponse.setTotalPageNum(_ctx.longValue("QueryIcpApplicationListResponse.TotalPageNum"));
		queryIcpApplicationListResponse.setPageSize(_ctx.longValue("QueryIcpApplicationListResponse.PageSize"));
		queryIcpApplicationListResponse.setTotalItemNum(_ctx.longValue("QueryIcpApplicationListResponse.TotalItemNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryIcpApplicationListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBizId(_ctx.stringValue("QueryIcpApplicationListResponse.Data["+ i +"].BizId"));
			dataItem.setType(_ctx.longValue("QueryIcpApplicationListResponse.Data["+ i +"].Type"));
			dataItem.setMobile(_ctx.stringValue("QueryIcpApplicationListResponse.Data["+ i +"].Mobile"));

			data.add(dataItem);
		}
		queryIcpApplicationListResponse.setData(data);
	 
	 	return queryIcpApplicationListResponse;
	}
}