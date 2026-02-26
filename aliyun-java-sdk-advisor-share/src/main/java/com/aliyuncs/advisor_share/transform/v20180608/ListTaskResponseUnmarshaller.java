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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.ListTaskResponse;
import com.aliyuncs.advisor_share.model.v20180608.ListTaskResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.ListTaskResponse.Data.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskResponseUnmarshaller {

	public static ListTaskResponse unmarshall(ListTaskResponse listTaskResponse, UnmarshallerContext _ctx) {
		
		listTaskResponse.setSuccess(_ctx.booleanValue("ListTaskResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.longValue("ListTaskResponse.Data.PageNumber"));
		data.setPageSize(_ctx.longValue("ListTaskResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListTaskResponse.Data.Total"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskResponse.Data.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setEndDate(_ctx.stringValue("ListTaskResponse.Data.DataList["+ i +"].EndDate"));
			dataListItem.setGmtCreate(_ctx.stringValue("ListTaskResponse.Data.DataList["+ i +"].GmtCreate"));
			dataListItem.setGmtModified(_ctx.stringValue("ListTaskResponse.Data.DataList["+ i +"].GmtModified"));
			dataListItem.setId(_ctx.longValue("ListTaskResponse.Data.DataList["+ i +"].Id"));
			dataListItem.setName(_ctx.stringValue("ListTaskResponse.Data.DataList["+ i +"].Name"));
			dataListItem.setStartDate(_ctx.stringValue("ListTaskResponse.Data.DataList["+ i +"].StartDate"));

			List<String> userIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTaskResponse.Data.DataList["+ i +"].UserIds.Length"); j++) {
				userIds.add(_ctx.stringValue("ListTaskResponse.Data.DataList["+ i +"].UserIds["+ j +"]"));
			}
			dataListItem.setUserIds(userIds);

			dataList.add(dataListItem);
		}
		data.setDataList(dataList);
		listTaskResponse.setData(data);
	 
	 	return listTaskResponse;
	}
}