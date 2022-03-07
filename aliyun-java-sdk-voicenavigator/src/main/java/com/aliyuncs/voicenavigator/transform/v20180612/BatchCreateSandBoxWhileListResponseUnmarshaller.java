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

package com.aliyuncs.voicenavigator.transform.v20180612;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.voicenavigator.model.v20180612.BatchCreateSandBoxWhileListResponse;
import com.aliyuncs.voicenavigator.model.v20180612.BatchCreateSandBoxWhileListResponse.WhiteListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateSandBoxWhileListResponseUnmarshaller {

	public static BatchCreateSandBoxWhileListResponse unmarshall(BatchCreateSandBoxWhileListResponse batchCreateSandBoxWhileListResponse, UnmarshallerContext _ctx) {
		
		batchCreateSandBoxWhileListResponse.setRequestId(_ctx.stringValue("BatchCreateSandBoxWhileListResponse.RequestId"));
		batchCreateSandBoxWhileListResponse.setRepeat(_ctx.booleanValue("BatchCreateSandBoxWhileListResponse.Repeat"));

		List<WhiteListItem> whiteList = new ArrayList<WhiteListItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchCreateSandBoxWhileListResponse.WhiteList.Length"); i++) {
			WhiteListItem whiteListItem = new WhiteListItem();
			whiteListItem.setUuid(_ctx.stringValue("BatchCreateSandBoxWhileListResponse.WhiteList["+ i +"].Uuid"));
			whiteListItem.setPhoneNumber(_ctx.stringValue("BatchCreateSandBoxWhileListResponse.WhiteList["+ i +"].PhoneNumber"));
			whiteListItem.setDescription(_ctx.stringValue("BatchCreateSandBoxWhileListResponse.WhiteList["+ i +"].Description"));
			whiteListItem.setIsEnable(_ctx.integerValue("BatchCreateSandBoxWhileListResponse.WhiteList["+ i +"].IsEnable"));
			whiteListItem.setGmtCreate(_ctx.longValue("BatchCreateSandBoxWhileListResponse.WhiteList["+ i +"].GmtCreate"));
			whiteListItem.setInstanceId(_ctx.stringValue("BatchCreateSandBoxWhileListResponse.WhiteList["+ i +"].InstanceId"));
			whiteListItem.setGmtModified(_ctx.longValue("BatchCreateSandBoxWhileListResponse.WhiteList["+ i +"].GmtModified"));
			whiteListItem.setName(_ctx.stringValue("BatchCreateSandBoxWhileListResponse.WhiteList["+ i +"].Name"));

			whiteList.add(whiteListItem);
		}
		batchCreateSandBoxWhileListResponse.setWhiteList(whiteList);
	 
	 	return batchCreateSandBoxWhileListResponse;
	}
}