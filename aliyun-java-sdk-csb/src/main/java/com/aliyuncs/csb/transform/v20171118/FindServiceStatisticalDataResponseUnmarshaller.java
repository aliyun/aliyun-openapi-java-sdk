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

import com.aliyuncs.csb.model.v20171118.FindServiceStatisticalDataResponse;
import com.aliyuncs.csb.model.v20171118.FindServiceStatisticalDataResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindServiceStatisticalDataResponse.Data.ServiceStatisticData;
import com.aliyuncs.csb.model.v20171118.FindServiceStatisticalDataResponse.Data.ServiceStatisticData.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindServiceStatisticalDataResponseUnmarshaller {

	public static FindServiceStatisticalDataResponse unmarshall(FindServiceStatisticalDataResponse findServiceStatisticalDataResponse, UnmarshallerContext _ctx) {
		
		findServiceStatisticalDataResponse.setRequestId(_ctx.stringValue("FindServiceStatisticalDataResponse.RequestId"));
		findServiceStatisticalDataResponse.setCode(_ctx.integerValue("FindServiceStatisticalDataResponse.Code"));
		findServiceStatisticalDataResponse.setMessage(_ctx.stringValue("FindServiceStatisticalDataResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("FindServiceStatisticalDataResponse.Data.CurrentPage"));
		data.setPageNumber(_ctx.integerValue("FindServiceStatisticalDataResponse.Data.PageNumber"));
		data.setTotal(_ctx.longValue("FindServiceStatisticalDataResponse.Data.Total"));

		List<ServiceStatisticData> monitorStatisticData = new ArrayList<ServiceStatisticData>();
		for (int i = 0; i < _ctx.lengthValue("FindServiceStatisticalDataResponse.Data.MonitorStatisticData.Length"); i++) {
			ServiceStatisticData serviceStatisticData = new ServiceStatisticData();
			serviceStatisticData.setAvgRt(_ctx.floatValue("FindServiceStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].AvgRt"));
			serviceStatisticData.setMaxRt(_ctx.floatValue("FindServiceStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].MaxRt"));
			serviceStatisticData.setMinRt(_ctx.floatValue("FindServiceStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].MinRt"));
			serviceStatisticData.setServiceName(_ctx.stringValue("FindServiceStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].ServiceName"));

			Total total = new Total();
			total.setTotal(_ctx.longValue("FindServiceStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].Total.Total"));
			total.setErrorNum(_ctx.longValue("FindServiceStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].Total.ErrorNum"));
			serviceStatisticData.setTotal(total);

			monitorStatisticData.add(serviceStatisticData);
		}
		data.setMonitorStatisticData(monitorStatisticData);
		findServiceStatisticalDataResponse.setData(data);
	 
	 	return findServiceStatisticalDataResponse;
	}
}