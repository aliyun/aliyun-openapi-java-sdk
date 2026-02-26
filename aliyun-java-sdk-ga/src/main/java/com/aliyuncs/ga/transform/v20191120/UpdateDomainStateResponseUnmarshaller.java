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

package com.aliyuncs.ga.transform.v20191120;

import com.aliyuncs.ga.model.v20191120.UpdateDomainStateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDomainStateResponseUnmarshaller {

	public static UpdateDomainStateResponse unmarshall(UpdateDomainStateResponse updateDomainStateResponse, UnmarshallerContext _ctx) {
		
		updateDomainStateResponse.setRequestId(_ctx.stringValue("UpdateDomainStateResponse.RequestId"));
		updateDomainStateResponse.setDomain(_ctx.stringValue("UpdateDomainStateResponse.Domain"));
		updateDomainStateResponse.setState(_ctx.stringValue("UpdateDomainStateResponse.State"));
	 
	 	return updateDomainStateResponse;
	}
}