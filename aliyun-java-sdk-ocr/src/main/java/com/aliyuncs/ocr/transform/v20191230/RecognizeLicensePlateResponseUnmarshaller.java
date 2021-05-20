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

import com.aliyuncs.ocr.model.v20191230.RecognizeLicensePlateResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeLicensePlateResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeLicensePlateResponse.Data.Plate;
import com.aliyuncs.ocr.model.v20191230.RecognizeLicensePlateResponse.Data.Plate.PositionsItem;
import com.aliyuncs.ocr.model.v20191230.RecognizeLicensePlateResponse.Data.Plate.Roi;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeLicensePlateResponseUnmarshaller {

	public static RecognizeLicensePlateResponse unmarshall(RecognizeLicensePlateResponse recognizeLicensePlateResponse, UnmarshallerContext _ctx) {
		
		recognizeLicensePlateResponse.setRequestId(_ctx.stringValue("RecognizeLicensePlateResponse.RequestId"));
		recognizeLicensePlateResponse.setCode(_ctx.stringValue("RecognizeLicensePlateResponse.Code"));
		recognizeLicensePlateResponse.setMessage(_ctx.stringValue("RecognizeLicensePlateResponse.Message"));

		Data data = new Data();

		List<Plate> plates = new ArrayList<Plate>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeLicensePlateResponse.Data.Plates.Length"); i++) {
			Plate plate = new Plate();
			plate.setPlateTypeConfidence(_ctx.floatValue("RecognizeLicensePlateResponse.Data.Plates["+ i +"].PlateTypeConfidence"));
			plate.setPlateType(_ctx.stringValue("RecognizeLicensePlateResponse.Data.Plates["+ i +"].PlateType"));
			plate.setConfidence(_ctx.floatValue("RecognizeLicensePlateResponse.Data.Plates["+ i +"].Confidence"));
			plate.setPlateNumber(_ctx.stringValue("RecognizeLicensePlateResponse.Data.Plates["+ i +"].PlateNumber"));

			Roi roi = new Roi();
			roi.setW(_ctx.integerValue("RecognizeLicensePlateResponse.Data.Plates["+ i +"].Roi.W"));
			roi.setH(_ctx.integerValue("RecognizeLicensePlateResponse.Data.Plates["+ i +"].Roi.H"));
			roi.setY(_ctx.integerValue("RecognizeLicensePlateResponse.Data.Plates["+ i +"].Roi.Y"));
			roi.setX(_ctx.integerValue("RecognizeLicensePlateResponse.Data.Plates["+ i +"].Roi.X"));
			plate.setRoi(roi);

			List<PositionsItem> positions = new ArrayList<PositionsItem>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeLicensePlateResponse.Data.Plates["+ i +"].Positions.Length"); j++) {
				PositionsItem positionsItem = new PositionsItem();
				positionsItem.setX(_ctx.longValue("RecognizeLicensePlateResponse.Data.Plates["+ i +"].Positions["+ j +"].X"));
				positionsItem.setY(_ctx.longValue("RecognizeLicensePlateResponse.Data.Plates["+ i +"].Positions["+ j +"].Y"));

				positions.add(positionsItem);
			}
			plate.setPositions(positions);

			plates.add(plate);
		}
		data.setPlates(plates);
		recognizeLicensePlateResponse.setData(data);
	 
	 	return recognizeLicensePlateResponse;
	}
}