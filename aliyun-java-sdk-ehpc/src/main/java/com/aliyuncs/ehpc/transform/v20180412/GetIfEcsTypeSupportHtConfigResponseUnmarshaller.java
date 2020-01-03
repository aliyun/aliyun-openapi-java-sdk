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

package com.aliyuncs.ehpc.transform.v20180412;

import com.aliyuncs.ehpc.model.v20180412.GetIfEcsTypeSupportHtConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIfEcsTypeSupportHtConfigResponseUnmarshaller {

	public static GetIfEcsTypeSupportHtConfigResponse unmarshall(GetIfEcsTypeSupportHtConfigResponse getIfEcsTypeSupportHtConfigResponse, UnmarshallerContext _ctx) {
		
		getIfEcsTypeSupportHtConfigResponse.setRequestId(_ctx.stringValue("GetIfEcsTypeSupportHtConfigResponse.RequestId"));
		getIfEcsTypeSupportHtConfigResponse.setInstanceType(_ctx.stringValue("GetIfEcsTypeSupportHtConfigResponse.InstanceType"));
		getIfEcsTypeSupportHtConfigResponse.setSupportHtConfig(_ctx.booleanValue("GetIfEcsTypeSupportHtConfigResponse.SupportHtConfig"));
		getIfEcsTypeSupportHtConfigResponse.setDefaultHtEnabled(_ctx.booleanValue("GetIfEcsTypeSupportHtConfigResponse.DefaultHtEnabled"));
	 
	 	return getIfEcsTypeSupportHtConfigResponse;
	}
}