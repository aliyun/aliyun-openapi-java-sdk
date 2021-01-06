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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeWebLockConfigListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeWebLockConfigListResponse.ConfigInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebLockConfigListResponseUnmarshaller {

	public static DescribeWebLockConfigListResponse unmarshall(DescribeWebLockConfigListResponse describeWebLockConfigListResponse, UnmarshallerContext _ctx) {
		
		describeWebLockConfigListResponse.setRequestId(_ctx.stringValue("DescribeWebLockConfigListResponse.RequestId"));
		describeWebLockConfigListResponse.setTotalCount(_ctx.integerValue("DescribeWebLockConfigListResponse.TotalCount"));

		List<ConfigInfo> configList = new ArrayList<ConfigInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebLockConfigListResponse.ConfigList.Length"); i++) {
			ConfigInfo configInfo = new ConfigInfo();
			configInfo.setId(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].Id"));
			configInfo.setUuid(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].Uuid"));
			configInfo.setDir(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].Dir"));
			configInfo.setExclusiveDir(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].ExclusiveDir"));
			configInfo.setExclusiveFileType(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].ExclusiveFileType"));
			configInfo.setLocalBackupDir(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].LocalBackupDir"));
			configInfo.setMode(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].Mode"));
			configInfo.setInclusiveFileType(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].InclusiveFileType"));
			configInfo.setExclusiveFile(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].ExclusiveFile"));
			configInfo.setInclusiveFile(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].InclusiveFile"));
			configInfo.setDefenceMode(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].DefenceMode"));

			configList.add(configInfo);
		}
		describeWebLockConfigListResponse.setConfigList(configList);
	 
	 	return describeWebLockConfigListResponse;
	}
}