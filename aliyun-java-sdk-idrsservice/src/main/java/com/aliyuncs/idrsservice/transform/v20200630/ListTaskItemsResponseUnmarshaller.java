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

package com.aliyuncs.idrsservice.transform.v20200630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idrsservice.model.v20200630.ListTaskItemsResponse;
import com.aliyuncs.idrsservice.model.v20200630.ListTaskItemsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskItemsResponseUnmarshaller {

	public static ListTaskItemsResponse unmarshall(ListTaskItemsResponse listTaskItemsResponse, UnmarshallerContext _ctx) {
		
		listTaskItemsResponse.setRequestId(_ctx.stringValue("ListTaskItemsResponse.RequestId"));
		listTaskItemsResponse.setCode(_ctx.stringValue("ListTaskItemsResponse.Code"));
		listTaskItemsResponse.setMessage(_ctx.stringValue("ListTaskItemsResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskItemsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatedAt(_ctx.stringValue("ListTaskItemsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setMessage(_ctx.stringValue("ListTaskItemsResponse.Data["+ i +"].Message"));
			dataItem.setName(_ctx.stringValue("ListTaskItemsResponse.Data["+ i +"].Name"));
			dataItem.setOutput(_ctx.stringValue("ListTaskItemsResponse.Data["+ i +"].Output"));
			dataItem.setSegmentSeq(_ctx.longValue("ListTaskItemsResponse.Data["+ i +"].SegmentSeq"));
			dataItem.setStatus(_ctx.stringValue("ListTaskItemsResponse.Data["+ i +"].Status"));

			data.add(dataItem);
		}
		listTaskItemsResponse.setData(data);
	 
	 	return listTaskItemsResponse;
	}
}