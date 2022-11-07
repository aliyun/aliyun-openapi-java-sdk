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

import com.aliyuncs.imageprocess.model.v20200320.DetectPancResponse;
import com.aliyuncs.imageprocess.model.v20200320.DetectPancResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.DetectPancResponse.Data.Lesion;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectPancResponseUnmarshaller {

	public static DetectPancResponse unmarshall(DetectPancResponse detectPancResponse, UnmarshallerContext _ctx) {
		
		detectPancResponse.setRequestId(_ctx.stringValue("DetectPancResponse.RequestId"));
		detectPancResponse.setCode(_ctx.stringValue("DetectPancResponse.Code"));
		detectPancResponse.setMessage(_ctx.stringValue("DetectPancResponse.Message"));

		Data data = new Data();

		Lesion lesion = new Lesion();
		lesion.setPancVol(_ctx.stringValue("DetectPancResponse.Data.Lesion.PancVol"));
		lesion.setPdacVol(_ctx.stringValue("DetectPancResponse.Data.Lesion.PdacVol"));
		lesion.setNonPdacVol(_ctx.stringValue("DetectPancResponse.Data.Lesion.NonPdacVol"));
		lesion.setMask(_ctx.stringValue("DetectPancResponse.Data.Lesion.Mask"));

		List<String> possibilities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DetectPancResponse.Data.Lesion.Possibilities.Length"); i++) {
			possibilities.add(_ctx.stringValue("DetectPancResponse.Data.Lesion.Possibilities["+ i +"]"));
		}
		lesion.setPossibilities(possibilities);
		data.setLesion(lesion);
		detectPancResponse.setData(data);
	 
	 	return detectPancResponse;
	}
}