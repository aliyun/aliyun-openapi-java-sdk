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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeBoardSnapshotResponse;
import com.aliyuncs.live.model.v20161101.DescribeBoardSnapshotResponse.Snapshot;
import com.aliyuncs.live.model.v20161101.DescribeBoardSnapshotResponse.Snapshot.Board;
import com.aliyuncs.live.model.v20161101.DescribeBoardSnapshotResponse.Snapshot.Board.Config;
import com.aliyuncs.live.model.v20161101.DescribeBoardSnapshotResponse.Snapshot.Board.Page;
import com.aliyuncs.live.model.v20161101.DescribeBoardSnapshotResponse.Snapshot.Board.Page.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBoardSnapshotResponseUnmarshaller {

	public static DescribeBoardSnapshotResponse unmarshall(DescribeBoardSnapshotResponse describeBoardSnapshotResponse, UnmarshallerContext context) {
		
		describeBoardSnapshotResponse.setRequestId(context.stringValue("DescribeBoardSnapshotResponse.RequestId"));

		Snapshot snapshot = new Snapshot();

		Board board = new Board();
		board.setBoardId(context.stringValue("DescribeBoardSnapshotResponse.Snapshot.Board.BoardId"));
		board.setAppUid(context.stringValue("DescribeBoardSnapshotResponse.Snapshot.Board.AppUid"));
		board.setEventTimestamp(context.longValue("DescribeBoardSnapshotResponse.Snapshot.Board.EventTimestamp"));
		board.setCreateTimestamp(context.longValue("DescribeBoardSnapshotResponse.Snapshot.Board.CreateTimestamp"));
		board.setUpdateTimestamp(context.longValue("DescribeBoardSnapshotResponse.Snapshot.Board.UpdateTimestamp"));

		List<Page> pages = new ArrayList<Page>();
		for (int i = 0; i < context.lengthValue("DescribeBoardSnapshotResponse.Snapshot.Board.Pages.Length"); i++) {
			Page page = new Page();
			page.setPageIndex(context.integerValue("DescribeBoardSnapshotResponse.Snapshot.Board.Pages["+ i +"].PageIndex"));

			List<Element> elements = new ArrayList<Element>();
			for (int j = 0; j < context.lengthValue("DescribeBoardSnapshotResponse.Snapshot.Board.Pages["+ i +"].Elements.Length"); j++) {
				Element element = new Element();
				element.setElementIndex(context.stringValue("DescribeBoardSnapshotResponse.Snapshot.Board.Pages["+ i +"].Elements["+ j +"].ElementIndex"));
				element.setOwnerId(context.stringValue("DescribeBoardSnapshotResponse.Snapshot.Board.Pages["+ i +"].Elements["+ j +"].OwnerId"));
				element.setElementType(context.integerValue("DescribeBoardSnapshotResponse.Snapshot.Board.Pages["+ i +"].Elements["+ j +"].ElementType"));
				element.setUpdateTimestamp(context.longValue("DescribeBoardSnapshotResponse.Snapshot.Board.Pages["+ i +"].Elements["+ j +"].UpdateTimestamp"));
				element.setData(context.stringValue("DescribeBoardSnapshotResponse.Snapshot.Board.Pages["+ i +"].Elements["+ j +"].Data"));

				elements.add(element);
			}
			page.setElements(elements);

			pages.add(page);
		}
		board.setPages(pages);

		List<Config> configs = new ArrayList<Config>();
		for (int i = 0; i < context.lengthValue("DescribeBoardSnapshotResponse.Snapshot.Board.Configs.Length"); i++) {
			Config config = new Config();
			config.setAppUid(context.stringValue("DescribeBoardSnapshotResponse.Snapshot.Board.Configs["+ i +"].AppUid"));
			config.setData(context.stringValue("DescribeBoardSnapshotResponse.Snapshot.Board.Configs["+ i +"].Data"));

			configs.add(config);
		}
		board.setConfigs(configs);
		snapshot.setBoard(board);
		describeBoardSnapshotResponse.setSnapshot(snapshot);
	 
	 	return describeBoardSnapshotResponse;
	}
}