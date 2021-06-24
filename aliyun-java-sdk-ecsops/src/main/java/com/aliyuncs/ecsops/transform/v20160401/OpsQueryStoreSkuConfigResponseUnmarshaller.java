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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryStoreSkuConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryStoreSkuConfigResponseUnmarshaller {

	public static OpsQueryStoreSkuConfigResponse unmarshall(OpsQueryStoreSkuConfigResponse opsQueryStoreSkuConfigResponse, UnmarshallerContext _ctx) {
		
		opsQueryStoreSkuConfigResponse.setRequestId(_ctx.stringValue("OpsQueryStoreSkuConfigResponse.RequestId"));
		opsQueryStoreSkuConfigResponse.setEbsCloudBoxConfigId(_ctx.stringValue("OpsQueryStoreSkuConfigResponse.EbsCloudBoxConfigId"));
		opsQueryStoreSkuConfigResponse.setName(_ctx.stringValue("OpsQueryStoreSkuConfigResponse.Name"));
		opsQueryStoreSkuConfigResponse.setStorageType(_ctx.stringValue("OpsQueryStoreSkuConfigResponse.StorageType"));
		opsQueryStoreSkuConfigResponse.setPerformanceLevel(_ctx.stringValue("OpsQueryStoreSkuConfigResponse.PerformanceLevel"));
		opsQueryStoreSkuConfigResponse.setMachineType(_ctx.stringValue("OpsQueryStoreSkuConfigResponse.MachineType"));
		opsQueryStoreSkuConfigResponse.setProductName(_ctx.stringValue("OpsQueryStoreSkuConfigResponse.ProductName"));
		opsQueryStoreSkuConfigResponse.setMinCapacity(_ctx.longValue("OpsQueryStoreSkuConfigResponse.MinCapacity"));
		opsQueryStoreSkuConfigResponse.setMaxCapacity(_ctx.longValue("OpsQueryStoreSkuConfigResponse.MaxCapacity"));
		opsQueryStoreSkuConfigResponse.setStepCapacity(_ctx.longValue("OpsQueryStoreSkuConfigResponse.StepCapacity"));
	 
	 	return opsQueryStoreSkuConfigResponse;
	}
}