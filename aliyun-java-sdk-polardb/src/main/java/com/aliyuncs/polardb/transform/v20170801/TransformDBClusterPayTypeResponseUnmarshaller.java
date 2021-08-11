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

package com.aliyuncs.polardb.transform.v20170801;

import com.aliyuncs.polardb.model.v20170801.TransformDBClusterPayTypeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TransformDBClusterPayTypeResponseUnmarshaller {

	public static TransformDBClusterPayTypeResponse unmarshall(TransformDBClusterPayTypeResponse transformDBClusterPayTypeResponse, UnmarshallerContext _ctx) {
		
		transformDBClusterPayTypeResponse.setRequestId(_ctx.stringValue("TransformDBClusterPayTypeResponse.RequestId"));
		transformDBClusterPayTypeResponse.setChargeType(_ctx.stringValue("TransformDBClusterPayTypeResponse.ChargeType"));
		transformDBClusterPayTypeResponse.setDBClusterId(_ctx.stringValue("TransformDBClusterPayTypeResponse.DBClusterId"));
		transformDBClusterPayTypeResponse.setExpiredTime(_ctx.stringValue("TransformDBClusterPayTypeResponse.ExpiredTime"));
		transformDBClusterPayTypeResponse.setOrderId(_ctx.stringValue("TransformDBClusterPayTypeResponse.OrderId"));
	 
	 	return transformDBClusterPayTypeResponse;
	}
}