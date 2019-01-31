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

import com.aliyuncs.ons.model.v20180628.OnsGroupConsumerUpdateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsGroupConsumerUpdateResponseUnmarshaller {

	public static OnsGroupConsumerUpdateResponse unmarshall(OnsGroupConsumerUpdateResponse onsGroupConsumerUpdateResponse, UnmarshallerContext context) {
		
		onsGroupConsumerUpdateResponse.setRequestId(context.stringValue("OnsGroupConsumerUpdateResponse.RequestId"));
		onsGroupConsumerUpdateResponse.setHelpUrl(context.stringValue("OnsGroupConsumerUpdateResponse.HelpUrl"));
	 
	 	return onsGroupConsumerUpdateResponse;
	}
}