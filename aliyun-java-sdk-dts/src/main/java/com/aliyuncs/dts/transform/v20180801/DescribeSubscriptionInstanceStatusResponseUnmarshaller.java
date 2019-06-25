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

import com.aliyuncs.dts.model.v20180801.DescribeSubscriptionInstanceStatusResponse;
import com.aliyuncs.dts.model.v20180801.DescribeSubscriptionInstanceStatusResponse.SourceEndpoint;
import com.aliyuncs.dts.model.v20180801.DescribeSubscriptionInstanceStatusResponse.SubscriptionDataType;
import com.aliyuncs.dts.model.v20180801.DescribeSubscriptionInstanceStatusResponse.SubscriptionHost;
import com.aliyuncs.dts.model.v20180801.DescribeSubscriptionInstanceStatusResponse.SynchronousObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSubscriptionInstanceStatusResponseUnmarshaller {

	public static DescribeSubscriptionInstanceStatusResponse unmarshall(DescribeSubscriptionInstanceStatusResponse describeSubscriptionInstanceStatusResponse, UnmarshallerContext context) {
		
		describeSubscriptionInstanceStatusResponse.setSubscriptionInstanceID(context.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionInstanceID"));
		describeSubscriptionInstanceStatusResponse.setSubscriptionInstanceName(context.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionInstanceName"));
		describeSubscriptionInstanceStatusResponse.setPayType(context.stringValue("DescribeSubscriptionInstanceStatusResponse.PayType"));
		describeSubscriptionInstanceStatusResponse.setStatus(context.stringValue("DescribeSubscriptionInstanceStatusResponse.Status"));
		describeSubscriptionInstanceStatusResponse.setErrorMessage(context.stringValue("DescribeSubscriptionInstanceStatusResponse.ErrorMessage"));
		describeSubscriptionInstanceStatusResponse.setConsumptionCheckpoint(context.stringValue("DescribeSubscriptionInstanceStatusResponse.ConsumptionCheckpoint"));
		describeSubscriptionInstanceStatusResponse.setBeginTimestamp(context.stringValue("DescribeSubscriptionInstanceStatusResponse.BeginTimestamp"));
		describeSubscriptionInstanceStatusResponse.setEndTimestamp(context.stringValue("DescribeSubscriptionInstanceStatusResponse.EndTimestamp"));
		describeSubscriptionInstanceStatusResponse.setConsumptionClient(context.stringValue("DescribeSubscriptionInstanceStatusResponse.ConsumptionClient"));
		describeSubscriptionInstanceStatusResponse.setSubscribeTopic(context.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscribeTopic"));

		SourceEndpoint sourceEndpoint = new SourceEndpoint();
		sourceEndpoint.setInstanceID(context.stringValue("DescribeSubscriptionInstanceStatusResponse.SourceEndpoint.InstanceID"));
		sourceEndpoint.setInstanceType(context.stringValue("DescribeSubscriptionInstanceStatusResponse.SourceEndpoint.InstanceType"));
		describeSubscriptionInstanceStatusResponse.setSourceEndpoint(sourceEndpoint);

		SubscriptionDataType subscriptionDataType = new SubscriptionDataType();
		subscriptionDataType.setDDL(context.booleanValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionDataType.DDL"));
		subscriptionDataType.setDML(context.booleanValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionDataType.DML"));
		describeSubscriptionInstanceStatusResponse.setSubscriptionDataType(subscriptionDataType);

		SubscriptionHost subscriptionHost = new SubscriptionHost();
		subscriptionHost.setPublicHost(context.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionHost.PublicHost"));
		subscriptionHost.setPrivateHost(context.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionHost.PrivateHost"));
		subscriptionHost.setVPCHost(context.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionHost.VPCHost"));
		describeSubscriptionInstanceStatusResponse.setSubscriptionHost(subscriptionHost);

		List<SynchronousObject> subscriptionObject = new ArrayList<SynchronousObject>();
		for (int i = 0; i < context.lengthValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionObject.Length"); i++) {
			SynchronousObject synchronousObject = new SynchronousObject();
			synchronousObject.setDatabaseName(context.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionObject["+ i +"].DatabaseName"));
			synchronousObject.setWholeDatabase(context.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionObject["+ i +"].WholeDatabase"));

			List<String> tableList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionObject["+ i +"].TableList.Length"); j++) {
				tableList.add(context.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionObject["+ i +"].TableList["+ j +"]"));
			}
			synchronousObject.setTableList(tableList);

			subscriptionObject.add(synchronousObject);
		}
		describeSubscriptionInstanceStatusResponse.setSubscriptionObject(subscriptionObject);
	 
	 	return describeSubscriptionInstanceStatusResponse;
	}
}