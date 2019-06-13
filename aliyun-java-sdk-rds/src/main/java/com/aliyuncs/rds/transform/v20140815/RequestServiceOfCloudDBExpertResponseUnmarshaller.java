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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.RequestServiceOfCloudDBExpertResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestServiceOfCloudDBExpertResponseUnmarshaller {

	public static RequestServiceOfCloudDBExpertResponse unmarshall(RequestServiceOfCloudDBExpertResponse requestServiceOfCloudDBExpertResponse, UnmarshallerContext context) {
		
		requestServiceOfCloudDBExpertResponse.setRequestId(context.stringValue("RequestServiceOfCloudDBExpertResponse.RequestId"));
		requestServiceOfCloudDBExpertResponse.setMessage(context.stringValue("RequestServiceOfCloudDBExpertResponse.Message"));
		requestServiceOfCloudDBExpertResponse.setData(context.stringValue("RequestServiceOfCloudDBExpertResponse.Data"));
		requestServiceOfCloudDBExpertResponse.setCode(context.stringValue("RequestServiceOfCloudDBExpertResponse.Code"));
	 
	 	return requestServiceOfCloudDBExpertResponse;
	}
}