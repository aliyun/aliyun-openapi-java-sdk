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

import com.aliyuncs.facebody.model.v20191230.DetectFaceResponse;
import com.aliyuncs.facebody.model.v20191230.DetectFaceResponse.Data;
import com.aliyuncs.facebody.model.v20191230.DetectFaceResponse.Data.Qualities;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectFaceResponseUnmarshaller {

	public static DetectFaceResponse unmarshall(DetectFaceResponse detectFaceResponse, UnmarshallerContext _ctx) {
		
		detectFaceResponse.setRequestId(_ctx.stringValue("DetectFaceResponse.RequestId"));

		Data data = new Data();
		data.setFaceCount(_ctx.integerValue("DetectFaceResponse.Data.FaceCount"));
		data.setLandmarkCount(_ctx.integerValue("DetectFaceResponse.Data.LandmarkCount"));

		List<Float> faceProbabilityList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectFaceResponse.Data.FaceProbabilityList.Length"); i++) {
			faceProbabilityList.add(_ctx.floatValue("DetectFaceResponse.Data.FaceProbabilityList["+ i +"]"));
		}
		data.setFaceProbabilityList(faceProbabilityList);

		List<Float> pupils = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectFaceResponse.Data.Pupils.Length"); i++) {
			pupils.add(_ctx.floatValue("DetectFaceResponse.Data.Pupils["+ i +"]"));
		}
		data.setPupils(pupils);

		List<Integer> faceRectangles = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("DetectFaceResponse.Data.FaceRectangles.Length"); i++) {
			faceRectangles.add(_ctx.integerValue("DetectFaceResponse.Data.FaceRectangles["+ i +"]"));
		}
		data.setFaceRectangles(faceRectangles);

		List<Float> poseList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectFaceResponse.Data.PoseList.Length"); i++) {
			poseList.add(_ctx.floatValue("DetectFaceResponse.Data.PoseList["+ i +"]"));
		}
		data.setPoseList(poseList);

		List<Float> landmarks = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectFaceResponse.Data.Landmarks.Length"); i++) {
			landmarks.add(_ctx.floatValue("DetectFaceResponse.Data.Landmarks["+ i +"]"));
		}
		data.setLandmarks(landmarks);

		Qualities qualities = new Qualities();

		List<Float> scoreList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectFaceResponse.Data.Qualities.ScoreList.Length"); i++) {
			scoreList.add(_ctx.floatValue("DetectFaceResponse.Data.Qualities.ScoreList["+ i +"]"));
		}
		qualities.setScoreList(scoreList);

		List<Float> blurList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectFaceResponse.Data.Qualities.BlurList.Length"); i++) {
			blurList.add(_ctx.floatValue("DetectFaceResponse.Data.Qualities.BlurList["+ i +"]"));
		}
		qualities.setBlurList(blurList);

		List<Float> fnfList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectFaceResponse.Data.Qualities.FnfList.Length"); i++) {
			fnfList.add(_ctx.floatValue("DetectFaceResponse.Data.Qualities.FnfList["+ i +"]"));
		}
		qualities.setFnfList(fnfList);

		List<Float> glassList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectFaceResponse.Data.Qualities.GlassList.Length"); i++) {
			glassList.add(_ctx.floatValue("DetectFaceResponse.Data.Qualities.GlassList["+ i +"]"));
		}
		qualities.setGlassList(glassList);

		List<Float> illuList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectFaceResponse.Data.Qualities.IlluList.Length"); i++) {
			illuList.add(_ctx.floatValue("DetectFaceResponse.Data.Qualities.IlluList["+ i +"]"));
		}
		qualities.setIlluList(illuList);

		List<Float> maskList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectFaceResponse.Data.Qualities.MaskList.Length"); i++) {
			maskList.add(_ctx.floatValue("DetectFaceResponse.Data.Qualities.MaskList["+ i +"]"));
		}
		qualities.setMaskList(maskList);

		List<Float> noiseList = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectFaceResponse.Data.Qualities.NoiseList.Length"); i++) {
			noiseList.add(_ctx.floatValue("DetectFaceResponse.Data.Qualities.NoiseList["+ i +"]"));
		}
		qualities.setNoiseList(noiseList);

		List<Float> poseList1 = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectFaceResponse.Data.Qualities.PoseList.Length"); i++) {
			poseList1.add(_ctx.floatValue("DetectFaceResponse.Data.Qualities.PoseList["+ i +"]"));
		}
		qualities.setPoseList1(poseList1);
		data.setQualities(qualities);
		detectFaceResponse.setData(data);
	 
	 	return detectFaceResponse;
	}
}