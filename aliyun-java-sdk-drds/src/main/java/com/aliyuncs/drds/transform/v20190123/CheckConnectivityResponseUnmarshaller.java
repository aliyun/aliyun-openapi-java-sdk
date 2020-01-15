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

package com.aliyuncs.drds.transform.v20190123;

import com.aliyuncs.drds.model.v20190123.CheckConnectivityResponse;
import com.aliyuncs.drds.model.v20190123.CheckConnectivityResponse.CheckConnectivityResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckConnectivityResponseUnmarshaller {

	public static CheckConnectivityResponse unmarshall(CheckConnectivityResponse checkConnectivityResponse, UnmarshallerContext _ctx) {
		
		checkConnectivityResponse.setRequestId(_ctx.stringValue("CheckConnectivityResponse.RequestId"));
		checkConnectivityResponse.setSuccess(_ctx.booleanValue("CheckConnectivityResponse.Success"));

		CheckConnectivityResult checkConnectivityResult = new CheckConnectivityResult();
		checkConnectivityResult.setSuccess(_ctx.booleanValue("CheckConnectivityResponse.CheckConnectivityResult.Success"));
		checkConnectivityResult.setMessage(_ctx.stringValue("CheckConnectivityResponse.CheckConnectivityResult.Message"));
		checkConnectivityResponse.setCheckConnectivityResult(checkConnectivityResult);
	 
	 	return checkConnectivityResponse;
	}
}