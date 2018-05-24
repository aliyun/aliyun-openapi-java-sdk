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

package com.aliyuncs.qualitycheck.transform.v20160801;

import com.aliyuncs.qualitycheck.model.v20160801.UpdateScoreForApiResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateScoreForApiResponseUnmarshaller {

	public static UpdateScoreForApiResponse unmarshall(UpdateScoreForApiResponse updateScoreForApiResponse, UnmarshallerContext context) {
		
		updateScoreForApiResponse.setRequestId(context.stringValue("UpdateScoreForApiResponse.requestId"));
		updateScoreForApiResponse.setSuccess(context.booleanValue("UpdateScoreForApiResponse.success"));
		updateScoreForApiResponse.setCode(context.stringValue("UpdateScoreForApiResponse.code"));
		updateScoreForApiResponse.setMessage(context.stringValue("UpdateScoreForApiResponse.message"));
	 
	 	return updateScoreForApiResponse;
	}
}