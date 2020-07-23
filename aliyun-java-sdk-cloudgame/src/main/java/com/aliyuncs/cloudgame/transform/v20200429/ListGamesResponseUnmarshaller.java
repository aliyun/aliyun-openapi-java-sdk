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

package com.aliyuncs.cloudgame.transform.v20200429;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudgame.model.v20200429.ListGamesResponse;
import com.aliyuncs.cloudgame.model.v20200429.ListGamesResponse.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGamesResponseUnmarshaller {

	public static ListGamesResponse unmarshall(ListGamesResponse listGamesResponse, UnmarshallerContext _ctx) {
		
		listGamesResponse.setRequestId(_ctx.stringValue("ListGamesResponse.RequestId"));
		listGamesResponse.setCount(_ctx.stringValue("ListGamesResponse.Count"));
		listGamesResponse.setPageSize(_ctx.integerValue("ListGamesResponse.PageSize"));
		listGamesResponse.setCurrentPage(_ctx.integerValue("ListGamesResponse.CurrentPage"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListGamesResponse.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setGameId(_ctx.stringValue("ListGamesResponse.DataList["+ i +"].GameId"));
			dataListItem.setGameName(_ctx.stringValue("ListGamesResponse.DataList["+ i +"].GameName"));
			dataListItem.setInstallPath(_ctx.stringValue("ListGamesResponse.DataList["+ i +"].InstallPath"));
			dataListItem.setSavePath(_ctx.stringValue("ListGamesResponse.DataList["+ i +"].SavePath"));
			dataListItem.setResolution(_ctx.stringValue("ListGamesResponse.DataList["+ i +"].Resolution"));
			dataListItem.setFrameRate(_ctx.stringValue("ListGamesResponse.DataList["+ i +"].FrameRate"));
			dataListItem.setInputType(_ctx.stringValue("ListGamesResponse.DataList["+ i +"].InputType"));
			dataListItem.setDevice(_ctx.stringValue("ListGamesResponse.DataList["+ i +"].Device"));
			dataListItem.setStatus(_ctx.stringValue("ListGamesResponse.DataList["+ i +"].Status"));
			dataListItem.setCurVersion(_ctx.stringValue("ListGamesResponse.DataList["+ i +"].CurVersion"));

			dataList.add(dataListItem);
		}
		listGamesResponse.setDataList(dataList);
	 
	 	return listGamesResponse;
	}
}