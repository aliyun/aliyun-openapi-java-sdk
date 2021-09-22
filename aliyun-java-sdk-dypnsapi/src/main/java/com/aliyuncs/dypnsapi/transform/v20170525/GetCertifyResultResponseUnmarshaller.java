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

package com.aliyuncs.dypnsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dypnsapi.model.v20170525.GetCertifyResultResponse;
import com.aliyuncs.dypnsapi.model.v20170525.GetCertifyResultResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCertifyResultResponseUnmarshaller {

	public static GetCertifyResultResponse unmarshall(GetCertifyResultResponse getCertifyResultResponse, UnmarshallerContext _ctx) {
		
		getCertifyResultResponse.setRequestId(_ctx.stringValue("GetCertifyResultResponse.RequestId"));
		getCertifyResultResponse.setCode(_ctx.stringValue("GetCertifyResultResponse.Code"));
		getCertifyResultResponse.setMessage(_ctx.stringValue("GetCertifyResultResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCertifyResultResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setMaterialInfo(_ctx.stringValue("GetCertifyResultResponse.Data["+ i +"].MaterialInfo"));
			dataItem.setIdentityInfo(_ctx.stringValue("GetCertifyResultResponse.Data["+ i +"].IdentityInfo"));
			dataItem.setVerifyDesc(_ctx.stringValue("GetCertifyResultResponse.Data["+ i +"].VerifyDesc"));
			dataItem.setVerifyResult(_ctx.stringValue("GetCertifyResultResponse.Data["+ i +"].VerifyResult"));
			dataItem.setDeviceToken(_ctx.stringValue("GetCertifyResultResponse.Data["+ i +"].DeviceToken"));

			data.add(dataItem);
		}
		getCertifyResultResponse.setData(data);
	 
	 	return getCertifyResultResponse;
	}
}