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

import com.aliyuncs.imageprocess.model.v20200320.ScreenECResponse;
import com.aliyuncs.imageprocess.model.v20200320.ScreenECResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.ScreenECResponse.Data.Lesion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ScreenECResponseUnmarshaller {

	public static ScreenECResponse unmarshall(ScreenECResponse screenECResponse, UnmarshallerContext _ctx) {
		
		screenECResponse.setRequestId(_ctx.stringValue("ScreenECResponse.RequestId"));
		screenECResponse.setCode(_ctx.stringValue("ScreenECResponse.Code"));
		screenECResponse.setMessage(_ctx.stringValue("ScreenECResponse.Message"));

		Data data = new Data();

		Lesion lesion = new Lesion();
		lesion.setEsoVolume(_ctx.stringValue("ScreenECResponse.Data.Lesion.EsoVolume"));
		lesion.setEcVolume(_ctx.stringValue("ScreenECResponse.Data.Lesion.EcVolume"));
		lesion.setBenignVolume(_ctx.stringValue("ScreenECResponse.Data.Lesion.BenignVolume"));
		lesion.setMask(_ctx.stringValue("ScreenECResponse.Data.Lesion.Mask"));

		List<String> possibilities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ScreenECResponse.Data.Lesion.Possibilities.Length"); i++) {
			possibilities.add(_ctx.stringValue("ScreenECResponse.Data.Lesion.Possibilities["+ i +"]"));
		}
		lesion.setPossibilities(possibilities);
		data.setLesion(lesion);
		screenECResponse.setData(data);
	 
	 	return screenECResponse;
	}
}