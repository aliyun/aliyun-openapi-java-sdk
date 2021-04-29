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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeSagRemoteAccessResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagRemoteAccessResponse.RemoteAccess;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagRemoteAccessResponseUnmarshaller {

	public static DescribeSagRemoteAccessResponse unmarshall(DescribeSagRemoteAccessResponse describeSagRemoteAccessResponse, UnmarshallerContext _ctx) {
		
		describeSagRemoteAccessResponse.setRequestId(_ctx.stringValue("DescribeSagRemoteAccessResponse.RequestId"));
		describeSagRemoteAccessResponse.setMessage(_ctx.stringValue("DescribeSagRemoteAccessResponse.Message"));
		describeSagRemoteAccessResponse.setSmartAGId(_ctx.stringValue("DescribeSagRemoteAccessResponse.SmartAGId"));
		describeSagRemoteAccessResponse.setCode(_ctx.stringValue("DescribeSagRemoteAccessResponse.Code"));
		describeSagRemoteAccessResponse.setSuccess(_ctx.booleanValue("DescribeSagRemoteAccessResponse.Success"));

		List<RemoteAccess> remoteAccesses = new ArrayList<RemoteAccess>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagRemoteAccessResponse.RemoteAccesses.Length"); i++) {
			RemoteAccess remoteAccess = new RemoteAccess();
			remoteAccess.setSerialNumber(_ctx.stringValue("DescribeSagRemoteAccessResponse.RemoteAccesses["+ i +"].SerialNumber"));
			remoteAccess.setRemoteAccessIp(_ctx.stringValue("DescribeSagRemoteAccessResponse.RemoteAccesses["+ i +"].RemoteAccessIp"));

			remoteAccesses.add(remoteAccess);
		}
		describeSagRemoteAccessResponse.setRemoteAccesses(remoteAccesses);
	 
	 	return describeSagRemoteAccessResponse;
	}
}