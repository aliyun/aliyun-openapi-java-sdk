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

import com.aliyuncs.vcs.model.v20200515.GetPersonDetailResponse;
import com.aliyuncs.vcs.model.v20200515.GetPersonDetailResponse.Data;
import com.aliyuncs.vcs.model.v20200515.GetPersonDetailResponse.Data.TagListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPersonDetailResponseUnmarshaller {

	public static GetPersonDetailResponse unmarshall(GetPersonDetailResponse getPersonDetailResponse, UnmarshallerContext _ctx) {
		
		getPersonDetailResponse.setRequestId(_ctx.stringValue("GetPersonDetailResponse.RequestId"));
		getPersonDetailResponse.setMessage(_ctx.stringValue("GetPersonDetailResponse.Message"));
		getPersonDetailResponse.setCode(_ctx.stringValue("GetPersonDetailResponse.Code"));

		Data data = new Data();
		data.setPicUrl(_ctx.stringValue("GetPersonDetailResponse.Data.PicUrl"));
		data.setPersonId(_ctx.stringValue("GetPersonDetailResponse.Data.PersonId"));

		List<TagListItem> tagList = new ArrayList<TagListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPersonDetailResponse.Data.TagList.Length"); i++) {
			TagListItem tagListItem = new TagListItem();
			tagListItem.setTagValueId(_ctx.stringValue("GetPersonDetailResponse.Data.TagList["+ i +"].TagValueId"));
			tagListItem.setTagName(_ctx.stringValue("GetPersonDetailResponse.Data.TagList["+ i +"].TagName"));
			tagListItem.setTagCode(_ctx.stringValue("GetPersonDetailResponse.Data.TagList["+ i +"].TagCode"));
			tagListItem.setTagValue(_ctx.stringValue("GetPersonDetailResponse.Data.TagList["+ i +"].TagValue"));

			tagList.add(tagListItem);
		}
		data.setTagList(tagList);
		getPersonDetailResponse.setData(data);
	 
	 	return getPersonDetailResponse;
	}
}