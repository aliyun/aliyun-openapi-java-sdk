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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListKafkaReassignTopicResponse;
import com.aliyuncs.emr.model.v20160408.ListKafkaReassignTopicResponse.ReassignTopic;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListKafkaReassignTopicResponseUnmarshaller {

	public static ListKafkaReassignTopicResponse unmarshall(ListKafkaReassignTopicResponse listKafkaReassignTopicResponse, UnmarshallerContext _ctx) {
		
		listKafkaReassignTopicResponse.setRequestId(_ctx.stringValue("ListKafkaReassignTopicResponse.RequestId"));
		listKafkaReassignTopicResponse.setTotal(_ctx.integerValue("ListKafkaReassignTopicResponse.Total"));
		listKafkaReassignTopicResponse.setPageSize(_ctx.integerValue("ListKafkaReassignTopicResponse.PageSize"));
		listKafkaReassignTopicResponse.setPageNumber(_ctx.integerValue("ListKafkaReassignTopicResponse.PageNumber"));

		List<ReassignTopic> reassignTopicList = new ArrayList<ReassignTopic>();
		for (int i = 0; i < _ctx.lengthValue("ListKafkaReassignTopicResponse.ReassignTopicList.Length"); i++) {
			ReassignTopic reassignTopic = new ReassignTopic();
			reassignTopic.setTopicId(_ctx.stringValue("ListKafkaReassignTopicResponse.ReassignTopicList["+ i +"].TopicId"));
			reassignTopic.setTopicName(_ctx.stringValue("ListKafkaReassignTopicResponse.ReassignTopicList["+ i +"].TopicName"));
			reassignTopic.setNumPartition(_ctx.integerValue("ListKafkaReassignTopicResponse.ReassignTopicList["+ i +"].NumPartition"));
			reassignTopic.setFinishedPartition(_ctx.integerValue("ListKafkaReassignTopicResponse.ReassignTopicList["+ i +"].FinishedPartition"));
			reassignTopic.setProcess(_ctx.stringValue("ListKafkaReassignTopicResponse.ReassignTopicList["+ i +"].Process"));
			reassignTopic.setStatus(_ctx.stringValue("ListKafkaReassignTopicResponse.ReassignTopicList["+ i +"].Status"));

			reassignTopicList.add(reassignTopic);
		}
		listKafkaReassignTopicResponse.setReassignTopicList(reassignTopicList);
	 
	 	return listKafkaReassignTopicResponse;
	}
}