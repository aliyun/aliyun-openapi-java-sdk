/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ons.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20160503.OnsSubscriptionListResponse;
import com.aliyuncs.ons.model.v20160503.OnsSubscriptionListResponse.SubscribeInfoDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsSubscriptionListResponseUnmarshaller {

	public static OnsSubscriptionListResponse unmarshall(OnsSubscriptionListResponse onsSubscriptionListResponse, UnmarshallerContext context) {
		
		onsSubscriptionListResponse.setRequestId(context.stringValue("OnsSubscriptionListResponse.RequestId"));
		onsSubscriptionListResponse.setHelpUrl(context.stringValue("OnsSubscriptionListResponse.HelpUrl"));

		List<SubscribeInfoDo> data = new ArrayList<SubscribeInfoDo>();
		for (int i = 0; i < context.lengthValue("OnsSubscriptionListResponse.Data.Length"); i++) {
			SubscribeInfoDo subscribeInfoDo = new SubscribeInfoDo();
			subscribeInfoDo.setId(context.longValue("OnsSubscriptionListResponse.Data["+ i +"].Id"));
			subscribeInfoDo.setChannelId(context.integerValue("OnsSubscriptionListResponse.Data["+ i +"].ChannelId"));
			subscribeInfoDo.setChannelName(context.stringValue("OnsSubscriptionListResponse.Data["+ i +"].ChannelName"));
			subscribeInfoDo.setOnsRegionId(context.stringValue("OnsSubscriptionListResponse.Data["+ i +"].OnsRegionId"));
			subscribeInfoDo.setRegionName(context.stringValue("OnsSubscriptionListResponse.Data["+ i +"].RegionName"));
			subscribeInfoDo.setOwner(context.stringValue("OnsSubscriptionListResponse.Data["+ i +"].Owner"));
			subscribeInfoDo.setConsumerId(context.stringValue("OnsSubscriptionListResponse.Data["+ i +"].ConsumerId"));
			subscribeInfoDo.setTopic(context.stringValue("OnsSubscriptionListResponse.Data["+ i +"].Topic"));
			subscribeInfoDo.setStatus(context.integerValue("OnsSubscriptionListResponse.Data["+ i +"].Status"));
			subscribeInfoDo.setStatusName(context.stringValue("OnsSubscriptionListResponse.Data["+ i +"].StatusName"));
			subscribeInfoDo.setCreateTime(context.longValue("OnsSubscriptionListResponse.Data["+ i +"].CreateTime"));
			subscribeInfoDo.setUpdateTime(context.longValue("OnsSubscriptionListResponse.Data["+ i +"].UpdateTime"));

			data.add(subscribeInfoDo);
		}
		onsSubscriptionListResponse.setData(data);
	 
	 	return onsSubscriptionListResponse;
	}
}