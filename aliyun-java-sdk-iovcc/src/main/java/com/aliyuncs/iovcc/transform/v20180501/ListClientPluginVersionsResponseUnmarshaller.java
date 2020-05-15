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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListClientPluginVersionsResponse;
import com.aliyuncs.iovcc.model.v20180501.ListClientPluginVersionsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClientPluginVersionsResponseUnmarshaller {

	public static ListClientPluginVersionsResponse unmarshall(ListClientPluginVersionsResponse listClientPluginVersionsResponse, UnmarshallerContext _ctx) {
		
		listClientPluginVersionsResponse.setRequestId(_ctx.stringValue("ListClientPluginVersionsResponse.RequestId"));

		List<Result> clientPluginVersions = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ListClientPluginVersionsResponse.ClientPluginVersions.Length"); i++) {
			Result result = new Result();
			result.setPkgName(_ctx.stringValue("ListClientPluginVersionsResponse.ClientPluginVersions["+ i +"].PkgName"));
			result.setVersionCode(_ctx.longValue("ListClientPluginVersionsResponse.ClientPluginVersions["+ i +"].VersionCode"));
			result.setVersion(_ctx.stringValue("ListClientPluginVersionsResponse.ClientPluginVersions["+ i +"].Version"));
			result.setSize(_ctx.longValue("ListClientPluginVersionsResponse.ClientPluginVersions["+ i +"].Size"));
			result.setId(_ctx.longValue("ListClientPluginVersionsResponse.ClientPluginVersions["+ i +"].Id"));
			result.setDownloadUrl(_ctx.stringValue("ListClientPluginVersionsResponse.ClientPluginVersions["+ i +"].DownloadUrl"));

			clientPluginVersions.add(result);
		}
		listClientPluginVersionsResponse.setClientPluginVersions(clientPluginVersions);
	 
	 	return listClientPluginVersionsResponse;
	}
}