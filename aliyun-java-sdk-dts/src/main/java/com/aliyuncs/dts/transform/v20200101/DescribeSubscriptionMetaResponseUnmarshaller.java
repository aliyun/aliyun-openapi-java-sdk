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

import com.aliyuncs.dts.model.v20200101.DescribeSubscriptionMetaResponse;
import com.aliyuncs.dts.model.v20200101.DescribeSubscriptionMetaResponse.SubscriptionMetaListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSubscriptionMetaResponseUnmarshaller {

	public static DescribeSubscriptionMetaResponse unmarshall(DescribeSubscriptionMetaResponse describeSubscriptionMetaResponse, UnmarshallerContext _ctx) {
		
		describeSubscriptionMetaResponse.setRequestId(_ctx.stringValue("DescribeSubscriptionMetaResponse.RequestId"));
		describeSubscriptionMetaResponse.setErrCode(_ctx.stringValue("DescribeSubscriptionMetaResponse.ErrCode"));
		describeSubscriptionMetaResponse.setErrMessage(_ctx.stringValue("DescribeSubscriptionMetaResponse.ErrMessage"));
		describeSubscriptionMetaResponse.setHttpStatusCode(_ctx.stringValue("DescribeSubscriptionMetaResponse.HttpStatusCode"));
		describeSubscriptionMetaResponse.setSuccess(_ctx.stringValue("DescribeSubscriptionMetaResponse.Success"));

		List<SubscriptionMetaListItem> subscriptionMetaList = new ArrayList<SubscriptionMetaListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSubscriptionMetaResponse.SubscriptionMetaList.Length"); i++) {
			SubscriptionMetaListItem subscriptionMetaListItem = new SubscriptionMetaListItem();
			subscriptionMetaListItem.setDProxyUrl(_ctx.stringValue("DescribeSubscriptionMetaResponse.SubscriptionMetaList["+ i +"].DProxyUrl"));
			subscriptionMetaListItem.setTopic(_ctx.stringValue("DescribeSubscriptionMetaResponse.SubscriptionMetaList["+ i +"].Topic"));
			subscriptionMetaListItem.setSid(_ctx.stringValue("DescribeSubscriptionMetaResponse.SubscriptionMetaList["+ i +"].Sid"));
			subscriptionMetaListItem.setCheckpoint(_ctx.longValue("DescribeSubscriptionMetaResponse.SubscriptionMetaList["+ i +"].Checkpoint"));
			subscriptionMetaListItem.setDBList(_ctx.stringValue("DescribeSubscriptionMetaResponse.SubscriptionMetaList["+ i +"].DBList"));

			subscriptionMetaList.add(subscriptionMetaListItem);
		}
		describeSubscriptionMetaResponse.setSubscriptionMetaList(subscriptionMetaList);
	 
	 	return describeSubscriptionMetaResponse;
	}
}