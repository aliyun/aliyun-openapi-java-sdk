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

import com.aliyuncs.arms.model.v20190808.GetPrometheusRemoteWriteResponse;
import com.aliyuncs.arms.model.v20190808.GetPrometheusRemoteWriteResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPrometheusRemoteWriteResponseUnmarshaller {

	public static GetPrometheusRemoteWriteResponse unmarshall(GetPrometheusRemoteWriteResponse getPrometheusRemoteWriteResponse, UnmarshallerContext _ctx) {
		
		getPrometheusRemoteWriteResponse.setRequestId(_ctx.stringValue("GetPrometheusRemoteWriteResponse.RequestId"));
		getPrometheusRemoteWriteResponse.setSuccess(_ctx.booleanValue("GetPrometheusRemoteWriteResponse.Success"));
		getPrometheusRemoteWriteResponse.setMessage(_ctx.stringValue("GetPrometheusRemoteWriteResponse.Message"));
		getPrometheusRemoteWriteResponse.setCode(_ctx.integerValue("GetPrometheusRemoteWriteResponse.Code"));

		Data data = new Data();
		data.setClusterId(_ctx.stringValue("GetPrometheusRemoteWriteResponse.Data.ClusterId"));
		data.setRemoteWriteName(_ctx.stringValue("GetPrometheusRemoteWriteResponse.Data.RemoteWriteName"));
		data.setRemoteWriteYaml(_ctx.stringValue("GetPrometheusRemoteWriteResponse.Data.RemoteWriteYaml"));
		getPrometheusRemoteWriteResponse.setData(data);
	 
	 	return getPrometheusRemoteWriteResponse;
	}
}