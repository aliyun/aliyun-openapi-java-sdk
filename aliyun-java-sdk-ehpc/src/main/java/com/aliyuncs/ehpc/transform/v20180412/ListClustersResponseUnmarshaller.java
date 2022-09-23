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
		listClustersResponse.setPageSize(_ctx.integerValue("ListClustersResponse.PageSize"));
		listClustersResponse.setPageNumber(_ctx.integerValue("ListClustersResponse.PageNumber"));
		listClustersResponse.setTotalCount(_ctx.integerValue("ListClustersResponse.TotalCount"));

		List<ClusterInfoSimple> clusters = new ArrayList<ClusterInfoSimple>();
		for (int i = 0; i < _ctx.lengthValue("ListClustersResponse.Clusters.Length"); i++) {
			ClusterInfoSimple clusterInfoSimple = new ClusterInfoSimple();
			clusterInfoSimple.setVpcId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].VpcId"));
			clusterInfoSimple.setStatus(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].Status"));
			clusterInfoSimple.setCreateTime(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].CreateTime"));
			clusterInfoSimple.setIsComputeEss(_ctx.booleanValue("ListClustersResponse.Clusters["+ i +"].IsComputeEss"));
			clusterInfoSimple.setComputeSpotStrategy(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].ComputeSpotStrategy"));
			clusterInfoSimple.setAccountType(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].AccountType"));
			clusterInfoSimple.setCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Count"));
			clusterInfoSimple.setEhpcVersion(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].EhpcVersion"));
			clusterInfoSimple.setDescription(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].Description"));
			clusterInfoSimple.setBaseOsTag(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].BaseOsTag"));
			clusterInfoSimple.setName(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].Name"));
			clusterInfoSimple.setImageId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].ImageId"));
			clusterInfoSimple.setComputeSpotPriceLimit(_ctx.floatValue("ListClustersResponse.Clusters["+ i +"].ComputeSpotPriceLimit"));
			clusterInfoSimple.setSchedulerType(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].SchedulerType"));
			clusterInfoSimple.setDeployMode(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].DeployMode"));
			clusterInfoSimple.setNodeSuffix(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].NodeSuffix"));
			clusterInfoSimple.setImageOwnerAlias(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].ImageOwnerAlias"));
			clusterInfoSimple.setOsTag(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].OsTag"));
			clusterInfoSimple.setNodePrefix(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].NodePrefix"));
			clusterInfoSimple.setInstanceType(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].InstanceType"));
			clusterInfoSimple.setRegionId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].RegionId"));
			clusterInfoSimple.setInstanceChargeType(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].InstanceChargeType"));
			clusterInfoSimple.setVSwitchId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].VSwitchId"));
			clusterInfoSimple.setZoneId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].ZoneId"));
			clusterInfoSimple.setLoginNodes(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].LoginNodes"));
			clusterInfoSimple.setId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].Id"));
			clusterInfoSimple.setLocation(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].Location"));
			clusterInfoSimple.setClientVersion(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].ClientVersion"));
			clusterInfoSimple.setHasPlugin(_ctx.booleanValue("ListClustersResponse.Clusters["+ i +"].HasPlugin"));

			Managers managers = new Managers();
			managers.setOperatingCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Managers.OperatingCount"));
			managers.setExceptionCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Managers.ExceptionCount"));
			managers.setStoppedCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Managers.StoppedCount"));
			managers.setTotal(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Managers.Total"));
			managers.setNormalCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Managers.NormalCount"));
			clusterInfoSimple.setManagers(managers);

			Computes computes = new Computes();
			computes.setOperatingCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Computes.OperatingCount"));
			computes.setExceptionCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Computes.ExceptionCount"));
			computes.setStoppedCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Computes.StoppedCount"));
			computes.setTotal(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Computes.Total"));
			computes.setNormalCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Computes.NormalCount"));
			clusterInfoSimple.setComputes(computes);

			TotalResources totalResources = new TotalResources();
			totalResources.setGpu(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].TotalResources.Gpu"));
			totalResources.setCpu(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].TotalResources.Cpu"));
			totalResources.setMemory(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].TotalResources.Memory"));
			clusterInfoSimple.setTotalResources(totalResources);

			UsedResources usedResources = new UsedResources();
			usedResources.setGpu(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].UsedResources.Gpu"));
			usedResources.setCpu(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].UsedResources.Cpu"));
			usedResources.setMemory(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].UsedResources.Memory"));
			clusterInfoSimple.setUsedResources(usedResources);

			clusters.add(clusterInfoSimple);
		}
		listClustersResponse.setClusters(clusters);
	 
	 	return listClustersResponse;
	}
}