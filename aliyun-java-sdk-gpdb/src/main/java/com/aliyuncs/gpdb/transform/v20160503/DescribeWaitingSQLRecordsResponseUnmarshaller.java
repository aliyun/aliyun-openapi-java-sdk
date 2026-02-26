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

import com.aliyuncs.gpdb.model.v20160503.DescribeWaitingSQLRecordsResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeWaitingSQLRecordsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWaitingSQLRecordsResponseUnmarshaller {

	public static DescribeWaitingSQLRecordsResponse unmarshall(DescribeWaitingSQLRecordsResponse describeWaitingSQLRecordsResponse, UnmarshallerContext _ctx) {
		
		describeWaitingSQLRecordsResponse.setRequestId(_ctx.stringValue("DescribeWaitingSQLRecordsResponse.RequestId"));
		describeWaitingSQLRecordsResponse.setTotalCount(_ctx.integerValue("DescribeWaitingSQLRecordsResponse.TotalCount"));
		describeWaitingSQLRecordsResponse.setPageNumber(_ctx.integerValue("DescribeWaitingSQLRecordsResponse.PageNumber"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWaitingSQLRecordsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setPID(_ctx.stringValue("DescribeWaitingSQLRecordsResponse.Items["+ i +"].PID"));
			item.setSessionID(_ctx.stringValue("DescribeWaitingSQLRecordsResponse.Items["+ i +"].SessionID"));
			item.setStartTime(_ctx.longValue("DescribeWaitingSQLRecordsResponse.Items["+ i +"].StartTime"));
			item.setWaitingTime(_ctx.longValue("DescribeWaitingSQLRecordsResponse.Items["+ i +"].WaitingTime"));
			item.setStatus(_ctx.stringValue("DescribeWaitingSQLRecordsResponse.Items["+ i +"].Status"));
			item.setSQLStmt(_ctx.stringValue("DescribeWaitingSQLRecordsResponse.Items["+ i +"].SQLStmt"));
			item.setUser(_ctx.stringValue("DescribeWaitingSQLRecordsResponse.Items["+ i +"].User"));
			item.setDatabase(_ctx.stringValue("DescribeWaitingSQLRecordsResponse.Items["+ i +"].Database"));

			items.add(item);
		}
		describeWaitingSQLRecordsResponse.setItems(items);
	 
	 	return describeWaitingSQLRecordsResponse;
	}
}