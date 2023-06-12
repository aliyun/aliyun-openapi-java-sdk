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

package com.aliyuncs.csas.transform.v20230120;

import com.aliyuncs.csas.model.v20230120.AttachApplication2ConnectorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachApplication2ConnectorResponseUnmarshaller {

	public static AttachApplication2ConnectorResponse unmarshall(AttachApplication2ConnectorResponse attachApplication2ConnectorResponse, UnmarshallerContext _ctx) {
		
		attachApplication2ConnectorResponse.setRequestId(_ctx.stringValue("AttachApplication2ConnectorResponse.RequestId"));
	 
	 	return attachApplication2ConnectorResponse;
	}
}