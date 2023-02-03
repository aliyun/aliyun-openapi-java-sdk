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

import com.aliyuncs.facebody.model.v20191230.CompareFaceWithMaskResponse;
import com.aliyuncs.facebody.model.v20191230.CompareFaceWithMaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CompareFaceWithMaskResponseUnmarshaller {

	public static CompareFaceWithMaskResponse unmarshall(CompareFaceWithMaskResponse compareFaceWithMaskResponse, UnmarshallerContext _ctx) {
		
		compareFaceWithMaskResponse.setRequestId(_ctx.stringValue("CompareFaceWithMaskResponse.RequestId"));
		compareFaceWithMaskResponse.setCode(_ctx.stringValue("CompareFaceWithMaskResponse.Code"));
		compareFaceWithMaskResponse.setMessage(_ctx.stringValue("CompareFaceWithMaskResponse.Message"));

		Data data = new Data();
		data.setConfidence(_ctx.floatValue("CompareFaceWithMaskResponse.Data.Confidence"));
		data.setIsMaskA(_ctx.longValue("CompareFaceWithMaskResponse.Data.IsMaskA"));
		data.setIsMaskB(_ctx.longValue("CompareFaceWithMaskResponse.Data.IsMaskB"));
		data.setQualityScoreA(_ctx.floatValue("CompareFaceWithMaskResponse.Data.QualityScoreA"));
		data.setQualityScoreB(_ctx.floatValue("CompareFaceWithMaskResponse.Data.QualityScoreB"));
		data.setMessageTips(_ctx.stringValue("CompareFaceWithMaskResponse.Data.MessageTips"));

		List<Long> landmarksAList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CompareFaceWithMaskResponse.Data.LandmarksAList.Length"); i++) {
			landmarksAList.add(_ctx.longValue("CompareFaceWithMaskResponse.Data.LandmarksAList["+ i +"]"));
		}
		data.setLandmarksAList(landmarksAList);

		List<Long> landmarksBList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CompareFaceWithMaskResponse.Data.LandmarksBList.Length"); i++) {
			landmarksBList.add(_ctx.longValue("CompareFaceWithMaskResponse.Data.LandmarksBList["+ i +"]"));
		}
		data.setLandmarksBList(landmarksBList);

		List<Long> rectAList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CompareFaceWithMaskResponse.Data.RectAList.Length"); i++) {
			rectAList.add(_ctx.longValue("CompareFaceWithMaskResponse.Data.RectAList["+ i +"]"));
		}
		data.setRectAList(rectAList);

		List<Long> rectBList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CompareFaceWithMaskResponse.Data.RectBList.Length"); i++) {
			rectBList.add(_ctx.longValue("CompareFaceWithMaskResponse.Data.RectBList["+ i +"]"));
		}
		data.setRectBList(rectBList);

		List<Long> thresholds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CompareFaceWithMaskResponse.Data.Thresholds.Length"); i++) {
			thresholds.add(_ctx.longValue("CompareFaceWithMaskResponse.Data.Thresholds["+ i +"]"));
		}
		data.setThresholds(thresholds);
		compareFaceWithMaskResponse.setData(data);
	 
	 	return compareFaceWithMaskResponse;
	}
}