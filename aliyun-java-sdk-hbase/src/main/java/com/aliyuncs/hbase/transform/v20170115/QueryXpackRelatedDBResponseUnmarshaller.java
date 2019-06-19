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

package com.aliyuncs.hbase.transform.v20170115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20170115.QueryXpackRelatedDBResponse;
import com.aliyuncs.hbase.model.v20170115.QueryXpackRelatedDBResponse.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryXpackRelatedDBResponseUnmarshaller {

	public static QueryXpackRelatedDBResponse unmarshall(QueryXpackRelatedDBResponse queryXpackRelatedDBResponse, UnmarshallerContext context) {
		
		queryXpackRelatedDBResponse.setRequestId(context.stringValue("QueryXpackRelatedDBResponse.RequestId"));
		queryXpackRelatedDBResponse.setPageNumber(context.integerValue("QueryXpackRelatedDBResponse.PageNumber"));
		queryXpackRelatedDBResponse.setPageSize(context.integerValue("QueryXpackRelatedDBResponse.PageSize"));
		queryXpackRelatedDBResponse.setTotalCount(context.integerValue("QueryXpackRelatedDBResponse.TotalCount"));

		List<Cluster> clusterList = new ArrayList<Cluster>();
		for (int i = 0; i < context.lengthValue("QueryXpackRelatedDBResponse.ClusterList.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setClusterId(context.stringValue("QueryXpackRelatedDBResponse.ClusterList["+ i +"].ClusterId"));
			cluster.setClusterName(context.stringValue("QueryXpackRelatedDBResponse.ClusterList["+ i +"].ClusterName"));
			cluster.setDBVersion(context.stringValue("QueryXpackRelatedDBResponse.ClusterList["+ i +"].DBVersion"));
			cluster.setStatus(context.stringValue("QueryXpackRelatedDBResponse.ClusterList["+ i +"].Status"));
			cluster.setDBType(context.stringValue("QueryXpackRelatedDBResponse.ClusterList["+ i +"].DBType"));
			cluster.setIsRelated(context.booleanValue("QueryXpackRelatedDBResponse.ClusterList["+ i +"].IsRelated"));

			clusterList.add(cluster);
		}
		queryXpackRelatedDBResponse.setClusterList(clusterList);
	 
	 	return queryXpackRelatedDBResponse;
	}
}