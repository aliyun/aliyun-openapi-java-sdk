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

import com.aliyuncs.ga.model.v20191120.ListIpSetsResponse;
import com.aliyuncs.ga.model.v20191120.ListIpSetsResponse.IpSetsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIpSetsResponseUnmarshaller {

	public static ListIpSetsResponse unmarshall(ListIpSetsResponse listIpSetsResponse, UnmarshallerContext _ctx) {
		
		listIpSetsResponse.setRequestId(_ctx.stringValue("ListIpSetsResponse.RequestId"));
		listIpSetsResponse.setTotalCount(_ctx.integerValue("ListIpSetsResponse.TotalCount"));
		listIpSetsResponse.setPageNumber(_ctx.integerValue("ListIpSetsResponse.PageNumber"));
		listIpSetsResponse.setPageSize(_ctx.integerValue("ListIpSetsResponse.PageSize"));

		List<IpSetsItem> ipSets = new ArrayList<IpSetsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIpSetsResponse.IpSets.Length"); i++) {
			IpSetsItem ipSetsItem = new IpSetsItem();
			ipSetsItem.setIpSetId(_ctx.stringValue("ListIpSetsResponse.IpSets["+ i +"].IpSetId"));
			ipSetsItem.setAccelerateRegionId(_ctx.stringValue("ListIpSetsResponse.IpSets["+ i +"].AccelerateRegionId"));
			ipSetsItem.setBandwidth(_ctx.integerValue("ListIpSetsResponse.IpSets["+ i +"].Bandwidth"));
			ipSetsItem.setState(_ctx.stringValue("ListIpSetsResponse.IpSets["+ i +"].State"));

			List<String> ipAddressList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListIpSetsResponse.IpSets["+ i +"].IpAddressList.Length"); j++) {
				ipAddressList.add(_ctx.stringValue("ListIpSetsResponse.IpSets["+ i +"].IpAddressList["+ j +"]"));
			}
			ipSetsItem.setIpAddressList(ipAddressList);

			ipSets.add(ipSetsItem);
		}
		listIpSetsResponse.setIpSets(ipSets);
	 
	 	return listIpSetsResponse;
	}
}