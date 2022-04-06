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

import com.aliyuncs.live.model.v20161101.DescribeForbidPushStreamRoomListResponse;
import com.aliyuncs.live.model.v20161101.DescribeForbidPushStreamRoomListResponse.Room;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeForbidPushStreamRoomListResponseUnmarshaller {

	public static DescribeForbidPushStreamRoomListResponse unmarshall(DescribeForbidPushStreamRoomListResponse describeForbidPushStreamRoomListResponse, UnmarshallerContext _ctx) {
		
		describeForbidPushStreamRoomListResponse.setRequestId(_ctx.stringValue("DescribeForbidPushStreamRoomListResponse.RequestId"));
		describeForbidPushStreamRoomListResponse.setTotalPage(_ctx.integerValue("DescribeForbidPushStreamRoomListResponse.TotalPage"));
		describeForbidPushStreamRoomListResponse.setTotalNum(_ctx.integerValue("DescribeForbidPushStreamRoomListResponse.TotalNum"));

		List<Room> roomList = new ArrayList<Room>();
		for (int i = 0; i < _ctx.lengthValue("DescribeForbidPushStreamRoomListResponse.RoomList.Length"); i++) {
			Room room = new Room();
			room.setOpEndTime(_ctx.stringValue("DescribeForbidPushStreamRoomListResponse.RoomList["+ i +"].OpEndTime"));
			room.setAnchorId(_ctx.stringValue("DescribeForbidPushStreamRoomListResponse.RoomList["+ i +"].AnchorId"));
			room.setOpStartTime(_ctx.stringValue("DescribeForbidPushStreamRoomListResponse.RoomList["+ i +"].OpStartTime"));
			room.setRoomId(_ctx.stringValue("DescribeForbidPushStreamRoomListResponse.RoomList["+ i +"].RoomId"));

			roomList.add(room);
		}
		describeForbidPushStreamRoomListResponse.setRoomList(roomList);
	 
	 	return describeForbidPushStreamRoomListResponse;
	}
}