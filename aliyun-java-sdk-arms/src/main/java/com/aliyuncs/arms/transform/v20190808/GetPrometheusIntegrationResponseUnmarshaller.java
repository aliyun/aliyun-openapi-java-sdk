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

import com.aliyuncs.arms.model.v20190808.GetPrometheusIntegrationResponse;
import com.aliyuncs.arms.model.v20190808.GetPrometheusIntegrationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPrometheusIntegrationResponseUnmarshaller {

	public static GetPrometheusIntegrationResponse unmarshall(GetPrometheusIntegrationResponse getPrometheusIntegrationResponse, UnmarshallerContext _ctx) {
		
		getPrometheusIntegrationResponse.setRequestId(_ctx.stringValue("GetPrometheusIntegrationResponse.RequestId"));
		getPrometheusIntegrationResponse.setCode(_ctx.integerValue("GetPrometheusIntegrationResponse.Code"));
		getPrometheusIntegrationResponse.setMessage(_ctx.stringValue("GetPrometheusIntegrationResponse.Message"));

		Data data = new Data();
		data.setClusterId(_ctx.stringValue("GetPrometheusIntegrationResponse.Data.ClusterId"));
		data.setInstanceId(_ctx.longValue("GetPrometheusIntegrationResponse.Data.InstanceId"));
		data.setShowDescribe(_ctx.booleanValue("GetPrometheusIntegrationResponse.Data.ShowDescribe"));
		data.setNeedUpgrade(_ctx.booleanValue("GetPrometheusIntegrationResponse.Data.NeedUpgrade"));
		data.setInstanceName(_ctx.stringValue("GetPrometheusIntegrationResponse.Data.InstanceName"));
		data.setIntegrationType(_ctx.stringValue("GetPrometheusIntegrationResponse.Data.IntegrationType"));
		data.setExporterType(_ctx.stringValue("GetPrometheusIntegrationResponse.Data.ExporterType"));
		data.setVersion(_ctx.stringValue("GetPrometheusIntegrationResponse.Data.Version"));
		data.setTarget(_ctx.stringValue("GetPrometheusIntegrationResponse.Data.Target"));
		data.setCanDelete(_ctx.booleanValue("GetPrometheusIntegrationResponse.Data.CanDelete"));
		data.setCanEditor(_ctx.booleanValue("GetPrometheusIntegrationResponse.Data.CanEditor"));
		data.setStatus(_ctx.stringValue("GetPrometheusIntegrationResponse.Data.Status"));
		data.setDescribe(_ctx.stringValue("GetPrometheusIntegrationResponse.Data.Describe"));
		data.setShowLog(_ctx.stringValue("GetPrometheusIntegrationResponse.Data.ShowLog"));
		data.setNamespace(_ctx.stringValue("GetPrometheusIntegrationResponse.Data.Namespace"));
		data.setContainerName(_ctx.stringValue("GetPrometheusIntegrationResponse.Data.ContainerName"));
		data.setParam(_ctx.stringValue("GetPrometheusIntegrationResponse.Data.Param"));
		getPrometheusIntegrationResponse.setData(data);
	 
	 	return getPrometheusIntegrationResponse;
	}
}