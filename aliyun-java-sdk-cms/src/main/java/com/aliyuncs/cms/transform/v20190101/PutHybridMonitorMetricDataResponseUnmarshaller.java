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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.PutHybridMonitorMetricDataResponse;
import com.aliyuncs.cms.model.v20190101.PutHybridMonitorMetricDataResponse.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutHybridMonitorMetricDataResponseUnmarshaller {

	public static PutHybridMonitorMetricDataResponse unmarshall(PutHybridMonitorMetricDataResponse putHybridMonitorMetricDataResponse, UnmarshallerContext _ctx) {
		
		putHybridMonitorMetricDataResponse.setRequestId(_ctx.stringValue("PutHybridMonitorMetricDataResponse.RequestId"));
		putHybridMonitorMetricDataResponse.setCode(_ctx.stringValue("PutHybridMonitorMetricDataResponse.Code"));

		List<Detail> errorDetail = new ArrayList<Detail>();
		for (int i = 0; i < _ctx.lengthValue("PutHybridMonitorMetricDataResponse.ErrorDetail.Length"); i++) {
			Detail detail = new Detail();
			detail.setIndex(_ctx.longValue("PutHybridMonitorMetricDataResponse.ErrorDetail["+ i +"].Index"));
			detail.setErrorMessage(_ctx.stringValue("PutHybridMonitorMetricDataResponse.ErrorDetail["+ i +"].ErrorMessage"));

			errorDetail.add(detail);
		}
		putHybridMonitorMetricDataResponse.setErrorDetail(errorDetail);
	 
	 	return putHybridMonitorMetricDataResponse;
	}
}