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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeReplicaInitializeProgressResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeReplicaInitializeProgressResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReplicaInitializeProgressResponseUnmarshaller {

	public static DescribeReplicaInitializeProgressResponse unmarshall(DescribeReplicaInitializeProgressResponse describeReplicaInitializeProgressResponse, UnmarshallerContext _ctx) {
		
		describeReplicaInitializeProgressResponse.setRequestId(_ctx.stringValue("DescribeReplicaInitializeProgressResponse.RequestId"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReplicaInitializeProgressResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setReplicaId(_ctx.stringValue("DescribeReplicaInitializeProgressResponse.Items["+ i +"].ReplicaId"));
			itemsItem.setStatus(_ctx.stringValue("DescribeReplicaInitializeProgressResponse.Items["+ i +"].Status"));
			itemsItem.setProgress(_ctx.stringValue("DescribeReplicaInitializeProgressResponse.Items["+ i +"].Progress"));
			itemsItem.setFinishTime(_ctx.stringValue("DescribeReplicaInitializeProgressResponse.Items["+ i +"].FinishTime"));
			itemsItem.setCurrentStep(_ctx.stringValue("DescribeReplicaInitializeProgressResponse.Items["+ i +"].CurrentStep"));

			items.add(itemsItem);
		}
		describeReplicaInitializeProgressResponse.setItems(items);
	 
	 	return describeReplicaInitializeProgressResponse;
	}
}