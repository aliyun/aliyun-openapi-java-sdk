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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.CreateRouteEntriesResponse;
import com.aliyuncs.vpc.model.v20160428.CreateRouteEntriesResponse.FailedRouteEntriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRouteEntriesResponseUnmarshaller {

	public static CreateRouteEntriesResponse unmarshall(CreateRouteEntriesResponse createRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		createRouteEntriesResponse.setRequestId(_ctx.stringValue("CreateRouteEntriesResponse.RequestId"));
		createRouteEntriesResponse.setSuccessCount(_ctx.integerValue("CreateRouteEntriesResponse.SuccessCount"));
		createRouteEntriesResponse.setFailedCount(_ctx.integerValue("CreateRouteEntriesResponse.FailedCount"));

		List<String> routeEntryIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateRouteEntriesResponse.RouteEntryIds.Length"); i++) {
			routeEntryIds.add(_ctx.stringValue("CreateRouteEntriesResponse.RouteEntryIds["+ i +"]"));
		}
		createRouteEntriesResponse.setRouteEntryIds(routeEntryIds);

		List<FailedRouteEntriesItem> failedRouteEntries = new ArrayList<FailedRouteEntriesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateRouteEntriesResponse.FailedRouteEntries.Length"); i++) {
			FailedRouteEntriesItem failedRouteEntriesItem = new FailedRouteEntriesItem();
			failedRouteEntriesItem.setDstCidrBlock(_ctx.stringValue("CreateRouteEntriesResponse.FailedRouteEntries["+ i +"].DstCidrBlock"));
			failedRouteEntriesItem.setNextHop(_ctx.stringValue("CreateRouteEntriesResponse.FailedRouteEntries["+ i +"].NextHop"));
			failedRouteEntriesItem.setFailedCode(_ctx.stringValue("CreateRouteEntriesResponse.FailedRouteEntries["+ i +"].FailedCode"));
			failedRouteEntriesItem.setFailedMessage(_ctx.stringValue("CreateRouteEntriesResponse.FailedRouteEntries["+ i +"].FailedMessage"));

			failedRouteEntries.add(failedRouteEntriesItem);
		}
		createRouteEntriesResponse.setFailedRouteEntries(failedRouteEntries);
	 
	 	return createRouteEntriesResponse;
	}
}