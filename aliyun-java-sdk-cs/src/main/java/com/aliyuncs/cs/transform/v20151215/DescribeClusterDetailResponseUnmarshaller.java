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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.DescribeClusterDetailResponse;
import com.aliyuncs.cs.model.v20151215.DescribeClusterDetailResponse.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterDetailResponseUnmarshaller {

	public static DescribeClusterDetailResponse unmarshall(DescribeClusterDetailResponse describeClusterDetailResponse, UnmarshallerContext _ctx) {
		
		describeClusterDetailResponse.setResource_group_id(_ctx.stringValue("DescribeClusterDetailResponse.resource_group_id"));
		describeClusterDetailResponse.setVpc_id(_ctx.stringValue("DescribeClusterDetailResponse.vpc_id"));
		describeClusterDetailResponse.setDeletion_protection(_ctx.booleanValue("DescribeClusterDetailResponse.deletion_protection"));
		describeClusterDetailResponse.setCreated(_ctx.stringValue("DescribeClusterDetailResponse.created"));
		describeClusterDetailResponse.setNetwork_mode(_ctx.stringValue("DescribeClusterDetailResponse.network_mode"));
		describeClusterDetailResponse.setRegion_id(_ctx.stringValue("DescribeClusterDetailResponse.region_id"));
		describeClusterDetailResponse.setSecurity_group_id(_ctx.stringValue("DescribeClusterDetailResponse.security_group_id"));
		describeClusterDetailResponse.setCurrent_version(_ctx.stringValue("DescribeClusterDetailResponse.current_version"));
		describeClusterDetailResponse.setCluster_type(_ctx.stringValue("DescribeClusterDetailResponse.cluster_type"));
		describeClusterDetailResponse.setDocker_version(_ctx.stringValue("DescribeClusterDetailResponse.docker_version"));
		describeClusterDetailResponse.setVswitch_cidr(_ctx.stringValue("DescribeClusterDetailResponse.vswitch_cidr"));
		describeClusterDetailResponse.setZone_id(_ctx.stringValue("DescribeClusterDetailResponse.zone_id"));
		describeClusterDetailResponse.setCluster_id(_ctx.stringValue("DescribeClusterDetailResponse.cluster_id"));
		describeClusterDetailResponse.setSize(_ctx.integerValue("DescribeClusterDetailResponse.size"));
		describeClusterDetailResponse.setExternal_loadbalancer_id(_ctx.stringValue("DescribeClusterDetailResponse.external_loadbalancer_id"));
		describeClusterDetailResponse.setVswitch_id(_ctx.stringValue("DescribeClusterDetailResponse.vswitch_id"));
		describeClusterDetailResponse.setName(_ctx.stringValue("DescribeClusterDetailResponse.name"));
		describeClusterDetailResponse.setMeta_data(_ctx.stringValue("DescribeClusterDetailResponse.meta_data"));
		describeClusterDetailResponse.setState(_ctx.stringValue("DescribeClusterDetailResponse.state"));
		describeClusterDetailResponse.setUpdated(_ctx.stringValue("DescribeClusterDetailResponse.updated"));
		describeClusterDetailResponse.setInstance_type(_ctx.stringValue("DescribeClusterDetailResponse.instance_type"));

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterDetailResponse.tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setValue(_ctx.stringValue("DescribeClusterDetailResponse.tags["+ i +"].value"));
			tagsItem.setKey(_ctx.stringValue("DescribeClusterDetailResponse.tags["+ i +"].key"));

			tags.add(tagsItem);
		}
		describeClusterDetailResponse.setTags(tags);
	 
	 	return describeClusterDetailResponse;
	}
}