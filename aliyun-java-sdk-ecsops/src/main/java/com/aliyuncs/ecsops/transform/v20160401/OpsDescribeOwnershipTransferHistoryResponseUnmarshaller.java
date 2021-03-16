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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeOwnershipTransferHistoryResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeOwnershipTransferHistoryResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeOwnershipTransferHistoryResponseUnmarshaller {

	public static OpsDescribeOwnershipTransferHistoryResponse unmarshall(OpsDescribeOwnershipTransferHistoryResponse opsDescribeOwnershipTransferHistoryResponse, UnmarshallerContext _ctx) {
		
		opsDescribeOwnershipTransferHistoryResponse.setRequestId(_ctx.stringValue("OpsDescribeOwnershipTransferHistoryResponse.RequestId"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeOwnershipTransferHistoryResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setInstanceId(_ctx.stringValue("OpsDescribeOwnershipTransferHistoryResponse.Items["+ i +"].InstanceId"));
			item.setSourceUserId(_ctx.stringValue("OpsDescribeOwnershipTransferHistoryResponse.Items["+ i +"].SourceUserId"));
			item.setTargetUserId(_ctx.stringValue("OpsDescribeOwnershipTransferHistoryResponse.Items["+ i +"].TargetUserId"));
			item.setStatus(_ctx.stringValue("OpsDescribeOwnershipTransferHistoryResponse.Items["+ i +"].Status"));
			item.setCreationTime(_ctx.stringValue("OpsDescribeOwnershipTransferHistoryResponse.Items["+ i +"].CreationTime"));
			item.setFinishedTime(_ctx.stringValue("OpsDescribeOwnershipTransferHistoryResponse.Items["+ i +"].FinishedTime"));

			items.add(item);
		}
		opsDescribeOwnershipTransferHistoryResponse.setItems(items);
	 
	 	return opsDescribeOwnershipTransferHistoryResponse;
	}
}