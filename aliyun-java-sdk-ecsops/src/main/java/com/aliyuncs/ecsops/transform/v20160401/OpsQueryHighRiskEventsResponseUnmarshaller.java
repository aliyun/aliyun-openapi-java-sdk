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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryHighRiskEventsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryHighRiskEventsResponse.HighRiskMetricData;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryHighRiskEventsResponseUnmarshaller {

	public static OpsQueryHighRiskEventsResponse unmarshall(OpsQueryHighRiskEventsResponse opsQueryHighRiskEventsResponse, UnmarshallerContext _ctx) {
		
		opsQueryHighRiskEventsResponse.setRequestId(_ctx.stringValue("OpsQueryHighRiskEventsResponse.RequestId"));
		opsQueryHighRiskEventsResponse.setNcIps(_ctx.stringValue("OpsQueryHighRiskEventsResponse.NcIps"));
		opsQueryHighRiskEventsResponse.setStartTime(_ctx.stringValue("OpsQueryHighRiskEventsResponse.StartTime"));
		opsQueryHighRiskEventsResponse.setEndTime(_ctx.stringValue("OpsQueryHighRiskEventsResponse.EndTime"));

		List<HighRiskMetricData> highRiskReleaseList = new ArrayList<HighRiskMetricData>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryHighRiskEventsResponse.HighRiskReleaseList.Length"); i++) {
			HighRiskMetricData highRiskMetricData = new HighRiskMetricData();
			highRiskMetricData.setNcIp(_ctx.stringValue("OpsQueryHighRiskEventsResponse.HighRiskReleaseList["+ i +"].NcIp"));
			highRiskMetricData.setMetricName(_ctx.stringValue("OpsQueryHighRiskEventsResponse.HighRiskReleaseList["+ i +"].MetricName"));
			highRiskMetricData.setHighRiskEvent(_ctx.stringValue("OpsQueryHighRiskEventsResponse.HighRiskReleaseList["+ i +"].HighRiskEvent"));
			highRiskMetricData.setRemarks(_ctx.stringValue("OpsQueryHighRiskEventsResponse.HighRiskReleaseList["+ i +"].Remarks"));
			highRiskMetricData.setTimestamp(_ctx.stringValue("OpsQueryHighRiskEventsResponse.HighRiskReleaseList["+ i +"].Timestamp"));

			highRiskReleaseList.add(highRiskMetricData);
		}
		opsQueryHighRiskEventsResponse.setHighRiskReleaseList(highRiskReleaseList);
	 
	 	return opsQueryHighRiskEventsResponse;
	}
}