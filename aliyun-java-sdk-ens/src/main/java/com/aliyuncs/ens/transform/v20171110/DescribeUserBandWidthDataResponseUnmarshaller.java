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
import com.aliyuncs.ens.model.v20171110.DescribeUserBandWidthDataResponse.MonitorData;
import com.aliyuncs.ens.model.v20171110.DescribeUserBandWidthDataResponse.MonitorData.BandWidthMonitorDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserBandWidthDataResponseUnmarshaller {

	public static DescribeUserBandWidthDataResponse unmarshall(DescribeUserBandWidthDataResponse describeUserBandWidthDataResponse, UnmarshallerContext _ctx) {
		
		describeUserBandWidthDataResponse.setRequestId(_ctx.stringValue("DescribeUserBandWidthDataResponse.RequestId"));
		describeUserBandWidthDataResponse.setCode(_ctx.integerValue("DescribeUserBandWidthDataResponse.Code"));

		MonitorData monitorData = new MonitorData();
		monitorData.setMaxDownBandWidth(_ctx.stringValue("DescribeUserBandWidthDataResponse.MonitorData.MaxDownBandWidth"));
		monitorData.setMaxUpBandWidth(_ctx.stringValue("DescribeUserBandWidthDataResponse.MonitorData.MaxUpBandWidth"));

		List<BandWidthMonitorDataItem> bandWidthMonitorData = new ArrayList<BandWidthMonitorDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserBandWidthDataResponse.MonitorData.BandWidthMonitorData.Length"); i++) {
			BandWidthMonitorDataItem bandWidthMonitorDataItem = new BandWidthMonitorDataItem();
			bandWidthMonitorDataItem.setDownBandWidth(_ctx.integerValue("DescribeUserBandWidthDataResponse.MonitorData.BandWidthMonitorData["+ i +"].DownBandWidth"));
			bandWidthMonitorDataItem.setInternetRX(_ctx.integerValue("DescribeUserBandWidthDataResponse.MonitorData.BandWidthMonitorData["+ i +"].InternetRX"));
			bandWidthMonitorDataItem.setInternetTX(_ctx.integerValue("DescribeUserBandWidthDataResponse.MonitorData.BandWidthMonitorData["+ i +"].InternetTX"));
			bandWidthMonitorDataItem.setTimeStamp(_ctx.stringValue("DescribeUserBandWidthDataResponse.MonitorData.BandWidthMonitorData["+ i +"].TimeStamp"));
			bandWidthMonitorDataItem.setUpBandWidth(_ctx.integerValue("DescribeUserBandWidthDataResponse.MonitorData.BandWidthMonitorData["+ i +"].UpBandWidth"));

			bandWidthMonitorData.add(bandWidthMonitorDataItem);
		}
		monitorData.setBandWidthMonitorData(bandWidthMonitorData);
		describeUserBandWidthDataResponse.setMonitorData(monitorData);
	 
	 	return describeUserBandWidthDataResponse;
	}
}