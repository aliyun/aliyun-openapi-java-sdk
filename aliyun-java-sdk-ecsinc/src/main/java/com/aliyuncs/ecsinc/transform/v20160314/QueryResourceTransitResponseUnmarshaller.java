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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.QueryResourceTransitResponse;
import com.aliyuncs.ecsinc.model.v20160314.QueryResourceTransitResponse.EcsResourceTransit;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryResourceTransitResponseUnmarshaller {

	public static QueryResourceTransitResponse unmarshall(QueryResourceTransitResponse queryResourceTransitResponse, UnmarshallerContext context) {
		
		queryResourceTransitResponse.setRequestId(context.stringValue("QueryResourceTransitResponse.RequestId"));
		queryResourceTransitResponse.setPageNumber(context.integerValue("QueryResourceTransitResponse.PageNumber"));
		queryResourceTransitResponse.setPageSize(context.integerValue("QueryResourceTransitResponse.PageSize"));
		queryResourceTransitResponse.setTotalCount(context.integerValue("QueryResourceTransitResponse.TotalCount"));

		List<EcsResourceTransit> ecsResourceTransits = new ArrayList<EcsResourceTransit>();
		for (int i = 0; i < context.lengthValue("QueryResourceTransitResponse.EcsResourceTransits.Length"); i++) {
			EcsResourceTransit ecsResourceTransit = new EcsResourceTransit();
			ecsResourceTransit.setDbId(context.longValue("QueryResourceTransitResponse.EcsResourceTransits["+ i +"].DbId"));
			ecsResourceTransit.setResourceTransitId(context.stringValue("QueryResourceTransitResponse.EcsResourceTransits["+ i +"].ResourceTransitId"));
			ecsResourceTransit.setResourceType(context.stringValue("QueryResourceTransitResponse.EcsResourceTransits["+ i +"].ResourceType"));
			ecsResourceTransit.setResourceId(context.stringValue("QueryResourceTransitResponse.EcsResourceTransits["+ i +"].ResourceId"));
			ecsResourceTransit.setResourceName(context.stringValue("QueryResourceTransitResponse.EcsResourceTransits["+ i +"].ResourceName"));
			ecsResourceTransit.setDescription(context.stringValue("QueryResourceTransitResponse.EcsResourceTransits["+ i +"].Description"));
			ecsResourceTransit.setMetaData(context.stringValue("QueryResourceTransitResponse.EcsResourceTransits["+ i +"].MetaData"));
			ecsResourceTransit.setFromRegionNo(context.stringValue("QueryResourceTransitResponse.EcsResourceTransits["+ i +"].FromRegionNo"));
			ecsResourceTransit.setAliUid(context.longValue("QueryResourceTransitResponse.EcsResourceTransits["+ i +"].AliUid"));
			ecsResourceTransit.setGmtCreated(context.stringValue("QueryResourceTransitResponse.EcsResourceTransits["+ i +"].GmtCreated"));
			ecsResourceTransit.setGmtModified(context.stringValue("QueryResourceTransitResponse.EcsResourceTransits["+ i +"].GmtModified"));
			ecsResourceTransit.setStatus(context.integerValue("QueryResourceTransitResponse.EcsResourceTransits["+ i +"].Status"));

			ecsResourceTransits.add(ecsResourceTransit);
		}
		queryResourceTransitResponse.setEcsResourceTransits(ecsResourceTransits);
	 
	 	return queryResourceTransitResponse;
	}
}