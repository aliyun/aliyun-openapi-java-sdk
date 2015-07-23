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
package com.aliyuncs.ons.transform.v20150701;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.ons.model.v20150701.TopicGetResponse;
import com.aliyuncs.ons.model.v20150701.TopicGetResponse.PublishInfoDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class TopicGetResponseUnmarshaller {

	public static TopicGetResponse unmarshall(TopicGetResponse topicGetResponse, UnmarshallerContext context) {
		

		List<PublishInfoDo> data = new ArrayList<PublishInfoDo>();
		for (int i = 0; i < context.lengthValue("TopicGetResponse.Data.Length"); i++) {
			PublishInfoDo  publishInfoDo = new PublishInfoDo();
			publishInfoDo.setRequestId(context.stringValue("TopicGetResponse.Data["+ i +"].RequestId"));
			publishInfoDo.setId(context.longValue("TopicGetResponse.Data["+ i +"].Id"));
			publishInfoDo.setProducerId(context.stringValue("TopicGetResponse.Data["+ i +"].ProducerId"));
			publishInfoDo.setTopic(context.stringValue("TopicGetResponse.Data["+ i +"].Topic"));
			publishInfoDo.setChannelId(context.integerValue("TopicGetResponse.Data["+ i +"].ChannelId"));
			publishInfoDo.setChannelName(context.stringValue("TopicGetResponse.Data["+ i +"].ChannelName"));
			publishInfoDo.setOwner(context.stringValue("TopicGetResponse.Data["+ i +"].Owner"));
			publishInfoDo.setUserId(context.longValue("TopicGetResponse.Data["+ i +"].UserId"));
			publishInfoDo.setRegionId(context.stringValue("TopicGetResponse.Data["+ i +"].RegionId"));
			publishInfoDo.setRegionName(context.stringValue("TopicGetResponse.Data["+ i +"].RegionName"));
			publishInfoDo.setRelation(context.integerValue("TopicGetResponse.Data["+ i +"].Relation"));
			publishInfoDo.setRelationName(context.stringValue("TopicGetResponse.Data["+ i +"].RelationName"));
			publishInfoDo.setStatus(context.integerValue("TopicGetResponse.Data["+ i +"].Status"));
			publishInfoDo.setStatusName(context.stringValue("TopicGetResponse.Data["+ i +"].StatusName"));
			publishInfoDo.setCreateTime(context.longValue("TopicGetResponse.Data["+ i +"].CreateTime"));
			publishInfoDo.setUpdateTime(context.longValue("TopicGetResponse.Data["+ i +"].UpdateTime"));

			data.add(publishInfoDo);
		}
		topicGetResponse.setData(data);
	 
	 	return topicGetResponse;
	}
}