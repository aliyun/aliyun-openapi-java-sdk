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

package com.aliyuncs.cloudauth.transform.v20180916;

import com.aliyuncs.cloudauth.model.v20180916.CompareFacesResponse;
import com.aliyuncs.cloudauth.model.v20180916.CompareFacesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CompareFacesResponseUnmarshaller {

	public static CompareFacesResponse unmarshall(CompareFacesResponse compareFacesResponse, UnmarshallerContext context) {
		
		compareFacesResponse.setRequestId(context.stringValue("CompareFacesResponse.RequestId"));
		compareFacesResponse.setSuccess(context.booleanValue("CompareFacesResponse.Success"));
		compareFacesResponse.setCode(context.stringValue("CompareFacesResponse.Code"));
		compareFacesResponse.setMessage(context.stringValue("CompareFacesResponse.Message"));

		Data data = new Data();
		data.setSimilarityScore(context.floatValue("CompareFacesResponse.Data.SimilarityScore"));
		data.setConfidenceThresholds(context.stringValue("CompareFacesResponse.Data.ConfidenceThresholds"));
		compareFacesResponse.setData(data);
	 
	 	return compareFacesResponse;
	}
}