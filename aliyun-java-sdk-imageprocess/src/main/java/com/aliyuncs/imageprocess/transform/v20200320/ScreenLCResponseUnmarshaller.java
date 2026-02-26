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

import com.aliyuncs.imageprocess.model.v20200320.ScreenLCResponse;
import com.aliyuncs.imageprocess.model.v20200320.ScreenLCResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.ScreenLCResponse.Data.Lesion;
import com.aliyuncs.imageprocess.model.v20200320.ScreenLCResponse.Data.Lesion.LesionListItem;
import com.aliyuncs.imageprocess.model.v20200320.ScreenLCResponse.Data.Lesion.PatientLevelResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ScreenLCResponseUnmarshaller {

	public static ScreenLCResponse unmarshall(ScreenLCResponse screenLCResponse, UnmarshallerContext _ctx) {
		
		screenLCResponse.setRequestId(_ctx.stringValue("ScreenLCResponse.RequestId"));
		screenLCResponse.setCode(_ctx.stringValue("ScreenLCResponse.Code"));
		screenLCResponse.setMessage(_ctx.stringValue("ScreenLCResponse.Message"));

		Data data = new Data();

		Lesion lesion = new Lesion();
		lesion.setMask(_ctx.stringValue("ScreenLCResponse.Data.Lesion.Mask"));
		lesion.setLiverVolume(_ctx.floatValue("ScreenLCResponse.Data.Lesion.LiverVolume"));

		PatientLevelResult patientLevelResult = new PatientLevelResult();
		patientLevelResult.setTumorNonCystProb(_ctx.floatValue("ScreenLCResponse.Data.Lesion.PatientLevelResult.TumorNonCystProb"));
		patientLevelResult.setHCCProb(_ctx.floatValue("ScreenLCResponse.Data.Lesion.PatientLevelResult.HCCProb"));
		patientLevelResult.setMalignantNonHCCProb(_ctx.floatValue("ScreenLCResponse.Data.Lesion.PatientLevelResult.MalignantNonHCCProb"));
		patientLevelResult.setBenignNonCystProb(_ctx.stringValue("ScreenLCResponse.Data.Lesion.PatientLevelResult.BenignNonCystProb"));
		patientLevelResult.setCystProb(_ctx.floatValue("ScreenLCResponse.Data.Lesion.PatientLevelResult.CystProb"));
		lesion.setPatientLevelResult(patientLevelResult);

		List<LesionListItem> lesionList = new ArrayList<LesionListItem>();
		for (int i = 0; i < _ctx.lengthValue("ScreenLCResponse.Data.Lesion.LesionList.Length"); i++) {
			LesionListItem lesionListItem = new LesionListItem();
			lesionListItem.setType(_ctx.stringValue("ScreenLCResponse.Data.Lesion.LesionList["+ i +"].Type"));
			lesionListItem.setVolume(_ctx.floatValue("ScreenLCResponse.Data.Lesion.LesionList["+ i +"].Volume"));
			lesionListItem.setKeySlice(_ctx.longValue("ScreenLCResponse.Data.Lesion.LesionList["+ i +"].KeySlice"));
			lesionListItem.setMalignancy(_ctx.floatValue("ScreenLCResponse.Data.Lesion.LesionList["+ i +"].Malignancy"));

			List<Float> recistEndpoints = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("ScreenLCResponse.Data.Lesion.LesionList["+ i +"].RecistEndpoints.Length"); j++) {
				recistEndpoints.add(_ctx.floatValue("ScreenLCResponse.Data.Lesion.LesionList["+ i +"].RecistEndpoints["+ j +"]"));
			}
			lesionListItem.setRecistEndpoints(recistEndpoints);

			List<Float> diameter = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("ScreenLCResponse.Data.Lesion.LesionList["+ i +"].Diameter.Length"); j++) {
				diameter.add(_ctx.floatValue("ScreenLCResponse.Data.Lesion.LesionList["+ i +"].Diameter["+ j +"]"));
			}
			lesionListItem.setDiameter(diameter);

			lesionList.add(lesionListItem);
		}
		lesion.setLesionList(lesionList);
		data.setLesion(lesion);
		screenLCResponse.setData(data);
	 
	 	return screenLCResponse;
	}
}