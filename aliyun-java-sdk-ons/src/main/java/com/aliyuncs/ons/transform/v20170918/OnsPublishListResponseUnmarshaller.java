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
package com.aliyuncs.ons.transform.v20170918;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20170918.OnsPublishListResponse;
import com.aliyuncs.ons.model.v20170918.OnsPublishListResponse.PublishInfoDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsPublishListResponseUnmarshaller {

	public static OnsPublishListResponse unmarshall(OnsPublishListResponse onsPublishListResponse, UnmarshallerContext context) {
		
		onsPublishListResponse.setRequestId(context.stringValue("OnsPublishListResponse.RequestId"));
		onsPublishListResponse.setHelpUrl(context.stringValue("OnsPublishListResponse.HelpUrl"));

		List<PublishInfoDo> data = new ArrayList<PublishInfoDo>();
		for (int i = 0; i < context.lengthValue("OnsPublishListResponse.Data.Length"); i++) {
			PublishInfoDo publishInfoDo = new PublishInfoDo();
			publishInfoDo.setId(context.longValue("OnsPublishListResponse.Data["+ i +"].Id"));
			publishInfoDo.setChannelId(context.integerValue("OnsPublishListResponse.Data["+ i +"].ChannelId"));
			publishInfoDo.setChannelName(context.stringValue("OnsPublishListResponse.Data["+ i +"].ChannelName"));
			publishInfoDo.setOnsRegionId(context.stringValue("OnsPublishListResponse.Data["+ i +"].OnsRegionId"));
			publishInfoDo.setRegionName(context.stringValue("OnsPublishListResponse.Data["+ i +"].RegionName"));
			publishInfoDo.setOwner(context.stringValue("OnsPublishListResponse.Data["+ i +"].Owner"));
			publishInfoDo.setProducerId(context.stringValue("OnsPublishListResponse.Data["+ i +"].ProducerId"));
			publishInfoDo.setTopic(context.stringValue("OnsPublishListResponse.Data["+ i +"].Topic"));
			publishInfoDo.setStatus(context.integerValue("OnsPublishListResponse.Data["+ i +"].Status"));
			publishInfoDo.setStatusName(context.stringValue("OnsPublishListResponse.Data["+ i +"].StatusName"));
			publishInfoDo.setCreateTime(context.longValue("OnsPublishListResponse.Data["+ i +"].CreateTime"));
			publishInfoDo.setUpdateTime(context.longValue("OnsPublishListResponse.Data["+ i +"].UpdateTime"));

			data.add(publishInfoDo);
		}
		onsPublishListResponse.setData(data);
	 
	 	return onsPublishListResponse;
	}
}