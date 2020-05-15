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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetDWSOpenedscenariosResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSOpenedscenariosResponseUnmarshaller {

	public static GetDWSOpenedscenariosResponse unmarshall(GetDWSOpenedscenariosResponse getDWSOpenedscenariosResponse, UnmarshallerContext _ctx) {
		
		getDWSOpenedscenariosResponse.setRequestId(_ctx.stringValue("GetDWSOpenedscenariosResponse.RequestId"));
		getDWSOpenedscenariosResponse.setResultCode(_ctx.stringValue("GetDWSOpenedscenariosResponse.ResultCode"));
		getDWSOpenedscenariosResponse.setResultMessage(_ctx.stringValue("GetDWSOpenedscenariosResponse.ResultMessage"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSOpenedscenariosResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetDWSOpenedscenariosResponse.Data["+ i +"]"));
		}
		getDWSOpenedscenariosResponse.setData(data);
	 
	 	return getDWSOpenedscenariosResponse;
	}
}