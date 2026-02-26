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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeSyncAvailableDBClusterListResponse;
import com.aliyuncs.adb.model.v20190315.DescribeSyncAvailableDBClusterListResponse.SyncAvailableDBCluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSyncAvailableDBClusterListResponseUnmarshaller {

	public static DescribeSyncAvailableDBClusterListResponse unmarshall(DescribeSyncAvailableDBClusterListResponse describeSyncAvailableDBClusterListResponse, UnmarshallerContext _ctx) {
		
		describeSyncAvailableDBClusterListResponse.setRequestId(_ctx.stringValue("DescribeSyncAvailableDBClusterListResponse.RequestId"));

		List<SyncAvailableDBCluster> syncAvailableDBClusters = new ArrayList<SyncAvailableDBCluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSyncAvailableDBClusterListResponse.SyncAvailableDBClusters.Length"); i++) {
			SyncAvailableDBCluster syncAvailableDBCluster = new SyncAvailableDBCluster();
			syncAvailableDBCluster.setTableNumber(_ctx.integerValue("DescribeSyncAvailableDBClusterListResponse.SyncAvailableDBClusters["+ i +"].TableNumber"));
			syncAvailableDBCluster.setDBClusterId(_ctx.stringValue("DescribeSyncAvailableDBClusterListResponse.SyncAvailableDBClusters["+ i +"].DBClusterId"));
			syncAvailableDBCluster.setDBClusterDescription(_ctx.stringValue("DescribeSyncAvailableDBClusterListResponse.SyncAvailableDBClusters["+ i +"].DBClusterDescription"));
			syncAvailableDBCluster.setDBType(_ctx.stringValue("DescribeSyncAvailableDBClusterListResponse.SyncAvailableDBClusters["+ i +"].DBType"));
			syncAvailableDBCluster.setStorageSize(_ctx.floatValue("DescribeSyncAvailableDBClusterListResponse.SyncAvailableDBClusters["+ i +"].StorageSize"));

			syncAvailableDBClusters.add(syncAvailableDBCluster);
		}
		describeSyncAvailableDBClusterListResponse.setSyncAvailableDBClusters(syncAvailableDBClusters);
	 
	 	return describeSyncAvailableDBClusterListResponse;
	}
}