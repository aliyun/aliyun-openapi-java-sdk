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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyvmsapi.model.v20170525.ListCallTaskDetailResponse;
import com.aliyuncs.dyvmsapi.model.v20170525.ListCallTaskDetailResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCallTaskDetailResponseUnmarshaller {

	public static ListCallTaskDetailResponse unmarshall(ListCallTaskDetailResponse listCallTaskDetailResponse, UnmarshallerContext _ctx) {
		
		listCallTaskDetailResponse.setRequestId(_ctx.stringValue("ListCallTaskDetailResponse.RequestId"));
		listCallTaskDetailResponse.setCode(_ctx.stringValue("ListCallTaskDetailResponse.Code"));
		listCallTaskDetailResponse.setTotal(_ctx.longValue("ListCallTaskDetailResponse.Total"));
		listCallTaskDetailResponse.setTotalPage(_ctx.longValue("ListCallTaskDetailResponse.TotalPage"));
		listCallTaskDetailResponse.setPageSize(_ctx.longValue("ListCallTaskDetailResponse.PageSize"));
		listCallTaskDetailResponse.setPageNumber(_ctx.longValue("ListCallTaskDetailResponse.PageNumber"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCallTaskDetailResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCaller(_ctx.stringValue("ListCallTaskDetailResponse.Data["+ i +"].Caller"));
			dataItem.setCalledNum(_ctx.stringValue("ListCallTaskDetailResponse.Data["+ i +"].CalledNum"));
			dataItem.setStatus(_ctx.stringValue("ListCallTaskDetailResponse.Data["+ i +"].Status"));
			dataItem.setDuration(_ctx.longValue("ListCallTaskDetailResponse.Data["+ i +"].Duration"));
			dataItem.setId(_ctx.longValue("ListCallTaskDetailResponse.Data["+ i +"].Id"));

			data.add(dataItem);
		}
		listCallTaskDetailResponse.setData(data);
	 
	 	return listCallTaskDetailResponse;
	}
}