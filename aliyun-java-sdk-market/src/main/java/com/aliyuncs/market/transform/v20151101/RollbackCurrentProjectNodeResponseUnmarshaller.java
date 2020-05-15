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

package com.aliyuncs.market.transform.v20151101;

import com.aliyuncs.market.model.v20151101.RollbackCurrentProjectNodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RollbackCurrentProjectNodeResponseUnmarshaller {

	public static RollbackCurrentProjectNodeResponse unmarshall(RollbackCurrentProjectNodeResponse rollbackCurrentProjectNodeResponse, UnmarshallerContext _ctx) {
		
		rollbackCurrentProjectNodeResponse.setRequestId(_ctx.stringValue("RollbackCurrentProjectNodeResponse.RequestId"));
		rollbackCurrentProjectNodeResponse.setSuccess(_ctx.booleanValue("RollbackCurrentProjectNodeResponse.Success"));
		rollbackCurrentProjectNodeResponse.setResult(_ctx.booleanValue("RollbackCurrentProjectNodeResponse.Result"));
	 
	 	return rollbackCurrentProjectNodeResponse;
	}
}