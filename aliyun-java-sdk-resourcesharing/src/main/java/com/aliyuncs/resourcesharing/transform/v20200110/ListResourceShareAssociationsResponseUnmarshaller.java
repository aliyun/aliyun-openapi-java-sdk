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

package com.aliyuncs.resourcesharing.transform.v20200110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcesharing.model.v20200110.ListResourceShareAssociationsResponse;
import com.aliyuncs.resourcesharing.model.v20200110.ListResourceShareAssociationsResponse.ResourceShareAssociation;
import com.aliyuncs.resourcesharing.model.v20200110.ListResourceShareAssociationsResponse.ResourceShareAssociation.AssociationFailedDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceShareAssociationsResponseUnmarshaller {

	public static ListResourceShareAssociationsResponse unmarshall(ListResourceShareAssociationsResponse listResourceShareAssociationsResponse, UnmarshallerContext _ctx) {
		
		listResourceShareAssociationsResponse.setRequestId(_ctx.stringValue("ListResourceShareAssociationsResponse.RequestId"));
		listResourceShareAssociationsResponse.setNextToken(_ctx.stringValue("ListResourceShareAssociationsResponse.NextToken"));

		List<ResourceShareAssociation> resourceShareAssociations = new ArrayList<ResourceShareAssociation>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceShareAssociationsResponse.ResourceShareAssociations.Length"); i++) {
			ResourceShareAssociation resourceShareAssociation = new ResourceShareAssociation();
			resourceShareAssociation.setUpdateTime(_ctx.stringValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].UpdateTime"));
			resourceShareAssociation.setEntityId(_ctx.stringValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].EntityId"));
			resourceShareAssociation.setResourceShareName(_ctx.stringValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].ResourceShareName"));
			resourceShareAssociation.setCreateTime(_ctx.stringValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].CreateTime"));
			resourceShareAssociation.setEntityType(_ctx.stringValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].EntityType"));
			resourceShareAssociation.setResourceShareId(_ctx.stringValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].ResourceShareId"));
			resourceShareAssociation.setAssociationStatusMessage(_ctx.stringValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].AssociationStatusMessage"));
			resourceShareAssociation.setAssociationType(_ctx.stringValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].AssociationType"));
			resourceShareAssociation.setAssociationStatus(_ctx.stringValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].AssociationStatus"));
			resourceShareAssociation.setExternal(_ctx.booleanValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].External"));
			resourceShareAssociation.setTargetProperty(_ctx.stringValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].TargetProperty"));

			List<AssociationFailedDetail> associationFailedDetails = new ArrayList<AssociationFailedDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].AssociationFailedDetails.Length"); j++) {
				AssociationFailedDetail associationFailedDetail = new AssociationFailedDetail();
				associationFailedDetail.setStatus(_ctx.stringValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].AssociationFailedDetails["+ j +"].Status"));
				associationFailedDetail.setStatusMessage(_ctx.stringValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].AssociationFailedDetails["+ j +"].StatusMessage"));
				associationFailedDetail.setAssociateType(_ctx.stringValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].AssociationFailedDetails["+ j +"].AssociateType"));
				associationFailedDetail.setEntityId(_ctx.stringValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].AssociationFailedDetails["+ j +"].EntityId"));
				associationFailedDetail.setEntityType(_ctx.stringValue("ListResourceShareAssociationsResponse.ResourceShareAssociations["+ i +"].AssociationFailedDetails["+ j +"].EntityType"));

				associationFailedDetails.add(associationFailedDetail);
			}
			resourceShareAssociation.setAssociationFailedDetails(associationFailedDetails);

			resourceShareAssociations.add(resourceShareAssociation);
		}
		listResourceShareAssociationsResponse.setResourceShareAssociations(resourceShareAssociations);
	 
	 	return listResourceShareAssociationsResponse;
	}
}