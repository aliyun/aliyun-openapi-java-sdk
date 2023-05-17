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
import com.aliyuncs.cs.model.v20151215.DescribeClusterDetailResponse.Maintenance_window;
import com.aliyuncs.cs.model.v20151215.DescribeClusterDetailResponse.TagsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterDetailResponseUnmarshaller {

	public static DescribeClusterDetailResponse unmarshall(DescribeClusterDetailResponse describeClusterDetailResponse, UnmarshallerContext _ctx) {
		
		describeClusterDetailResponse.setCluster_id(_ctx.stringValue("DescribeClusterDetailResponse.cluster_id"));
		describeClusterDetailResponse.setCluster_type(_ctx.stringValue("DescribeClusterDetailResponse.cluster_type"));
		describeClusterDetailResponse.setCreated(_ctx.stringValue("DescribeClusterDetailResponse.created"));
		describeClusterDetailResponse.setInit_version(_ctx.stringValue("DescribeClusterDetailResponse.init_version"));
		describeClusterDetailResponse.setCurrent_version(_ctx.stringValue("DescribeClusterDetailResponse.current_version"));
		describeClusterDetailResponse.setNext_version(_ctx.stringValue("DescribeClusterDetailResponse.next_version"));
		describeClusterDetailResponse.setDeletion_protection(_ctx.booleanValue("DescribeClusterDetailResponse.deletion_protection"));
		describeClusterDetailResponse.setDocker_version(_ctx.stringValue("DescribeClusterDetailResponse.docker_version"));
		describeClusterDetailResponse.setExternal_loadbalancer_id(_ctx.stringValue("DescribeClusterDetailResponse.external_loadbalancer_id"));
		describeClusterDetailResponse.setMeta_data(_ctx.stringValue("DescribeClusterDetailResponse.meta_data"));
		describeClusterDetailResponse.setName(_ctx.stringValue("DescribeClusterDetailResponse.name"));
		describeClusterDetailResponse.setNetwork_mode(_ctx.stringValue("DescribeClusterDetailResponse.network_mode"));
		describeClusterDetailResponse.setRegion_id(_ctx.stringValue("DescribeClusterDetailResponse.region_id"));
		describeClusterDetailResponse.setResource_group_id(_ctx.stringValue("DescribeClusterDetailResponse.resource_group_id"));
		describeClusterDetailResponse.setSecurity_group_id(_ctx.stringValue("DescribeClusterDetailResponse.security_group_id"));
		describeClusterDetailResponse.setSize(_ctx.longValue("DescribeClusterDetailResponse.size"));
		describeClusterDetailResponse.setState(_ctx.stringValue("DescribeClusterDetailResponse.state"));
		describeClusterDetailResponse.setUpdated(_ctx.stringValue("DescribeClusterDetailResponse.updated"));
		describeClusterDetailResponse.setVpc_id(_ctx.stringValue("DescribeClusterDetailResponse.vpc_id"));
		describeClusterDetailResponse.setVswitch_id(_ctx.stringValue("DescribeClusterDetailResponse.vswitch_id"));
		describeClusterDetailResponse.setSubnet_cidr(_ctx.stringValue("DescribeClusterDetailResponse.subnet_cidr"));
		describeClusterDetailResponse.setZone_id(_ctx.stringValue("DescribeClusterDetailResponse.zone_id"));
		describeClusterDetailResponse.setMaster_url(_ctx.stringValue("DescribeClusterDetailResponse.master_url"));
		describeClusterDetailResponse.setPrivate_zone(_ctx.booleanValue("DescribeClusterDetailResponse.private_zone"));
		describeClusterDetailResponse.setProfile(_ctx.stringValue("DescribeClusterDetailResponse.profile"));
		describeClusterDetailResponse.setCluster_spec(_ctx.stringValue("DescribeClusterDetailResponse.cluster_spec"));
		describeClusterDetailResponse.setWorker_ram_role_name(_ctx.stringValue("DescribeClusterDetailResponse.worker_ram_role_name"));
		describeClusterDetailResponse.setParameters(_ctx.mapValue("DescribeClusterDetailResponse.parameters"));

		Maintenance_window maintenance_window = new Maintenance_window();
		maintenance_window.setEnable(_ctx.booleanValue("DescribeClusterDetailResponse.maintenance_window.enable"));
		maintenance_window.setMaintenance_time(_ctx.stringValue("DescribeClusterDetailResponse.maintenance_window.maintenance_time"));
		maintenance_window.setDuration(_ctx.stringValue("DescribeClusterDetailResponse.maintenance_window.duration"));
		maintenance_window.setWeekly_period(_ctx.stringValue("DescribeClusterDetailResponse.maintenance_window.weekly_period"));
		describeClusterDetailResponse.setMaintenance_window(maintenance_window);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterDetailResponse.tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("DescribeClusterDetailResponse.tags["+ i +"].key"));
			tagsItem.setValue(_ctx.stringValue("DescribeClusterDetailResponse.tags["+ i +"].value"));

			tags.add(tagsItem);
		}
		describeClusterDetailResponse.setTags(tags);
	 
	 	return describeClusterDetailResponse;
	}
}