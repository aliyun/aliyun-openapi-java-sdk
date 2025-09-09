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

import com.aliyuncs.live.model.v20161101.ListRTCLiveRoomsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRTCLiveRoomsResponseUnmarshaller {

	public static ListRTCLiveRoomsResponse unmarshall(ListRTCLiveRoomsResponse listRTCLiveRoomsResponse, UnmarshallerContext _ctx) {
		
		listRTCLiveRoomsResponse.setRequestId(_ctx.stringValue("ListRTCLiveRoomsResponse.RequestId"));
		listRTCLiveRoomsResponse.setTotal(_ctx.integerValue("ListRTCLiveRoomsResponse.Total"));

		List<String> rooms = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListRTCLiveRoomsResponse.Rooms.Length"); i++) {
			rooms.add(_ctx.stringValue("ListRTCLiveRoomsResponse.Rooms["+ i +"]"));
		}
		listRTCLiveRoomsResponse.setRooms(rooms);
	 
	 	return listRTCLiveRoomsResponse;
	}
}