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

import com.aliyuncs.vcs.model.v20200515.ListPersonsResponse;
import com.aliyuncs.vcs.model.v20200515.ListPersonsResponse.Data;
import com.aliyuncs.vcs.model.v20200515.ListPersonsResponse.Data.RecordsItem;
import com.aliyuncs.vcs.model.v20200515.ListPersonsResponse.Data.RecordsItem.TagListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPersonsResponseUnmarshaller {

	public static ListPersonsResponse unmarshall(ListPersonsResponse listPersonsResponse, UnmarshallerContext _ctx) {
		
		listPersonsResponse.setRequestId(_ctx.stringValue("ListPersonsResponse.RequestId"));
		listPersonsResponse.setMessage(_ctx.stringValue("ListPersonsResponse.Message"));
		listPersonsResponse.setCode(_ctx.stringValue("ListPersonsResponse.Code"));

		Data data = new Data();
		data.setPageNo(_ctx.stringValue("ListPersonsResponse.Data.PageNo"));
		data.setTotalPage(_ctx.stringValue("ListPersonsResponse.Data.TotalPage"));
		data.setPageSize(_ctx.stringValue("ListPersonsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.stringValue("ListPersonsResponse.Data.TotalCount"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPersonsResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setPicUrl(_ctx.stringValue("ListPersonsResponse.Data.Records["+ i +"].PicUrl"));
			recordsItem.setFirstAppearTime(_ctx.stringValue("ListPersonsResponse.Data.Records["+ i +"].FirstAppearTime"));
			recordsItem.setPersonId(_ctx.stringValue("ListPersonsResponse.Data.Records["+ i +"].PersonId"));

			List<TagListItem> tagList = new ArrayList<TagListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListPersonsResponse.Data.Records["+ i +"].TagList.Length"); j++) {
				TagListItem tagListItem = new TagListItem();
				tagListItem.setTagValueId(_ctx.stringValue("ListPersonsResponse.Data.Records["+ i +"].TagList["+ j +"].TagValueId"));
				tagListItem.setTagName(_ctx.stringValue("ListPersonsResponse.Data.Records["+ i +"].TagList["+ j +"].TagName"));
				tagListItem.setTagCode(_ctx.stringValue("ListPersonsResponse.Data.Records["+ i +"].TagList["+ j +"].TagCode"));
				tagListItem.setTagValue(_ctx.stringValue("ListPersonsResponse.Data.Records["+ i +"].TagList["+ j +"].TagValue"));

				tagList.add(tagListItem);
			}
			recordsItem.setTagList(tagList);

			records.add(recordsItem);
		}
		data.setRecords(records);
		listPersonsResponse.setData(data);
	 
	 	return listPersonsResponse;
	}
}