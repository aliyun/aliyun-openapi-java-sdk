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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeTairKVCacheInferInstancesResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeTairKVCacheInferInstancesResponse.TairInferInstanceDTO;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeTairKVCacheInferInstancesResponse.TairInferInstanceDTO.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTairKVCacheInferInstancesResponseUnmarshaller {

	public static DescribeTairKVCacheInferInstancesResponse unmarshall(DescribeTairKVCacheInferInstancesResponse describeTairKVCacheInferInstancesResponse, UnmarshallerContext _ctx) {
		
		describeTairKVCacheInferInstancesResponse.setRequestId(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.RequestId"));
		describeTairKVCacheInferInstancesResponse.setPageNumber(_ctx.integerValue("DescribeTairKVCacheInferInstancesResponse.PageNumber"));
		describeTairKVCacheInferInstancesResponse.setPageSize(_ctx.integerValue("DescribeTairKVCacheInferInstancesResponse.PageSize"));
		describeTairKVCacheInferInstancesResponse.setTotalCount(_ctx.integerValue("DescribeTairKVCacheInferInstancesResponse.TotalCount"));

		List<TairInferInstanceDTO> instances = new ArrayList<TairInferInstanceDTO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTairKVCacheInferInstancesResponse.Instances.Length"); i++) {
			TairInferInstanceDTO tairInferInstanceDTO = new TairInferInstanceDTO();
			tairInferInstanceDTO.setVpcId(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].VpcId"));
			tairInferInstanceDTO.setCreateTime(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].CreateTime"));
			tairInferInstanceDTO.setChargeType(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].ChargeType"));
			tairInferInstanceDTO.setNetworkType(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].NetworkType"));
			tairInferInstanceDTO.setInstanceName(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].InstanceName"));
			tairInferInstanceDTO.setInstanceClass(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].InstanceClass"));
			tairInferInstanceDTO.setDestroyTime(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].DestroyTime"));
			tairInferInstanceDTO.setInstanceId(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].InstanceId"));
			tairInferInstanceDTO.setInstanceType(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].InstanceType"));
			tairInferInstanceDTO.setRegionId(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].RegionId"));
			tairInferInstanceDTO.setEndTime(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].EndTime"));
			tairInferInstanceDTO.setVSwitchId(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].VSwitchId"));
			tairInferInstanceDTO.setResourceGroupId(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].ResourceGroupId"));
			tairInferInstanceDTO.setZoneId(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].ZoneId"));
			tairInferInstanceDTO.setInstanceStatus(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].InstanceStatus"));
			tairInferInstanceDTO.setPrivateIp(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].PrivateIp"));
			tairInferInstanceDTO.setCapacity(_ctx.longValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].Capacity"));
			tairInferInstanceDTO.setModel(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].Model"));
			tairInferInstanceDTO.setModelServiceNum(_ctx.integerValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].ModelServiceNum"));
			tairInferInstanceDTO.setComputeUnitNum(_ctx.integerValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].ComputeUnitNum"));
			tairInferInstanceDTO.setVNodeName(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].VNodeName"));
			tairInferInstanceDTO.setAckId(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].AckId"));
			tairInferInstanceDTO.setVNodeCount(_ctx.integerValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].VNodeCount"));
			tairInferInstanceDTO.setFixedVNodeCount(_ctx.integerValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].FixedVNodeCount"));
			tairInferInstanceDTO.setElasticVNodeCount(_ctx.integerValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].ElasticVNodeCount"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeTairKVCacheInferInstancesResponse.Instances["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			tairInferInstanceDTO.setTags(tags);

			instances.add(tairInferInstanceDTO);
		}
		describeTairKVCacheInferInstancesResponse.setInstances(instances);
	 
	 	return describeTairKVCacheInferInstancesResponse;
	}
}