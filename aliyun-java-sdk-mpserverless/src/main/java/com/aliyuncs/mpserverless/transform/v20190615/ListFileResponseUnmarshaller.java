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

package com.aliyuncs.mpserverless.transform.v20190615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpserverless.model.v20190615.ListFileResponse;
import com.aliyuncs.mpserverless.model.v20190615.ListFileResponse.DataListItem;
import com.aliyuncs.mpserverless.model.v20190615.ListFileResponse.Paginator;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFileResponseUnmarshaller {

	public static ListFileResponse unmarshall(ListFileResponse listFileResponse, UnmarshallerContext _ctx) {
		
		listFileResponse.setRequestId(_ctx.stringValue("ListFileResponse.RequestId"));
		listFileResponse.setHttpStatusCode(_ctx.stringValue("ListFileResponse.HttpStatusCode"));
		listFileResponse.setSuccess(_ctx.booleanValue("ListFileResponse.Success"));
		listFileResponse.setCode(_ctx.stringValue("ListFileResponse.Code"));
		listFileResponse.setMessage(_ctx.stringValue("ListFileResponse.Message"));

		Paginator paginator = new Paginator();
		paginator.setPageCount(_ctx.integerValue("ListFileResponse.Paginator.PageCount"));
		paginator.setPageNum(_ctx.integerValue("ListFileResponse.Paginator.PageNum"));
		paginator.setPageSize(_ctx.integerValue("ListFileResponse.Paginator.PageSize"));
		paginator.setTotal(_ctx.integerValue("ListFileResponse.Paginator.Total"));
		listFileResponse.setPaginator(paginator);

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFileResponse.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setId(_ctx.stringValue("ListFileResponse.DataList["+ i +"].Id"));
			dataListItem.setName(_ctx.stringValue("ListFileResponse.DataList["+ i +"].Name"));
			dataListItem.setSize(_ctx.integerValue("ListFileResponse.DataList["+ i +"].Size"));
			dataListItem.setType(_ctx.stringValue("ListFileResponse.DataList["+ i +"].Type"));
			dataListItem.setUrl(_ctx.stringValue("ListFileResponse.DataList["+ i +"].Url"));
			dataListItem.setGmtCreate(_ctx.stringValue("ListFileResponse.DataList["+ i +"].GmtCreate"));
			dataListItem.setGmtModified(_ctx.stringValue("ListFileResponse.DataList["+ i +"].GmtModified"));

			dataList.add(dataListItem);
		}
		listFileResponse.setDataList(dataList);
	 
	 	return listFileResponse;
	}
}