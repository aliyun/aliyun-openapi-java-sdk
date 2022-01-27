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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListConfigTemplatesResponse;
import com.aliyuncs.edas.model.v20170801.ListConfigTemplatesResponse.Data;
import com.aliyuncs.edas.model.v20170801.ListConfigTemplatesResponse.Data.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConfigTemplatesResponseUnmarshaller {

	public static ListConfigTemplatesResponse unmarshall(ListConfigTemplatesResponse listConfigTemplatesResponse, UnmarshallerContext _ctx) {
		
		listConfigTemplatesResponse.setRequestId(_ctx.stringValue("ListConfigTemplatesResponse.RequestId"));
		listConfigTemplatesResponse.setCode(_ctx.integerValue("ListConfigTemplatesResponse.Code"));
		listConfigTemplatesResponse.setMessage(_ctx.stringValue("ListConfigTemplatesResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("ListConfigTemplatesResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("ListConfigTemplatesResponse.Data.PageSize"));
		data.setTotalSize(_ctx.longValue("ListConfigTemplatesResponse.Data.TotalSize"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListConfigTemplatesResponse.Data.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.stringValue("ListConfigTemplatesResponse.Data.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("ListConfigTemplatesResponse.Data.Result["+ i +"].Name"));
			resultItem.setFormat(_ctx.stringValue("ListConfigTemplatesResponse.Data.Result["+ i +"].Format"));
			resultItem.setDescription(_ctx.stringValue("ListConfigTemplatesResponse.Data.Result["+ i +"].Description"));
			resultItem.setContent(_ctx.stringValue("ListConfigTemplatesResponse.Data.Result["+ i +"].Content"));
			resultItem.setGmtCreate(_ctx.longValue("ListConfigTemplatesResponse.Data.Result["+ i +"].GmtCreate"));
			resultItem.setGmtModified(_ctx.longValue("ListConfigTemplatesResponse.Data.Result["+ i +"].GmtModified"));

			result.add(resultItem);
		}
		data.setResult(result);
		listConfigTemplatesResponse.setData(data);
	 
	 	return listConfigTemplatesResponse;
	}
}