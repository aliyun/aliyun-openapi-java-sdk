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
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeDiskMonitorDataResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDiskMonitorDataResponse.DiskMonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiskMonitorDataResponseUnmarshaller {

	public static DescribeDiskMonitorDataResponse unmarshall(DescribeDiskMonitorDataResponse describeDiskMonitorDataResponse, UnmarshallerContext context) {
		
		describeDiskMonitorDataResponse.setRequestId(context.stringValue("DescribeDiskMonitorDataResponse.RequestId"));
		describeDiskMonitorDataResponse.setTotalCount(context.integerValue("DescribeDiskMonitorDataResponse.TotalCount"));

		List<DiskMonitorData> monitorData = new ArrayList<DiskMonitorData>();
		for (int i = 0; i < context.lengthValue("DescribeDiskMonitorDataResponse.MonitorData.Length"); i++) {
			DiskMonitorData diskMonitorData = new DiskMonitorData();
			diskMonitorData.setDiskId(context.stringValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].DiskId"));
			diskMonitorData.setIOPSRead(context.integerValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].IOPSRead"));
			diskMonitorData.setIOPSWrite(context.integerValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].IOPSWrite"));
			diskMonitorData.setIOPSTotal(context.integerValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].IOPSTotal"));
			diskMonitorData.setBPSRead(context.integerValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].BPSRead"));
			diskMonitorData.setBPSWrite(context.integerValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].BPSWrite"));
			diskMonitorData.setBPSTotal(context.integerValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].BPSTotal"));
			diskMonitorData.setTimeStamp(context.stringValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].TimeStamp"));

			monitorData.add(diskMonitorData);
		}
		describeDiskMonitorDataResponse.setMonitorData(monitorData);
	 
	 	return describeDiskMonitorDataResponse;
	}
}