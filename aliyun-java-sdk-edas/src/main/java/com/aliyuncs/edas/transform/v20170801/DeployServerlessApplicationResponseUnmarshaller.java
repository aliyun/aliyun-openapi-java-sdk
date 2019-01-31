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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.DeployServerlessApplicationResponse;
import com.aliyuncs.edas.model.v20170801.DeployServerlessApplicationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeployServerlessApplicationResponseUnmarshaller {

	public static DeployServerlessApplicationResponse unmarshall(DeployServerlessApplicationResponse deployServerlessApplicationResponse, UnmarshallerContext context) {
		
		deployServerlessApplicationResponse.setCode(context.integerValue("DeployServerlessApplicationResponse.Code"));
		deployServerlessApplicationResponse.setMessage(context.stringValue("DeployServerlessApplicationResponse.Message"));

		Data data = new Data();
		data.setAppId(context.stringValue("DeployServerlessApplicationResponse.Data.AppId"));
		data.setChangeOrderId(context.stringValue("DeployServerlessApplicationResponse.Data.ChangeOrderId"));
		deployServerlessApplicationResponse.setData(data);
	 
	 	return deployServerlessApplicationResponse;
	}
}