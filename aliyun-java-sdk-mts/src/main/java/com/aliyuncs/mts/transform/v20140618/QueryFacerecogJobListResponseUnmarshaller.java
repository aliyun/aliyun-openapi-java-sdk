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

import com.aliyuncs.mts.model.v20140618.QueryFacerecogJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryFacerecogJobListResponse.FacerecogJob;
import com.aliyuncs.mts.model.v20140618.QueryFacerecogJobListResponse.FacerecogJob.Input;
import com.aliyuncs.mts.model.v20140618.QueryFacerecogJobListResponse.FacerecogJob.VideoFacerecogResult;
import com.aliyuncs.mts.model.v20140618.QueryFacerecogJobListResponse.FacerecogJob.VideoFacerecogResult.Facerecog;
import com.aliyuncs.mts.model.v20140618.QueryFacerecogJobListResponse.FacerecogJob.VideoFacerecogResult.Facerecog.Face;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFacerecogJobListResponseUnmarshaller {

	public static QueryFacerecogJobListResponse unmarshall(QueryFacerecogJobListResponse queryFacerecogJobListResponse, UnmarshallerContext _ctx) {
		
		queryFacerecogJobListResponse.setRequestId(_ctx.stringValue("QueryFacerecogJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryFacerecogJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryFacerecogJobListResponse.NonExistIds["+ i +"]"));
		}
		queryFacerecogJobListResponse.setNonExistIds(nonExistIds);

		List<FacerecogJob> facerecogJobList = new ArrayList<FacerecogJob>();
		for (int i = 0; i < _ctx.lengthValue("QueryFacerecogJobListResponse.FacerecogJobList.Length"); i++) {
			FacerecogJob facerecogJob = new FacerecogJob();
			facerecogJob.setId(_ctx.stringValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].Id"));
			facerecogJob.setUserData(_ctx.stringValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].UserData"));
			facerecogJob.setPipelineId(_ctx.stringValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].PipelineId"));
			facerecogJob.setState(_ctx.stringValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].State"));
			facerecogJob.setCode(_ctx.stringValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].Code"));
			facerecogJob.setMessage(_ctx.stringValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].Message"));
			facerecogJob.setCreationTime(_ctx.stringValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setBucket(_ctx.stringValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].Input.Bucket"));
			input.setLocation(_ctx.stringValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].Input.Location"));
			input.setObject(_ctx.stringValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].Input.Object"));
			facerecogJob.setInput(input);

			VideoFacerecogResult videoFacerecogResult = new VideoFacerecogResult();

			List<Facerecog> facerecogs = new ArrayList<Facerecog>();
			for (int j = 0; j < _ctx.lengthValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].VideoFacerecogResult.Facerecogs.Length"); j++) {
				Facerecog facerecog = new Facerecog();
				facerecog.setTime(_ctx.stringValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].VideoFacerecogResult.Facerecogs["+ j +"].Time"));

				List<Face> faces = new ArrayList<Face>();
				for (int k = 0; k < _ctx.lengthValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].VideoFacerecogResult.Facerecogs["+ j +"].Faces.Length"); k++) {
					Face face = new Face();
					face.setName(_ctx.stringValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].VideoFacerecogResult.Facerecogs["+ j +"].Faces["+ k +"].Name"));
					face.setScore(_ctx.stringValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].VideoFacerecogResult.Facerecogs["+ j +"].Faces["+ k +"].Score"));
					face.setTarget(_ctx.stringValue("QueryFacerecogJobListResponse.FacerecogJobList["+ i +"].VideoFacerecogResult.Facerecogs["+ j +"].Faces["+ k +"].Target"));

					faces.add(face);
				}
				facerecog.setFaces(faces);

				facerecogs.add(facerecog);
			}
			videoFacerecogResult.setFacerecogs(facerecogs);
			facerecogJob.setVideoFacerecogResult(videoFacerecogResult);

			facerecogJobList.add(facerecogJob);
		}
		queryFacerecogJobListResponse.setFacerecogJobList(facerecogJobList);
	 
	 	return queryFacerecogJobListResponse;
	}
}