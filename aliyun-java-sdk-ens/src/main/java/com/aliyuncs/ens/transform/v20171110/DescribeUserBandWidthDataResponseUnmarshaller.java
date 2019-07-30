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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeUserBandWidthDataResponse;
import com.aliyuncs.ens.model.v20171110.DescribeUserBandWidthDataResponse.MonitorDataItem;
import com.aliyuncs.ens.model.v20171110.DescribeUserBandWidthDataResponse.MonitorDataItem.BandWidthMonitorDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserBandWidthDataResponseUnmarshaller {

	public static DescribeUserBandWidthDataResponse unmarshall(DescribeUserBandWidthDataResponse describeUserBandWidthDataResponse, UnmarshallerContext _ctx) {
		
		describeUserBandWidthDataResponse.setRequestId(_ctx.stringValue("DescribeUserBandWidthDataResponse.RequestId"));
		describeUserBandWidthDataResponse.setCode(_ctx.integerValue("DescribeUserBandWidthDataResponse.Code"));

		List<MonitorDataItem> monitorData = new ArrayList<MonitorDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserBandWidthDataResponse.MonitorData.Length"); i++) {
			MonitorDataItem monitorDataItem = new MonitorDataItem();
			monitorDataItem.setMaxDownBandWidth(_ctx.stringValue("DescribeUserBandWidthDataResponse.MonitorData["+ i +"].MaxDownBandWidth"));
			monitorDataItem.setMaxUpBandWidth(_ctx.stringValue("DescribeUserBandWidthDataResponse.MonitorData["+ i +"].MaxUpBandWidth"));

			List<BandWidthMonitorDataItem> bandWidthMonitorData = new ArrayList<BandWidthMonitorDataItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUserBandWidthDataResponse.MonitorData["+ i +"].BandWidthMonitorData.Length"); j++) {
				BandWidthMonitorDataItem bandWidthMonitorDataItem = new BandWidthMonitorDataItem();
				bandWidthMonitorDataItem.setUpBandWidth(_ctx.integerValue("DescribeUserBandWidthDataResponse.MonitorData["+ i +"].BandWidthMonitorData["+ j +"].UpBandWidth"));
				bandWidthMonitorDataItem.setDownBandWidth(_ctx.integerValue("DescribeUserBandWidthDataResponse.MonitorData["+ i +"].BandWidthMonitorData["+ j +"].DownBandWidth"));
				bandWidthMonitorDataItem.setInternetTX(_ctx.integerValue("DescribeUserBandWidthDataResponse.MonitorData["+ i +"].BandWidthMonitorData["+ j +"].InternetTX"));
				bandWidthMonitorDataItem.setInternetRX(_ctx.integerValue("DescribeUserBandWidthDataResponse.MonitorData["+ i +"].BandWidthMonitorData["+ j +"].InternetRX"));
				bandWidthMonitorDataItem.setTimeStamp(_ctx.stringValue("DescribeUserBandWidthDataResponse.MonitorData["+ i +"].BandWidthMonitorData["+ j +"].TimeStamp"));

				bandWidthMonitorData.add(bandWidthMonitorDataItem);
			}
			monitorDataItem.setBandWidthMonitorData(bandWidthMonitorData);

			monitorData.add(monitorDataItem);
		}
		describeUserBandWidthDataResponse.setMonitorData(monitorData);
	 
	 	return describeUserBandWidthDataResponse;
	}
}