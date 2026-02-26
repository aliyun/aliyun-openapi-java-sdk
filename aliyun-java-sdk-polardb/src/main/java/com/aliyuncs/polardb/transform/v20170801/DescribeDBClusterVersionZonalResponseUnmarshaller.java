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

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterVersionZonalResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterVersionZonalResponse.DBRevisionVersionListItem;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterVersionZonalResponse.ProxyRevisionVersionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterVersionZonalResponseUnmarshaller {

	public static DescribeDBClusterVersionZonalResponse unmarshall(DescribeDBClusterVersionZonalResponse describeDBClusterVersionZonalResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterVersionZonalResponse.setRequestId(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.RequestId"));
		describeDBClusterVersionZonalResponse.setIsLatestVersion(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.IsLatestVersion"));
		describeDBClusterVersionZonalResponse.setIsProxyLatestVersion(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.IsProxyLatestVersion"));
		describeDBClusterVersionZonalResponse.setDBVersion(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.DBVersion"));
		describeDBClusterVersionZonalResponse.setDBRevisionVersion(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.DBRevisionVersion"));
		describeDBClusterVersionZonalResponse.setDBVersionStatus(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.DBVersionStatus"));
		describeDBClusterVersionZonalResponse.setDBClusterId(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.DBClusterId"));
		describeDBClusterVersionZonalResponse.setDBMinorVersion(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.DBMinorVersion"));
		describeDBClusterVersionZonalResponse.setProxyRevisionVersion(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.ProxyRevisionVersion"));
		describeDBClusterVersionZonalResponse.setProxyVersionStatus(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.ProxyVersionStatus"));
		describeDBClusterVersionZonalResponse.setProxyLatestVersion(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.ProxyLatestVersion"));
		describeDBClusterVersionZonalResponse.setDBLatestVersion(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.DBLatestVersion"));
		describeDBClusterVersionZonalResponse.setProxyLatestVersionAfterDBEngineUpgraded(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.ProxyLatestVersionAfterDBEngineUpgraded"));
		describeDBClusterVersionZonalResponse.setDBInnerRevisionVersion(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.DBInnerRevisionVersion"));

		List<DBRevisionVersionListItem> dBRevisionVersionList = new ArrayList<DBRevisionVersionListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterVersionZonalResponse.DBRevisionVersionList.Length"); i++) {
			DBRevisionVersionListItem dBRevisionVersionListItem = new DBRevisionVersionListItem();
			dBRevisionVersionListItem.setReleaseType(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.DBRevisionVersionList["+ i +"].ReleaseType"));
			dBRevisionVersionListItem.setRevisionVersionCode(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.DBRevisionVersionList["+ i +"].RevisionVersionCode"));
			dBRevisionVersionListItem.setRevisionVersionName(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.DBRevisionVersionList["+ i +"].RevisionVersionName"));
			dBRevisionVersionListItem.setReleaseNote(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.DBRevisionVersionList["+ i +"].ReleaseNote"));

			dBRevisionVersionList.add(dBRevisionVersionListItem);
		}
		describeDBClusterVersionZonalResponse.setDBRevisionVersionList(dBRevisionVersionList);

		List<ProxyRevisionVersionListItem> proxyRevisionVersionList = new ArrayList<ProxyRevisionVersionListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterVersionZonalResponse.ProxyRevisionVersionList.Length"); i++) {
			ProxyRevisionVersionListItem proxyRevisionVersionListItem = new ProxyRevisionVersionListItem();
			proxyRevisionVersionListItem.setReleaseType(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.ProxyRevisionVersionList["+ i +"].ReleaseType"));
			proxyRevisionVersionListItem.setRevisionVersionCode(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.ProxyRevisionVersionList["+ i +"].RevisionVersionCode"));
			proxyRevisionVersionListItem.setRevisionVersionName(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.ProxyRevisionVersionList["+ i +"].RevisionVersionName"));
			proxyRevisionVersionListItem.setReleaseNote(_ctx.stringValue("DescribeDBClusterVersionZonalResponse.ProxyRevisionVersionList["+ i +"].ReleaseNote"));

			proxyRevisionVersionList.add(proxyRevisionVersionListItem);
		}
		describeDBClusterVersionZonalResponse.setProxyRevisionVersionList(proxyRevisionVersionList);
	 
	 	return describeDBClusterVersionZonalResponse;
	}
}