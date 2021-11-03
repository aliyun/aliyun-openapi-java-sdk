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

package com.aliyuncs.objectdet.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.objectdet.model.v20191230.DetectWorkwearResponse;
import com.aliyuncs.objectdet.model.v20191230.DetectWorkwearResponse.Data;
import com.aliyuncs.objectdet.model.v20191230.DetectWorkwearResponse.Data.识别内容;
import com.aliyuncs.objectdet.model.v20191230.DetectWorkwearResponse.Data.识别内容.Rectangles;
import com.aliyuncs.objectdet.model.v20191230.DetectWorkwearResponse.Data.识别内容.识别属性;
import com.aliyuncs.objectdet.model.v20191230.DetectWorkwearResponse.Data.识别内容.识别属性.Probability;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectWorkwearResponseUnmarshaller {

	public static DetectWorkwearResponse unmarshall(DetectWorkwearResponse detectWorkwearResponse, UnmarshallerContext _ctx) {
		
		detectWorkwearResponse.setRequestId(_ctx.stringValue("DetectWorkwearResponse.RequestId"));
		detectWorkwearResponse.setCode(_ctx.stringValue("DetectWorkwearResponse.Code"));
		detectWorkwearResponse.setMessage(_ctx.stringValue("DetectWorkwearResponse.Message"));

		Data data = new Data();

		List<识别内容> elements = new ArrayList<识别内容>();
		for (int i = 0; i < _ctx.lengthValue("DetectWorkwearResponse.Data.Elements.Length"); i++) {
			识别内容 识别内容 = new 识别内容();
			识别内容.setScore(_ctx.doubleValue("DetectWorkwearResponse.Data.Elements["+ i +"].Score"));
			识别内容.setType(_ctx.stringValue("DetectWorkwearResponse.Data.Elements["+ i +"].Type"));

			Rectangles rectangles = new Rectangles();
			rectangles.setHeight(_ctx.longValue("DetectWorkwearResponse.Data.Elements["+ i +"].Rectangles.Height"));
			rectangles.setLeft(_ctx.longValue("DetectWorkwearResponse.Data.Elements["+ i +"].Rectangles.Left"));
			rectangles.setTop(_ctx.longValue("DetectWorkwearResponse.Data.Elements["+ i +"].Rectangles.Top"));
			rectangles.setWidth(_ctx.longValue("DetectWorkwearResponse.Data.Elements["+ i +"].Rectangles.Width"));
			识别内容.setRectangles(rectangles);

			List<识别属性> property = new ArrayList<识别属性>();
			for (int j = 0; j < _ctx.lengthValue("DetectWorkwearResponse.Data.Elements["+ i +"].Property.Length"); j++) {
				识别属性 识别属性 = new 识别属性();
				识别属性.setLabel(_ctx.stringValue("DetectWorkwearResponse.Data.Elements["+ i +"].Property["+ j +"].Label"));

				Probability probability = new Probability();
				probability.setNo(_ctx.doubleValue("DetectWorkwearResponse.Data.Elements["+ i +"].Property["+ j +"].Probability.No"));
				probability.setThreshold(_ctx.longValue("DetectWorkwearResponse.Data.Elements["+ i +"].Property["+ j +"].Probability.Threshold"));
				probability.setUnknown(_ctx.doubleValue("DetectWorkwearResponse.Data.Elements["+ i +"].Property["+ j +"].Probability.Unknown"));
				probability.setYes(_ctx.doubleValue("DetectWorkwearResponse.Data.Elements["+ i +"].Property["+ j +"].Probability.Yes"));
				识别属性.setProbability(probability);

				property.add(识别属性);
			}
			识别内容.setProperty(property);

			elements.add(识别内容);
		}
		data.setElements(elements);
		detectWorkwearResponse.setData(data);
	 
	 	return detectWorkwearResponse;
	}
}