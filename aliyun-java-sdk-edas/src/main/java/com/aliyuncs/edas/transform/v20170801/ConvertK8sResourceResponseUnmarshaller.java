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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.ConvertK8sResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConvertK8sResourceResponseUnmarshaller {

	public static ConvertK8sResourceResponse unmarshall(ConvertK8sResourceResponse convertK8sResourceResponse, UnmarshallerContext _ctx) {
		
		convertK8sResourceResponse.setRequestId(_ctx.stringValue("ConvertK8sResourceResponse.RequestId"));
		convertK8sResourceResponse.setMessage(_ctx.stringValue("ConvertK8sResourceResponse.Message"));
		convertK8sResourceResponse.setCode(_ctx.integerValue("ConvertK8sResourceResponse.Code"));
	 
	 	return convertK8sResourceResponse;
	}
}