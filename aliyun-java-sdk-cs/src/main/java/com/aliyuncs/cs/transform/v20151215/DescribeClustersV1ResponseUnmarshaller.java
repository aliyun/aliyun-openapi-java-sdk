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

import com.aliyuncs.cs.model.v20151215.DescribeClustersV1Response;
import com.aliyuncs.cs.model.v20151215.DescribeClustersV1Response.ClustersItem;
import com.aliyuncs.cs.model.v20151215.DescribeClustersV1Response.ClustersItem.Maintenance_window;
import com.aliyuncs.cs.model.v20151215.DescribeClustersV1Response.ClustersItem.TagsItem;
import com.aliyuncs.cs.model.v20151215.DescribeClustersV1Response.Page_info;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClustersV1ResponseUnmarshaller {

	public static DescribeClustersV1Response unmarshall(DescribeClustersV1Response describeClustersV1Response, UnmarshallerContext _ctx) {
		

		Page_info page_info = new Page_info();
		page_info.setPage_number(_ctx.integerValue("DescribeClustersV1Response.page_info.page_number"));
		page_info.setPage_size(_ctx.integerValue("DescribeClustersV1Response.page_info.page_size"));
		page_info.setTotal_count(_ctx.integerValue("DescribeClustersV1Response.page_info.total_count"));
		describeClustersV1Response.setPage_info(page_info);

		List<ClustersItem> clusters = new ArrayList<ClustersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClustersV1Response.clusters.Length"); i++) {
			ClustersItem clustersItem = new ClustersItem();
			clustersItem.setCluster_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].cluster_id"));
			clustersItem.setCluster_type(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].cluster_type"));
			clustersItem.setCreated(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].created"));
			clustersItem.setInit_version(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].init_version"));
			clustersItem.setCurrent_version(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].current_version"));
			clustersItem.setNext_version(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].next_version"));
			clustersItem.setDeletion_protection(_ctx.booleanValue("DescribeClustersV1Response.clusters["+ i +"].deletion_protection"));
			clustersItem.setDocker_version(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].docker_version"));
			clustersItem.setExternal_loadbalancer_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].external_loadbalancer_id"));
			clustersItem.setMaster_url(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].master_url"));
			clustersItem.setMeta_data(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].meta_data"));
			clustersItem.setName(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].name"));
			clustersItem.setNetwork_mode(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].network_mode"));
			clustersItem.setPrivate_zone(_ctx.booleanValue("DescribeClustersV1Response.clusters["+ i +"].private_zone"));
			clustersItem.setProfile(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].profile"));
			clustersItem.setRegion_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].region_id"));
			clustersItem.setResource_group_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].resource_group_id"));
			clustersItem.setSecurity_group_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].security_group_id"));
			clustersItem.setSize(_ctx.longValue("DescribeClustersV1Response.clusters["+ i +"].size"));
			clustersItem.setState(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].state"));
			clustersItem.setSubnet_cidr(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].subnet_cidr"));
			clustersItem.setUpdated(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].updated"));
			clustersItem.setVpc_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].vpc_id"));
			clustersItem.setVswitch_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].vswitch_id"));
			clustersItem.setWorker_ram_role_name(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].worker_ram_role_name"));
			clustersItem.setZone_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].zone_id"));
			clustersItem.setCluster_spec(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].cluster_spec"));

			Maintenance_window maintenance_window = new Maintenance_window();
			maintenance_window.setEnable(_ctx.booleanValue("DescribeClustersV1Response.clusters["+ i +"].maintenance_window.enable"));
			maintenance_window.setMaintenance_time(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].maintenance_window.maintenance_time"));
			maintenance_window.setDuration(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].maintenance_window.duration"));
			maintenance_window.setWeekly_period(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].maintenance_window.weekly_period"));
			clustersItem.setMaintenance_window(maintenance_window);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClustersV1Response.clusters["+ i +"].tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].tags["+ j +"].key"));
				tagsItem.setValue(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].tags["+ j +"].value"));

				tags.add(tagsItem);
			}
			clustersItem.setTags(tags);

			clusters.add(clustersItem);
		}
		describeClustersV1Response.setClusters(clusters);
	 
	 	return describeClustersV1Response;
	}
}