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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainMonitoringUsageDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainMonitoringUsageDataResponse.MonitoringDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainMonitoringUsageDataResponseUnmarshaller {

	public static DescribeLiveDomainMonitoringUsageDataResponse unmarshall(DescribeLiveDomainMonitoringUsageDataResponse describeLiveDomainMonitoringUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainMonitoringUsageDataResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainMonitoringUsageDataResponse.RequestId"));
		describeLiveDomainMonitoringUsageDataResponse.setEndTime(_ctx.stringValue("DescribeLiveDomainMonitoringUsageDataResponse.EndTime"));
		describeLiveDomainMonitoringUsageDataResponse.setStartTime(_ctx.stringValue("DescribeLiveDomainMonitoringUsageDataResponse.StartTime"));
		describeLiveDomainMonitoringUsageDataResponse.setRegion(_ctx.stringValue("DescribeLiveDomainMonitoringUsageDataResponse.Region"));
		describeLiveDomainMonitoringUsageDataResponse.setInstanceId(_ctx.stringValue("DescribeLiveDomainMonitoringUsageDataResponse.InstanceId"));
		describeLiveDomainMonitoringUsageDataResponse.setDomainName(_ctx.stringValue("DescribeLiveDomainMonitoringUsageDataResponse.DomainName"));

		List<MonitoringDataItem> monitoringData = new ArrayList<MonitoringDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainMonitoringUsageDataResponse.MonitoringData.Length"); i++) {
			MonitoringDataItem monitoringDataItem = new MonitoringDataItem();
			monitoringDataItem.setRegion(_ctx.stringValue("DescribeLiveDomainMonitoringUsageDataResponse.MonitoringData["+ i +"].Region"));
			monitoringDataItem.setTimeStamp(_ctx.stringValue("DescribeLiveDomainMonitoringUsageDataResponse.MonitoringData["+ i +"].TimeStamp"));
			monitoringDataItem.setDuration(_ctx.integerValue("DescribeLiveDomainMonitoringUsageDataResponse.MonitoringData["+ i +"].Duration"));
			monitoringDataItem.setInstanceId(_ctx.stringValue("DescribeLiveDomainMonitoringUsageDataResponse.MonitoringData["+ i +"].InstanceId"));
			monitoringDataItem.setDomainName(_ctx.stringValue("DescribeLiveDomainMonitoringUsageDataResponse.MonitoringData["+ i +"].DomainName"));
			monitoringDataItem.setResolution(_ctx.stringValue("DescribeLiveDomainMonitoringUsageDataResponse.MonitoringData["+ i +"].Resolution"));

			monitoringData.add(monitoringDataItem);
		}
		describeLiveDomainMonitoringUsageDataResponse.setMonitoringData(monitoringData);
	 
	 	return describeLiveDomainMonitoringUsageDataResponse;
	}
}