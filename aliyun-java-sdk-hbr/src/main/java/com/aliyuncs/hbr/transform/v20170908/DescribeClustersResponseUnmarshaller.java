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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeClustersResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeClustersResponse.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClustersResponseUnmarshaller {

	public static DescribeClustersResponse unmarshall(DescribeClustersResponse describeClustersResponse, UnmarshallerContext _ctx) {
		
		describeClustersResponse.setRequestId(_ctx.stringValue("DescribeClustersResponse.RequestId"));
		describeClustersResponse.setSuccess(_ctx.booleanValue("DescribeClustersResponse.Success"));
		describeClustersResponse.setCode(_ctx.stringValue("DescribeClustersResponse.Code"));
		describeClustersResponse.setMessage(_ctx.stringValue("DescribeClustersResponse.Message"));
		describeClustersResponse.setTotalCount(_ctx.longValue("DescribeClustersResponse.TotalCount"));
		describeClustersResponse.setPageSize(_ctx.integerValue("DescribeClustersResponse.PageSize"));
		describeClustersResponse.setPageNumber(_ctx.integerValue("DescribeClustersResponse.PageNumber"));

		List<Cluster> clusters = new ArrayList<Cluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClustersResponse.Clusters.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setCreatedTime(_ctx.longValue("DescribeClustersResponse.Clusters["+ i +"].CreatedTime"));
			cluster.setUpdatedTime(_ctx.longValue("DescribeClustersResponse.Clusters["+ i +"].UpdatedTime"));
			cluster.setClusterId(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].ClusterId"));
			cluster.setClusterName(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].ClusterName"));

			clusters.add(cluster);
		}
		describeClustersResponse.setClusters(clusters);
	 
	 	return describeClustersResponse;
	}
}