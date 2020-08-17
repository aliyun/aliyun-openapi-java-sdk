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

package com.aliyuncs.ivpd.transform.v20190625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivpd.model.v20190625.HighlightGameVideoResponse;
import com.aliyuncs.ivpd.model.v20190625.HighlightGameVideoResponse.Data;
import com.aliyuncs.ivpd.model.v20190625.HighlightGameVideoResponse.Data.GameListItem;
import com.aliyuncs.ivpd.model.v20190625.HighlightGameVideoResponse.Data.HighlightListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class HighlightGameVideoResponseUnmarshaller {

	public static HighlightGameVideoResponse unmarshall(HighlightGameVideoResponse highlightGameVideoResponse, UnmarshallerContext _ctx) {
		
		highlightGameVideoResponse.setRequestId(_ctx.stringValue("HighlightGameVideoResponse.RequestId"));

		Data data = new Data();

		List<GameListItem> gameList = new ArrayList<GameListItem>();
		for (int i = 0; i < _ctx.lengthValue("HighlightGameVideoResponse.Data.GameList.Length"); i++) {
			GameListItem gameListItem = new GameListItem();
			gameListItem.setId(_ctx.stringValue("HighlightGameVideoResponse.Data.GameList["+ i +"].Id"));
			gameListItem.setEnd(_ctx.floatValue("HighlightGameVideoResponse.Data.GameList["+ i +"].End"));
			gameListItem.setStart(_ctx.floatValue("HighlightGameVideoResponse.Data.GameList["+ i +"].Start"));
			gameListItem.setGameInfo(_ctx.mapValue("HighlightGameVideoResponse.Data.GameList["+ i +"].GameInfo"));

			gameList.add(gameListItem);
		}
		data.setGameList(gameList);

		List<HighlightListItem> highlightList = new ArrayList<HighlightListItem>();
		for (int i = 0; i < _ctx.lengthValue("HighlightGameVideoResponse.Data.HighlightList.Length"); i++) {
			HighlightListItem highlightListItem = new HighlightListItem();
			highlightListItem.setStart(_ctx.floatValue("HighlightGameVideoResponse.Data.HighlightList["+ i +"].Start"));
			highlightListItem.setEnd(_ctx.floatValue("HighlightGameVideoResponse.Data.HighlightList["+ i +"].End"));

			highlightList.add(highlightListItem);
		}
		data.setHighlightList(highlightList);
		highlightGameVideoResponse.setData(data);
	 
	 	return highlightGameVideoResponse;
	}
}