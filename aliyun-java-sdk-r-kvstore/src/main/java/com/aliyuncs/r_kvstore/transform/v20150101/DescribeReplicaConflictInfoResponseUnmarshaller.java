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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeReplicaConflictInfoResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeReplicaConflictInfoResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReplicaConflictInfoResponseUnmarshaller {

	public static DescribeReplicaConflictInfoResponse unmarshall(DescribeReplicaConflictInfoResponse describeReplicaConflictInfoResponse, UnmarshallerContext _ctx) {
		
		describeReplicaConflictInfoResponse.setRequestId(_ctx.stringValue("DescribeReplicaConflictInfoResponse.RequestId"));
		describeReplicaConflictInfoResponse.setReplicaId(_ctx.stringValue("DescribeReplicaConflictInfoResponse.ReplicaId"));
		describeReplicaConflictInfoResponse.setPagNumber(_ctx.integerValue("DescribeReplicaConflictInfoResponse.PagNumber"));
		describeReplicaConflictInfoResponse.setPageRecordCount(_ctx.integerValue("DescribeReplicaConflictInfoResponse.PageRecordCount"));
		describeReplicaConflictInfoResponse.setTotalRecordCount(_ctx.integerValue("DescribeReplicaConflictInfoResponse.TotalRecordCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReplicaConflictInfoResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setSourceInstanceId(_ctx.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].SourceInstanceId"));
			itemsItem.setDestinationInstanceId(_ctx.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].DestinationInstanceId"));
			itemsItem.setOccurTime(_ctx.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].OccurTime"));
			itemsItem.setDetailInfo(_ctx.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].DetailInfo"));
			itemsItem.setConfictKey(_ctx.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].ConfictKey"));
			itemsItem.setConfictReason(_ctx.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].ConfictReason"));
			itemsItem.setDatabaseName(_ctx.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].DatabaseName"));
			itemsItem.setRecoveryMode(_ctx.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].RecoveryMode"));
			itemsItem.setConflictGtid(_ctx.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].ConflictGtid"));

			items.add(itemsItem);
		}
		describeReplicaConflictInfoResponse.setItems(items);
	 
	 	return describeReplicaConflictInfoResponse;
	}
}