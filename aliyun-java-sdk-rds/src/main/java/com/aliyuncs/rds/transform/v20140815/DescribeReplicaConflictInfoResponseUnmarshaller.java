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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeReplicaConflictInfoResponse;
import com.aliyuncs.rds.model.v20140815.DescribeReplicaConflictInfoResponse.ItemsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReplicaConflictInfoResponseUnmarshaller {

	public static DescribeReplicaConflictInfoResponse unmarshall(DescribeReplicaConflictInfoResponse describeReplicaConflictInfoResponse, UnmarshallerContext context) {
		
		describeReplicaConflictInfoResponse.setRequestId(context.stringValue("DescribeReplicaConflictInfoResponse.RequestId"));
		describeReplicaConflictInfoResponse.setReplicaId(context.stringValue("DescribeReplicaConflictInfoResponse.ReplicaId"));
		describeReplicaConflictInfoResponse.setPagNumber(context.integerValue("DescribeReplicaConflictInfoResponse.PagNumber"));
		describeReplicaConflictInfoResponse.setPageRecordCount(context.integerValue("DescribeReplicaConflictInfoResponse.PageRecordCount"));
		describeReplicaConflictInfoResponse.setTotalRecordCount(context.integerValue("DescribeReplicaConflictInfoResponse.TotalRecordCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < context.lengthValue("DescribeReplicaConflictInfoResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setSourceInstanceId(context.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].SourceInstanceId"));
			itemsItem.setDestinationInstanceId(context.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].DestinationInstanceId"));
			itemsItem.setOccurTime(context.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].OccurTime"));
			itemsItem.setDetailInfo(context.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].DetailInfo"));
			itemsItem.setConfictKey(context.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].ConfictKey"));
			itemsItem.setConfictReason(context.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].ConfictReason"));
			itemsItem.setDatabaseName(context.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].DatabaseName"));
			itemsItem.setRecoveryMode(context.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].RecoveryMode"));
			itemsItem.setConflictGtid(context.stringValue("DescribeReplicaConflictInfoResponse.Items["+ i +"].ConflictGtid"));

			items.add(itemsItem);
		}
		describeReplicaConflictInfoResponse.setItems(items);
	 
	 	return describeReplicaConflictInfoResponse;
	}
}