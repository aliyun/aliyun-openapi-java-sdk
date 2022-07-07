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

package com.aliyuncs.onsmqtt.transform.v20200420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.onsmqtt.model.v20200420.ListCaCertificateResponse;
import com.aliyuncs.onsmqtt.model.v20200420.ListCaCertificateResponse.Data;
import com.aliyuncs.onsmqtt.model.v20200420.ListCaCertificateResponse.Data.CaCertificateVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCaCertificateResponseUnmarshaller {

	public static ListCaCertificateResponse unmarshall(ListCaCertificateResponse listCaCertificateResponse, UnmarshallerContext _ctx) {
		
		listCaCertificateResponse.setRequestId(_ctx.stringValue("ListCaCertificateResponse.RequestId"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListCaCertificateResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("ListCaCertificateResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListCaCertificateResponse.Data.PageSize"));

		List<CaCertificateVO> caCertificateVOS = new ArrayList<CaCertificateVO>();
		for (int i = 0; i < _ctx.lengthValue("ListCaCertificateResponse.Data.CaCertificateVOS.Length"); i++) {
			CaCertificateVO caCertificateVO = new CaCertificateVO();
			caCertificateVO.setRegistrationCode(_ctx.stringValue("ListCaCertificateResponse.Data.CaCertificateVOS["+ i +"].RegistrationCode"));
			caCertificateVO.setCaName(_ctx.stringValue("ListCaCertificateResponse.Data.CaCertificateVOS["+ i +"].CaName"));
			caCertificateVO.setSn(_ctx.stringValue("ListCaCertificateResponse.Data.CaCertificateVOS["+ i +"].Sn"));
			caCertificateVO.setCaContent(_ctx.stringValue("ListCaCertificateResponse.Data.CaCertificateVOS["+ i +"].CaContent"));
			caCertificateVO.setVerificationContent(_ctx.stringValue("ListCaCertificateResponse.Data.CaCertificateVOS["+ i +"].VerificationContent"));
			caCertificateVO.setValidBegin(_ctx.stringValue("ListCaCertificateResponse.Data.CaCertificateVOS["+ i +"].ValidBegin"));
			caCertificateVO.setValidEnd(_ctx.stringValue("ListCaCertificateResponse.Data.CaCertificateVOS["+ i +"].ValidEnd"));
			caCertificateVO.setStatus(_ctx.stringValue("ListCaCertificateResponse.Data.CaCertificateVOS["+ i +"].Status"));

			caCertificateVOS.add(caCertificateVO);
		}
		data.setCaCertificateVOS(caCertificateVOS);
		listCaCertificateResponse.setData(data);
	 
	 	return listCaCertificateResponse;
	}
}