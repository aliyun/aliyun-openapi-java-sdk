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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogsResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogsResponseUnmarshaller {

	public static DescribeSQLLogsResponse unmarshall(DescribeSQLLogsResponse describeSQLLogsResponse, UnmarshallerContext _ctx) {
		
		describeSQLLogsResponse.setRequestId(_ctx.stringValue("DescribeSQLLogsResponse.RequestId"));
		describeSQLLogsResponse.setPageRecordCount(_ctx.integerValue("DescribeSQLLogsResponse.PageRecordCount"));
		describeSQLLogsResponse.setPageNumber(_ctx.integerValue("DescribeSQLLogsResponse.PageNumber"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLLogsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setOperationClass(_ctx.stringValue("DescribeSQLLogsResponse.Items["+ i +"].OperationClass"));
			item.setExecuteState(_ctx.stringValue("DescribeSQLLogsResponse.Items["+ i +"].ExecuteState"));
			item.setExecuteCost(_ctx.floatValue("DescribeSQLLogsResponse.Items["+ i +"].ExecuteCost"));
			item.setSQLText(_ctx.stringValue("DescribeSQLLogsResponse.Items["+ i +"].SQLText"));
			item.setSourcePort(_ctx.integerValue("DescribeSQLLogsResponse.Items["+ i +"].SourcePort"));
			item.setDBRole(_ctx.stringValue("DescribeSQLLogsResponse.Items["+ i +"].DBRole"));
			item.setOperationType(_ctx.stringValue("DescribeSQLLogsResponse.Items["+ i +"].OperationType"));
			item.setSourceIP(_ctx.stringValue("DescribeSQLLogsResponse.Items["+ i +"].SourceIP"));
			item.setSQLPlan(_ctx.stringValue("DescribeSQLLogsResponse.Items["+ i +"].SQLPlan"));
			item.setReturnRowCounts(_ctx.longValue("DescribeSQLLogsResponse.Items["+ i +"].ReturnRowCounts"));
			item.setDBName(_ctx.stringValue("DescribeSQLLogsResponse.Items["+ i +"].DBName"));
			item.setOperationExecuteTime(_ctx.stringValue("DescribeSQLLogsResponse.Items["+ i +"].OperationExecuteTime"));
			item.setScanRowCounts(_ctx.longValue("DescribeSQLLogsResponse.Items["+ i +"].ScanRowCounts"));
			item.setAccountName(_ctx.stringValue("DescribeSQLLogsResponse.Items["+ i +"].AccountName"));

			items.add(item);
		}
		describeSQLLogsResponse.setItems(items);
	 
	 	return describeSQLLogsResponse;
	}
}