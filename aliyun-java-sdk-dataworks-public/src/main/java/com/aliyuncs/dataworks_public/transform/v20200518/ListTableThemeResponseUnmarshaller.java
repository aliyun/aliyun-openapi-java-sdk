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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListTableThemeResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListTableThemeResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListTableThemeResponse.Data.ThemeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTableThemeResponseUnmarshaller {

	public static ListTableThemeResponse unmarshall(ListTableThemeResponse listTableThemeResponse, UnmarshallerContext _ctx) {
		
		listTableThemeResponse.setRequestId(_ctx.stringValue("ListTableThemeResponse.RequestId"));
		listTableThemeResponse.setHttpStatusCode(_ctx.integerValue("ListTableThemeResponse.HttpStatusCode"));
		listTableThemeResponse.setErrorMessage(_ctx.stringValue("ListTableThemeResponse.ErrorMessage"));
		listTableThemeResponse.setSuccess(_ctx.booleanValue("ListTableThemeResponse.Success"));
		listTableThemeResponse.setErrorCode(_ctx.stringValue("ListTableThemeResponse.ErrorCode"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListTableThemeResponse.Data.TotalCount"));

		List<ThemeListItem> themeList = new ArrayList<ThemeListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTableThemeResponse.Data.ThemeList.Length"); i++) {
			ThemeListItem themeListItem = new ThemeListItem();
			themeListItem.setCreateTimeStamp(_ctx.longValue("ListTableThemeResponse.Data.ThemeList["+ i +"].CreateTimeStamp"));
			themeListItem.setParentId(_ctx.longValue("ListTableThemeResponse.Data.ThemeList["+ i +"].ParentId"));
			themeListItem.setThemeId(_ctx.longValue("ListTableThemeResponse.Data.ThemeList["+ i +"].ThemeId"));
			themeListItem.setProjectId(_ctx.longValue("ListTableThemeResponse.Data.ThemeList["+ i +"].ProjectId"));
			themeListItem.setName(_ctx.stringValue("ListTableThemeResponse.Data.ThemeList["+ i +"].Name"));
			themeListItem.setLevel(_ctx.integerValue("ListTableThemeResponse.Data.ThemeList["+ i +"].Level"));
			themeListItem.setCreator(_ctx.stringValue("ListTableThemeResponse.Data.ThemeList["+ i +"].Creator"));

			themeList.add(themeListItem);
		}
		data.setThemeList(themeList);
		listTableThemeResponse.setData(data);
	 
	 	return listTableThemeResponse;
	}
}