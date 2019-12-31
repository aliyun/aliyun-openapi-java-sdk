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

import com.aliyuncs.mpserverless.model.v20190615.ListFunctionResponse;
import com.aliyuncs.mpserverless.model.v20190615.ListFunctionResponse.DataListItem;
import com.aliyuncs.mpserverless.model.v20190615.ListFunctionResponse.DataListItem.Spec;
import com.aliyuncs.mpserverless.model.v20190615.ListFunctionResponse.Paginator;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFunctionResponseUnmarshaller {

	public static ListFunctionResponse unmarshall(ListFunctionResponse listFunctionResponse, UnmarshallerContext _ctx) {
		
		listFunctionResponse.setRequestId(_ctx.stringValue("ListFunctionResponse.RequestId"));
		listFunctionResponse.setHttpStatusCode(_ctx.stringValue("ListFunctionResponse.HttpStatusCode"));
		listFunctionResponse.setSuccess(_ctx.booleanValue("ListFunctionResponse.Success"));
		listFunctionResponse.setCode(_ctx.stringValue("ListFunctionResponse.Code"));
		listFunctionResponse.setMessage(_ctx.stringValue("ListFunctionResponse.Message"));

		Paginator paginator = new Paginator();
		paginator.setPageSize(_ctx.integerValue("ListFunctionResponse.Paginator.PageSize"));
		paginator.setPageNum(_ctx.integerValue("ListFunctionResponse.Paginator.PageNum"));
		paginator.setTotal(_ctx.integerValue("ListFunctionResponse.Paginator.Total"));
		paginator.setPageCount(_ctx.integerValue("ListFunctionResponse.Paginator.PageCount"));
		listFunctionResponse.setPaginator(paginator);

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFunctionResponse.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setName(_ctx.stringValue("ListFunctionResponse.DataList["+ i +"].Name"));
			dataListItem.setDesc(_ctx.stringValue("ListFunctionResponse.DataList["+ i +"].Desc"));
			dataListItem.setCreatedAt(_ctx.stringValue("ListFunctionResponse.DataList["+ i +"].CreatedAt"));
			dataListItem.setModifiedAt(_ctx.stringValue("ListFunctionResponse.DataList["+ i +"].ModifiedAt"));

			Spec spec = new Spec();
			spec.setRuntime(_ctx.stringValue("ListFunctionResponse.DataList["+ i +"].Spec.Runtime"));
			spec.setMemory(_ctx.stringValue("ListFunctionResponse.DataList["+ i +"].Spec.Memory"));
			spec.setTimeout(_ctx.stringValue("ListFunctionResponse.DataList["+ i +"].Spec.Timeout"));
			dataListItem.setSpec(spec);

			dataList.add(dataListItem);
		}
		listFunctionResponse.setDataList(dataList);
	 
	 	return listFunctionResponse;
	}
}