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
import com.aliyuncs.cs.model.v20151215.DescribeClustersV1Response.ClustersItem.TagsItem;
import com.aliyuncs.cs.model.v20151215.DescribeClustersV1Response.Page_info;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClustersV1ResponseUnmarshaller {

	public static DescribeClustersV1Response unmarshall(DescribeClustersV1Response describeClustersV1Response, UnmarshallerContext _ctx) {
		

		Page_info page_info = new Page_info();
		page_info.setPage_number(_ctx.integerValue("DescribeClustersV1Response.page_info.page_number"));
		page_info.setTotal_count(_ctx.integerValue("DescribeClustersV1Response.page_info.total_count"));
		page_info.setPage_size(_ctx.integerValue("DescribeClustersV1Response.page_info.page_size"));
		describeClustersV1Response.setPage_info(page_info);

		List<ClustersItem> clusters = new ArrayList<ClustersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClustersV1Response.clusters.Length"); i++) {
			ClustersItem clustersItem = new ClustersItem();
			clustersItem.setResource_group_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].resource_group_id"));
			clustersItem.setPrivate_zone(_ctx.booleanValue("DescribeClustersV1Response.clusters["+ i +"].private_zone"));
			clustersItem.setVpc_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].vpc_id"));
			clustersItem.setNetwork_mode(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].network_mode"));
			clustersItem.setSecurity_group_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].security_group_id"));
			clustersItem.setCluster_type(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].cluster_type"));
			clustersItem.setDocker_version(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].docker_version"));
			clustersItem.setData_disk_category(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].data_disk_category"));
			clustersItem.setZone_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].zone_id"));
			clustersItem.setCluster_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].cluster_id"));
			clustersItem.setExternal_loadbalancer_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].external_loadbalancer_id"));
			clustersItem.setVswitch_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].vswitch_id"));
			clustersItem.setMeta_data(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].meta_data"));
			clustersItem.setState(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].state"));
			clustersItem.setInit_version(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].init_version"));
			clustersItem.setNode_status(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].node_status"));
			clustersItem.setDeletion_protection(_ctx.booleanValue("DescribeClustersV1Response.clusters["+ i +"].deletion_protection"));
			clustersItem.setCreated(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].created"));
			clustersItem.setSubnet_cidr(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].subnet_cidr"));
			clustersItem.setProfile(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].profile"));
			clustersItem.setRegion_id(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].region_id"));
			clustersItem.setMaster_url(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].master_url"));
			clustersItem.setCurrent_version(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].current_version"));
			clustersItem.setVswitch_cidr(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].vswitch_cidr"));
			clustersItem.setCluster_healthy(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].cluster_healthy"));
			clustersItem.setSize(_ctx.longValue("DescribeClustersV1Response.clusters["+ i +"].size"));
			clustersItem.setData_disk_size(_ctx.longValue("DescribeClustersV1Response.clusters["+ i +"].data_disk_size"));
			clustersItem.setName(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].name"));
			clustersItem.setWorker_ram_role_name(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].worker_ram_role_name"));
			clustersItem.setUpdated(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].updated"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClustersV1Response.clusters["+ i +"].tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setValue(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].tags["+ j +"].value"));
				tagsItem.setKey(_ctx.stringValue("DescribeClustersV1Response.clusters["+ i +"].tags["+ j +"].key"));

				tags.add(tagsItem);
			}
			clustersItem.setTags(tags);

			clusters.add(clustersItem);
		}
		describeClustersV1Response.setClusters(clusters);
	 
	 	return describeClustersV1Response;
	}
}