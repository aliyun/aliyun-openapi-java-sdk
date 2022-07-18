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

import com.aliyuncs.onsmqtt.model.v20200420.ListDeviceCertificateResponse;
import com.aliyuncs.onsmqtt.model.v20200420.ListDeviceCertificateResponse.Data;
import com.aliyuncs.onsmqtt.model.v20200420.ListDeviceCertificateResponse.Data.DeviceCertificateVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceCertificateResponseUnmarshaller {

	public static ListDeviceCertificateResponse unmarshall(ListDeviceCertificateResponse listDeviceCertificateResponse, UnmarshallerContext _ctx) {
		
		listDeviceCertificateResponse.setRequestId(_ctx.stringValue("ListDeviceCertificateResponse.RequestId"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListDeviceCertificateResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("ListDeviceCertificateResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListDeviceCertificateResponse.Data.PageSize"));

		List<DeviceCertificateVO> deviceCertificateVOS = new ArrayList<DeviceCertificateVO>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceCertificateResponse.Data.DeviceCertificateVOS.Length"); i++) {
			DeviceCertificateVO deviceCertificateVO = new DeviceCertificateVO();
			deviceCertificateVO.setValidBegin(_ctx.stringValue("ListDeviceCertificateResponse.Data.DeviceCertificateVOS["+ i +"].ValidBegin"));
			deviceCertificateVO.setValidEnd(_ctx.stringValue("ListDeviceCertificateResponse.Data.DeviceCertificateVOS["+ i +"].ValidEnd"));
			deviceCertificateVO.setDeviceSn(_ctx.stringValue("ListDeviceCertificateResponse.Data.DeviceCertificateVOS["+ i +"].DeviceSn"));
			deviceCertificateVO.setDeviceContent(_ctx.stringValue("ListDeviceCertificateResponse.Data.DeviceCertificateVOS["+ i +"].DeviceContent"));
			deviceCertificateVO.setStatus(_ctx.stringValue("ListDeviceCertificateResponse.Data.DeviceCertificateVOS["+ i +"].Status"));
			deviceCertificateVO.setCaSn(_ctx.stringValue("ListDeviceCertificateResponse.Data.DeviceCertificateVOS["+ i +"].CaSn"));
			deviceCertificateVO.setDeviceName(_ctx.stringValue("ListDeviceCertificateResponse.Data.DeviceCertificateVOS["+ i +"].DeviceName"));

			deviceCertificateVOS.add(deviceCertificateVO);
		}
		data.setDeviceCertificateVOS(deviceCertificateVOS);
		listDeviceCertificateResponse.setData(data);
	 
	 	return listDeviceCertificateResponse;
	}
}