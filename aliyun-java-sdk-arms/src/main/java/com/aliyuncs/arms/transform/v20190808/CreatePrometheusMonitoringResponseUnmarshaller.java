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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.CreatePrometheusMonitoringResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePrometheusMonitoringResponseUnmarshaller {

	public static CreatePrometheusMonitoringResponse unmarshall(CreatePrometheusMonitoringResponse createPrometheusMonitoringResponse, UnmarshallerContext _ctx) {
		
		createPrometheusMonitoringResponse.setRequestId(_ctx.stringValue("CreatePrometheusMonitoringResponse.RequestId"));
		createPrometheusMonitoringResponse.setCode(_ctx.integerValue("CreatePrometheusMonitoringResponse.Code"));
		createPrometheusMonitoringResponse.setData(_ctx.stringValue("CreatePrometheusMonitoringResponse.Data"));
		createPrometheusMonitoringResponse.setMessage(_ctx.stringValue("CreatePrometheusMonitoringResponse.Message"));
	 
	 	return createPrometheusMonitoringResponse;
	}
}