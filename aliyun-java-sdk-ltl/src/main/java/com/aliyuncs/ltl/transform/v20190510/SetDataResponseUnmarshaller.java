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

package com.aliyuncs.ltl.transform.v20190510;

import com.aliyuncs.ltl.model.v20190510.SetDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetDataResponseUnmarshaller {

	public static SetDataResponse unmarshall(SetDataResponse setDataResponse, UnmarshallerContext _ctx) {
		
		setDataResponse.setRequestId(_ctx.stringValue("SetDataResponse.RequestId"));
		setDataResponse.setData(_ctx.stringValue("SetDataResponse.Data"));
		setDataResponse.setCode(_ctx.integerValue("SetDataResponse.Code"));
		setDataResponse.setSuccess(_ctx.booleanValue("SetDataResponse.Success"));
		setDataResponse.setMessage(_ctx.stringValue("SetDataResponse.Message"));
	 
	 	return setDataResponse;
	}
}