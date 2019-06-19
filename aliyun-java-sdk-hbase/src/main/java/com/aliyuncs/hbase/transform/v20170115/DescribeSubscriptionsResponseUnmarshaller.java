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

package com.aliyuncs.hbase.transform.v20170115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20170115.DescribeSubscriptionsResponse;
import com.aliyuncs.hbase.model.v20170115.DescribeSubscriptionsResponse.Items;
import com.aliyuncs.hbase.model.v20170115.DescribeSubscriptionsResponse.Items.Items1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSubscriptionsResponseUnmarshaller {

	public static DescribeSubscriptionsResponse unmarshall(DescribeSubscriptionsResponse describeSubscriptionsResponse, UnmarshallerContext context) {
		
		describeSubscriptionsResponse.setRequestId(context.stringValue("DescribeSubscriptionsResponse.RequestId"));

		List<Items> subscriptions = new ArrayList<Items>();
		for (int i = 0; i < context.lengthValue("DescribeSubscriptionsResponse.Subscriptions.Length"); i++) {
			Items items = new Items();
			items.setSubscriptionId(context.stringValue("DescribeSubscriptionsResponse.Subscriptions["+ i +"].SubscriptionId"));
			items.setSubscriptionType(context.stringValue("DescribeSubscriptionsResponse.Subscriptions["+ i +"].SubscriptionType"));
			items.setSubscriptionDescription(context.stringValue("DescribeSubscriptionsResponse.Subscriptions["+ i +"].SubscriptionDescription"));
			items.setSubscriptionStatus(context.stringValue("DescribeSubscriptionsResponse.Subscriptions["+ i +"].SubscriptionStatus"));
			items.setMapping(context.stringValue("DescribeSubscriptionsResponse.Subscriptions["+ i +"].Mapping"));

			List<Items1> dBInstances = new ArrayList<Items1>();
			for (int j = 0; j < context.lengthValue("DescribeSubscriptionsResponse.Subscriptions["+ i +"].DBInstances.Length"); j++) {
				Items1 items1 = new Items1();
				items1.setDBInstanceId(context.stringValue("DescribeSubscriptionsResponse.Subscriptions["+ i +"].DBInstances["+ j +"].DBInstanceId"));
				items1.setRegionId(context.stringValue("DescribeSubscriptionsResponse.Subscriptions["+ i +"].DBInstances["+ j +"].RegionId"));
				items1.setRole(context.stringValue("DescribeSubscriptionsResponse.Subscriptions["+ i +"].DBInstances["+ j +"].Role"));

				dBInstances.add(items1);
			}
			items.setDBInstances(dBInstances);

			subscriptions.add(items);
		}
		describeSubscriptionsResponse.setSubscriptions(subscriptions);
	 
	 	return describeSubscriptionsResponse;
	}
}