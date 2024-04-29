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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.UpgradeEnvironmentFeatureResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeEnvironmentFeatureResponseUnmarshaller {

	public static UpgradeEnvironmentFeatureResponse unmarshall(UpgradeEnvironmentFeatureResponse upgradeEnvironmentFeatureResponse, UnmarshallerContext _ctx) {
		
		upgradeEnvironmentFeatureResponse.setRequestId(_ctx.stringValue("UpgradeEnvironmentFeatureResponse.RequestId"));
		upgradeEnvironmentFeatureResponse.setCode(_ctx.integerValue("UpgradeEnvironmentFeatureResponse.Code"));
		upgradeEnvironmentFeatureResponse.setMessage(_ctx.stringValue("UpgradeEnvironmentFeatureResponse.Message"));
		upgradeEnvironmentFeatureResponse.setSuccess(_ctx.booleanValue("UpgradeEnvironmentFeatureResponse.Success"));
		upgradeEnvironmentFeatureResponse.setData(_ctx.mapValue("UpgradeEnvironmentFeatureResponse.Data"));
	 
	 	return upgradeEnvironmentFeatureResponse;
	}
}