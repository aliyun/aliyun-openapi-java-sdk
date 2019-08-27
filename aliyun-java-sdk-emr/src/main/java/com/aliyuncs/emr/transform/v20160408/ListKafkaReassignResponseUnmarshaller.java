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

import com.aliyuncs.emr.model.v20160408.ListKafkaReassignResponse;
import com.aliyuncs.emr.model.v20160408.ListKafkaReassignResponse.Reassign;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListKafkaReassignResponseUnmarshaller {

	public static ListKafkaReassignResponse unmarshall(ListKafkaReassignResponse listKafkaReassignResponse, UnmarshallerContext _ctx) {
		
		listKafkaReassignResponse.setRequestId(_ctx.stringValue("ListKafkaReassignResponse.RequestId"));
		listKafkaReassignResponse.setTotal(_ctx.integerValue("ListKafkaReassignResponse.Total"));
		listKafkaReassignResponse.setPageSize(_ctx.integerValue("ListKafkaReassignResponse.PageSize"));
		listKafkaReassignResponse.setPageNumber(_ctx.integerValue("ListKafkaReassignResponse.PageNumber"));

		List<Reassign> reassignList = new ArrayList<Reassign>();
		for (int i = 0; i < _ctx.lengthValue("ListKafkaReassignResponse.ReassignList.Length"); i++) {
			Reassign reassign = new Reassign();
			reassign.setId(_ctx.stringValue("ListKafkaReassignResponse.ReassignList["+ i +"].Id"));
			reassign.setStatus(_ctx.stringValue("ListKafkaReassignResponse.ReassignList["+ i +"].Status"));
			reassign.setAssignProcess(_ctx.integerValue("ListKafkaReassignResponse.ReassignList["+ i +"].AssignProcess"));
			reassign.setStartTime(_ctx.longValue("ListKafkaReassignResponse.ReassignList["+ i +"].StartTime"));
			reassign.setEndTime(_ctx.longValue("ListKafkaReassignResponse.ReassignList["+ i +"].EndTime"));
			reassign.setTopicCount(_ctx.integerValue("ListKafkaReassignResponse.ReassignList["+ i +"].TopicCount"));
			reassign.setPartitionCount(_ctx.integerValue("ListKafkaReassignResponse.ReassignList["+ i +"].PartitionCount"));
			reassign.setThrottle(_ctx.longValue("ListKafkaReassignResponse.ReassignList["+ i +"].Throttle"));

			reassignList.add(reassign);
		}
		listKafkaReassignResponse.setReassignList(reassignList);
	 
	 	return listKafkaReassignResponse;
	}
}