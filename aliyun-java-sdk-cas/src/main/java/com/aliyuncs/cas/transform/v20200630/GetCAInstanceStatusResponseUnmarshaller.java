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

package com.aliyuncs.cas.transform.v20200630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20200630.GetCAInstanceStatusResponse;
import com.aliyuncs.cas.model.v20200630.GetCAInstanceStatusResponse.InstanceStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCAInstanceStatusResponseUnmarshaller {

	public static GetCAInstanceStatusResponse unmarshall(GetCAInstanceStatusResponse getCAInstanceStatusResponse, UnmarshallerContext _ctx) {
		
		getCAInstanceStatusResponse.setRequestId(_ctx.stringValue("GetCAInstanceStatusResponse.RequestId"));

		List<InstanceStatus> instanceStatusList = new ArrayList<InstanceStatus>();
		for (int i = 0; i < _ctx.lengthValue("GetCAInstanceStatusResponse.InstanceStatusList.Length"); i++) {
			InstanceStatus instanceStatus = new InstanceStatus();
			instanceStatus.setCertTotalCount(_ctx.integerValue("GetCAInstanceStatusResponse.InstanceStatusList["+ i +"].CertTotalCount"));
			instanceStatus.setStatus(_ctx.stringValue("GetCAInstanceStatusResponse.InstanceStatusList["+ i +"].Status"));
			instanceStatus.setType(_ctx.stringValue("GetCAInstanceStatusResponse.InstanceStatusList["+ i +"].Type"));
			instanceStatus.setCertIssuedCount(_ctx.integerValue("GetCAInstanceStatusResponse.InstanceStatusList["+ i +"].CertIssuedCount"));
			instanceStatus.setBeforeTime(_ctx.longValue("GetCAInstanceStatusResponse.InstanceStatusList["+ i +"].BeforeTime"));
			instanceStatus.setIdentifier(_ctx.stringValue("GetCAInstanceStatusResponse.InstanceStatusList["+ i +"].Identifier"));
			instanceStatus.setAfterTime(_ctx.longValue("GetCAInstanceStatusResponse.InstanceStatusList["+ i +"].AfterTime"));
			instanceStatus.setInstanceId(_ctx.stringValue("GetCAInstanceStatusResponse.InstanceStatusList["+ i +"].InstanceId"));
			instanceStatus.setUseExpireTime(_ctx.longValue("GetCAInstanceStatusResponse.InstanceStatusList["+ i +"].UseExpireTime"));

			instanceStatusList.add(instanceStatus);
		}
		getCAInstanceStatusResponse.setInstanceStatusList(instanceStatusList);
	 
	 	return getCAInstanceStatusResponse;
	}
}