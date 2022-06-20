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
			configInfo.setExclusiveDir(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].ExclusiveDir"));
			configInfo.setUuid(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].Uuid"));
			configInfo.setInclusiveFileType(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].InclusiveFileType"));
			configInfo.setDefenceMode(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].DefenceMode"));
			configInfo.setExclusiveFileType(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].ExclusiveFileType"));
			configInfo.setInclusiveFile(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].InclusiveFile"));
			configInfo.setMode(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].Mode"));
			configInfo.setDir(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].Dir"));
			configInfo.setExclusiveFile(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].ExclusiveFile"));
			configInfo.setId(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].Id"));
			configInfo.setLocalBackupDir(_ctx.stringValue("DescribeWebLockConfigListResponse.ConfigList["+ i +"].LocalBackupDir"));

			configList.add(configInfo);
		}
		describeWebLockConfigListResponse.setConfigList(configList);
	 
	 	return describeWebLockConfigListResponse;
	}
}