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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.GetVideoModerationResultResponse;
import com.aliyuncs.imm.model.v20200930.GetVideoModerationResultResponse.ModerationResult;
import com.aliyuncs.imm.model.v20200930.GetVideoModerationResultResponse.ModerationResult.Frames;
import com.aliyuncs.imm.model.v20200930.GetVideoModerationResultResponse.ModerationResult.Frames.BlockFramesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVideoModerationResultResponseUnmarshaller {

	public static GetVideoModerationResultResponse unmarshall(GetVideoModerationResultResponse getVideoModerationResultResponse, UnmarshallerContext _ctx) {
		
		getVideoModerationResultResponse.setRequestId(_ctx.stringValue("GetVideoModerationResultResponse.RequestId"));
		getVideoModerationResultResponse.setProjectName(_ctx.stringValue("GetVideoModerationResultResponse.ProjectName"));
		getVideoModerationResultResponse.setEventId(_ctx.stringValue("GetVideoModerationResultResponse.EventId"));
		getVideoModerationResultResponse.setStatus(_ctx.stringValue("GetVideoModerationResultResponse.Status"));
		getVideoModerationResultResponse.setCode(_ctx.stringValue("GetVideoModerationResultResponse.Code"));
		getVideoModerationResultResponse.setMessage(_ctx.stringValue("GetVideoModerationResultResponse.Message"));
		getVideoModerationResultResponse.setStartTime(_ctx.stringValue("GetVideoModerationResultResponse.StartTime"));
		getVideoModerationResultResponse.setEndTime(_ctx.stringValue("GetVideoModerationResultResponse.EndTime"));
		getVideoModerationResultResponse.setUserData(_ctx.stringValue("GetVideoModerationResultResponse.UserData"));
		getVideoModerationResultResponse.setTaskType(_ctx.stringValue("GetVideoModerationResultResponse.TaskType"));
		getVideoModerationResultResponse.setTaskId(_ctx.stringValue("GetVideoModerationResultResponse.TaskId"));

		ModerationResult moderationResult = new ModerationResult();
		moderationResult.setURI(_ctx.stringValue("GetVideoModerationResultResponse.ModerationResult.URI"));
		moderationResult.setSuggestion(_ctx.stringValue("GetVideoModerationResultResponse.ModerationResult.Suggestion"));

		List<String> categories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetVideoModerationResultResponse.ModerationResult.Categories.Length"); i++) {
			categories.add(_ctx.stringValue("GetVideoModerationResultResponse.ModerationResult.Categories["+ i +"]"));
		}
		moderationResult.setCategories(categories);

		Frames frames = new Frames();
		frames.setTotalCount(_ctx.integerValue("GetVideoModerationResultResponse.ModerationResult.Frames.TotalCount"));

		List<BlockFramesItem> blockFrames = new ArrayList<BlockFramesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetVideoModerationResultResponse.ModerationResult.Frames.BlockFrames.Length"); i++) {
			BlockFramesItem blockFramesItem = new BlockFramesItem();
			blockFramesItem.setRate(_ctx.doubleValue("GetVideoModerationResultResponse.ModerationResult.Frames.BlockFrames["+ i +"].Rate"));
			blockFramesItem.setOffset(_ctx.integerValue("GetVideoModerationResultResponse.ModerationResult.Frames.BlockFrames["+ i +"].Offset"));
			blockFramesItem.setLabel(_ctx.stringValue("GetVideoModerationResultResponse.ModerationResult.Frames.BlockFrames["+ i +"].Label"));

			blockFrames.add(blockFramesItem);
		}
		frames.setBlockFrames(blockFrames);
		moderationResult.setFrames(frames);
		getVideoModerationResultResponse.setModerationResult(moderationResult);
	 
	 	return getVideoModerationResultResponse;
	}
}