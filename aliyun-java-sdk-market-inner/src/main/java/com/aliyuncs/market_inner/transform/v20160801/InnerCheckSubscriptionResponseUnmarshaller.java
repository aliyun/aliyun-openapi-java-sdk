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

package com.aliyuncs.market_inner.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market_inner.model.v20160801.InnerCheckSubscriptionResponse;
import com.aliyuncs.market_inner.model.v20160801.InnerCheckSubscriptionResponse.Subscription;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerCheckSubscriptionResponseUnmarshaller {

	public static InnerCheckSubscriptionResponse unmarshall(InnerCheckSubscriptionResponse innerCheckSubscriptionResponse, UnmarshallerContext context) {
		
		innerCheckSubscriptionResponse.setRequestId(context.stringValue("InnerCheckSubscriptionResponse.RequestId"));
		innerCheckSubscriptionResponse.setPageNumber(context.integerValue("InnerCheckSubscriptionResponse.PageNumber"));
		innerCheckSubscriptionResponse.setPageSize(context.integerValue("InnerCheckSubscriptionResponse.PageSize"));
		innerCheckSubscriptionResponse.setTotalCount(context.integerValue("InnerCheckSubscriptionResponse.TotalCount"));

		List<Subscription> subscriptionList = new ArrayList<Subscription>();
		for (int i = 0; i < context.lengthValue("InnerCheckSubscriptionResponse.SubscriptionList.Length"); i++) {
			Subscription subscription = new Subscription();
			subscription.setImageId(context.stringValue("InnerCheckSubscriptionResponse.SubscriptionList["+ i +"].ImageId"));
			subscription.setCheckResult(context.booleanValue("InnerCheckSubscriptionResponse.SubscriptionList["+ i +"].CheckResult"));

			subscriptionList.add(subscription);
		}
		innerCheckSubscriptionResponse.setSubscriptionList(subscriptionList);
	 
	 	return innerCheckSubscriptionResponse;
	}
}