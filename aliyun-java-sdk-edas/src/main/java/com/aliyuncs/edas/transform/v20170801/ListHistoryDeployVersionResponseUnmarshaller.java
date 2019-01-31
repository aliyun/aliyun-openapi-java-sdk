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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListHistoryDeployVersionResponse;
import com.aliyuncs.edas.model.v20170801.ListHistoryDeployVersionResponse.PackageVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHistoryDeployVersionResponseUnmarshaller {

	public static ListHistoryDeployVersionResponse unmarshall(ListHistoryDeployVersionResponse listHistoryDeployVersionResponse, UnmarshallerContext context) {
		
		listHistoryDeployVersionResponse.setRequestId(context.stringValue("ListHistoryDeployVersionResponse.RequestId"));
		listHistoryDeployVersionResponse.setCode(context.integerValue("ListHistoryDeployVersionResponse.Code"));
		listHistoryDeployVersionResponse.setMessage(context.stringValue("ListHistoryDeployVersionResponse.Message"));

		List<PackageVersion> packageVersionList = new ArrayList<PackageVersion>();
		for (int i = 0; i < context.lengthValue("ListHistoryDeployVersionResponse.PackageVersionList.Length"); i++) {
			PackageVersion packageVersion = new PackageVersion();
			packageVersion.setId(context.stringValue("ListHistoryDeployVersionResponse.PackageVersionList["+ i +"].Id"));
			packageVersion.setPackageVersion(context.stringValue("ListHistoryDeployVersionResponse.PackageVersionList["+ i +"].PackageVersion"));
			packageVersion.setAppId(context.stringValue("ListHistoryDeployVersionResponse.PackageVersionList["+ i +"].AppId"));
			packageVersion.setDescription(context.stringValue("ListHistoryDeployVersionResponse.PackageVersionList["+ i +"].Description"));
			packageVersion.setWarUrl(context.stringValue("ListHistoryDeployVersionResponse.PackageVersionList["+ i +"].WarUrl"));
			packageVersion.setCreateTime(context.longValue("ListHistoryDeployVersionResponse.PackageVersionList["+ i +"].CreateTime"));
			packageVersion.setUpdateTime(context.longValue("ListHistoryDeployVersionResponse.PackageVersionList["+ i +"].UpdateTime"));
			packageVersion.setType(context.stringValue("ListHistoryDeployVersionResponse.PackageVersionList["+ i +"].Type"));

			packageVersionList.add(packageVersion);
		}
		listHistoryDeployVersionResponse.setPackageVersionList(packageVersionList);
	 
	 	return listHistoryDeployVersionResponse;
	}
}