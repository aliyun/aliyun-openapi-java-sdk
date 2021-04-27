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

import com.aliyuncs.live.model.v20161101.ListPlaylistResponse;
import com.aliyuncs.live.model.v20161101.ListPlaylistResponse.ProgramInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPlaylistResponseUnmarshaller {

	public static ListPlaylistResponse unmarshall(ListPlaylistResponse listPlaylistResponse, UnmarshallerContext _ctx) {
		
		listPlaylistResponse.setRequestId(_ctx.stringValue("ListPlaylistResponse.RequestId"));
		listPlaylistResponse.setTotal(_ctx.integerValue("ListPlaylistResponse.Total"));

		List<ProgramInfo> programList = new ArrayList<ProgramInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListPlaylistResponse.ProgramList.Length"); i++) {
			ProgramInfo programInfo = new ProgramInfo();
			programInfo.setProgramId(_ctx.stringValue("ListPlaylistResponse.ProgramList["+ i +"].ProgramId"));
			programInfo.setProgramName(_ctx.stringValue("ListPlaylistResponse.ProgramList["+ i +"].ProgramName"));
			programInfo.setCasterId(_ctx.stringValue("ListPlaylistResponse.ProgramList["+ i +"].CasterId"));
			programInfo.setDomainName(_ctx.stringValue("ListPlaylistResponse.ProgramList["+ i +"].DomainName"));
			programInfo.setRepeatNumber(_ctx.integerValue("ListPlaylistResponse.ProgramList["+ i +"].RepeatNumber"));
			programInfo.setStatus(_ctx.integerValue("ListPlaylistResponse.ProgramList["+ i +"].Status"));

			programList.add(programInfo);
		}
		listPlaylistResponse.setProgramList(programList);
	 
	 	return listPlaylistResponse;
	}
}