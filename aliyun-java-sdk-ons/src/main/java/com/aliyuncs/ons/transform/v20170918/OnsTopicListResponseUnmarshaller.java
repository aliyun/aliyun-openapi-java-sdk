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

import com.aliyuncs.ons.model.v20170918.OnsTopicListResponse;
import com.aliyuncs.ons.model.v20170918.OnsTopicListResponse.PublishInfoDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsTopicListResponseUnmarshaller {

	public static OnsTopicListResponse unmarshall(OnsTopicListResponse onsTopicListResponse, UnmarshallerContext context) {
		
		onsTopicListResponse.setRequestId(context.stringValue("OnsTopicListResponse.RequestId"));
		onsTopicListResponse.setHelpUrl(context.stringValue("OnsTopicListResponse.HelpUrl"));

		List<PublishInfoDo> data = new ArrayList<PublishInfoDo>();
		for (int i = 0; i < context.lengthValue("OnsTopicListResponse.Data.Length"); i++) {
			PublishInfoDo publishInfoDo = new PublishInfoDo();
			publishInfoDo.setId(context.longValue("OnsTopicListResponse.Data["+ i +"].Id"));
			publishInfoDo.setChannelId(context.integerValue("OnsTopicListResponse.Data["+ i +"].ChannelId"));
			publishInfoDo.setChannelName(context.stringValue("OnsTopicListResponse.Data["+ i +"].ChannelName"));
			publishInfoDo.setOnsRegionId(context.stringValue("OnsTopicListResponse.Data["+ i +"].OnsRegionId"));
			publishInfoDo.setRegionName(context.stringValue("OnsTopicListResponse.Data["+ i +"].RegionName"));
			publishInfoDo.setTopic(context.stringValue("OnsTopicListResponse.Data["+ i +"].Topic"));
			publishInfoDo.setOwner(context.stringValue("OnsTopicListResponse.Data["+ i +"].Owner"));
			publishInfoDo.setRelation(context.integerValue("OnsTopicListResponse.Data["+ i +"].Relation"));
			publishInfoDo.setRelationName(context.stringValue("OnsTopicListResponse.Data["+ i +"].RelationName"));
			publishInfoDo.setStatus(context.integerValue("OnsTopicListResponse.Data["+ i +"].Status"));
			publishInfoDo.setStatusName(context.stringValue("OnsTopicListResponse.Data["+ i +"].StatusName"));
			publishInfoDo.setAppkey(context.stringValue("OnsTopicListResponse.Data["+ i +"].Appkey"));
			publishInfoDo.setCreateTime(context.longValue("OnsTopicListResponse.Data["+ i +"].CreateTime"));
			publishInfoDo.setUpdateTime(context.longValue("OnsTopicListResponse.Data["+ i +"].UpdateTime"));
			publishInfoDo.setRemark(context.stringValue("OnsTopicListResponse.Data["+ i +"].Remark"));

			data.add(publishInfoDo);
		}
		onsTopicListResponse.setData(data);
	 
	 	return onsTopicListResponse;
	}
}