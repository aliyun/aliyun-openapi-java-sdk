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

import com.aliyuncs.imageprocess.model.v20200320.DetectRibFractureResponse;
import com.aliyuncs.imageprocess.model.v20200320.DetectRibFractureResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.DetectRibFractureResponse.Data.DetectionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectRibFractureResponseUnmarshaller {

	public static DetectRibFractureResponse unmarshall(DetectRibFractureResponse detectRibFractureResponse, UnmarshallerContext _ctx) {
		
		detectRibFractureResponse.setRequestId(_ctx.stringValue("DetectRibFractureResponse.RequestId"));

		Data data = new Data();
		data.setResultURL(_ctx.stringValue("DetectRibFractureResponse.Data.ResultURL"));

		List<Float> spacing = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectRibFractureResponse.Data.Spacing.Length"); i++) {
			spacing.add(_ctx.floatValue("DetectRibFractureResponse.Data.Spacing["+ i +"]"));
		}
		data.setSpacing(spacing);

		List<Float> origin = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("DetectRibFractureResponse.Data.Origin.Length"); i++) {
			origin.add(_ctx.floatValue("DetectRibFractureResponse.Data.Origin["+ i +"]"));
		}
		data.setOrigin(origin);

		List<DetectionsItem> detections = new ArrayList<DetectionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectRibFractureResponse.Data.Detections.Length"); i++) {
			DetectionsItem detectionsItem = new DetectionsItem();
			detectionsItem.setFractureId(_ctx.integerValue("DetectRibFractureResponse.Data.Detections["+ i +"].FractureId"));
			detectionsItem.setFractureConfidence(_ctx.floatValue("DetectRibFractureResponse.Data.Detections["+ i +"].FractureConfidence"));
			detectionsItem.setFractureCategory(_ctx.stringValue("DetectRibFractureResponse.Data.Detections["+ i +"].FractureCategory"));

			List<Integer> coordinates = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("DetectRibFractureResponse.Data.Detections["+ i +"].Coordinates.Length"); j++) {
				coordinates.add(_ctx.integerValue("DetectRibFractureResponse.Data.Detections["+ i +"].Coordinates["+ j +"]"));
			}
			detectionsItem.setCoordinates(coordinates);

			List<Integer> coordinateImage = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("DetectRibFractureResponse.Data.Detections["+ i +"].CoordinateImage.Length"); j++) {
				coordinateImage.add(_ctx.integerValue("DetectRibFractureResponse.Data.Detections["+ i +"].CoordinateImage["+ j +"]"));
			}
			detectionsItem.setCoordinateImage(coordinateImage);

			detections.add(detectionsItem);
		}
		data.setDetections(detections);
		detectRibFractureResponse.setData(data);
	 
	 	return detectRibFractureResponse;
	}
}