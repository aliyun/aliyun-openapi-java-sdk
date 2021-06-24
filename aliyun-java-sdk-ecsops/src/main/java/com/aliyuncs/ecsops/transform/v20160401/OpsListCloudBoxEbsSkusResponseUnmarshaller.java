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

import com.aliyuncs.ecsops.model.v20160401.OpsListCloudBoxEbsSkusResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListCloudBoxEbsSkusResponse.CloudBoxEbsSkuSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListCloudBoxEbsSkusResponseUnmarshaller {

	public static OpsListCloudBoxEbsSkusResponse unmarshall(OpsListCloudBoxEbsSkusResponse opsListCloudBoxEbsSkusResponse, UnmarshallerContext _ctx) {
		
		opsListCloudBoxEbsSkusResponse.setRequestId(_ctx.stringValue("OpsListCloudBoxEbsSkusResponse.RequestId"));
		opsListCloudBoxEbsSkusResponse.setSuccess(_ctx.booleanValue("OpsListCloudBoxEbsSkusResponse.Success"));
		opsListCloudBoxEbsSkusResponse.setCode(_ctx.stringValue("OpsListCloudBoxEbsSkusResponse.Code"));
		opsListCloudBoxEbsSkusResponse.setMessage(_ctx.stringValue("OpsListCloudBoxEbsSkusResponse.Message"));
		opsListCloudBoxEbsSkusResponse.setNextToken(_ctx.stringValue("OpsListCloudBoxEbsSkusResponse.NextToken"));
		opsListCloudBoxEbsSkusResponse.setTotalCount(_ctx.longValue("OpsListCloudBoxEbsSkusResponse.TotalCount"));

		List<CloudBoxEbsSkuSet> cloudBoxEbsSkuSets = new ArrayList<CloudBoxEbsSkuSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsListCloudBoxEbsSkusResponse.CloudBoxEbsSkuSets.Length"); i++) {
			CloudBoxEbsSkuSet cloudBoxEbsSkuSet = new CloudBoxEbsSkuSet();
			cloudBoxEbsSkuSet.setCloudBoxSkuId(_ctx.stringValue("OpsListCloudBoxEbsSkusResponse.CloudBoxEbsSkuSets["+ i +"].CloudBoxSkuId"));
			cloudBoxEbsSkuSet.setName(_ctx.stringValue("OpsListCloudBoxEbsSkusResponse.CloudBoxEbsSkuSets["+ i +"].Name"));
			cloudBoxEbsSkuSet.setStorageType(_ctx.stringValue("OpsListCloudBoxEbsSkusResponse.CloudBoxEbsSkuSets["+ i +"].StorageType"));
			cloudBoxEbsSkuSet.setPerformanceLevel(_ctx.stringValue("OpsListCloudBoxEbsSkusResponse.CloudBoxEbsSkuSets["+ i +"].PerformanceLevel"));
			cloudBoxEbsSkuSet.setMachineType(_ctx.stringValue("OpsListCloudBoxEbsSkusResponse.CloudBoxEbsSkuSets["+ i +"].MachineType"));
			cloudBoxEbsSkuSet.setMinCapacity(_ctx.longValue("OpsListCloudBoxEbsSkusResponse.CloudBoxEbsSkuSets["+ i +"].MinCapacity"));
			cloudBoxEbsSkuSet.setMaxCapacity(_ctx.longValue("OpsListCloudBoxEbsSkusResponse.CloudBoxEbsSkuSets["+ i +"].MaxCapacity"));
			cloudBoxEbsSkuSet.setStepCapacity(_ctx.longValue("OpsListCloudBoxEbsSkusResponse.CloudBoxEbsSkuSets["+ i +"].StepCapacity"));

			cloudBoxEbsSkuSets.add(cloudBoxEbsSkuSet);
		}
		opsListCloudBoxEbsSkusResponse.setCloudBoxEbsSkuSets(cloudBoxEbsSkuSets);
	 
	 	return opsListCloudBoxEbsSkusResponse;
	}
}