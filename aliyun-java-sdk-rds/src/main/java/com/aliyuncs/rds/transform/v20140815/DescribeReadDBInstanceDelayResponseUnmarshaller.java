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

	public static DescribeReadDBInstanceDelayResponse unmarshall(DescribeReadDBInstanceDelayResponse describeReadDBInstanceDelayResponse, UnmarshallerContext context) {
		
		describeReadDBInstanceDelayResponse.setRequestId(context.stringValue("DescribeReadDBInstanceDelayResponse.RequestId"));
		describeReadDBInstanceDelayResponse.setDBInstanceId(context.stringValue("DescribeReadDBInstanceDelayResponse.DBInstanceId"));
		describeReadDBInstanceDelayResponse.setReadDBInstanceId(context.stringValue("DescribeReadDBInstanceDelayResponse.ReadDBInstanceId"));
		describeReadDBInstanceDelayResponse.setDelayTime(context.integerValue("DescribeReadDBInstanceDelayResponse.DelayTime"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < context.lengthValue("DescribeReadDBInstanceDelayResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setDBInstanceId(context.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].DBInstanceId"));

			List<String> readDBInstanceNames = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadDBInstanceNames.Length"); j++) {
				readDBInstanceNames.add(context.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadDBInstanceNames["+ j +"]"));
			}
			itemsItem.setReadDBInstanceNames(readDBInstanceNames);

			List<String> readDelayTimes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadDelayTimes.Length"); j++) {
				readDelayTimes.add(context.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadDelayTimes["+ j +"]"));
			}
			itemsItem.setReadDelayTimes(readDelayTimes);

			List<ReadonlyInstanceDelayItem> readonlyInstanceDelay = new ArrayList<ReadonlyInstanceDelayItem>();
			for (int j = 0; j < context.lengthValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay.Length"); j++) {
				ReadonlyInstanceDelayItem readonlyInstanceDelayItem = new ReadonlyInstanceDelayItem();
				readonlyInstanceDelayItem.setReplayLatency(context.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].ReplayLatency"));
				readonlyInstanceDelayItem.setFlushLag(context.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].FlushLag"));
				readonlyInstanceDelayItem.setFlushLatency(context.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].FlushLatency"));
				readonlyInstanceDelayItem.setSendLatency(context.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].SendLatency"));
				readonlyInstanceDelayItem.setWriteLag(context.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].WriteLag"));
				readonlyInstanceDelayItem.setReplayLag(context.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].ReplayLag"));
				readonlyInstanceDelayItem.setWriteLatency(context.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].WriteLatency"));
				readonlyInstanceDelayItem.setReadDBInstanceName(context.stringValue("DescribeReadDBInstanceDelayResponse.Items["+ i +"].ReadonlyInstanceDelay["+ j +"].ReadDBInstanceName"));

				readonlyInstanceDelay.add(readonlyInstanceDelayItem);
			}
			itemsItem.setReadonlyInstanceDelay(readonlyInstanceDelay);

			items.add(itemsItem);
		}
		describeReadDBInstanceDelayResponse.setItems(items);
	 
	 	return describeReadDBInstanceDelayResponse;
	}
}