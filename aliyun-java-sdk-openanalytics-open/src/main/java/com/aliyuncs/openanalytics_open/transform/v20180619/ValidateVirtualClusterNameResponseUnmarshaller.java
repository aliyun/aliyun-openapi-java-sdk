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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import com.aliyuncs.openanalytics_open.model.v20180619.ValidateVirtualClusterNameResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.ValidateVirtualClusterNameResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateVirtualClusterNameResponseUnmarshaller {

	public static ValidateVirtualClusterNameResponse unmarshall(ValidateVirtualClusterNameResponse validateVirtualClusterNameResponse, UnmarshallerContext _ctx) {
		
		validateVirtualClusterNameResponse.setRequestId(_ctx.stringValue("ValidateVirtualClusterNameResponse.RequestId"));

		Data data = new Data();
		data.setLegal(_ctx.stringValue("ValidateVirtualClusterNameResponse.Data.Legal"));
		data.setMessage(_ctx.stringValue("ValidateVirtualClusterNameResponse.Data.Message"));
		validateVirtualClusterNameResponse.setData(data);
	 
	 	return validateVirtualClusterNameResponse;
	}
}