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

import com.aliyuncs.oam.model.v20170101.ListGroupTagByPageResponse;
import com.aliyuncs.oam.model.v20170101.ListGroupTagByPageResponse.OamMutexGroupTagResult;
import com.aliyuncs.oam.model.v20170101.ListGroupTagByPageResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupTagByPageResponseUnmarshaller {

	public static ListGroupTagByPageResponse unmarshall(ListGroupTagByPageResponse listGroupTagByPageResponse, UnmarshallerContext _ctx) {
		
		listGroupTagByPageResponse.setRequestId(_ctx.stringValue("ListGroupTagByPageResponse.RequestId"));
		listGroupTagByPageResponse.setCode(_ctx.stringValue("ListGroupTagByPageResponse.Code"));
		listGroupTagByPageResponse.setMessage(_ctx.stringValue("ListGroupTagByPageResponse.Message"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListGroupTagByPageResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListGroupTagByPageResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("ListGroupTagByPageResponse.PageInfo.Total"));
		pageInfo.setTotalPage(_ctx.integerValue("ListGroupTagByPageResponse.PageInfo.TotalPage"));
		pageInfo.setNextPageToken(_ctx.stringValue("ListGroupTagByPageResponse.PageInfo.NextPageToken"));
		listGroupTagByPageResponse.setPageInfo(pageInfo);

		List<OamMutexGroupTagResult> data = new ArrayList<OamMutexGroupTagResult>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupTagByPageResponse.Data.Length"); i++) {
			OamMutexGroupTagResult oamMutexGroupTagResult = new OamMutexGroupTagResult();
			oamMutexGroupTagResult.setGroupTagId(_ctx.stringValue("ListGroupTagByPageResponse.Data["+ i +"].GroupTagId"));
			oamMutexGroupTagResult.setDescription(_ctx.stringValue("ListGroupTagByPageResponse.Data["+ i +"].Description"));
			oamMutexGroupTagResult.setName(_ctx.stringValue("ListGroupTagByPageResponse.Data["+ i +"].Name"));
			oamMutexGroupTagResult.setGmtCreated(_ctx.stringValue("ListGroupTagByPageResponse.Data["+ i +"].GmtCreated"));
			oamMutexGroupTagResult.setGmtModified(_ctx.stringValue("ListGroupTagByPageResponse.Data["+ i +"].GmtModified"));
			oamMutexGroupTagResult.setUserId(_ctx.stringValue("ListGroupTagByPageResponse.Data["+ i +"].UserId"));
			oamMutexGroupTagResult.setUserModified(_ctx.stringValue("ListGroupTagByPageResponse.Data["+ i +"].UserModified"));

			data.add(oamMutexGroupTagResult);
		}
		listGroupTagByPageResponse.setData(data);
	 
	 	return listGroupTagByPageResponse;
	}
}