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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.ListServiceVersionsResponse;
import com.aliyuncs.eas.model.v20210701.ListServiceVersionsResponse.VersionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceVersionsResponseUnmarshaller {

	public static ListServiceVersionsResponse unmarshall(ListServiceVersionsResponse listServiceVersionsResponse, UnmarshallerContext _ctx) {
		
		listServiceVersionsResponse.setRequestId(_ctx.stringValue("ListServiceVersionsResponse.RequestId"));
		listServiceVersionsResponse.setPageNumber(_ctx.integerValue("ListServiceVersionsResponse.PageNumber"));
		listServiceVersionsResponse.setPageSize(_ctx.integerValue("ListServiceVersionsResponse.PageSize"));
		listServiceVersionsResponse.setTotalCount(_ctx.longValue("ListServiceVersionsResponse.TotalCount"));

		List<VersionsItem> versions = new ArrayList<VersionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListServiceVersionsResponse.Versions.Length"); i++) {
			VersionsItem versionsItem = new VersionsItem();
			versionsItem.setBuildTime(_ctx.stringValue("ListServiceVersionsResponse.Versions["+ i +"].BuildTime"));
			versionsItem.setImageAvailable(_ctx.stringValue("ListServiceVersionsResponse.Versions["+ i +"].ImageAvailable"));
			versionsItem.setImageId(_ctx.integerValue("ListServiceVersionsResponse.Versions["+ i +"].ImageId"));
			versionsItem.setMessage(_ctx.stringValue("ListServiceVersionsResponse.Versions["+ i +"].Message"));
			versionsItem.setServiceRunnable(_ctx.stringValue("ListServiceVersionsResponse.Versions["+ i +"].ServiceRunnable"));

			versions.add(versionsItem);
		}
		listServiceVersionsResponse.setVersions(versions);
	 
	 	return listServiceVersionsResponse;
	}
}