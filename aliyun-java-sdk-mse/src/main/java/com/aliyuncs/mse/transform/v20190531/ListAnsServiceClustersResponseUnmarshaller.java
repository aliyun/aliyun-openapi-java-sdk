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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListAnsServiceClustersResponse;
import com.aliyuncs.mse.model.v20190531.ListAnsServiceClustersResponse.Data;
import com.aliyuncs.mse.model.v20190531.ListAnsServiceClustersResponse.Data.NacosAnsCluster;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAnsServiceClustersResponseUnmarshaller {

	public static ListAnsServiceClustersResponse unmarshall(ListAnsServiceClustersResponse listAnsServiceClustersResponse, UnmarshallerContext _ctx) {
		
		listAnsServiceClustersResponse.setRequestId(_ctx.stringValue("ListAnsServiceClustersResponse.RequestId"));
		listAnsServiceClustersResponse.setSuccess(_ctx.booleanValue("ListAnsServiceClustersResponse.Success"));
		listAnsServiceClustersResponse.setMessage(_ctx.stringValue("ListAnsServiceClustersResponse.Message"));
		listAnsServiceClustersResponse.setErrorCode(_ctx.stringValue("ListAnsServiceClustersResponse.ErrorCode"));

		Data data = new Data();
		data.setProtectThreshold(_ctx.floatValue("ListAnsServiceClustersResponse.Data.ProtectThreshold"));
		data.setSelectorType(_ctx.stringValue("ListAnsServiceClustersResponse.Data.SelectorType"));
		data.setName(_ctx.stringValue("ListAnsServiceClustersResponse.Data.Name"));
		data.setGroupName(_ctx.stringValue("ListAnsServiceClustersResponse.Data.GroupName"));
		data.setMetadata(_ctx.mapValue("ListAnsServiceClustersResponse.Data.Metadata"));

		List<NacosAnsCluster> clusters = new ArrayList<NacosAnsCluster>();
		for (int i = 0; i < _ctx.lengthValue("ListAnsServiceClustersResponse.Data.Clusters.Length"); i++) {
			NacosAnsCluster nacosAnsCluster = new NacosAnsCluster();
			nacosAnsCluster.setServiceName(_ctx.stringValue("ListAnsServiceClustersResponse.Data.Clusters["+ i +"].ServiceName"));
			nacosAnsCluster.setName(_ctx.stringValue("ListAnsServiceClustersResponse.Data.Clusters["+ i +"].Name"));
			nacosAnsCluster.setHealthCheckerType(_ctx.stringValue("ListAnsServiceClustersResponse.Data.Clusters["+ i +"].HealthCheckerType"));
			nacosAnsCluster.setDefaultPort(_ctx.integerValue("ListAnsServiceClustersResponse.Data.Clusters["+ i +"].DefaultPort"));
			nacosAnsCluster.setDefaultCheckPort(_ctx.integerValue("ListAnsServiceClustersResponse.Data.Clusters["+ i +"].DefaultCheckPort"));
			nacosAnsCluster.setUseIPPort4Check(_ctx.booleanValue("ListAnsServiceClustersResponse.Data.Clusters["+ i +"].UseIPPort4Check"));
			nacosAnsCluster.setMetadata(_ctx.mapValue("ListAnsServiceClustersResponse.Data.Clusters["+ i +"].Metadata"));

			clusters.add(nacosAnsCluster);
		}
		data.setClusters(clusters);
		listAnsServiceClustersResponse.setData(data);
	 
	 	return listAnsServiceClustersResponse;
	}
}