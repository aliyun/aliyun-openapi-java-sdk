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

import com.aliyuncs.vcs.model.v20200515.GetPersonListResponse;
import com.aliyuncs.vcs.model.v20200515.GetPersonListResponse.Data;
import com.aliyuncs.vcs.model.v20200515.GetPersonListResponse.Data.RecordsItem;
import com.aliyuncs.vcs.model.v20200515.GetPersonListResponse.Data.RecordsItem.TagListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPersonListResponseUnmarshaller {

	public static GetPersonListResponse unmarshall(GetPersonListResponse getPersonListResponse, UnmarshallerContext _ctx) {
		
		getPersonListResponse.setRequestId(_ctx.stringValue("GetPersonListResponse.RequestId"));
		getPersonListResponse.setCode(_ctx.stringValue("GetPersonListResponse.Code"));
		getPersonListResponse.setMessage(_ctx.stringValue("GetPersonListResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.stringValue("GetPersonListResponse.Data.PageNumber"));
		data.setPageSize(_ctx.stringValue("GetPersonListResponse.Data.PageSize"));
		data.setTotalCount(_ctx.stringValue("GetPersonListResponse.Data.TotalCount"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPersonListResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setFirstAppearTime(_ctx.stringValue("GetPersonListResponse.Data.Records["+ i +"].FirstAppearTime"));
			recordsItem.setPersonId(_ctx.stringValue("GetPersonListResponse.Data.Records["+ i +"].PersonId"));
			recordsItem.setFaceImageUrl(_ctx.stringValue("GetPersonListResponse.Data.Records["+ i +"].FaceImageUrl"));

			List<TagListItem> tagList = new ArrayList<TagListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetPersonListResponse.Data.Records["+ i +"].TagList.Length"); j++) {
				TagListItem tagListItem = new TagListItem();
				tagListItem.setCode(_ctx.stringValue("GetPersonListResponse.Data.Records["+ i +"].TagList["+ j +"].Code"));
				tagListItem.setValue(_ctx.stringValue("GetPersonListResponse.Data.Records["+ i +"].TagList["+ j +"].Value"));
				tagListItem.setTagCodeName(_ctx.stringValue("GetPersonListResponse.Data.Records["+ i +"].TagList["+ j +"].TagCodeName"));
				tagListItem.setTagName(_ctx.stringValue("GetPersonListResponse.Data.Records["+ i +"].TagList["+ j +"].TagName"));

				tagList.add(tagListItem);
			}
			recordsItem.setTagList(tagList);

			records.add(recordsItem);
		}
		data.setRecords(records);
		getPersonListResponse.setData(data);
	 
	 	return getPersonListResponse;
	}
}