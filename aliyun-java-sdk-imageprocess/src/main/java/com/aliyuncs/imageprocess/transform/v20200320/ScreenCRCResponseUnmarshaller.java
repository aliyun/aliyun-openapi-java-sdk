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

import com.aliyuncs.imageprocess.model.v20200320.ScreenCRCResponse;
import com.aliyuncs.imageprocess.model.v20200320.ScreenCRCResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.ScreenCRCResponse.Data.Lesion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ScreenCRCResponseUnmarshaller {

	public static ScreenCRCResponse unmarshall(ScreenCRCResponse screenCRCResponse, UnmarshallerContext _ctx) {
		
		screenCRCResponse.setRequestId(_ctx.stringValue("ScreenCRCResponse.RequestId"));
		screenCRCResponse.setCode(_ctx.stringValue("ScreenCRCResponse.Code"));
		screenCRCResponse.setMessage(_ctx.stringValue("ScreenCRCResponse.Message"));

		Data data = new Data();

		Lesion lesion = new Lesion();
		lesion.setProbabilities(_ctx.stringValue("ScreenCRCResponse.Data.Lesion.Probabilities"));
		lesion.setStage2Volume(_ctx.stringValue("ScreenCRCResponse.Data.Lesion.Stage2Volume"));
		lesion.setColorectumVolume(_ctx.stringValue("ScreenCRCResponse.Data.Lesion.ColorectumVolume"));
		lesion.setCRCVolume(_ctx.stringValue("ScreenCRCResponse.Data.Lesion.CRCVolume"));
		lesion.setNonCRCVolumel(_ctx.stringValue("ScreenCRCResponse.Data.Lesion.NonCRCVolumel"));
		lesion.setMask(_ctx.stringValue("ScreenCRCResponse.Data.Lesion.Mask"));
		data.setLesion(lesion);
		screenCRCResponse.setData(data);
	 
	 	return screenCRCResponse;
	}
}