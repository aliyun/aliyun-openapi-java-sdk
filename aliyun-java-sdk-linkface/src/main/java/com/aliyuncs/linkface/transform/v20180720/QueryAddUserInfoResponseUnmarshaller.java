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

package com.aliyuncs.linkface.transform.v20180720;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkface.model.v20180720.QueryAddUserInfoResponse;
import com.aliyuncs.linkface.model.v20180720.QueryAddUserInfoResponse.Data;
import com.aliyuncs.linkface.model.v20180720.QueryAddUserInfoResponse.Data.CurrentFaceInfosItem;
import com.aliyuncs.linkface.model.v20180720.QueryAddUserInfoResponse.Data.FailedFaceInfosItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAddUserInfoResponseUnmarshaller {

	public static QueryAddUserInfoResponse unmarshall(QueryAddUserInfoResponse queryAddUserInfoResponse, UnmarshallerContext context) {
		
		queryAddUserInfoResponse.setRequestId(context.stringValue("QueryAddUserInfoResponse.RequestId"));
		queryAddUserInfoResponse.setCode(context.integerValue("QueryAddUserInfoResponse.Code"));
		queryAddUserInfoResponse.setMessage(context.stringValue("QueryAddUserInfoResponse.Message"));
		queryAddUserInfoResponse.setSuccess(context.booleanValue("QueryAddUserInfoResponse.Success"));

		Data data = new Data();

		List<CurrentFaceInfosItem> currentFaceInfos = new ArrayList<CurrentFaceInfosItem>();
		for (int i = 0; i < context.lengthValue("QueryAddUserInfoResponse.Data.CurrentFaceInfos.Length"); i++) {
			CurrentFaceInfosItem currentFaceInfosItem = new CurrentFaceInfosItem();
			currentFaceInfosItem.setUserId(context.stringValue("QueryAddUserInfoResponse.Data.CurrentFaceInfos["+ i +"].UserId"));
			currentFaceInfosItem.setClientTag(context.stringValue("QueryAddUserInfoResponse.Data.CurrentFaceInfos["+ i +"].ClientTag"));
			currentFaceInfosItem.setIndex(context.integerValue("QueryAddUserInfoResponse.Data.CurrentFaceInfos["+ i +"].Index"));

			currentFaceInfos.add(currentFaceInfosItem);
		}
		data.setCurrentFaceInfos(currentFaceInfos);

		List<FailedFaceInfosItem> failedFaceInfos = new ArrayList<FailedFaceInfosItem>();
		for (int i = 0; i < context.lengthValue("QueryAddUserInfoResponse.Data.FailedFaceInfos.Length"); i++) {
			FailedFaceInfosItem failedFaceInfosItem = new FailedFaceInfosItem();
			failedFaceInfosItem.setUserId(context.stringValue("QueryAddUserInfoResponse.Data.FailedFaceInfos["+ i +"].UserId"));
			failedFaceInfosItem.setClientTag(context.stringValue("QueryAddUserInfoResponse.Data.FailedFaceInfos["+ i +"].ClientTag"));
			failedFaceInfosItem.setIndex(context.integerValue("QueryAddUserInfoResponse.Data.FailedFaceInfos["+ i +"].Index"));

			failedFaceInfos.add(failedFaceInfosItem);
		}
		data.setFailedFaceInfos(failedFaceInfos);
		queryAddUserInfoResponse.setData(data);
	 
	 	return queryAddUserInfoResponse;
	}
}