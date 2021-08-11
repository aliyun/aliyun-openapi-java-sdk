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

package com.aliyuncs.ltl.transform.v20190510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ltl.model.v20190510.DescribeMPCoSAuthorizedInfoResponse;
import com.aliyuncs.ltl.model.v20190510.DescribeMPCoSAuthorizedInfoResponse.Data;
import com.aliyuncs.ltl.model.v20190510.DescribeMPCoSAuthorizedInfoResponse.Data.AuthorizedPhase;
import com.aliyuncs.ltl.model.v20190510.DescribeMPCoSAuthorizedInfoResponse.Data.UnAuthorizedPhase;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMPCoSAuthorizedInfoResponseUnmarshaller {

	public static DescribeMPCoSAuthorizedInfoResponse unmarshall(DescribeMPCoSAuthorizedInfoResponse describeMPCoSAuthorizedInfoResponse, UnmarshallerContext _ctx) {
		
		describeMPCoSAuthorizedInfoResponse.setRequestId(_ctx.stringValue("DescribeMPCoSAuthorizedInfoResponse.RequestId"));
		describeMPCoSAuthorizedInfoResponse.setCode(_ctx.integerValue("DescribeMPCoSAuthorizedInfoResponse.Code"));
		describeMPCoSAuthorizedInfoResponse.setSuccess(_ctx.booleanValue("DescribeMPCoSAuthorizedInfoResponse.Success"));
		describeMPCoSAuthorizedInfoResponse.setMessage(_ctx.stringValue("DescribeMPCoSAuthorizedInfoResponse.Message"));

		Data data = new Data();

		List<AuthorizedPhase> authorizedPhaseList = new ArrayList<AuthorizedPhase>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMPCoSAuthorizedInfoResponse.Data.AuthorizedPhaseList.Length"); i++) {
			AuthorizedPhase authorizedPhase = new AuthorizedPhase();
			authorizedPhase.setPhaseId(_ctx.stringValue("DescribeMPCoSAuthorizedInfoResponse.Data.AuthorizedPhaseList["+ i +"].PhaseId"));
			authorizedPhase.setPhaseName(_ctx.stringValue("DescribeMPCoSAuthorizedInfoResponse.Data.AuthorizedPhaseList["+ i +"].PhaseName"));

			authorizedPhaseList.add(authorizedPhase);
		}
		data.setAuthorizedPhaseList(authorizedPhaseList);

		List<UnAuthorizedPhase> unAuthorizedPhaseList = new ArrayList<UnAuthorizedPhase>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMPCoSAuthorizedInfoResponse.Data.UnAuthorizedPhaseList.Length"); i++) {
			UnAuthorizedPhase unAuthorizedPhase = new UnAuthorizedPhase();
			unAuthorizedPhase.setPhaseId(_ctx.stringValue("DescribeMPCoSAuthorizedInfoResponse.Data.UnAuthorizedPhaseList["+ i +"].PhaseId"));
			unAuthorizedPhase.setPhaseName(_ctx.stringValue("DescribeMPCoSAuthorizedInfoResponse.Data.UnAuthorizedPhaseList["+ i +"].PhaseName"));

			unAuthorizedPhaseList.add(unAuthorizedPhase);
		}
		data.setUnAuthorizedPhaseList(unAuthorizedPhaseList);
		describeMPCoSAuthorizedInfoResponse.setData(data);
	 
	 	return describeMPCoSAuthorizedInfoResponse;
	}
}