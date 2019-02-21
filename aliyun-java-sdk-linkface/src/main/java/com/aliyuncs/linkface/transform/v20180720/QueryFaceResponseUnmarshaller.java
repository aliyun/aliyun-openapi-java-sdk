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

import com.aliyuncs.linkface.model.v20180720.QueryFaceResponse;
import com.aliyuncs.linkface.model.v20180720.QueryFaceResponse.Data;
import com.aliyuncs.linkface.model.v20180720.QueryFaceResponse.Data.UserFaceMetasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaceResponseUnmarshaller {

	public static QueryFaceResponse unmarshall(QueryFaceResponse queryFaceResponse, UnmarshallerContext context) {
		
		queryFaceResponse.setRequestId(context.stringValue("QueryFaceResponse.RequestId"));
		queryFaceResponse.setCode(context.integerValue("QueryFaceResponse.Code"));
		queryFaceResponse.setMessage(context.stringValue("QueryFaceResponse.Message"));
		queryFaceResponse.setSuccess(context.booleanValue("QueryFaceResponse.Success"));

		Data data = new Data();

		List<String> groupIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryFaceResponse.Data.GroupIds.Length"); i++) {
			groupIds.add(context.stringValue("QueryFaceResponse.Data.GroupIds["+ i +"]"));
		}
		data.setGroupIds(groupIds);

		List<UserFaceMetasItem> userFaceMetas = new ArrayList<UserFaceMetasItem>();
		for (int i = 0; i < context.lengthValue("QueryFaceResponse.Data.UserFaceMetas.Length"); i++) {
			UserFaceMetasItem userFaceMetasItem = new UserFaceMetasItem();
			userFaceMetasItem.setClientTag(context.stringValue("QueryFaceResponse.Data.UserFaceMetas["+ i +"].ClientTag"));
			userFaceMetasItem.setIndex(context.integerValue("QueryFaceResponse.Data.UserFaceMetas["+ i +"].Index"));
			userFaceMetasItem.setFaceUrl(context.stringValue("QueryFaceResponse.Data.UserFaceMetas["+ i +"].FaceUrl"));
			userFaceMetasItem.setUserInfo(context.stringValue("QueryFaceResponse.Data.UserFaceMetas["+ i +"].UserInfo"));

			userFaceMetas.add(userFaceMetasItem);
		}
		data.setUserFaceMetas(userFaceMetas);
		queryFaceResponse.setData(data);
	 
	 	return queryFaceResponse;
	}
}