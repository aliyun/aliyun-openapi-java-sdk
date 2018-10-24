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

package com.aliyuncs.crm.transform.v20150408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.crm.model.v20150408.BatchGetAliyunIdByAliyunPkResponse;
import com.aliyuncs.crm.model.v20150408.BatchGetAliyunIdByAliyunPkResponse.ProfileItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetAliyunIdByAliyunPkResponseUnmarshaller {

	public static BatchGetAliyunIdByAliyunPkResponse unmarshall(BatchGetAliyunIdByAliyunPkResponse batchGetAliyunIdByAliyunPkResponse, UnmarshallerContext context) {
		
		batchGetAliyunIdByAliyunPkResponse.setRequestId(context.stringValue("BatchGetAliyunIdByAliyunPkResponse.RequestId"));

		List<ProfileItem> profileList = new ArrayList<ProfileItem>();
		for (int i = 0; i < context.lengthValue("BatchGetAliyunIdByAliyunPkResponse.ProfileList.Length"); i++) {
			ProfileItem profileItem = new ProfileItem();
			profileItem.setAliyunId(context.stringValue("BatchGetAliyunIdByAliyunPkResponse.ProfileList["+ i +"].AliyunId"));
			profileItem.setAliyunPk(context.stringValue("BatchGetAliyunIdByAliyunPkResponse.ProfileList["+ i +"].AliyunPk"));

			profileList.add(profileItem);
		}
		batchGetAliyunIdByAliyunPkResponse.setProfileList(profileList);
	 
	 	return batchGetAliyunIdByAliyunPkResponse;
	}
}