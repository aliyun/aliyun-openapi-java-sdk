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

package com.aliyuncs.imageprocess.transform.v20200320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imageprocess.model.v20200320.PredictCVDResponse;
import com.aliyuncs.imageprocess.model.v20200320.PredictCVDResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.PredictCVDResponse.Data.Lesion;
import com.aliyuncs.imageprocess.model.v20200320.PredictCVDResponse.Data.Lesion.FeatureScore;
import com.aliyuncs.transform.UnmarshallerContext;


public class PredictCVDResponseUnmarshaller {

	public static PredictCVDResponse unmarshall(PredictCVDResponse predictCVDResponse, UnmarshallerContext _ctx) {
		
		predictCVDResponse.setRequestId(_ctx.stringValue("PredictCVDResponse.RequestId"));
		predictCVDResponse.setCode(_ctx.stringValue("PredictCVDResponse.Code"));
		predictCVDResponse.setMessage(_ctx.stringValue("PredictCVDResponse.Message"));

		Data data = new Data();

		Lesion lesion = new Lesion();
		lesion.setCVDProbability(_ctx.floatValue("PredictCVDResponse.Data.Lesion.CVDProbability"));

		List<String> resultURL = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PredictCVDResponse.Data.Lesion.ResultURL.Length"); i++) {
			resultURL.add(_ctx.stringValue("PredictCVDResponse.Data.Lesion.ResultURL["+ i +"]"));
		}
		lesion.setResultURL(resultURL);

		FeatureScore featureScore = new FeatureScore();

		List<Double> myoEpiRatio = new ArrayList<Double>();
		for (int i = 0; i < _ctx.lengthValue("PredictCVDResponse.Data.Lesion.FeatureScore.MyoEpiRatio.Length"); i++) {
			myoEpiRatio.add(_ctx.doubleValue("PredictCVDResponse.Data.Lesion.FeatureScore.MyoEpiRatio["+ i +"]"));
		}
		featureScore.setMyoEpiRatio(myoEpiRatio);

		List<Double> ascAoMaxDiam = new ArrayList<Double>();
		for (int i = 0; i < _ctx.lengthValue("PredictCVDResponse.Data.Lesion.FeatureScore.AscAoMaxDiam.Length"); i++) {
			ascAoMaxDiam.add(_ctx.doubleValue("PredictCVDResponse.Data.Lesion.FeatureScore.AscAoMaxDiam["+ i +"]"));
		}
		featureScore.setAscAoMaxDiam(ascAoMaxDiam);

		List<Double> coronaryCalciumVol = new ArrayList<Double>();
		for (int i = 0; i < _ctx.lengthValue("PredictCVDResponse.Data.Lesion.FeatureScore.CoronaryCalciumVol.Length"); i++) {
			coronaryCalciumVol.add(_ctx.doubleValue("PredictCVDResponse.Data.Lesion.FeatureScore.CoronaryCalciumVol["+ i +"]"));
		}
		featureScore.setCoronaryCalciumVol(coronaryCalciumVol);

		List<Double> eatVolume = new ArrayList<Double>();
		for (int i = 0; i < _ctx.lengthValue("PredictCVDResponse.Data.Lesion.FeatureScore.EatVolume.Length"); i++) {
			eatVolume.add(_ctx.doubleValue("PredictCVDResponse.Data.Lesion.FeatureScore.EatVolume["+ i +"]"));
		}
		featureScore.setEatVolume(eatVolume);

		List<Double> aortaCalciumScore = new ArrayList<Double>();
		for (int i = 0; i < _ctx.lengthValue("PredictCVDResponse.Data.Lesion.FeatureScore.AortaCalciumScore.Length"); i++) {
			aortaCalciumScore.add(_ctx.doubleValue("PredictCVDResponse.Data.Lesion.FeatureScore.AortaCalciumScore["+ i +"]"));
		}
		featureScore.setAortaCalciumScore(aortaCalciumScore);

		List<Double> cardioThoracicRatio = new ArrayList<Double>();
		for (int i = 0; i < _ctx.lengthValue("PredictCVDResponse.Data.Lesion.FeatureScore.CardioThoracicRatio.Length"); i++) {
			cardioThoracicRatio.add(_ctx.doubleValue("PredictCVDResponse.Data.Lesion.FeatureScore.CardioThoracicRatio["+ i +"]"));
		}
		featureScore.setCardioThoracicRatio(cardioThoracicRatio);

