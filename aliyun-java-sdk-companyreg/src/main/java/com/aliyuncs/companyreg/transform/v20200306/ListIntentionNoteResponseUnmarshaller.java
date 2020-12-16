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

package com.aliyuncs.companyreg.transform.v20200306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20200306.ListIntentionNoteResponse;
import com.aliyuncs.companyreg.model.v20200306.ListIntentionNoteResponse.Note;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIntentionNoteResponseUnmarshaller {

	public static ListIntentionNoteResponse unmarshall(ListIntentionNoteResponse listIntentionNoteResponse, UnmarshallerContext _ctx) {
		
		listIntentionNoteResponse.setRequestId(_ctx.stringValue("ListIntentionNoteResponse.RequestId"));
		listIntentionNoteResponse.setTotalItemNum(_ctx.integerValue("ListIntentionNoteResponse.TotalItemNum"));
		listIntentionNoteResponse.setCurrentPageNum(_ctx.integerValue("ListIntentionNoteResponse.CurrentPageNum"));
		listIntentionNoteResponse.setPageSize(_ctx.integerValue("ListIntentionNoteResponse.PageSize"));
		listIntentionNoteResponse.setTotalPageNum(_ctx.integerValue("ListIntentionNoteResponse.TotalPageNum"));

		List<Note> data = new ArrayList<Note>();
		for (int i = 0; i < _ctx.lengthValue("ListIntentionNoteResponse.Data.Length"); i++) {
			Note note = new Note();
			note.setIntentionBizId(_ctx.stringValue("ListIntentionNoteResponse.Data["+ i +"].IntentionBizId"));
			note.setNote(_ctx.stringValue("ListIntentionNoteResponse.Data["+ i +"].Note"));
			note.setSource(_ctx.integerValue("ListIntentionNoteResponse.Data["+ i +"].Source"));
			note.setCreateTime(_ctx.stringValue("ListIntentionNoteResponse.Data["+ i +"].CreateTime"));
			note.setType(_ctx.stringValue("ListIntentionNoteResponse.Data["+ i +"].Type"));

			data.add(note);
		}
		listIntentionNoteResponse.setData(data);
	 
	 	return listIntentionNoteResponse;
	}
}