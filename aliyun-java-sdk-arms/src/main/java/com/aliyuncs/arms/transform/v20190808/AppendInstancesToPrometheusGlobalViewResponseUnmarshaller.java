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

import com.aliyuncs.arms.model.v20190808.AppendInstancesToPrometheusGlobalViewResponse;
import com.aliyuncs.arms.model.v20190808.AppendInstancesToPrometheusGlobalViewResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AppendInstancesToPrometheusGlobalViewResponseUnmarshaller {

	public static AppendInstancesToPrometheusGlobalViewResponse unmarshall(AppendInstancesToPrometheusGlobalViewResponse appendInstancesToPrometheusGlobalViewResponse, UnmarshallerContext _ctx) {
		
		appendInstancesToPrometheusGlobalViewResponse.setRequestId(_ctx.stringValue("AppendInstancesToPrometheusGlobalViewResponse.RequestId"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("AppendInstancesToPrometheusGlobalViewResponse.Data.Success"));
		data.setMsg(_ctx.stringValue("AppendInstancesToPrometheusGlobalViewResponse.Data.Msg"));
		data.setInfo(_ctx.stringValue("AppendInstancesToPrometheusGlobalViewResponse.Data.Info"));
		appendInstancesToPrometheusGlobalViewResponse.setData(data);
	 
	 	return appendInstancesToPrometheusGlobalViewResponse;
	}
}