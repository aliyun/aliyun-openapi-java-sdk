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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeExtensionsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeExtensionsResponse.InstalledExtensionsItem;
import com.aliyuncs.polardb.model.v20170801.DescribeExtensionsResponse.UninstalledExtensionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExtensionsResponseUnmarshaller {

	public static DescribeExtensionsResponse unmarshall(DescribeExtensionsResponse describeExtensionsResponse, UnmarshallerContext _ctx) {
		
		describeExtensionsResponse.setRequestId(_ctx.stringValue("DescribeExtensionsResponse.RequestId"));
		describeExtensionsResponse.setOverview(_ctx.stringValue("DescribeExtensionsResponse.Overview"));

		List<UninstalledExtensionsItem> uninstalledExtensions = new ArrayList<UninstalledExtensionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExtensionsResponse.UninstalledExtensions.Length"); i++) {
			UninstalledExtensionsItem uninstalledExtensionsItem = new UninstalledExtensionsItem();
			uninstalledExtensionsItem.setName(_ctx.stringValue("DescribeExtensionsResponse.UninstalledExtensions["+ i +"].Name"));
			uninstalledExtensionsItem.setDefaultVersion(_ctx.stringValue("DescribeExtensionsResponse.UninstalledExtensions["+ i +"].DefaultVersion"));
			uninstalledExtensionsItem.setInstalledVersion(_ctx.stringValue("DescribeExtensionsResponse.UninstalledExtensions["+ i +"].InstalledVersion"));
			uninstalledExtensionsItem.setComment(_ctx.stringValue("DescribeExtensionsResponse.UninstalledExtensions["+ i +"].Comment"));
			uninstalledExtensionsItem.setOwner(_ctx.stringValue("DescribeExtensionsResponse.UninstalledExtensions["+ i +"].Owner"));
			uninstalledExtensionsItem.setPriority(_ctx.stringValue("DescribeExtensionsResponse.UninstalledExtensions["+ i +"].Priority"));
			uninstalledExtensionsItem.setRequires(_ctx.stringValue("DescribeExtensionsResponse.UninstalledExtensions["+ i +"].Requires"));
			uninstalledExtensionsItem.setCategory(_ctx.stringValue("DescribeExtensionsResponse.UninstalledExtensions["+ i +"].Category"));
			uninstalledExtensionsItem.setRestart(_ctx.stringValue("DescribeExtensionsResponse.UninstalledExtensions["+ i +"].Restart"));

			uninstalledExtensions.add(uninstalledExtensionsItem);
		}
		describeExtensionsResponse.setUninstalledExtensions(uninstalledExtensions);

		List<InstalledExtensionsItem> installedExtensions = new ArrayList<InstalledExtensionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExtensionsResponse.InstalledExtensions.Length"); i++) {
			InstalledExtensionsItem installedExtensionsItem = new InstalledExtensionsItem();
			installedExtensionsItem.setName(_ctx.stringValue("DescribeExtensionsResponse.InstalledExtensions["+ i +"].Name"));
			installedExtensionsItem.setDefaultVersion(_ctx.stringValue("DescribeExtensionsResponse.InstalledExtensions["+ i +"].DefaultVersion"));
			installedExtensionsItem.setInstalledVersion(_ctx.stringValue("DescribeExtensionsResponse.InstalledExtensions["+ i +"].InstalledVersion"));
			installedExtensionsItem.setComment(_ctx.stringValue("DescribeExtensionsResponse.InstalledExtensions["+ i +"].Comment"));
			installedExtensionsItem.setOwner(_ctx.stringValue("DescribeExtensionsResponse.InstalledExtensions["+ i +"].Owner"));
			installedExtensionsItem.setPriority(_ctx.stringValue("DescribeExtensionsResponse.InstalledExtensions["+ i +"].Priority"));
			installedExtensionsItem.setRequires(_ctx.stringValue("DescribeExtensionsResponse.InstalledExtensions["+ i +"].Requires"));
			installedExtensionsItem.setCategory(_ctx.stringValue("DescribeExtensionsResponse.InstalledExtensions["+ i +"].Category"));
			installedExtensionsItem.setRestart(_ctx.stringValue("DescribeExtensionsResponse.InstalledExtensions["+ i +"].Restart"));

			installedExtensions.add(installedExtensionsItem);
		}
		describeExtensionsResponse.setInstalledExtensions(installedExtensions);
	 
	 	return describeExtensionsResponse;
	}
}