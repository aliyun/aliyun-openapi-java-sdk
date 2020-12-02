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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeDBLinksResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBLinksResponse.DBLinkInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBLinksResponseUnmarshaller {

	public static DescribeDBLinksResponse unmarshall(DescribeDBLinksResponse describeDBLinksResponse, UnmarshallerContext _ctx) {
		
		describeDBLinksResponse.setRequestId(_ctx.stringValue("DescribeDBLinksResponse.RequestId"));
		describeDBLinksResponse.setDBInstanceName(_ctx.stringValue("DescribeDBLinksResponse.DBInstanceName"));

		List<DBLinkInfosItem> dBLinkInfos = new ArrayList<DBLinkInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBLinksResponse.DBLinkInfos.Length"); i++) {
			DBLinkInfosItem dBLinkInfosItem = new DBLinkInfosItem();
			dBLinkInfosItem.setTargetDBInstanceName(_ctx.stringValue("DescribeDBLinksResponse.DBLinkInfos["+ i +"].TargetDBInstanceName"));
			dBLinkInfosItem.setDBInstanceName(_ctx.stringValue("DescribeDBLinksResponse.DBLinkInfos["+ i +"].DBInstanceName"));
			dBLinkInfosItem.setTargetDBName(_ctx.stringValue("DescribeDBLinksResponse.DBLinkInfos["+ i +"].TargetDBName"));
			dBLinkInfosItem.setTargetAccount(_ctx.stringValue("DescribeDBLinksResponse.DBLinkInfos["+ i +"].TargetAccount"));
			dBLinkInfosItem.setDBLinkName(_ctx.stringValue("DescribeDBLinksResponse.DBLinkInfos["+ i +"].DBLinkName"));
			dBLinkInfosItem.setSourceDBName(_ctx.stringValue("DescribeDBLinksResponse.DBLinkInfos["+ i +"].SourceDBName"));

			dBLinkInfos.add(dBLinkInfosItem);
		}
		describeDBLinksResponse.setDBLinkInfos(dBLinkInfos);
	 
	 	return describeDBLinksResponse;
	}
}