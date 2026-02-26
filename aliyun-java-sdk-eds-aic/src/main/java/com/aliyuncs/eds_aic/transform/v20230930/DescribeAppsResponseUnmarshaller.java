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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.DescribeAppsResponse;
import com.aliyuncs.eds_aic.model.v20230930.DescribeAppsResponse.AppInfoModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppsResponseUnmarshaller {

	public static DescribeAppsResponse unmarshall(DescribeAppsResponse describeAppsResponse, UnmarshallerContext _ctx) {
		
		describeAppsResponse.setRequestId(_ctx.stringValue("DescribeAppsResponse.RequestId"));
		describeAppsResponse.setTotalCount(_ctx.stringValue("DescribeAppsResponse.TotalCount"));
		describeAppsResponse.setNextToken(_ctx.stringValue("DescribeAppsResponse.NextToken"));

		List<AppInfoModel> data = new ArrayList<AppInfoModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppsResponse.Data.Length"); i++) {
			AppInfoModel appInfoModel = new AppInfoModel();
			appInfoModel.setAppName(_ctx.stringValue("DescribeAppsResponse.Data["+ i +"].AppName"));
			appInfoModel.setAppId(_ctx.integerValue("DescribeAppsResponse.Data["+ i +"].AppId"));
			appInfoModel.setAndroidAppVersion(_ctx.stringValue("DescribeAppsResponse.Data["+ i +"].AndroidAppVersion"));
			appInfoModel.setAppStatus(_ctx.integerValue("DescribeAppsResponse.Data["+ i +"].AppStatus"));
			appInfoModel.setIconUrl(_ctx.stringValue("DescribeAppsResponse.Data["+ i +"].IconUrl"));
			appInfoModel.setGmtCreate(_ctx.stringValue("DescribeAppsResponse.Data["+ i +"].GmtCreate"));
			appInfoModel.setGmtModified(_ctx.stringValue("DescribeAppsResponse.Data["+ i +"].GmtModified"));
			appInfoModel.setDescription(_ctx.stringValue("DescribeAppsResponse.Data["+ i +"].Description"));
			appInfoModel.setInstallStatus(_ctx.stringValue("DescribeAppsResponse.Data["+ i +"].InstallStatus"));
			appInfoModel.setStatus(_ctx.stringValue("DescribeAppsResponse.Data["+ i +"].Status"));
			appInfoModel.setInstallationStatus(_ctx.stringValue("DescribeAppsResponse.Data["+ i +"].InstallationStatus"));
			appInfoModel.setBizRegionId(_ctx.stringValue("DescribeAppsResponse.Data["+ i +"].BizRegionId"));
			appInfoModel.setPackageName(_ctx.stringValue("DescribeAppsResponse.Data["+ i +"].PackageName"));
			appInfoModel.setApkSize(_ctx.stringValue("DescribeAppsResponse.Data["+ i +"].ApkSize"));
			appInfoModel.setMD5(_ctx.stringValue("DescribeAppsResponse.Data["+ i +"].MD5"));
			appInfoModel.setAppType(_ctx.stringValue("DescribeAppsResponse.Data["+ i +"].AppType"));

			List<String> instanceGroupList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAppsResponse.Data["+ i +"].InstanceGroupList.Length"); j++) {
				instanceGroupList.add(_ctx.stringValue("DescribeAppsResponse.Data["+ i +"].InstanceGroupList["+ j +"]"));
			}
			appInfoModel.setInstanceGroupList(instanceGroupList);

			data.add(appInfoModel);
		}
		describeAppsResponse.setData(data);
	 
	 	return describeAppsResponse;
	}
}