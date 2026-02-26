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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListPrometheusIntegrationResponse;
import com.aliyuncs.arms.model.v20190808.ListPrometheusIntegrationResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrometheusIntegrationResponseUnmarshaller {

	public static ListPrometheusIntegrationResponse unmarshall(ListPrometheusIntegrationResponse listPrometheusIntegrationResponse, UnmarshallerContext _ctx) {
		
		listPrometheusIntegrationResponse.setRequestId(_ctx.stringValue("ListPrometheusIntegrationResponse.RequestId"));
		listPrometheusIntegrationResponse.setMessage(_ctx.stringValue("ListPrometheusIntegrationResponse.Message"));
		listPrometheusIntegrationResponse.setCode(_ctx.integerValue("ListPrometheusIntegrationResponse.Code"));

		List<Instance> data = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListPrometheusIntegrationResponse.Data.Length"); i++) {
			Instance instance = new Instance();
			instance.setClusterId(_ctx.stringValue("ListPrometheusIntegrationResponse.Data["+ i +"].ClusterId"));
			instance.setShowDescribe(_ctx.booleanValue("ListPrometheusIntegrationResponse.Data["+ i +"].ShowDescribe"));
			instance.setNeedUpgrade(_ctx.booleanValue("ListPrometheusIntegrationResponse.Data["+ i +"].NeedUpgrade"));
			instance.setInstanceName(_ctx.stringValue("ListPrometheusIntegrationResponse.Data["+ i +"].InstanceName"));
			instance.setExporterType(_ctx.stringValue("ListPrometheusIntegrationResponse.Data["+ i +"].ExporterType"));
			instance.setIntegrationType(_ctx.stringValue("ListPrometheusIntegrationResponse.Data["+ i +"].IntegrationType"));
			instance.setInstanceId(_ctx.longValue("ListPrometheusIntegrationResponse.Data["+ i +"].InstanceId"));
			instance.setVersion(_ctx.stringValue("ListPrometheusIntegrationResponse.Data["+ i +"].Version"));
			instance.setTarget(_ctx.stringValue("ListPrometheusIntegrationResponse.Data["+ i +"].Target"));
			instance.setCanDelete(_ctx.booleanValue("ListPrometheusIntegrationResponse.Data["+ i +"].CanDelete"));
			instance.setCanEditor(_ctx.booleanValue("ListPrometheusIntegrationResponse.Data["+ i +"].CanEditor"));
			instance.setStatus(_ctx.stringValue("ListPrometheusIntegrationResponse.Data["+ i +"].Status"));
			instance.setContainerName(_ctx.stringValue("ListPrometheusIntegrationResponse.Data["+ i +"].ContainerName"));
			instance.setNamespace(_ctx.stringValue("ListPrometheusIntegrationResponse.Data["+ i +"].Namespace"));
			instance.setPodName(_ctx.stringValue("ListPrometheusIntegrationResponse.Data["+ i +"].PodName"));
			instance.setDescribe(_ctx.stringValue("ListPrometheusIntegrationResponse.Data["+ i +"].Describe"));
			instance.setShowLog(_ctx.booleanValue("ListPrometheusIntegrationResponse.Data["+ i +"].ShowLog"));
			instance.setParam(_ctx.stringValue("ListPrometheusIntegrationResponse.Data["+ i +"].Param"));

			data.add(instance);
		}
		listPrometheusIntegrationResponse.setData(data);
	 
	 	return listPrometheusIntegrationResponse;
	}
}