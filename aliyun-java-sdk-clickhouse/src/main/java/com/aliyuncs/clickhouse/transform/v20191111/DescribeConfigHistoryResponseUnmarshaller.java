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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeConfigHistoryResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeConfigHistoryResponse.ConfigHistoryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigHistoryResponseUnmarshaller {

	public static DescribeConfigHistoryResponse unmarshall(DescribeConfigHistoryResponse describeConfigHistoryResponse, UnmarshallerContext _ctx) {
		
		describeConfigHistoryResponse.setRequestId(_ctx.stringValue("DescribeConfigHistoryResponse.RequestId"));

		List<ConfigHistoryItem> configHistoryItems = new ArrayList<ConfigHistoryItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigHistoryResponse.ConfigHistoryItems.Length"); i++) {
			ConfigHistoryItem configHistoryItem = new ConfigHistoryItem();
			configHistoryItem.setTime(_ctx.stringValue("DescribeConfigHistoryResponse.ConfigHistoryItems["+ i +"].Time"));
			configHistoryItem.setOwnerId(_ctx.stringValue("DescribeConfigHistoryResponse.ConfigHistoryItems["+ i +"].OwnerId"));
			configHistoryItem.setReason(_ctx.stringValue("DescribeConfigHistoryResponse.ConfigHistoryItems["+ i +"].Reason"));
			configHistoryItem.setSuccess(_ctx.booleanValue("DescribeConfigHistoryResponse.ConfigHistoryItems["+ i +"].Success"));
			configHistoryItem.setChangeId(_ctx.stringValue("DescribeConfigHistoryResponse.ConfigHistoryItems["+ i +"].ChangeId"));

			configHistoryItems.add(configHistoryItem);
		}
		describeConfigHistoryResponse.setConfigHistoryItems(configHistoryItems);
	 
	 	return describeConfigHistoryResponse;
	}
}