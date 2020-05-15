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

import com.aliyuncs.rds.model.v20140815.DescribeDBProxyResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBProxyResponse.DBProxyConnectStringItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBProxyResponseUnmarshaller {

	public static DescribeDBProxyResponse unmarshall(DescribeDBProxyResponse describeDBProxyResponse, UnmarshallerContext _ctx) {
		
		describeDBProxyResponse.setRequestId(_ctx.stringValue("DescribeDBProxyResponse.RequestId"));
		describeDBProxyResponse.setDBProxyServiceStatus(_ctx.stringValue("DescribeDBProxyResponse.DBProxyServiceStatus"));
		describeDBProxyResponse.setDBProxyInstanceType(_ctx.stringValue("DescribeDBProxyResponse.DBProxyInstanceType"));
		describeDBProxyResponse.setDBProxyInstanceNum(_ctx.integerValue("DescribeDBProxyResponse.DBProxyInstanceNum"));
		describeDBProxyResponse.setDBProxyInstanceStatus(_ctx.stringValue("DescribeDBProxyResponse.DBProxyInstanceStatus"));
		describeDBProxyResponse.setDBProxyInstanceCurrentMinorVersion(_ctx.stringValue("DescribeDBProxyResponse.DBProxyInstanceCurrentMinorVersion"));
		describeDBProxyResponse.setDBProxyInstanceLatestMinorVersion(_ctx.stringValue("DescribeDBProxyResponse.DBProxyInstanceLatestMinorVersion"));
		describeDBProxyResponse.setDBProxyInstanceName(_ctx.stringValue("DescribeDBProxyResponse.DBProxyInstanceName"));

		List<DBProxyConnectStringItemsItem> dBProxyConnectStringItems = new ArrayList<DBProxyConnectStringItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBProxyResponse.DBProxyConnectStringItems.Length"); i++) {
			DBProxyConnectStringItemsItem dBProxyConnectStringItemsItem = new DBProxyConnectStringItemsItem();
			dBProxyConnectStringItemsItem.setDBProxyEndpointId(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyEndpointId"));
			dBProxyConnectStringItemsItem.setDBProxyConnectString(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyConnectString"));
			dBProxyConnectStringItemsItem.setDBProxyConnectStringPort(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyConnectStringPort"));
			dBProxyConnectStringItemsItem.setDBProxyConnectStringNetType(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyConnectStringNetType"));
			dBProxyConnectStringItemsItem.setDBProxyVpcInstanceId(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyVpcInstanceId"));
			dBProxyConnectStringItemsItem.setDBProxyEndpointName(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyEndpointName"));
			dBProxyConnectStringItemsItem.setDBProxyConnectStringNetWorkType(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyConnectStringNetWorkType"));

			dBProxyConnectStringItems.add(dBProxyConnectStringItemsItem);
		}
		describeDBProxyResponse.setDBProxyConnectStringItems(dBProxyConnectStringItems);
	 
	 	return describeDBProxyResponse;
	}
}