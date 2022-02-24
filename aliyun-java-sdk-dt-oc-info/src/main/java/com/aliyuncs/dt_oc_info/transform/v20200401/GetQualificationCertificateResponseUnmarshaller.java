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

package com.aliyuncs.dt_oc_info.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20200401.GetQualificationCertificateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualificationCertificateResponseUnmarshaller {

	public static GetQualificationCertificateResponse unmarshall(GetQualificationCertificateResponse getQualificationCertificateResponse, UnmarshallerContext _ctx) {
		
		getQualificationCertificateResponse.setRequestId(_ctx.stringValue("GetQualificationCertificateResponse.RequestId"));
		getQualificationCertificateResponse.setCode(_ctx.integerValue("GetQualificationCertificateResponse.Code"));
		getQualificationCertificateResponse.setMessage(_ctx.stringValue("GetQualificationCertificateResponse.Message"));
		getQualificationCertificateResponse.setTotal(_ctx.integerValue("GetQualificationCertificateResponse.Total"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetQualificationCertificateResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetQualificationCertificateResponse.Data["+ i +"]"));
		}
		getQualificationCertificateResponse.setData(data);
	 
	 	return getQualificationCertificateResponse;
	}
}