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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeReadDBInstanceDelayResponse;
import com.aliyuncs.rds.model.v20140815.DescribeReadDBInstanceDelayResponse.ItemsItem;
import com.aliyuncs.rds.model.v20140815.DescribeReadDBInstanceDelayResponse.ItemsItem.ReadonlyInstanceDelayItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReadDBInstanceDelayResponseUnmarshaller {

	public static DescribeReadDBInstanceDelayResponse unmarshall(DescribeReadDBInstanceDelayResponse describeReadDBInstanceDelayResponse, UnmarshallerContext _ctx) {
		
		describeReadDBInstanceDelayResponse.setRequestId(_ctx.stringValue("DescribeReadDBInstanceDelayResponse.RequestId"));
		describeReadDBInstanceDelayResponse.setDBInstanceId(_ctx.stringValue("DescribeReadDBInstanceDelayResponse.DBInstanceId"));
		describeReadDBInstanceDelayResponse.setDelayTime(_ctx.integerValue("DescribeReadDBInstanceDelayResponse.DelayTime"));
		describeReadDBInstanceDelayResponse.setReadDBInstanceId(_ctx.stringValue("DescribeReadDBInstanceDelayResponse.ReadDBInstanceId"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReadDBInstanceDelayResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setDBInstanceId(_ctx.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].DBInstanceId"));

			List<String> readDBInstanceNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadDBInstanceNames.Length"); j++) {
				readDBInstanceNames.add(_ctx.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadDBInstanceNames["+ j +"]"));
			}
			itemsItem.setReadDBInstanceNames(readDBInstanceNames);

			List<String> readDelayTimes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadDelayTimes.Length"); j++) {
				readDelayTimes.add(_ctx.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadDelayTimes["+ j +"]"));
			}
			itemsItem.setReadDelayTimes(readDelayTimes);

			List<ReadonlyInstanceDelayItem> readonlyInstanceDelay = new ArrayList<ReadonlyInstanceDelayItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay.Length"); j++) {
				ReadonlyInstanceDelayItem readonlyInstanceDelayItem = new ReadonlyInstanceDelayItem();
				readonlyInstanceDelayItem.setFlushLag(_ctx.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].FlushLag"));
				readonlyInstanceDelayItem.setFlushLatency(_ctx.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].FlushLatency"));
				readonlyInstanceDelayItem.setReadDBInstanceName(_ctx.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].ReadDBInstanceName"));
				readonlyInstanceDelayItem.setReplayLag(_ctx.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].ReplayLag"));
				readonlyInstanceDelayItem.setReplayLatency(_ctx.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].ReplayLatency"));
				readonlyInstanceDelayItem.setSendLatency(_ctx.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].SendLatency"));
				readonlyInstanceDelayItem.setWriteLag(_ctx.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].WriteLag"));
				readonlyInstanceDelayItem.setWriteLatency(_ctx.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].WriteLatency"));

				readonlyInstanceDelay.add(readonlyInstanceDelayItem);
			}
			itemsItem.setReadonlyInstanceDelay(readonlyInstanceDelay);

			items.add(itemsItem);
		}
		describeReadDBInstanceDelayResponse.setItems(items);
	 
	 	return describeReadDBInstanceDelayResponse;
	}
}