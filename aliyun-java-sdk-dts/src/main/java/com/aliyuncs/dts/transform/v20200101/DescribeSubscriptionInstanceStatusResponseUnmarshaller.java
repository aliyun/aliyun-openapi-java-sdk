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

package com.aliyuncs.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20200101.DescribeSubscriptionInstanceStatusResponse;
import com.aliyuncs.dts.model.v20200101.DescribeSubscriptionInstanceStatusResponse.SourceEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeSubscriptionInstanceStatusResponse.SubscriptionDataType;
import com.aliyuncs.dts.model.v20200101.DescribeSubscriptionInstanceStatusResponse.SubscriptionHost;
import com.aliyuncs.dts.model.v20200101.DescribeSubscriptionInstanceStatusResponse.SynchronousObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSubscriptionInstanceStatusResponseUnmarshaller {

	public static DescribeSubscriptionInstanceStatusResponse unmarshall(DescribeSubscriptionInstanceStatusResponse describeSubscriptionInstanceStatusResponse, UnmarshallerContext _ctx) {
		
		describeSubscriptionInstanceStatusResponse.setRequestId(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.RequestId"));
		describeSubscriptionInstanceStatusResponse.setStatus(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.Status"));
		describeSubscriptionInstanceStatusResponse.setErrorMessage(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.ErrorMessage"));
		describeSubscriptionInstanceStatusResponse.setErrCode(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.ErrCode"));
		describeSubscriptionInstanceStatusResponse.setSuccess(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.Success"));
		describeSubscriptionInstanceStatusResponse.setErrMessage(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.ErrMessage"));
		describeSubscriptionInstanceStatusResponse.setPayType(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.PayType"));
		describeSubscriptionInstanceStatusResponse.setConsumptionClient(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.ConsumptionClient"));
		describeSubscriptionInstanceStatusResponse.setConsumptionCheckpoint(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.ConsumptionCheckpoint"));
		describeSubscriptionInstanceStatusResponse.setEndTimestamp(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.EndTimestamp"));
		describeSubscriptionInstanceStatusResponse.setBeginTimestamp(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.BeginTimestamp"));
		describeSubscriptionInstanceStatusResponse.setSubscribeTopic(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscribeTopic"));
		describeSubscriptionInstanceStatusResponse.setSubscriptionInstanceName(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionInstanceName"));
		describeSubscriptionInstanceStatusResponse.setSubscriptionInstanceID(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionInstanceID"));
		describeSubscriptionInstanceStatusResponse.setTaskId(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.TaskId"));

		SourceEndpoint sourceEndpoint = new SourceEndpoint();
		sourceEndpoint.setInstanceType(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.SourceEndpoint.InstanceType"));
		sourceEndpoint.setInstanceID(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.SourceEndpoint.InstanceID"));
		describeSubscriptionInstanceStatusResponse.setSourceEndpoint(sourceEndpoint);

		SubscriptionDataType subscriptionDataType = new SubscriptionDataType();
		subscriptionDataType.setDML(_ctx.booleanValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionDataType.DML"));
		subscriptionDataType.setDDL(_ctx.booleanValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionDataType.DDL"));
		describeSubscriptionInstanceStatusResponse.setSubscriptionDataType(subscriptionDataType);

		SubscriptionHost subscriptionHost = new SubscriptionHost();
		subscriptionHost.setVPCHost(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionHost.VPCHost"));
		subscriptionHost.setPublicHost(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionHost.PublicHost"));
		subscriptionHost.setPrivateHost(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionHost.PrivateHost"));
		describeSubscriptionInstanceStatusResponse.setSubscriptionHost(subscriptionHost);

		List<SynchronousObject> subscriptionObject = new ArrayList<SynchronousObject>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionObject.Length"); i++) {
			SynchronousObject synchronousObject = new SynchronousObject();
			synchronousObject.setDatabaseName(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionObject["+ i +"].DatabaseName"));
			synchronousObject.setWholeDatabase(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionObject["+ i +"].WholeDatabase"));

			List<String> tableList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionObject["+ i +"].TableList.Length"); j++) {
				tableList.add(_ctx.stringValue("DescribeSubscriptionInstanceStatusResponse.SubscriptionObject["+ i +"].TableList["+ j +"]"));
			}
			synchronousObject.setTableList(tableList);

			subscriptionObject.add(synchronousObject);
		}
		describeSubscriptionInstanceStatusResponse.setSubscriptionObject(subscriptionObject);
	 
	 	return describeSubscriptionInstanceStatusResponse;
	}
}