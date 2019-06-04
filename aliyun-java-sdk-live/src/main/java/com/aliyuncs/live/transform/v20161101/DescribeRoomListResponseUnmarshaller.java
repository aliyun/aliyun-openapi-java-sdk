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

	public static DescribeRoomListResponse unmarshall(DescribeRoomListResponse describeRoomListResponse, UnmarshallerContext context) {
		
		describeRoomListResponse.setRequestId(context.stringValue("DescribeRoomListResponse.RequestId"));
		describeRoomListResponse.setTotalNum(context.integerValue("DescribeRoomListResponse.TotalNum"));
		describeRoomListResponse.setTotalPage(context.integerValue("DescribeRoomListResponse.TotalPage"));

		List<Room> roomList = new ArrayList<Room>();
		for (int i = 0; i < context.lengthValue("DescribeRoomListResponse.RoomList.Length"); i++) {
			Room room = new Room();
			room.setRoomId(context.stringValue("DescribeRoomListResponse.RoomList["+ i +"].RoomId"));
			room.setAnchorId(context.stringValue("DescribeRoomListResponse.RoomList["+ i +"].AnchorId"));
			room.setRoomStatus(context.integerValue("DescribeRoomListResponse.RoomList["+ i +"].RoomStatus"));
			room.setForbidStream(context.stringValue("DescribeRoomListResponse.RoomList["+ i +"].ForbidStream"));
			room.setCreateTime(context.stringValue("DescribeRoomListResponse.RoomList["+ i +"].CreateTime"));

			roomList.add(room);
		}
		describeRoomListResponse.setRoomList(roomList);
	 
	 	return describeRoomListResponse;
	}
}