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

import com.aliyuncs.vpc.model.v20160428.DescribeBandwidthPackagePublicIpMonitorDataResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeBandwidthPackagePublicIpMonitorDataResponse.MonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBandwidthPackagePublicIpMonitorDataResponseUnmarshaller {

	public static DescribeBandwidthPackagePublicIpMonitorDataResponse unmarshall(DescribeBandwidthPackagePublicIpMonitorDataResponse describeBandwidthPackagePublicIpMonitorDataResponse, UnmarshallerContext context) {
		
		describeBandwidthPackagePublicIpMonitorDataResponse.setRequestId(context.stringValue("DescribeBandwidthPackagePublicIpMonitorDataResponse.RequestId"));

		List<MonitorData> monitorDatas = new ArrayList<MonitorData>();
		for (int i = 0; i < context.lengthValue("DescribeBandwidthPackagePublicIpMonitorDataResponse.MonitorDatas.Length"); i++) {
			MonitorData monitorData = new MonitorData();
			monitorData.setRX(context.longValue("DescribeBandwidthPackagePublicIpMonitorDataResponse.MonitorDatas["+ i +"].RX"));
			monitorData.setTX(context.longValue("DescribeBandwidthPackagePublicIpMonitorDataResponse.MonitorDatas["+ i +"].TX"));
			monitorData.setReceivedBandwidth(context.longValue("DescribeBandwidthPackagePublicIpMonitorDataResponse.MonitorDatas["+ i +"].ReceivedBandwidth"));
			monitorData.setTransportedBandwidth(context.longValue("DescribeBandwidthPackagePublicIpMonitorDataResponse.MonitorDatas["+ i +"].TransportedBandwidth"));
			monitorData.setFlow(context.longValue("DescribeBandwidthPackagePublicIpMonitorDataResponse.MonitorDatas["+ i +"].Flow"));
			monitorData.setBandwidth(context.longValue("DescribeBandwidthPackagePublicIpMonitorDataResponse.MonitorDatas["+ i +"].Bandwidth"));
			monitorData.setPackets(context.longValue("DescribeBandwidthPackagePublicIpMonitorDataResponse.MonitorDatas["+ i +"].Packets"));
			monitorData.setTimeStamp(context.stringValue("DescribeBandwidthPackagePublicIpMonitorDataResponse.MonitorDatas["+ i +"].TimeStamp"));

			monitorDatas.add(monitorData);
		}
		describeBandwidthPackagePublicIpMonitorDataResponse.setMonitorDatas(monitorDatas);
	 
	 	return describeBandwidthPackagePublicIpMonitorDataResponse;
	}
}