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

package com.aliyuncs.petadata.transform.v20160101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.petadata.model.v20160101.DescribeMonitorItemsResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeMonitorItemsResponse.MonitorItem;
import com.aliyuncs.petadata.model.v20160101.DescribeMonitorItemsResponse.MonitorItem.MonitorItemModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitorItemsResponseUnmarshaller {

	public static DescribeMonitorItemsResponse unmarshall(DescribeMonitorItemsResponse describeMonitorItemsResponse, UnmarshallerContext context) {
		
		describeMonitorItemsResponse.setRequestId(context.stringValue("DescribeMonitorItemsResponse.RequestId"));

		List<MonitorItem> monitorItems = new ArrayList<MonitorItem>();
		for (int i = 0; i < context.lengthValue("DescribeMonitorItemsResponse.MonitorItems.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setDisplayName(context.stringValue("DescribeMonitorItemsResponse.MonitorItems["+ i +"].DisplayName"));
			monitorItem.setKey(context.stringValue("DescribeMonitorItemsResponse.MonitorItems["+ i +"].Key"));
			monitorItem.setUnit(context.stringValue("DescribeMonitorItemsResponse.MonitorItems["+ i +"].Unit"));
			monitorItem.setGroupName(context.stringValue("DescribeMonitorItemsResponse.MonitorItems["+ i +"].GroupName"));
			monitorItem.setDesc(context.stringValue("DescribeMonitorItemsResponse.MonitorItems["+ i +"].Desc"));

			List<MonitorItemModel> groupValue = new ArrayList<MonitorItemModel>();
			for (int j = 0; j < context.lengthValue("DescribeMonitorItemsResponse.MonitorItems["+ i +"].GroupValue.Length"); j++) {
				MonitorItemModel monitorItemModel = new MonitorItemModel();
				monitorItemModel.setDisplayName(context.stringValue("DescribeMonitorItemsResponse.MonitorItems["+ i +"].GroupValue["+ j +"].DisplayName"));
				monitorItemModel.setKey(context.stringValue("DescribeMonitorItemsResponse.MonitorItems["+ i +"].GroupValue["+ j +"].Key"));
				monitorItemModel.setUnit(context.stringValue("DescribeMonitorItemsResponse.MonitorItems["+ i +"].GroupValue["+ j +"].Unit"));

				groupValue.add(monitorItemModel);
			}
			monitorItem.setGroupValue(groupValue);

			monitorItems.add(monitorItem);
		}
		describeMonitorItemsResponse.setMonitorItems(monitorItems);
	 
	 	return describeMonitorItemsResponse;
	}
}