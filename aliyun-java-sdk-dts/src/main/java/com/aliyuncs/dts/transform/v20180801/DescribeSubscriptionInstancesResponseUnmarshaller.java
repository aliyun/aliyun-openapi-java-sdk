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

package com.aliyuncs.dts.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20180801.DescribeSubscriptionInstancesResponse;
import com.aliyuncs.dts.model.v20180801.DescribeSubscriptionInstancesResponse.SubscriptionInstance;
import com.aliyuncs.dts.model.v20180801.DescribeSubscriptionInstancesResponse.SubscriptionInstance.SourceEndpoint;
import com.aliyuncs.dts.model.v20180801.DescribeSubscriptionInstancesResponse.SubscriptionInstance.SubscriptionDataType;
import com.aliyuncs.dts.model.v20180801.DescribeSubscriptionInstancesResponse.SubscriptionInstance.SubscriptionHost;
import com.aliyuncs.dts.model.v20180801.DescribeSubscriptionInstancesResponse.SubscriptionInstance.SynchronousObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSubscriptionInstancesResponseUnmarshaller {

	public static DescribeSubscriptionInstancesResponse unmarshall(DescribeSubscriptionInstancesResponse describeSubscriptionInstancesResponse, UnmarshallerContext _ctx) {
		
		describeSubscriptionInstancesResponse.setPageNumber(_ctx.integerValue("DescribeSubscriptionInstancesResponse.PageNumber"));
		describeSubscriptionInstancesResponse.setTotalRecordCount(_ctx.longValue("DescribeSubscriptionInstancesResponse.TotalRecordCount"));
		describeSubscriptionInstancesResponse.setPageRecordCount(_ctx.integerValue("DescribeSubscriptionInstancesResponse.PageRecordCount"));

		List<SubscriptionInstance> subscriptionInstances = new ArrayList<SubscriptionInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances.Length"); i++) {
			SubscriptionInstance subscriptionInstance = new SubscriptionInstance();
			subscriptionInstance.setSubscriptionInstanceID(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionInstanceID"));
			subscriptionInstance.setSubscriptionInstanceName(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionInstanceName"));
			subscriptionInstance.setPayType(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].PayType"));
			subscriptionInstance.setStatus(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].Status"));
			subscriptionInstance.setErrorMessage(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].ErrorMessage"));
			subscriptionInstance.setConsumptionCheckpoint(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].ConsumptionCheckpoint"));
			subscriptionInstance.setBeginTimestamp(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].BeginTimestamp"));
			subscriptionInstance.setEndTimestamp(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].EndTimestamp"));
			subscriptionInstance.setConsumptionClient(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].ConsumptionClient"));
			subscriptionInstance.setSubscribeTopic(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscribeTopic"));

			SourceEndpoint sourceEndpoint = new SourceEndpoint();
			sourceEndpoint.setInstanceID(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SourceEndpoint.InstanceID"));
			sourceEndpoint.setInstanceType(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SourceEndpoint.InstanceType"));
			subscriptionInstance.setSourceEndpoint(sourceEndpoint);

			SubscriptionDataType subscriptionDataType = new SubscriptionDataType();
			subscriptionDataType.setDDL(_ctx.booleanValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionDataType.DDL"));
			subscriptionDataType.setDML(_ctx.booleanValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionDataType.DML"));
			subscriptionInstance.setSubscriptionDataType(subscriptionDataType);

			SubscriptionHost subscriptionHost = new SubscriptionHost();
			subscriptionHost.setPublicHost(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionHost.PublicHost"));
			subscriptionHost.setPrivateHost(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionHost.PrivateHost"));
			subscriptionHost.setVPCHost(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionHost.VPCHost"));
			subscriptionInstance.setSubscriptionHost(subscriptionHost);

			List<SynchronousObject> subscriptionObject = new ArrayList<SynchronousObject>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionObject.Length"); j++) {
				SynchronousObject synchronousObject = new SynchronousObject();
				synchronousObject.setDatabaseName(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionObject["+ j +"].DatabaseName"));
				synchronousObject.setWholeDatabase(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionObject["+ j +"].WholeDatabase"));

				List<String> tableList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionObject["+ j +"].TableList.Length"); k++) {
					tableList.add(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionObject["+ j +"].TableList["+ k +"]"));
				}
				synchronousObject.setTableList(tableList);

				subscriptionObject.add(synchronousObject);
			}
			subscriptionInstance.setSubscriptionObject(subscriptionObject);

			subscriptionInstances.add(subscriptionInstance);
		}
		describeSubscriptionInstancesResponse.setSubscriptionInstances(subscriptionInstances);
	 
	 	return describeSubscriptionInstancesResponse;
	}
}