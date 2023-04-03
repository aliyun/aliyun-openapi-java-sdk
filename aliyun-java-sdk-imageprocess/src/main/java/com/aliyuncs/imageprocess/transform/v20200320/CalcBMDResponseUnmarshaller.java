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

import com.aliyuncs.imageprocess.model.v20200320.CalcBMDResponse;
import com.aliyuncs.imageprocess.model.v20200320.CalcBMDResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.CalcBMDResponse.Data.DetectionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CalcBMDResponseUnmarshaller {

	public static CalcBMDResponse unmarshall(CalcBMDResponse calcBMDResponse, UnmarshallerContext _ctx) {
		
		calcBMDResponse.setRequestId(_ctx.stringValue("CalcBMDResponse.RequestId"));
		calcBMDResponse.setCode(_ctx.stringValue("CalcBMDResponse.Code"));
		calcBMDResponse.setMessage(_ctx.stringValue("CalcBMDResponse.Message"));

		Data data = new Data();
		data.setResultURL(_ctx.stringValue("CalcBMDResponse.Data.ResultURL"));

		List<Float> spacing = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("CalcBMDResponse.Data.Spacing.Length"); i++) {
			spacing.add(_ctx.floatValue("CalcBMDResponse.Data.Spacing["+ i +"]"));
		}
		data.setSpacing(spacing);

		List<Float> origin = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("CalcBMDResponse.Data.Origin.Length"); i++) {
			origin.add(_ctx.floatValue("CalcBMDResponse.Data.Origin["+ i +"]"));
		}
		data.setOrigin(origin);

		List<DetectionsItem> detections = new ArrayList<DetectionsItem>();
		for (int i = 0; i < _ctx.lengthValue("CalcBMDResponse.Data.Detections.Length"); i++) {
			DetectionsItem detectionsItem = new DetectionsItem();
			detectionsItem.setVertId(_ctx.stringValue("CalcBMDResponse.Data.Detections["+ i +"].VertId"));
			detectionsItem.setVertBMD(_ctx.floatValue("CalcBMDResponse.Data.Detections["+ i +"].VertBMD"));
			detectionsItem.setVertTScore(_ctx.floatValue("CalcBMDResponse.Data.Detections["+ i +"].VertTScore"));
			detectionsItem.setVertZScore(_ctx.floatValue("CalcBMDResponse.Data.Detections["+ i +"].VertZScore"));
			detectionsItem.setVertCategory(_ctx.floatValue("CalcBMDResponse.Data.Detections["+ i +"].VertCategory"));

			detections.add(detectionsItem);
		}
		data.setDetections(detections);
		calcBMDResponse.setData(data);
	 
	 	return calcBMDResponse;
	}
}