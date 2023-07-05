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

import com.aliyuncs.advisor_share.model.v20180608.ListProductResponse;
import com.aliyuncs.advisor_share.model.v20180608.ListProductResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.ListProductResponse.Data.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProductResponseUnmarshaller {

	public static ListProductResponse unmarshall(ListProductResponse listProductResponse, UnmarshallerContext _ctx) {
		
		listProductResponse.setSuccess(_ctx.booleanValue("ListProductResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.longValue("ListProductResponse.Data.PageNumber"));
		data.setPageSize(_ctx.longValue("ListProductResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListProductResponse.Data.Total"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProductResponse.Data.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setCode(_ctx.stringValue("ListProductResponse.Data.DataList["+ i +"].Code"));
			dataListItem.setId(_ctx.stringValue("ListProductResponse.Data.DataList["+ i +"].Id"));
			dataListItem.setName(_ctx.stringValue("ListProductResponse.Data.DataList["+ i +"].Name"));

			dataList.add(dataListItem);
		}
		data.setDataList(dataList);
		listProductResponse.setData(data);
	 
	 	return listProductResponse;
	}
}