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

import com.aliyuncs.csb.model.v20171118.FindServiceCredentialStatisticalDataResponse;
import com.aliyuncs.csb.model.v20171118.FindServiceCredentialStatisticalDataResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindServiceCredentialStatisticalDataResponse.Data.ServiceStatisticData;
import com.aliyuncs.csb.model.v20171118.FindServiceCredentialStatisticalDataResponse.Data.ServiceStatisticData.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindServiceCredentialStatisticalDataResponseUnmarshaller {

	public static FindServiceCredentialStatisticalDataResponse unmarshall(FindServiceCredentialStatisticalDataResponse findServiceCredentialStatisticalDataResponse, UnmarshallerContext _ctx) {
		
		findServiceCredentialStatisticalDataResponse.setRequestId(_ctx.stringValue("FindServiceCredentialStatisticalDataResponse.RequestId"));
		findServiceCredentialStatisticalDataResponse.setCode(_ctx.integerValue("FindServiceCredentialStatisticalDataResponse.Code"));
		findServiceCredentialStatisticalDataResponse.setMessage(_ctx.stringValue("FindServiceCredentialStatisticalDataResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("FindServiceCredentialStatisticalDataResponse.Data.CurrentPage"));
		data.setPageNumber(_ctx.integerValue("FindServiceCredentialStatisticalDataResponse.Data.PageNumber"));
		data.setTotal(_ctx.longValue("FindServiceCredentialStatisticalDataResponse.Data.Total"));

		List<ServiceStatisticData> monitorStatisticData = new ArrayList<ServiceStatisticData>();
		for (int i = 0; i < _ctx.lengthValue("FindServiceCredentialStatisticalDataResponse.Data.MonitorStatisticData.Length"); i++) {
			ServiceStatisticData serviceStatisticData = new ServiceStatisticData();
			serviceStatisticData.setAvgRt(_ctx.floatValue("FindServiceCredentialStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].AvgRt"));
			serviceStatisticData.setMaxRt(_ctx.floatValue("FindServiceCredentialStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].MaxRt"));
			serviceStatisticData.setMinRt(_ctx.floatValue("FindServiceCredentialStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].MinRt"));
			serviceStatisticData.setServiceName(_ctx.stringValue("FindServiceCredentialStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].ServiceName"));
			serviceStatisticData.setCredentialName(_ctx.stringValue("FindServiceCredentialStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].CredentialName"));

			Total total = new Total();
			total.setTotal(_ctx.longValue("FindServiceCredentialStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].Total.Total"));
			total.setErrorNum(_ctx.longValue("FindServiceCredentialStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].Total.ErrorNum"));
			serviceStatisticData.setTotal(total);

			monitorStatisticData.add(serviceStatisticData);
		}
		data.setMonitorStatisticData(monitorStatisticData);
		findServiceCredentialStatisticalDataResponse.setData(data);
	 
	 	return findServiceCredentialStatisticalDataResponse;
	}
}