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

import com.aliyuncs.rds.model.v20140815.DescribeDBMiniEngineVersionsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBMiniEngineVersionsResponse.MinorVersionItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBMiniEngineVersionsResponseUnmarshaller {

	public static DescribeDBMiniEngineVersionsResponse unmarshall(DescribeDBMiniEngineVersionsResponse describeDBMiniEngineVersionsResponse, UnmarshallerContext _ctx) {
		
		describeDBMiniEngineVersionsResponse.setRequestId(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.RequestId"));
		describeDBMiniEngineVersionsResponse.setDBInstanceId(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.DBInstanceId"));
		describeDBMiniEngineVersionsResponse.setTotalCount(_ctx.integerValue("DescribeDBMiniEngineVersionsResponse.TotalCount"));
		describeDBMiniEngineVersionsResponse.setPageNumbers(_ctx.integerValue("DescribeDBMiniEngineVersionsResponse.PageNumbers"));
		describeDBMiniEngineVersionsResponse.setMaxRecordsPerPage(_ctx.integerValue("DescribeDBMiniEngineVersionsResponse.MaxRecordsPerPage"));

		List<MinorVersionItemsItem> minorVersionItems = new ArrayList<MinorVersionItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBMiniEngineVersionsResponse.MinorVersionItems.Length"); i++) {
			MinorVersionItemsItem minorVersionItemsItem = new MinorVersionItemsItem();
			minorVersionItemsItem.setReleaseNote(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.MinorVersionItems["+ i +"].ReleaseNote"));
			minorVersionItemsItem.setNodeType(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.MinorVersionItems["+ i +"].NodeType"));
			minorVersionItemsItem.setIsHotfixVersion(_ctx.booleanValue("DescribeDBMiniEngineVersionsResponse.MinorVersionItems["+ i +"].IsHotfixVersion"));
			minorVersionItemsItem.setEngine(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.MinorVersionItems["+ i +"].Engine"));
			minorVersionItemsItem.setReleaseType(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.MinorVersionItems["+ i +"].ReleaseType"));
			minorVersionItemsItem.setStatusDesc(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.MinorVersionItems["+ i +"].StatusDesc"));
			minorVersionItemsItem.setEngineVersion(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.MinorVersionItems["+ i +"].EngineVersion"));
			minorVersionItemsItem.setMinorVersion(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.MinorVersionItems["+ i +"].MinorVersion"));
			minorVersionItemsItem.setCommunityMinorVersion(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.MinorVersionItems["+ i +"].CommunityMinorVersion"));
			minorVersionItemsItem.setTag(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.MinorVersionItems["+ i +"].Tag"));

			minorVersionItems.add(minorVersionItemsItem);
		}
		describeDBMiniEngineVersionsResponse.setMinorVersionItems(minorVersionItems);
	 
	 	return describeDBMiniEngineVersionsResponse;
	}
}