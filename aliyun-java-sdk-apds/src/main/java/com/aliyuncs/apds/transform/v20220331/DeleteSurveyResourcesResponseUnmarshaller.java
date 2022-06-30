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

package com.aliyuncs.apds.transform.v20220331;

import com.aliyuncs.apds.model.v20220331.DeleteSurveyResourcesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSurveyResourcesResponseUnmarshaller {

	public static DeleteSurveyResourcesResponse unmarshall(DeleteSurveyResourcesResponse deleteSurveyResourcesResponse, UnmarshallerContext _ctx) {
		
		deleteSurveyResourcesResponse.setCode(_ctx.stringValue("DeleteSurveyResourcesResponse.Code"));
		deleteSurveyResourcesResponse.setError(_ctx.stringValue("DeleteSurveyResourcesResponse.Error"));
		deleteSurveyResourcesResponse.setSuccess(_ctx.booleanValue("DeleteSurveyResourcesResponse.Success"));
	 
	 	return deleteSurveyResourcesResponse;
	}
}