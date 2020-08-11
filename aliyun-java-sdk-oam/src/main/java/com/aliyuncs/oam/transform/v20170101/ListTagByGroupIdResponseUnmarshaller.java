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

package com.aliyuncs.oam.transform.v20170101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oam.model.v20170101.ListTagByGroupIdResponse;
import com.aliyuncs.oam.model.v20170101.ListTagByGroupIdResponse.OamMutexGroupTagMiddleResult;
import com.aliyuncs.oam.model.v20170101.ListTagByGroupIdResponse.OamMutexGroupTagMiddleResult.TagResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagByGroupIdResponseUnmarshaller {

	public static ListTagByGroupIdResponse unmarshall(ListTagByGroupIdResponse listTagByGroupIdResponse, UnmarshallerContext _ctx) {
		
		listTagByGroupIdResponse.setRequestId(_ctx.stringValue("ListTagByGroupIdResponse.RequestId"));
		listTagByGroupIdResponse.setCode(_ctx.stringValue("ListTagByGroupIdResponse.Code"));
		listTagByGroupIdResponse.setMessage(_ctx.stringValue("ListTagByGroupIdResponse.Message"));

		List<OamMutexGroupTagMiddleResult> data = new ArrayList<OamMutexGroupTagMiddleResult>();
		for (int i = 0; i < _ctx.lengthValue("ListTagByGroupIdResponse.Data.Length"); i++) {
			OamMutexGroupTagMiddleResult oamMutexGroupTagMiddleResult = new OamMutexGroupTagMiddleResult();
			oamMutexGroupTagMiddleResult.setMiddleId(_ctx.stringValue("ListTagByGroupIdResponse.Data["+ i +"].MiddleId"));
			oamMutexGroupTagMiddleResult.setGroupTagId(_ctx.stringValue("ListTagByGroupIdResponse.Data["+ i +"].GroupTagId"));
			oamMutexGroupTagMiddleResult.setTagId(_ctx.stringValue("ListTagByGroupIdResponse.Data["+ i +"].TagId"));

			TagResult tagResult = new TagResult();
			tagResult.setTagId(_ctx.stringValue("ListTagByGroupIdResponse.Data["+ i +"].TagResult.TagId"));
			tagResult.setDescription(_ctx.stringValue("ListTagByGroupIdResponse.Data["+ i +"].TagResult.Description"));
			tagResult.setName(_ctx.stringValue("ListTagByGroupIdResponse.Data["+ i +"].TagResult.Name"));
			tagResult.setUserId(_ctx.stringValue("ListTagByGroupIdResponse.Data["+ i +"].TagResult.UserId"));
			tagResult.setGmtCreated(_ctx.stringValue("ListTagByGroupIdResponse.Data["+ i +"].TagResult.GmtCreated"));
			tagResult.setGmtModified(_ctx.stringValue("ListTagByGroupIdResponse.Data["+ i +"].TagResult.GmtModified"));
			tagResult.setUserModified(_ctx.stringValue("ListTagByGroupIdResponse.Data["+ i +"].TagResult.UserModified"));
			oamMutexGroupTagMiddleResult.setTagResult(tagResult);

			data.add(oamMutexGroupTagMiddleResult);
		}
		listTagByGroupIdResponse.setData(data);
	 
	 	return listTagByGroupIdResponse;
	}
}