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
package com.aliyuncs.arms4finance.transform.v20171130;

import com.aliyuncs.arms4finance.model.v20171130.ARMSQueryDataSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ARMSQueryDataSetResponseUnmarshaller {

	public static ARMSQueryDataSetResponse unmarshall(ARMSQueryDataSetResponse aRMSQueryDataSetResponse, UnmarshallerContext context) {
		
		aRMSQueryDataSetResponse.setData(context.stringValue("ARMSQueryDataSetResponse.Data"));
	 
	 	return aRMSQueryDataSetResponse;
	}
}