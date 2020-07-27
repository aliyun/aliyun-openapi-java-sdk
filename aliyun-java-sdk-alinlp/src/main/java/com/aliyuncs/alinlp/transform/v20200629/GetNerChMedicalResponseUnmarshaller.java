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

package com.aliyuncs.alinlp.transform.v20200629;

import com.aliyuncs.alinlp.model.v20200629.GetNerChMedicalResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNerChMedicalResponseUnmarshaller {

	public static GetNerChMedicalResponse unmarshall(GetNerChMedicalResponse getNerChMedicalResponse, UnmarshallerContext _ctx) {
		
		getNerChMedicalResponse.setRequestId(_ctx.stringValue("GetNerChMedicalResponse.RequestId"));
		getNerChMedicalResponse.setData(_ctx.stringValue("GetNerChMedicalResponse.Data"));
	 
	 	return getNerChMedicalResponse;
	}
}