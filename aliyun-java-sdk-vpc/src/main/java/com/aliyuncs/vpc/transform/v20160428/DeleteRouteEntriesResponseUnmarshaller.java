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

import com.aliyuncs.vpc.model.v20160428.DeleteRouteEntriesResponse;
import com.aliyuncs.vpc.model.v20160428.DeleteRouteEntriesResponse.FailedRouteEntriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRouteEntriesResponseUnmarshaller {

	public static DeleteRouteEntriesResponse unmarshall(DeleteRouteEntriesResponse deleteRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		deleteRouteEntriesResponse.setRequestId(_ctx.stringValue("DeleteRouteEntriesResponse.RequestId"));
		deleteRouteEntriesResponse.setSuccessCount(_ctx.integerValue("DeleteRouteEntriesResponse.SuccessCount"));
		deleteRouteEntriesResponse.setFailedCount(_ctx.integerValue("DeleteRouteEntriesResponse.FailedCount"));

		List<FailedRouteEntriesItem> failedRouteEntries = new ArrayList<FailedRouteEntriesItem>();
		for (int i = 0; i < _ctx.lengthValue("DeleteRouteEntriesResponse.FailedRouteEntries.Length"); i++) {
			FailedRouteEntriesItem failedRouteEntriesItem = new FailedRouteEntriesItem();
			failedRouteEntriesItem.setRouteEntryId(_ctx.stringValue("DeleteRouteEntriesResponse.FailedRouteEntries["+ i +"].RouteEntryId"));
			failedRouteEntriesItem.setDstCidrBlock(_ctx.stringValue("DeleteRouteEntriesResponse.FailedRouteEntries["+ i +"].DstCidrBlock"));
			failedRouteEntriesItem.setNextHop(_ctx.stringValue("DeleteRouteEntriesResponse.FailedRouteEntries["+ i +"].NextHop"));
			failedRouteEntriesItem.setFailedCode(_ctx.stringValue("DeleteRouteEntriesResponse.FailedRouteEntries["+ i +"].FailedCode"));
			failedRouteEntriesItem.setFailedMessage(_ctx.stringValue("DeleteRouteEntriesResponse.FailedRouteEntries["+ i +"].FailedMessage"));

			failedRouteEntries.add(failedRouteEntriesItem);
		}
		deleteRouteEntriesResponse.setFailedRouteEntries(failedRouteEntries);
	 
	 	return deleteRouteEntriesResponse;
	}
}