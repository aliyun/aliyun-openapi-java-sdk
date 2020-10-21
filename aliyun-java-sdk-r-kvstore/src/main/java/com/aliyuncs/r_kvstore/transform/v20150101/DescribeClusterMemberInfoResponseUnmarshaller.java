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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeClusterMemberInfoResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeClusterMemberInfoResponse.Children;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterMemberInfoResponseUnmarshaller {

	public static DescribeClusterMemberInfoResponse unmarshall(DescribeClusterMemberInfoResponse describeClusterMemberInfoResponse, UnmarshallerContext _ctx) {
		
		describeClusterMemberInfoResponse.setRequestId(_ctx.stringValue("DescribeClusterMemberInfoResponse.RequestId"));

		List<Children> clusterChildren = new ArrayList<Children>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterMemberInfoResponse.ClusterChildren.Length"); i++) {
			Children children = new Children();
			children.setId(_ctx.longValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Id"));
			children.setName(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Name"));
			children.setBizType(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].BizType"));
			children.setReplicaSize(_ctx.integerValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].ReplicaSize"));
			children.setModifier(_ctx.integerValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Modifier"));
			children.setServiceVersion(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].ServiceVersion"));
			children.setConnType(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].ConnType"));
			children.setDiskSizeMB(_ctx.integerValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].DiskSizeMB"));
			children.setInsType(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].InsType"));
			children.setNickname(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Nickname"));
			children.setPrimaryInsName(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].PrimaryInsName"));
			children.setClassCode(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].ClassCode"));
			children.setCreator(_ctx.integerValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Creator"));
			children.setResourceGroupName(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].ResourceGroupName"));
			children.setLockMode(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].LockMode"));
			children.setHealth(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Health"));
			children.setBinlogRetentionDays(_ctx.integerValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].BinlogRetentionDays"));
			children.setUserId(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].UserId"));
			children.setLockReason(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].LockReason"));
			children.setService(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Service"));
			children.setCapacity(_ctx.longValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Capacity"));
			children.setBandWidth(_ctx.longValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].BandWidth"));
			children.setConnections(_ctx.longValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Connections"));

			clusterChildren.add(children);
		}
		describeClusterMemberInfoResponse.setClusterChildren(clusterChildren);
	 
	 	return describeClusterMemberInfoResponse;
	}
}