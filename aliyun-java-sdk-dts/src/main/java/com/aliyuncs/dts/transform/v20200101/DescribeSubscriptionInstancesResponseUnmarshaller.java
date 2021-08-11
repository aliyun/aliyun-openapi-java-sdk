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

import com.aliyuncs.dts.model.v20200101.DescribeSubscriptionInstancesResponse;
import com.aliyuncs.dts.model.v20200101.DescribeSubscriptionInstancesResponse.SubscriptionInstance;
import com.aliyuncs.dts.model.v20200101.DescribeSubscriptionInstancesResponse.SubscriptionInstance.SourceEndpoint;
import com.aliyuncs.dts.model.v20200101.DescribeSubscriptionInstancesResponse.SubscriptionInstance.SubscriptionDataType;
import com.aliyuncs.dts.model.v20200101.DescribeSubscriptionInstancesResponse.SubscriptionInstance.SubscriptionHost;
import com.aliyuncs.dts.model.v20200101.DescribeSubscriptionInstancesResponse.SubscriptionInstance.SynchronousObject;
import com.aliyuncs.dts.model.v20200101.DescribeSubscriptionInstancesResponse.SubscriptionInstance.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSubscriptionInstancesResponseUnmarshaller {

	public static DescribeSubscriptionInstancesResponse unmarshall(DescribeSubscriptionInstancesResponse describeSubscriptionInstancesResponse, UnmarshallerContext _ctx) {
		
		describeSubscriptionInstancesResponse.setRequestId(_ctx.stringValue("DescribeSubscriptionInstancesResponse.RequestId"));
		describeSubscriptionInstancesResponse.setErrCode(_ctx.stringValue("DescribeSubscriptionInstancesResponse.ErrCode"));
		describeSubscriptionInstancesResponse.setErrMessage(_ctx.stringValue("DescribeSubscriptionInstancesResponse.ErrMessage"));
		describeSubscriptionInstancesResponse.setPageNumber(_ctx.integerValue("DescribeSubscriptionInstancesResponse.PageNumber"));
		describeSubscriptionInstancesResponse.setPageRecordCount(_ctx.integerValue("DescribeSubscriptionInstancesResponse.PageRecordCount"));
		describeSubscriptionInstancesResponse.setSuccess(_ctx.stringValue("DescribeSubscriptionInstancesResponse.Success"));
		describeSubscriptionInstancesResponse.setTotalRecordCount(_ctx.longValue("DescribeSubscriptionInstancesResponse.TotalRecordCount"));

		List<SubscriptionInstance> subscriptionInstances = new ArrayList<SubscriptionInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances.Length"); i++) {
			SubscriptionInstance subscriptionInstance = new SubscriptionInstance();
			subscriptionInstance.setBeginTimestamp(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].BeginTimestamp"));
			subscriptionInstance.setConsumptionCheckpoint(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].ConsumptionCheckpoint"));
			subscriptionInstance.setConsumptionClient(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].ConsumptionClient"));
			subscriptionInstance.setEndTimestamp(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].EndTimestamp"));
			subscriptionInstance.setErrorMessage(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].ErrorMessage"));
			subscriptionInstance.setPayType(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].PayType"));
			subscriptionInstance.setStatus(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].Status"));
			subscriptionInstance.setSubscribeTopic(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscribeTopic"));
			subscriptionInstance.setSubscriptionInstanceID(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionInstanceID"));
			subscriptionInstance.setSubscriptionInstanceName(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionInstanceName"));
			subscriptionInstance.setJobCreateTime(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].JobCreateTime"));
			subscriptionInstance.setInstanceCreateTime(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].InstanceCreateTime"));

			SourceEndpoint sourceEndpoint = new SourceEndpoint();
			sourceEndpoint.setInstanceID(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SourceEndpoint.InstanceID"));
			sourceEndpoint.setInstanceType(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SourceEndpoint.InstanceType"));
			subscriptionInstance.setSourceEndpoint(sourceEndpoint);

			SubscriptionDataType subscriptionDataType = new SubscriptionDataType();
			subscriptionDataType.setDDL(_ctx.booleanValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionDataType.DDL"));
			subscriptionDataType.setDML(_ctx.booleanValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionDataType.DML"));
			subscriptionInstance.setSubscriptionDataType(subscriptionDataType);

			SubscriptionHost subscriptionHost = new SubscriptionHost();
			subscriptionHost.setPrivateHost(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionHost.PrivateHost"));
			subscriptionHost.setPublicHost(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].SubscriptionHost.PublicHost"));
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

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeSubscriptionInstancesResponse.SubscriptionInstances["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			subscriptionInstance.setTags(tags);

			subscriptionInstances.add(subscriptionInstance);
		}
		describeSubscriptionInstancesResponse.setSubscriptionInstances(subscriptionInstances);
	 
	 	return describeSubscriptionInstancesResponse;
	}
}