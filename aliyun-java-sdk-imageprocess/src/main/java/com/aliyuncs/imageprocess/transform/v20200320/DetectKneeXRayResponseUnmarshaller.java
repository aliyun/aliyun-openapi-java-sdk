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

import com.aliyuncs.imageprocess.model.v20200320.DetectKneeXRayResponse;
import com.aliyuncs.imageprocess.model.v20200320.DetectKneeXRayResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.DetectKneeXRayResponse.Data.KLDetectionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectKneeXRayResponseUnmarshaller {

	public static DetectKneeXRayResponse unmarshall(DetectKneeXRayResponse detectKneeXRayResponse, UnmarshallerContext _ctx) {
		
		detectKneeXRayResponse.setRequestId(_ctx.stringValue("DetectKneeXRayResponse.RequestId"));

		Data data = new Data();

		List<KLDetectionsItem> kLDetections = new ArrayList<KLDetectionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectKneeXRayResponse.Data.KLDetections.Length"); i++) {
			KLDetectionsItem kLDetectionsItem = new KLDetectionsItem();

			List<Float> detections = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("DetectKneeXRayResponse.Data.KLDetections["+ i +"].Detections.Length"); j++) {
				detections.add(_ctx.floatValue("DetectKneeXRayResponse.Data.KLDetections["+ i +"].Detections["+ j +"]"));
			}
			kLDetectionsItem.setDetections(detections);

			kLDetections.add(kLDetectionsItem);
		}
		data.setKLDetections(kLDetections);
		detectKneeXRayResponse.setData(data);
	 
	 	return detectKneeXRayResponse;
	}
}