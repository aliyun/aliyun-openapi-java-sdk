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

import com.aliyuncs.arms.model.v20190808.ListPromClustersResponse;
import com.aliyuncs.arms.model.v20190808.ListPromClustersResponse.PromCluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPromClustersResponseUnmarshaller {

	public static ListPromClustersResponse unmarshall(ListPromClustersResponse listPromClustersResponse, UnmarshallerContext _ctx) {
		
		listPromClustersResponse.setRequestId(_ctx.stringValue("ListPromClustersResponse.RequestId"));

		List<PromCluster> promClusterList = new ArrayList<PromCluster>();
		for (int i = 0; i < _ctx.lengthValue("ListPromClustersResponse.PromClusterList.Length"); i++) {
			PromCluster promCluster = new PromCluster();
			promCluster.setId(_ctx.longValue("ListPromClustersResponse.PromClusterList["+ i +"].Id"));
			promCluster.setClusterId(_ctx.stringValue("ListPromClustersResponse.PromClusterList["+ i +"].ClusterId"));
			promCluster.setClusterName(_ctx.stringValue("ListPromClustersResponse.PromClusterList["+ i +"].ClusterName"));
			promCluster.setAgentStatus(_ctx.stringValue("ListPromClustersResponse.PromClusterList["+ i +"].AgentStatus"));
			promCluster.setClusterType(_ctx.stringValue("ListPromClustersResponse.PromClusterList["+ i +"].ClusterType"));
			promCluster.setControllerId(_ctx.stringValue("ListPromClustersResponse.PromClusterList["+ i +"].ControllerId"));
			promCluster.setIsControllerInstalled(_ctx.booleanValue("ListPromClustersResponse.PromClusterList["+ i +"].IsControllerInstalled"));
			promCluster.setUserId(_ctx.stringValue("ListPromClustersResponse.PromClusterList["+ i +"].UserId"));
			promCluster.setRegionId(_ctx.stringValue("ListPromClustersResponse.PromClusterList["+ i +"].RegionId"));
			promCluster.setPluginsJsonArray(_ctx.stringValue("ListPromClustersResponse.PromClusterList["+ i +"].PluginsJsonArray"));
			promCluster.setStateJson(_ctx.stringValue("ListPromClustersResponse.PromClusterList["+ i +"].StateJson"));
			promCluster.setNodeNum(_ctx.integerValue("ListPromClustersResponse.PromClusterList["+ i +"].NodeNum"));
			promCluster.setCreateTime(_ctx.longValue("ListPromClustersResponse.PromClusterList["+ i +"].CreateTime"));
			promCluster.setUpdateTime(_ctx.longValue("ListPromClustersResponse.PromClusterList["+ i +"].UpdateTime"));
			promCluster.setLastHeartBeatTime(_ctx.longValue("ListPromClustersResponse.PromClusterList["+ i +"].LastHeartBeatTime"));
			promCluster.setInstallTime(_ctx.longValue("ListPromClustersResponse.PromClusterList["+ i +"].InstallTime"));
			promCluster.setExtra(_ctx.stringValue("ListPromClustersResponse.PromClusterList["+ i +"].Extra"));
			promCluster.setOptions(_ctx.stringValue("ListPromClustersResponse.PromClusterList["+ i +"].Options"));

			promClusterList.add(promCluster);
		}
		listPromClustersResponse.setPromClusterList(promClusterList);
	 
	 	return listPromClustersResponse;
	}
}