		List<Double> eatHUMean = new ArrayList<Double>();
		for (int i = 0; i < _ctx.lengthValue("PredictCVDResponse.Data.Lesion.FeatureScore.EatHUMean.Length"); i++) {
			eatHUMean.add(_ctx.doubleValue("PredictCVDResponse.Data.Lesion.FeatureScore.EatHUMean["+ i +"]"));
		}
		featureScore.setEatHUMean(eatHUMean);

		List<Double> eatHUSTD = new ArrayList<Double>();
		for (int i = 0; i < _ctx.lengthValue("PredictCVDResponse.Data.Lesion.FeatureScore.EatHUSTD.Length"); i++) {
			eatHUSTD.add(_ctx.doubleValue("PredictCVDResponse.Data.Lesion.FeatureScore.EatHUSTD["+ i +"]"));
		}
		featureScore.setEatHUSTD(eatHUSTD);

		List<Double> rightLungLowattRatio = new ArrayList<Double>();
		for (int i = 0; i < _ctx.lengthValue("PredictCVDResponse.Data.Lesion.FeatureScore.RightLungLowattRatio.Length"); i++) {
			rightLungLowattRatio.add(_ctx.doubleValue("PredictCVDResponse.Data.Lesion.FeatureScore.RightLungLowattRatio["+ i +"]"));
		}
		featureScore.setRightLungLowattRatio(rightLungLowattRatio);

		List<Double> ascendAortaLength = new ArrayList<Double>();
		for (int i = 0; i < _ctx.lengthValue("PredictCVDResponse.Data.Lesion.FeatureScore.AscendAortaLength.Length"); i++) {
			ascendAortaLength.add(_ctx.doubleValue("PredictCVDResponse.Data.Lesion.FeatureScore.AscendAortaLength["+ i +"]"));
		}
		featureScore.setAscendAortaLength(ascendAortaLength);

		List<Double> leftLungLowattRatio = new ArrayList<Double>();
		for (int i = 0; i < _ctx.lengthValue("PredictCVDResponse.Data.Lesion.FeatureScore.LeftLungLowattRatio.Length"); i++) {
			leftLungLowattRatio.add(_ctx.doubleValue("PredictCVDResponse.Data.Lesion.FeatureScore.LeftLungLowattRatio["+ i +"]"));
		}
		featureScore.setLeftLungLowattRatio(leftLungLowattRatio);

		List<Double> deepFeature = new ArrayList<Double>();
		for (int i = 0; i < _ctx.lengthValue("PredictCVDResponse.Data.Lesion.FeatureScore.DeepFeature.Length"); i++) {
			deepFeature.add(_ctx.doubleValue("PredictCVDResponse.Data.Lesion.FeatureScore.DeepFeature["+ i +"]"));
		}
		featureScore.setDeepFeature(deepFeature);

		List<Double> aortaCalciumVolume = new ArrayList<Double>();
		for (int i = 0; i < _ctx.lengthValue("PredictCVDResponse.Data.Lesion.FeatureScore.AortaCalciumVolume.Length"); i++) {
			aortaCalciumVolume.add(_ctx.doubleValue("PredictCVDResponse.Data.Lesion.FeatureScore.AortaCalciumVolume["+ i +"]"));
		}
		featureScore.setAortaCalciumVolume(aortaCalciumVolume);

		List<Double> coronaryCalciumScore = new ArrayList<Double>();
		for (int i = 0; i < _ctx.lengthValue("PredictCVDResponse.Data.Lesion.FeatureScore.CoronaryCalciumScore.Length"); i++) {
			coronaryCalciumScore.add(_ctx.doubleValue("PredictCVDResponse.Data.Lesion.FeatureScore.CoronaryCalciumScore["+ i +"]"));
		}
		featureScore.setCoronaryCalciumScore(coronaryCalciumScore);
		lesion.setFeatureScore(featureScore);
		data.setLesion(lesion);
		predictCVDResponse.setData(data);
	 
	 	return predictCVDResponse;
	}
}