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

package com.aliyuncs.cloudauth.transform.v20201112;

import com.aliyuncs.cloudauth.model.v20201112.CompareFacesResponse;
import com.aliyuncs.cloudauth.model.v20201112.CompareFacesResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class CompareFacesResponseUnmarshaller {

	public static CompareFacesResponse unmarshall(CompareFacesResponse compareFacesResponse, UnmarshallerContext _ctx) {
		
		compareFacesResponse.setRequestId(_ctx.stringValue("CompareFacesResponse.RequestId"));
		compareFacesResponse.setCode(_ctx.stringValue("CompareFacesResponse.Code"));
		compareFacesResponse.setMessage(_ctx.stringValue("CompareFacesResponse.Message"));
		compareFacesResponse.setSuccess(_ctx.booleanValue("CompareFacesResponse.Success"));

		ResultObject resultObject = new ResultObject();
		resultObject.setSimilarityScore(_ctx.floatValue("CompareFacesResponse.ResultObject.SimilarityScore"));
		resultObject.setConfidenceThresholds(_ctx.stringValue("CompareFacesResponse.ResultObject.ConfidenceThresholds"));
		compareFacesResponse.setResultObject(resultObject);
	 
	 	return compareFacesResponse;
	}
}