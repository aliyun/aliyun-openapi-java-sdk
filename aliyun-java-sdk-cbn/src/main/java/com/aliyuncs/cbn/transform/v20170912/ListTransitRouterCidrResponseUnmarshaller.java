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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterCidrResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterCidrResponse.CidrListsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterCidrResponseUnmarshaller {

	public static ListTransitRouterCidrResponse unmarshall(ListTransitRouterCidrResponse listTransitRouterCidrResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterCidrResponse.setRequestId(_ctx.stringValue("ListTransitRouterCidrResponse.RequestId"));

		List<CidrListsItem> cidrLists = new ArrayList<CidrListsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterCidrResponse.CidrLists.Length"); i++) {
			CidrListsItem cidrListsItem = new CidrListsItem();
			cidrListsItem.setTransitRouterCidrId(_ctx.stringValue("ListTransitRouterCidrResponse.CidrLists["+ i +"].TransitRouterCidrId"));
			cidrListsItem.setFamily(_ctx.stringValue("ListTransitRouterCidrResponse.CidrLists["+ i +"].Family"));
			cidrListsItem.setName(_ctx.stringValue("ListTransitRouterCidrResponse.CidrLists["+ i +"].Name"));
			cidrListsItem.setDescription(_ctx.stringValue("ListTransitRouterCidrResponse.CidrLists["+ i +"].Description"));
			cidrListsItem.setCidr(_ctx.stringValue("ListTransitRouterCidrResponse.CidrLists["+ i +"].Cidr"));
			cidrListsItem.setPublishCidrRoute(_ctx.booleanValue("ListTransitRouterCidrResponse.CidrLists["+ i +"].PublishCidrRoute"));
			cidrListsItem.setTransitRouterId(_ctx.stringValue("ListTransitRouterCidrResponse.CidrLists["+ i +"].TransitRouterId"));

			cidrLists.add(cidrListsItem);
		}
		listTransitRouterCidrResponse.setCidrLists(cidrLists);
	 
	 	return listTransitRouterCidrResponse;
	}
}