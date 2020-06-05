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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.CheckUpgradeVersionResponse;
import com.aliyuncs.sgw.model.v20180511.CheckUpgradeVersionResponse.Patch;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckUpgradeVersionResponseUnmarshaller {

	public static CheckUpgradeVersionResponse unmarshall(CheckUpgradeVersionResponse checkUpgradeVersionResponse, UnmarshallerContext _ctx) {
		
		checkUpgradeVersionResponse.setRequestId(_ctx.stringValue("CheckUpgradeVersionResponse.RequestId"));
		checkUpgradeVersionResponse.setSuccess(_ctx.booleanValue("CheckUpgradeVersionResponse.Success"));
		checkUpgradeVersionResponse.setCode(_ctx.stringValue("CheckUpgradeVersionResponse.Code"));
		checkUpgradeVersionResponse.setMessage(_ctx.stringValue("CheckUpgradeVersionResponse.Message"));
		checkUpgradeVersionResponse.setOption(_ctx.stringValue("CheckUpgradeVersionResponse.Option"));
		checkUpgradeVersionResponse.setLatestVersion(_ctx.stringValue("CheckUpgradeVersionResponse.LatestVersion"));

		List<Patch> patches = new ArrayList<Patch>();
		for (int i = 0; i < _ctx.lengthValue("CheckUpgradeVersionResponse.Patches.Length"); i++) {
			Patch patch = new Patch();
			patch.setName(_ctx.stringValue("CheckUpgradeVersionResponse.Patches["+ i +"].Name"));
			patch.setMD5(_ctx.stringValue("CheckUpgradeVersionResponse.Patches["+ i +"].MD5"));
			patch.setUrl(_ctx.stringValue("CheckUpgradeVersionResponse.Patches["+ i +"].Url"));
			patch.setInternalUrl(_ctx.stringValue("CheckUpgradeVersionResponse.Patches["+ i +"].InternalUrl"));

			patches.add(patch);
		}
		checkUpgradeVersionResponse.setPatches(patches);
	 
	 	return checkUpgradeVersionResponse;
	}
}