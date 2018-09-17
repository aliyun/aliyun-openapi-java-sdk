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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeForbidPushStreamRoomListResponseUnmarshaller {

	public static DescribeForbidPushStreamRoomListResponse unmarshall(DescribeForbidPushStreamRoomListResponse describeForbidPushStreamRoomListResponse, UnmarshallerContext context) {
		
		describeForbidPushStreamRoomListResponse.setRequestId(context.stringValue("DescribeForbidPushStreamRoomListResponse.RequestId"));
		describeForbidPushStreamRoomListResponse.setTotalNum(context.integerValue("DescribeForbidPushStreamRoomListResponse.TotalNum"));
		describeForbidPushStreamRoomListResponse.setTotalPage(context.integerValue("DescribeForbidPushStreamRoomListResponse.TotalPage"));

		List<Room> roomList = new ArrayList<Room>();
		for (int i = 0; i < context.lengthValue("DescribeForbidPushStreamRoomListResponse.RoomList.Length"); i++) {
			Room room = new Room();
			room.setRoomId(context.stringValue("DescribeForbidPushStreamRoomListResponse.RoomList["+ i +"].RoomId"));
			room.setAnchorId(context.stringValue("DescribeForbidPushStreamRoomListResponse.RoomList["+ i +"].AnchorId"));
			room.setOpStartTime(context.stringValue("DescribeForbidPushStreamRoomListResponse.RoomList["+ i +"].OpStartTime"));
			room.setOpEndTime(context.stringValue("DescribeForbidPushStreamRoomListResponse.RoomList["+ i +"].OpEndTime"));

			roomList.add(room);
		}
		describeForbidPushStreamRoomListResponse.setRoomList(roomList);
	 
	 	return describeForbidPushStreamRoomListResponse;
	}
}