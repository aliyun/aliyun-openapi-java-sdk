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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStaticVerificationListResponseUnmarshaller {

	public static DescribeStaticVerificationListResponse unmarshall(DescribeStaticVerificationListResponse describeStaticVerificationListResponse, UnmarshallerContext _ctx) {
		
		describeStaticVerificationListResponse.setRequestId(_ctx.stringValue("DescribeStaticVerificationListResponse.RequestId"));
		describeStaticVerificationListResponse.setReplicaId(_ctx.stringValue("DescribeStaticVerificationListResponse.ReplicaId"));
		describeStaticVerificationListResponse.setSourceInstanceId(_ctx.stringValue("DescribeStaticVerificationListResponse.SourceInstanceId"));
		describeStaticVerificationListResponse.setSourceDBNumber(_ctx.integerValue("DescribeStaticVerificationListResponse.SourceDBNumber"));
		describeStaticVerificationListResponse.setSourceTableNumber(_ctx.integerValue("DescribeStaticVerificationListResponse.SourceTableNumber"));
		describeStaticVerificationListResponse.setSourceCountNumber(_ctx.integerValue("DescribeStaticVerificationListResponse.SourceCountNumber"));
		describeStaticVerificationListResponse.setSourceDBSize(_ctx.integerValue("DescribeStaticVerificationListResponse.SourceDBSize"));
		describeStaticVerificationListResponse.setDestinationInstanceId(_ctx.stringValue("DescribeStaticVerificationListResponse.DestinationInstanceId"));
		describeStaticVerificationListResponse.setDestinationDBNumber(_ctx.integerValue("DescribeStaticVerificationListResponse.DestinationDBNumber"));
		describeStaticVerificationListResponse.setDestinationTableNumber(_ctx.integerValue("DescribeStaticVerificationListResponse.DestinationTableNumber"));
		describeStaticVerificationListResponse.setDestinationCountNumber(_ctx.integerValue("DescribeStaticVerificationListResponse.DestinationCountNumber"));
		describeStaticVerificationListResponse.setDestinationDBSize(_ctx.integerValue("DescribeStaticVerificationListResponse.DestinationDBSize"));
		describeStaticVerificationListResponse.setConsistencyPercent(_ctx.stringValue("DescribeStaticVerificationListResponse.ConsistencyPercent"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStaticVerificationListResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setAbnormalType(_ctx.stringValue("DescribeStaticVerificationListResponse.Items["+ i +"].AbnormalType"));
			itemsItem.setSourceDetail(_ctx.stringValue("DescribeStaticVerificationListResponse.Items["+ i +"].SourceDetail"));
			itemsItem.setDestinationDetail(_ctx.stringValue("DescribeStaticVerificationListResponse.Items["+ i +"].DestinationDetail"));

			items.add(itemsItem);
		}
		describeStaticVerificationListResponse.setItems(items);
	 
	 	return describeStaticVerificationListResponse;
	}
}