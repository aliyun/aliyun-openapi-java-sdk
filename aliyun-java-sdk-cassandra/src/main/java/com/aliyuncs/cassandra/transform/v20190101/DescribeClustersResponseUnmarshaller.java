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

package com.aliyuncs.cassandra.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cassandra.model.v20190101.DescribeClustersResponse;
import com.aliyuncs.cassandra.model.v20190101.DescribeClustersResponse.Cluster;
import com.aliyuncs.cassandra.model.v20190101.DescribeClustersResponse.Cluster.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClustersResponseUnmarshaller {

	public static DescribeClustersResponse unmarshall(DescribeClustersResponse describeClustersResponse, UnmarshallerContext _ctx) {
		
		describeClustersResponse.setRequestId(_ctx.stringValue("DescribeClustersResponse.RequestId"));
		describeClustersResponse.setTotalCount(_ctx.longValue("DescribeClustersResponse.TotalCount"));
		describeClustersResponse.setPageNumber(_ctx.integerValue("DescribeClustersResponse.PageNumber"));
		describeClustersResponse.setPageSize(_ctx.integerValue("DescribeClustersResponse.PageSize"));

		List<Cluster> clusters = new ArrayList<Cluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClustersResponse.Clusters.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setClusterId(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].ClusterId"));
			cluster.setClusterName(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].ClusterName"));
			cluster.setStatus(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].Status"));
			cluster.setPayType(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].PayType"));
			cluster.setCreatedTime(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].CreatedTime"));
			cluster.setExpireTime(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].ExpireTime"));
			cluster.setMajorVersion(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].MajorVersion"));
			cluster.setMinorVersion(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].MinorVersion"));
			cluster.setDataCenterCount(_ctx.integerValue("DescribeClustersResponse.Clusters["+ i +"].DataCenterCount"));
			cluster.setLockMode(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].LockMode"));
			cluster.setAutoRenewal(_ctx.booleanValue("DescribeClustersResponse.Clusters["+ i +"].AutoRenewal"));
			cluster.setAutoRenewPeriod(_ctx.integerValue("DescribeClustersResponse.Clusters["+ i +"].AutoRenewPeriod"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClustersResponse.Clusters["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			cluster.setTags(tags);

			clusters.add(cluster);
		}
		describeClustersResponse.setClusters(clusters);
	 
	 	return describeClustersResponse;
	}
}