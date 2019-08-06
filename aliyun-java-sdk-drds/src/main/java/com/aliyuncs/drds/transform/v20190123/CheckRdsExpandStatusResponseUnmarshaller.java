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

import com.aliyuncs.drds.model.v20190123.CheckRdsExpandStatusResponse;
import com.aliyuncs.drds.model.v20190123.CheckRdsExpandStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckRdsExpandStatusResponseUnmarshaller {

	public static CheckRdsExpandStatusResponse unmarshall(CheckRdsExpandStatusResponse checkRdsExpandStatusResponse, UnmarshallerContext _ctx) {
		
		checkRdsExpandStatusResponse.setRequestId(_ctx.stringValue("CheckRdsExpandStatusResponse.RequestId"));
		checkRdsExpandStatusResponse.setSuccess(_ctx.booleanValue("CheckRdsExpandStatusResponse.Success"));

		Data data = new Data();
		data.setIsUsable(_ctx.booleanValue("CheckRdsExpandStatusResponse.Data.IsUsable"));
		data.setMsg(_ctx.stringValue("CheckRdsExpandStatusResponse.Data.Msg"));
		checkRdsExpandStatusResponse.setData(data);
	 
	 	return checkRdsExpandStatusResponse;
	}
}