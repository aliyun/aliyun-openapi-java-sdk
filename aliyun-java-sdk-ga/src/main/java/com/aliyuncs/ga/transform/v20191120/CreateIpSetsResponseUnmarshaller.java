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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.CreateIpSetsResponse;
import com.aliyuncs.ga.model.v20191120.CreateIpSetsResponse.GaIpSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateIpSetsResponseUnmarshaller {

	public static CreateIpSetsResponse unmarshall(CreateIpSetsResponse createIpSetsResponse, UnmarshallerContext _ctx) {
		
		createIpSetsResponse.setRequestId(_ctx.stringValue("CreateIpSetsResponse.RequestId"));
		createIpSetsResponse.setAcceleratorId(_ctx.stringValue("CreateIpSetsResponse.AcceleratorId"));

		List<GaIpSet> ipSets = new ArrayList<GaIpSet>();
		for (int i = 0; i < _ctx.lengthValue("CreateIpSetsResponse.IpSets.Length"); i++) {
			GaIpSet gaIpSet = new GaIpSet();
			gaIpSet.setIpSetId(_ctx.stringValue("CreateIpSetsResponse.IpSets["+ i +"].IpSetId"));
			gaIpSet.setAccelerateRegionId(_ctx.stringValue("CreateIpSetsResponse.IpSets["+ i +"].AccelerateRegionId"));
			gaIpSet.setBandwidth(_ctx.integerValue("CreateIpSetsResponse.IpSets["+ i +"].Bandwidth"));

			List<String> ipList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateIpSetsResponse.IpSets["+ i +"].IpList.Length"); j++) {
				ipList.add(_ctx.stringValue("CreateIpSetsResponse.IpSets["+ i +"].IpList["+ j +"]"));
			}
			gaIpSet.setIpList(ipList);

			ipSets.add(gaIpSet);
		}
		createIpSetsResponse.setIpSets(ipSets);
	 
	 	return createIpSetsResponse;
	}
}