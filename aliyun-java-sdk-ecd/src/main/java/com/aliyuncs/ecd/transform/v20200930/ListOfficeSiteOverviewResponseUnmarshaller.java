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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.ListOfficeSiteOverviewResponse;
import com.aliyuncs.ecd.model.v20200930.ListOfficeSiteOverviewResponse.OfficeSiteOverviewResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOfficeSiteOverviewResponseUnmarshaller {

	public static ListOfficeSiteOverviewResponse unmarshall(ListOfficeSiteOverviewResponse listOfficeSiteOverviewResponse, UnmarshallerContext _ctx) {
		
		listOfficeSiteOverviewResponse.setRequestId(_ctx.stringValue("ListOfficeSiteOverviewResponse.RequestId"));
		listOfficeSiteOverviewResponse.setNextToken(_ctx.stringValue("ListOfficeSiteOverviewResponse.NextToken"));

		List<OfficeSiteOverviewResult> officeSiteOverviewResults = new ArrayList<OfficeSiteOverviewResult>();
		for (int i = 0; i < _ctx.lengthValue("ListOfficeSiteOverviewResponse.OfficeSiteOverviewResults.Length"); i++) {
			OfficeSiteOverviewResult officeSiteOverviewResult = new OfficeSiteOverviewResult();
			officeSiteOverviewResult.setOfficeSiteStatus(_ctx.stringValue("ListOfficeSiteOverviewResponse.OfficeSiteOverviewResults["+ i +"].OfficeSiteStatus"));
			officeSiteOverviewResult.setTotalEdsCount(_ctx.integerValue("ListOfficeSiteOverviewResponse.OfficeSiteOverviewResults["+ i +"].TotalEdsCount"));
			officeSiteOverviewResult.setWillExpiredEdsCount(_ctx.integerValue("ListOfficeSiteOverviewResponse.OfficeSiteOverviewResults["+ i +"].WillExpiredEdsCount"));
			officeSiteOverviewResult.setOfficeSiteId(_ctx.stringValue("ListOfficeSiteOverviewResponse.OfficeSiteOverviewResults["+ i +"].OfficeSiteId"));
			officeSiteOverviewResult.setRunningEdsCount(_ctx.integerValue("ListOfficeSiteOverviewResponse.OfficeSiteOverviewResults["+ i +"].RunningEdsCount"));
			officeSiteOverviewResult.setOfficeSiteName(_ctx.stringValue("ListOfficeSiteOverviewResponse.OfficeSiteOverviewResults["+ i +"].OfficeSiteName"));
			officeSiteOverviewResult.setHasExpiredEdsCount(_ctx.integerValue("ListOfficeSiteOverviewResponse.OfficeSiteOverviewResults["+ i +"].HasExpiredEdsCount"));
			officeSiteOverviewResult.setRegionId(_ctx.stringValue("ListOfficeSiteOverviewResponse.OfficeSiteOverviewResults["+ i +"].RegionId"));

			officeSiteOverviewResults.add(officeSiteOverviewResult);
		}
		listOfficeSiteOverviewResponse.setOfficeSiteOverviewResults(officeSiteOverviewResults);
	 
	 	return listOfficeSiteOverviewResponse;
	}
}