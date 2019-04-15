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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerStockListUsedVmsResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerStockListUsedVmsResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerStockListUsedVmsResponse.Data.Vm;
import com.aliyuncs.ecsinc.model.v20160314.InnerStockListUsedVmsResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerStockListUsedVmsResponseUnmarshaller {

	public static InnerStockListUsedVmsResponse unmarshall(InnerStockListUsedVmsResponse innerStockListUsedVmsResponse, UnmarshallerContext context) {
		
		innerStockListUsedVmsResponse.setRequestId(context.stringValue("InnerStockListUsedVmsResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerStockListUsedVmsResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerStockListUsedVmsResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerStockListUsedVmsResponse.errorCode.isSuccess"));
		innerStockListUsedVmsResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setPrivateIps(context.stringValue("InnerStockListUsedVmsResponse.data.privateIps"));
		data.setDiskType(context.stringValue("InnerStockListUsedVmsResponse.data.diskType"));
		data.setPublicIps(context.stringValue("InnerStockListUsedVmsResponse.data.publicIps"));
		data.setLocalDiskCap(context.stringValue("InnerStockListUsedVmsResponse.data.localDiskCap"));
		data.setMacs(context.stringValue("InnerStockListUsedVmsResponse.data.macs"));
		data.setZoneId(context.stringValue("InnerStockListUsedVmsResponse.data.zoneId"));
		data.setCloudDiskCap(context.stringValue("InnerStockListUsedVmsResponse.data.cloudDiskCap"));

		List<Vm> vms = new ArrayList<Vm>();
		for (int i = 0; i < context.lengthValue("InnerStockListUsedVmsResponse.data.vms.Length"); i++) {
			Vm vm = new Vm();
			vm.setTotal(context.stringValue("InnerStockListUsedVmsResponse.data.vms["+ i +"].total"));
			vm.setNum(context.stringValue("InnerStockListUsedVmsResponse.data.vms["+ i +"].num"));
			vm.setName(context.stringValue("InnerStockListUsedVmsResponse.data.vms["+ i +"].name"));

			vms.add(vm);
		}
		data.setVms(vms);
		innerStockListUsedVmsResponse.setData(data);
	 
	 	return innerStockListUsedVmsResponse;
	}
}