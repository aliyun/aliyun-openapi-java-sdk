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

package com.aliyuncs.lrg.transform.v20191010;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lrg.model.v20191010.QueryTagIpWithClusterNameResponse;
import com.aliyuncs.lrg.model.v20191010.QueryTagIpWithClusterNameResponse.DataItem;
import com.aliyuncs.lrg.model.v20191010.QueryTagIpWithClusterNameResponse.DataItem.ClusterNodeInfoItem;
import com.aliyuncs.lrg.model.v20191010.QueryTagIpWithClusterNameResponse.DataItem.ClusterNodeInfoItem.HostItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTagIpWithClusterNameResponseUnmarshaller {

	public static QueryTagIpWithClusterNameResponse unmarshall(QueryTagIpWithClusterNameResponse queryTagIpWithClusterNameResponse, UnmarshallerContext _ctx) {
		
		queryTagIpWithClusterNameResponse.setRequestId(_ctx.stringValue("QueryTagIpWithClusterNameResponse.RequestId"));
		queryTagIpWithClusterNameResponse.setStatus(_ctx.stringValue("QueryTagIpWithClusterNameResponse.Status"));
		queryTagIpWithClusterNameResponse.setDetails(_ctx.stringValue("QueryTagIpWithClusterNameResponse.Details"));
		queryTagIpWithClusterNameResponse.setReason(_ctx.stringValue("QueryTagIpWithClusterNameResponse.Reason"));
		queryTagIpWithClusterNameResponse.setErrorCode(_ctx.stringValue("QueryTagIpWithClusterNameResponse.ErrorCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTagIpWithClusterNameResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setClusterName(_ctx.stringValue("QueryTagIpWithClusterNameResponse.Data["+ i +"].ClusterName"));

			List<ClusterNodeInfoItem> clusterNodeInfo = new ArrayList<ClusterNodeInfoItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryTagIpWithClusterNameResponse.Data["+ i +"].ClusterNodeInfo.Length"); j++) {
				ClusterNodeInfoItem clusterNodeInfoItem = new ClusterNodeInfoItem();
				clusterNodeInfoItem.setTagName(_ctx.stringValue("QueryTagIpWithClusterNameResponse.Data["+ i +"].ClusterNodeInfo["+ j +"].TagName"));

				List<HostItem> host = new ArrayList<HostItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryTagIpWithClusterNameResponse.Data["+ i +"].ClusterNodeInfo["+ j +"].Host.Length"); k++) {
					HostItem hostItem = new HostItem();
					hostItem.setIp(_ctx.stringValue("QueryTagIpWithClusterNameResponse.Data["+ i +"].ClusterNodeInfo["+ j +"].Host["+ k +"].Ip"));
					hostItem.setHostName(_ctx.stringValue("QueryTagIpWithClusterNameResponse.Data["+ i +"].ClusterNodeInfo["+ j +"].Host["+ k +"].HostName"));

					host.add(hostItem);
				}
				clusterNodeInfoItem.setHost(host);

				clusterNodeInfo.add(clusterNodeInfoItem);
			}
			dataItem.setClusterNodeInfo(clusterNodeInfo);

			data.add(dataItem);
		}
		queryTagIpWithClusterNameResponse.setData(data);
	 
	 	return queryTagIpWithClusterNameResponse;
	}
}