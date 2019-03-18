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
import com.aliyuncs.dts.model.v20180801.DescribeSubscriptionInstancesResponse.SubscriptionInstance.SynchronousObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSubscriptionInstancesResponseUnmarshaller {

	public static DescribeSubscriptionInstancesResponse unmarshall(DescribeSubscriptionInstancesResponse describeSubscriptionInstancesResponse, UnmarshallerContext context) {
		
		describeSubscriptionInstancesResponse.setPageNumber(context.integerValue("DescribeSubscriptionInstancesResponse.PageNumber"));
		describeSubscriptionInstancesResponse.setTotalRecordCount(context.longValue("DescribeSubscriptionInstancesResponse.TotalRecordCount"));
		describeSubscriptionInstancesResponse.setPageRecordCount(context.integerValue("DescribeSubscriptionInstancesResponse.PageRecordCount"));

		List<SubscriptionInstance> subscriptionInstances = new ArrayList<SubscriptionInstance>();
		for (int i = 0; i < context.lengthValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances.Length"); i++) {
			SubscriptionInstance subscriptionInstance = new SubscriptionInstance();
			subscriptionInstance.setSubscriptionInstanceID(context.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionInstanceID"));
			subscriptionInstance.setSubscriptionInstanceName(context.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionInstanceName"));
			subscriptionInstance.setPayType(context.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].PayType"));
			subscriptionInstance.setStatus(context.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].Status"));
			subscriptionInstance.setErrorMessage(context.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].ErrorMessage"));
			subscriptionInstance.setConsumptionCheckpoint(context.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].ConsumptionCheckpoint"));
			subscriptionInstance.setBeginTimestamp(context.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].BeginTimestamp"));
			subscriptionInstance.setEndTimestamp(context.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].EndTimestamp"));
			subscriptionInstance.setConsumptionClient(context.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].ConsumptionClient"));

			SourceEndpoint sourceEndpoint = new SourceEndpoint();
			sourceEndpoint.setInstanceID(context.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SourceEndpoint.InstanceID"));
			sourceEndpoint.setInstanceType(context.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SourceEndpoint.InstanceType"));
			subscriptionInstance.setSourceEndpoint(sourceEndpoint);

			SubscriptionDataType subscriptionDataType = new SubscriptionDataType();
			subscriptionDataType.setDDL(context.booleanValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionDataType.DDL"));
			subscriptionDataType.setDML(context.booleanValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionDataType.DML"));
			subscriptionInstance.setSubscriptionDataType(subscriptionDataType);

			List<SynchronousObject> subscriptionObject = new ArrayList<SynchronousObject>();
			for (int j = 0; j < context.lengthValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionObject.Length"); j++) {
				SynchronousObject synchronousObject = new SynchronousObject();
				synchronousObject.setDatabaseName(context.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionObject["+ j +"].DatabaseName"));
				synchronousObject.setWholeDatabase(context.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionObject["+ j +"].WholeDatabase"));

				List<String> tableList = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionObject["+ j +"].TableList.Length"); k++) {
					tableList.add(context.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionObject["+ j +"].TableList["+ k +"]"));
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