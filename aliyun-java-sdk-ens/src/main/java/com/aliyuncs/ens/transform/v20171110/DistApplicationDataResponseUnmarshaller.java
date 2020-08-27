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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DistApplicationDataResponse;
import com.aliyuncs.ens.model.v20171110.DistApplicationDataResponse.DistResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DistApplicationDataResponseUnmarshaller {

	public static DistApplicationDataResponse unmarshall(DistApplicationDataResponse distApplicationDataResponse, UnmarshallerContext _ctx) {
		
		distApplicationDataResponse.setRequestId(_ctx.stringValue("DistApplicationDataResponse.RequestId"));
		distApplicationDataResponse.setDistInstanceTotalCount(_ctx.integerValue("DistApplicationDataResponse.DistInstanceTotalCount"));

		List<String> distInstanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DistApplicationDataResponse.DistInstanceIds.Length"); i++) {
			distInstanceIds.add(_ctx.stringValue("DistApplicationDataResponse.DistInstanceIds["+ i +"]"));
		}
		distApplicationDataResponse.setDistInstanceIds(distInstanceIds);

		List<DistResult> distResults = new ArrayList<DistResult>();
		for (int i = 0; i < _ctx.lengthValue("DistApplicationDataResponse.DistResults.Length"); i++) {
			DistResult distResult = new DistResult();
			distResult.setVersion(_ctx.stringValue("DistApplicationDataResponse.DistResults["+ i +"].Version"));
			distResult.setResultDescrip(_ctx.stringValue("DistApplicationDataResponse.DistResults["+ i +"].ResultDescrip"));
			distResult.setResultCode(_ctx.integerValue("DistApplicationDataResponse.DistResults["+ i +"].ResultCode"));
			distResult.setName(_ctx.stringValue("DistApplicationDataResponse.DistResults["+ i +"].Name"));

			distResults.add(distResult);
		}
		distApplicationDataResponse.setDistResults(distResults);
	 
	 	return distApplicationDataResponse;
	}
}