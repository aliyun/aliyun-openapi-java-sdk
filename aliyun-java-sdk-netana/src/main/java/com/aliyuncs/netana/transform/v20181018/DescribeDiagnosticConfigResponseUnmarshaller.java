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

package com.aliyuncs.netana.transform.v20181018;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.netana.model.v20181018.DescribeDiagnosticConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosticConfigResponseUnmarshaller {

	public static DescribeDiagnosticConfigResponse unmarshall(DescribeDiagnosticConfigResponse describeDiagnosticConfigResponse, UnmarshallerContext context) {
		
		describeDiagnosticConfigResponse.setRequestId(context.stringValue("DescribeDiagnosticConfigResponse.RequestId"));

		List<String> apiList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeDiagnosticConfigResponse.ApiList.Length"); i++) {
			apiList.add(context.stringValue("DescribeDiagnosticConfigResponse.ApiList["+ i +"]"));
		}
		describeDiagnosticConfigResponse.setApiList(apiList);
	 
	 	return describeDiagnosticConfigResponse;
	}
}