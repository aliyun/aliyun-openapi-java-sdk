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

package com.aliyuncs.imagerecog.transform.v20190930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imagerecog.model.v20190930.RecognizeImageColorResponse;
import com.aliyuncs.imagerecog.model.v20190930.RecognizeImageColorResponse.Data;
import com.aliyuncs.imagerecog.model.v20190930.RecognizeImageColorResponse.Data.ColorTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeImageColorResponseUnmarshaller {

	public static RecognizeImageColorResponse unmarshall(RecognizeImageColorResponse recognizeImageColorResponse, UnmarshallerContext _ctx) {
		
		recognizeImageColorResponse.setRequestId(_ctx.stringValue("RecognizeImageColorResponse.RequestId"));

		Data data = new Data();

		List<ColorTemplate> colorTemplateList = new ArrayList<ColorTemplate>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeImageColorResponse.Data.ColorTemplateList.Length"); i++) {
			ColorTemplate colorTemplate = new ColorTemplate();
			colorTemplate.setColor(_ctx.stringValue("RecognizeImageColorResponse.Data.ColorTemplateList["+ i +"].Color"));
			colorTemplate.setLabel(_ctx.stringValue("RecognizeImageColorResponse.Data.ColorTemplateList["+ i +"].Label"));
			colorTemplate.setPercentage(_ctx.floatValue("RecognizeImageColorResponse.Data.ColorTemplateList["+ i +"].Percentage"));

			colorTemplateList.add(colorTemplate);
		}
		data.setColorTemplateList(colorTemplateList);
		recognizeImageColorResponse.setData(data);
	 
	 	return recognizeImageColorResponse;
	}
}