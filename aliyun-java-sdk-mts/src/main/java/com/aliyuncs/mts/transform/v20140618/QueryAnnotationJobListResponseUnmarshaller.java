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

import com.aliyuncs.mts.model.v20140618.QueryAnnotationJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryAnnotationJobListResponse.AnnotationJob;
import com.aliyuncs.mts.model.v20140618.QueryAnnotationJobListResponse.AnnotationJob.Input;
import com.aliyuncs.mts.model.v20140618.QueryAnnotationJobListResponse.AnnotationJob.VideoAnnotationResult;
import com.aliyuncs.mts.model.v20140618.QueryAnnotationJobListResponse.AnnotationJob.VideoAnnotationResult.Annotation;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAnnotationJobListResponseUnmarshaller {

	public static QueryAnnotationJobListResponse unmarshall(QueryAnnotationJobListResponse queryAnnotationJobListResponse, UnmarshallerContext _ctx) {
		
		queryAnnotationJobListResponse.setRequestId(_ctx.stringValue("QueryAnnotationJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryAnnotationJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryAnnotationJobListResponse.NonExistIds["+ i +"]"));
		}
		queryAnnotationJobListResponse.setNonExistIds(nonExistIds);

		List<AnnotationJob> annotationJobList = new ArrayList<AnnotationJob>();
		for (int i = 0; i < _ctx.lengthValue("QueryAnnotationJobListResponse.AnnotationJobList.Length"); i++) {
			AnnotationJob annotationJob = new AnnotationJob();
			annotationJob.setId(_ctx.stringValue("QueryAnnotationJobListResponse.AnnotationJobList["+ i +"].Id"));
			annotationJob.setUserData(_ctx.stringValue("QueryAnnotationJobListResponse.AnnotationJobList["+ i +"].UserData"));
			annotationJob.setPipelineId(_ctx.stringValue("QueryAnnotationJobListResponse.AnnotationJobList["+ i +"].PipelineId"));
			annotationJob.setState(_ctx.stringValue("QueryAnnotationJobListResponse.AnnotationJobList["+ i +"].State"));
			annotationJob.setCode(_ctx.stringValue("QueryAnnotationJobListResponse.AnnotationJobList["+ i +"].Code"));
			annotationJob.setMessage(_ctx.stringValue("QueryAnnotationJobListResponse.AnnotationJobList["+ i +"].Message"));
			annotationJob.setCreationTime(_ctx.stringValue("QueryAnnotationJobListResponse.AnnotationJobList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setBucket(_ctx.stringValue("QueryAnnotationJobListResponse.AnnotationJobList["+ i +"].Input.Bucket"));
			input.setLocation(_ctx.stringValue("QueryAnnotationJobListResponse.AnnotationJobList["+ i +"].Input.Location"));
			input.setObject(_ctx.stringValue("QueryAnnotationJobListResponse.AnnotationJobList["+ i +"].Input.Object"));
			annotationJob.setInput(input);

			VideoAnnotationResult videoAnnotationResult = new VideoAnnotationResult();
			videoAnnotationResult.setDetails(_ctx.stringValue("QueryAnnotationJobListResponse.AnnotationJobList["+ i +"].VideoAnnotationResult.Details"));

			List<Annotation> annotations = new ArrayList<Annotation>();
			for (int j = 0; j < _ctx.lengthValue("QueryAnnotationJobListResponse.AnnotationJobList["+ i +"].VideoAnnotationResult.Annotations.Length"); j++) {
				Annotation annotation = new Annotation();
				annotation.setLabel(_ctx.stringValue("QueryAnnotationJobListResponse.AnnotationJobList["+ i +"].VideoAnnotationResult.Annotations["+ j +"].Label"));
				annotation.setScore(_ctx.stringValue("QueryAnnotationJobListResponse.AnnotationJobList["+ i +"].VideoAnnotationResult.Annotations["+ j +"].Score"));

				annotations.add(annotation);
			}
			videoAnnotationResult.setAnnotations(annotations);
			annotationJob.setVideoAnnotationResult(videoAnnotationResult);

			annotationJobList.add(annotationJob);
		}
		queryAnnotationJobListResponse.setAnnotationJobList(annotationJobList);
	 
	 	return queryAnnotationJobListResponse;
	}
}