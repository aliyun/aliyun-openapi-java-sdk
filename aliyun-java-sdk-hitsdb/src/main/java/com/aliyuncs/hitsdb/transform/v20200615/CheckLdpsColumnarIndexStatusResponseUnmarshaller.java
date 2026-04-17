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

import com.aliyuncs.hitsdb.model.v20200615.CheckLdpsColumnarIndexStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLdpsColumnarIndexStatusResponseUnmarshaller {

	public static CheckLdpsColumnarIndexStatusResponse unmarshall(CheckLdpsColumnarIndexStatusResponse checkLdpsColumnarIndexStatusResponse, UnmarshallerContext _ctx) {
		
		checkLdpsColumnarIndexStatusResponse.setRequestId(_ctx.stringValue("CheckLdpsColumnarIndexStatusResponse.RequestId"));
		checkLdpsColumnarIndexStatusResponse.setAccessDeniedDetail(_ctx.stringValue("CheckLdpsColumnarIndexStatusResponse.AccessDeniedDetail"));
		checkLdpsColumnarIndexStatusResponse.setOpened(_ctx.booleanValue("CheckLdpsColumnarIndexStatusResponse.Opened"));
	 
	 	return checkLdpsColumnarIndexStatusResponse;
	}
}