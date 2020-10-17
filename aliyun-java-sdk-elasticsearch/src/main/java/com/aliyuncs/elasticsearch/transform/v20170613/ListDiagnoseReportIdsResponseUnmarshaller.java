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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.ListDiagnoseReportIdsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListDiagnoseReportIdsResponse.Headers;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDiagnoseReportIdsResponseUnmarshaller {

	public static ListDiagnoseReportIdsResponse unmarshall(ListDiagnoseReportIdsResponse listDiagnoseReportIdsResponse, UnmarshallerContext _ctx) {
		
		listDiagnoseReportIdsResponse.setRequestId(_ctx.stringValue("ListDiagnoseReportIdsResponse.RequestId"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListDiagnoseReportIdsResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("ListDiagnoseReportIdsResponse.Result["+ i +"]"));
		}
		listDiagnoseReportIdsResponse.setResult(result);

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListDiagnoseReportIdsResponse.Headers.X-Total-Count"));
		listDiagnoseReportIdsResponse.setHeaders(headers);
	 
	 	return listDiagnoseReportIdsResponse;
	}
}