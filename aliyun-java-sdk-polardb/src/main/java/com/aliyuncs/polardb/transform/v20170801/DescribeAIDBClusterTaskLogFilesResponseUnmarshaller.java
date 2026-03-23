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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClusterTaskLogFilesResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClusterTaskLogFilesResponse.Items;
import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClusterTaskLogFilesResponse.Items.SlsLogItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAIDBClusterTaskLogFilesResponseUnmarshaller {

	public static DescribeAIDBClusterTaskLogFilesResponse unmarshall(DescribeAIDBClusterTaskLogFilesResponse describeAIDBClusterTaskLogFilesResponse, UnmarshallerContext _ctx) {
		
		describeAIDBClusterTaskLogFilesResponse.setRequestId(_ctx.stringValue("DescribeAIDBClusterTaskLogFilesResponse.RequestId"));
		describeAIDBClusterTaskLogFilesResponse.setPageRecordCount(_ctx.integerValue("DescribeAIDBClusterTaskLogFilesResponse.PageRecordCount"));
		describeAIDBClusterTaskLogFilesResponse.setPageSize(_ctx.longValue("DescribeAIDBClusterTaskLogFilesResponse.PageSize"));
		describeAIDBClusterTaskLogFilesResponse.setPageNumber(_ctx.longValue("DescribeAIDBClusterTaskLogFilesResponse.PageNumber"));
		describeAIDBClusterTaskLogFilesResponse.setStartTime(_ctx.stringValue("DescribeAIDBClusterTaskLogFilesResponse.StartTime"));
		describeAIDBClusterTaskLogFilesResponse.setEndTime(_ctx.stringValue("DescribeAIDBClusterTaskLogFilesResponse.EndTime"));

		Items items = new Items();

		List<SlsLogItem> slsLogItems = new ArrayList<SlsLogItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAIDBClusterTaskLogFilesResponse.Items.SlsLogItems.Length"); i++) {
			SlsLogItem slsLogItem = new SlsLogItem();
			slsLogItem.setTimestamp(_ctx.stringValue("DescribeAIDBClusterTaskLogFilesResponse.Items.SlsLogItems["+ i +"].Timestamp"));
			slsLogItem.setMessage(_ctx.stringValue("DescribeAIDBClusterTaskLogFilesResponse.Items.SlsLogItems["+ i +"].Message"));
			slsLogItem.setLogTime(_ctx.stringValue("DescribeAIDBClusterTaskLogFilesResponse.Items.SlsLogItems["+ i +"].LogTime"));

			slsLogItems.add(slsLogItem);
		}
		items.setSlsLogItems(slsLogItems);
		describeAIDBClusterTaskLogFilesResponse.setItems(items);
	 
	 	return describeAIDBClusterTaskLogFilesResponse;
	}
}