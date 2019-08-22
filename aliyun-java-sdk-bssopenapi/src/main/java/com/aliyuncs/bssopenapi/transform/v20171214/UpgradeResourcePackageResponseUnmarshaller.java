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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.UpgradeResourcePackageResponse;
import com.aliyuncs.bssopenapi.model.v20171214.UpgradeResourcePackageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeResourcePackageResponseUnmarshaller {

	public static UpgradeResourcePackageResponse unmarshall(UpgradeResourcePackageResponse upgradeResourcePackageResponse, UnmarshallerContext _ctx) {
		
		upgradeResourcePackageResponse.setRequestId(_ctx.stringValue("UpgradeResourcePackageResponse.RequestId"));
		upgradeResourcePackageResponse.setOrderId(_ctx.longValue("UpgradeResourcePackageResponse.OrderId"));
		upgradeResourcePackageResponse.setSuccess(_ctx.booleanValue("UpgradeResourcePackageResponse.Success"));
		upgradeResourcePackageResponse.setCode(_ctx.stringValue("UpgradeResourcePackageResponse.Code"));
		upgradeResourcePackageResponse.setMessage(_ctx.stringValue("UpgradeResourcePackageResponse.Message"));

		Data data = new Data();
		data.setOrderId(_ctx.longValue("UpgradeResourcePackageResponse.Data.OrderId"));
		data.setInstanceId(_ctx.stringValue("UpgradeResourcePackageResponse.Data.InstanceId"));
		upgradeResourcePackageResponse.setData(data);
	 
	 	return upgradeResourcePackageResponse;
	}
}