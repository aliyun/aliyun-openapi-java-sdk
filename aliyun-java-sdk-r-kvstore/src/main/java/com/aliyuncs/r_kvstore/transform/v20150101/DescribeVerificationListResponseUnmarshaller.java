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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeVerificationListResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeVerificationListResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVerificationListResponseUnmarshaller {

	public static DescribeVerificationListResponse unmarshall(DescribeVerificationListResponse describeVerificationListResponse, UnmarshallerContext _ctx) {
		
		describeVerificationListResponse.setRequestId(_ctx.stringValue("DescribeVerificationListResponse.RequestId"));
		describeVerificationListResponse.setReplicaId(_ctx.stringValue("DescribeVerificationListResponse.ReplicaId"));
		describeVerificationListResponse.setPagNumber(_ctx.integerValue("DescribeVerificationListResponse.PagNumber"));
		describeVerificationListResponse.setPageRecordCount(_ctx.integerValue("DescribeVerificationListResponse.PageRecordCount"));
		describeVerificationListResponse.setTotalRecordCount(_ctx.integerValue("DescribeVerificationListResponse.TotalRecordCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVerificationListResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setInstanceIdA(_ctx.stringValue("DescribeVerificationListResponse.Items["+ i +"].InstanceIdA"));
			itemsItem.setInstanceIdB(_ctx.stringValue("DescribeVerificationListResponse.Items["+ i +"].InstanceIdB"));
			itemsItem.setKey(_ctx.stringValue("DescribeVerificationListResponse.Items["+ i +"].Key"));
			itemsItem.setKeyType(_ctx.stringValue("DescribeVerificationListResponse.Items["+ i +"].KeyType"));
			itemsItem.setInconsistentType(_ctx.stringValue("DescribeVerificationListResponse.Items["+ i +"].InconsistentType"));
			itemsItem.setOccurTime(_ctx.stringValue("DescribeVerificationListResponse.Items["+ i +"].OccurTime"));
			itemsItem.setSchema(_ctx.stringValue("DescribeVerificationListResponse.Items["+ i +"].Schema"));
			itemsItem.setInconsistentFields(_ctx.stringValue("DescribeVerificationListResponse.Items["+ i +"].InconsistentFields"));

			items.add(itemsItem);
		}
		describeVerificationListResponse.setItems(items);
	 
	 	return describeVerificationListResponse;
	}
}