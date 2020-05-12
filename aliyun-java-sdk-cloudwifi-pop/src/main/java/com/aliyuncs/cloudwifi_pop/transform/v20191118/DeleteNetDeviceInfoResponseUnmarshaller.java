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

package com.aliyuncs.cloudwifi_pop.transform.v20191118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudwifi_pop.model.v20191118.DeleteNetDeviceInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteNetDeviceInfoResponseUnmarshaller {

	public static DeleteNetDeviceInfoResponse unmarshall(DeleteNetDeviceInfoResponse deleteNetDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		deleteNetDeviceInfoResponse.setRequestId(_ctx.stringValue("DeleteNetDeviceInfoResponse.RequestId"));
		deleteNetDeviceInfoResponse.setIsSuccess(_ctx.booleanValue("DeleteNetDeviceInfoResponse.IsSuccess"));
		deleteNetDeviceInfoResponse.setErrorCode(_ctx.integerValue("DeleteNetDeviceInfoResponse.ErrorCode"));
		deleteNetDeviceInfoResponse.setErrorMessage(_ctx.stringValue("DeleteNetDeviceInfoResponse.ErrorMessage"));

		List<Long> data = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("DeleteNetDeviceInfoResponse.Data.Length"); i++) {
			data.add(_ctx.longValue("DeleteNetDeviceInfoResponse.Data["+ i +"]"));
		}
		deleteNetDeviceInfoResponse.setData(data);
	 
	 	return deleteNetDeviceInfoResponse;
	}
}