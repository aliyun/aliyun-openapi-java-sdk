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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.GetServiceTrailResponse;
import com.aliyuncs.sas.model.v20181203.GetServiceTrailResponse.ServiceTrail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceTrailResponseUnmarshaller {

	public static GetServiceTrailResponse unmarshall(GetServiceTrailResponse getServiceTrailResponse, UnmarshallerContext _ctx) {
		
		getServiceTrailResponse.setRequestId(_ctx.stringValue("GetServiceTrailResponse.RequestId"));

		ServiceTrail serviceTrail = new ServiceTrail();
		serviceTrail.setConfig(_ctx.stringValue("GetServiceTrailResponse.ServiceTrail.Config"));
		serviceTrail.setCreateTime(_ctx.longValue("GetServiceTrailResponse.ServiceTrail.CreateTime"));
		serviceTrail.setUpdateTime(_ctx.longValue("GetServiceTrailResponse.ServiceTrail.UpdateTime"));
		getServiceTrailResponse.setServiceTrail(serviceTrail);
	 
	 	return getServiceTrailResponse;
	}
}