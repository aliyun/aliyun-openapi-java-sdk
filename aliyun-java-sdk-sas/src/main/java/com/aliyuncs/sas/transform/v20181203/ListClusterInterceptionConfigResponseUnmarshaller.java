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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListClusterInterceptionConfigResponse;
import com.aliyuncs.sas.model.v20181203.ListClusterInterceptionConfigResponse.ClusterConfig;
import com.aliyuncs.sas.model.v20181203.ListClusterInterceptionConfigResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterInterceptionConfigResponseUnmarshaller {

	public static ListClusterInterceptionConfigResponse unmarshall(ListClusterInterceptionConfigResponse listClusterInterceptionConfigResponse, UnmarshallerContext _ctx) {
		
		listClusterInterceptionConfigResponse.setRequestId(_ctx.stringValue("ListClusterInterceptionConfigResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotalCount(_ctx.integerValue("ListClusterInterceptionConfigResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListClusterInterceptionConfigResponse.PageInfo.Count"));
		pageInfo.setCurrrentPage(_ctx.integerValue("ListClusterInterceptionConfigResponse.PageInfo.CurrrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListClusterInterceptionConfigResponse.PageInfo.PageSize"));
		listClusterInterceptionConfigResponse.setPageInfo(pageInfo);

		List<ClusterConfig> clusterConfigList = new ArrayList<ClusterConfig>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterInterceptionConfigResponse.ClusterConfigList.Length"); i++) {
			ClusterConfig clusterConfig = new ClusterConfig();
			clusterConfig.setClusterName(_ctx.stringValue("ListClusterInterceptionConfigResponse.ClusterConfigList["+ i +"].ClusterName"));
			clusterConfig.setInterceptionSwitch(_ctx.integerValue("ListClusterInterceptionConfigResponse.ClusterConfigList["+ i +"].InterceptionSwitch"));
			clusterConfig.setInterceptionType(_ctx.integerValue("ListClusterInterceptionConfigResponse.ClusterConfigList["+ i +"].InterceptionType"));
			clusterConfig.setClusterId(_ctx.stringValue("ListClusterInterceptionConfigResponse.ClusterConfigList["+ i +"].ClusterId"));
			clusterConfig.setClusterCNNFStatus(_ctx.integerValue("ListClusterInterceptionConfigResponse.ClusterConfigList["+ i +"].ClusterCNNFStatus"));
			clusterConfig.setOpenRuleCount(_ctx.longValue("ListClusterInterceptionConfigResponse.ClusterConfigList["+ i +"].OpenRuleCount"));
			clusterConfig.setTotalRuleCount(_ctx.longValue("ListClusterInterceptionConfigResponse.ClusterConfigList["+ i +"].TotalRuleCount"));
			clusterConfig.setSupportCNNF(_ctx.booleanValue("ListClusterInterceptionConfigResponse.ClusterConfigList["+ i +"].SupportCNNF"));
			clusterConfig.setClusterType(_ctx.stringValue("ListClusterInterceptionConfigResponse.ClusterConfigList["+ i +"].ClusterType"));

			clusterConfigList.add(clusterConfig);
		}
		listClusterInterceptionConfigResponse.setClusterConfigList(clusterConfigList);
	 
	 	return listClusterInterceptionConfigResponse;
	}
}