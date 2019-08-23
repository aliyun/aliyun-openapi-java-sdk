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

import com.aliyuncs.gpdb.model.v20160503.DescribeSpecificationResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeSpecificationResponse.DBInstanceClassItem;
import com.aliyuncs.gpdb.model.v20160503.DescribeSpecificationResponse.DBInstanceGroupCountItem;
import com.aliyuncs.gpdb.model.v20160503.DescribeSpecificationResponse.StorageNoticeItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSpecificationResponseUnmarshaller {

	public static DescribeSpecificationResponse unmarshall(DescribeSpecificationResponse describeSpecificationResponse, UnmarshallerContext _ctx) {
		
		describeSpecificationResponse.setRequestId(_ctx.stringValue("DescribeSpecificationResponse.RequestId"));

		List<DBInstanceClassItem> dBInstanceClass = new ArrayList<DBInstanceClassItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSpecificationResponse.DBInstanceClass.Length"); i++) {
			DBInstanceClassItem dBInstanceClassItem = new DBInstanceClassItem();
			dBInstanceClassItem.setText(_ctx.stringValue("DescribeSpecificationResponse.DBInstanceClass["+ i +"].Text"));
			dBInstanceClassItem.setValue(_ctx.stringValue("DescribeSpecificationResponse.DBInstanceClass["+ i +"].Value"));

			dBInstanceClass.add(dBInstanceClassItem);
		}
		describeSpecificationResponse.setDBInstanceClass(dBInstanceClass);

		List<DBInstanceGroupCountItem> dBInstanceGroupCount = new ArrayList<DBInstanceGroupCountItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSpecificationResponse.DBInstanceGroupCount.Length"); i++) {
			DBInstanceGroupCountItem dBInstanceGroupCountItem = new DBInstanceGroupCountItem();
			dBInstanceGroupCountItem.setText(_ctx.stringValue("DescribeSpecificationResponse.DBInstanceGroupCount["+ i +"].Text"));
			dBInstanceGroupCountItem.setValue(_ctx.stringValue("DescribeSpecificationResponse.DBInstanceGroupCount["+ i +"].Value"));

			dBInstanceGroupCount.add(dBInstanceGroupCountItem);
		}
		describeSpecificationResponse.setDBInstanceGroupCount(dBInstanceGroupCount);

		List<StorageNoticeItem> storageNotice = new ArrayList<StorageNoticeItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSpecificationResponse.StorageNotice.Length"); i++) {
			StorageNoticeItem storageNoticeItem = new StorageNoticeItem();
			storageNoticeItem.setText(_ctx.stringValue("DescribeSpecificationResponse.StorageNotice["+ i +"].Text"));
			storageNoticeItem.setValue(_ctx.stringValue("DescribeSpecificationResponse.StorageNotice["+ i +"].Value"));

			storageNotice.add(storageNoticeItem);
		}
		describeSpecificationResponse.setStorageNotice(storageNotice);
	 
	 	return describeSpecificationResponse;
	}
}