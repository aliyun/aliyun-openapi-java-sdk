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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListUsersResponse;
import com.aliyuncs.vcs.model.v20200515.ListUsersResponse.Data;
import com.aliyuncs.vcs.model.v20200515.ListUsersResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext _ctx) {
		
		listUsersResponse.setRequestId(_ctx.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setMessage(_ctx.stringValue("ListUsersResponse.Message"));
		listUsersResponse.setCode(_ctx.stringValue("ListUsersResponse.Code"));

		Data data = new Data();
		data.setSuccess(_ctx.longValue("ListUsersResponse.Data.Success"));
		data.setPageNumber(_ctx.longValue("ListUsersResponse.Data.PageNumber"));
		data.setPageSize(_ctx.longValue("ListUsersResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListUsersResponse.Data.Total"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setIsvSubId(_ctx.stringValue("ListUsersResponse.Data.Records["+ i +"].IsvSubId"));
			recordsItem.setGender(_ctx.stringValue("ListUsersResponse.Data.Records["+ i +"].Gender"));
			recordsItem.setFaceImageUrl(_ctx.stringValue("ListUsersResponse.Data.Records["+ i +"].FaceImageUrl"));
			recordsItem.setUserGroupId(_ctx.integerValue("ListUsersResponse.Data.Records["+ i +"].UserGroupId"));
			recordsItem.setUserId(_ctx.integerValue("ListUsersResponse.Data.Records["+ i +"].UserId"));
			recordsItem.setMatchingRate(_ctx.stringValue("ListUsersResponse.Data.Records["+ i +"].MatchingRate"));
			recordsItem.setBizId(_ctx.stringValue("ListUsersResponse.Data.Records["+ i +"].BizId"));
			recordsItem.setAttachment(_ctx.stringValue("ListUsersResponse.Data.Records["+ i +"].Attachment"));
			recordsItem.setAge(_ctx.stringValue("ListUsersResponse.Data.Records["+ i +"].Age"));
			recordsItem.setIdNumber(_ctx.stringValue("ListUsersResponse.Data.Records["+ i +"].IdNumber"));
			recordsItem.setPersonId(_ctx.stringValue("ListUsersResponse.Data.Records["+ i +"].PersonId"));
			recordsItem.setUserName(_ctx.stringValue("ListUsersResponse.Data.Records["+ i +"].UserName"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		listUsersResponse.setData(data);
	 
	 	return listUsersResponse;
	}
}