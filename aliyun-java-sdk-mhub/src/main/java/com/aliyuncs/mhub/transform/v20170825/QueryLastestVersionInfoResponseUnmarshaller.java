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

package com.aliyuncs.mhub.transform.v20170825;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mhub.model.v20170825.QueryLastestVersionInfoResponse;
import com.aliyuncs.mhub.model.v20170825.QueryLastestVersionInfoResponse.VersionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLastestVersionInfoResponseUnmarshaller {

	public static QueryLastestVersionInfoResponse unmarshall(QueryLastestVersionInfoResponse queryLastestVersionInfoResponse, UnmarshallerContext _ctx) {
		
		queryLastestVersionInfoResponse.setRequestId(_ctx.stringValue("QueryLastestVersionInfoResponse.RequestId"));

		List<VersionInfo> versionInfos = new ArrayList<VersionInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryLastestVersionInfoResponse.VersionInfos.Length"); i++) {
			VersionInfo versionInfo = new VersionInfo();
			versionInfo.setOS(_ctx.stringValue("QueryLastestVersionInfoResponse.VersionInfos["+ i +"].OS"));
			versionInfo.setVersion(_ctx.stringValue("QueryLastestVersionInfoResponse.VersionInfos["+ i +"].Version"));
			versionInfo.setProductID(_ctx.stringValue("QueryLastestVersionInfoResponse.VersionInfos["+ i +"].ProductID"));
			versionInfo.setCreateTime(_ctx.stringValue("QueryLastestVersionInfoResponse.VersionInfos["+ i +"].CreateTime"));
			versionInfo.setContent(_ctx.stringValue("QueryLastestVersionInfoResponse.VersionInfos["+ i +"].Content"));

			versionInfos.add(versionInfo);
		}
		queryLastestVersionInfoResponse.setVersionInfos(versionInfos);
	 
	 	return queryLastestVersionInfoResponse;
	}
}