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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceApiImpactsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceApiImpactsResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceApiImpactsResponse.PageResult.Impact;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataServiceApiImpactsResponseUnmarshaller {

	public static ListDataServiceApiImpactsResponse unmarshall(ListDataServiceApiImpactsResponse listDataServiceApiImpactsResponse, UnmarshallerContext _ctx) {
		
		listDataServiceApiImpactsResponse.setRequestId(_ctx.stringValue("ListDataServiceApiImpactsResponse.RequestId"));
		listDataServiceApiImpactsResponse.setSuccess(_ctx.booleanValue("ListDataServiceApiImpactsResponse.Success"));
		listDataServiceApiImpactsResponse.setHttpStatusCode(_ctx.integerValue("ListDataServiceApiImpactsResponse.HttpStatusCode"));
		listDataServiceApiImpactsResponse.setCode(_ctx.stringValue("ListDataServiceApiImpactsResponse.Code"));
		listDataServiceApiImpactsResponse.setMessage(_ctx.stringValue("ListDataServiceApiImpactsResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListDataServiceApiImpactsResponse.PageResult.TotalCount"));

		List<Impact> impactList = new ArrayList<Impact>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList.Length"); i++) {
			Impact impact = new Impact();
			impact.setClientFailCount(_ctx.longValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList["+ i +"].ClientFailCount"));
			impact.setTotalTimeCost(_ctx.stringValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList["+ i +"].TotalTimeCost"));
			impact.setSuccessTimeCost(_ctx.stringValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList["+ i +"].SuccessTimeCost"));
			impact.setErrorCount(_ctx.longValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList["+ i +"].ErrorCount"));
			impact.setClientIp(_ctx.stringValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList["+ i +"].ClientIp"));
			impact.setAppName(_ctx.stringValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList["+ i +"].AppName"));
			impact.setErrorApiCount(_ctx.longValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList["+ i +"].ErrorApiCount"));
			impact.setTotalCount(_ctx.longValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList["+ i +"].TotalCount"));
			impact.setLastCallTime(_ctx.stringValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList["+ i +"].LastCallTime"));
			impact.setMinute(_ctx.stringValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList["+ i +"].Minute"));
			impact.setOfflineCount(_ctx.longValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList["+ i +"].OfflineCount"));
			impact.setAppKey(_ctx.longValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList["+ i +"].AppKey"));
			impact.setCallCount(_ctx.longValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList["+ i +"].CallCount"));
			impact.setApiId(_ctx.longValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList["+ i +"].ApiId"));
			impact.setErrorRate(_ctx.stringValue("ListDataServiceApiImpactsResponse.PageResult.ImpactList["+ i +"].ErrorRate"));

			impactList.add(impact);
		}
		pageResult.setImpactList(impactList);
		listDataServiceApiImpactsResponse.setPageResult(pageResult);
	 
	 	return listDataServiceApiImpactsResponse;
	}
}