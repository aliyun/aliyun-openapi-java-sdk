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

package com.aliyuncs.brinekingdom.transform.v20190627;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.brinekingdom.model.v20190627.ListAllZoneResponse;
import com.aliyuncs.brinekingdom.model.v20190627.ListAllZoneResponse.区域;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllZoneResponseUnmarshaller {

	public static ListAllZoneResponse unmarshall(ListAllZoneResponse listAllZoneResponse, UnmarshallerContext _ctx) {
		
		listAllZoneResponse.setErrorMessage(_ctx.stringValue("ListAllZoneResponse.ErrorMessage"));
		listAllZoneResponse.setResultCode(_ctx.stringValue("ListAllZoneResponse.ResultCode"));
		listAllZoneResponse.setSuccess(_ctx.booleanValue("ListAllZoneResponse.Success"));
		listAllZoneResponse.set_Class(_ctx.stringValue("ListAllZoneResponse.Class"));

		List<区域> result = new ArrayList<区域>();
		for (int i = 0; i < _ctx.lengthValue("ListAllZoneResponse.Result.Length"); i++) {
			区域 区域 = new 区域();
			区域.setKey(_ctx.stringValue("ListAllZoneResponse.Result["+ i +"].Key"));
			区域.setValue(_ctx.stringValue("ListAllZoneResponse.Result["+ i +"].Value"));

			result.add(区域);
		}
		listAllZoneResponse.setResult(result);
	 
	 	return listAllZoneResponse;
	}
}