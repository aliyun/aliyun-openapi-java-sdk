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

import com.aliyuncs.imageprocess.model.v20200320.CalcCACSResponse;
import com.aliyuncs.imageprocess.model.v20200320.CalcCACSResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.CalcCACSResponse.Data.DetectionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CalcCACSResponseUnmarshaller {

	public static CalcCACSResponse unmarshall(CalcCACSResponse calcCACSResponse, UnmarshallerContext _ctx) {
		
		calcCACSResponse.setRequestId(_ctx.stringValue("CalcCACSResponse.RequestId"));
		calcCACSResponse.setCode(_ctx.stringValue("CalcCACSResponse.Code"));
		calcCACSResponse.setMessage(_ctx.stringValue("CalcCACSResponse.Message"));

		Data data = new Data();
		data.setResultUrl(_ctx.stringValue("CalcCACSResponse.Data.ResultUrl"));
		data.setScore(_ctx.stringValue("CalcCACSResponse.Data.Score"));
		data.setVolumeScore(_ctx.stringValue("CalcCACSResponse.Data.VolumeScore"));

		List<DetectionsItem> detections = new ArrayList<DetectionsItem>();
		for (int i = 0; i < _ctx.lengthValue("CalcCACSResponse.Data.Detections.Length"); i++) {
			DetectionsItem detectionsItem = new DetectionsItem();
			detectionsItem.setCalciumId(_ctx.longValue("CalcCACSResponse.Data.Detections["+ i +"].CalciumId"));
			detectionsItem.setCalciumScore(_ctx.floatValue("CalcCACSResponse.Data.Detections["+ i +"].CalciumScore"));
			detectionsItem.setCalciumVolume(_ctx.floatValue("CalcCACSResponse.Data.Detections["+ i +"].CalciumVolume"));

			List<Long> calciumCenter = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("CalcCACSResponse.Data.Detections["+ i +"].CalciumCenter.Length"); j++) {
				calciumCenter.add(_ctx.longValue("CalcCACSResponse.Data.Detections["+ i +"].CalciumCenter["+ j +"]"));
			}
			detectionsItem.setCalciumCenter(calciumCenter);

			detections.add(detectionsItem);
		}
		data.setDetections(detections);
		calcCACSResponse.setData(data);
	 
	 	return calcCACSResponse;
	}
}