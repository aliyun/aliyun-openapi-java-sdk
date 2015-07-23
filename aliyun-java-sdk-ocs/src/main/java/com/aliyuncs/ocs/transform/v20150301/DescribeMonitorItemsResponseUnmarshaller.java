/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ocs.transform.v20150301;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.ocs.model.v20150301.DescribeMonitorItemsResponse;
import com.aliyuncs.ocs.model.v20150301.DescribeMonitorItemsResponse.GetOcsMonitorItemsResponseDTO;
import com.aliyuncs.ocs.model.v20150301.DescribeMonitorItemsResponse.GetOcsMonitorItemsResponseDTO.MonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitorItemsResponseUnmarshaller {

	public static DescribeMonitorItemsResponse unmarshall(DescribeMonitorItemsResponse describeMonitorItemsResponse, UnmarshallerContext context) {
		
		describeMonitorItemsResponse.setRequestId(context.stringValue("DescribeMonitorItemsResponse.RequestId"));

		GetOcsMonitorItemsResponseDTO  getOcsMonitorItemsResponseDTO = new GetOcsMonitorItemsResponseDTO();

		List<MonitorItem> monitorItems = new ArrayList<MonitorItem>();
		for (int i = 0; i < context.lengthValue("DescribeMonitorItemsResponse.GetOcsMonitorItemsResponseDTO.MonitorItems.Length"); i++) {
			MonitorItem  monitorItem = new MonitorItem();
			monitorItem.setMonitorKey(context.stringValue("DescribeMonitorItemsResponse.GetOcsMonitorItemsResponseDTO.MonitorItems["+ i +"].MonitorKey"));
			monitorItem.setUnit(context.stringValue("DescribeMonitorItemsResponse.GetOcsMonitorItemsResponseDTO.MonitorItems["+ i +"].Unit"));

			monitorItems.add(monitorItem);
		}
		getOcsMonitorItemsResponseDTO.setMonitorItems(monitorItems);
		describeMonitorItemsResponse.setGetOcsMonitorItemsResponseDTO(getOcsMonitorItemsResponseDTO);
	 
	 	return describeMonitorItemsResponse;
	}
}