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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeClusterTagsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeClusterTagsResponse.ClusterTag;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeClusterTagsResponse.ClusterTag.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeClusterTagsResponseUnmarshaller {

	public static OpsDescribeClusterTagsResponse unmarshall(OpsDescribeClusterTagsResponse opsDescribeClusterTagsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeClusterTagsResponse.setRequestId(_ctx.stringValue("OpsDescribeClusterTagsResponse.RequestId"));
		opsDescribeClusterTagsResponse.setMessage(_ctx.stringValue("OpsDescribeClusterTagsResponse.Message"));
		opsDescribeClusterTagsResponse.setCode(_ctx.stringValue("OpsDescribeClusterTagsResponse.Code"));
		opsDescribeClusterTagsResponse.setSuccess(_ctx.stringValue("OpsDescribeClusterTagsResponse.Success"));

		List<ClusterTag> data = new ArrayList<ClusterTag>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeClusterTagsResponse.Data.Length"); i++) {
			ClusterTag clusterTag = new ClusterTag();
			clusterTag.setCluster(_ctx.stringValue("OpsDescribeClusterTagsResponse.Data["+ i +"].Cluster"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeClusterTagsResponse.Data["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("OpsDescribeClusterTagsResponse.Data["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("OpsDescribeClusterTagsResponse.Data["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			clusterTag.setTags(tags);

			data.add(clusterTag);
		}
		opsDescribeClusterTagsResponse.setData(data);
	 
	 	return opsDescribeClusterTagsResponse;
	}
}