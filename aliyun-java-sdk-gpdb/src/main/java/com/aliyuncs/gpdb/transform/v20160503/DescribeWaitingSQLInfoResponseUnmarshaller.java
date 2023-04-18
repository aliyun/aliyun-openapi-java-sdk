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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeWaitingSQLInfoResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeWaitingSQLInfoResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWaitingSQLInfoResponseUnmarshaller {

	public static DescribeWaitingSQLInfoResponse unmarshall(DescribeWaitingSQLInfoResponse describeWaitingSQLInfoResponse, UnmarshallerContext _ctx) {
		
		describeWaitingSQLInfoResponse.setRequestId(_ctx.stringValue("DescribeWaitingSQLInfoResponse.RequestId"));
		describeWaitingSQLInfoResponse.setDatabase(_ctx.stringValue("DescribeWaitingSQLInfoResponse.Database"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWaitingSQLInfoResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setPID(_ctx.stringValue("DescribeWaitingSQLInfoResponse.Items["+ i +"].PID"));
			item.setUser(_ctx.stringValue("DescribeWaitingSQLInfoResponse.Items["+ i +"].User"));
			item.setSQLStmt(_ctx.stringValue("DescribeWaitingSQLInfoResponse.Items["+ i +"].SQLStmt"));
			item.setApplication(_ctx.stringValue("DescribeWaitingSQLInfoResponse.Items["+ i +"].Application"));
			item.setNotGrantLocks(_ctx.stringValue("DescribeWaitingSQLInfoResponse.Items["+ i +"].NotGrantLocks"));
			item.setBlockedByPID(_ctx.stringValue("DescribeWaitingSQLInfoResponse.Items["+ i +"].BlockedByPID"));
			item.setBlockedByUser(_ctx.stringValue("DescribeWaitingSQLInfoResponse.Items["+ i +"].BlockedByUser"));
			item.setBlockedBySQLStmt(_ctx.stringValue("DescribeWaitingSQLInfoResponse.Items["+ i +"].BlockedBySQLStmt"));
			item.setBlockedByApplication(_ctx.stringValue("DescribeWaitingSQLInfoResponse.Items["+ i +"].BlockedByApplication"));
			item.setGrantLocks(_ctx.stringValue("DescribeWaitingSQLInfoResponse.Items["+ i +"].GrantLocks"));

			items.add(item);
		}
		describeWaitingSQLInfoResponse.setItems(items);
	 
	 	return describeWaitingSQLInfoResponse;
	}
}