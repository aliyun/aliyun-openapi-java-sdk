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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.ListKibanaPvlNetworkResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListKibanaPvlNetworkResponse.ResultItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListKibanaPvlNetworkResponse.ResultItem.VSwitchIdsZoneItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListKibanaPvlNetworkResponseUnmarshaller {

	public static ListKibanaPvlNetworkResponse unmarshall(ListKibanaPvlNetworkResponse listKibanaPvlNetworkResponse, UnmarshallerContext _ctx) {
		
		listKibanaPvlNetworkResponse.setRequestId(_ctx.stringValue("ListKibanaPvlNetworkResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListKibanaPvlNetworkResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setEndpointName(_ctx.stringValue("ListKibanaPvlNetworkResponse.Result["+ i +"].endpointName"));
			resultItem.setVpcId(_ctx.stringValue("ListKibanaPvlNetworkResponse.Result["+ i +"].vpcId"));
			resultItem.setEndpointId(_ctx.stringValue("ListKibanaPvlNetworkResponse.Result["+ i +"].endpointId"));
			resultItem.setEndpointStatus(_ctx.stringValue("ListKibanaPvlNetworkResponse.Result["+ i +"].endpointStatus"));
			resultItem.setCreateTime(_ctx.stringValue("ListKibanaPvlNetworkResponse.Result["+ i +"].createTime"));
			resultItem.setPvlId(_ctx.stringValue("ListKibanaPvlNetworkResponse.Result["+ i +"].pvlId"));

			List<String> securityGroups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListKibanaPvlNetworkResponse.Result["+ i +"].securityGroups.Length"); j++) {
				securityGroups.add(_ctx.stringValue("ListKibanaPvlNetworkResponse.Result["+ i +"].securityGroups["+ j +"]"));
			}
			resultItem.setSecurityGroups(securityGroups);

			List<VSwitchIdsZoneItem> vSwitchIdsZone = new ArrayList<VSwitchIdsZoneItem>();
			for (int j = 0; j < _ctx.lengthValue("ListKibanaPvlNetworkResponse.Result["+ i +"].vSwitchIdsZone.Length"); j++) {
				VSwitchIdsZoneItem vSwitchIdsZoneItem = new VSwitchIdsZoneItem();
				vSwitchIdsZoneItem.setZoneId(_ctx.stringValue("ListKibanaPvlNetworkResponse.Result["+ i +"].vSwitchIdsZone["+ j +"].zoneId"));
				vSwitchIdsZoneItem.setVswitchId(_ctx.stringValue("ListKibanaPvlNetworkResponse.Result["+ i +"].vSwitchIdsZone["+ j +"].vswitchId"));

				vSwitchIdsZone.add(vSwitchIdsZoneItem);
			}
			resultItem.setVSwitchIdsZone(vSwitchIdsZone);

			result.add(resultItem);
		}
		listKibanaPvlNetworkResponse.setResult(result);
	 
	 	return listKibanaPvlNetworkResponse;
	}
}