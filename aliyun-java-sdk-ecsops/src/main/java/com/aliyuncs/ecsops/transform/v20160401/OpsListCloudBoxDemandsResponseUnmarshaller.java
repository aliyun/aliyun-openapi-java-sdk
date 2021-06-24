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

import com.aliyuncs.ecsops.model.v20160401.OpsListCloudBoxDemandsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListCloudBoxDemandsResponse.CloudBoxDemandSet;
import com.aliyuncs.ecsops.model.v20160401.OpsListCloudBoxDemandsResponse.CloudBoxDemandSet.CloudBoxSkuSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListCloudBoxDemandsResponseUnmarshaller {

	public static OpsListCloudBoxDemandsResponse unmarshall(OpsListCloudBoxDemandsResponse opsListCloudBoxDemandsResponse, UnmarshallerContext _ctx) {
		
		opsListCloudBoxDemandsResponse.setRequestId(_ctx.stringValue("OpsListCloudBoxDemandsResponse.RequestId"));
		opsListCloudBoxDemandsResponse.setTotalCount(_ctx.integerValue("OpsListCloudBoxDemandsResponse.TotalCount"));
		opsListCloudBoxDemandsResponse.setNextToken(_ctx.stringValue("OpsListCloudBoxDemandsResponse.NextToken"));

		List<CloudBoxDemandSet> cloudBoxDemandSets = new ArrayList<CloudBoxDemandSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsListCloudBoxDemandsResponse.CloudBoxDemandSets.Length"); i++) {
			CloudBoxDemandSet cloudBoxDemandSet = new CloudBoxDemandSet();
			cloudBoxDemandSet.setStatus(_ctx.stringValue("OpsListCloudBoxDemandsResponse.CloudBoxDemandSets["+ i +"].Status"));
			cloudBoxDemandSet.setDemandType(_ctx.stringValue("OpsListCloudBoxDemandsResponse.CloudBoxDemandSets["+ i +"].DemandType"));
			cloudBoxDemandSet.setCloudBoxId(_ctx.stringValue("OpsListCloudBoxDemandsResponse.CloudBoxDemandSets["+ i +"].CloudBoxId"));
			cloudBoxDemandSet.setCloudBoxDemandId(_ctx.stringValue("OpsListCloudBoxDemandsResponse.CloudBoxDemandSets["+ i +"].CloudBoxDemandId"));
			cloudBoxDemandSet.setDuration(_ctx.integerValue("OpsListCloudBoxDemandsResponse.CloudBoxDemandSets["+ i +"].Duration"));
			cloudBoxDemandSet.setBlockStorageCapacity(_ctx.floatValue("OpsListCloudBoxDemandsResponse.CloudBoxDemandSets["+ i +"].BlockStorageCapacity"));

			List<CloudBoxSkuSet> cloudBoxSkuSets = new ArrayList<CloudBoxSkuSet>();
			for (int j = 0; j < _ctx.lengthValue("OpsListCloudBoxDemandsResponse.CloudBoxDemandSets["+ i +"].CloudBoxSkuSets.Length"); j++) {
				CloudBoxSkuSet cloudBoxSkuSet = new CloudBoxSkuSet();
				cloudBoxSkuSet.setSkuId(_ctx.stringValue("OpsListCloudBoxDemandsResponse.CloudBoxDemandSets["+ i +"].CloudBoxSkuSets["+ j +"].SkuId"));
				cloudBoxSkuSet.setCount(_ctx.integerValue("OpsListCloudBoxDemandsResponse.CloudBoxDemandSets["+ i +"].CloudBoxSkuSets["+ j +"].Count"));

				cloudBoxSkuSets.add(cloudBoxSkuSet);
			}
			cloudBoxDemandSet.setCloudBoxSkuSets(cloudBoxSkuSets);

			cloudBoxDemandSets.add(cloudBoxDemandSet);
		}
		opsListCloudBoxDemandsResponse.setCloudBoxDemandSets(cloudBoxDemandSets);
	 
	 	return opsListCloudBoxDemandsResponse;
	}
}