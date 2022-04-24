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

package com.aliyuncs.ens.transform.v20171110;

import com.aliyuncs.ens.model.v20171110.CreateEnsRouteEntryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEnsRouteEntryResponseUnmarshaller {

	public static CreateEnsRouteEntryResponse unmarshall(CreateEnsRouteEntryResponse createEnsRouteEntryResponse, UnmarshallerContext _ctx) {
		
		createEnsRouteEntryResponse.setRequestId(_ctx.stringValue("CreateEnsRouteEntryResponse.RequestId"));
		createEnsRouteEntryResponse.setRouteEntryId(_ctx.stringValue("CreateEnsRouteEntryResponse.RouteEntryId"));
	 
	 	return createEnsRouteEntryResponse;
	}
}