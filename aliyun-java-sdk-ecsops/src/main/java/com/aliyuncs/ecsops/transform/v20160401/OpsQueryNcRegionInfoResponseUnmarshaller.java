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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryNcRegionInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryNcRegionInfoResponse.HighRiskMetricData;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryNcRegionInfoResponseUnmarshaller {

	public static OpsQueryNcRegionInfoResponse unmarshall(OpsQueryNcRegionInfoResponse opsQueryNcRegionInfoResponse, UnmarshallerContext _ctx) {
		
		opsQueryNcRegionInfoResponse.setRequestId(_ctx.stringValue("OpsQueryNcRegionInfoResponse.RequestId"));

		List<HighRiskMetricData> ncRegionInfoList = new ArrayList<HighRiskMetricData>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryNcRegionInfoResponse.NcRegionInfoList.Length"); i++) {
			HighRiskMetricData highRiskMetricData = new HighRiskMetricData();
			highRiskMetricData.setNcId(_ctx.stringValue("OpsQueryNcRegionInfoResponse.NcRegionInfoList["+ i +"].NcId"));
			highRiskMetricData.setIsDragonBox(_ctx.booleanValue("OpsQueryNcRegionInfoResponse.NcRegionInfoList["+ i +"].IsDragonBox"));
			highRiskMetricData.setSn(_ctx.stringValue("OpsQueryNcRegionInfoResponse.NcRegionInfoList["+ i +"].Sn"));
			highRiskMetricData.setRegion(_ctx.stringValue("OpsQueryNcRegionInfoResponse.NcRegionInfoList["+ i +"].Region"));
			highRiskMetricData.setNcIp(_ctx.stringValue("OpsQueryNcRegionInfoResponse.NcRegionInfoList["+ i +"].NcIp"));

			ncRegionInfoList.add(highRiskMetricData);
		}
		opsQueryNcRegionInfoResponse.setNcRegionInfoList(ncRegionInfoList);
	 
	 	return opsQueryNcRegionInfoResponse;
	}
}