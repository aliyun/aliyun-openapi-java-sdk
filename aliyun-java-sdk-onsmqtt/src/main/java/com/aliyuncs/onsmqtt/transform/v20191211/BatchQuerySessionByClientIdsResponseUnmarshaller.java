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

package com.aliyuncs.onsmqtt.transform.v20191211;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.onsmqtt.model.v20191211.BatchQuerySessionByClientIdsResponse;
import com.aliyuncs.onsmqtt.model.v20191211.BatchQuerySessionByClientIdsResponse.OnlineStatusListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchQuerySessionByClientIdsResponseUnmarshaller {

	public static BatchQuerySessionByClientIdsResponse unmarshall(BatchQuerySessionByClientIdsResponse batchQuerySessionByClientIdsResponse, UnmarshallerContext _ctx) {
		
		batchQuerySessionByClientIdsResponse.setRequestId(_ctx.stringValue("BatchQuerySessionByClientIdsResponse.RequestId"));

		List<OnlineStatusListItem> onlineStatusList = new ArrayList<OnlineStatusListItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchQuerySessionByClientIdsResponse.OnlineStatusList.Length"); i++) {
			OnlineStatusListItem onlineStatusListItem = new OnlineStatusListItem();
			onlineStatusListItem.setClientId(_ctx.stringValue("BatchQuerySessionByClientIdsResponse.OnlineStatusList["+ i +"].ClientId"));
			onlineStatusListItem.setOnlineStatus(_ctx.booleanValue("BatchQuerySessionByClientIdsResponse.OnlineStatusList["+ i +"].OnlineStatus"));

			onlineStatusList.add(onlineStatusListItem);
		}
		batchQuerySessionByClientIdsResponse.setOnlineStatusList(onlineStatusList);
	 
	 	return batchQuerySessionByClientIdsResponse;
	}
}