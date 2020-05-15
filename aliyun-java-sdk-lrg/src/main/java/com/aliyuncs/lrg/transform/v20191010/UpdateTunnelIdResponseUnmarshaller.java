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

package com.aliyuncs.lrg.transform.v20191010;

import com.aliyuncs.lrg.model.v20191010.UpdateTunnelIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTunnelIdResponseUnmarshaller {

	public static UpdateTunnelIdResponse unmarshall(UpdateTunnelIdResponse updateTunnelIdResponse, UnmarshallerContext _ctx) {
		
		updateTunnelIdResponse.setCode(_ctx.integerValue("UpdateTunnelIdResponse.code"));
		updateTunnelIdResponse.setMessage(_ctx.stringValue("UpdateTunnelIdResponse.message"));
		updateTunnelIdResponse.setSuccess(_ctx.booleanValue("UpdateTunnelIdResponse.success"));
		updateTunnelIdResponse.setData(_ctx.stringValue("UpdateTunnelIdResponse.data"));
	 
	 	return updateTunnelIdResponse;
	}
}