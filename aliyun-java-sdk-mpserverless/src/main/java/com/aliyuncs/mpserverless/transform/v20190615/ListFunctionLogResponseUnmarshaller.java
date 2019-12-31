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

import com.aliyuncs.mpserverless.model.v20190615.ListFunctionLogResponse;
import com.aliyuncs.mpserverless.model.v20190615.ListFunctionLogResponse.DataListItem;
import com.aliyuncs.mpserverless.model.v20190615.ListFunctionLogResponse.Paginator;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFunctionLogResponseUnmarshaller {

	public static ListFunctionLogResponse unmarshall(ListFunctionLogResponse listFunctionLogResponse, UnmarshallerContext _ctx) {
		
		listFunctionLogResponse.setRequestId(_ctx.stringValue("ListFunctionLogResponse.RequestId"));
		listFunctionLogResponse.setHttpStatusCode(_ctx.stringValue("ListFunctionLogResponse.HttpStatusCode"));
		listFunctionLogResponse.setSuccess(_ctx.booleanValue("ListFunctionLogResponse.Success"));
		listFunctionLogResponse.setCode(_ctx.stringValue("ListFunctionLogResponse.Code"));
		listFunctionLogResponse.setMessage(_ctx.stringValue("ListFunctionLogResponse.Message"));

		Paginator paginator = new Paginator();
		paginator.setPageNum(_ctx.integerValue("ListFunctionLogResponse.Paginator.PageNum"));
		paginator.setPageSize(_ctx.integerValue("ListFunctionLogResponse.Paginator.PageSize"));
		paginator.setPageCount(_ctx.integerValue("ListFunctionLogResponse.Paginator.PageCount"));
		paginator.setTotal(_ctx.integerValue("ListFunctionLogResponse.Paginator.Total"));
		listFunctionLogResponse.setPaginator(paginator);

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFunctionLogResponse.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setSpaceId(_ctx.stringValue("ListFunctionLogResponse.DataList["+ i +"].SpaceId"));
			dataListItem.setFunctionName(_ctx.stringValue("ListFunctionLogResponse.DataList["+ i +"].FunctionName"));
			dataListItem.setRequestId(_ctx.stringValue("ListFunctionLogResponse.DataList["+ i +"].RequestId"));
			dataListItem.setStatus(_ctx.stringValue("ListFunctionLogResponse.DataList["+ i +"].Status"));

			List<String> timestamps = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListFunctionLogResponse.DataList["+ i +"].Timestamps.Length"); j++) {
				timestamps.add(_ctx.stringValue("ListFunctionLogResponse.DataList["+ i +"].Timestamps["+ j +"]"));
			}
			dataListItem.setTimestamps(timestamps);

			List<String> levels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListFunctionLogResponse.DataList["+ i +"].Levels.Length"); j++) {
				levels.add(_ctx.stringValue("ListFunctionLogResponse.DataList["+ i +"].Levels["+ j +"]"));
			}
			dataListItem.setLevels(levels);

			List<String> contents = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListFunctionLogResponse.DataList["+ i +"].Contents.Length"); j++) {
				contents.add(_ctx.stringValue("ListFunctionLogResponse.DataList["+ i +"].Contents["+ j +"]"));
			}
			dataListItem.setContents(contents);

			dataList.add(dataListItem);
		}
		listFunctionLogResponse.setDataList(dataList);
	 
	 	return listFunctionLogResponse;
	}
}