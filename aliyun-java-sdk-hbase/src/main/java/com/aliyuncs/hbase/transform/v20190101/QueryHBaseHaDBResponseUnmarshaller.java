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

import com.aliyuncs.hbase.model.v20190101.QueryHBaseHaDBResponse;
import com.aliyuncs.hbase.model.v20190101.QueryHBaseHaDBResponse.Cluster;
import com.aliyuncs.hbase.model.v20190101.QueryHBaseHaDBResponse.Cluster.HaSlbConn;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryHBaseHaDBResponseUnmarshaller {

	public static QueryHBaseHaDBResponse unmarshall(QueryHBaseHaDBResponse queryHBaseHaDBResponse, UnmarshallerContext _ctx) {
		
		queryHBaseHaDBResponse.setRequestId(_ctx.stringValue("QueryHBaseHaDBResponse.RequestId"));
		queryHBaseHaDBResponse.setTotalCount(_ctx.longValue("QueryHBaseHaDBResponse.TotalCount"));
		queryHBaseHaDBResponse.setPageNumber(_ctx.integerValue("QueryHBaseHaDBResponse.PageNumber"));
		queryHBaseHaDBResponse.setPageSize(_ctx.integerValue("QueryHBaseHaDBResponse.PageSize"));

		List<Cluster> clusterList = new ArrayList<Cluster>();
		for (int i = 0; i < _ctx.lengthValue("QueryHBaseHaDBResponse.ClusterList.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setHaName(_ctx.stringValue("QueryHBaseHaDBResponse.ClusterList["+ i +"].HaName"));
			cluster.setBdsName(_ctx.stringValue("QueryHBaseHaDBResponse.ClusterList["+ i +"].BdsName"));
			cluster.setActiveName(_ctx.stringValue("QueryHBaseHaDBResponse.ClusterList["+ i +"].ActiveName"));
			cluster.setStandbyName(_ctx.stringValue("QueryHBaseHaDBResponse.ClusterList["+ i +"].StandbyName"));

			List<HaSlbConn> haSlbConnList = new ArrayList<HaSlbConn>();
			for (int j = 0; j < _ctx.lengthValue("QueryHBaseHaDBResponse.ClusterList["+ i +"].HaSlbConnList.Length"); j++) {
				HaSlbConn haSlbConn = new HaSlbConn();
				haSlbConn.setSlbType(_ctx.stringValue("QueryHBaseHaDBResponse.ClusterList["+ i +"].HaSlbConnList["+ j +"].SlbType"));
				haSlbConn.setSlbConnAddr(_ctx.stringValue("QueryHBaseHaDBResponse.ClusterList["+ i +"].HaSlbConnList["+ j +"].SlbConnAddr"));
				haSlbConn.setHbaseType(_ctx.stringValue("QueryHBaseHaDBResponse.ClusterList["+ i +"].HaSlbConnList["+ j +"].HbaseType"));

				haSlbConnList.add(haSlbConn);
			}
			cluster.setHaSlbConnList(haSlbConnList);

			clusterList.add(cluster);
		}
		queryHBaseHaDBResponse.setClusterList(clusterList);
	 
	 	return queryHBaseHaDBResponse;
	}
}