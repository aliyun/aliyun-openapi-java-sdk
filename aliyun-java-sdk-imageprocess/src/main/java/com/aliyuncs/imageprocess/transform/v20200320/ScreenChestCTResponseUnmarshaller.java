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
import com.aliyuncs.imageprocess.model.v20200320.ScreenChestCTResponse.Data.LungNodule;
import com.aliyuncs.imageprocess.model.v20200320.ScreenChestCTResponse.Data.LungNodule.Serie;
import com.aliyuncs.imageprocess.model.v20200320.ScreenChestCTResponse.Data.LungNodule.Serie.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class ScreenChestCTResponseUnmarshaller {

	public static ScreenChestCTResponse unmarshall(ScreenChestCTResponse screenChestCTResponse, UnmarshallerContext _ctx) {
		
		screenChestCTResponse.setRequestId(_ctx.stringValue("ScreenChestCTResponse.RequestId"));

		Data data = new Data();

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
				element.setCategory(_ctx.stringValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Category"));
				element.setConfidence(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Confidence"));
				element.setDiameter(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Diameter"));
				element.setLobe(_ctx.stringValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Lobe"));
				element.setLung(_ctx.stringValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Lung"));
				element.setX(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].X"));
				element.setZ(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Z"));
				element.setY(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Y"));
				element.setImageX(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].ImageX"));
				element.setImageY(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].ImageY"));
				element.setImageZ(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].ImageZ"));
				element.setSOPInstanceUID(_ctx.stringValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].SOPInstanceUID"));
				element.setVolume(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].Volume"));
				element.setMeanValue(_ctx.floatValue("ScreenChestCTResponse.Data.LungNodule.Series["+ i +"].Elements["+ j +"].MeanValue"));

				elements.add(element);
			}
			serie.setElements(elements);

			series.add(serie);
		}
		lungNodule.setSeries(series);
		data.setLungNodule(lungNodule);

		CACS cACS = new CACS();
		cACS.setScore(_ctx.stringValue("ScreenChestCTResponse.Data.CACS.Score"));
		cACS.setResultUrl(_ctx.stringValue("ScreenChestCTResponse.Data.CACS.ResultUrl"));
		data.setCACS(cACS);

		Covid covid = new Covid();
		covid.setNewProbability(_ctx.stringValue("ScreenChestCTResponse.Data.Covid.NewProbability"));
		covid.setNormalProbability(_ctx.stringValue("ScreenChestCTResponse.Data.Covid.NormalProbability"));
		covid.setOtherProbability(_ctx.stringValue("ScreenChestCTResponse.Data.Covid.OtherProbability"));
		covid.setLesionRatio(_ctx.stringValue("ScreenChestCTResponse.Data.Covid.LesionRatio"));
		covid.setMask(_ctx.stringValue("ScreenChestCTResponse.Data.Covid.Mask"));
		data.setCovid(covid);
		screenChestCTResponse.setData(data);
	 
	 	return screenChestCTResponse;
	}
}