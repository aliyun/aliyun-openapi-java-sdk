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
package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeBandwidthPackageMonitorDataResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeBandwidthPackageMonitorDataResponse.MonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBandwidthPackageMonitorDataResponseUnmarshaller {

	public static DescribeBandwidthPackageMonitorDataResponse unmarshall(DescribeBandwidthPackageMonitorDataResponse describeBandwidthPackageMonitorDataResponse, UnmarshallerContext context) {
		
		describeBandwidthPackageMonitorDataResponse.setRequestId(context.stringValue("DescribeBandwidthPackageMonitorDataResponse.RequestId"));

		List<MonitorData> monitorDatas = new ArrayList<MonitorData>();
		for (int i = 0; i < context.lengthValue("DescribeBandwidthPackageMonitorDataResponse.MonitorDatas.Length"); i++) {
			MonitorData monitorData = new MonitorData();
			monitorData.setRX(context.longValue("DescribeBandwidthPackageMonitorDataResponse.MonitorDatas["+ i +"].RX"));
			monitorData.setTX(context.longValue("DescribeBandwidthPackageMonitorDataResponse.MonitorDatas["+ i +"].TX"));
			monitorData.setReceivedBandwidth(context.longValue("DescribeBandwidthPackageMonitorDataResponse.MonitorDatas["+ i +"].ReceivedBandwidth"));
			monitorData.setTransportedBandwidth(context.longValue("DescribeBandwidthPackageMonitorDataResponse.MonitorDatas["+ i +"].TransportedBandwidth"));
			monitorData.setFlow(context.longValue("DescribeBandwidthPackageMonitorDataResponse.MonitorDatas["+ i +"].Flow"));
			monitorData.setBandwidth(context.longValue("DescribeBandwidthPackageMonitorDataResponse.MonitorDatas["+ i +"].Bandwidth"));
			monitorData.setPackets(context.longValue("DescribeBandwidthPackageMonitorDataResponse.MonitorDatas["+ i +"].Packets"));
			monitorData.setTimeStamp(context.stringValue("DescribeBandwidthPackageMonitorDataResponse.MonitorDatas["+ i +"].TimeStamp"));

			monitorDatas.add(monitorData);
		}
		describeBandwidthPackageMonitorDataResponse.setMonitorDatas(monitorDatas);
	 
	 	return describeBandwidthPackageMonitorDataResponse;
	}
}