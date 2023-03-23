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

import com.aliyuncs.live.model.v20161101.ListLiveDelayConfigResponse;
import com.aliyuncs.live.model.v20161101.ListLiveDelayConfigResponse.DelayConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLiveDelayConfigResponseUnmarshaller {

	public static ListLiveDelayConfigResponse unmarshall(ListLiveDelayConfigResponse listLiveDelayConfigResponse, UnmarshallerContext _ctx) {
		
		listLiveDelayConfigResponse.setRequestId(_ctx.stringValue("ListLiveDelayConfigResponse.RequestId"));
		listLiveDelayConfigResponse.setTotal(_ctx.integerValue("ListLiveDelayConfigResponse.Total"));

		List<DelayConfig> delayConfigList = new ArrayList<DelayConfig>();
		for (int i = 0; i < _ctx.lengthValue("ListLiveDelayConfigResponse.DelayConfigList.Length"); i++) {
			DelayConfig delayConfig = new DelayConfig();
			delayConfig.setStream(_ctx.stringValue("ListLiveDelayConfigResponse.DelayConfigList["+ i +"].Stream"));
			delayConfig.setDomain(_ctx.stringValue("ListLiveDelayConfigResponse.DelayConfigList["+ i +"].Domain"));
			delayConfig.setTaskTriggerMode(_ctx.stringValue("ListLiveDelayConfigResponse.DelayConfigList["+ i +"].TaskTriggerMode"));
			delayConfig.setDelayTime(_ctx.stringValue("ListLiveDelayConfigResponse.DelayConfigList["+ i +"].DelayTime"));
			delayConfig.setApp(_ctx.stringValue("ListLiveDelayConfigResponse.DelayConfigList["+ i +"].App"));

			delayConfigList.add(delayConfig);
		}
		listLiveDelayConfigResponse.setDelayConfigList(delayConfigList);
	 
	 	return listLiveDelayConfigResponse;
	}
}