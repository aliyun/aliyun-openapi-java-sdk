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

import com.aliyuncs.imm.model.v20200930.GetImageModerationResultResponse;
import com.aliyuncs.imm.model.v20200930.GetImageModerationResultResponse.ModerationResult;
import com.aliyuncs.imm.model.v20200930.GetImageModerationResultResponse.ModerationResult.Frames;
import com.aliyuncs.imm.model.v20200930.GetImageModerationResultResponse.ModerationResult.Frames.BlockFramesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageModerationResultResponseUnmarshaller {

	public static GetImageModerationResultResponse unmarshall(GetImageModerationResultResponse getImageModerationResultResponse, UnmarshallerContext _ctx) {
		
		getImageModerationResultResponse.setRequestId(_ctx.stringValue("GetImageModerationResultResponse.RequestId"));
		getImageModerationResultResponse.setProjectName(_ctx.stringValue("GetImageModerationResultResponse.ProjectName"));
		getImageModerationResultResponse.setEventId(_ctx.stringValue("GetImageModerationResultResponse.EventId"));
		getImageModerationResultResponse.setStatus(_ctx.stringValue("GetImageModerationResultResponse.Status"));
		getImageModerationResultResponse.setCode(_ctx.stringValue("GetImageModerationResultResponse.Code"));
		getImageModerationResultResponse.setMessage(_ctx.stringValue("GetImageModerationResultResponse.Message"));
		getImageModerationResultResponse.setStartTime(_ctx.stringValue("GetImageModerationResultResponse.StartTime"));
		getImageModerationResultResponse.setEndTime(_ctx.stringValue("GetImageModerationResultResponse.EndTime"));
		getImageModerationResultResponse.setUserData(_ctx.stringValue("GetImageModerationResultResponse.UserData"));
		getImageModerationResultResponse.setTaskType(_ctx.stringValue("GetImageModerationResultResponse.TaskType"));
		getImageModerationResultResponse.setTaskId(_ctx.stringValue("GetImageModerationResultResponse.TaskId"));

		ModerationResult moderationResult = new ModerationResult();
		moderationResult.setURI(_ctx.stringValue("GetImageModerationResultResponse.ModerationResult.URI"));
		moderationResult.setSuggestion(_ctx.stringValue("GetImageModerationResultResponse.ModerationResult.Suggestion"));

		List<String> categories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetImageModerationResultResponse.ModerationResult.Categories.Length"); i++) {
			categories.add(_ctx.stringValue("GetImageModerationResultResponse.ModerationResult.Categories["+ i +"]"));
		}
		moderationResult.setCategories(categories);

		Frames frames = new Frames();
		frames.setTotalCount(_ctx.integerValue("GetImageModerationResultResponse.ModerationResult.Frames.TotalCount"));

		List<BlockFramesItem> blockFrames = new ArrayList<BlockFramesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetImageModerationResultResponse.ModerationResult.Frames.BlockFrames.Length"); i++) {
			BlockFramesItem blockFramesItem = new BlockFramesItem();
			blockFramesItem.setRate(_ctx.doubleValue("GetImageModerationResultResponse.ModerationResult.Frames.BlockFrames["+ i +"].Rate"));
			blockFramesItem.setOffset(_ctx.integerValue("GetImageModerationResultResponse.ModerationResult.Frames.BlockFrames["+ i +"].Offset"));
			blockFramesItem.setLabel(_ctx.stringValue("GetImageModerationResultResponse.ModerationResult.Frames.BlockFrames["+ i +"].Label"));

			blockFrames.add(blockFramesItem);
		}
		frames.setBlockFrames(blockFrames);
		moderationResult.setFrames(frames);
		getImageModerationResultResponse.setModerationResult(moderationResult);
	 
	 	return getImageModerationResultResponse;
	}
}