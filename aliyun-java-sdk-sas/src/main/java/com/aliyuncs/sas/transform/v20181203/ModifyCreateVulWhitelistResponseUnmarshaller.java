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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ModifyCreateVulWhitelistResponse;
import com.aliyuncs.sas.model.v20181203.ModifyCreateVulWhitelistResponse.VulWhitelist;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyCreateVulWhitelistResponseUnmarshaller {

	public static ModifyCreateVulWhitelistResponse unmarshall(ModifyCreateVulWhitelistResponse modifyCreateVulWhitelistResponse, UnmarshallerContext _ctx) {
		
		modifyCreateVulWhitelistResponse.setRequestId(_ctx.stringValue("ModifyCreateVulWhitelistResponse.RequestId"));

		List<VulWhitelist> vulWhitelistList = new ArrayList<VulWhitelist>();
		for (int i = 0; i < _ctx.lengthValue("ModifyCreateVulWhitelistResponse.VulWhitelistList.Length"); i++) {
			VulWhitelist vulWhitelist = new VulWhitelist();
			vulWhitelist.setId(_ctx.longValue("ModifyCreateVulWhitelistResponse.VulWhitelistList["+ i +"].Id"));

			vulWhitelistList.add(vulWhitelist);
		}
		modifyCreateVulWhitelistResponse.setVulWhitelistList(vulWhitelistList);
	 
	 	return modifyCreateVulWhitelistResponse;
	}
}