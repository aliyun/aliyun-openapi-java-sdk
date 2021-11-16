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

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableThemeLevelResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableThemeLevelResponse.Entity;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableThemeLevelResponse.Entity.LevelItem;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableThemeLevelResponse.Entity.ThemeItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaTableThemeLevelResponseUnmarshaller {

	public static GetMetaTableThemeLevelResponse unmarshall(GetMetaTableThemeLevelResponse getMetaTableThemeLevelResponse, UnmarshallerContext _ctx) {
		
		getMetaTableThemeLevelResponse.setRequestId(_ctx.stringValue("GetMetaTableThemeLevelResponse.RequestId"));
		getMetaTableThemeLevelResponse.setErrorCode(_ctx.stringValue("GetMetaTableThemeLevelResponse.ErrorCode"));
		getMetaTableThemeLevelResponse.setErrorMessage(_ctx.stringValue("GetMetaTableThemeLevelResponse.ErrorMessage"));
		getMetaTableThemeLevelResponse.setHttpStatusCode(_ctx.integerValue("GetMetaTableThemeLevelResponse.HttpStatusCode"));
		getMetaTableThemeLevelResponse.setSuccess(_ctx.booleanValue("GetMetaTableThemeLevelResponse.Success"));

		Entity entity = new Entity();

		List<ThemeItem> theme = new ArrayList<ThemeItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaTableThemeLevelResponse.Entity.Theme.Length"); i++) {
			ThemeItem themeItem = new ThemeItem();
			themeItem.setThemeId(_ctx.longValue("GetMetaTableThemeLevelResponse.Entity.Theme["+ i +"].ThemeId"));
			themeItem.setName(_ctx.stringValue("GetMetaTableThemeLevelResponse.Entity.Theme["+ i +"].Name"));
			themeItem.setLevel(_ctx.integerValue("GetMetaTableThemeLevelResponse.Entity.Theme["+ i +"].Level"));
			themeItem.setParentId(_ctx.longValue("GetMetaTableThemeLevelResponse.Entity.Theme["+ i +"].ParentId"));

			theme.add(themeItem);
		}
		entity.setTheme(theme);

		List<LevelItem> level = new ArrayList<LevelItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaTableThemeLevelResponse.Entity.Level.Length"); i++) {
			LevelItem levelItem = new LevelItem();
			levelItem.setLevelId(_ctx.longValue("GetMetaTableThemeLevelResponse.Entity.Level["+ i +"].LevelId"));
			levelItem.setName(_ctx.stringValue("GetMetaTableThemeLevelResponse.Entity.Level["+ i +"].Name"));
			levelItem.setType(_ctx.integerValue("GetMetaTableThemeLevelResponse.Entity.Level["+ i +"].Type"));
			levelItem.setDescription(_ctx.stringValue("GetMetaTableThemeLevelResponse.Entity.Level["+ i +"].Description"));

			level.add(levelItem);
		}
		entity.setLevel(level);
		getMetaTableThemeLevelResponse.setEntity(entity);
	 
	 	return getMetaTableThemeLevelResponse;
	}
}