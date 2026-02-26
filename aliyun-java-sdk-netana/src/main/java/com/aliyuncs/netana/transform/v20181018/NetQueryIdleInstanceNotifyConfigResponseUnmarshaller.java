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

package com.aliyuncs.netana.transform.v20181018;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.netana.model.v20181018.NetQueryIdleInstanceNotifyConfigResponse;
import com.aliyuncs.netana.model.v20181018.NetQueryIdleInstanceNotifyConfigResponse.NotifyConfigInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class NetQueryIdleInstanceNotifyConfigResponseUnmarshaller {

	public static NetQueryIdleInstanceNotifyConfigResponse unmarshall(NetQueryIdleInstanceNotifyConfigResponse netQueryIdleInstanceNotifyConfigResponse, UnmarshallerContext _ctx) {
		
		netQueryIdleInstanceNotifyConfigResponse.setRequestId(_ctx.stringValue("NetQueryIdleInstanceNotifyConfigResponse.RequestId"));

		List<NotifyConfigInfoItem> notifyConfigInfo = new ArrayList<NotifyConfigInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("NetQueryIdleInstanceNotifyConfigResponse.NotifyConfigInfo.Length"); i++) {
			NotifyConfigInfoItem notifyConfigInfoItem = new NotifyConfigInfoItem();
			notifyConfigInfoItem.setProductId(_ctx.stringValue("NetQueryIdleInstanceNotifyConfigResponse.NotifyConfigInfo["+ i +"].ProductId"));
			notifyConfigInfoItem.setPeriod(_ctx.integerValue("NetQueryIdleInstanceNotifyConfigResponse.NotifyConfigInfo["+ i +"].Period"));
			notifyConfigInfoItem.setStatus(_ctx.booleanValue("NetQueryIdleInstanceNotifyConfigResponse.NotifyConfigInfo["+ i +"].Status"));

			notifyConfigInfo.add(notifyConfigInfoItem);
		}
		netQueryIdleInstanceNotifyConfigResponse.setNotifyConfigInfo(notifyConfigInfo);
	 
	 	return netQueryIdleInstanceNotifyConfigResponse;
	}
}