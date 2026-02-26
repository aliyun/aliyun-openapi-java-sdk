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

import com.aliyuncs.arms.model.v20190808.UpgradeAddonReleaseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeAddonReleaseResponseUnmarshaller {

	public static UpgradeAddonReleaseResponse unmarshall(UpgradeAddonReleaseResponse upgradeAddonReleaseResponse, UnmarshallerContext _ctx) {
		
		upgradeAddonReleaseResponse.setRequestId(_ctx.stringValue("UpgradeAddonReleaseResponse.RequestId"));
		upgradeAddonReleaseResponse.setCode(_ctx.integerValue("UpgradeAddonReleaseResponse.Code"));
		upgradeAddonReleaseResponse.setSuccess(_ctx.booleanValue("UpgradeAddonReleaseResponse.Success"));
		upgradeAddonReleaseResponse.setMessage(_ctx.stringValue("UpgradeAddonReleaseResponse.Message"));
		upgradeAddonReleaseResponse.setData(_ctx.stringValue("UpgradeAddonReleaseResponse.Data"));
	 
	 	return upgradeAddonReleaseResponse;
	}
}