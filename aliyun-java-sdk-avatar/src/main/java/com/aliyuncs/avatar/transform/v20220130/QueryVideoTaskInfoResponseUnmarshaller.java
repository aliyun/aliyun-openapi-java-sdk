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

package com.aliyuncs.avatar.transform.v20220130;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.avatar.model.v20220130.QueryVideoTaskInfoResponse;
import com.aliyuncs.avatar.model.v20220130.QueryVideoTaskInfoResponse.Data;
import com.aliyuncs.avatar.model.v20220130.QueryVideoTaskInfoResponse.Data.ListItem;
import com.aliyuncs.avatar.model.v20220130.QueryVideoTaskInfoResponse.Data.ListItem.TaskResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVideoTaskInfoResponseUnmarshaller {

	public static QueryVideoTaskInfoResponse unmarshall(QueryVideoTaskInfoResponse queryVideoTaskInfoResponse, UnmarshallerContext _ctx) {
		
		queryVideoTaskInfoResponse.setRequestId(_ctx.stringValue("QueryVideoTaskInfoResponse.RequestId"));
		queryVideoTaskInfoResponse.setSuccess(_ctx.booleanValue("QueryVideoTaskInfoResponse.Success"));
		queryVideoTaskInfoResponse.setCode(_ctx.stringValue("QueryVideoTaskInfoResponse.Code"));
		queryVideoTaskInfoResponse.setMessage(_ctx.stringValue("QueryVideoTaskInfoResponse.Message"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("QueryVideoTaskInfoResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("QueryVideoTaskInfoResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("QueryVideoTaskInfoResponse.Data.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryVideoTaskInfoResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setTaskUuid(_ctx.stringValue("QueryVideoTaskInfoResponse.Data.List["+ i +"].TaskUuid"));
			listItem.setTitle(_ctx.stringValue("QueryVideoTaskInfoResponse.Data.List["+ i +"].Title"));
			listItem.setType(_ctx.integerValue("QueryVideoTaskInfoResponse.Data.List["+ i +"].Type"));
			listItem.setStatus(_ctx.integerValue("QueryVideoTaskInfoResponse.Data.List["+ i +"].Status"));

			TaskResult taskResult = new TaskResult();
			taskResult.setVideoUrl(_ctx.stringValue("QueryVideoTaskInfoResponse.Data.List["+ i +"].TaskResult.VideoUrl"));
			taskResult.setSubtitlesUrl(_ctx.stringValue("QueryVideoTaskInfoResponse.Data.List["+ i +"].TaskResult.SubtitlesUrl"));
			taskResult.setWordSubtitlesUrl(_ctx.stringValue("QueryVideoTaskInfoResponse.Data.List["+ i +"].TaskResult.WordSubtitlesUrl"));
			taskResult.setVideoDuration(_ctx.integerValue("QueryVideoTaskInfoResponse.Data.List["+ i +"].TaskResult.VideoDuration"));
			taskResult.setFailReason(_ctx.stringValue("QueryVideoTaskInfoResponse.Data.List["+ i +"].TaskResult.FailReason"));
			taskResult.setFailCode(_ctx.stringValue("QueryVideoTaskInfoResponse.Data.List["+ i +"].TaskResult.FailCode"));
			taskResult.setAlphaUrl(_ctx.stringValue("QueryVideoTaskInfoResponse.Data.List["+ i +"].TaskResult.AlphaUrl"));
			taskResult.setPreviewPic(_ctx.stringValue("QueryVideoTaskInfoResponse.Data.List["+ i +"].TaskResult.PreviewPic"));
			taskResult.setAttachmentUrl(_ctx.stringValue("QueryVideoTaskInfoResponse.Data.List["+ i +"].TaskResult.AttachmentUrl"));
			listItem.setTaskResult(taskResult);

			list.add(listItem);
		}
		data.setList(list);
		queryVideoTaskInfoResponse.setData(data);
	 
	 	return queryVideoTaskInfoResponse;
	}
}