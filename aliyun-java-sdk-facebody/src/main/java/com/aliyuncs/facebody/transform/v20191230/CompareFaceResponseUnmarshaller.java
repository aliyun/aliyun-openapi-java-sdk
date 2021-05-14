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

import com.aliyuncs.facebody.model.v20191230.CompareFaceResponse;
import com.aliyuncs.facebody.model.v20191230.CompareFaceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CompareFaceResponseUnmarshaller {

	public static CompareFaceResponse unmarshall(CompareFaceResponse compareFaceResponse, UnmarshallerContext _ctx) {
		
		compareFaceResponse.setRequestId(_ctx.stringValue("CompareFaceResponse.RequestId"));
		compareFaceResponse.setCode(_ctx.stringValue("CompareFaceResponse.Code"));

		Data data = new Data();
		data.setConfidence(_ctx.floatValue("CompareFaceResponse.Data.Confidence"));
		data.setQualityScoreA(_ctx.floatValue("CompareFaceResponse.Data.QualityScoreA"));
		data.setQualityScoreB(_ctx.floatValue("CompareFaceResponse.Data.QualityScoreB"));
		data.setMessageTips(_ctx.stringValue("CompareFaceResponse.Data.MessageTips"));

		List<Float> thresholds = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("CompareFaceResponse.Data.Thresholds.Length"); i++) {
			thresholds.add(_ctx.floatValue("CompareFaceResponse.Data.Thresholds["+ i +"]"));
		}
		data.setThresholds(thresholds);

		List<Integer> rectBList = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("CompareFaceResponse.Data.RectBList.Length"); i++) {
			rectBList.add(_ctx.integerValue("CompareFaceResponse.Data.RectBList["+ i +"]"));
		}
		data.setRectBList(rectBList);

		List<Integer> rectAList = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("CompareFaceResponse.Data.RectAList.Length"); i++) {
			rectAList.add(_ctx.integerValue("CompareFaceResponse.Data.RectAList["+ i +"]"));
		}
		data.setRectAList(rectAList);
		compareFaceResponse.setData(data);
	 
	 	return compareFaceResponse;
	}
}