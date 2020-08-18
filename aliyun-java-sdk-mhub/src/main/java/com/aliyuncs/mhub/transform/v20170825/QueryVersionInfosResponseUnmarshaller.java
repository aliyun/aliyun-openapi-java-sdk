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

import com.aliyuncs.mhub.model.v20170825.QueryVersionInfosResponse;
import com.aliyuncs.mhub.model.v20170825.QueryVersionInfosResponse.VersionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVersionInfosResponseUnmarshaller {

	public static QueryVersionInfosResponse unmarshall(QueryVersionInfosResponse queryVersionInfosResponse, UnmarshallerContext _ctx) {
		
		queryVersionInfosResponse.setRequestId(_ctx.stringValue("QueryVersionInfosResponse.RequestId"));

		List<VersionInfo> versionInfos = new ArrayList<VersionInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryVersionInfosResponse.VersionInfos.Length"); i++) {
			VersionInfo versionInfo = new VersionInfo();
			versionInfo.setOS(_ctx.stringValue("QueryVersionInfosResponse.VersionInfos["+ i +"].OS"));
			versionInfo.setVersion(_ctx.stringValue("QueryVersionInfosResponse.VersionInfos["+ i +"].Version"));
			versionInfo.setProductID(_ctx.stringValue("QueryVersionInfosResponse.VersionInfos["+ i +"].ProductID"));
			versionInfo.setCreateTime(_ctx.stringValue("QueryVersionInfosResponse.VersionInfos["+ i +"].CreateTime"));
			versionInfo.setContent(_ctx.stringValue("QueryVersionInfosResponse.VersionInfos["+ i +"].Content"));

			versionInfos.add(versionInfo);
		}
		queryVersionInfosResponse.setVersionInfos(versionInfos);
	 
	 	return queryVersionInfosResponse;
	}
}