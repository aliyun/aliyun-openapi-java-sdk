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
package com.aliyuncs.iot.transform.v20160530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20160530.QueryTopicResponse;
import com.aliyuncs.iot.model.v20160530.QueryTopicResponse.TopicInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTopicResponseUnmarshaller {

	public static QueryTopicResponse unmarshall(QueryTopicResponse queryTopicResponse, UnmarshallerContext context) {
		
		queryTopicResponse.setRequestId(context.stringValue("QueryTopicResponse.RequestId"));
		queryTopicResponse.setSuccess(context.booleanValue("QueryTopicResponse.Success"));
		queryTopicResponse.setErrorMessage(context.stringValue("QueryTopicResponse.ErrorMessage"));

		List<TopicInfo> topicList = new ArrayList<TopicInfo>();
		for (int i = 0; i < context.lengthValue("QueryTopicResponse.TopicList.Length"); i++) {
			TopicInfo topicInfo = new TopicInfo();
			topicInfo.setTopicName(context.stringValue("QueryTopicResponse.TopicList["+ i +"].TopicName"));
			topicInfo.setProductKey(context.stringValue("QueryTopicResponse.TopicList["+ i +"].ProductKey"));
			topicInfo.setTopicMessageCount(context.integerValue("QueryTopicResponse.TopicList["+ i +"].TopicMessageCount"));
			topicInfo.setOwnerUserId(context.stringValue("QueryTopicResponse.TopicList["+ i +"].OwnerUserId"));

			topicList.add(topicInfo);
		}
		queryTopicResponse.setTopicList(topicList);
	 
	 	return queryTopicResponse;
	}
}