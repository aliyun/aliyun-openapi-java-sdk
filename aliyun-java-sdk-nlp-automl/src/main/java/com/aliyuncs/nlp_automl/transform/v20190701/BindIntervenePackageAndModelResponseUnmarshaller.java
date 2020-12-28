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

import com.aliyuncs.nlp_automl.model.v20190701.BindIntervenePackageAndModelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindIntervenePackageAndModelResponseUnmarshaller {

	public static BindIntervenePackageAndModelResponse unmarshall(BindIntervenePackageAndModelResponse bindIntervenePackageAndModelResponse, UnmarshallerContext _ctx) {
		
		bindIntervenePackageAndModelResponse.setRequestId(_ctx.stringValue("BindIntervenePackageAndModelResponse.RequestId"));
		bindIntervenePackageAndModelResponse.setCode(_ctx.integerValue("BindIntervenePackageAndModelResponse.Code"));
		bindIntervenePackageAndModelResponse.setMessage(_ctx.integerValue("BindIntervenePackageAndModelResponse.Message"));
		bindIntervenePackageAndModelResponse.setSuccess(_ctx.stringValue("BindIntervenePackageAndModelResponse.Success"));
	 
	 	return bindIntervenePackageAndModelResponse;
	}
}