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
package com.aliyuncs.ocs.transform.v20141001;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.ocs.model.v20141001.DescribeMonitorItemsResponse;
import com.aliyuncs.ocs.model.v20141001.DescribeMonitorItemsResponse.OcsMonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitorItemsResponseUnmarshaller {

	public static DescribeMonitorItemsResponse unmarshall(DescribeMonitorItemsResponse describeMonitorItemsResponse, UnmarshallerContext context) {
		
		describeMonitorItemsResponse.setRequestId(context.stringValue("DescribeMonitorItemsResponse.RequestId"));

		List<OcsMonitorItem> monitorItems = new ArrayList<OcsMonitorItem>();
		for (int i = 0; i < context.lengthValue("DescribeMonitorItemsResponse.MonitorItems.Length"); i++) {
			OcsMonitorItem  ocsMonitorItem = new OcsMonitorItem();
			ocsMonitorItem.setMonitorKey(context.stringValue("DescribeMonitorItemsResponse.MonitorItems["+ i +"].MonitorKey"));
			ocsMonitorItem.setUnit(context.stringValue("DescribeMonitorItemsResponse.MonitorItems["+ i +"].Unit"));

			monitorItems.add(ocsMonitorItem);
		}
		describeMonitorItemsResponse.setMonitorItems(monitorItems);
	 
	 	return describeMonitorItemsResponse;
	}
}