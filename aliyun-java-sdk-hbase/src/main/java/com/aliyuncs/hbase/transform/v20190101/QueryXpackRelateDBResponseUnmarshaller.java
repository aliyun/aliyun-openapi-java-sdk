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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.QueryXpackRelateDBResponse;
import com.aliyuncs.hbase.model.v20190101.QueryXpackRelateDBResponse.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryXpackRelateDBResponseUnmarshaller {

	public static QueryXpackRelateDBResponse unmarshall(QueryXpackRelateDBResponse queryXpackRelateDBResponse, UnmarshallerContext _ctx) {
		
		queryXpackRelateDBResponse.setRequestId(_ctx.stringValue("QueryXpackRelateDBResponse.RequestId"));

		List<Cluster> clusterList = new ArrayList<Cluster>();
		for (int i = 0; i < _ctx.lengthValue("QueryXpackRelateDBResponse.ClusterList.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setClusterId(_ctx.stringValue("QueryXpackRelateDBResponse.ClusterList["+ i +"].ClusterId"));
			cluster.setClusterName(_ctx.stringValue("QueryXpackRelateDBResponse.ClusterList["+ i +"].ClusterName"));
			cluster.setDBVersion(_ctx.stringValue("QueryXpackRelateDBResponse.ClusterList["+ i +"].DBVersion"));
			cluster.setStatus(_ctx.stringValue("QueryXpackRelateDBResponse.ClusterList["+ i +"].Status"));
			cluster.setDBType(_ctx.stringValue("QueryXpackRelateDBResponse.ClusterList["+ i +"].DBType"));
			cluster.setIsRelated(_ctx.booleanValue("QueryXpackRelateDBResponse.ClusterList["+ i +"].IsRelated"));
			cluster.setLockMode(_ctx.stringValue("QueryXpackRelateDBResponse.ClusterList["+ i +"].LockMode"));

			clusterList.add(cluster);
		}
		queryXpackRelateDBResponse.setClusterList(clusterList);
	 
	 	return queryXpackRelateDBResponse;
	}
}