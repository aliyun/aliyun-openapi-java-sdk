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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListOTAFirmwareResponse;
import com.aliyuncs.iot.model.v20180120.ListOTAFirmwareResponse.SimpleFirmwareInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOTAFirmwareResponseUnmarshaller {

	public static ListOTAFirmwareResponse unmarshall(ListOTAFirmwareResponse listOTAFirmwareResponse, UnmarshallerContext _ctx) {
		
		listOTAFirmwareResponse.setRequestId(_ctx.stringValue("ListOTAFirmwareResponse.RequestId"));
		listOTAFirmwareResponse.setSuccess(_ctx.booleanValue("ListOTAFirmwareResponse.Success"));
		listOTAFirmwareResponse.setCode(_ctx.stringValue("ListOTAFirmwareResponse.Code"));
		listOTAFirmwareResponse.setErrorMessage(_ctx.stringValue("ListOTAFirmwareResponse.ErrorMessage"));
		listOTAFirmwareResponse.setTotal(_ctx.integerValue("ListOTAFirmwareResponse.Total"));
		listOTAFirmwareResponse.setPageSize(_ctx.integerValue("ListOTAFirmwareResponse.PageSize"));
		listOTAFirmwareResponse.setPageCount(_ctx.integerValue("ListOTAFirmwareResponse.PageCount"));
		listOTAFirmwareResponse.setCurrentPage(_ctx.integerValue("ListOTAFirmwareResponse.CurrentPage"));

		List<SimpleFirmwareInfo> firmwareInfo = new ArrayList<SimpleFirmwareInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListOTAFirmwareResponse.FirmwareInfo.Length"); i++) {
			SimpleFirmwareInfo simpleFirmwareInfo = new SimpleFirmwareInfo();
			simpleFirmwareInfo.setFirmwareName(_ctx.stringValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].FirmwareName"));
			simpleFirmwareInfo.setFirmwareId(_ctx.stringValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].FirmwareId"));
			simpleFirmwareInfo.setSrcVersion(_ctx.stringValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].SrcVersion"));
			simpleFirmwareInfo.setDestVersion(_ctx.stringValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].DestVersion"));
			simpleFirmwareInfo.setUtcCreate(_ctx.stringValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].UtcCreate"));
			simpleFirmwareInfo.setUtcModified(_ctx.stringValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].UtcModified"));
			simpleFirmwareInfo.setStatus(_ctx.integerValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].Status"));
			simpleFirmwareInfo.setFirmwareDesc(_ctx.stringValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].FirmwareDesc"));
			simpleFirmwareInfo.setFirmwareSign(_ctx.stringValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].FirmwareSign"));
			simpleFirmwareInfo.setFirmwareSize(_ctx.integerValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].FirmwareSize"));
			simpleFirmwareInfo.setFirmwareUrl(_ctx.stringValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].FirmwareUrl"));
			simpleFirmwareInfo.setProductKey(_ctx.stringValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].ProductKey"));
			simpleFirmwareInfo.setSignMethod(_ctx.stringValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].SignMethod"));
			simpleFirmwareInfo.setProductName(_ctx.stringValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].ProductName"));
			simpleFirmwareInfo.setType(_ctx.integerValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].Type"));
			simpleFirmwareInfo.setModuleName(_ctx.stringValue("ListOTAFirmwareResponse.FirmwareInfo["+ i +"].ModuleName"));

			firmwareInfo.add(simpleFirmwareInfo);
		}
		listOTAFirmwareResponse.setFirmwareInfo(firmwareInfo);
	 
	 	return listOTAFirmwareResponse;
	}
}