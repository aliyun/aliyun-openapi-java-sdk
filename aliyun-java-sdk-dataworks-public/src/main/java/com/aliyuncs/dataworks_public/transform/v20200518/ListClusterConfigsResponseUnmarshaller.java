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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListClusterConfigsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListClusterConfigsResponse.ClusterConfigsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterConfigsResponseUnmarshaller {

	public static ListClusterConfigsResponse unmarshall(ListClusterConfigsResponse listClusterConfigsResponse, UnmarshallerContext _ctx) {
		
		listClusterConfigsResponse.setRequestId(_ctx.stringValue("ListClusterConfigsResponse.RequestId"));
		listClusterConfigsResponse.setSuccess(_ctx.booleanValue("ListClusterConfigsResponse.Success"));
		listClusterConfigsResponse.setErrorCode(_ctx.stringValue("ListClusterConfigsResponse.ErrorCode"));
		listClusterConfigsResponse.setErrorMessage(_ctx.stringValue("ListClusterConfigsResponse.ErrorMessage"));
		listClusterConfigsResponse.setHttpStatusCode(_ctx.integerValue("ListClusterConfigsResponse.HttpStatusCode"));

		List<ClusterConfigsItem> clusterConfigs = new ArrayList<ClusterConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterConfigsResponse.ClusterConfigs.Length"); i++) {
			ClusterConfigsItem clusterConfigsItem = new ClusterConfigsItem();
			clusterConfigsItem.setModuleName(_ctx.stringValue("ListClusterConfigsResponse.ClusterConfigs["+ i +"].ModuleName"));
			clusterConfigsItem.setConfigValue(_ctx.stringValue("ListClusterConfigsResponse.ClusterConfigs["+ i +"].ConfigValue"));
			clusterConfigsItem.setEnableOverwrite(_ctx.booleanValue("ListClusterConfigsResponse.ClusterConfigs["+ i +"].EnableOverwrite"));

			clusterConfigs.add(clusterConfigsItem);
		}
		listClusterConfigsResponse.setClusterConfigs(clusterConfigs);
	 
	 	return listClusterConfigsResponse;
	}
}