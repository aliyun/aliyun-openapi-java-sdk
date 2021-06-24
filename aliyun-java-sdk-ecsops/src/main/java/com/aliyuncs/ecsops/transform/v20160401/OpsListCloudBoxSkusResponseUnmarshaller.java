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

import com.aliyuncs.ecsops.model.v20160401.OpsListCloudBoxSkusResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListCloudBoxSkusResponse.CloudBoxSkuSet;
import com.aliyuncs.ecsops.model.v20160401.OpsListCloudBoxSkusResponse.CloudBoxSkuSet.InstanceTypeSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListCloudBoxSkusResponseUnmarshaller {

	public static OpsListCloudBoxSkusResponse unmarshall(OpsListCloudBoxSkusResponse opsListCloudBoxSkusResponse, UnmarshallerContext _ctx) {
		
		opsListCloudBoxSkusResponse.setRequestId(_ctx.stringValue("OpsListCloudBoxSkusResponse.RequestId"));
		opsListCloudBoxSkusResponse.setTotalCount(_ctx.integerValue("OpsListCloudBoxSkusResponse.TotalCount"));
		opsListCloudBoxSkusResponse.setNextToken(_ctx.stringValue("OpsListCloudBoxSkusResponse.NextToken"));

		List<CloudBoxSkuSet> cloudBoxSkuSets = new ArrayList<CloudBoxSkuSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets.Length"); i++) {
			CloudBoxSkuSet cloudBoxSkuSet = new CloudBoxSkuSet();
			cloudBoxSkuSet.setPowerConsumption(_ctx.floatValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].PowerConsumption"));
			cloudBoxSkuSet.setHeight(_ctx.floatValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].Height"));
			cloudBoxSkuSet.setMaxBlockStorage(_ctx.floatValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].MaxBlockStorage"));
			cloudBoxSkuSet.setSkuType(_ctx.stringValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].SkuType"));
			cloudBoxSkuSet.setMinBlockStorage(_ctx.floatValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].MinBlockStorage"));
			cloudBoxSkuSet.setBizType(_ctx.stringValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].BizType"));
			cloudBoxSkuSet.setWeight(_ctx.floatValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].Weight"));
			cloudBoxSkuSet.setBandwidth(_ctx.stringValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].Bandwidth"));
			cloudBoxSkuSet.setDescription(_ctx.stringValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].Description"));
			cloudBoxSkuSet.setCloudBoxSkuId(_ctx.stringValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].CloudBoxSkuId"));
			cloudBoxSkuSet.setWidth(_ctx.floatValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].Width"));
			cloudBoxSkuSet.setLength(_ctx.floatValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].Length"));

			List<InstanceTypeSet> instanceTypeSets = new ArrayList<InstanceTypeSet>();
			for (int j = 0; j < _ctx.lengthValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].InstanceTypeSets.Length"); j++) {
				InstanceTypeSet instanceTypeSet = new InstanceTypeSet();
				instanceTypeSet.setInstanceTypeCount(_ctx.integerValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].InstanceTypeSets["+ j +"].InstanceTypeCount"));
				instanceTypeSet.setInstanceTypeName(_ctx.stringValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].InstanceTypeSets["+ j +"].InstanceTypeName"));
				instanceTypeSet.setInstanceTypeFamily(_ctx.stringValue("OpsListCloudBoxSkusResponse.CloudBoxSkuSets["+ i +"].InstanceTypeSets["+ j +"].InstanceTypeFamily"));

				instanceTypeSets.add(instanceTypeSet);
			}
			cloudBoxSkuSet.setInstanceTypeSets(instanceTypeSets);

			cloudBoxSkuSets.add(cloudBoxSkuSet);
		}
		opsListCloudBoxSkusResponse.setCloudBoxSkuSets(cloudBoxSkuSets);
	 
	 	return opsListCloudBoxSkusResponse;
	}
}