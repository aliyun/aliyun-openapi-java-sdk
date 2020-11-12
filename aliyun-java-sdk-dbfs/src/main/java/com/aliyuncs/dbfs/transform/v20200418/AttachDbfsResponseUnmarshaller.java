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

package com.aliyuncs.dbfs.transform.v20200418;

import com.aliyuncs.dbfs.model.v20200418.AttachDbfsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachDbfsResponseUnmarshaller {

	public static AttachDbfsResponse unmarshall(AttachDbfsResponse attachDbfsResponse, UnmarshallerContext _ctx) {
		
		attachDbfsResponse.setRequestId(_ctx.stringValue("AttachDbfsResponse.RequestId"));
	 
	 	return attachDbfsResponse;
	}
}