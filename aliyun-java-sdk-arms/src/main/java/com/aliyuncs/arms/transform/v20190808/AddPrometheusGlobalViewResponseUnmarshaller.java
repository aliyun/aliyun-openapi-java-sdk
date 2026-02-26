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

import com.aliyuncs.arms.model.v20190808.AddPrometheusGlobalViewResponse;
import com.aliyuncs.arms.model.v20190808.AddPrometheusGlobalViewResponse.Data;
import com.aliyuncs.arms.model.v20190808.AddPrometheusGlobalViewResponse.Data.Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddPrometheusGlobalViewResponseUnmarshaller {

	public static AddPrometheusGlobalViewResponse unmarshall(AddPrometheusGlobalViewResponse addPrometheusGlobalViewResponse, UnmarshallerContext _ctx) {
		
		addPrometheusGlobalViewResponse.setRequestId(_ctx.stringValue("AddPrometheusGlobalViewResponse.RequestId"));
		addPrometheusGlobalViewResponse.setCode(_ctx.integerValue("AddPrometheusGlobalViewResponse.Code"));
		addPrometheusGlobalViewResponse.setMessage(_ctx.stringValue("AddPrometheusGlobalViewResponse.Message"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("AddPrometheusGlobalViewResponse.Data.Success"));
		data.setMsg(_ctx.stringValue("AddPrometheusGlobalViewResponse.Data.Msg"));

		Info info = new Info();
		info.setRegionId(_ctx.stringValue("AddPrometheusGlobalViewResponse.Data.Info.RegionId"));
		info.setGlobalViewClusterId(_ctx.stringValue("AddPrometheusGlobalViewResponse.Data.Info.GlobalViewClusterId"));
		info.setFailedInstances(_ctx.stringValue("AddPrometheusGlobalViewResponse.Data.Info.FailedInstances"));
		data.setInfo(info);
		addPrometheusGlobalViewResponse.setData(data);
	 
	 	return addPrometheusGlobalViewResponse;
	}
}