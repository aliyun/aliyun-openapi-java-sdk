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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListTranscodeTemplateGroupResponse;
import com.aliyuncs.vod.model.v20170321.ListTranscodeTemplateGroupResponse.TranscodeTemplateGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTranscodeTemplateGroupResponseUnmarshaller {

	public static ListTranscodeTemplateGroupResponse unmarshall(ListTranscodeTemplateGroupResponse listTranscodeTemplateGroupResponse, UnmarshallerContext _ctx) {
		
		listTranscodeTemplateGroupResponse.setRequestId(_ctx.stringValue("ListTranscodeTemplateGroupResponse.RequestId"));

		List<TranscodeTemplateGroup> transcodeTemplateGroupList = new ArrayList<TranscodeTemplateGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListTranscodeTemplateGroupResponse.TranscodeTemplateGroupList.Length"); i++) {
			TranscodeTemplateGroup transcodeTemplateGroup = new TranscodeTemplateGroup();
			transcodeTemplateGroup.setCreationTime(_ctx.stringValue("ListTranscodeTemplateGroupResponse.TranscodeTemplateGroupList["+ i +"].CreationTime"));
			transcodeTemplateGroup.setModifyTime(_ctx.stringValue("ListTranscodeTemplateGroupResponse.TranscodeTemplateGroupList["+ i +"].ModifyTime"));
			transcodeTemplateGroup.setName(_ctx.stringValue("ListTranscodeTemplateGroupResponse.TranscodeTemplateGroupList["+ i +"].Name"));
			transcodeTemplateGroup.setIsDefault(_ctx.stringValue("ListTranscodeTemplateGroupResponse.TranscodeTemplateGroupList["+ i +"].IsDefault"));
			transcodeTemplateGroup.setLocked(_ctx.stringValue("ListTranscodeTemplateGroupResponse.TranscodeTemplateGroupList["+ i +"].Locked"));
			transcodeTemplateGroup.setTranscodeTemplateGroupId(_ctx.stringValue("ListTranscodeTemplateGroupResponse.TranscodeTemplateGroupList["+ i +"].TranscodeTemplateGroupId"));
			transcodeTemplateGroup.setTranscodeMode(_ctx.stringValue("ListTranscodeTemplateGroupResponse.TranscodeTemplateGroupList["+ i +"].TranscodeMode"));
			transcodeTemplateGroup.setAppId(_ctx.stringValue("ListTranscodeTemplateGroupResponse.TranscodeTemplateGroupList["+ i +"].AppId"));

			transcodeTemplateGroupList.add(transcodeTemplateGroup);
		}
		listTranscodeTemplateGroupResponse.setTranscodeTemplateGroupList(transcodeTemplateGroupList);
	 
	 	return listTranscodeTemplateGroupResponse;
	}
}