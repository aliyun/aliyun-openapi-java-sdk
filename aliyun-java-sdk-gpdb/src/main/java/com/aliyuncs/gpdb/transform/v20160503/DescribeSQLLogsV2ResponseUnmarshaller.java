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

import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogsV2Response;
import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogsV2Response.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogsV2ResponseUnmarshaller {

	public static DescribeSQLLogsV2Response unmarshall(DescribeSQLLogsV2Response describeSQLLogsV2Response, UnmarshallerContext _ctx) {
		
		describeSQLLogsV2Response.setRequestId(_ctx.stringValue("DescribeSQLLogsV2Response.RequestId"));
		describeSQLLogsV2Response.setAccessDeniedDetail(_ctx.stringValue("DescribeSQLLogsV2Response.AccessDeniedDetail"));
		describeSQLLogsV2Response.setPageNumber(_ctx.integerValue("DescribeSQLLogsV2Response.PageNumber"));
		describeSQLLogsV2Response.setPageRecordCount(_ctx.integerValue("DescribeSQLLogsV2Response.PageRecordCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLLogsV2Response.Items.Length"); i++) {
			Item item = new Item();
			item.setAccountName(_ctx.stringValue("DescribeSQLLogsV2Response.Items["+ i +"].AccountName"));
			item.setDBName(_ctx.stringValue("DescribeSQLLogsV2Response.Items["+ i +"].DBName"));
			item.setDBRole(_ctx.stringValue("DescribeSQLLogsV2Response.Items["+ i +"].DBRole"));
			item.setErrorCode(_ctx.stringValue("DescribeSQLLogsV2Response.Items["+ i +"].ErrorCode"));
			item.setErrorMsg(_ctx.stringValue("DescribeSQLLogsV2Response.Items["+ i +"].ErrorMsg"));
			item.setExecuteCost(_ctx.floatValue("DescribeSQLLogsV2Response.Items["+ i +"].ExecuteCost"));
			item.setExecuteState(_ctx.stringValue("DescribeSQLLogsV2Response.Items["+ i +"].ExecuteState"));
			item.setOperationClass(_ctx.stringValue("DescribeSQLLogsV2Response.Items["+ i +"].OperationClass"));
			item.setOperationExecuteTime(_ctx.stringValue("DescribeSQLLogsV2Response.Items["+ i +"].OperationExecuteTime"));
			item.setOperationType(_ctx.stringValue("DescribeSQLLogsV2Response.Items["+ i +"].OperationType"));
			item.setReturnRowCounts(_ctx.longValue("DescribeSQLLogsV2Response.Items["+ i +"].ReturnRowCounts"));
			item.setSQLText(_ctx.stringValue("DescribeSQLLogsV2Response.Items["+ i +"].SQLText"));
			item.setScanRowCounts(_ctx.longValue("DescribeSQLLogsV2Response.Items["+ i +"].ScanRowCounts"));
			item.setSourceIP(_ctx.stringValue("DescribeSQLLogsV2Response.Items["+ i +"].SourceIP"));
			item.setSourcePort(_ctx.integerValue("DescribeSQLLogsV2Response.Items["+ i +"].SourcePort"));
			item.setQueryId(_ctx.stringValue("DescribeSQLLogsV2Response.Items["+ i +"].QueryId"));
			item.setSessionId(_ctx.stringValue("DescribeSQLLogsV2Response.Items["+ i +"].SessionId"));

			items.add(item);
		}
		describeSQLLogsV2Response.setItems(items);
	 
	 	return describeSQLLogsV2Response;
	}
}