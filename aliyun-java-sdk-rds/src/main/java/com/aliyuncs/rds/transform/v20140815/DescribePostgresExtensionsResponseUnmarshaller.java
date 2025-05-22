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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribePostgresExtensionsResponse;
import com.aliyuncs.rds.model.v20140815.DescribePostgresExtensionsResponse.Extension;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePostgresExtensionsResponseUnmarshaller {

	public static DescribePostgresExtensionsResponse unmarshall(DescribePostgresExtensionsResponse describePostgresExtensionsResponse, UnmarshallerContext _ctx) {
		
		describePostgresExtensionsResponse.setRequestId(_ctx.stringValue("DescribePostgresExtensionsResponse.RequestId"));
		describePostgresExtensionsResponse.setOverview(_ctx.mapValue("DescribePostgresExtensionsResponse.Overview"));

		List<Extension> installedExtensions = new ArrayList<Extension>();
		for (int i = 0; i < _ctx.lengthValue("DescribePostgresExtensionsResponse.InstalledExtensions.Length"); i++) {
			Extension extension = new Extension();
			extension.setCategory(_ctx.stringValue("DescribePostgresExtensionsResponse.InstalledExtensions["+ i +"].Category"));
			extension.setComment(_ctx.stringValue("DescribePostgresExtensionsResponse.InstalledExtensions["+ i +"].Comment"));
			extension.setDefaultVersion(_ctx.stringValue("DescribePostgresExtensionsResponse.InstalledExtensions["+ i +"].DefaultVersion"));
			extension.setInstalledVersion(_ctx.stringValue("DescribePostgresExtensionsResponse.InstalledExtensions["+ i +"].InstalledVersion"));
			extension.setName(_ctx.stringValue("DescribePostgresExtensionsResponse.InstalledExtensions["+ i +"].Name"));
			extension.setOwner(_ctx.stringValue("DescribePostgresExtensionsResponse.InstalledExtensions["+ i +"].Owner"));
			extension.setPriority(_ctx.stringValue("DescribePostgresExtensionsResponse.InstalledExtensions["+ i +"].Priority"));
			extension.setRequires(_ctx.stringValue("DescribePostgresExtensionsResponse.InstalledExtensions["+ i +"].Requires"));
			extension.setUid(_ctx.stringValue("DescribePostgresExtensionsResponse.InstalledExtensions["+ i +"].Uid"));

			installedExtensions.add(extension);
		}
		describePostgresExtensionsResponse.setInstalledExtensions(installedExtensions);

		List<Extension> uninstalledExtensions = new ArrayList<Extension>();
		for (int i = 0; i < _ctx.lengthValue("DescribePostgresExtensionsResponse.UninstalledExtensions.Length"); i++) {
			Extension extension1 = new Extension();
			extension1.setCategory(_ctx.stringValue("DescribePostgresExtensionsResponse.UninstalledExtensions["+ i +"].Category"));
			extension1.setComment(_ctx.stringValue("DescribePostgresExtensionsResponse.UninstalledExtensions["+ i +"].Comment"));
			extension1.setDefaultVersion(_ctx.stringValue("DescribePostgresExtensionsResponse.UninstalledExtensions["+ i +"].DefaultVersion"));
			extension1.setInstalledVersion(_ctx.stringValue("DescribePostgresExtensionsResponse.UninstalledExtensions["+ i +"].InstalledVersion"));
			extension1.setName(_ctx.stringValue("DescribePostgresExtensionsResponse.UninstalledExtensions["+ i +"].Name"));
			extension1.setOwner(_ctx.stringValue("DescribePostgresExtensionsResponse.UninstalledExtensions["+ i +"].Owner"));
			extension1.setPriority(_ctx.stringValue("DescribePostgresExtensionsResponse.UninstalledExtensions["+ i +"].Priority"));
			extension1.setRequires(_ctx.stringValue("DescribePostgresExtensionsResponse.UninstalledExtensions["+ i +"].Requires"));
			extension1.setUid(_ctx.stringValue("DescribePostgresExtensionsResponse.UninstalledExtensions["+ i +"].Uid"));

			uninstalledExtensions.add(extension1);
		}
		describePostgresExtensionsResponse.setUninstalledExtensions(uninstalledExtensions);
	 
	 	return describePostgresExtensionsResponse;
	}
}