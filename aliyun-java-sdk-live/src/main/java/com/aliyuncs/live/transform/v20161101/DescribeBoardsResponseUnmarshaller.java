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

import com.aliyuncs.live.model.v20161101.DescribeBoardsResponse;
import com.aliyuncs.live.model.v20161101.DescribeBoardsResponse.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBoardsResponseUnmarshaller {

	public static DescribeBoardsResponse unmarshall(DescribeBoardsResponse describeBoardsResponse, UnmarshallerContext _ctx) {
		
		describeBoardsResponse.setRequestId(_ctx.stringValue("DescribeBoardsResponse.RequestId"));

		List<Event> boards = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBoardsResponse.Boards.Length"); i++) {
			Event event = new Event();
			event.setBoardId(_ctx.stringValue("DescribeBoardsResponse.Boards["+ i +"].BoardId"));
			event.setTopic(_ctx.stringValue("DescribeBoardsResponse.Boards["+ i +"].Topic"));
			event.setState(_ctx.integerValue("DescribeBoardsResponse.Boards["+ i +"].State"));
			event.setUserId(_ctx.stringValue("DescribeBoardsResponse.Boards["+ i +"].UserId"));

			boards.add(event);
		}
		describeBoardsResponse.setBoards(boards);
	 
	 	return describeBoardsResponse;
	}
}