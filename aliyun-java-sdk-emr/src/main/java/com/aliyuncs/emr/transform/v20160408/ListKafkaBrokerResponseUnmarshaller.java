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

import com.aliyuncs.emr.model.v20160408.ListKafkaBrokerResponse;
import com.aliyuncs.emr.model.v20160408.ListKafkaBrokerResponse.Broker;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListKafkaBrokerResponseUnmarshaller {

	public static ListKafkaBrokerResponse unmarshall(ListKafkaBrokerResponse listKafkaBrokerResponse, UnmarshallerContext _ctx) {
		
		listKafkaBrokerResponse.setRequestId(_ctx.stringValue("ListKafkaBrokerResponse.RequestId"));
		listKafkaBrokerResponse.setTotal(_ctx.integerValue("ListKafkaBrokerResponse.Total"));
		listKafkaBrokerResponse.setPageSize(_ctx.integerValue("ListKafkaBrokerResponse.PageSize"));
		listKafkaBrokerResponse.setPageNumber(_ctx.integerValue("ListKafkaBrokerResponse.PageNumber"));

		List<Broker> brokerList = new ArrayList<Broker>();
		for (int i = 0; i < _ctx.lengthValue("ListKafkaBrokerResponse.BrokerList.Length"); i++) {
			Broker broker = new Broker();
			broker.setBrokerId(_ctx.integerValue("ListKafkaBrokerResponse.BrokerList["+ i +"].BrokerId"));
			broker.setHostId(_ctx.stringValue("ListKafkaBrokerResponse.BrokerList["+ i +"].HostId"));
			broker.setHostName(_ctx.stringValue("ListKafkaBrokerResponse.BrokerList["+ i +"].HostName"));
			broker.setHostIp(_ctx.stringValue("ListKafkaBrokerResponse.BrokerList["+ i +"].HostIp"));
			broker.setStatus(_ctx.stringValue("ListKafkaBrokerResponse.BrokerList["+ i +"].Status"));
			broker.setPartitionCount(_ctx.integerValue("ListKafkaBrokerResponse.BrokerList["+ i +"].PartitionCount"));
			broker.setLeaderCount(_ctx.integerValue("ListKafkaBrokerResponse.BrokerList["+ i +"].LeaderCount"));
			broker.setTopicCount(_ctx.integerValue("ListKafkaBrokerResponse.BrokerList["+ i +"].TopicCount"));
			broker.setDiskUnbalanceRate(_ctx.stringValue("ListKafkaBrokerResponse.BrokerList["+ i +"].DiskUnbalanceRate"));
			broker.setDiskUsageMean(_ctx.stringValue("ListKafkaBrokerResponse.BrokerList["+ i +"].DiskUsageMean"));
			broker.setDiskUsageMax(_ctx.stringValue("ListKafkaBrokerResponse.BrokerList["+ i +"].DiskUsageMax"));
			broker.setDiskCapacity(_ctx.integerValue("ListKafkaBrokerResponse.BrokerList["+ i +"].DiskCapacity"));
			broker.setTrafficIn(_ctx.stringValue("ListKafkaBrokerResponse.BrokerList["+ i +"].TrafficIn"));
			broker.setTrafficOut(_ctx.stringValue("ListKafkaBrokerResponse.BrokerList["+ i +"].TrafficOut"));

			brokerList.add(broker);
		}
		listKafkaBrokerResponse.setBrokerList(brokerList);
	 
	 	return listKafkaBrokerResponse;
	}
}