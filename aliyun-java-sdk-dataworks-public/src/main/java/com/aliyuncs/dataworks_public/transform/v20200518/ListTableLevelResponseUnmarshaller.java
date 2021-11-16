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

import com.aliyuncs.dataworks_public.model.v20200518.ListTableLevelResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListTableLevelResponse.TableLevelInfo;
import com.aliyuncs.dataworks_public.model.v20200518.ListTableLevelResponse.TableLevelInfo.LevelListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTableLevelResponseUnmarshaller {

	public static ListTableLevelResponse unmarshall(ListTableLevelResponse listTableLevelResponse, UnmarshallerContext _ctx) {
		
		listTableLevelResponse.setRequestId(_ctx.stringValue("ListTableLevelResponse.RequestId"));
		listTableLevelResponse.setErrorCode(_ctx.stringValue("ListTableLevelResponse.ErrorCode"));
		listTableLevelResponse.setErrorMessage(_ctx.stringValue("ListTableLevelResponse.ErrorMessage"));
		listTableLevelResponse.setHttpStatusCode(_ctx.integerValue("ListTableLevelResponse.HttpStatusCode"));
		listTableLevelResponse.setSuccess(_ctx.booleanValue("ListTableLevelResponse.Success"));

		TableLevelInfo tableLevelInfo = new TableLevelInfo();
		tableLevelInfo.setTotalCount(_ctx.longValue("ListTableLevelResponse.TableLevelInfo.TotalCount"));

		List<LevelListItem> levelList = new ArrayList<LevelListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTableLevelResponse.TableLevelInfo.LevelList.Length"); i++) {
			LevelListItem levelListItem = new LevelListItem();
			levelListItem.setLevelId(_ctx.longValue("ListTableLevelResponse.TableLevelInfo.LevelList["+ i +"].LevelId"));
			levelListItem.setName(_ctx.stringValue("ListTableLevelResponse.TableLevelInfo.LevelList["+ i +"].Name"));
			levelListItem.setProjectId(_ctx.longValue("ListTableLevelResponse.TableLevelInfo.LevelList["+ i +"].ProjectId"));
			levelListItem.setLevelType(_ctx.integerValue("ListTableLevelResponse.TableLevelInfo.LevelList["+ i +"].LevelType"));
			levelListItem.setDescription(_ctx.stringValue("ListTableLevelResponse.TableLevelInfo.LevelList["+ i +"].Description"));

			levelList.add(levelListItem);
		}
		tableLevelInfo.setLevelList(levelList);
		listTableLevelResponse.setTableLevelInfo(tableLevelInfo);
	 
	 	return listTableLevelResponse;
	}
}