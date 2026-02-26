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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeEngineVersionResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeEngineVersionResponse.DBLatestMinorVersion;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeEngineVersionResponse.DBLatestMinorVersion.VersionRelease;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeEngineVersionResponse.DBLatestMinorVersion.VersionRelease.ReleaseInfoList;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeEngineVersionResponse.ProxyLatestMinorVersion;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeEngineVersionResponse.ProxyLatestMinorVersion.VersionRelease1;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeEngineVersionResponse.ProxyLatestMinorVersion.VersionRelease1.ReleaseInfoList3;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEngineVersionResponseUnmarshaller {

	public static DescribeEngineVersionResponse unmarshall(DescribeEngineVersionResponse describeEngineVersionResponse, UnmarshallerContext _ctx) {
		
		describeEngineVersionResponse.setRequestId(_ctx.stringValue("DescribeEngineVersionResponse.RequestId"));
		describeEngineVersionResponse.setIsLatestVersion(_ctx.booleanValue("DescribeEngineVersionResponse.IsLatestVersion"));
		describeEngineVersionResponse.setProxyMinorVersion(_ctx.stringValue("DescribeEngineVersionResponse.ProxyMinorVersion"));
		describeEngineVersionResponse.setDBVersionRelease(_ctx.stringValue("DescribeEngineVersionResponse.DBVersionRelease"));
		describeEngineVersionResponse.setProxyVersionRelease(_ctx.stringValue("DescribeEngineVersionResponse.ProxyVersionRelease"));
		describeEngineVersionResponse.setEnableUpgradeMajorVersion(_ctx.booleanValue("DescribeEngineVersionResponse.EnableUpgradeMajorVersion"));
		describeEngineVersionResponse.setEnableUpgradeMinorVersion(_ctx.booleanValue("DescribeEngineVersionResponse.EnableUpgradeMinorVersion"));
		describeEngineVersionResponse.setMajorVersion(_ctx.stringValue("DescribeEngineVersionResponse.MajorVersion"));
		describeEngineVersionResponse.setEngine(_ctx.stringValue("DescribeEngineVersionResponse.Engine"));
		describeEngineVersionResponse.setMinorVersion(_ctx.stringValue("DescribeEngineVersionResponse.MinorVersion"));
		describeEngineVersionResponse.setIsRedisCompatibleVersion(_ctx.stringValue("DescribeEngineVersionResponse.IsRedisCompatibleVersion"));
		describeEngineVersionResponse.setIsSSLEnable(_ctx.stringValue("DescribeEngineVersionResponse.IsSSLEnable"));
		describeEngineVersionResponse.setIsNewSSLMode(_ctx.stringValue("DescribeEngineVersionResponse.IsNewSSLMode"));
		describeEngineVersionResponse.setIsAutoUpgradeOpen(_ctx.stringValue("DescribeEngineVersionResponse.IsAutoUpgradeOpen"));
		describeEngineVersionResponse.setIsOpenNGLB(_ctx.stringValue("DescribeEngineVersionResponse.IsOpenNGLB"));

		DBLatestMinorVersion dBLatestMinorVersion = new DBLatestMinorVersion();
		dBLatestMinorVersion.setMinorVersion(_ctx.stringValue("DescribeEngineVersionResponse.DBLatestMinorVersion.MinorVersion"));
		dBLatestMinorVersion.setLevel(_ctx.stringValue("DescribeEngineVersionResponse.DBLatestMinorVersion.Level"));

		VersionRelease versionRelease = new VersionRelease();
		versionRelease.setVersionChangesLevel(_ctx.stringValue("DescribeEngineVersionResponse.DBLatestMinorVersion.VersionRelease.VersionChangesLevel"));

		List<ReleaseInfoList> releaseInfo = new ArrayList<ReleaseInfoList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEngineVersionResponse.DBLatestMinorVersion.VersionRelease.ReleaseInfo.Length"); i++) {
			ReleaseInfoList releaseInfoList = new ReleaseInfoList();
			releaseInfoList.setReleaseVersion(_ctx.stringValue("DescribeEngineVersionResponse.DBLatestMinorVersion.VersionRelease.ReleaseInfo["+ i +"].ReleaseVersion"));
			releaseInfoList.setCreateTime(_ctx.stringValue("DescribeEngineVersionResponse.DBLatestMinorVersion.VersionRelease.ReleaseInfo["+ i +"].CreateTime"));
			releaseInfoList.setReleaseNote(_ctx.stringValue("DescribeEngineVersionResponse.DBLatestMinorVersion.VersionRelease.ReleaseInfo["+ i +"].ReleaseNote"));
			releaseInfoList.setLevel(_ctx.stringValue("DescribeEngineVersionResponse.DBLatestMinorVersion.VersionRelease.ReleaseInfo["+ i +"].Level"));
			releaseInfoList.setReleaseNoteEn(_ctx.stringValue("DescribeEngineVersionResponse.DBLatestMinorVersion.VersionRelease.ReleaseInfo["+ i +"].ReleaseNoteEn"));

			releaseInfo.add(releaseInfoList);
		}
		versionRelease.setReleaseInfo(releaseInfo);
		dBLatestMinorVersion.setVersionRelease(versionRelease);
		describeEngineVersionResponse.setDBLatestMinorVersion(dBLatestMinorVersion);

		ProxyLatestMinorVersion proxyLatestMinorVersion = new ProxyLatestMinorVersion();
		proxyLatestMinorVersion.setMinorVersion(_ctx.stringValue("DescribeEngineVersionResponse.ProxyLatestMinorVersion.MinorVersion"));
		proxyLatestMinorVersion.setLevel(_ctx.stringValue("DescribeEngineVersionResponse.ProxyLatestMinorVersion.Level"));

		VersionRelease1 versionRelease1 = new VersionRelease1();
		versionRelease1.setVersionChangesLevel(_ctx.stringValue("DescribeEngineVersionResponse.ProxyLatestMinorVersion.VersionRelease.VersionChangesLevel"));

		List<ReleaseInfoList3> releaseInfo2 = new ArrayList<ReleaseInfoList3>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEngineVersionResponse.ProxyLatestMinorVersion.VersionRelease.ReleaseInfo.Length"); i++) {
			ReleaseInfoList3 releaseInfoList3 = new ReleaseInfoList3();
			releaseInfoList3.setReleaseVersion(_ctx.stringValue("DescribeEngineVersionResponse.ProxyLatestMinorVersion.VersionRelease.ReleaseInfo["+ i +"].ReleaseVersion"));
			releaseInfoList3.setCreateTime(_ctx.stringValue("DescribeEngineVersionResponse.ProxyLatestMinorVersion.VersionRelease.ReleaseInfo["+ i +"].CreateTime"));
			releaseInfoList3.setReleaseNote(_ctx.stringValue("DescribeEngineVersionResponse.ProxyLatestMinorVersion.VersionRelease.ReleaseInfo["+ i +"].ReleaseNote"));
			releaseInfoList3.setLevel(_ctx.stringValue("DescribeEngineVersionResponse.ProxyLatestMinorVersion.VersionRelease.ReleaseInfo["+ i +"].Level"));
			releaseInfoList3.setReleaseNoteEn(_ctx.stringValue("DescribeEngineVersionResponse.ProxyLatestMinorVersion.VersionRelease.ReleaseInfo["+ i +"].ReleaseNoteEn"));

			releaseInfo2.add(releaseInfoList3);
		}
		versionRelease1.setReleaseInfo2(releaseInfo2);
		proxyLatestMinorVersion.setVersionRelease1(versionRelease1);
		describeEngineVersionResponse.setProxyLatestMinorVersion(proxyLatestMinorVersion);
	 
	 	return describeEngineVersionResponse;
	}
}