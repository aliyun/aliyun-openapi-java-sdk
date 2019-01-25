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

package com.aliyuncs.ons.transform.v20180516;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20180516.OnsSubscriptionSearchResponse;
import com.aliyuncs.ons.model.v20180516.OnsSubscriptionSearchResponse.SubscribeInfoDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsSubscriptionSearchResponseUnmarshaller {

	public static OnsSubscriptionSearchResponse unmarshall(OnsSubscriptionSearchResponse onsSubscriptionSearchResponse, UnmarshallerContext context) {
		
		onsSubscriptionSearchResponse.setRequestId(context.stringValue("OnsSubscriptionSearchResponse.RequestId"));
		onsSubscriptionSearchResponse.setHelpUrl(context.stringValue("OnsSubscriptionSearchResponse.HelpUrl"));

		List<SubscribeInfoDo> data = new ArrayList<SubscribeInfoDo>();
		for (int i = 0; i < context.lengthValue("OnsSubscriptionSearchResponse.Data.Length"); i++) {
			SubscribeInfoDo subscribeInfoDo = new SubscribeInfoDo();
			subscribeInfoDo.setId(context.longValue("OnsSubscriptionSearchResponse.Data["+ i +"].Id"));
			subscribeInfoDo.setChannelId(context.integerValue("OnsSubscriptionSearchResponse.Data["+ i +"].ChannelId"));
			subscribeInfoDo.setChannelName(context.stringValue("OnsSubscriptionSearchResponse.Data["+ i +"].ChannelName"));
			subscribeInfoDo.setOwner(context.stringValue("OnsSubscriptionSearchResponse.Data["+ i +"].Owner"));
			subscribeInfoDo.setConsumerId(context.stringValue("OnsSubscriptionSearchResponse.Data["+ i +"].ConsumerId"));
			subscribeInfoDo.setTopic(context.stringValue("OnsSubscriptionSearchResponse.Data["+ i +"].Topic"));
			subscribeInfoDo.setStatus(context.integerValue("OnsSubscriptionSearchResponse.Data["+ i +"].Status"));
			subscribeInfoDo.setStatusName(context.stringValue("OnsSubscriptionSearchResponse.Data["+ i +"].StatusName"));
			subscribeInfoDo.setCreateTime(context.longValue("OnsSubscriptionSearchResponse.Data["+ i +"].CreateTime"));
			subscribeInfoDo.setUpdateTime(context.longValue("OnsSubscriptionSearchResponse.Data["+ i +"].UpdateTime"));

			data.add(subscribeInfoDo);
		}
		onsSubscriptionSearchResponse.setData(data);
	 
	 	return onsSubscriptionSearchResponse;
	}
}