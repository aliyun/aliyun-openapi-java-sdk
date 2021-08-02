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

package com.aliyuncs.imagerecog.transform.v20190930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imagerecog.model.v20190930.RecognizeSceneResponse;
import com.aliyuncs.imagerecog.model.v20190930.RecognizeSceneResponse.Data;
import com.aliyuncs.imagerecog.model.v20190930.RecognizeSceneResponse.Data.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeSceneResponseUnmarshaller {

	public static RecognizeSceneResponse unmarshall(RecognizeSceneResponse recognizeSceneResponse, UnmarshallerContext _ctx) {
		
		recognizeSceneResponse.setRequestId(_ctx.stringValue("RecognizeSceneResponse.RequestId"));

		Data data = new Data();

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeSceneResponse.Data.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setValue(_ctx.stringValue("RecognizeSceneResponse.Data.Tags["+ i +"].Value"));
			tag.setConfidence(_ctx.floatValue("RecognizeSceneResponse.Data.Tags["+ i +"].Confidence"));

			tags.add(tag);
		}
		data.setTags(tags);
		recognizeSceneResponse.setData(data);
	 
	 	return recognizeSceneResponse;
	}
}