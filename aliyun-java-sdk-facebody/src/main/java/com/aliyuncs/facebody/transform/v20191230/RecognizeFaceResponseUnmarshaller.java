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
import com.aliyuncs.facebody.model.v20191230.RecognizeFaceResponse.Data.Qualities;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeFaceResponseUnmarshaller {

	public static RecognizeFaceResponse unmarshall(RecognizeFaceResponse recognizeFaceResponse, UnmarshallerContext _ctx) {
		
		recognizeFaceResponse.setRequestId(_ctx.stringValue("RecognizeFaceResponse.RequestId"));

		Data data = new Data();
		data.setLandmarkCount(_ctx.integerValue("RecognizeFaceResponse.Data.LandmarkCount"));
		data.setDenseFeatureLength(_ctx.integerValue("RecognizeFaceResponse.Data.DenseFeatureLength"));
		data.setFaceCount(_ctx.integerValue("RecognizeFaceResponse.Data.FaceCount"));

		List<String> denseFeatures = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.DenseFeatures.Length"); i++) {
			denseFeatures.add(_ctx.stringValue("RecognizeFaceResponse.Data.DenseFeatures["+ i +"]"));
		}
		data.setDenseFeatures(denseFeatures);

		List<Float> faceProbabilityList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.FaceProbabilityList.Length"); i++) {
			faceProbabilityList.add(_ctx.floatValue("RecognizeFaceResponse.Data.FaceProbabilityList["+ i +"]"));
		}
		data.setFaceProbabilityList(faceProbabilityList);

		List<Float> beautyList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.BeautyList.Length"); i++) {
			beautyList.add(_ctx.floatValue("RecognizeFaceResponse.Data.BeautyList["+ i +"]"));
		}
		data.setBeautyList(beautyList);

		List<Integer> hatList = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.HatList.Length"); i++) {
			hatList.add(_ctx.integerValue("RecognizeFaceResponse.Data.HatList["+ i +"]"));
		}
		data.setHatList(hatList);

		List<Integer> ageList = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.AgeList.Length"); i++) {
			ageList.add(_ctx.integerValue("RecognizeFaceResponse.Data.AgeList["+ i +"]"));
		}
		data.setAgeList(ageList);

		List<Integer> faceRectangles = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.FaceRectangles.Length"); i++) {
			faceRectangles.add(_ctx.integerValue("RecognizeFaceResponse.Data.FaceRectangles["+ i +"]"));
		}
		data.setFaceRectangles(faceRectangles);

		List<Integer> glasses = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Glasses.Length"); i++) {
			glasses.add(_ctx.integerValue("RecognizeFaceResponse.Data.Glasses["+ i +"]"));
		}
		data.setGlasses(glasses);

		List<Float> landmarks = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Landmarks.Length"); i++) {
			landmarks.add(_ctx.floatValue("RecognizeFaceResponse.Data.Landmarks["+ i +"]"));
		}
		data.setLandmarks(landmarks);

		List<Integer> expressions = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Expressions.Length"); i++) {
			expressions.add(_ctx.integerValue("RecognizeFaceResponse.Data.Expressions["+ i +"]"));
		}
		data.setExpressions(expressions);

		List<Long> masks = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Masks.Length"); i++) {
			masks.add(_ctx.longValue("RecognizeFaceResponse.Data.Masks["+ i +"]"));
		}
		data.setMasks(masks);

		List<Float> poseList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.PoseList.Length"); i++) {
			poseList.add(_ctx.floatValue("RecognizeFaceResponse.Data.PoseList["+ i +"]"));
		}
		data.setPoseList(poseList);

		List<Integer> genderList = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.GenderList.Length"); i++) {
			genderList.add(_ctx.integerValue("RecognizeFaceResponse.Data.GenderList["+ i +"]"));
		}
		data.setGenderList(genderList);

		List<Float> pupils = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Pupils.Length"); i++) {
			pupils.add(_ctx.floatValue("RecognizeFaceResponse.Data.Pupils["+ i +"]"));
		}
		data.setPupils(pupils);

		Qualities qualities = new Qualities();

		List<Float> noiseList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Qualities.NoiseList.Length"); i++) {
			noiseList.add(_ctx.floatValue("RecognizeFaceResponse.Data.Qualities.NoiseList["+ i +"]"));
		}
		qualities.setNoiseList(noiseList);

		List<Float> scoreList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Qualities.ScoreList.Length"); i++) {
			scoreList.add(_ctx.floatValue("RecognizeFaceResponse.Data.Qualities.ScoreList["+ i +"]"));
		}
		qualities.setScoreList(scoreList);

		List<Float> blurList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Qualities.BlurList.Length"); i++) {
			blurList.add(_ctx.floatValue("RecognizeFaceResponse.Data.Qualities.BlurList["+ i +"]"));
		}
		qualities.setBlurList(blurList);

		List<Float> maskList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Qualities.MaskList.Length"); i++) {
			maskList.add(_ctx.floatValue("RecognizeFaceResponse.Data.Qualities.MaskList["+ i +"]"));
		}
		qualities.setMaskList(maskList);

		List<Float> glassList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Qualities.GlassList.Length"); i++) {
			glassList.add(_ctx.floatValue("RecognizeFaceResponse.Data.Qualities.GlassList["+ i +"]"));
		}
		qualities.setGlassList(glassList);

		List<Float> fnfList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Qualities.FnfList.Length"); i++) {
			fnfList.add(_ctx.floatValue("RecognizeFaceResponse.Data.Qualities.FnfList["+ i +"]"));
		}
		qualities.setFnfList(fnfList);

		List<Float> poseList1 = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Qualities.PoseList.Length"); i++) {
			poseList1.add(_ctx.floatValue("RecognizeFaceResponse.Data.Qualities.PoseList["+ i +"]"));
		}
		qualities.setPoseList1(poseList1);

		List<Float> illuList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFaceResponse.Data.Qualities.IlluList.Length"); i++) {
			illuList.add(_ctx.floatValue("RecognizeFaceResponse.Data.Qualities.IlluList["+ i +"]"));
		}
		qualities.setIlluList(illuList);
		data.setQualities(qualities);
		recognizeFaceResponse.setData(data);
	 
	 	return recognizeFaceResponse;
	}
}