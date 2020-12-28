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

package com.aliyuncs.nlp_automl.transform.v20190701;

import com.aliyuncs.nlp_automl.model.v20190701.AddMtIntervenePackageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMtIntervenePackageResponseUnmarshaller {

	public static AddMtIntervenePackageResponse unmarshall(AddMtIntervenePackageResponse addMtIntervenePackageResponse, UnmarshallerContext _ctx) {
		
		addMtIntervenePackageResponse.setRequestId(_ctx.stringValue("AddMtIntervenePackageResponse.RequestId"));
		addMtIntervenePackageResponse.setCode(_ctx.integerValue("AddMtIntervenePackageResponse.Code"));
		addMtIntervenePackageResponse.setMessage(_ctx.integerValue("AddMtIntervenePackageResponse.Message"));
		addMtIntervenePackageResponse.setPackageId(_ctx.stringValue("AddMtIntervenePackageResponse.PackageId"));
	 
	 	return addMtIntervenePackageResponse;
	}
}