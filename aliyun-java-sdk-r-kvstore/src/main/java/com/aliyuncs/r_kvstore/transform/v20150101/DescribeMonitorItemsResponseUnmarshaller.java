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
package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeMonitorItemsResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeMonitorItemsResponse.KVStoreMonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitorItemsResponseUnmarshaller {

	public static DescribeMonitorItemsResponse unmarshall(DescribeMonitorItemsResponse describeMonitorItemsResponse, UnmarshallerContext context) {
		
		describeMonitorItemsResponse.setRequestId(context.stringValue("DescribeMonitorItemsResponse.RequestId"));

		List<KVStoreMonitorItem> monitorItems = new ArrayList<KVStoreMonitorItem>();
		for (int i = 0; i < context.lengthValue("DescribeMonitorItemsResponse.MonitorItems.Length"); i++) {
			KVStoreMonitorItem kVStoreMonitorItem = new KVStoreMonitorItem();
			kVStoreMonitorItem.setMonitorKey(context.stringValue("DescribeMonitorItemsResponse.MonitorItems["+ i +"].MonitorKey"));
			kVStoreMonitorItem.setUnit(context.stringValue("DescribeMonitorItemsResponse.MonitorItems["+ i +"].Unit"));

			monitorItems.add(kVStoreMonitorItem);
		}
		describeMonitorItemsResponse.setMonitorItems(monitorItems);
	 
	 	return describeMonitorItemsResponse;
	}
}