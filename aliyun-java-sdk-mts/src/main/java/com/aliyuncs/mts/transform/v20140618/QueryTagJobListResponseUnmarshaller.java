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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryTagJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryTagJobListResponse.TagJob;
import com.aliyuncs.mts.model.v20140618.QueryTagJobListResponse.TagJob.Input;
import com.aliyuncs.mts.model.v20140618.QueryTagJobListResponse.TagJob.VideoTagResult;
import com.aliyuncs.mts.model.v20140618.QueryTagJobListResponse.TagJob.VideoTagResult.TagAnResult;
import com.aliyuncs.mts.model.v20140618.QueryTagJobListResponse.TagJob.VideoTagResult.TagFrResult;
import com.aliyuncs.mts.model.v20140618.QueryTagJobListResponse.TagJob.VideoTagResult.TagFrResult.TagFace;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTagJobListResponseUnmarshaller {

	public static QueryTagJobListResponse unmarshall(QueryTagJobListResponse queryTagJobListResponse, UnmarshallerContext _ctx) {
		
		queryTagJobListResponse.setRequestId(_ctx.stringValue("QueryTagJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryTagJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryTagJobListResponse.NonExistIds["+ i +"]"));
		}
		queryTagJobListResponse.setNonExistIds(nonExistIds);

		List<TagJob> tagJobList = new ArrayList<TagJob>();
		for (int i = 0; i < _ctx.lengthValue("QueryTagJobListResponse.TagJobList.Length"); i++) {
			TagJob tagJob = new TagJob();
			tagJob.setId(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].Id"));
			tagJob.setUserData(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].UserData"));
			tagJob.setPipelineId(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].PipelineId"));
			tagJob.setState(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].State"));
			tagJob.setCode(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].Code"));
			tagJob.setMessage(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].Message"));
			tagJob.setCreationTime(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setBucket(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].Input.Bucket"));
			input.setLocation(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].Input.Location"));
			input.setObject(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].Input.Object"));
			tagJob.setInput(input);

			VideoTagResult videoTagResult = new VideoTagResult();
			videoTagResult.setDetails(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].VideoTagResult.Details"));

			List<TagAnResult> tagAnResults = new ArrayList<TagAnResult>();
			for (int j = 0; j < _ctx.lengthValue("QueryTagJobListResponse.TagJobList["+ i +"].VideoTagResult.TagAnResults.Length"); j++) {
				TagAnResult tagAnResult = new TagAnResult();
				tagAnResult.setLabel(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].VideoTagResult.TagAnResults["+ j +"].Label"));
				tagAnResult.setScore(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].VideoTagResult.TagAnResults["+ j +"].Score"));

				tagAnResults.add(tagAnResult);
			}
			videoTagResult.setTagAnResults(tagAnResults);

			List<TagFrResult> tagFrResults = new ArrayList<TagFrResult>();
			for (int j = 0; j < _ctx.lengthValue("QueryTagJobListResponse.TagJobList["+ i +"].VideoTagResult.TagFrResults.Length"); j++) {
				TagFrResult tagFrResult = new TagFrResult();
				tagFrResult.setTime(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].VideoTagResult.TagFrResults["+ j +"].Time"));

				List<TagFace> tagFaces = new ArrayList<TagFace>();
				for (int k = 0; k < _ctx.lengthValue("QueryTagJobListResponse.TagJobList["+ i +"].VideoTagResult.TagFrResults["+ j +"].TagFaces.Length"); k++) {
					TagFace tagFace = new TagFace();
					tagFace.setName(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].VideoTagResult.TagFrResults["+ j +"].TagFaces["+ k +"].Name"));
					tagFace.setScore(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].VideoTagResult.TagFrResults["+ j +"].TagFaces["+ k +"].Score"));
					tagFace.setTarget(_ctx.stringValue("QueryTagJobListResponse.TagJobList["+ i +"].VideoTagResult.TagFrResults["+ j +"].TagFaces["+ k +"].Target"));

					tagFaces.add(tagFace);
				}
				tagFrResult.setTagFaces(tagFaces);

				tagFrResults.add(tagFrResult);
			}
			videoTagResult.setTagFrResults(tagFrResults);
			tagJob.setVideoTagResult(videoTagResult);

			tagJobList.add(tagJob);
		}
		queryTagJobListResponse.setTagJobList(tagJobList);
	 
	 	return queryTagJobListResponse;
	}
}