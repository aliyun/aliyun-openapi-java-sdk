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

import com.aliyuncs.cs.model.v20151215.DescribeClustersResponse;
import com.aliyuncs.cs.model.v20151215.DescribeClustersResponse.ClusterDetail;
import com.aliyuncs.cs.model.v20151215.DescribeClustersResponse.ClusterDetail.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClustersResponseUnmarshaller {

	public static DescribeClustersResponse unmarshall(DescribeClustersResponse describeClustersResponse, UnmarshallerContext _ctx) {
		

		List<ClusterDetail> clusters = new ArrayList<ClusterDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClustersResponse.clusters.Length"); i++) {
			ClusterDetail clusterDetail = new ClusterDetail();
			clusterDetail.setName(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].name"));
			clusterDetail.setCluster_id(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].cluster_id"));
			clusterDetail.setRegion_id(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].region_id"));
			clusterDetail.setState(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].state"));
			clusterDetail.setCluster_type(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].cluster_type"));
			clusterDetail.setCurrent_version(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].current_version"));
			clusterDetail.setMeta_data(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].meta_data"));
			clusterDetail.setResource_group_id(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].resource_group_id"));
			clusterDetail.setVpc_id(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].vpc_id"));
			clusterDetail.setVswitch_id(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].vswitch_id"));
			clusterDetail.setVswitch_cidr(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].vswitch_cidr"));
			clusterDetail.setData_disk_size(_ctx.integerValue("DescribeClustersResponse.clusters["+ i +"].data_disk_size"));
			clusterDetail.setData_disk_category(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].data_disk_category"));
			clusterDetail.setSecurity_group_id(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].security_group_id"));
			clusterDetail.setZone_id(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].zone_id"));
			clusterDetail.setNetwork_mode(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].network_mode"));
			clusterDetail.setMaster_url(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].master_url"));
			clusterDetail.setDocker_version(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].docker_version"));
			clusterDetail.setDeletion_protection(_ctx.booleanValue("DescribeClustersResponse.clusters["+ i +"].deletion_protection"));
			clusterDetail.setExternal_loadbalancer_id(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].external_loadbalancer_id"));
			clusterDetail.setCreated(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].created"));
			clusterDetail.setUpdated(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].updated"));
			clusterDetail.setSize(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].size"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClustersResponse.clusters["+ i +"].tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].tags["+ j +"].key"));
				tagsItem.setValue(_ctx.stringValue("DescribeClustersResponse.clusters["+ i +"].tags["+ j +"].value"));

				tags.add(tagsItem);
			}
			clusterDetail.setTags(tags);

			clusters.add(clusterDetail);
		}
		describeClustersResponse.setClusters(clusters);
	 
	 	return describeClustersResponse;
	}
}