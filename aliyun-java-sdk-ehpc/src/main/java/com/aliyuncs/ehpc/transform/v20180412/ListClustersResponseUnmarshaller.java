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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListClustersResponse;
import com.aliyuncs.ehpc.model.v20180412.ListClustersResponse.ClusterInfoSimple;
import com.aliyuncs.ehpc.model.v20180412.ListClustersResponse.ClusterInfoSimple.Computes;
import com.aliyuncs.ehpc.model.v20180412.ListClustersResponse.ClusterInfoSimple.Managers;
import com.aliyuncs.ehpc.model.v20180412.ListClustersResponse.ClusterInfoSimple.TotalResources;
import com.aliyuncs.ehpc.model.v20180412.ListClustersResponse.ClusterInfoSimple.UsedResources;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClustersResponseUnmarshaller {

	public static ListClustersResponse unmarshall(ListClustersResponse listClustersResponse, UnmarshallerContext _ctx) {
		
		listClustersResponse.setRequestId(_ctx.stringValue("ListClustersResponse.RequestId"));
		listClustersResponse.setTotalCount(_ctx.integerValue("ListClustersResponse.TotalCount"));
		listClustersResponse.setPageNumber(_ctx.integerValue("ListClustersResponse.PageNumber"));
		listClustersResponse.setPageSize(_ctx.integerValue("ListClustersResponse.PageSize"));

		List<ClusterInfoSimple> clusters = new ArrayList<ClusterInfoSimple>();
		for (int i = 0; i < _ctx.lengthValue("ListClustersResponse.Clusters.Length"); i++) {
			ClusterInfoSimple clusterInfoSimple = new ClusterInfoSimple();
			clusterInfoSimple.setId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].Id"));
			clusterInfoSimple.setRegionId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].RegionId"));
			clusterInfoSimple.setZoneId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].ZoneId"));
			clusterInfoSimple.setVSwitchId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].VSwitchId"));
			clusterInfoSimple.setVpcId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].VpcId"));
			clusterInfoSimple.setName(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].Name"));
			clusterInfoSimple.setDescription(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].Description"));
			clusterInfoSimple.setStatus(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].Status"));
			clusterInfoSimple.setOsTag(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].OsTag"));
			clusterInfoSimple.setAccountType(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].AccountType"));
			clusterInfoSimple.setSchedulerType(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].SchedulerType"));
			clusterInfoSimple.setDeployMode(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].DeployMode"));
			clusterInfoSimple.setCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Count"));
			clusterInfoSimple.setInstanceType(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].InstanceType"));
			clusterInfoSimple.setLoginNodes(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].LoginNodes"));
			clusterInfoSimple.setCreateTime(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].CreateTime"));
			clusterInfoSimple.setImageOwnerAlias(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].ImageOwnerAlias"));
			clusterInfoSimple.setImageId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].ImageId"));
			clusterInfoSimple.setLocation(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].Location"));
			clusterInfoSimple.setEhpcVersion(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].EhpcVersion"));
			clusterInfoSimple.setNodePrefix(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].NodePrefix"));
			clusterInfoSimple.setNodeSuffix(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].NodeSuffix"));
			clusterInfoSimple.setBaseOsTag(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].BaseOsTag"));

			Managers managers = new Managers();
			managers.setTotal(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Managers.Total"));
			managers.setNormalCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Managers.NormalCount"));
			managers.setOperatingCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Managers.OperatingCount"));
			managers.setStoppedCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Managers.StoppedCount"));
			managers.setExceptionCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Managers.ExceptionCount"));
			clusterInfoSimple.setManagers(managers);

			Computes computes = new Computes();
			computes.setTotal(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Computes.Total"));
			computes.setNormalCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Computes.NormalCount"));
			computes.setOperatingCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Computes.OperatingCount"));
			computes.setStoppedCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Computes.StoppedCount"));
			computes.setExceptionCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Computes.ExceptionCount"));
			clusterInfoSimple.setComputes(computes);

			TotalResources totalResources = new TotalResources();
			totalResources.setCpu(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].TotalResources.Cpu"));
			totalResources.setMemory(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].TotalResources.Memory"));
			totalResources.setGpu(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].TotalResources.Gpu"));
			clusterInfoSimple.setTotalResources(totalResources);

			UsedResources usedResources = new UsedResources();
			usedResources.setCpu(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].UsedResources.Cpu"));
			usedResources.setMemory(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].UsedResources.Memory"));
			usedResources.setGpu(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].UsedResources.Gpu"));
			clusterInfoSimple.setUsedResources(usedResources);

			clusters.add(clusterInfoSimple);
		}
		listClustersResponse.setClusters(clusters);
	 
	 	return listClustersResponse;
	}
}