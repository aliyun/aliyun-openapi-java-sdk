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

import com.aliyuncs.imageprocess.model.v20200320.DetectLiverSteatosisResponse;
import com.aliyuncs.imageprocess.model.v20200320.DetectLiverSteatosisResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.DetectLiverSteatosisResponse.Data.DetectionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectLiverSteatosisResponseUnmarshaller {

	public static DetectLiverSteatosisResponse unmarshall(DetectLiverSteatosisResponse detectLiverSteatosisResponse, UnmarshallerContext _ctx) {
		
		detectLiverSteatosisResponse.setRequestId(_ctx.stringValue("DetectLiverSteatosisResponse.RequestId"));
		detectLiverSteatosisResponse.setCode(_ctx.stringValue("DetectLiverSteatosisResponse.Code"));
		detectLiverSteatosisResponse.setMessage(_ctx.stringValue("DetectLiverSteatosisResponse.Message"));

		Data data = new Data();

		List<Float> spacing = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectLiverSteatosisResponse.Data.Spacing.Length"); i++) {
			spacing.add(_ctx.floatValue("DetectLiverSteatosisResponse.Data.Spacing["+ i +"]"));
		}
		data.setSpacing(spacing);

		List<Float> origin = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectLiverSteatosisResponse.Data.Origin.Length"); i++) {
			origin.add(_ctx.floatValue("DetectLiverSteatosisResponse.Data.Origin["+ i +"]"));
		}
		data.setOrigin(origin);

		List<DetectionsItem> detections = new ArrayList<DetectionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectLiverSteatosisResponse.Data.Detections.Length"); i++) {
			DetectionsItem detectionsItem = new DetectionsItem();
			detectionsItem.setRadius(_ctx.longValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].Radius"));
			detectionsItem.setLiverSlice(_ctx.floatValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].LiverSlice"));
			detectionsItem.setSpleenSlice(_ctx.floatValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].SpleenSlice"));
			detectionsItem.setLiverVolume(_ctx.floatValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].LiverVolume"));
			detectionsItem.setSpleenVolume(_ctx.floatValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].SpleenVolume"));
			detectionsItem.setLiverHU(_ctx.floatValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].LiverHU"));
			detectionsItem.setSpleenHU(_ctx.floatValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].SpleenHU"));
			detectionsItem.setLiverROI1(_ctx.floatValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].LiverROI1"));
			detectionsItem.setLiverROI2(_ctx.floatValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].LiverROI2"));
			detectionsItem.setLiverROI3(_ctx.floatValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].LiverROI3"));
			detectionsItem.setSpleenROI(_ctx.floatValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].SpleenROI"));
			detectionsItem.setLiverSpleenDifference(_ctx.floatValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].LiverSpleenDifference"));
			detectionsItem.setLiverSpleenRatio(_ctx.floatValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].LiverSpleenRatio"));
			detectionsItem.setPrediction(_ctx.stringValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].Prediction"));
			detectionsItem.setProbability(_ctx.floatValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].Probability"));

			List<Long> rOI1Center = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].ROI1Center.Length"); j++) {
				rOI1Center.add(_ctx.longValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].ROI1Center["+ j +"]"));
			}
			detectionsItem.setROI1Center(rOI1Center);

			List<Long> rOI2Center = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].ROI2Center.Length"); j++) {
				rOI2Center.add(_ctx.longValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].ROI2Center["+ j +"]"));
			}
			detectionsItem.setROI2Center(rOI2Center);

			List<Long> rOI3Center = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].ROI3Center.Length"); j++) {
				rOI3Center.add(_ctx.longValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].ROI3Center["+ j +"]"));
			}
			detectionsItem.setROI3Center(rOI3Center);

			List<Long> spleenCenter = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].SpleenCenter.Length"); j++) {
				spleenCenter.add(_ctx.longValue("DetectLiverSteatosisResponse.Data.Detections["+ i +"].SpleenCenter["+ j +"]"));
			}
			detectionsItem.setSpleenCenter(spleenCenter);

			detections.add(detectionsItem);
		}
		data.setDetections(detections);
		detectLiverSteatosisResponse.setData(data);
	 
	 	return detectLiverSteatosisResponse;
	}
}