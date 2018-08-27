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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeStaticVerificationListResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeStaticVerificationListResponse.ItemsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStaticVerificationListResponseUnmarshaller {

	public static DescribeStaticVerificationListResponse unmarshall(DescribeStaticVerificationListResponse describeStaticVerificationListResponse, UnmarshallerContext context) {
		
		describeStaticVerificationListResponse.setRequestId(context.stringValue("DescribeStaticVerificationListResponse.RequestId"));
		describeStaticVerificationListResponse.setReplicaId(context.stringValue("DescribeStaticVerificationListResponse.ReplicaId"));
		describeStaticVerificationListResponse.setSourceInstanceId(context.stringValue("DescribeStaticVerificationListResponse.SourceInstanceId"));
		describeStaticVerificationListResponse.setSourceDBNumber(context.integerValue("DescribeStaticVerificationListResponse.SourceDBNumber"));
		describeStaticVerificationListResponse.setSourceTableNumber(context.integerValue("DescribeStaticVerificationListResponse.SourceTableNumber"));
		describeStaticVerificationListResponse.setSourceCountNumber(context.integerValue("DescribeStaticVerificationListResponse.SourceCountNumber"));
		describeStaticVerificationListResponse.setSourceDBSize(context.integerValue("DescribeStaticVerificationListResponse.SourceDBSize"));
		describeStaticVerificationListResponse.setDestinationInstanceId(context.stringValue("DescribeStaticVerificationListResponse.DestinationInstanceId"));
		describeStaticVerificationListResponse.setDestinationDBNumber(context.integerValue("DescribeStaticVerificationListResponse.DestinationDBNumber"));
		describeStaticVerificationListResponse.setDestinationTableNumber(context.integerValue("DescribeStaticVerificationListResponse.DestinationTableNumber"));
		describeStaticVerificationListResponse.setDestinationCountNumber(context.integerValue("DescribeStaticVerificationListResponse.DestinationCountNumber"));
		describeStaticVerificationListResponse.setDestinationDBSize(context.integerValue("DescribeStaticVerificationListResponse.DestinationDBSize"));
		describeStaticVerificationListResponse.setConsistencyPercent(context.stringValue("DescribeStaticVerificationListResponse.ConsistencyPercent"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < context.lengthValue("DescribeStaticVerificationListResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setAbnormalType(context.stringValue("DescribeStaticVerificationListResponse.Items["+ i +"].AbnormalType"));
			itemsItem.setSourceDetail(context.stringValue("DescribeStaticVerificationListResponse.Items["+ i +"].SourceDetail"));
			itemsItem.setDestinationDetail(context.stringValue("DescribeStaticVerificationListResponse.Items["+ i +"].DestinationDetail"));

			items.add(itemsItem);
		}
		describeStaticVerificationListResponse.setItems(items);
	 
	 	return describeStaticVerificationListResponse;
	}
}