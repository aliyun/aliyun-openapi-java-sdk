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

package com.aliyuncs.ons.transform.v20180628;

import com.aliyuncs.ons.model.v20180628.OnsInstanceCreateResponse;
import com.aliyuncs.ons.model.v20180628.OnsInstanceCreateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsInstanceCreateResponseUnmarshaller {

	public static OnsInstanceCreateResponse unmarshall(OnsInstanceCreateResponse onsInstanceCreateResponse, UnmarshallerContext context) {
		
		onsInstanceCreateResponse.setRequestId(context.stringValue("OnsInstanceCreateResponse.RequestId"));
		onsInstanceCreateResponse.setHelpUrl(context.stringValue("OnsInstanceCreateResponse.HelpUrl"));

		Data data = new Data();
		data.setInstanceId(context.stringValue("OnsInstanceCreateResponse.Data.InstanceId"));
		data.setInstanceType(context.integerValue("OnsInstanceCreateResponse.Data.InstanceType"));
		onsInstanceCreateResponse.setData(data);
	 
	 	return onsInstanceCreateResponse;
	}
}