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

import com.aliyuncs.oam.model.v20170101.ListTagByPageResponse;
import com.aliyuncs.oam.model.v20170101.ListTagByPageResponse.OamMutexTagResult;
import com.aliyuncs.oam.model.v20170101.ListTagByPageResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagByPageResponseUnmarshaller {

	public static ListTagByPageResponse unmarshall(ListTagByPageResponse listTagByPageResponse, UnmarshallerContext _ctx) {
		
		listTagByPageResponse.setRequestId(_ctx.stringValue("ListTagByPageResponse.RequestId"));
		listTagByPageResponse.setCode(_ctx.stringValue("ListTagByPageResponse.Code"));
		listTagByPageResponse.setMessage(_ctx.stringValue("ListTagByPageResponse.Message"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListTagByPageResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListTagByPageResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("ListTagByPageResponse.PageInfo.Total"));
		pageInfo.setTotalPage(_ctx.integerValue("ListTagByPageResponse.PageInfo.TotalPage"));
		pageInfo.setNextPageToken(_ctx.stringValue("ListTagByPageResponse.PageInfo.NextPageToken"));
		listTagByPageResponse.setPageInfo(pageInfo);

		List<OamMutexTagResult> data = new ArrayList<OamMutexTagResult>();
		for (int i = 0; i < _ctx.lengthValue("ListTagByPageResponse.Data.Length"); i++) {
			OamMutexTagResult oamMutexTagResult = new OamMutexTagResult();
			oamMutexTagResult.setTagId(_ctx.stringValue("ListTagByPageResponse.Data["+ i +"].TagId"));
			oamMutexTagResult.setDescription(_ctx.stringValue("ListTagByPageResponse.Data["+ i +"].Description"));
			oamMutexTagResult.setName(_ctx.stringValue("ListTagByPageResponse.Data["+ i +"].Name"));
			oamMutexTagResult.setGmtCreated(_ctx.stringValue("ListTagByPageResponse.Data["+ i +"].GmtCreated"));
			oamMutexTagResult.setGmtModified(_ctx.stringValue("ListTagByPageResponse.Data["+ i +"].GmtModified"));
			oamMutexTagResult.setUserId(_ctx.stringValue("ListTagByPageResponse.Data["+ i +"].UserId"));
			oamMutexTagResult.setUserModified(_ctx.stringValue("ListTagByPageResponse.Data["+ i +"].UserModified"));

			data.add(oamMutexTagResult);
		}
		listTagByPageResponse.setData(data);
	 
	 	return listTagByPageResponse;
	}
}