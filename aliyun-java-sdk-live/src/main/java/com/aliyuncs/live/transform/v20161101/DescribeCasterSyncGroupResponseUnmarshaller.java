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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeCasterSyncGroupResponse;
import com.aliyuncs.live.model.v20161101.DescribeCasterSyncGroupResponse.SyncGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasterSyncGroupResponseUnmarshaller {

	public static DescribeCasterSyncGroupResponse unmarshall(DescribeCasterSyncGroupResponse describeCasterSyncGroupResponse, UnmarshallerContext _ctx) {
		
		describeCasterSyncGroupResponse.setRequestId(_ctx.stringValue("DescribeCasterSyncGroupResponse.RequestId"));
		describeCasterSyncGroupResponse.setCasterId(_ctx.stringValue("DescribeCasterSyncGroupResponse.CasterId"));

		List<SyncGroup> syncGroups = new ArrayList<SyncGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasterSyncGroupResponse.SyncGroups.Length"); i++) {
			SyncGroup syncGroup = new SyncGroup();
			syncGroup.setMode(_ctx.integerValue("DescribeCasterSyncGroupResponse.SyncGroups["+ i +"].Mode"));
			syncGroup.setHostResourceId(_ctx.stringValue("DescribeCasterSyncGroupResponse.SyncGroups["+ i +"].HostResourceId"));

			List<String> resourceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCasterSyncGroupResponse.SyncGroups["+ i +"].ResourceIds.Length"); j++) {
				resourceIds.add(_ctx.stringValue("DescribeCasterSyncGroupResponse.SyncGroups["+ i +"].ResourceIds["+ j +"]"));
			}
			syncGroup.setResourceIds(resourceIds);

			syncGroups.add(syncGroup);
		}
		describeCasterSyncGroupResponse.setSyncGroups(syncGroups);
	 
	 	return describeCasterSyncGroupResponse;
	}
}