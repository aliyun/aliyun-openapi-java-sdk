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

package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.DescribeElasticStrengthResponse;
import com.aliyuncs.ess.model.v20140828.DescribeElasticStrengthResponse.ElasticStrengthModel;
import com.aliyuncs.ess.model.v20140828.DescribeElasticStrengthResponse.ElasticStrengthModel.ResourcePool2;
import com.aliyuncs.ess.model.v20140828.DescribeElasticStrengthResponse.ElasticStrengthModel.ResourcePool2.InventoryHealth4;
import com.aliyuncs.ess.model.v20140828.DescribeElasticStrengthResponse.ResourcePool;
import com.aliyuncs.ess.model.v20140828.DescribeElasticStrengthResponse.ResourcePool.InventoryHealth;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeElasticStrengthResponseUnmarshaller {

	public static DescribeElasticStrengthResponse unmarshall(DescribeElasticStrengthResponse describeElasticStrengthResponse, UnmarshallerContext _ctx) {
		
		describeElasticStrengthResponse.setRequestId(_ctx.stringValue("DescribeElasticStrengthResponse.RequestId"));
		describeElasticStrengthResponse.setTotalStrength(_ctx.doubleValue("DescribeElasticStrengthResponse.TotalStrength"));
		describeElasticStrengthResponse.setElasticStrength(_ctx.stringValue("DescribeElasticStrengthResponse.ElasticStrength"));

		List<ResourcePool> resourcePools = new ArrayList<ResourcePool>();
		for (int i = 0; i < _ctx.lengthValue("DescribeElasticStrengthResponse.ResourcePools.Length"); i++) {
			ResourcePool resourcePool = new ResourcePool();
			resourcePool.setStrength(_ctx.doubleValue("DescribeElasticStrengthResponse.ResourcePools["+ i +"].Strength"));
			resourcePool.setInstanceType(_ctx.stringValue("DescribeElasticStrengthResponse.ResourcePools["+ i +"].InstanceType"));
			resourcePool.setZoneId(_ctx.stringValue("DescribeElasticStrengthResponse.ResourcePools["+ i +"].ZoneId"));
			resourcePool.setCode(_ctx.stringValue("DescribeElasticStrengthResponse.ResourcePools["+ i +"].Code"));
			resourcePool.setMsg(_ctx.stringValue("DescribeElasticStrengthResponse.ResourcePools["+ i +"].Msg"));
			resourcePool.setStatus(_ctx.stringValue("DescribeElasticStrengthResponse.ResourcePools["+ i +"].Status"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeElasticStrengthResponse.ResourcePools["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("DescribeElasticStrengthResponse.ResourcePools["+ i +"].VSwitchIds["+ j +"]"));
			}
			resourcePool.setVSwitchIds(vSwitchIds);

			InventoryHealth inventoryHealth = new InventoryHealth();
			inventoryHealth.setHealthScore(_ctx.integerValue("DescribeElasticStrengthResponse.ResourcePools["+ i +"].InventoryHealth.HealthScore"));
			inventoryHealth.setAdequacyScore(_ctx.integerValue("DescribeElasticStrengthResponse.ResourcePools["+ i +"].InventoryHealth.AdequacyScore"));
			inventoryHealth.setSupplyScore(_ctx.integerValue("DescribeElasticStrengthResponse.ResourcePools["+ i +"].InventoryHealth.SupplyScore"));
			inventoryHealth.setHotScore(_ctx.integerValue("DescribeElasticStrengthResponse.ResourcePools["+ i +"].InventoryHealth.HotScore"));
			resourcePool.setInventoryHealth(inventoryHealth);

			resourcePools.add(resourcePool);
		}
		describeElasticStrengthResponse.setResourcePools(resourcePools);

		List<ElasticStrengthModel> elasticStrengthModels = new ArrayList<ElasticStrengthModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeElasticStrengthResponse.ElasticStrengthModels.Length"); i++) {
			ElasticStrengthModel elasticStrengthModel = new ElasticStrengthModel();
			elasticStrengthModel.setScalingGroupId(_ctx.stringValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].ScalingGroupId"));
			elasticStrengthModel.setElasticStrength(_ctx.stringValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].ElasticStrength"));
			elasticStrengthModel.setTotalStrength(_ctx.doubleValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].TotalStrength"));

			List<ResourcePool2> resourcePools1 = new ArrayList<ResourcePool2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].ResourcePools.Length"); j++) {
				ResourcePool2 resourcePool2 = new ResourcePool2();
				resourcePool2.setInstanceType(_ctx.stringValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].ResourcePools["+ j +"].InstanceType"));
				resourcePool2.setStrength(_ctx.doubleValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].ResourcePools["+ j +"].Strength"));
				resourcePool2.setZoneId(_ctx.stringValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].ResourcePools["+ j +"].ZoneId"));
				resourcePool2.setCode(_ctx.stringValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].ResourcePools["+ j +"].Code"));
				resourcePool2.setMsg(_ctx.stringValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].ResourcePools["+ j +"].Msg"));
				resourcePool2.setStatus(_ctx.stringValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].ResourcePools["+ j +"].Status"));

				List<String> vSwitchIds3 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].ResourcePools["+ j +"].VSwitchIds.Length"); k++) {
					vSwitchIds3.add(_ctx.stringValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].ResourcePools["+ j +"].VSwitchIds["+ k +"]"));
				}
				resourcePool2.setVSwitchIds3(vSwitchIds3);

				InventoryHealth4 inventoryHealth4 = new InventoryHealth4();
				inventoryHealth4.setHealthScore(_ctx.integerValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].ResourcePools["+ j +"].InventoryHealth.HealthScore"));
				inventoryHealth4.setAdequacyScore(_ctx.integerValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].ResourcePools["+ j +"].InventoryHealth.AdequacyScore"));
				inventoryHealth4.setSupplyScore(_ctx.integerValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].ResourcePools["+ j +"].InventoryHealth.SupplyScore"));
				inventoryHealth4.setHotScore(_ctx.integerValue("DescribeElasticStrengthResponse.ElasticStrengthModels["+ i +"].ResourcePools["+ j +"].InventoryHealth.HotScore"));
				resourcePool2.setInventoryHealth4(inventoryHealth4);

				resourcePools1.add(resourcePool2);
			}
			elasticStrengthModel.setResourcePools1(resourcePools1);

			elasticStrengthModels.add(elasticStrengthModel);
		}
		describeElasticStrengthResponse.setElasticStrengthModels(elasticStrengthModels);
	 
	 	return describeElasticStrengthResponse;
	}
}