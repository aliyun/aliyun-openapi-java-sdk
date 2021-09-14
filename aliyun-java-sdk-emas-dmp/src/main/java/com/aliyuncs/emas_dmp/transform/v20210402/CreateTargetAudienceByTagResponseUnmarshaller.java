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

package com.aliyuncs.emas_dmp.transform.v20210402;

import com.aliyuncs.emas_dmp.model.v20210402.CreateTargetAudienceByTagResponse;
import com.aliyuncs.emas_dmp.model.v20210402.CreateTargetAudienceByTagResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTargetAudienceByTagResponseUnmarshaller {

	public static CreateTargetAudienceByTagResponse unmarshall(CreateTargetAudienceByTagResponse createTargetAudienceByTagResponse, UnmarshallerContext _ctx) {
		
		createTargetAudienceByTagResponse.setRequestId(_ctx.stringValue("CreateTargetAudienceByTagResponse.RequestId"));

		Data data = new Data();
		data.setTaskId(_ctx.longValue("CreateTargetAudienceByTagResponse.Data.TaskId"));
		createTargetAudienceByTagResponse.setData(data);
	 
	 	return createTargetAudienceByTagResponse;
	}
}