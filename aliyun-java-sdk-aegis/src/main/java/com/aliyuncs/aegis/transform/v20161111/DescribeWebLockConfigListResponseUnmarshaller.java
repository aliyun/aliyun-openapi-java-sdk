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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeWebLockConfigListResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeWebLockConfigListResponse.ConfigInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebLockConfigListResponseUnmarshaller {

	public static DescribeWebLockConfigListResponse unmarshall(DescribeWebLockConfigListResponse describeWebLockConfigListResponse, UnmarshallerContext context) {
		
		describeWebLockConfigListResponse.setRequestId(context.stringValue("DescribeWebLockConfigListResponse.RequestId"));
		describeWebLockConfigListResponse.setTotalCount(context.integerValue("DescribeWebLockConfigListResponse.TotalCount"));

		List<ConfigInfo> configList = new ArrayList<ConfigInfo>();
		for (int i = 0; i < context.lengthValue("DescribeWebLockConfigListResponse.ConfigList.Length"); i++) {
			ConfigInfo configInfo = new ConfigInfo();
			configInfo.setId(context.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].Id"));
			configInfo.setUuid(context.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].Uuid"));
			configInfo.setDir(context.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].Dir"));
			configInfo.setExclusiveDir(context.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].ExclusiveDir"));
			configInfo.setExclusiveFileType(context.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].ExclusiveFileType"));
			configInfo.setLocalBackupDir(context.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].LocalBackupDir"));

			configList.add(configInfo);
		}
		describeWebLockConfigListResponse.setConfigList(configList);
	 
	 	return describeWebLockConfigListResponse;
	}
}