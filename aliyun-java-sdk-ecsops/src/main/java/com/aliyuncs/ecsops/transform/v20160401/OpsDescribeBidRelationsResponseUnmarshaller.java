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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeBidRelationsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeBidRelationsResponse.BidRelation;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeBidRelationsResponseUnmarshaller {

	public static OpsDescribeBidRelationsResponse unmarshall(OpsDescribeBidRelationsResponse opsDescribeBidRelationsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeBidRelationsResponse.setRequestId(_ctx.stringValue("OpsDescribeBidRelationsResponse.RequestId"));
		opsDescribeBidRelationsResponse.setPageNumber(_ctx.integerValue("OpsDescribeBidRelationsResponse.PageNumber"));
		opsDescribeBidRelationsResponse.setPageSize(_ctx.integerValue("OpsDescribeBidRelationsResponse.PageSize"));
		opsDescribeBidRelationsResponse.setTotal(_ctx.integerValue("OpsDescribeBidRelationsResponse.Total"));

		List<BidRelation> bidRelations = new ArrayList<BidRelation>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeBidRelationsResponse.BidRelations.Length"); i++) {
			BidRelation bidRelation = new BidRelation();
			bidRelation.setId(_ctx.longValue("OpsDescribeBidRelationsResponse.BidRelations["+ i +"].id"));
			bidRelation.setBid(_ctx.stringValue("OpsDescribeBidRelationsResponse.BidRelations["+ i +"].Bid"));
			bidRelation.setParentBid(_ctx.stringValue("OpsDescribeBidRelationsResponse.BidRelations["+ i +"].ParentBid"));
			bidRelation.setIsService(_ctx.booleanValue("OpsDescribeBidRelationsResponse.BidRelations["+ i +"].IsService"));
			bidRelation.setRemark(_ctx.stringValue("OpsDescribeBidRelationsResponse.BidRelations["+ i +"].Remark"));
			bidRelation.setServiceCode(_ctx.stringValue("OpsDescribeBidRelationsResponse.BidRelations["+ i +"].ServiceCode"));
			bidRelation.setIsSite(_ctx.booleanValue("OpsDescribeBidRelationsResponse.BidRelations["+ i +"].IsSite"));

			bidRelations.add(bidRelation);
		}
		opsDescribeBidRelationsResponse.setBidRelations(bidRelations);
	 
	 	return opsDescribeBidRelationsResponse;
	}
}