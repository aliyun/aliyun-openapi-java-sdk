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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.ListVersionsResponse;
import com.aliyuncs.drds.model.v20190123.ListVersionsResponse.VersionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVersionsResponseUnmarshaller {

	public static ListVersionsResponse unmarshall(ListVersionsResponse listVersionsResponse, UnmarshallerContext _ctx) {
		
		listVersionsResponse.setRequestId(_ctx.stringValue("ListVersionsResponse.RequestId"));
		listVersionsResponse.setSuccess(_ctx.booleanValue("ListVersionsResponse.Success"));

		List<VersionsItem> versions = new ArrayList<VersionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVersionsResponse.versions.Length"); i++) {
			VersionsItem versionsItem = new VersionsItem();
			versionsItem.setDrdsVersion(_ctx.stringValue("ListVersionsResponse.versions["+ i +"].DrdsVersion"));
			versionsItem.setLatest(_ctx.booleanValue("ListVersionsResponse.versions["+ i +"].Latest"));

			versions.add(versionsItem);
		}
		listVersionsResponse.setVersions(versions);
	 
	 	return listVersionsResponse;
	}
}