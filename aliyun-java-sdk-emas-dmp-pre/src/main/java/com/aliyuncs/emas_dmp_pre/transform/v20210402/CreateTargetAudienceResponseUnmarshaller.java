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

package com.aliyuncs.emas_dmp_pre.transform.v20210402;

import com.aliyuncs.emas_dmp_pre.model.v20210402.CreateTargetAudienceResponse;
import com.aliyuncs.emas_dmp_pre.model.v20210402.CreateTargetAudienceResponse.TargetAudience;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTargetAudienceResponseUnmarshaller {

	public static CreateTargetAudienceResponse unmarshall(CreateTargetAudienceResponse createTargetAudienceResponse, UnmarshallerContext _ctx) {
		
		createTargetAudienceResponse.setRequestId(_ctx.stringValue("CreateTargetAudienceResponse.RequestId"));

		TargetAudience targetAudience = new TargetAudience();
		targetAudience.setTaId(_ctx.stringValue("CreateTargetAudienceResponse.TargetAudience.TaId"));
		createTargetAudienceResponse.setTargetAudience(targetAudience);
	 
	 	return createTargetAudienceResponse;
	}
}