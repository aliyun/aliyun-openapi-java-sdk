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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsEccHistoryQueryByClusterNameResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsEccHistoryQueryByClusterNameResponse.ClusterRenderHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsEccHistoryQueryByClusterNameResponseUnmarshaller {

	public static OpsEccHistoryQueryByClusterNameResponse unmarshall(OpsEccHistoryQueryByClusterNameResponse opsEccHistoryQueryByClusterNameResponse, UnmarshallerContext _ctx) {
		
		opsEccHistoryQueryByClusterNameResponse.setRequestId(_ctx.stringValue("OpsEccHistoryQueryByClusterNameResponse.RequestId"));
		opsEccHistoryQueryByClusterNameResponse.setMessage(_ctx.stringValue("OpsEccHistoryQueryByClusterNameResponse.Message"));

		List<ClusterRenderHistory> data = new ArrayList<ClusterRenderHistory>();
		for (int i = 0; i < _ctx.lengthValue("OpsEccHistoryQueryByClusterNameResponse.Data.Length"); i++) {
			ClusterRenderHistory clusterRenderHistory = new ClusterRenderHistory();
			clusterRenderHistory.setCheckCount(_ctx.integerValue("OpsEccHistoryQueryByClusterNameResponse.Data["+ i +"].CheckCount"));
			clusterRenderHistory.setClusterInventory(_ctx.stringValue("OpsEccHistoryQueryByClusterNameResponse.Data["+ i +"].ClusterInventory"));
			clusterRenderHistory.setValidCount(_ctx.stringValue("OpsEccHistoryQueryByClusterNameResponse.Data["+ i +"].ValidCount"));
			clusterRenderHistory.setCheckTS(_ctx.longValue("OpsEccHistoryQueryByClusterNameResponse.Data["+ i +"].CheckTS"));
			clusterRenderHistory.setClusterName(_ctx.stringValue("OpsEccHistoryQueryByClusterNameResponse.Data["+ i +"].ClusterName"));

			List<String> checkItems = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsEccHistoryQueryByClusterNameResponse.Data["+ i +"].CheckItems.Length"); j++) {
				checkItems.add(_ctx.stringValue("OpsEccHistoryQueryByClusterNameResponse.Data["+ i +"].CheckItems["+ j +"]"));
			}
			clusterRenderHistory.setCheckItems(checkItems);

			data.add(clusterRenderHistory);
		}
		opsEccHistoryQueryByClusterNameResponse.setData(data);
	 
	 	return opsEccHistoryQueryByClusterNameResponse;
	}
}