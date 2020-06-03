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

import com.aliyuncs.cassandra.model.v20190101.DescribeClusterResponse;
import com.aliyuncs.cassandra.model.v20190101.DescribeClusterResponse.Cluster;
import com.aliyuncs.cassandra.model.v20190101.DescribeClusterResponse.Cluster.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterResponseUnmarshaller {

	public static DescribeClusterResponse unmarshall(DescribeClusterResponse describeClusterResponse, UnmarshallerContext _ctx) {
		
		describeClusterResponse.setRequestId(_ctx.stringValue("DescribeClusterResponse.RequestId"));

		Cluster cluster = new Cluster();
		cluster.setClusterId(_ctx.stringValue("DescribeClusterResponse.Cluster.ClusterId"));
		cluster.setClusterName(_ctx.stringValue("DescribeClusterResponse.Cluster.ClusterName"));
		cluster.setStatus(_ctx.stringValue("DescribeClusterResponse.Cluster.Status"));
		cluster.setPayType(_ctx.stringValue("DescribeClusterResponse.Cluster.PayType"));
		cluster.setCreatedTime(_ctx.stringValue("DescribeClusterResponse.Cluster.CreatedTime"));
		cluster.setExpireTime(_ctx.stringValue("DescribeClusterResponse.Cluster.ExpireTime"));
		cluster.setMajorVersion(_ctx.stringValue("DescribeClusterResponse.Cluster.MajorVersion"));
		cluster.setMinorVersion(_ctx.stringValue("DescribeClusterResponse.Cluster.MinorVersion"));
		cluster.setDataCenterCount(_ctx.integerValue("DescribeClusterResponse.Cluster.DataCenterCount"));
		cluster.setIsLatestVersion(_ctx.booleanValue("DescribeClusterResponse.Cluster.IsLatestVersion"));
		cluster.setMaintainStartTime(_ctx.stringValue("DescribeClusterResponse.Cluster.MaintainStartTime"));
		cluster.setMaintainEndTime(_ctx.stringValue("DescribeClusterResponse.Cluster.MaintainEndTime"));
		cluster.setLockMode(_ctx.stringValue("DescribeClusterResponse.Cluster.LockMode"));
		cluster.setAutoRenewal(_ctx.booleanValue("DescribeClusterResponse.Cluster.AutoRenewal"));
		cluster.setAutoRenewPeriod(_ctx.integerValue("DescribeClusterResponse.Cluster.AutoRenewPeriod"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterResponse.Cluster.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeClusterResponse.Cluster.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeClusterResponse.Cluster.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		cluster.setTags(tags);
		describeClusterResponse.setCluster(cluster);
	 
	 	return describeClusterResponse;
	}
}