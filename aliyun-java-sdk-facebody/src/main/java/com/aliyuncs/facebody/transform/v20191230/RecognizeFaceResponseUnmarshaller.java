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

package com.aliyuncs.facebody.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20191230.RecognizeFaceResponse;
import com.aliyuncs.facebody.model.v20191230.RecognizeFaceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeFaceResponseUnmarshaller {

	public static RecognizeFaceResponse unmarshall(RecognizeFaceResponse recognizeFaceResponse, UnmarshallerContext _ctx) {
		
		recognizeFaceResponse.setRequestId(_ctx.stringValue("RecognizeFaceResponse.RequestId"));

		Data data = new Data();
		data.setFaceCount(_ctx.integerValue("RecognizeFaceResponse.Data.FaceCount"));
		data.setLandmarkCount(_ctx.integerValue("RecognizeFaceResponse.Data.LandmarkCount"));
		data.setDenseFeatureLength(_ctx.integerValue("RecognizeFaceResponse.Data.DenseFeatureLength"));

		List<Integer> faceRectangles = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.FaceRectangles.Length"); i++) {
			faceRectangles.add(_ctx.integerValue("RecognizeFaceResponse.Data.FaceRectangles["+ i +"]"));
		}
		data.setFaceRectangles(faceRectangles);

		List<Float> faceProbabilityList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.FaceProbabilityList.Length"); i++) {
			faceProbabilityList.add(_ctx.floatValue("RecognizeFaceResponse.Data.FaceProbabilityList["+ i +"]"));
		}
		data.setFaceProbabilityList(faceProbabilityList);

		List<Float> poseList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.PoseList.Length"); i++) {
			poseList.add(_ctx.floatValue("RecognizeFaceResponse.Data.PoseList["+ i +"]"));
		}
		data.setPoseList(poseList);

		List<Float> landmarks = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Landmarks.Length"); i++) {
			landmarks.add(_ctx.floatValue("RecognizeFaceResponse.Data.Landmarks["+ i +"]"));
		}
		data.setLandmarks(landmarks);

		List<Float> pupils = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Pupils.Length"); i++) {
			pupils.add(_ctx.floatValue("RecognizeFaceResponse.Data.Pupils["+ i +"]"));
		}
		data.setPupils(pupils);

		List<Integer> genderList = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.GenderList.Length"); i++) {
			genderList.add(_ctx.integerValue("RecognizeFaceResponse.Data.GenderList["+ i +"]"));
		}
		data.setGenderList(genderList);

		List<Integer> ageList = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.AgeList.Length"); i++) {
			ageList.add(_ctx.integerValue("RecognizeFaceResponse.Data.AgeList["+ i +"]"));
		}
		data.setAgeList(ageList);

		List<Integer> expressions = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Expressions.Length"); i++) {
			expressions.add(_ctx.integerValue("RecognizeFaceResponse.Data.Expressions["+ i +"]"));
		}
		data.setExpressions(expressions);

		List<Integer> glasses = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Glasses.Length"); i++) {
			glasses.add(_ctx.integerValue("RecognizeFaceResponse.Data.Glasses["+ i +"]"));
		}
		data.setGlasses(glasses);

		List<String> denseFeatures = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.DenseFeatures.Length"); i++) {
			denseFeatures.add(_ctx.stringValue("RecognizeFaceResponse.Data.DenseFeatures["+ i +"]"));
		}
		data.setDenseFeatures(denseFeatures);
		recognizeFaceResponse.setData(data);
	 
	 	return recognizeFaceResponse;
	}
}