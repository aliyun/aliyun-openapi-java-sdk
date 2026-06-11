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

package com.aliyuncs.airegistry.transform.v20260317;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airegistry.model.v20260317.ListSkillsResponse;
import com.aliyuncs.airegistry.model.v20260317.ListSkillsResponse.Data;
import com.aliyuncs.airegistry.model.v20260317.ListSkillsResponse.Data.PageItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillsResponseUnmarshaller {

	public static ListSkillsResponse unmarshall(ListSkillsResponse listSkillsResponse, UnmarshallerContext _ctx) {
		
		listSkillsResponse.setRequestId(_ctx.stringValue("ListSkillsResponse.RequestId"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListSkillsResponse.Data.TotalCount"));
		data.setPageNumber(_ctx.integerValue("ListSkillsResponse.Data.PageNumber"));
		data.setPagesAvailable(_ctx.integerValue("ListSkillsResponse.Data.PagesAvailable"));

		List<PageItem> pageItems = new ArrayList<PageItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSkillsResponse.Data.PageItems.Length"); i++) {
			PageItem pageItem = new PageItem();
			pageItem.setUpdateTime(_ctx.longValue("ListSkillsResponse.Data.PageItems["+ i +"].UpdateTime"));
			pageItem.setEnable(_ctx.booleanValue("ListSkillsResponse.Data.PageItems["+ i +"].Enable"));
			pageItem.setBizTags(_ctx.stringValue("ListSkillsResponse.Data.PageItems["+ i +"].BizTags"));
			pageItem.setFrom(_ctx.stringValue("ListSkillsResponse.Data.PageItems["+ i +"].From"));
			pageItem.setScope(_ctx.stringValue("ListSkillsResponse.Data.PageItems["+ i +"].Scope"));
			pageItem.setLabels(_ctx.mapValue("ListSkillsResponse.Data.PageItems["+ i +"].Labels"));
			pageItem.setEditingVersion(_ctx.stringValue("ListSkillsResponse.Data.PageItems["+ i +"].EditingVersion"));
			pageItem.setReviewingVersion(_ctx.stringValue("ListSkillsResponse.Data.PageItems["+ i +"].ReviewingVersion"));
			pageItem.setOnlineCnt(_ctx.integerValue("ListSkillsResponse.Data.PageItems["+ i +"].OnlineCnt"));
			pageItem.setDownloadCount(_ctx.longValue("ListSkillsResponse.Data.PageItems["+ i +"].DownloadCount"));
			pageItem.setNamespaceId(_ctx.stringValue("ListSkillsResponse.Data.PageItems["+ i +"].NamespaceId"));
			pageItem.setName(_ctx.stringValue("ListSkillsResponse.Data.PageItems["+ i +"].Name"));
			pageItem.setDescription(_ctx.stringValue("ListSkillsResponse.Data.PageItems["+ i +"].Description"));
			pageItem.setOwner(_ctx.stringValue("ListSkillsResponse.Data.PageItems["+ i +"].Owner"));
			pageItem.setWriteable(_ctx.booleanValue("ListSkillsResponse.Data.PageItems["+ i +"].Writeable"));

			pageItems.add(pageItem);
		}
		data.setPageItems(pageItems);
		listSkillsResponse.setData(data);
	 
	 	return listSkillsResponse;
	}
}