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

	public static ListClustersResponse unmarshall(ListClustersResponse listClustersResponse, UnmarshallerContext context) {
		
		listClustersResponse.setRequestId(context.stringValue("ListClustersResponse.RequestId"));
		listClustersResponse.setTotalCount(context.integerValue("ListClustersResponse.TotalCount"));
		listClustersResponse.setPageNumber(context.integerValue("ListClustersResponse.PageNumber"));
		listClustersResponse.setPageSize(context.integerValue("ListClustersResponse.PageSize"));

		List<ClusterInfoSimple> clusters = new ArrayList<ClusterInfoSimple>();
		for (int i = 0; i < context.lengthValue("ListClustersResponse.Clusters.Length"); i++) {
			ClusterInfoSimple clusterInfoSimple = new ClusterInfoSimple();
			clusterInfoSimple.setId(context.stringValue("ListClustersResponse.Clusters["+ i +"].Id"));
			clusterInfoSimple.setRegionId(context.stringValue("ListClustersResponse.Clusters["+ i +"].RegionId"));
			clusterInfoSimple.setZoneId(context.stringValue("ListClustersResponse.Clusters["+ i +"].ZoneId"));
			clusterInfoSimple.setName(context.stringValue("ListClustersResponse.Clusters["+ i +"].Name"));
			clusterInfoSimple.setDescription(context.stringValue("ListClustersResponse.Clusters["+ i +"].Description"));
			clusterInfoSimple.setStatus(context.stringValue("ListClustersResponse.Clusters["+ i +"].Status"));
			clusterInfoSimple.setOsTag(context.stringValue("ListClustersResponse.Clusters["+ i +"].OsTag"));
			clusterInfoSimple.setAccountType(context.stringValue("ListClustersResponse.Clusters["+ i +"].AccountType"));
			clusterInfoSimple.setSchedulerType(context.stringValue("ListClustersResponse.Clusters["+ i +"].SchedulerType"));
			clusterInfoSimple.setDeployMode(context.stringValue("ListClustersResponse.Clusters["+ i +"].DeployMode"));
			clusterInfoSimple.setCount(context.integerValue("ListClustersResponse.Clusters["+ i +"].Count"));
			clusterInfoSimple.setInstanceType(context.stringValue("ListClustersResponse.Clusters["+ i +"].InstanceType"));
			clusterInfoSimple.setLoginNodes(context.stringValue("ListClustersResponse.Clusters["+ i +"].LoginNodes"));
			clusterInfoSimple.setCreateTime(context.stringValue("ListClustersResponse.Clusters["+ i +"].CreateTime"));
			clusterInfoSimple.setImageOwnerAlias(context.stringValue("ListClustersResponse.Clusters["+ i +"].ImageOwnerAlias"));
			clusterInfoSimple.setImageId(context.stringValue("ListClustersResponse.Clusters["+ i +"].ImageId"));

			Managers managers = new Managers();
			managers.setTotal(context.integerValue("ListClustersResponse.Clusters["+ i +"].Managers.Total"));
			managers.setNormalCount(context.integerValue("ListClustersResponse.Clusters["+ i +"].Managers.NormalCount"));
			managers.setOperatingCount(context.integerValue("ListClustersResponse.Clusters["+ i +"].Managers.OperatingCount"));
			managers.setStoppedCount(context.integerValue("ListClustersResponse.Clusters["+ i +"].Managers.StoppedCount"));
			managers.setExceptionCount(context.integerValue("ListClustersResponse.Clusters["+ i +"].Managers.ExceptionCount"));
			clusterInfoSimple.setManagers(managers);

			Computes computes = new Computes();
			computes.setTotal(context.integerValue("ListClustersResponse.Clusters["+ i +"].Computes.Total"));
			computes.setNormalCount(context.integerValue("ListClustersResponse.Clusters["+ i +"].Computes.NormalCount"));
			computes.setOperatingCount(context.integerValue("ListClustersResponse.Clusters["+ i +"].Computes.OperatingCount"));
			computes.setStoppedCount(context.integerValue("ListClustersResponse.Clusters["+ i +"].Computes.StoppedCount"));
			computes.setExceptionCount(context.integerValue("ListClustersResponse.Clusters["+ i +"].Computes.ExceptionCount"));
			clusterInfoSimple.setComputes(computes);

			TotalResources totalResources = new TotalResources();
			totalResources.setCpu(context.integerValue("ListClustersResponse.Clusters["+ i +"].TotalResources.Cpu"));
			totalResources.setMemory(context.integerValue("ListClustersResponse.Clusters["+ i +"].TotalResources.Memory"));
			totalResources.setGpu(context.integerValue("ListClustersResponse.Clusters["+ i +"].TotalResources.Gpu"));
			clusterInfoSimple.setTotalResources(totalResources);

			UsedResources usedResources = new UsedResources();
			usedResources.setCpu(context.integerValue("ListClustersResponse.Clusters["+ i +"].UsedResources.Cpu"));
			usedResources.setMemory(context.integerValue("ListClustersResponse.Clusters["+ i +"].UsedResources.Memory"));
			usedResources.setGpu(context.integerValue("ListClustersResponse.Clusters["+ i +"].UsedResources.Gpu"));
			clusterInfoSimple.setUsedResources(usedResources);

			clusters.add(clusterInfoSimple);
		}
		listClustersResponse.setClusters(clusters);
	 
	 	return listClustersResponse;
	}
}