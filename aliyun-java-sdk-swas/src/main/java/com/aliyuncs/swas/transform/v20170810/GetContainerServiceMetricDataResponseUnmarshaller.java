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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.GetContainerServiceMetricDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContainerServiceMetricDataResponseUnmarshaller {

	public static GetContainerServiceMetricDataResponse unmarshall(GetContainerServiceMetricDataResponse getContainerServiceMetricDataResponse, UnmarshallerContext _ctx) {
		
		getContainerServiceMetricDataResponse.setRequestId(_ctx.stringValue("GetContainerServiceMetricDataResponse.RequestId"));
		getContainerServiceMetricDataResponse.setIsSuccess(_ctx.booleanValue("GetContainerServiceMetricDataResponse.IsSuccess"));
		getContainerServiceMetricDataResponse.setCode(_ctx.stringValue("GetContainerServiceMetricDataResponse.Code"));
		getContainerServiceMetricDataResponse.setMetricName(_ctx.stringValue("GetContainerServiceMetricDataResponse.MetricName"));
		getContainerServiceMetricDataResponse.setMetricData(_ctx.stringValue("GetContainerServiceMetricDataResponse.MetricData"));
		getContainerServiceMetricDataResponse.setMessage(_ctx.stringValue("GetContainerServiceMetricDataResponse.Message"));
	 
	 	return getContainerServiceMetricDataResponse;
	}
}