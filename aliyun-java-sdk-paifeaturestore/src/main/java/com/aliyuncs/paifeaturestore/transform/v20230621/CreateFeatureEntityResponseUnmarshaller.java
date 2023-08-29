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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import com.aliyuncs.paifeaturestore.model.v20230621.CreateFeatureEntityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFeatureEntityResponseUnmarshaller {

	public static CreateFeatureEntityResponse unmarshall(CreateFeatureEntityResponse createFeatureEntityResponse, UnmarshallerContext _ctx) {
		
		createFeatureEntityResponse.setRequestId(_ctx.stringValue("CreateFeatureEntityResponse.RequestId"));
		createFeatureEntityResponse.setFeatureEntityId(_ctx.stringValue("CreateFeatureEntityResponse.FeatureEntityId"));
	 
	 	return createFeatureEntityResponse;
	}
}