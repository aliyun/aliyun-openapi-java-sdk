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

package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.FindCredentialStatisticalDataResponse;
import com.aliyuncs.csb.model.v20171118.FindCredentialStatisticalDataResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindCredentialStatisticalDataResponse.Data.ServiceStatisticData;
import com.aliyuncs.csb.model.v20171118.FindCredentialStatisticalDataResponse.Data.ServiceStatisticData.CredentialInfoData;
import com.aliyuncs.csb.model.v20171118.FindCredentialStatisticalDataResponse.Data.ServiceStatisticData.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindCredentialStatisticalDataResponseUnmarshaller {

	public static FindCredentialStatisticalDataResponse unmarshall(FindCredentialStatisticalDataResponse findCredentialStatisticalDataResponse, UnmarshallerContext _ctx) {
		
		findCredentialStatisticalDataResponse.setRequestId(_ctx.stringValue("FindCredentialStatisticalDataResponse.RequestId"));
		findCredentialStatisticalDataResponse.setCode(_ctx.integerValue("FindCredentialStatisticalDataResponse.Code"));
		findCredentialStatisticalDataResponse.setMessage(_ctx.stringValue("FindCredentialStatisticalDataResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("FindCredentialStatisticalDataResponse.Data.CurrentPage"));
		data.setPageNumber(_ctx.integerValue("FindCredentialStatisticalDataResponse.Data.PageNumber"));
		data.setTotal(_ctx.longValue("FindCredentialStatisticalDataResponse.Data.Total"));

		List<ServiceStatisticData> monitorStatisticData = new ArrayList<ServiceStatisticData>();
		for (int i = 0; i < _ctx.lengthValue("FindCredentialStatisticalDataResponse.Data.MonitorStatisticData.Length"); i++) {
			ServiceStatisticData serviceStatisticData = new ServiceStatisticData();
			serviceStatisticData.setAvgRt(_ctx.floatValue("FindCredentialStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].AvgRt"));
			serviceStatisticData.setMaxRt(_ctx.floatValue("FindCredentialStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].MaxRt"));
			serviceStatisticData.setMinRt(_ctx.floatValue("FindCredentialStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].MinRt"));

			Total total = new Total();
			total.setTotal(_ctx.longValue("FindCredentialStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].Total.Total"));
			total.setErrorNum(_ctx.longValue("FindCredentialStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].Total.ErrorNum"));
			serviceStatisticData.setTotal(total);

			CredentialInfoData credentialInfoData = new CredentialInfoData();
			credentialInfoData.setCurrentAk(_ctx.stringValue("FindCredentialStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].CredentialInfoData.CurrentAk"));
			credentialInfoData.setCredentialName(_ctx.stringValue("FindCredentialStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].CredentialInfoData.CredentialName"));
			serviceStatisticData.setCredentialInfoData(credentialInfoData);

			monitorStatisticData.add(serviceStatisticData);
		}
		data.setMonitorStatisticData(monitorStatisticData);
		findCredentialStatisticalDataResponse.setData(data);
	 
	 	return findCredentialStatisticalDataResponse;
	}
}