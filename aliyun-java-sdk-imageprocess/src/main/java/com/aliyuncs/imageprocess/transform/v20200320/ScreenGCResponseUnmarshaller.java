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

import com.aliyuncs.imageprocess.model.v20200320.ScreenGCResponse;
import com.aliyuncs.imageprocess.model.v20200320.ScreenGCResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.ScreenGCResponse.Data.Lesion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ScreenGCResponseUnmarshaller {

	public static ScreenGCResponse unmarshall(ScreenGCResponse screenGCResponse, UnmarshallerContext _ctx) {
		
		screenGCResponse.setRequestId(_ctx.stringValue("ScreenGCResponse.RequestId"));
		screenGCResponse.setCode(_ctx.stringValue("ScreenGCResponse.Code"));
		screenGCResponse.setMessage(_ctx.stringValue("ScreenGCResponse.Message"));

		Data data = new Data();

		Lesion lesion = new Lesion();
		lesion.setProbabilities(_ctx.stringValue("ScreenGCResponse.Data.Lesion.Probabilities"));
		lesion.setStage2Volume(_ctx.stringValue("ScreenGCResponse.Data.Lesion.Stage2Volume"));
		lesion.setStomachVolume(_ctx.stringValue("ScreenGCResponse.Data.Lesion.StomachVolume"));
		lesion.setGCVolume(_ctx.stringValue("ScreenGCResponse.Data.Lesion.GCVolume"));
		lesion.setNonGCVolume(_ctx.stringValue("ScreenGCResponse.Data.Lesion.NonGCVolume"));
		lesion.setMask(_ctx.stringValue("ScreenGCResponse.Data.Lesion.Mask"));
		data.setLesion(lesion);
		screenGCResponse.setData(data);
	 
	 	return screenGCResponse;
	}
}