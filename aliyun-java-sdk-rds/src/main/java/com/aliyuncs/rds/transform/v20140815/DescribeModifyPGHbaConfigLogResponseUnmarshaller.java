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

import com.aliyuncs.rds.model.v20140815.DescribeModifyPGHbaConfigLogResponse;
import com.aliyuncs.rds.model.v20140815.DescribeModifyPGHbaConfigLogResponse.HbaLogItem;
import com.aliyuncs.rds.model.v20140815.DescribeModifyPGHbaConfigLogResponse.HbaLogItem.HbaItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeModifyPGHbaConfigLogResponseUnmarshaller {

	public static DescribeModifyPGHbaConfigLogResponse unmarshall(DescribeModifyPGHbaConfigLogResponse describeModifyPGHbaConfigLogResponse, UnmarshallerContext _ctx) {
		
		describeModifyPGHbaConfigLogResponse.setRequestId(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.RequestId"));
		describeModifyPGHbaConfigLogResponse.setDBInstanceId(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.DBInstanceId"));
		describeModifyPGHbaConfigLogResponse.setLogItemCount(_ctx.integerValue("DescribeModifyPGHbaConfigLogResponse.LogItemCount"));

		List<HbaLogItem> hbaLogItems = new ArrayList<HbaLogItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems.Length"); i++) {
			HbaLogItem hbaLogItem = new HbaLogItem();
			hbaLogItem.setModifyStatus(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].ModifyStatus"));
			hbaLogItem.setModifyTime(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].ModifyTime"));
			hbaLogItem.setStatusReason(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].StatusReason"));

			List<HbaItem> afterHbaItems = new ArrayList<HbaItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].AfterHbaItems.Length"); j++) {
				HbaItem hbaItem = new HbaItem();
				hbaItem.setAddress(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].AfterHbaItems["+ j +"].Address"));
				hbaItem.setDatabase(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].AfterHbaItems["+ j +"].Database"));
				hbaItem.setMask(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].AfterHbaItems["+ j +"].Mask"));
				hbaItem.setBizMethod(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].AfterHbaItems["+ j +"].Method"));
				hbaItem.setOption(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].AfterHbaItems["+ j +"].Option"));
				hbaItem.setPriorityId(_ctx.integerValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].AfterHbaItems["+ j +"].PriorityId"));
				hbaItem.setType(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].AfterHbaItems["+ j +"].Type"));
				hbaItem.setUser(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].AfterHbaItems["+ j +"].User"));

				afterHbaItems.add(hbaItem);
			}
			hbaLogItem.setAfterHbaItems(afterHbaItems);

			List<HbaItem> beforeHbaItems = new ArrayList<HbaItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].BeforeHbaItems.Length"); j++) {
				HbaItem hbaItem1 = new HbaItem();
				hbaItem1.setAddress(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].BeforeHbaItems["+ j +"].Address"));
				hbaItem1.setDatabase(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].BeforeHbaItems["+ j +"].Database"));
				hbaItem1.setMask(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].BeforeHbaItems["+ j +"].Mask"));
				hbaItem1.setBizMethod(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].BeforeHbaItems["+ j +"].Method"));
				hbaItem1.setOption(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].BeforeHbaItems["+ j +"].Option"));
				hbaItem1.setPriorityId(_ctx.integerValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].BeforeHbaItems["+ j +"].PriorityId"));
				hbaItem1.setType(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].BeforeHbaItems["+ j +"].Type"));
				hbaItem1.setUser(_ctx.stringValue("DescribeModifyPGHbaConfigLogResponse.HbaLogItems["+ i +"].BeforeHbaItems["+ j +"].User"));

				beforeHbaItems.add(hbaItem1);
			}
			hbaLogItem.setBeforeHbaItems(beforeHbaItems);

			hbaLogItems.add(hbaLogItem);
		}
		describeModifyPGHbaConfigLogResponse.setHbaLogItems(hbaLogItems);
	 
	 	return describeModifyPGHbaConfigLogResponse;
	}
}