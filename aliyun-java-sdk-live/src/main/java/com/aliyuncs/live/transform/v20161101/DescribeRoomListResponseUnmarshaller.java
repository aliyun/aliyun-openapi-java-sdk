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

import com.aliyuncs.live.model.v20161101.DescribeRoomListResponse;
import com.aliyuncs.live.model.v20161101.DescribeRoomListResponse.Room;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRoomListResponseUnmarshaller {

	public static DescribeRoomListResponse unmarshall(DescribeRoomListResponse describeRoomListResponse, UnmarshallerContext _ctx) {
		
		describeRoomListResponse.setRequestId(_ctx.stringValue("DescribeRoomListResponse.RequestId"));
		describeRoomListResponse.setTotalPage(_ctx.integerValue("DescribeRoomListResponse.TotalPage"));
		describeRoomListResponse.setTotalNum(_ctx.integerValue("DescribeRoomListResponse.TotalNum"));

		List<Room> roomList = new ArrayList<Room>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRoomListResponse.RoomList.Length"); i++) {
			Room room = new Room();
			room.setForbidStream(_ctx.stringValue("DescribeRoomListResponse.RoomList["+ i +"].ForbidStream"));
			room.setAnchorId(_ctx.stringValue("DescribeRoomListResponse.RoomList["+ i +"].AnchorId"));
			room.setRoomId(_ctx.stringValue("DescribeRoomListResponse.RoomList["+ i +"].RoomId"));
			room.setCreateTime(_ctx.stringValue("DescribeRoomListResponse.RoomList["+ i +"].CreateTime"));
			room.setRoomStatus(_ctx.integerValue("DescribeRoomListResponse.RoomList["+ i +"].RoomStatus"));

			roomList.add(room);
		}
		describeRoomListResponse.setRoomList(roomList);
	 
	 	return describeRoomListResponse;
	}
}