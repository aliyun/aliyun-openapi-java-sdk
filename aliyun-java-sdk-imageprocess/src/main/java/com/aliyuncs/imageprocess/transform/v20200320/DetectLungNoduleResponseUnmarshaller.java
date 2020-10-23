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

import com.aliyuncs.imageprocess.model.v20200320.DetectLungNoduleResponse;
import com.aliyuncs.imageprocess.model.v20200320.DetectLungNoduleResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.DetectLungNoduleResponse.Data.Serie;
import com.aliyuncs.imageprocess.model.v20200320.DetectLungNoduleResponse.Data.Serie.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectLungNoduleResponseUnmarshaller {

	public static DetectLungNoduleResponse unmarshall(DetectLungNoduleResponse detectLungNoduleResponse, UnmarshallerContext _ctx) {
		
		detectLungNoduleResponse.setRequestId(_ctx.stringValue("DetectLungNoduleResponse.RequestId"));

		Data data = new Data();

		List<Serie> series = new ArrayList<Serie>();
		for (int i = 0; i < _ctx.lengthValue("DetectLungNoduleResponse.Data.Series.Length"); i++) {
			Serie serie = new Serie();
			serie.setSeriesInstanceUid(_ctx.stringValue("DetectLungNoduleResponse.Data.Series["+ i +"].SeriesInstanceUid"));

			List<Float> origin = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("DetectLungNoduleResponse.Data.Series["+ i +"].Origin.Length"); j++) {
				origin.add(_ctx.floatValue("DetectLungNoduleResponse.Data.Series["+ i +"].Origin["+ j +"]"));
			}
			serie.setOrigin(origin);

			List<Float> spacing = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("DetectLungNoduleResponse.Data.Series["+ i +"].Spacing.Length"); j++) {
				spacing.add(_ctx.floatValue("DetectLungNoduleResponse.Data.Series["+ i +"].Spacing["+ j +"]"));
			}
			serie.setSpacing(spacing);

			List<Element> elements = new ArrayList<Element>();
			for (int j = 0; j < _ctx.lengthValue("DetectLungNoduleResponse.Data.Series["+ i +"].Elements.Length"); j++) {
				Element element = new Element();
				element.setCategory(_ctx.stringValue("DetectLungNoduleResponse.Data.Series["+ i +"].Elements["+ j +"].Category"));
				element.setConfidence(_ctx.floatValue("DetectLungNoduleResponse.Data.Series["+ i +"].Elements["+ j +"].Confidence"));
				element.setDiameter(_ctx.floatValue("DetectLungNoduleResponse.Data.Series["+ i +"].Elements["+ j +"].Diameter"));
				element.setLobe(_ctx.stringValue("DetectLungNoduleResponse.Data.Series["+ i +"].Elements["+ j +"].Lobe"));
				element.setLung(_ctx.stringValue("DetectLungNoduleResponse.Data.Series["+ i +"].Elements["+ j +"].Lung"));
				element.setX(_ctx.floatValue("DetectLungNoduleResponse.Data.Series["+ i +"].Elements["+ j +"].X"));
				element.setZ(_ctx.floatValue("DetectLungNoduleResponse.Data.Series["+ i +"].Elements["+ j +"].Z"));
				element.setY(_ctx.floatValue("DetectLungNoduleResponse.Data.Series["+ i +"].Elements["+ j +"].Y"));
				element.setImageX(_ctx.floatValue("DetectLungNoduleResponse.Data.Series["+ i +"].Elements["+ j +"].ImageX"));
				element.setImageY(_ctx.floatValue("DetectLungNoduleResponse.Data.Series["+ i +"].Elements["+ j +"].ImageY"));
				element.setImageZ(_ctx.floatValue("DetectLungNoduleResponse.Data.Series["+ i +"].Elements["+ j +"].ImageZ"));
				element.setSOPInstanceUID(_ctx.stringValue("DetectLungNoduleResponse.Data.Series["+ i +"].Elements["+ j +"].SOPInstanceUID"));

				elements.add(element);
			}
			serie.setElements(elements);

			series.add(serie);
		}
		data.setSeries(series);
		detectLungNoduleResponse.setData(data);
	 
	 	return detectLungNoduleResponse;
	}
}