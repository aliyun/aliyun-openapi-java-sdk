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

import com.aliyuncs.iot.model.v20180120.ListOTAModuleVersionsByDeviceResponse;
import com.aliyuncs.iot.model.v20180120.ListOTAModuleVersionsByDeviceResponse.SimpleOTAModuleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOTAModuleVersionsByDeviceResponseUnmarshaller {

	public static ListOTAModuleVersionsByDeviceResponse unmarshall(ListOTAModuleVersionsByDeviceResponse listOTAModuleVersionsByDeviceResponse, UnmarshallerContext _ctx) {
		
		listOTAModuleVersionsByDeviceResponse.setRequestId(_ctx.stringValue("ListOTAModuleVersionsByDeviceResponse.RequestId"));
		listOTAModuleVersionsByDeviceResponse.setCurrentPage(_ctx.integerValue("ListOTAModuleVersionsByDeviceResponse.CurrentPage"));
		listOTAModuleVersionsByDeviceResponse.setErrorMessage(_ctx.stringValue("ListOTAModuleVersionsByDeviceResponse.ErrorMessage"));
		listOTAModuleVersionsByDeviceResponse.setSuccess(_ctx.booleanValue("ListOTAModuleVersionsByDeviceResponse.Success"));
		listOTAModuleVersionsByDeviceResponse.setCode(_ctx.stringValue("ListOTAModuleVersionsByDeviceResponse.Code"));
		listOTAModuleVersionsByDeviceResponse.setPageSize(_ctx.integerValue("ListOTAModuleVersionsByDeviceResponse.PageSize"));
		listOTAModuleVersionsByDeviceResponse.setPageCount(_ctx.integerValue("ListOTAModuleVersionsByDeviceResponse.PageCount"));
		listOTAModuleVersionsByDeviceResponse.setTotal(_ctx.integerValue("ListOTAModuleVersionsByDeviceResponse.Total"));

		List<SimpleOTAModuleInfo> data = new ArrayList<SimpleOTAModuleInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListOTAModuleVersionsByDeviceResponse.Data.Length"); i++) {
			SimpleOTAModuleInfo simpleOTAModuleInfo = new SimpleOTAModuleInfo();
			simpleOTAModuleInfo.setModuleName(_ctx.stringValue("ListOTAModuleVersionsByDeviceResponse.Data["+ i +"].ModuleName"));
			simpleOTAModuleInfo.setProductKey(_ctx.stringValue("ListOTAModuleVersionsByDeviceResponse.Data["+ i +"].ProductKey"));
			simpleOTAModuleInfo.setDeviceName(_ctx.stringValue("ListOTAModuleVersionsByDeviceResponse.Data["+ i +"].DeviceName"));
			simpleOTAModuleInfo.setModuleVersion(_ctx.stringValue("ListOTAModuleVersionsByDeviceResponse.Data["+ i +"].ModuleVersion"));
			simpleOTAModuleInfo.setIotId(_ctx.stringValue("ListOTAModuleVersionsByDeviceResponse.Data["+ i +"].IotId"));

			data.add(simpleOTAModuleInfo);
		}
		listOTAModuleVersionsByDeviceResponse.setData(data);
	 
	 	return listOTAModuleVersionsByDeviceResponse;
	}
}