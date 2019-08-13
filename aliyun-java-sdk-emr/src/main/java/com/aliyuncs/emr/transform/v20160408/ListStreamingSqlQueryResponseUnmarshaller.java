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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListStreamingSqlQueryResponse;
import com.aliyuncs.emr.model.v20160408.ListStreamingSqlQueryResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStreamingSqlQueryResponseUnmarshaller {

	public static ListStreamingSqlQueryResponse unmarshall(ListStreamingSqlQueryResponse listStreamingSqlQueryResponse, UnmarshallerContext _ctx) {
		
		listStreamingSqlQueryResponse.setRequestId(_ctx.stringValue("ListStreamingSqlQueryResponse.RequestId"));
		listStreamingSqlQueryResponse.setPageNumber(_ctx.integerValue("ListStreamingSqlQueryResponse.PageNumber"));
		listStreamingSqlQueryResponse.setPageSize(_ctx.integerValue("ListStreamingSqlQueryResponse.PageSize"));
		listStreamingSqlQueryResponse.setTotalCount(_ctx.integerValue("ListStreamingSqlQueryResponse.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListStreamingSqlQueryResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setGmtCreate(_ctx.longValue("ListStreamingSqlQueryResponse.Items["+ i +"].GmtCreate"));
			item.setGmtModified(_ctx.longValue("ListStreamingSqlQueryResponse.Items["+ i +"].GmtModified"));
			item.setQueryName(_ctx.stringValue("ListStreamingSqlQueryResponse.Items["+ i +"].QueryName"));
			item.setQueryId(_ctx.stringValue("ListStreamingSqlQueryResponse.Items["+ i +"].QueryId"));
			item.setRunId(_ctx.stringValue("ListStreamingSqlQueryResponse.Items["+ i +"].RunId"));
			item.setStatus(_ctx.stringValue("ListStreamingSqlQueryResponse.Items["+ i +"].Status"));
			item.setError(_ctx.stringValue("ListStreamingSqlQueryResponse.Items["+ i +"].Error"));
			item.setInstanceId(_ctx.stringValue("ListStreamingSqlQueryResponse.Items["+ i +"].InstanceId"));

			items.add(item);
		}
		listStreamingSqlQueryResponse.setItems(items);
	 
	 	return listStreamingSqlQueryResponse;
	}
}