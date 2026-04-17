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

package com.aliyuncs.hitsdb.transform.v20200615;

import com.aliyuncs.hitsdb.model.v20200615.CheckCreateLindormV2InstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckCreateLindormV2InstanceResponseUnmarshaller {

	public static CheckCreateLindormV2InstanceResponse unmarshall(CheckCreateLindormV2InstanceResponse checkCreateLindormV2InstanceResponse, UnmarshallerContext _ctx) {
		
		checkCreateLindormV2InstanceResponse.setRequestId(_ctx.stringValue("CheckCreateLindormV2InstanceResponse.RequestId"));
		checkCreateLindormV2InstanceResponse.setSuccess(_ctx.booleanValue("CheckCreateLindormV2InstanceResponse.Success"));
		checkCreateLindormV2InstanceResponse.setCode(_ctx.stringValue("CheckCreateLindormV2InstanceResponse.Code"));
		checkCreateLindormV2InstanceResponse.setMsg(_ctx.stringValue("CheckCreateLindormV2InstanceResponse.Msg"));
		checkCreateLindormV2InstanceResponse.setAccessDeniedDetail(_ctx.stringValue("CheckCreateLindormV2InstanceResponse.AccessDeniedDetail"));
	 
	 	return checkCreateLindormV2InstanceResponse;
	}
}