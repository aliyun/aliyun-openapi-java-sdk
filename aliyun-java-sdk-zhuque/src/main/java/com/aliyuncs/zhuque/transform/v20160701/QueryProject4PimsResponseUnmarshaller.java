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

package com.aliyuncs.zhuque.transform.v20160701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.zhuque.model.v20160701.QueryProject4PimsResponse;
import com.aliyuncs.zhuque.model.v20160701.QueryProject4PimsResponse.VersionItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProject4PimsResponseUnmarshaller {

	public static QueryProject4PimsResponse unmarshall(QueryProject4PimsResponse queryProject4PimsResponse, UnmarshallerContext context) {
		
		queryProject4PimsResponse.setRequestId(context.stringValue("QueryProject4PimsResponse.RequestId"));

		List<VersionItem> versionItemList = new ArrayList<VersionItem>();
		for (int i = 0; i < context.lengthValue("QueryProject4PimsResponse.VersionItemList.Length"); i++) {
			VersionItem versionItem = new VersionItem();
			versionItem.setVersionId(context.stringValue("QueryProject4PimsResponse.VersionItemList["+ i +"].VersionId"));
			versionItem.setVersionName(context.stringValue("QueryProject4PimsResponse.VersionItemList["+ i +"].VersionName"));
			versionItem.setStatus(context.stringValue("QueryProject4PimsResponse.VersionItemList["+ i +"].Status"));
			versionItem.setModifyTime(context.stringValue("QueryProject4PimsResponse.VersionItemList["+ i +"].ModifyTime"));
			versionItem.setModifier(context.stringValue("QueryProject4PimsResponse.VersionItemList["+ i +"].Modifier"));

			versionItemList.add(versionItem);
		}
		queryProject4PimsResponse.setVersionItemList(versionItemList);
	 
	 	return queryProject4PimsResponse;
	}
}