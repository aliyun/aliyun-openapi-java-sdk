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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListNotesResponse;
import com.aliyuncs.emr.model.v20160408.ListNotesResponse.NoteInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNotesResponseUnmarshaller {

	public static ListNotesResponse unmarshall(ListNotesResponse listNotesResponse, UnmarshallerContext _ctx) {
		
		listNotesResponse.setRequestId(_ctx.stringValue("ListNotesResponse.RequestId"));

		List<NoteInfo> notes = new ArrayList<NoteInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListNotesResponse.Notes.Length"); i++) {
			NoteInfo noteInfo = new NoteInfo();
			noteInfo.setId(_ctx.stringValue("ListNotesResponse.Notes["+ i +"].Id"));
			noteInfo.setName(_ctx.stringValue("ListNotesResponse.Notes["+ i +"].Name"));
			noteInfo.setType(_ctx.stringValue("ListNotesResponse.Notes["+ i +"].Type"));

			notes.add(noteInfo);
		}
		listNotesResponse.setNotes(notes);
	 
	 	return listNotesResponse;
	}
}