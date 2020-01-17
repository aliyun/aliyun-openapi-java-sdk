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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.ListDeployConfigResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListDeployConfigResponse.DeployConfigInstance;
import com.aliyuncs.retailcloud.model.v20180313.ListDeployConfigResponse.DeployConfigInstance.ContainerCodePath;
import com.aliyuncs.retailcloud.model.v20180313.ListDeployConfigResponse.DeployConfigInstance.ContainerYamlConf;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeployConfigResponseUnmarshaller {

	public static ListDeployConfigResponse unmarshall(ListDeployConfigResponse listDeployConfigResponse, UnmarshallerContext _ctx) {
		
		listDeployConfigResponse.setRequestId(_ctx.stringValue("ListDeployConfigResponse.RequestId"));
		listDeployConfigResponse.setCode(_ctx.integerValue("ListDeployConfigResponse.Code"));
		listDeployConfigResponse.setErrorMsg(_ctx.stringValue("ListDeployConfigResponse.ErrorMsg"));
		listDeployConfigResponse.setPageNumber(_ctx.integerValue("ListDeployConfigResponse.PageNumber"));
		listDeployConfigResponse.setPageSize(_ctx.integerValue("ListDeployConfigResponse.PageSize"));
		listDeployConfigResponse.setTotalCount(_ctx.longValue("ListDeployConfigResponse.TotalCount"));

		List<DeployConfigInstance> data = new ArrayList<DeployConfigInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListDeployConfigResponse.Data.Length"); i++) {
			DeployConfigInstance deployConfigInstance = new DeployConfigInstance();
			deployConfigInstance.setId(_ctx.longValue("ListDeployConfigResponse.Data["+ i +"].Id"));
			deployConfigInstance.setName(_ctx.stringValue("ListDeployConfigResponse.Data["+ i +"].Name"));
			deployConfigInstance.setAppId(_ctx.longValue("ListDeployConfigResponse.Data["+ i +"].AppId"));
			deployConfigInstance.setEnvType(_ctx.stringValue("ListDeployConfigResponse.Data["+ i +"].EnvType"));

			ContainerCodePath containerCodePath = new ContainerCodePath();
			containerCodePath.setCodePath(_ctx.stringValue("ListDeployConfigResponse.Data["+ i +"].ContainerCodePath.CodePath"));
			deployConfigInstance.setContainerCodePath(containerCodePath);

			ContainerYamlConf containerYamlConf = new ContainerYamlConf();
			containerYamlConf.setDeployment(_ctx.stringValue("ListDeployConfigResponse.Data["+ i +"].ContainerYamlConf.Deployment"));
			containerYamlConf.setConfigMap(_ctx.stringValue("ListDeployConfigResponse.Data["+ i +"].ContainerYamlConf.ConfigMap"));
			containerYamlConf.setStatefulSet(_ctx.stringValue("ListDeployConfigResponse.Data["+ i +"].ContainerYamlConf.StatefulSet"));

			List<String> configMapList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDeployConfigResponse.Data["+ i +"].ContainerYamlConf.ConfigMapList.Length"); j++) {
				configMapList.add(_ctx.stringValue("ListDeployConfigResponse.Data["+ i +"].ContainerYamlConf.ConfigMapList["+ j +"]"));
			}
			containerYamlConf.setConfigMapList(configMapList);
			deployConfigInstance.setContainerYamlConf(containerYamlConf);

			data.add(deployConfigInstance);
		}
		listDeployConfigResponse.setData(data);
	 
	 	return listDeployConfigResponse;
	}
}