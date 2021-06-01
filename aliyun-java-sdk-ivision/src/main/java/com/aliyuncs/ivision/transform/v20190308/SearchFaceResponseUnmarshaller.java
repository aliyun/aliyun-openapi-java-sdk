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

package com.aliyuncs.ivision.transform.v20190308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivision.model.v20190308.SearchFaceResponse;
import com.aliyuncs.ivision.model.v20190308.SearchFaceResponse.FaceResult;
import com.aliyuncs.ivision.model.v20190308.SearchFaceResponse.Rect;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchFaceResponseUnmarshaller {

	public static SearchFaceResponse unmarshall(SearchFaceResponse searchFaceResponse, UnmarshallerContext _ctx) {
		
		searchFaceResponse.setRequestId(_ctx.stringValue("SearchFaceResponse.RequestId"));
		searchFaceResponse.setGroupId(_ctx.stringValue("SearchFaceResponse.GroupId"));

		Rect rect = new Rect();
		rect.setTop(_ctx.integerValue("SearchFaceResponse.Rect.Top"));
		rect.setWidth(_ctx.integerValue("SearchFaceResponse.Rect.Width"));
		rect.setHeight(_ctx.integerValue("SearchFaceResponse.Rect.Height"));
		rect.setLeft(_ctx.integerValue("SearchFaceResponse.Rect.Left"));
		searchFaceResponse.setRect(rect);

		List<FaceResult> faceResults = new ArrayList<FaceResult>();
		for (int i = 0; i < _ctx.lengthValue("SearchFaceResponse.FaceResults.Length"); i++) {
			FaceResult faceResult = new FaceResult();
			faceResult.setFaceToken(_ctx.stringValue("SearchFaceResponse.FaceResults["+ i +"].FaceToken"));
			faceResult.setProbability(_ctx.floatValue("SearchFaceResponse.FaceResults["+ i +"].Probability"));

			faceResults.add(faceResult);
		}
		searchFaceResponse.setFaceResults(faceResults);
	 
	 	return searchFaceResponse;
	}
}