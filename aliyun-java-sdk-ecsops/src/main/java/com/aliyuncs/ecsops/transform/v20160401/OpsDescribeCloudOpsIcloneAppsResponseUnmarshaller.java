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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsIcloneAppsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsIcloneAppsResponse.IcloneAppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCloudOpsIcloneAppsResponseUnmarshaller {

	public static OpsDescribeCloudOpsIcloneAppsResponse unmarshall(OpsDescribeCloudOpsIcloneAppsResponse opsDescribeCloudOpsIcloneAppsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCloudOpsIcloneAppsResponse.setRequestId(_ctx.stringValue("OpsDescribeCloudOpsIcloneAppsResponse.RequestId"));
		opsDescribeCloudOpsIcloneAppsResponse.setTotalCount(_ctx.integerValue("OpsDescribeCloudOpsIcloneAppsResponse.TotalCount"));
		opsDescribeCloudOpsIcloneAppsResponse.setPageSize(_ctx.integerValue("OpsDescribeCloudOpsIcloneAppsResponse.PageSize"));
		opsDescribeCloudOpsIcloneAppsResponse.setBizMessage(_ctx.stringValue("OpsDescribeCloudOpsIcloneAppsResponse.BizMessage"));
		opsDescribeCloudOpsIcloneAppsResponse.setPage(_ctx.integerValue("OpsDescribeCloudOpsIcloneAppsResponse.Page"));
		opsDescribeCloudOpsIcloneAppsResponse.setCount(_ctx.integerValue("OpsDescribeCloudOpsIcloneAppsResponse.Count"));
		opsDescribeCloudOpsIcloneAppsResponse.setBizCode(_ctx.stringValue("OpsDescribeCloudOpsIcloneAppsResponse.BizCode"));

		List<IcloneAppInfo> data = new ArrayList<IcloneAppInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCloudOpsIcloneAppsResponse.Data.Length"); i++) {
			IcloneAppInfo icloneAppInfo = new IcloneAppInfo();
			icloneAppInfo.setAppName(_ctx.stringValue("OpsDescribeCloudOpsIcloneAppsResponse.Data["+ i +"].AppName"));
			icloneAppInfo.setSn(_ctx.stringValue("OpsDescribeCloudOpsIcloneAppsResponse.Data["+ i +"].Sn"));
			icloneAppInfo.setIp(_ctx.stringValue("OpsDescribeCloudOpsIcloneAppsResponse.Data["+ i +"].Ip"));
			icloneAppInfo.setOs(_ctx.stringValue("OpsDescribeCloudOpsIcloneAppsResponse.Data["+ i +"].Os"));
			icloneAppInfo.setOsProfile(_ctx.stringValue("OpsDescribeCloudOpsIcloneAppsResponse.Data["+ i +"].OsProfile"));

			data.add(icloneAppInfo);
		}
		opsDescribeCloudOpsIcloneAppsResponse.setData(data);
	 
	 	return opsDescribeCloudOpsIcloneAppsResponse;
	}
}