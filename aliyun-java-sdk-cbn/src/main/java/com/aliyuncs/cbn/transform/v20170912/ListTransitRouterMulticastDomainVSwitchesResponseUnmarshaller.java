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

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterMulticastDomainVSwitchesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterMulticastDomainVSwitchesResponseUnmarshaller {

	public static ListTransitRouterMulticastDomainVSwitchesResponse unmarshall(ListTransitRouterMulticastDomainVSwitchesResponse listTransitRouterMulticastDomainVSwitchesResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterMulticastDomainVSwitchesResponse.setRequestId(_ctx.stringValue("ListTransitRouterMulticastDomainVSwitchesResponse.RequestId"));
		listTransitRouterMulticastDomainVSwitchesResponse.setNextToken(_ctx.stringValue("ListTransitRouterMulticastDomainVSwitchesResponse.NextToken"));
		listTransitRouterMulticastDomainVSwitchesResponse.setTotalCount(_ctx.integerValue("ListTransitRouterMulticastDomainVSwitchesResponse.TotalCount"));
		listTransitRouterMulticastDomainVSwitchesResponse.setMaxResults(_ctx.integerValue("ListTransitRouterMulticastDomainVSwitchesResponse.MaxResults"));

		List<String> vSwitchIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterMulticastDomainVSwitchesResponse.VSwitchIds.Length"); i++) {
			vSwitchIds.add(_ctx.stringValue("ListTransitRouterMulticastDomainVSwitchesResponse.VSwitchIds["+ i +"]"));
		}
		listTransitRouterMulticastDomainVSwitchesResponse.setVSwitchIds(vSwitchIds);
	 
	 	return listTransitRouterMulticastDomainVSwitchesResponse;
	}
}