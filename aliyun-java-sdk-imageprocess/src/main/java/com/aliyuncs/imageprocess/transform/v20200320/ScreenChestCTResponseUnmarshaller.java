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

import com.aliyuncs.imageprocess.model.v20200320.ScreenChestCTResponse;
import com.aliyuncs.imageprocess.model.v20200320.ScreenChestCTResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.ScreenChestCTResponse.Data.CACS;
import com.aliyuncs.imageprocess.model.v20200320.ScreenChestCTResponse.Data.Covid;
import com.aliyuncs.imageprocess.model.v20200320.ScreenChestCTResponse.Data.DetectRibFracture;
import com.aliyuncs.imageprocess.model.v20200320.ScreenChestCTResponse.Data.DetectRibFracture.DetectionsItem;
import com.aliyuncs.imageprocess.model.v20200320.ScreenChestCTResponse.Data.LungNodule;
import com.aliyuncs.imageprocess.model.v20200320.ScreenChestCTResponse.Data.LungNodule.Serie;
import com.aliyuncs.imageprocess.model.v20200320.ScreenChestCTResponse.Data.LungNodule.Serie.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class ScreenChestCTResponseUnmarshaller {

	public static ScreenChestCTResponse unmarshall(ScreenChestCTResponse screenChestCTResponse, UnmarshallerContext _ctx) {
		
		screenChestCTResponse.setRequestId(_ctx.stringValue("ScreenChestCTResponse.RequestId"));
		screenChestCTResponse.setCode(_ctx.stringValue("ScreenChestCTResponse.Code"));
		screenChestCTResponse.setMessage(_ctx.stringValue("ScreenChestCTResponse.Message"));

		Data data = new Data();
		data.setErrorMessage(_ctx.stringValue("ScreenChestCTResponse.Data.ErrorMessage"));

		LungNodule lungNodule = new LungNodule();

		List<Serie> series = new ArrayList<Serie>();
		for (int i = 0; i < _ctx.lengthValue("ScreenChestCTResponse.Data.LungNodule.Series.Length"); i++) {
			Serie serie = new Serie();
			serie.setSeriesInstanceUid(_ctx.stringValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].SeriesInstanceUid"));
			serie.setReport(_ctx.stringValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Report"));

			List<Float> origin = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Origin.Length"); j++) {
				origin.add(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Origin["+ j +"]"));
			}
			serie.setOrigin(origin);

			List<Float> spacing = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Spacing.Length"); j++) {
				spacing.add(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Spacing["+ j +"]"));
			}
			serie.setSpacing(spacing);

			List<Element> elements = new ArrayList<Element>();
			for (int j = 0; j < _ctx.lengthValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements.Length"); j++) {
				Element element = new Element();
				element.setLobe(_ctx.stringValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Lobe"));
				element.setMeanValue(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].MeanValue"));
				element.setLung(_ctx.stringValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Lung"));
				element.setConfidence(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Confidence"));
				element.setSOPInstanceUID(_ctx.stringValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].SOPInstanceUID"));
				element.setCategory(_ctx.stringValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Category"));
				element.setVolume(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Volume"));
				element.setDiameter(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Diameter"));
				element.setX(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].X"));
				element.setY(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Y"));
				element.setZ(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Z"));
				element.setImageX(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].ImageX"));
				element.setImageY(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].ImageY"));
				element.setImageZ(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].ImageZ"));

				elements.add(element);
			}
			serie.setElements(elements);

			series.add(serie);
		}
		lungNodule.setSeries(series);
		data.setLungNodule(lungNodule);

		CACS cACS = new CACS();
		cACS.setResultUrl(_ctx.stringValue("ScreenChestCTResponse.Data.CACS.ResultUrl"));
		cACS.setScore(_ctx.stringValue("ScreenChestCTResponse.Data.CACS.Score"));
		data.setCACS(cACS);

		Covid covid = new Covid();
		covid.setNormalProbability(_ctx.stringValue("ScreenChestCTResponse.Data.Covid.NormalProbability"));
		covid.setNewProbability(_ctx.stringValue("ScreenChestCTResponse.Data.Covid.NewProbability"));
		covid.setLesionRatio(_ctx.stringValue("ScreenChestCTResponse.Data.Covid.LesionRatio"));
		covid.setOtherProbability(_ctx.stringValue("ScreenChestCTResponse.Data.Covid.OtherProbability"));
		covid.setMask(_ctx.stringValue("ScreenChestCTResponse.Data.Covid.Mask"));
		data.setCovid(covid);

		DetectRibFracture detectRibFracture = new DetectRibFracture();
		detectRibFracture.setResultURL(_ctx.stringValue("ScreenChestCTResponse.Data.DetectRibFracture.ResultURL"));

		List<Float> spacing1 = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("ScreenChestCTResponse.Data.DetectRibFracture.Spacing.Length"); i++) {
			spacing1.add(_ctx.floatValue("ScreenChestCTResponse.Data.DetectRibFracture.Spacing["+ i +"]"));
		}
		detectRibFracture.setSpacing1(spacing1);

		List<Float> origin2 = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("ScreenChestCTResponse.Data.DetectRibFracture.Origin.Length"); i++) {
			origin2.add(_ctx.floatValue("ScreenChestCTResponse.Data.DetectRibFracture.Origin["+ i +"]"));
		}
		detectRibFracture.setOrigin2(origin2);

		List<DetectionsItem> detections = new ArrayList<DetectionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ScreenChestCTResponse.Data.DetectRibFracture.Detections.Length"); i++) {
			DetectionsItem detectionsItem = new DetectionsItem();
			detectionsItem.setFractureId(_ctx.longValue("ScreenChestCTResponse.Data.DetectRibFracture.Detections["+ i +"].FractureId"));
			detectionsItem.setFractureConfidence(_ctx.floatValue("ScreenChestCTResponse.Data.DetectRibFracture.Detections["+ i +"].FractureConfidence"));
			detectionsItem.setFractureCategory(_ctx.longValue("ScreenChestCTResponse.Data.DetectRibFracture.Detections["+ i +"].FractureCategory"));
			detectionsItem.setFractureLocation(_ctx.stringValue("ScreenChestCTResponse.Data.DetectRibFracture.Detections["+ i +"].FractureLocation"));
			detectionsItem.setFractureSegment(_ctx.longValue("ScreenChestCTResponse.Data.DetectRibFracture.Detections["+ i +"].FractureSegment"));

			List<Long> coordinates = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ScreenChestCTResponse.Data.DetectRibFracture.Detections["+ i +"].Coordinates.Length"); j++) {
				coordinates.add(_ctx.longValue("ScreenChestCTResponse.Data.DetectRibFracture.Detections["+ i +"].Coordinates["+ j +"]"));
			}
			detectionsItem.setCoordinates(coordinates);

			List<Long> coordinateImage = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ScreenChestCTResponse.Data.DetectRibFracture.Detections["+ i +"].CoordinateImage.Length"); j++) {
				coordinateImage.add(_ctx.longValue("ScreenChestCTResponse.Data.DetectRibFracture.Detections["+ i +"].CoordinateImage["+ j +"]"));
			}
			detectionsItem.setCoordinateImage(coordinateImage);

			detections.add(detectionsItem);
		}
		detectRibFracture.setDetections(detections);
		data.setDetectRibFracture(detectRibFracture);
		screenChestCTResponse.setData(data);
	 
	 	return screenChestCTResponse;
	}
}