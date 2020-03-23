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

import com.aliyuncs.ocr.model.v20191230.RecognizePassportMRZResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizePassportMRZResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizePassportMRZResponse.Data.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizePassportMRZResponseUnmarshaller {

	public static RecognizePassportMRZResponse unmarshall(RecognizePassportMRZResponse recognizePassportMRZResponse, UnmarshallerContext _ctx) {
		
		recognizePassportMRZResponse.setRequestId(_ctx.stringValue("RecognizePassportMRZResponse.RequestId"));

		Data data = new Data();

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("RecognizePassportMRZResponse.Data.Regions.Length"); i++) {
			Region region = new Region();
			region.setName(_ctx.stringValue("RecognizePassportMRZResponse.Data.Regions["+ i +"].Name"));
			region.setRecognitionScore(_ctx.floatValue("RecognizePassportMRZResponse.Data.Regions["+ i +"].RecognitionScore"));
			region.setContent(_ctx.stringValue("RecognizePassportMRZResponse.Data.Regions["+ i +"].Content"));
			region.setDetectionScore(_ctx.floatValue("RecognizePassportMRZResponse.Data.Regions["+ i +"].DetectionScore"));

			List<Float> bandBoxes = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("RecognizePassportMRZResponse.Data.Regions["+ i +"].BandBoxes.Length"); j++) {
				bandBoxes.add(_ctx.floatValue("RecognizePassportMRZResponse.Data.Regions["+ i +"].BandBoxes["+ j +"]"));
			}
			region.setBandBoxes(bandBoxes);

			regions.add(region);
		}
		data.setRegions(regions);
		recognizePassportMRZResponse.setData(data);
	 
	 	return recognizePassportMRZResponse;
	}
}