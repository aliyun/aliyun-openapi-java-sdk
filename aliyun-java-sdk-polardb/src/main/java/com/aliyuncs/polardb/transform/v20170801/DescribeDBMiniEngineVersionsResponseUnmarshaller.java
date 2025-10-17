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

import com.aliyuncs.polardb.model.v20170801.DescribeDBMiniEngineVersionsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBMiniEngineVersionsResponse.DBRevisionVersionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBMiniEngineVersionsResponseUnmarshaller {

	public static DescribeDBMiniEngineVersionsResponse unmarshall(DescribeDBMiniEngineVersionsResponse describeDBMiniEngineVersionsResponse, UnmarshallerContext _ctx) {
		
		describeDBMiniEngineVersionsResponse.setRequestId(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.RequestId"));

		List<DBRevisionVersionListItem> dBRevisionVersionList = new ArrayList<DBRevisionVersionListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBMiniEngineVersionsResponse.DBRevisionVersionList.Length"); i++) {
			DBRevisionVersionListItem dBRevisionVersionListItem = new DBRevisionVersionListItem();
			dBRevisionVersionListItem.setReleaseNote(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.DBRevisionVersionList["+ i +"].ReleaseNote"));
			dBRevisionVersionListItem.setReleaseType(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.DBRevisionVersionList["+ i +"].ReleaseType"));
			dBRevisionVersionListItem.setRevisionVersionCode(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.DBRevisionVersionList["+ i +"].RevisionVersionCode"));
			dBRevisionVersionListItem.setRevisionVersionName(_ctx.stringValue("DescribeDBMiniEngineVersionsResponse.DBRevisionVersionList["+ i +"].RevisionVersionName"));

			dBRevisionVersionList.add(dBRevisionVersionListItem);
		}
		describeDBMiniEngineVersionsResponse.setDBRevisionVersionList(dBRevisionVersionList);
	 
	 	return describeDBMiniEngineVersionsResponse;
	}
}