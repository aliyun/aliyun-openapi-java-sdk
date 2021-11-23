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

package com.aliyuncs.ocr.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ocr.model.v20191230.RecognizeVideoCharacterResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeVideoCharacterResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeVideoCharacterResponse.Data.Frame;
import com.aliyuncs.ocr.model.v20191230.RecognizeVideoCharacterResponse.Data.Frame.Element;
import com.aliyuncs.ocr.model.v20191230.RecognizeVideoCharacterResponse.Data.Frame.Element.TextRectangle;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeVideoCharacterResponseUnmarshaller {

	public static RecognizeVideoCharacterResponse unmarshall(RecognizeVideoCharacterResponse recognizeVideoCharacterResponse, UnmarshallerContext _ctx) {
		
		recognizeVideoCharacterResponse.setRequestId(_ctx.stringValue("RecognizeVideoCharacterResponse.RequestId"));

		Data data = new Data();
		data.setWidth(_ctx.longValue("RecognizeVideoCharacterResponse.Data.Width"));
		data.setHeight(_ctx.longValue("RecognizeVideoCharacterResponse.Data.Height"));

		List<Frame> frames = new ArrayList<Frame>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVideoCharacterResponse.Data.Frames.Length"); i++) {
			Frame frame = new Frame();
			frame.setTimestamp(_ctx.longValue("RecognizeVideoCharacterResponse.Data.Frames["+ i +"].Timestamp"));

			List<Element> elements = new ArrayList<Element>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeVideoCharacterResponse.Data.Frames["+ i +"].Elements.Length"); j++) {
				Element element = new Element();
				element.setScore(_ctx.floatValue("RecognizeVideoCharacterResponse.Data.Frames["+ i +"].Elements["+ j +"].Score"));
				element.setText(_ctx.stringValue("RecognizeVideoCharacterResponse.Data.Frames["+ i +"].Elements["+ j +"].Text"));

				List<TextRectangle> textRectangles = new ArrayList<TextRectangle>();
				for (int k = 0; k < _ctx.lengthValue("RecognizeVideoCharacterResponse.Data.Frames["+ i +"].Elements["+ j +"].TextRectangles.Length"); k++) {
					TextRectangle textRectangle = new TextRectangle();
					textRectangle.setAngle(_ctx.longValue("RecognizeVideoCharacterResponse.Data.Frames["+ i +"].Elements["+ j +"].TextRectangles["+ k +"].Angle"));
					textRectangle.setLeft(_ctx.longValue("RecognizeVideoCharacterResponse.Data.Frames["+ i +"].Elements["+ j +"].TextRectangles["+ k +"].Left"));
					textRectangle.setTop(_ctx.longValue("RecognizeVideoCharacterResponse.Data.Frames["+ i +"].Elements["+ j +"].TextRectangles["+ k +"].Top"));
					textRectangle.setWidth(_ctx.longValue("RecognizeVideoCharacterResponse.Data.Frames["+ i +"].Elements["+ j +"].TextRectangles["+ k +"].Width"));
					textRectangle.setHeight(_ctx.longValue("RecognizeVideoCharacterResponse.Data.Frames["+ i +"].Elements["+ j +"].TextRectangles["+ k +"].Height"));

					textRectangles.add(textRectangle);
				}
				element.setTextRectangles(textRectangles);

				elements.add(element);
			}
			frame.setElements(elements);

			frames.add(frame);
		}
		data.setFrames(frames);
		recognizeVideoCharacterResponse.setData(data);
	 
	 	return recognizeVideoCharacterResponse;
	}
}