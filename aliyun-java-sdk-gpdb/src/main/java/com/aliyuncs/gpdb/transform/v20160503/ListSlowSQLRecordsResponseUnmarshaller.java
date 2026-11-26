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

import com.aliyuncs.gpdb.model.v20160503.ListSlowSQLRecordsResponse;
import com.aliyuncs.gpdb.model.v20160503.ListSlowSQLRecordsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSlowSQLRecordsResponseUnmarshaller {

	public static ListSlowSQLRecordsResponse unmarshall(ListSlowSQLRecordsResponse listSlowSQLRecordsResponse, UnmarshallerContext _ctx) {
		
		listSlowSQLRecordsResponse.setRequestId(_ctx.stringValue("ListSlowSQLRecordsResponse.RequestId"));
		listSlowSQLRecordsResponse.setTotalRecordCount(_ctx.integerValue("ListSlowSQLRecordsResponse.TotalRecordCount"));
		listSlowSQLRecordsResponse.setPageRecordCount(_ctx.integerValue("ListSlowSQLRecordsResponse.PageRecordCount"));
		listSlowSQLRecordsResponse.setPageNumber(_ctx.integerValue("ListSlowSQLRecordsResponse.PageNumber"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListSlowSQLRecordsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setSqlTruncated(_ctx.stringValue("ListSlowSQLRecordsResponse.Items["+ i +"].SqlTruncated"));
			item.setUserName(_ctx.stringValue("ListSlowSQLRecordsResponse.Items["+ i +"].UserName"));
			item.setOptimizer(_ctx.stringValue("ListSlowSQLRecordsResponse.Items["+ i +"].Optimizer"));
			item.setQueryID(_ctx.stringValue("ListSlowSQLRecordsResponse.Items["+ i +"].QueryID"));
			item.setQueryEndTime(_ctx.stringValue("ListSlowSQLRecordsResponse.Items["+ i +"].QueryEndTime"));
			item.setSqlText(_ctx.stringValue("ListSlowSQLRecordsResponse.Items["+ i +"].SqlText"));
			item.setLockWaitTime(_ctx.integerValue("ListSlowSQLRecordsResponse.Items["+ i +"].LockWaitTime"));
			item.setCpuTimeMs(_ctx.longValue("ListSlowSQLRecordsResponse.Items["+ i +"].CpuTimeMs"));
			item.setDurationTime(_ctx.integerValue("ListSlowSQLRecordsResponse.Items["+ i +"].DurationTime"));
			item.setDBName(_ctx.stringValue("ListSlowSQLRecordsResponse.Items["+ i +"].DBName"));
			item.setQueueWaitTime(_ctx.integerValue("ListSlowSQLRecordsResponse.Items["+ i +"].QueueWaitTime"));
			item.setMemBytes(_ctx.longValue("ListSlowSQLRecordsResponse.Items["+ i +"].MemBytes"));
			item.setQueryStartTime(_ctx.stringValue("ListSlowSQLRecordsResponse.Items["+ i +"].QueryStartTime"));
			item.setSpillBytes(_ctx.longValue("ListSlowSQLRecordsResponse.Items["+ i +"].SpillBytes"));
			item.setSqlTruncatedThreshold(_ctx.integerValue("ListSlowSQLRecordsResponse.Items["+ i +"].SqlTruncatedThreshold"));

			items.add(item);
		}
		listSlowSQLRecordsResponse.setItems(items);
	 
	 	return listSlowSQLRecordsResponse;
	}
}