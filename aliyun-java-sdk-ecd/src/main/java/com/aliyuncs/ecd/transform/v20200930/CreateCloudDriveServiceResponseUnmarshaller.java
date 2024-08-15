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

import com.aliyuncs.ecd.model.v20200930.CreateCloudDriveServiceResponse;
import com.aliyuncs.ecd.model.v20200930.CreateCloudDriveServiceResponse.ConflictCdsAndOrder;
import com.aliyuncs.ecd.model.v20200930.CreateCloudDriveServiceResponse.ConflictCdsAndOrder.ConflictCdsItem;
import com.aliyuncs.ecd.model.v20200930.CreateCloudDriveServiceResponse.ConflictCdsAndOrder.ConflictOrderItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCloudDriveServiceResponseUnmarshaller {

	public static CreateCloudDriveServiceResponse unmarshall(CreateCloudDriveServiceResponse createCloudDriveServiceResponse, UnmarshallerContext _ctx) {
		
		createCloudDriveServiceResponse.setRequestId(_ctx.stringValue("CreateCloudDriveServiceResponse.RequestId"));
		createCloudDriveServiceResponse.setCdsId(_ctx.stringValue("CreateCloudDriveServiceResponse.CdsId"));
		createCloudDriveServiceResponse.setCdsName(_ctx.stringValue("CreateCloudDriveServiceResponse.CdsName"));
		createCloudDriveServiceResponse.setMaxSize(_ctx.stringValue("CreateCloudDriveServiceResponse.MaxSize"));
		createCloudDriveServiceResponse.setOfficeSiteType(_ctx.stringValue("CreateCloudDriveServiceResponse.OfficeSiteType"));
		createCloudDriveServiceResponse.setCenId(_ctx.stringValue("CreateCloudDriveServiceResponse.CenId"));
		createCloudDriveServiceResponse.setDomainName(_ctx.stringValue("CreateCloudDriveServiceResponse.DomainName"));
		createCloudDriveServiceResponse.setOrderId(_ctx.stringValue("CreateCloudDriveServiceResponse.OrderId"));
		createCloudDriveServiceResponse.setErrorCode(_ctx.stringValue("CreateCloudDriveServiceResponse.ErrorCode"));

		ConflictCdsAndOrder conflictCdsAndOrder = new ConflictCdsAndOrder();

		List<ConflictCdsItem> conflictCds = new ArrayList<ConflictCdsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateCloudDriveServiceResponse.ConflictCdsAndOrder.ConflictCds.Length"); i++) {
			ConflictCdsItem conflictCdsItem = new ConflictCdsItem();
			conflictCdsItem.setCdsId(_ctx.stringValue("CreateCloudDriveServiceResponse.ConflictCdsAndOrder.ConflictCds["+ i +"].CdsId"));
			conflictCdsItem.setRegionId(_ctx.stringValue("CreateCloudDriveServiceResponse.ConflictCdsAndOrder.ConflictCds["+ i +"].RegionId"));

			conflictCds.add(conflictCdsItem);
		}
		conflictCdsAndOrder.setConflictCds(conflictCds);

		List<ConflictOrderItem> conflictOrder = new ArrayList<ConflictOrderItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateCloudDriveServiceResponse.ConflictCdsAndOrder.ConflictOrder.Length"); i++) {
			ConflictOrderItem conflictOrderItem = new ConflictOrderItem();
			conflictOrderItem.setCdsId(_ctx.stringValue("CreateCloudDriveServiceResponse.ConflictCdsAndOrder.ConflictOrder["+ i +"].CdsId"));
			conflictOrderItem.setOrderId(_ctx.stringValue("CreateCloudDriveServiceResponse.ConflictCdsAndOrder.ConflictOrder["+ i +"].OrderId"));
			conflictOrderItem.setRegionId(_ctx.stringValue("CreateCloudDriveServiceResponse.ConflictCdsAndOrder.ConflictOrder["+ i +"].RegionId"));

			conflictOrder.add(conflictOrderItem);
		}
		conflictCdsAndOrder.setConflictOrder(conflictOrder);
		createCloudDriveServiceResponse.setConflictCdsAndOrder(conflictCdsAndOrder);
	 
	 	return createCloudDriveServiceResponse;
	}
}